package com.android.i18n.phonenumbers;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import com.android.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.android.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AsYouTypeFormatter {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "587DFC21273768F857001AF4DED4A6C2", hash_generated_field = "0C350DE511BE7B52540BBA3416D1A46C")

    private String currentOutput = "";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "9C7B57FCC2047555285BE852A4B2943F", hash_generated_field = "09F9323AC7F5DB51B79E6FB4689A0073")

    private StringBuilder formattingTemplate = new StringBuilder();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "4FBD98FDDEE7B846B71DF829DFC1C978", hash_generated_field = "6A54B02BA2C7E4165F427873C017B488")

    private String currentFormattingPattern = "";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "0EE2ED1280BE50DC5A0B71C01B505EF2", hash_generated_field = "29CDE2D2FAA8268827B1B884DC2F18BA")

    private StringBuilder accruedInput = new StringBuilder();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "48E61261D0E6A721DDE49948BAE6E5FB", hash_generated_field = "E579FAA49690664D33A278DEA0E8B5A6")

    private StringBuilder accruedInputWithoutFormatting = new StringBuilder();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "C6C6C291305739DAC8EFBEF0C9C86773", hash_generated_field = "2095ACFBFC258F92C73D192F518E00D7")

    private boolean ableToFormat = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "84A093E41F72D463AA839067E1B4DC2D", hash_generated_field = "168C680E9820B2FFBEB1B9E07688ACEE")

    private boolean isInternationalFormatting = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "FAFF8308CA553E2E22D15CCA48E047D9", hash_generated_field = "9C2BB325FBB2EC7864F760CFE394F16E")

    private boolean isExpectingCountryCallingCode = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "8DDE134A73A97EF1C52A79F2EA1BEA97", hash_generated_field = "9871D8391818B7E3E79E686D091C626E")

    private PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "65B2F933146CFA88C7D3B8E0FFCB3603", hash_generated_field = "6FD38F26B0E8DBBA6EF73F09FB6B4141")

    private String defaultCountry;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "3BBE52C5C6888410EE33760B1B194818", hash_generated_field = "120A053E2F4E55161B2E4207EE1C05CF")

    private PhoneMetadata defaultMetaData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "ECC8858CCAF9726976F895C4946EC91F", hash_generated_field = "35B49383D60A264DAE321C3C26CE1990")

    private PhoneMetadata currentMetaData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "C57C6C03AC264E94F23DA5BDEAC85E70", hash_generated_field = "23C1B63DC4A3B45E60BB35F865EFF73E")

    private String digitPlaceholder = "\u2008";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "AFFA108041D9C7C6B1F036D62D2C3AB3", hash_generated_field = "A012D752824ECE91B83A6649421B0E5D")

    private Pattern digitPattern = Pattern.compile(digitPlaceholder);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "7A0EE11C8BC5F6F4825317CF1BEB784B", hash_generated_field = "118190E2A789D8F137699A3B010FBDD5")

    private int lastMatchPosition = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "555F90F22B033B3B3225B5F9914F20EC", hash_generated_field = "AAA5D18DEE083F7BBA851AA262F094CB")

    private int originalPosition = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "BF1413E6C4EB4C0A0714AE4F41C37666", hash_generated_field = "8C72AA3A3DE1D2EFB37D75F2D908776F")

    private int positionToRemember = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "3777965CF9620D0EC3EF9D148ED3ADAF", hash_generated_field = "E91BED07269C3A918A7C430BB9D5D341")

    private StringBuilder prefixBeforeNationalNumber = new StringBuilder();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "0B2CD1BEAC92768B16F5279A28B974BF", hash_generated_field = "5578ADECAFE9EAFCE3065ED8EBE1D841")

    private StringBuilder nationalNumber = new StringBuilder();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "4F05C64762A4432672AD2501E8DF3569", hash_generated_field = "23CDF3D9149C891AD1D66C6C35974D4E")

    private List<NumberFormat> possibleFormats = new ArrayList<NumberFormat>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.687 -0400", hash_original_field = "FC60034C5DB0EEBE16CF2AFE16BDD383", hash_generated_field = "FEE3B86D57B366ADF75BCFCDCCAF1CE3")

    private RegexCache regexCache = new RegexCache(64);
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.696 -0400", hash_original_method = "936F5C412B2E8DF425145B47DD5CAEF0", hash_generated_method = "FE3B8DF7E339A94E519494A3A5DB6E47")
      AsYouTypeFormatter(String regionCode) {
        defaultCountry = regionCode;
        currentMetaData = getMetadataForRegion(defaultCountry);
        defaultMetaData = currentMetaData;
        // ---------- Original Method ----------
        //defaultCountry = regionCode;
        //currentMetaData = getMetadataForRegion(defaultCountry);
        //defaultMetaData = currentMetaData;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.700 -0400", hash_original_method = "881E62338E39DD444804F246615E6E62", hash_generated_method = "98B1AA88AA0EC615D22E6A3E7239F3FA")
    private PhoneMetadata getMetadataForRegion(String regionCode) {
        PhoneMetadata varB4EAC82CA7396A68D541C85D26508E83_545411291 = null; //Variable for return #1
        PhoneMetadata varB4EAC82CA7396A68D541C85D26508E83_1749877513 = null; //Variable for return #2
        int countryCallingCode;
        countryCallingCode = phoneUtil.getCountryCodeForRegion(regionCode);
        String mainCountry;
        mainCountry = phoneUtil.getRegionCodeForCountryCode(countryCallingCode);
        PhoneMetadata metadata;
        metadata = phoneUtil.getMetadataForRegion(mainCountry);
        {
            varB4EAC82CA7396A68D541C85D26508E83_545411291 = metadata;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1749877513 = EMPTY_METADATA;
        addTaint(regionCode.getTaint());
        PhoneMetadata varA7E53CE21691AB073D9660D615818899_90623816; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_90623816 = varB4EAC82CA7396A68D541C85D26508E83_545411291;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_90623816 = varB4EAC82CA7396A68D541C85D26508E83_1749877513;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_90623816.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_90623816;
        // ---------- Original Method ----------
        //int countryCallingCode = phoneUtil.getCountryCodeForRegion(regionCode);
        //String mainCountry = phoneUtil.getRegionCodeForCountryCode(countryCallingCode);
        //PhoneMetadata metadata = phoneUtil.getMetadataForRegion(mainCountry);
        //if (metadata != null) {
      //return metadata;
    //}
        //return EMPTY_METADATA;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.709 -0400", hash_original_method = "AB8E8EDD80C278D4452E081702FFED46", hash_generated_method = "0DE4D1A3EA4DE2C5D441F3EDCFDA1D6D")
    private boolean maybeCreateNewTemplate() {
        Iterator<NumberFormat> it;
        it = possibleFormats.iterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_325816145 = (it.hasNext());
            {
                NumberFormat numberFormat;
                numberFormat = it.next();
                String pattern;
                pattern = numberFormat.getPattern();
                {
                    boolean var9D3C99BC147B43034B90D37FF5671C55_1121867226 = (currentFormattingPattern.equals(pattern));
                } //End collapsed parenthetic
                {
                    boolean var46DD5B81A422C5EDB3101C42925C029B_2032525251 = (createFormattingTemplate(numberFormat));
                    {
                        currentFormattingPattern = pattern;
                    } //End block
                    {
                        it.remove();
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        ableToFormat = false;
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1358052778 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1358052778;
        // ---------- Original Method ----------
        //Iterator<NumberFormat> it = possibleFormats.iterator();
        //while (it.hasNext()) {
      //NumberFormat numberFormat = it.next();
      //String pattern = numberFormat.getPattern();
      //if (currentFormattingPattern.equals(pattern)) {
        //return false;
      //}
      //if (createFormattingTemplate(numberFormat)) {
        //currentFormattingPattern = pattern;
        //return true;
      //} else {  
        //it.remove();
      //}
    //}
        //ableToFormat = false;
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.807 -0400", hash_original_method = "37D81E1E00F803BB98B41301D27D6488", hash_generated_method = "49E0F1FBC3088E47152433CDA14B29F5")
    private void getAvailableFormats(String leadingThreeDigits) {
        List<NumberFormat> formatList;
        boolean varB67884F1064609E1BAB5093CB3CEF971_1268138219 = ((isInternationalFormatting && currentMetaData.intlNumberFormatSize() > 0));
        formatList = currentMetaData.intlNumberFormats();
        formatList = currentMetaData.numberFormats();
        {
            Iterator<NumberFormat> varF655A3F35A8B90A9399EACEB9BC4E06E_667716195 = (formatList).iterator();
            varF655A3F35A8B90A9399EACEB9BC4E06E_667716195.hasNext();
            NumberFormat format = varF655A3F35A8B90A9399EACEB9BC4E06E_667716195.next();
            {
                {
                    boolean var54A934D8D12F631100479FFAC7EA8383_1660281095 = (isFormatEligible(format.getFormat()));
                    {
                        possibleFormats.add(format);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        narrowDownPossibleFormats(leadingThreeDigits);
        addTaint(leadingThreeDigits.getTaint());
        // ---------- Original Method ----------
        //List<NumberFormat> formatList =
        //(isInternationalFormatting && currentMetaData.intlNumberFormatSize() > 0)
        //? currentMetaData.intlNumberFormats()
        //: currentMetaData.numberFormats();
        //for (NumberFormat format : formatList) {
      //if (isFormatEligible(format.getFormat())) {
        //possibleFormats.add(format);
      //}
    //}
        //narrowDownPossibleFormats(leadingThreeDigits);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.807 -0400", hash_original_method = "0CD8D9B07AADCF252FD63C0FF91E8BCD", hash_generated_method = "775BD12BEE456DDC4E4EB36521044058")
    private boolean isFormatEligible(String format) {
        boolean var7686FCFDEFFDCE541184344D93564B1A_126790734 = (ELIGIBLE_FORMAT_PATTERN.matcher(format).matches());
        addTaint(format.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1418844768 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1418844768;
        // ---------- Original Method ----------
        //return ELIGIBLE_FORMAT_PATTERN.matcher(format).matches();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.808 -0400", hash_original_method = "3E367C813BED2017BCCC9CAE77808F34", hash_generated_method = "83D5AF28B54466378A7C05D8BDE55DCA")
    private void narrowDownPossibleFormats(String leadingDigits) {
        int indexOfLeadingDigitsPattern;
        indexOfLeadingDigitsPattern = leadingDigits.length() - MIN_LEADING_DIGITS_LENGTH;
        Iterator<NumberFormat> it;
        it = possibleFormats.iterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_826384728 = (it.hasNext());
            {
                NumberFormat format;
                format = it.next();
                {
                    boolean var36A163D8065CD423AD885FA1146B8F7C_1762406002 = (format.leadingDigitsPatternSize() > indexOfLeadingDigitsPattern);
                    {
                        Pattern leadingDigitsPattern;
                        leadingDigitsPattern = regexCache.getPatternForRegex(
                format.getLeadingDigitsPattern(indexOfLeadingDigitsPattern));
                        Matcher m;
                        m = leadingDigitsPattern.matcher(leadingDigits);
                        {
                            boolean var5C061ECAA93AC270713BF55060A3AF88_1688738026 = (!m.lookingAt());
                            {
                                it.remove();
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(leadingDigits.getTaint());
        // ---------- Original Method ----------
        //int indexOfLeadingDigitsPattern = leadingDigits.length() - MIN_LEADING_DIGITS_LENGTH;
        //Iterator<NumberFormat> it = possibleFormats.iterator();
        //while (it.hasNext()) {
      //NumberFormat format = it.next();
      //if (format.leadingDigitsPatternSize() > indexOfLeadingDigitsPattern) {
        //Pattern leadingDigitsPattern =
            //regexCache.getPatternForRegex(
                //format.getLeadingDigitsPattern(indexOfLeadingDigitsPattern));
        //Matcher m = leadingDigitsPattern.matcher(leadingDigits);
        //if (!m.lookingAt()) {
          //it.remove();
        //}
      //} 
    //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.808 -0400", hash_original_method = "2542CBCB3D3982D996EED604A627F745", hash_generated_method = "1FA9B0599A569F63AAFC37A528289161")
    private boolean createFormattingTemplate(NumberFormat format) {
        String numberPattern;
        numberPattern = format.getPattern();
        {
            boolean var2AB75326CF6A134D241113D78E168352_233354064 = (numberPattern.indexOf('|') != -1);
        } //End collapsed parenthetic
        numberPattern = CHARACTER_CLASS_PATTERN.matcher(numberPattern).replaceAll("\\\\d");
        numberPattern = STANDALONE_DIGIT_PATTERN.matcher(numberPattern).replaceAll("\\\\d");
        formattingTemplate.setLength(0);
        String tempTemplate;
        tempTemplate = getFormattingTemplate(numberPattern, format.getFormat());
        {
            boolean varE0888266596442D8E272FE26E4A070F2_1037442405 = (tempTemplate.length() > 0);
            {
                formattingTemplate.append(tempTemplate);
            } //End block
        } //End collapsed parenthetic
        addTaint(format.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1950845710 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1950845710;
        // ---------- Original Method ----------
        //String numberPattern = format.getPattern();
        //if (numberPattern.indexOf('|') != -1) {
      //return false;
    //}
        //numberPattern = CHARACTER_CLASS_PATTERN.matcher(numberPattern).replaceAll("\\\\d");
        //numberPattern = STANDALONE_DIGIT_PATTERN.matcher(numberPattern).replaceAll("\\\\d");
        //formattingTemplate.setLength(0);
        //String tempTemplate = getFormattingTemplate(numberPattern, format.getFormat());
        //if (tempTemplate.length() > 0) {
      //formattingTemplate.append(tempTemplate);
      //return true;
    //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.810 -0400", hash_original_method = "D11FAAF63EBAF37B7C1EC170EAFCD005", hash_generated_method = "6B739329E3AD9DD0E9C9D2C19919EB4C")
    private String getFormattingTemplate(String numberPattern, String numberFormat) {
        String varB4EAC82CA7396A68D541C85D26508E83_1055301517 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1766482962 = null; //Variable for return #2
        String longestPhoneNumber;
        longestPhoneNumber = "999999999999999";
        Matcher m;
        m = regexCache.getPatternForRegex(numberPattern).matcher(longestPhoneNumber);
        m.find();
        String aPhoneNumber;
        aPhoneNumber = m.group();
        {
            boolean varBA1FD27F64B359E5AE7EA77F4E5E1541_1812079776 = (aPhoneNumber.length() < nationalNumber.length());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1055301517 = "";
            } //End block
        } //End collapsed parenthetic
        String template;
        template = aPhoneNumber.replaceAll(numberPattern, numberFormat);
        template = template.replaceAll("9", digitPlaceholder);
        varB4EAC82CA7396A68D541C85D26508E83_1766482962 = template;
        addTaint(numberPattern.getTaint());
        addTaint(numberFormat.getTaint());
        String varA7E53CE21691AB073D9660D615818899_1143093496; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1143093496 = varB4EAC82CA7396A68D541C85D26508E83_1055301517;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1143093496 = varB4EAC82CA7396A68D541C85D26508E83_1766482962;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1143093496.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1143093496;
        // ---------- Original Method ----------
        //String longestPhoneNumber = "999999999999999";
        //Matcher m = regexCache.getPatternForRegex(numberPattern).matcher(longestPhoneNumber);
        //m.find();
        //String aPhoneNumber = m.group();
        //if (aPhoneNumber.length() < nationalNumber.length()) {
      //return "";
    //}
        //String template = aPhoneNumber.replaceAll(numberPattern, numberFormat);
        //template = template.replaceAll("9", digitPlaceholder);
        //return template;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.815 -0400", hash_original_method = "8F04C2F49656580CD2F07A034451AAD3", hash_generated_method = "0EBDEF1980DE8BFE6C00F00311FA4D60")
    public void clear() {
        currentOutput = "";
        accruedInput.setLength(0);
        accruedInputWithoutFormatting.setLength(0);
        formattingTemplate.setLength(0);
        lastMatchPosition = 0;
        currentFormattingPattern = "";
        prefixBeforeNationalNumber.setLength(0);
        nationalNumber.setLength(0);
        ableToFormat = true;
        positionToRemember = 0;
        originalPosition = 0;
        isInternationalFormatting = false;
        isExpectingCountryCallingCode = false;
        possibleFormats.clear();
        {
            boolean var31691B7A890C77516E38C860E4D5B6AF_37128902 = (!currentMetaData.equals(defaultMetaData));
            {
                currentMetaData = getMetadataForRegion(defaultCountry);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //currentOutput = "";
        //accruedInput.setLength(0);
        //accruedInputWithoutFormatting.setLength(0);
        //formattingTemplate.setLength(0);
        //lastMatchPosition = 0;
        //currentFormattingPattern = "";
        //prefixBeforeNationalNumber.setLength(0);
        //nationalNumber.setLength(0);
        //ableToFormat = true;
        //positionToRemember = 0;
        //originalPosition = 0;
        //isInternationalFormatting = false;
        //isExpectingCountryCallingCode = false;
        //possibleFormats.clear();
        //if (!currentMetaData.equals(defaultMetaData)) {
      //currentMetaData = getMetadataForRegion(defaultCountry);
    //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.816 -0400", hash_original_method = "F7260472EF36A540999D13D4CAA6ECE9", hash_generated_method = "0D6F5B81D4D113C278E60B220F7A4BCD")
    public String inputDigit(char nextChar) {
        String varB4EAC82CA7396A68D541C85D26508E83_1404185510 = null; //Variable for return #1
        currentOutput = inputDigitWithOptionToRememberPosition(nextChar, false);
        varB4EAC82CA7396A68D541C85D26508E83_1404185510 = currentOutput;
        varB4EAC82CA7396A68D541C85D26508E83_1404185510.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1404185510;
        // ---------- Original Method ----------
        //currentOutput = inputDigitWithOptionToRememberPosition(nextChar, false);
        //return currentOutput;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.828 -0400", hash_original_method = "5CF2674AEE53F09D43FB9E46A011FFC0", hash_generated_method = "48DA1C407849BF6D7ABAFAB185D6AEEA")
    public String inputDigitAndRememberPosition(char nextChar) {
        String varB4EAC82CA7396A68D541C85D26508E83_804410410 = null; //Variable for return #1
        currentOutput = inputDigitWithOptionToRememberPosition(nextChar, true);
        varB4EAC82CA7396A68D541C85D26508E83_804410410 = currentOutput;
        varB4EAC82CA7396A68D541C85D26508E83_804410410.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_804410410;
        // ---------- Original Method ----------
        //currentOutput = inputDigitWithOptionToRememberPosition(nextChar, true);
        //return currentOutput;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.843 -0400", hash_original_method = "6C89C7F3A0AAC3A12D8456578D2D5E4E", hash_generated_method = "34A771FF635A6929EA22A69A2B80D8F1")
    @SuppressWarnings("fallthrough")
    private String inputDigitWithOptionToRememberPosition(char nextChar, boolean rememberPosition) {
        String varB4EAC82CA7396A68D541C85D26508E83_1054853422 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_734798997 = null; //Variable for return #2
        String varB4EAC82CA7396A68D541C85D26508E83_1564416871 = null; //Variable for return #3
        String varB4EAC82CA7396A68D541C85D26508E83_1187621804 = null; //Variable for return #4
        String varB4EAC82CA7396A68D541C85D26508E83_1600181148 = null; //Variable for return #5
        String varB4EAC82CA7396A68D541C85D26508E83_169720310 = null; //Variable for return #6
        String varB4EAC82CA7396A68D541C85D26508E83_1786828158 = null; //Variable for return #7
        String varB4EAC82CA7396A68D541C85D26508E83_1061770078 = null; //Variable for return #8
        String varB4EAC82CA7396A68D541C85D26508E83_749228072 = null; //Variable for return #9
        accruedInput.append(nextChar);
        {
            originalPosition = accruedInput.length();
        } //End block
        {
            boolean var9CC42AC4AF9C9FBE29EDD73247D992CC_1410154297 = (!isDigitOrLeadingPlusSign(nextChar));
            {
                ableToFormat = false;
            } //End block
        } //End collapsed parenthetic
        {
            varB4EAC82CA7396A68D541C85D26508E83_1054853422 = accruedInput.toString();
        } //End block
        nextChar = normalizeAndAccrueDigitsAndPlusSign(nextChar, rememberPosition);
        {
            Object var958DDC020A719BE9C0B56C0556A777B3_1911759807 = (accruedInputWithoutFormatting.length());
            //Begin case 0 1 2 
            varB4EAC82CA7396A68D541C85D26508E83_734798997 = accruedInput.toString();
            //End case 0 1 2 
            //Begin case 3 
            {
                boolean varA190F04796E1900C48E0B801F46A04E4_105783352 = (attemptToExtractIdd());
                {
                    isExpectingCountryCallingCode = true;
                } //End block
                {
                    removeNationalPrefixFromNationalNumber();
                    varB4EAC82CA7396A68D541C85D26508E83_1564416871 = attemptToChooseFormattingPattern();
                } //End block
            } //End collapsed parenthetic
            //End case 3 
            //Begin case 4 5 
            {
                {
                    boolean varDAFAE5E33CFA96F2C0611CC43EAAA591_2132011590 = (attemptToExtractCountryCallingCode());
                    {
                        isExpectingCountryCallingCode = false;
                    } //End block
                } //End collapsed parenthetic
                varB4EAC82CA7396A68D541C85D26508E83_1187621804 = prefixBeforeNationalNumber + nationalNumber.toString();
            } //End block
            //End case 4 5 
            //Begin case 6 
            {
                boolean varF57D8B93BD89B2796D5B19E5CFCDED2E_2124017212 = (isExpectingCountryCallingCode && !attemptToExtractCountryCallingCode());
                {
                    ableToFormat = false;
                    varB4EAC82CA7396A68D541C85D26508E83_1600181148 = accruedInput.toString();
                } //End block
            } //End collapsed parenthetic
            //End case 6 
            //Begin case default 
            {
                boolean varA1374B0BCDACDBA19097DC387347E589_424270872 = (possibleFormats.size() > 0);
                {
                    String tempNationalNumber;
                    tempNationalNumber = inputDigitHelper(nextChar);
                    String formattedNumber;
                    formattedNumber = attemptToFormatAccruedDigits();
                    {
                        boolean varF6DD175EAA1621DB1E8681BA262C055F_1707855056 = (formattedNumber.length() > 0);
                        {
                            varB4EAC82CA7396A68D541C85D26508E83_169720310 = formattedNumber;
                        } //End block
                    } //End collapsed parenthetic
                    narrowDownPossibleFormats(nationalNumber.toString());
                    {
                        boolean var09DADC53907D6077992B56A48A795551_781850221 = (maybeCreateNewTemplate());
                        {
                            varB4EAC82CA7396A68D541C85D26508E83_1786828158 = inputAccruedNationalNumber();
                        } //End block
                    } //End collapsed parenthetic
                    varB4EAC82CA7396A68D541C85D26508E83_1061770078 = ableToFormat
             ? prefixBeforeNationalNumber + tempNationalNumber
             : accruedInput.toString();
                } //End block
                {
                    varB4EAC82CA7396A68D541C85D26508E83_749228072 = attemptToChooseFormattingPattern();
                } //End block
            } //End collapsed parenthetic
            //End case default 
        } //End collapsed parenthetic
        addTaint(nextChar);
        addTaint(rememberPosition);
        String varA7E53CE21691AB073D9660D615818899_1245554612; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_1054853422;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_734798997;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_1564416871;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_1187621804;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_1600181148;
                break;
            case 6: //Assign result for return ordinal #6
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_169720310;
                break;
            case 7: //Assign result for return ordinal #7
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_1786828158;
                break;
            case 8: //Assign result for return ordinal #8
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_1061770078;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1245554612 = varB4EAC82CA7396A68D541C85D26508E83_749228072;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1245554612.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1245554612;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.844 -0400", hash_original_method = "3C59019883483E3D8800E37699311374", hash_generated_method = "DBD7B292A5007D70516CF1154017B5C8")
    private boolean isDigitOrLeadingPlusSign(char nextChar) {
        boolean varB854EBA358CA21C8BFC88085E508B2C3_267037587 = (Character.isDigit(nextChar) ||
        (accruedInput.length() == 1 &&
         PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(Character.toString(nextChar)).matches()));
        addTaint(nextChar);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1954457884 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1954457884;
        // ---------- Original Method ----------
        //return Character.isDigit(nextChar) ||
        //(accruedInput.length() == 1 &&
         //PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(Character.toString(nextChar)).matches());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.908 -0400", hash_original_method = "9BC9DDDBE79729997007D59699BB4F8B", hash_generated_method = "03AF69826AC64F4E976CD0B9E5B5E750")
     String attemptToFormatAccruedDigits() {
        String varB4EAC82CA7396A68D541C85D26508E83_200976913 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1947761858 = null; //Variable for return #2
        {
            Iterator<NumberFormat> var9FC04A10F16699539DFE98E18A1430D1_788541450 = (possibleFormats).iterator();
            var9FC04A10F16699539DFE98E18A1430D1_788541450.hasNext();
            NumberFormat numFormat = var9FC04A10F16699539DFE98E18A1430D1_788541450.next();
            {
                Matcher m;
                m = regexCache.getPatternForRegex(numFormat.getPattern()).matcher(nationalNumber);
                {
                    boolean var03F830A2F9B944C784852C2931FA3F13_1200463130 = (m.matches());
                    {
                        String formattedNumber;
                        formattedNumber = m.replaceAll(numFormat.getFormat());
                        varB4EAC82CA7396A68D541C85D26508E83_200976913 = prefixBeforeNationalNumber + formattedNumber;
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1947761858 = "";
        String varA7E53CE21691AB073D9660D615818899_1983668883; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1983668883 = varB4EAC82CA7396A68D541C85D26508E83_200976913;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1983668883 = varB4EAC82CA7396A68D541C85D26508E83_1947761858;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1983668883.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1983668883;
        // ---------- Original Method ----------
        //for (NumberFormat numFormat : possibleFormats) {
      //Matcher m = regexCache.getPatternForRegex(numFormat.getPattern()).matcher(nationalNumber);
      //if (m.matches()) {
        //String formattedNumber = m.replaceAll(numFormat.getFormat());
        //return prefixBeforeNationalNumber + formattedNumber;
      //}
    //}
        //return "";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.910 -0400", hash_original_method = "454614081331C76956AF09B40EA354E2", hash_generated_method = "097AF1D4034C7838282FC4BCBDA4040D")
    public int getRememberedPosition() {
        int accruedInputIndex, currentOutputIndex;
        accruedInputIndex = 0;
        currentOutputIndex = 0;
        {
            boolean var5371C1B90877D17E6BD64861C5C8658A_1870213964 = (accruedInputIndex < positionToRemember && currentOutputIndex < currentOutput.length());
            {
                {
                    boolean var1C52CDEF827B567419746C81F2C95CC1_481381610 = (accruedInputWithoutFormatting.charAt(accruedInputIndex) ==
          currentOutput.charAt(currentOutputIndex));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_711272870 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_711272870;
        // ---------- Original Method ----------
        //if (!ableToFormat) {
      //return originalPosition;
    //}
        //int accruedInputIndex = 0, currentOutputIndex = 0;
        //while (accruedInputIndex < positionToRemember && currentOutputIndex < currentOutput.length()) {
      //if (accruedInputWithoutFormatting.charAt(accruedInputIndex) ==
          //currentOutput.charAt(currentOutputIndex)) {
        //accruedInputIndex++;
      //}
      //currentOutputIndex++;
    //}
        //return currentOutputIndex;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.910 -0400", hash_original_method = "4C8321A90BCC237ABE581FD0E018E0B0", hash_generated_method = "85003770FFD77528DDBED0AD4236AC37")
    private String attemptToChooseFormattingPattern() {
        String varB4EAC82CA7396A68D541C85D26508E83_254693791 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_474479934 = null; //Variable for return #2
        {
            boolean var9FA4F6FDF556EBF21497E7A5C69401AC_1492289593 = (nationalNumber.length() >= MIN_LEADING_DIGITS_LENGTH);
            {
                getAvailableFormats(nationalNumber.substring(0, MIN_LEADING_DIGITS_LENGTH));
                maybeCreateNewTemplate();
                varB4EAC82CA7396A68D541C85D26508E83_254693791 = inputAccruedNationalNumber();
            } //End block
            {
                varB4EAC82CA7396A68D541C85D26508E83_474479934 = prefixBeforeNationalNumber + nationalNumber.toString();
            } //End block
        } //End collapsed parenthetic
        String varA7E53CE21691AB073D9660D615818899_949101743; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_949101743 = varB4EAC82CA7396A68D541C85D26508E83_254693791;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_949101743 = varB4EAC82CA7396A68D541C85D26508E83_474479934;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_949101743.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_949101743;
        // ---------- Original Method ----------
        //if (nationalNumber.length() >= MIN_LEADING_DIGITS_LENGTH) {
      //getAvailableFormats(nationalNumber.substring(0, MIN_LEADING_DIGITS_LENGTH));
      //maybeCreateNewTemplate();
      //return inputAccruedNationalNumber();
    //} else {
      //return prefixBeforeNationalNumber + nationalNumber.toString();
    //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.924 -0400", hash_original_method = "A0C52ED0A89DE12301F2C974C5007560", hash_generated_method = "8E2B3D9FFB7CB0FD547A61A9612E9A0D")
    private String inputAccruedNationalNumber() {
        String varB4EAC82CA7396A68D541C85D26508E83_597087274 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1093315256 = null; //Variable for return #2
        int lengthOfNationalNumber;
        lengthOfNationalNumber = nationalNumber.length();
        {
            String tempNationalNumber;
            tempNationalNumber = "";
            {
                int i;
                i = 0;
                {
                    tempNationalNumber = inputDigitHelper(nationalNumber.charAt(i));
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_597087274 = ableToFormat
          ? prefixBeforeNationalNumber + tempNationalNumber
          : accruedInput.toString();
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1093315256 = prefixBeforeNationalNumber.toString();
        } //End block
        String varA7E53CE21691AB073D9660D615818899_1583238183; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1583238183 = varB4EAC82CA7396A68D541C85D26508E83_597087274;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1583238183 = varB4EAC82CA7396A68D541C85D26508E83_1093315256;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1583238183.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1583238183;
        // ---------- Original Method ----------
        //int lengthOfNationalNumber = nationalNumber.length();
        //if (lengthOfNationalNumber > 0) {
      //String tempNationalNumber = "";
      //for (int i = 0; i < lengthOfNationalNumber; i++) {
        //tempNationalNumber = inputDigitHelper(nationalNumber.charAt(i));
      //}
      //return ableToFormat
          //? prefixBeforeNationalNumber + tempNationalNumber
          //: accruedInput.toString();
    //} else {
      //return prefixBeforeNationalNumber.toString();
    //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.926 -0400", hash_original_method = "810622AECED476A4374C59B83D98E171", hash_generated_method = "2591AF2FC789D5DA6FCC93EDBEB23C0C")
    private void removeNationalPrefixFromNationalNumber() {
        int startOfNationalNumber;
        startOfNationalNumber = 0;
        {
            boolean var045B25E8B4EA73C8B1EF895EBD592D5B_1683561307 = (currentMetaData.getCountryCode() == 1 && nationalNumber.charAt(0) == '1');
            {
                startOfNationalNumber = 1;
                prefixBeforeNationalNumber.append("1 ");
                isInternationalFormatting = true;
            } //End block
            {
                boolean varD31C8D12C55204ED68FD13843381C23F_1262199380 = (currentMetaData.hasNationalPrefix());
                {
                    Pattern nationalPrefixForParsing;
                    nationalPrefixForParsing = regexCache.getPatternForRegex(currentMetaData.getNationalPrefixForParsing());
                    Matcher m;
                    m = nationalPrefixForParsing.matcher(nationalNumber);
                    {
                        boolean var03FC912A54B68CD37D1C2CF7165E7E97_1517292961 = (m.lookingAt());
                        {
                            isInternationalFormatting = true;
                            startOfNationalNumber = m.end();
                            prefixBeforeNationalNumber.append(nationalNumber.substring(0, startOfNationalNumber));
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        nationalNumber.delete(0, startOfNationalNumber);
        // ---------- Original Method ----------
        //int startOfNationalNumber = 0;
        //if (currentMetaData.getCountryCode() == 1 && nationalNumber.charAt(0) == '1') {
      //startOfNationalNumber = 1;
      //prefixBeforeNationalNumber.append("1 ");
      //isInternationalFormatting = true;
    //} else if (currentMetaData.hasNationalPrefix()) {
      //Pattern nationalPrefixForParsing =
        //regexCache.getPatternForRegex(currentMetaData.getNationalPrefixForParsing());
      //Matcher m = nationalPrefixForParsing.matcher(nationalNumber);
      //if (m.lookingAt()) {
        //isInternationalFormatting = true;
        //startOfNationalNumber = m.end();
        //prefixBeforeNationalNumber.append(nationalNumber.substring(0, startOfNationalNumber));
      //}
    //}
        //nationalNumber.delete(0, startOfNationalNumber);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.927 -0400", hash_original_method = "B953FBA4B3460899EA66156C6BB3FF32", hash_generated_method = "507C2AF80FD5D65CB09FF083E80D6951")
    private boolean attemptToExtractIdd() {
        Pattern internationalPrefix;
        internationalPrefix = regexCache.getPatternForRegex("\\" + PhoneNumberUtil.PLUS_SIGN + "|" +
            currentMetaData.getInternationalPrefix());
        Matcher iddMatcher;
        iddMatcher = internationalPrefix.matcher(accruedInputWithoutFormatting);
        {
            boolean varCBE3A2BF3A06EE46C03E1FD5AE741CF2_1881381107 = (iddMatcher.lookingAt());
            {
                isInternationalFormatting = true;
                int startOfCountryCallingCode;
                startOfCountryCallingCode = iddMatcher.end();
                nationalNumber.setLength(0);
                nationalNumber.append(accruedInputWithoutFormatting.substring(startOfCountryCallingCode));
                prefixBeforeNationalNumber.append(
          accruedInputWithoutFormatting.substring(0, startOfCountryCallingCode));
                {
                    boolean var00BDCF4F1081545026429ABCA34FACA3_823377038 = (accruedInputWithoutFormatting.charAt(0) != PhoneNumberUtil.PLUS_SIGN);
                    {
                        prefixBeforeNationalNumber.append(" ");
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1962079598 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1962079598;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.927 -0400", hash_original_method = "218BC2BA6DFB456EB7693A201AB85277", hash_generated_method = "358D05DD8B90B17BE47C4A2A8338C99B")
    private boolean attemptToExtractCountryCallingCode() {
        {
            boolean varF2876EC5E1A56C14F3F673620F1139E3_2102407827 = (nationalNumber.length() == 0);
        } //End collapsed parenthetic
        StringBuilder numberWithoutCountryCallingCode;
        numberWithoutCountryCallingCode = new StringBuilder();
        int countryCode;
        countryCode = phoneUtil.extractCountryCode(nationalNumber, numberWithoutCountryCallingCode);
        nationalNumber.setLength(0);
        nationalNumber.append(numberWithoutCountryCallingCode);
        String newRegionCode;
        newRegionCode = phoneUtil.getRegionCodeForCountryCode(countryCode);
        {
            boolean var379D4BBBB3A58B82FD2703703856594C_1619397692 = (!newRegionCode.equals(defaultCountry));
            {
                currentMetaData = getMetadataForRegion(newRegionCode);
            } //End block
        } //End collapsed parenthetic
        String countryCodeString;
        countryCodeString = Integer.toString(countryCode);
        prefixBeforeNationalNumber.append(countryCodeString).append(" ");
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_428053231 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_428053231;
        // ---------- Original Method ----------
        //if (nationalNumber.length() == 0) {
      //return false;
    //}
        //StringBuilder numberWithoutCountryCallingCode = new StringBuilder();
        //int countryCode = phoneUtil.extractCountryCode(nationalNumber, numberWithoutCountryCallingCode);
        //if (countryCode == 0) {
      //return false;
    //}
        //nationalNumber.setLength(0);
        //nationalNumber.append(numberWithoutCountryCallingCode);
        //String newRegionCode = phoneUtil.getRegionCodeForCountryCode(countryCode);
        //if (!newRegionCode.equals(defaultCountry)) {
      //currentMetaData = getMetadataForRegion(newRegionCode);
    //}
        //String countryCodeString = Integer.toString(countryCode);
        //prefixBeforeNationalNumber.append(countryCodeString).append(" ");
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.928 -0400", hash_original_method = "77D81BD33F378FE00304ED0E0D731511", hash_generated_method = "CC5EDD1E159BD828740A8CB5E198E1E7")
    private char normalizeAndAccrueDigitsAndPlusSign(char nextChar, boolean rememberPosition) {
        char normalizedChar;
        {
            normalizedChar = nextChar;
            accruedInputWithoutFormatting.append(nextChar);
        } //End block
        {
            int radix;
            radix = 10;
            normalizedChar = Character.forDigit(Character.digit(nextChar, radix), radix);
            accruedInputWithoutFormatting.append(normalizedChar);
            nationalNumber.append(normalizedChar);
        } //End block
        {
            positionToRemember = accruedInputWithoutFormatting.length();
        } //End block
        addTaint(nextChar);
        addTaint(rememberPosition);
        char varA87DEB01C5F539E6BDA34829C8EF2368_485795242 = getTaintChar();
        return varA87DEB01C5F539E6BDA34829C8EF2368_485795242;
        // ---------- Original Method ----------
        //char normalizedChar;
        //if (nextChar == PhoneNumberUtil.PLUS_SIGN) {
      //normalizedChar = nextChar;
      //accruedInputWithoutFormatting.append(nextChar);
    //} else {
      //int radix = 10;
      //normalizedChar = Character.forDigit(Character.digit(nextChar, radix), radix);
      //accruedInputWithoutFormatting.append(normalizedChar);
      //nationalNumber.append(normalizedChar);
    //}
        //if (rememberPosition) {
      //positionToRemember = accruedInputWithoutFormatting.length();
    //}
        //return normalizedChar;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.929 -0400", hash_original_method = "E1A45868A03256452AD2B7163B170B11", hash_generated_method = "CBABE1DC371F0DFEC21DB7A9CF1EE9BE")
    private String inputDigitHelper(char nextChar) {
        String varB4EAC82CA7396A68D541C85D26508E83_985901640 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_2113570549 = null; //Variable for return #2
        Matcher digitMatcher;
        digitMatcher = digitPattern.matcher(formattingTemplate);
        {
            boolean var86845E1C5CE6DEC62C1CC3A89B8DE2D9_877585561 = (digitMatcher.find(lastMatchPosition));
            {
                String tempTemplate;
                tempTemplate = digitMatcher.replaceFirst(Character.toString(nextChar));
                formattingTemplate.replace(0, tempTemplate.length(), tempTemplate);
                lastMatchPosition = digitMatcher.start();
                varB4EAC82CA7396A68D541C85D26508E83_985901640 = formattingTemplate.substring(0, lastMatchPosition + 1);
            } //End block
            {
                {
                    boolean var381FDF789F1A9E08BDBD9A928277B406_1472510154 = (possibleFormats.size() == 1);
                    {
                        ableToFormat = false;
                    } //End block
                } //End collapsed parenthetic
                currentFormattingPattern = "";
                varB4EAC82CA7396A68D541C85D26508E83_2113570549 = accruedInput.toString();
            } //End block
        } //End collapsed parenthetic
        addTaint(nextChar);
        String varA7E53CE21691AB073D9660D615818899_108658707; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_108658707 = varB4EAC82CA7396A68D541C85D26508E83_985901640;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_108658707 = varB4EAC82CA7396A68D541C85D26508E83_2113570549;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_108658707.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_108658707;
        // ---------- Original Method ----------
        //Matcher digitMatcher = digitPattern.matcher(formattingTemplate);
        //if (digitMatcher.find(lastMatchPosition)) {
      //String tempTemplate = digitMatcher.replaceFirst(Character.toString(nextChar));
      //formattingTemplate.replace(0, tempTemplate.length(), tempTemplate);
      //lastMatchPosition = digitMatcher.start();
      //return formattingTemplate.substring(0, lastMatchPosition + 1);
    //} else {
      //if (possibleFormats.size() == 1) {
        //ableToFormat = false;
      //}  
      //currentFormattingPattern = "";
      //return accruedInput.toString();
    //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.929 -0400", hash_original_field = "61158E732E552EC810F8738B9805D687", hash_generated_field = "242E6AA40D0E43874CBAD71B00CD6BD9")

    private static PhoneMetadata EMPTY_METADATA = new PhoneMetadata().setInternationalPrefix("NA");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.929 -0400", hash_original_field = "35A028FF00BEB060B0EFB3D3BF69C219", hash_generated_field = "E49E481B5FD12E6DDBD8FFABAB47604B")

    private static Pattern CHARACTER_CLASS_PATTERN = Pattern.compile("\\[([^\\[\\]])*\\]");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.929 -0400", hash_original_field = "6677810ED39749757FB9724C9FC93820", hash_generated_field = "B35ABE9725B6781A31F9EE1778A97B75")

    private static Pattern STANDALONE_DIGIT_PATTERN = Pattern.compile("\\d(?=[^,}][^,}])");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.929 -0400", hash_original_field = "3B829B24B9A48E8D695B7854B3461D48", hash_generated_field = "65BD1EE8146BCBF56F1D2FCA4BFB77A9")

    private static Pattern ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[" + PhoneNumberUtil.VALID_PUNCTUATION + "]*" +
          "(\\$\\d" + "[" + PhoneNumberUtil.VALID_PUNCTUATION + "]*)+");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:10.929 -0400", hash_original_field = "916690B3AAEA02ED5BB6D44BA6E02578", hash_generated_field = "8724473EA690AF562B489AD1BED06C6E")

    private static int MIN_LEADING_DIGITS_LENGTH = 3;
}

