package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import javax.sip.InvalidArgumentException;
import javax.sip.header.SubscriptionStateHeader;
import java.text.ParseException;

public class SubscriptionState extends ParametersHeader implements SubscriptionStateHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.597 -0400", hash_original_field = "09BCB72D61C0D6D1EFF5336DA6881557", hash_generated_field = "E191433B1529B42724890251971016B1")

    protected int expires;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.597 -0400", hash_original_field = "73F101AD6AE954650F0124A90428047A", hash_generated_field = "BD8E0AD83785DE0B9BF49A5DC728A1DF")

    protected int retryAfter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.597 -0400", hash_original_field = "61CEA79444A662B19E9019F051E57D37", hash_generated_field = "C30D27B07549FD0A64778D166C0E4BE6")

    protected String reasonCode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.597 -0400", hash_original_field = "9ED39E2EA931586B6A985A6942EF573E", hash_generated_field = "A196649679D02C3121333ABA58C9AA8D")

    protected String state;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.598 -0400", hash_original_method = "2AE8767260EE49A022E5D260FFA8A02D", hash_generated_method = "F9D33CC11D1A46D0CF22E4B318D53B6E")
    public  SubscriptionState() {
        super(SIPHeaderNames.SUBSCRIPTION_STATE);
        expires = -1;
        retryAfter = -1;
        // ---------- Original Method ----------
        //expires = -1;
        //retryAfter = -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.599 -0400", hash_original_method = "7314EC394325F26B79C36E58D3FDBB1D", hash_generated_method = "04B3D36CD6A186F86D0A373699E43FBD")
    public void setExpires(int expires) throws InvalidArgumentException {
        if (DroidSafeAndroidRuntime.control) throw new InvalidArgumentException(
                "JAIN-SIP "
                    + "Exception, SubscriptionState, setExpires(), the expires parameter is  < 0");
        this.expires = expires;
        // ---------- Original Method ----------
        //if (expires < 0)
            //throw new InvalidArgumentException(
                //"JAIN-SIP "
                    //+ "Exception, SubscriptionState, setExpires(), the expires parameter is  < 0");
        //this.expires = expires;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.599 -0400", hash_original_method = "47881175D7C463BCCB25030D767AD658", hash_generated_method = "F642447458F7A6697DD7B25F5F597998")
    public int getExpires() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1775208659 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1775208659;
        // ---------- Original Method ----------
        //return expires;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.599 -0400", hash_original_method = "50CA09FDB5676EA1DD99646C83E4C5FC", hash_generated_method = "70C5E2BA0EE72EEFA5CC537E9C6E84D2")
    public void setRetryAfter(int retryAfter) throws InvalidArgumentException {
        if (DroidSafeAndroidRuntime.control) throw new InvalidArgumentException(
                "JAIN-SIP "
                    + "Exception, SubscriptionState, setRetryAfter(), the retryAfter parameter is <=0");
        this.retryAfter = retryAfter;
        // ---------- Original Method ----------
        //if (retryAfter <= 0)
            //throw new InvalidArgumentException(
                //"JAIN-SIP "
                    //+ "Exception, SubscriptionState, setRetryAfter(), the retryAfter parameter is <=0");
        //this.retryAfter = retryAfter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.600 -0400", hash_original_method = "8B40198517FC200CD43F6E0235CB55DB", hash_generated_method = "30B86663952FB95ED1A9031C5E19115A")
    public int getRetryAfter() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_788627266 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_788627266;
        // ---------- Original Method ----------
        //return retryAfter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.600 -0400", hash_original_method = "307A7F7469164C10B67FE98D6B3BB448", hash_generated_method = "64010CB94BA22A8E0FE97662C710FC9F")
    public String getReasonCode() {
        String varB4EAC82CA7396A68D541C85D26508E83_1400125616 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1400125616 = reasonCode;
        varB4EAC82CA7396A68D541C85D26508E83_1400125616.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1400125616;
        // ---------- Original Method ----------
        //return reasonCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.612 -0400", hash_original_method = "F3FEA6AFF4A02AB2AF0C89DB66C639D9", hash_generated_method = "682E434ED757BE8D60AE77B64ECAE917")
    public void setReasonCode(String reasonCode) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException(
                "JAIN-SIP "
                    + "Exception, SubscriptionState, setReasonCode(), the reasonCode parameter is null");
        this.reasonCode = reasonCode;
        // ---------- Original Method ----------
        //if (reasonCode == null)
            //throw new NullPointerException(
                //"JAIN-SIP "
                    //+ "Exception, SubscriptionState, setReasonCode(), the reasonCode parameter is null");
        //this.reasonCode = reasonCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.613 -0400", hash_original_method = "B507B0FDA436CA05802CD34EFC971C76", hash_generated_method = "B43BE84186491082C19F38321A864E7A")
    public String getState() {
        String varB4EAC82CA7396A68D541C85D26508E83_736136392 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_736136392 = state;
        varB4EAC82CA7396A68D541C85D26508E83_736136392.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_736136392;
        // ---------- Original Method ----------
        //return state;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.613 -0400", hash_original_method = "26B14BBE6685B3C70475DE487DDF5C68", hash_generated_method = "30FA1BA2B9F0FC04EB89C93708198A66")
    public void setState(String state) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException(
                "JAIN-SIP "
                    + "Exception, SubscriptionState, setState(), the state parameter is null");
        this.state = state;
        // ---------- Original Method ----------
        //if (state == null)
            //throw new NullPointerException(
                //"JAIN-SIP "
                    //+ "Exception, SubscriptionState, setState(), the state parameter is null");
        //this.state = state;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.614 -0400", hash_original_method = "E7A2FB4AC135D29D78CE09D5448C290F", hash_generated_method = "EA6E8F71E7AD52E22C7E1D07C69E1EC6")
    public String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_692384681 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_692384681 = encodeBody(new StringBuffer()).toString();
        varB4EAC82CA7396A68D541C85D26508E83_692384681.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_692384681;
        // ---------- Original Method ----------
        //return encodeBody(new StringBuffer()).toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.614 -0400", hash_original_method = "612E9F6C82A7EBFF3AE59409AADEC810", hash_generated_method = "4AFA1883A70CADDB8E3F156156ADB1BD")
    protected StringBuffer encodeBody(StringBuffer buffer) {
        StringBuffer varB4EAC82CA7396A68D541C85D26508E83_559747098 = null; //Variable for return #1
        buffer.append(state);
        buffer.append(";reason=").append(reasonCode);
        buffer.append(";expires=").append(expires);
        buffer.append(";retry-after=").append(retryAfter);
        {
            boolean varB381AD842454BDB2397F4C2DAD0B3FA1_1599697207 = (!parameters.isEmpty());
            {
                buffer.append(SEMICOLON);
                parameters.encode(buffer);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_559747098 = buffer;
        addTaint(buffer.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_559747098.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_559747098;
        // ---------- Original Method ----------
        //if (state != null)
            //buffer.append(state);
        //if (reasonCode != null)
            //buffer.append(";reason=").append(reasonCode);
        //if (expires != -1)
            //buffer.append(";expires=").append(expires);
        //if (retryAfter != -1)
            //buffer.append(";retry-after=").append(retryAfter);
        //if (!parameters.isEmpty()) {
            //buffer.append(SEMICOLON);
            //parameters.encode(buffer);
        //}
        //return buffer;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.627 -0400", hash_original_field = "9AA02F1D57D39BF5963615FDF8A802FA", hash_generated_field = "B4108C5CA1A0F2E06863C7790C21B4FE")

    private static long serialVersionUID = -6673833053927258745L;
}

