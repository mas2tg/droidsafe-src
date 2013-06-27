package com.android.internal.telephony;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.HashMap;

public class WspTypeDecoder {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.738 -0400", hash_original_field = "87B087375EA22EC6DF3C6E6687D91C30", hash_generated_field = "8290EB0F02CFA38CB47A5B024440BD48")

    byte[] wspData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.738 -0400", hash_original_field = "8099F621661FD70FB137BCB82175502F", hash_generated_field = "C2C63300DBA8596D9F7506F440BE0C4D")

    int dataLength;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.738 -0400", hash_original_field = "7AD31D85AAE2172A581FDA7D1EAB5B0A", hash_generated_field = "3CB5D92C1A42DDEDB166C653EEBE8D94")

    long unsigned32bit;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.738 -0400", hash_original_field = "5B57AB60C984EEC4BC98143F6D1E8775", hash_generated_field = "E14F733129C447B5EE9E173FE8A7AECF")

    String stringValue;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.738 -0400", hash_original_field = "4F8C35A54550B9400D66946BC5378404", hash_generated_field = "99E7FB2AD756216059D191866E496D5B")

    HashMap<String, String> contentParameters;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.738 -0400", hash_original_method = "5272930664D9B8230407C0BE43B28A37", hash_generated_method = "64FBC31D7C3F545B7475044B7FFE92E1")
    public  WspTypeDecoder(byte[] pdu) {
        wspData = pdu;
        // ---------- Original Method ----------
        //wspData = pdu;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.741 -0400", hash_original_method = "AD9CBD08D1B6621762343776ED03C203", hash_generated_method = "94213FA0340D0BD01FD8E4C445C26AE8")
    public boolean decodeTextString(int startIndex) {
        int index;
        index = startIndex;
        dataLength = index - startIndex + 1;
        {
            stringValue = new String(wspData, startIndex + 1, dataLength - 2);
        } //End block
        {
            stringValue = new String(wspData, startIndex, dataLength - 1);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1600551615 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1600551615;
        // ---------- Original Method ----------
        //int index = startIndex;
        //while (wspData[index] != 0) {
            //index++;
        //}
        //dataLength = index - startIndex + 1;
        //if (wspData[startIndex] == 127) {
            //stringValue = new String(wspData, startIndex + 1, dataLength - 2);
        //} else {
            //stringValue = new String(wspData, startIndex, dataLength - 1);
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.749 -0400", hash_original_method = "3D6D7F94DFC73BF2A0EB1C158A6FC357", hash_generated_method = "BBCA493D98A9C267343B848606A18DCE")
    public boolean decodeTokenText(int startIndex) {
        int index;
        index = startIndex;
        dataLength = index - startIndex + 1;
        stringValue = new String(wspData, startIndex, dataLength - 1);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_256593573 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_256593573;
        // ---------- Original Method ----------
        //int index = startIndex;
        //while (wspData[index] != 0) {
            //index++;
        //}
        //dataLength = index - startIndex + 1;
        //stringValue = new String(wspData, startIndex, dataLength - 1);
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.751 -0400", hash_original_method = "83D32C5BCB0549BFFFB2F2ED18850933", hash_generated_method = "70430E2877C4F8AD48D0709F2B70CA5E")
    public boolean decodeShortInteger(int startIndex) {
        unsigned32bit = wspData[startIndex] & 0x7f;
        dataLength = 1;
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2072703947 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2072703947;
        // ---------- Original Method ----------
        //if ((wspData[startIndex] & 0x80) == 0) {
            //return false;
        //}
        //unsigned32bit = wspData[startIndex] & 0x7f;
        //dataLength = 1;
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.761 -0400", hash_original_method = "B3FA7CC1597D63764316082CF6F63FFB", hash_generated_method = "9EC95A13569659A4FAC9323E19274465")
    public boolean decodeLongInteger(int startIndex) {
        int lengthMultiOctet;
        lengthMultiOctet = wspData[startIndex] & 0xff;
        unsigned32bit = 0;
        {
            int i;
            i = 1;
            {
                unsigned32bit = (unsigned32bit << 8) | (wspData[startIndex + i] & 0xff);
            } //End block
        } //End collapsed parenthetic
        dataLength = 1 + lengthMultiOctet;
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2098448963 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2098448963;
        // ---------- Original Method ----------
        //int lengthMultiOctet = wspData[startIndex] & 0xff;
        //if (lengthMultiOctet > WAP_PDU_SHORT_LENGTH_MAX) {
            //return false;
        //}
        //unsigned32bit = 0;
        //for (int i = 1; i <= lengthMultiOctet; i++) {
            //unsigned32bit = (unsigned32bit << 8) | (wspData[startIndex + i] & 0xff);
        //}
        //dataLength = 1 + lengthMultiOctet;
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.762 -0400", hash_original_method = "7B23A3D94A21E730AAD2DD6C619E091C", hash_generated_method = "FEDDEA77510092D611496A816C295057")
    public boolean decodeIntegerValue(int startIndex) {
        {
            boolean var1C9B73C3826762586421D8059D80ABDF_1739325473 = (decodeShortInteger(startIndex) == true);
        } //End collapsed parenthetic
        boolean var64119D95C8AB1E549EE2B71524C80024_107507171 = (decodeLongInteger(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_567803404 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_567803404;
        // ---------- Original Method ----------
        //if (decodeShortInteger(startIndex) == true) {
            //return true;
        //}
        //return decodeLongInteger(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.762 -0400", hash_original_method = "C4B929220DC6CCE2C4298A937E6A511E", hash_generated_method = "6EB7F01F4D5DD17D6C1F3E898237AAD7")
    public boolean decodeUintvarInteger(int startIndex) {
        int index;
        index = startIndex;
        unsigned32bit = 0;
        {
            unsigned32bit = (unsigned32bit << 7) | (wspData[index] & 0x7f);
        } //End block
        unsigned32bit = (unsigned32bit << 7) | (wspData[index] & 0x7f);
        dataLength = index - startIndex + 1;
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_736880234 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_736880234;
        // ---------- Original Method ----------
        //int index = startIndex;
        //unsigned32bit = 0;
        //while ((wspData[index] & 0x80) != 0) {
            //if ((index - startIndex) >= 4) {
                //return false;
            //}
            //unsigned32bit = (unsigned32bit << 7) | (wspData[index] & 0x7f);
            //index++;
        //}
        //unsigned32bit = (unsigned32bit << 7) | (wspData[index] & 0x7f);
        //dataLength = index - startIndex + 1;
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.770 -0400", hash_original_method = "EAB4DD919BF3841A91E98F99540A239A", hash_generated_method = "36C8D26FA2D401F92B8F5C21129074B2")
    public boolean decodeValueLength(int startIndex) {
        {
            unsigned32bit = wspData[startIndex];
            dataLength = 1;
        } //End block
        {
            decodeUintvarInteger(startIndex + 1);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1860615569 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1860615569;
        // ---------- Original Method ----------
        //if ((wspData[startIndex] & 0xff) > WAP_PDU_LENGTH_QUOTE) {
            //return false;
        //}
        //if (wspData[startIndex] < WAP_PDU_LENGTH_QUOTE) {
            //unsigned32bit = wspData[startIndex];
            //dataLength = 1;
        //} else {
            //decodeUintvarInteger(startIndex + 1);
            //dataLength++;
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.775 -0400", hash_original_method = "EF88FEA15C53B4BFAD6A7F9FD25E8828", hash_generated_method = "2AC407C6FBA439D9F88709389BE9F9CC")
    public boolean decodeExtensionMedia(int startIndex) {
        int index;
        index = startIndex;
        dataLength = 0;
        stringValue = null;
        int length;
        length = wspData.length;
        boolean rtrn;
        rtrn = index < length;
        dataLength = index - startIndex + 1;
        stringValue = new String(wspData, startIndex, dataLength - 1);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1300282693 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1300282693;
        // ---------- Original Method ----------
        //int index = startIndex;
        //dataLength = 0;
        //stringValue = null;
        //int length = wspData.length;
        //boolean rtrn = index < length;
        //while (index < length && wspData[index] != 0) {
            //index++;
        //}
        //dataLength = index - startIndex + 1;
        //stringValue = new String(wspData, startIndex, dataLength - 1);
        //return rtrn;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.776 -0400", hash_original_method = "996125374865CC4B3A630D89D596F543", hash_generated_method = "FFFDC4C63165A6DA4BC4E40D30B8AF09")
    public boolean decodeConstrainedEncoding(int startIndex) {
        {
            boolean var1C9B73C3826762586421D8059D80ABDF_989469609 = (decodeShortInteger(startIndex) == true);
            {
                stringValue = null;
            } //End block
        } //End collapsed parenthetic
        boolean var4F09B9F518A18BC08FE863B1FF75D517_1063107522 = (decodeExtensionMedia(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2118353816 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2118353816;
        // ---------- Original Method ----------
        //if (decodeShortInteger(startIndex) == true) {
            //stringValue = null;
            //return true;
        //}
        //return decodeExtensionMedia(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.781 -0400", hash_original_method = "DFA72F248348DAACE561F2A4664CE110", hash_generated_method = "34DDBC68356972503938C2CD25ED934C")
    public boolean decodeContentType(int startIndex) {
        int mediaPrefixLength;
        contentParameters = new HashMap<String, String>();
        try 
        {
            {
                boolean var3ABBC69DADC6991B732D0528B8EE1A67_2005471760 = (decodeValueLength(startIndex) == false);
                {
                    boolean found;
                    found = decodeConstrainedEncoding(startIndex);
                    {
                        expandWellKnownMimeType();
                    } //End block
                } //End block
            } //End collapsed parenthetic
            int headersLength;
            headersLength = (int) unsigned32bit;
            mediaPrefixLength = getDecodedDataLength();
            {
                boolean var95A10877E5A6E7BBEF5BE5AD28A0F776_496438146 = (decodeIntegerValue(startIndex + mediaPrefixLength) == true);
                {
                    dataLength += mediaPrefixLength;
                    int readLength;
                    readLength = dataLength;
                    stringValue = null;
                    expandWellKnownMimeType();
                    long wellKnownValue;
                    wellKnownValue = unsigned32bit;
                    String mimeType;
                    mimeType = stringValue;
                    {
                        boolean varCCDCCCA6ACF1A67DAB9D227159E1C5CC_1093667470 = (readContentParameters(startIndex + dataLength,
                        (headersLength - (dataLength - mediaPrefixLength)), 0));
                        {
                            dataLength += readLength;
                            unsigned32bit = wellKnownValue;
                            stringValue = mimeType;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            {
                boolean varC168EC6BE78E873E9F43E6D83D876596_1241317555 = (decodeExtensionMedia(startIndex + mediaPrefixLength) == true);
                {
                    dataLength += mediaPrefixLength;
                    int readLength;
                    readLength = dataLength;
                    expandWellKnownMimeType();
                    long wellKnownValue;
                    wellKnownValue = unsigned32bit;
                    String mimeType;
                    mimeType = stringValue;
                    {
                        boolean varCCDCCCA6ACF1A67DAB9D227159E1C5CC_689773584 = (readContentParameters(startIndex + dataLength,
                        (headersLength - (dataLength - mediaPrefixLength)), 0));
                        {
                            dataLength += readLength;
                            unsigned32bit = wellKnownValue;
                            stringValue = mimeType;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        catch (ArrayIndexOutOfBoundsException e)
        { }
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_625950232 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_625950232;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.787 -0400", hash_original_method = "C75EA04BE4FCD731CE2D1E2104C2BFC7", hash_generated_method = "5F401ECBB578192785004519BAC39323")
    private boolean readContentParameters(int startIndex, int leftToRead, int accumulator) {
        int totalRead;
        totalRead = 0;
        {
            byte nextByte;
            nextByte = wspData[startIndex];
            String value;
            value = null;
            String param;
            param = null;
            {
                decodeTokenText(startIndex);
                param = stringValue;
                totalRead += dataLength;
            } //End block
            {
                {
                    boolean var3CAAA8BEA3B83EA43CED18226EE493BE_675202671 = (decodeIntegerValue(startIndex));
                    {
                        totalRead += dataLength;
                        int wellKnownParameterValue;
                        wellKnownParameterValue = (int) unsigned32bit;
                        param = WELL_KNOWN_PARAMETERS.get(wellKnownParameterValue);
                        {
                            param = "unassigned/0x" + Long.toHexString(wellKnownParameterValue);
                        } //End block
                        {
                            {
                                boolean varE161740E6212EA8B5BB2E3B363D2C1AD_26241224 = (decodeUintvarInteger(startIndex + totalRead));
                                {
                                    totalRead += dataLength;
                                    value = String.valueOf(unsigned32bit);
                                    contentParameters.put(param, value);
                                    boolean varEBCD5665C3CB3AAE6E64A7A6D5426A79_1865095897 = (readContentParameters(startIndex + totalRead, leftToRead
                                                            - totalRead, accumulator + totalRead));
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                boolean varC6328D04C5A3761DD766CE780F5E25B3_581380107 = (decodeNoValue(startIndex + totalRead));
                {
                    totalRead += dataLength;
                    value = null;
                } //End block
                {
                    boolean var2AF1F51211F5EA3621A475D01F6286F9_810108062 = (decodeIntegerValue(startIndex + totalRead));
                    {
                        totalRead += dataLength;
                        int intValue;
                        intValue = (int) unsigned32bit;
                        {
                            value = "";
                        } //End block
                        {
                            value = String.valueOf(intValue);
                        } //End block
                    } //End block
                    {
                        decodeTokenText(startIndex + totalRead);
                        totalRead += dataLength;
                        value = stringValue;
                        {
                            boolean varCC1E5C31169C020911CB7872C14FA5C5_773831685 = (value.startsWith("\""));
                            {
                                value = value.substring(1);
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End collapsed parenthetic
            contentParameters.put(param, value);
            boolean var7E97E609C8A7BA25C3E276CFC52D5FB3_817043948 = (readContentParameters(startIndex + totalRead, leftToRead - totalRead,
                                            accumulator + totalRead));
        } //End block
        {
            dataLength = accumulator;
        } //End block
        addTaint(startIndex);
        addTaint(leftToRead);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_922355587 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_922355587;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.793 -0400", hash_original_method = "7291D1B6F4C3ED0E6F576F289818668E", hash_generated_method = "2B9F2336DA1A44BACF0991D3D0AA33FD")
    private boolean decodeNoValue(int startIndex) {
        {
            dataLength = 1;
        } //End block
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1621327421 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1621327421;
        // ---------- Original Method ----------
        //if (wspData[startIndex] == 0) {
            //dataLength = 1;
            //return true;
        //} else {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.794 -0400", hash_original_method = "CE7AFD5926883ED0297E0E8EC7A7D731", hash_generated_method = "15777DC299F40CBAF0E8026F5DA4BE86")
    private void expandWellKnownMimeType() {
        {
            int binaryContentType;
            binaryContentType = (int) unsigned32bit;
            stringValue = WELL_KNOWN_MIME_TYPES.get(binaryContentType);
        } //End block
        {
            unsigned32bit = -1;
        } //End block
        // ---------- Original Method ----------
        //if (stringValue == null) {
            //int binaryContentType = (int) unsigned32bit;
            //stringValue = WELL_KNOWN_MIME_TYPES.get(binaryContentType);
        //} else {
            //unsigned32bit = -1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.798 -0400", hash_original_method = "6DB17C60367E4FD9EA73FA0EFFFEAB7B", hash_generated_method = "2B4462297DFB2A719F5B1086D751C63D")
    public boolean decodeContentLength(int startIndex) {
        boolean var7077CAEA40E22AEE07EE9069B9A30AB8_2074008838 = (decodeIntegerValue(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1167405224 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1167405224;
        // ---------- Original Method ----------
        //return decodeIntegerValue(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.798 -0400", hash_original_method = "B28E495795E9250815D18C95A5C9BAB3", hash_generated_method = "E2EE449A004E09303D94A708881EEE2D")
    public boolean decodeContentLocation(int startIndex) {
        boolean varEDAF0A26C796B363F4C7D4AE22FF909E_103397400 = (decodeTextString(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_896392326 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_896392326;
        // ---------- Original Method ----------
        //return decodeTextString(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.799 -0400", hash_original_method = "AEF025906C652297B5F2A3BDE834B061", hash_generated_method = "321D469F615BDC18380E5A773F8B871F")
    public boolean decodeXWapApplicationId(int startIndex) {
        {
            boolean varDC0A767F76DF83F558A0C35EAF704F8B_1257743016 = (decodeIntegerValue(startIndex) == true);
            {
                stringValue = null;
            } //End block
        } //End collapsed parenthetic
        boolean varEDAF0A26C796B363F4C7D4AE22FF909E_1094532575 = (decodeTextString(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1905454922 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1905454922;
        // ---------- Original Method ----------
        //if (decodeIntegerValue(startIndex) == true) {
            //stringValue = null;
            //return true;
        //}
        //return decodeTextString(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.811 -0400", hash_original_method = "BA996E98F19E8451E86BBFBC5F7B64F6", hash_generated_method = "5EC0078541BC39C60BB84F91A0C49692")
    public boolean seekXWapApplicationId(int startIndex, int endIndex) {
        int index;
        index = startIndex;
        try 
        {
            {
                index = startIndex;
                {
                    {
                        boolean var0C3AE32B8F9C0438CDB5414040BAE97E_969890743 = (decodeIntegerValue(index));
                        {
                            int fieldValue;
                            fieldValue = (int) getValue32();
                            {
                                unsigned32bit = index + 1;
                            } //End block
                        } //End block
                        {
                            {
                                boolean var84F11A269ED33CA89590FC121EDD5BE8_904659209 = (!decodeTextString(index));
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                    index += getDecodedDataLength();
                    byte val;
                    val = wspData[index];
                    {
                        index += wspData[index] + 1;
                    } //End block
                    {
                        {
                            boolean var4B12B0AE322D518F81AE2C4DBA083316_1260307438 = (!decodeUintvarInteger(index));
                        } //End collapsed parenthetic
                        index += getDecodedDataLength();
                    } //End block
                    {
                        {
                            boolean varD03D05721F07A95C3B6527252455DBDD_2017675260 = (!decodeTextString(index));
                        } //End collapsed parenthetic
                        index += getDecodedDataLength();
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        catch (ArrayIndexOutOfBoundsException e)
        { }
        addTaint(startIndex);
        addTaint(endIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1290130274 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1290130274;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.812 -0400", hash_original_method = "ABD97DC4CA444BF0EFE71949DA3B86E2", hash_generated_method = "8E63C543C88A464A92351B9B66ED2D8A")
    public boolean decodeXWapContentURI(int startIndex) {
        boolean varEDAF0A26C796B363F4C7D4AE22FF909E_1957579767 = (decodeTextString(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_768158428 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_768158428;
        // ---------- Original Method ----------
        //return decodeTextString(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.812 -0400", hash_original_method = "E928D18936C3E8793DB3C75F90F53AE7", hash_generated_method = "0F1D064DC42FE07BD4202DE84AC818BF")
    public boolean decodeXWapInitiatorURI(int startIndex) {
        boolean varEDAF0A26C796B363F4C7D4AE22FF909E_670119528 = (decodeTextString(startIndex));
        addTaint(startIndex);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_817823142 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_817823142;
        // ---------- Original Method ----------
        //return decodeTextString(startIndex);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.812 -0400", hash_original_method = "097EE97643EAEF3891CA5DC97464AC94", hash_generated_method = "D6B4B0C245BC038C19DBD188A504D765")
    public int getDecodedDataLength() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_360969024 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_360969024;
        // ---------- Original Method ----------
        //return dataLength;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.812 -0400", hash_original_method = "222353B4CE9A8EDC30DC1C12168B96BB", hash_generated_method = "DAB2A0CE8353DB8F5DF9297768295CF9")
    public long getValue32() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1185739966 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1185739966;
        // ---------- Original Method ----------
        //return unsigned32bit;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.815 -0400", hash_original_method = "8109E4DB1588BAB17F9AEE1B35CA6B07", hash_generated_method = "C5AE07E5E8086905634372605E56EA71")
    public String getValueString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1025372215 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1025372215 = stringValue;
        varB4EAC82CA7396A68D541C85D26508E83_1025372215.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1025372215;
        // ---------- Original Method ----------
        //return stringValue;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.815 -0400", hash_original_method = "F1FCA07D8088CB011EA83E53B391A96C", hash_generated_method = "A8B0D50C5F773E26CA396B076575E79F")
    public HashMap<String, String> getContentParameters() {
        HashMap<String, String> varB4EAC82CA7396A68D541C85D26508E83_1786462875 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1786462875 = contentParameters;
        varB4EAC82CA7396A68D541C85D26508E83_1786462875.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1786462875;
        // ---------- Original Method ----------
        //return contentParameters;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.815 -0400", hash_original_field = "964A97571D63A0AE4749BFDF31F84435", hash_generated_field = "70B5DA331F4A918653C45088D548347D")

    private static int WAP_PDU_SHORT_LENGTH_MAX = 30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.815 -0400", hash_original_field = "D462A4FAE5F635BB10AD018D71FFF675", hash_generated_field = "02C195FFE25DEDF173148D082C778EF5")

    private static int WAP_PDU_LENGTH_QUOTE = 31;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.815 -0400", hash_original_field = "ADA62C1416CCF70A475348DF41F02D6C", hash_generated_field = "F67180C752D65206BDD9E13836C7D7DA")

    public static final int PDU_TYPE_PUSH = 0x06;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.815 -0400", hash_original_field = "39E84628362C30B24B2B0F8B056DF0C2", hash_generated_field = "8B50E6D79FF4EAAE11A4EAFF8CB9C391")

    public static final int PDU_TYPE_CONFIRMED_PUSH = 0x07;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.828 -0400", hash_original_field = "5E381E15128FE3CF13099C94BC13CC9D", hash_generated_field = "65BAC7C745B818369B179CB3D93A7DA6")

    private static HashMap<Integer, String> WELL_KNOWN_MIME_TYPES = new HashMap<Integer, String>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.828 -0400", hash_original_field = "4925E42664D7E5D9E30FCDC14770BC4F", hash_generated_field = "2E1CEF9E74A673AE57AA504F6CAE3A76")

    private static HashMap<Integer, String> WELL_KNOWN_PARAMETERS = new HashMap<Integer, String>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.828 -0400", hash_original_field = "50FED79CAECC86960E5974F84D61AFF5", hash_generated_field = "BC518E54BB1177BA8736BADC7A57ED44")

    public static final int PARAMETER_ID_X_WAP_APPLICATION_ID = 0x2f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.828 -0400", hash_original_field = "ACEF663A39B141424AAA293CBEFAA9A2", hash_generated_field = "17075B9D4CFECE80F4536A2229347D86")

    private static int Q_VALUE = 0x00;
    static {
        WELL_KNOWN_MIME_TYPES.put(0x00, "*/*");
        WELL_KNOWN_MIME_TYPES.put(0x01, "text/*");
        WELL_KNOWN_MIME_TYPES.put(0x02, "text/html");
        WELL_KNOWN_MIME_TYPES.put(0x03, "text/plain");
        WELL_KNOWN_MIME_TYPES.put(0x04, "text/x-hdml");
        WELL_KNOWN_MIME_TYPES.put(0x05, "text/x-ttml");
        WELL_KNOWN_MIME_TYPES.put(0x06, "text/x-vCalendar");
        WELL_KNOWN_MIME_TYPES.put(0x07, "text/x-vCard");
        WELL_KNOWN_MIME_TYPES.put(0x08, "text/vnd.wap.wml");
        WELL_KNOWN_MIME_TYPES.put(0x09, "text/vnd.wap.wmlscript");
        WELL_KNOWN_MIME_TYPES.put(0x0A, "text/vnd.wap.wta-event");
        WELL_KNOWN_MIME_TYPES.put(0x0B, "multipart/*");
        WELL_KNOWN_MIME_TYPES.put(0x0C, "multipart/mixed");
        WELL_KNOWN_MIME_TYPES.put(0x0D, "multipart/form-data");
        WELL_KNOWN_MIME_TYPES.put(0x0E, "multipart/byterantes");
        WELL_KNOWN_MIME_TYPES.put(0x0F, "multipart/alternative");
        WELL_KNOWN_MIME_TYPES.put(0x10, "application/*");
        WELL_KNOWN_MIME_TYPES.put(0x11, "application/java-vm");
        WELL_KNOWN_MIME_TYPES.put(0x12, "application/x-www-form-urlencoded");
        WELL_KNOWN_MIME_TYPES.put(0x13, "application/x-hdmlc");
        WELL_KNOWN_MIME_TYPES.put(0x14, "application/vnd.wap.wmlc");
        WELL_KNOWN_MIME_TYPES.put(0x15, "application/vnd.wap.wmlscriptc");
        WELL_KNOWN_MIME_TYPES.put(0x16, "application/vnd.wap.wta-eventc");
        WELL_KNOWN_MIME_TYPES.put(0x17, "application/vnd.wap.uaprof");
        WELL_KNOWN_MIME_TYPES.put(0x18, "application/vnd.wap.wtls-ca-certificate");
        WELL_KNOWN_MIME_TYPES.put(0x19, "application/vnd.wap.wtls-user-certificate");
        WELL_KNOWN_MIME_TYPES.put(0x1A, "application/x-x509-ca-cert");
        WELL_KNOWN_MIME_TYPES.put(0x1B, "application/x-x509-user-cert");
        WELL_KNOWN_MIME_TYPES.put(0x1C, "image/*");
        WELL_KNOWN_MIME_TYPES.put(0x1D, "image/gif");
        WELL_KNOWN_MIME_TYPES.put(0x1E, "image/jpeg");
        WELL_KNOWN_MIME_TYPES.put(0x1F, "image/tiff");
        WELL_KNOWN_MIME_TYPES.put(0x20, "image/png");
        WELL_KNOWN_MIME_TYPES.put(0x21, "image/vnd.wap.wbmp");
        WELL_KNOWN_MIME_TYPES.put(0x22, "application/vnd.wap.multipart.*");
        WELL_KNOWN_MIME_TYPES.put(0x23, "application/vnd.wap.multipart.mixed");
        WELL_KNOWN_MIME_TYPES.put(0x24, "application/vnd.wap.multipart.form-data");
        WELL_KNOWN_MIME_TYPES.put(0x25, "application/vnd.wap.multipart.byteranges");
        WELL_KNOWN_MIME_TYPES.put(0x26, "application/vnd.wap.multipart.alternative");
        WELL_KNOWN_MIME_TYPES.put(0x27, "application/xml");
        WELL_KNOWN_MIME_TYPES.put(0x28, "text/xml");
        WELL_KNOWN_MIME_TYPES.put(0x29, "application/vnd.wap.wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x2A, "application/x-x968-cross-cert");
        WELL_KNOWN_MIME_TYPES.put(0x2B, "application/x-x968-ca-cert");
        WELL_KNOWN_MIME_TYPES.put(0x2C, "application/x-x968-user-cert");
        WELL_KNOWN_MIME_TYPES.put(0x2D, "text/vnd.wap.si");
        WELL_KNOWN_MIME_TYPES.put(0x2E, "application/vnd.wap.sic");
        WELL_KNOWN_MIME_TYPES.put(0x2F, "text/vnd.wap.sl");
        WELL_KNOWN_MIME_TYPES.put(0x30, "application/vnd.wap.slc");
        WELL_KNOWN_MIME_TYPES.put(0x31, "text/vnd.wap.co");
        WELL_KNOWN_MIME_TYPES.put(0x32, "application/vnd.wap.coc");
        WELL_KNOWN_MIME_TYPES.put(0x33, "application/vnd.wap.multipart.related");
        WELL_KNOWN_MIME_TYPES.put(0x34, "application/vnd.wap.sia");
        WELL_KNOWN_MIME_TYPES.put(0x35, "text/vnd.wap.connectivity-xml");
        WELL_KNOWN_MIME_TYPES.put(0x36, "application/vnd.wap.connectivity-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x37, "application/pkcs7-mime");
        WELL_KNOWN_MIME_TYPES.put(0x38, "application/vnd.wap.hashed-certificate");
        WELL_KNOWN_MIME_TYPES.put(0x39, "application/vnd.wap.signed-certificate");
        WELL_KNOWN_MIME_TYPES.put(0x3A, "application/vnd.wap.cert-response");
        WELL_KNOWN_MIME_TYPES.put(0x3B, "application/xhtml+xml");
        WELL_KNOWN_MIME_TYPES.put(0x3C, "application/wml+xml");
        WELL_KNOWN_MIME_TYPES.put(0x3D, "text/css");
        WELL_KNOWN_MIME_TYPES.put(0x3E, "application/vnd.wap.mms-message");
        WELL_KNOWN_MIME_TYPES.put(0x3F, "application/vnd.wap.rollover-certificate");
        WELL_KNOWN_MIME_TYPES.put(0x40, "application/vnd.wap.locc+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x41, "application/vnd.wap.loc+xml");
        WELL_KNOWN_MIME_TYPES.put(0x42, "application/vnd.syncml.dm+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x43, "application/vnd.syncml.dm+xml");
        WELL_KNOWN_MIME_TYPES.put(0x44, "application/vnd.syncml.notification");
        WELL_KNOWN_MIME_TYPES.put(0x45, "application/vnd.wap.xhtml+xml");
        WELL_KNOWN_MIME_TYPES.put(0x46, "application/vnd.wv.csp.cir");
        WELL_KNOWN_MIME_TYPES.put(0x47, "application/vnd.oma.dd+xml");
        WELL_KNOWN_MIME_TYPES.put(0x48, "application/vnd.oma.drm.message");
        WELL_KNOWN_MIME_TYPES.put(0x49, "application/vnd.oma.drm.content");
        WELL_KNOWN_MIME_TYPES.put(0x4A, "application/vnd.oma.drm.rights+xml");
        WELL_KNOWN_MIME_TYPES.put(0x4B, "application/vnd.oma.drm.rights+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x4C, "application/vnd.wv.csp+xml");
        WELL_KNOWN_MIME_TYPES.put(0x4D, "application/vnd.wv.csp+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x4E, "application/vnd.syncml.ds.notification");
        WELL_KNOWN_MIME_TYPES.put(0x4F, "audio/*");
        WELL_KNOWN_MIME_TYPES.put(0x50, "video/*");
        WELL_KNOWN_MIME_TYPES.put(0x51, "application/vnd.oma.dd2+xml");
        WELL_KNOWN_MIME_TYPES.put(0x52, "application/mikey");
        WELL_KNOWN_MIME_TYPES.put(0x53, "application/vnd.oma.dcd");
        WELL_KNOWN_MIME_TYPES.put(0x54, "application/vnd.oma.dcdc");
        WELL_KNOWN_MIME_TYPES.put(0x0201, "application/vnd.uplanet.cacheop-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0202, "application/vnd.uplanet.signal");
        WELL_KNOWN_MIME_TYPES.put(0x0203, "application/vnd.uplanet.alert-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0204, "application/vnd.uplanet.list-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0205, "application/vnd.uplanet.listcmd-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0206, "application/vnd.uplanet.channel-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0207, "application/vnd.uplanet.provisioning-status-uri");
        WELL_KNOWN_MIME_TYPES.put(0x0208, "x-wap.multipart/vnd.uplanet.header-set");
        WELL_KNOWN_MIME_TYPES.put(0x0209, "application/vnd.uplanet.bearer-choice-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x020A, "application/vnd.phonecom.mmc-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x020B, "application/vnd.nokia.syncset+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x020C, "image/x-up-wpng");
        WELL_KNOWN_MIME_TYPES.put(0x0300, "application/iota.mmc-wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0301, "application/iota.mmc-xml");
        WELL_KNOWN_MIME_TYPES.put(0x0302, "application/vnd.syncml+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0303, "application/vnd.syncml+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0304, "text/vnd.wap.emn+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0305, "text/calendar");
        WELL_KNOWN_MIME_TYPES.put(0x0306, "application/vnd.omads-email+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0307, "application/vnd.omads-file+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0308, "application/vnd.omads-folder+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0309, "text/directory;profile=vCard");
        WELL_KNOWN_MIME_TYPES.put(0x030A, "application/vnd.wap.emn+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x030B, "application/vnd.nokia.ipdc-purchase-response");
        WELL_KNOWN_MIME_TYPES.put(0x030C, "application/vnd.motorola.screen3+xml");
        WELL_KNOWN_MIME_TYPES.put(0x030D, "application/vnd.motorola.screen3+gzip");
        WELL_KNOWN_MIME_TYPES.put(0x030E, "application/vnd.cmcc.setting+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x030F, "application/vnd.cmcc.bombing+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0310, "application/vnd.docomo.pf");
        WELL_KNOWN_MIME_TYPES.put(0x0311, "application/vnd.docomo.ub");
        WELL_KNOWN_MIME_TYPES.put(0x0312, "application/vnd.omaloc-supl-init");
        WELL_KNOWN_MIME_TYPES.put(0x0313, "application/vnd.oma.group-usage-list+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0314, "application/oma-directory+xml");
        WELL_KNOWN_MIME_TYPES.put(0x0315, "application/vnd.docomo.pf2");
        WELL_KNOWN_MIME_TYPES.put(0x0316, "application/vnd.oma.drm.roap-trigger+wbxml");
        WELL_KNOWN_MIME_TYPES.put(0x0317, "application/vnd.sbm.mid2");
        WELL_KNOWN_MIME_TYPES.put(0x0318, "application/vnd.wmf.bootstrap");
        WELL_KNOWN_MIME_TYPES.put(0x0319, "application/vnc.cmcc.dcd+xml");
        WELL_KNOWN_MIME_TYPES.put(0x031A, "application/vnd.sbm.cid");
        WELL_KNOWN_MIME_TYPES.put(0x031B, "application/vnd.oma.bcast.provisioningtrigger");
        WELL_KNOWN_PARAMETERS.put(0x00, "Q");
        WELL_KNOWN_PARAMETERS.put(0x01, "Charset");
        WELL_KNOWN_PARAMETERS.put(0x02, "Level");
        WELL_KNOWN_PARAMETERS.put(0x03, "Type");
        WELL_KNOWN_PARAMETERS.put(0x07, "Differences");
        WELL_KNOWN_PARAMETERS.put(0x08, "Padding");
        WELL_KNOWN_PARAMETERS.put(0x09, "Type");
        WELL_KNOWN_PARAMETERS.put(0x0E, "Max-Age");
        WELL_KNOWN_PARAMETERS.put(0x10, "Secure");
        WELL_KNOWN_PARAMETERS.put(0x11, "SEC");
        WELL_KNOWN_PARAMETERS.put(0x12, "MAC");
        WELL_KNOWN_PARAMETERS.put(0x13, "Creation-date");
        WELL_KNOWN_PARAMETERS.put(0x14, "Modification-date");
        WELL_KNOWN_PARAMETERS.put(0x15, "Read-date");
        WELL_KNOWN_PARAMETERS.put(0x16, "Size");
        WELL_KNOWN_PARAMETERS.put(0x17, "Name");
        WELL_KNOWN_PARAMETERS.put(0x18, "Filename");
        WELL_KNOWN_PARAMETERS.put(0x19, "Start");
        WELL_KNOWN_PARAMETERS.put(0x1A, "Start-info");
        WELL_KNOWN_PARAMETERS.put(0x1B, "Comment");
        WELL_KNOWN_PARAMETERS.put(0x1C, "Domain");
        WELL_KNOWN_PARAMETERS.put(0x1D, "Path");
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.828 -0400", hash_original_field = "59B3B5B7A655E77C4FD204F6827F65C8", hash_generated_field = "14E991E823DE7ACB83EEE5DC7F027D18")

    public static final String CONTENT_TYPE_B_PUSH_CO = "application/vnd.wap.coc";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.829 -0400", hash_original_field = "F97FC57303985A9ABF27BBC06719A8C2", hash_generated_field = "5F0B8A7CFD7D9E331890C88C73AA57E8")

    public static final String CONTENT_TYPE_B_MMS = "application/vnd.wap.mms-message";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:16.829 -0400", hash_original_field = "B25CCEE30EB601FE8F066D50875C2297", hash_generated_field = "C046414E5CAA77A1305073B53831F037")

    public static final String CONTENT_TYPE_B_PUSH_SYNCML_NOTI = "application/vnd.syncml.notification";
}

