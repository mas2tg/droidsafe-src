package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.nio.ByteOrder;
import java.nio.charset.Charsets;
import libcore.io.Memory;

class Socks4Message {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.045 -0400", hash_original_field = "7F2DB423A49B305459147332FB01CF87", hash_generated_field = "FBA3E90E1AEF84B9DE40F7F93AE8B84B")

    protected byte[] buffer;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.052 -0400", hash_original_method = "B36A7D8FEC73E76C782613C0576445D4", hash_generated_method = "E9318A5E21073D72E3A92D6D1199A0E3")
    public  Socks4Message() {
        buffer = new byte[BUFFER_LENGTH];
        setVersionNumber(SOCKS_VERSION);
        // ---------- Original Method ----------
        //buffer = new byte[BUFFER_LENGTH];
        //setVersionNumber(SOCKS_VERSION);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.053 -0400", hash_original_method = "A4884809092D405A6CA5F6BEFDF8445C", hash_generated_method = "FB43D1702B6A874C2A996FCAAA5F03CB")
    public int getCommandOrResult() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1915300585 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1915300585;
        // ---------- Original Method ----------
        //return buffer[INDEX_COMMAND];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.069 -0400", hash_original_method = "338C1B26BFB9D7C284F2A4F94981D480", hash_generated_method = "AB61003D3B9ED48A84B27CC2A1E7703D")
    public void setCommandOrResult(int command) {
        buffer[INDEX_COMMAND] = (byte) command;
        // ---------- Original Method ----------
        //buffer[INDEX_COMMAND] = (byte) command;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.069 -0400", hash_original_method = "469B36103954E60DA4EDBA1638A3DCA3", hash_generated_method = "9A90993DB5813BF6E66300A31AAE16ED")
    public int getPort() {
        int var2D60307C5C559F9592EBA8A328E67694_1211516364 = (Memory.peekShort(buffer, INDEX_PORT, ByteOrder.BIG_ENDIAN));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1560961365 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1560961365;
        // ---------- Original Method ----------
        //return Memory.peekShort(buffer, INDEX_PORT, ByteOrder.BIG_ENDIAN);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.070 -0400", hash_original_method = "5ADD361358F9B7D845CC4C6A0E6C787A", hash_generated_method = "9AD1FF693458559CFC800800756739BC")
    public void setPort(int port) {
        Memory.pokeShort(buffer, INDEX_PORT, (short) port, ByteOrder.BIG_ENDIAN);
        addTaint(port);
        // ---------- Original Method ----------
        //Memory.pokeShort(buffer, INDEX_PORT, (short) port, ByteOrder.BIG_ENDIAN);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.070 -0400", hash_original_method = "2791CEFF5B7A34F564852C42E861A745", hash_generated_method = "0B10448C573E3AD72319B197523EF099")
    public int getIP() {
        int var7EFF0BFE855A0CE7874E2EB46E97D71E_1437655304 = (Memory.peekInt(buffer, INDEX_IP, ByteOrder.BIG_ENDIAN));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1715816124 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1715816124;
        // ---------- Original Method ----------
        //return Memory.peekInt(buffer, INDEX_IP, ByteOrder.BIG_ENDIAN);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.078 -0400", hash_original_method = "CD63C26544B74E77AC58BA3597D39036", hash_generated_method = "5BCA823E0F4C72375C8EB1DA49BCFC44")
    public void setIP(byte[] ip) {
        buffer[INDEX_IP] = ip[0];
        buffer[INDEX_IP + 1] = ip[1];
        buffer[INDEX_IP + 2] = ip[2];
        buffer[INDEX_IP + 3] = ip[3];
        // ---------- Original Method ----------
        //buffer[INDEX_IP] = ip[0];
        //buffer[INDEX_IP + 1] = ip[1];
        //buffer[INDEX_IP + 2] = ip[2];
        //buffer[INDEX_IP + 3] = ip[3];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.079 -0400", hash_original_method = "6684A79AEF4191DE9F243F196998CD91", hash_generated_method = "40B4B3BA9B9850D7E12DB6EF4D892692")
    public String getUserId() {
        String varB4EAC82CA7396A68D541C85D26508E83_238965242 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_238965242 = getString(INDEX_USER_ID, MAX_USER_ID_LENGTH);
        varB4EAC82CA7396A68D541C85D26508E83_238965242.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_238965242;
        // ---------- Original Method ----------
        //return getString(INDEX_USER_ID, MAX_USER_ID_LENGTH);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.079 -0400", hash_original_method = "D89FFAAC0CE83481287E79A931367547", hash_generated_method = "7D377ADCB054D16F4AB91FF39E167CB2")
    public void setUserId(String id) {
        setString(INDEX_USER_ID, MAX_USER_ID_LENGTH, id);
        addTaint(id.getTaint());
        // ---------- Original Method ----------
        //setString(INDEX_USER_ID, MAX_USER_ID_LENGTH, id);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.093 -0400", hash_original_method = "614A9A2B6D9145E41E65A77CC642278E", hash_generated_method = "7CC09AC8DE5993730BFB1F75EB47867E")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1940281229 = null; //Variable for return #1
        StringBuilder buf;
        buf = new StringBuilder(50);
        buf.append("Version: ");
        buf.append(Integer.toHexString(getVersionNumber()));
        buf.append(" Command: ");
        buf.append(Integer.toHexString(getCommandOrResult()));
        buf.append(" Port: ");
        buf.append(getPort());
        buf.append(" IP: ");
        buf.append(Integer.toHexString(getIP()));
        buf.append(" User ID: ");
        buf.append(getUserId());
        varB4EAC82CA7396A68D541C85D26508E83_1940281229 = buf.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1940281229.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1940281229;
        // ---------- Original Method ----------
        //StringBuilder buf = new StringBuilder(50);
        //buf.append("Version: ");
        //buf.append(Integer.toHexString(getVersionNumber()));
        //buf.append(" Command: ");
        //buf.append(Integer.toHexString(getCommandOrResult()));
        //buf.append(" Port: ");
        //buf.append(getPort());
        //buf.append(" IP: ");
        //buf.append(Integer.toHexString(getIP()));
        //buf.append(" User ID: ");
        //buf.append(getUserId());
        //return buf.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.093 -0400", hash_original_method = "C6D8DA97966902AB2F65AB6185B0BF06", hash_generated_method = "C4C48962BCF0697C35DBD19797E9F8B7")
    public int getLength() {
        int index;
        index = 0;
        {
            index = INDEX_USER_ID;
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1982153724 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1982153724;
        // ---------- Original Method ----------
        //int index = 0;
        //for (index = INDEX_USER_ID; buffer[index] != 0; index++) {
        //}
        //index++;
        //return index;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.094 -0400", hash_original_method = "B4F98C9F9790743D28172709107A8C07", hash_generated_method = "26A39028B7C7EC603500B02C9FF0AF2C")
    public String getErrorString(int error) {
        String varB4EAC82CA7396A68D541C85D26508E83_360665783 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_789791008 = null; //Variable for return #2
        String varB4EAC82CA7396A68D541C85D26508E83_1510041615 = null; //Variable for return #3
        String varB4EAC82CA7396A68D541C85D26508E83_1365327520 = null; //Variable for return #4
        //Begin case RETURN_FAILURE 
        varB4EAC82CA7396A68D541C85D26508E83_360665783 = "Failure to connect to SOCKS server";
        //End case RETURN_FAILURE 
        //Begin case RETURN_CANNOT_CONNECT_TO_IDENTD 
        varB4EAC82CA7396A68D541C85D26508E83_789791008 = "Unable to connect to identd to verify user";
        //End case RETURN_CANNOT_CONNECT_TO_IDENTD 
        //Begin case RETURN_DIFFERENT_USER_IDS 
        varB4EAC82CA7396A68D541C85D26508E83_1510041615 = "Failure - user ids do not match";
        //End case RETURN_DIFFERENT_USER_IDS 
        //Begin case default 
        varB4EAC82CA7396A68D541C85D26508E83_1365327520 = "Success";
        //End case default 
        addTaint(error);
        String varA7E53CE21691AB073D9660D615818899_1670612462; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1670612462 = varB4EAC82CA7396A68D541C85D26508E83_360665783;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1670612462 = varB4EAC82CA7396A68D541C85D26508E83_789791008;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1670612462 = varB4EAC82CA7396A68D541C85D26508E83_1510041615;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1670612462 = varB4EAC82CA7396A68D541C85D26508E83_1365327520;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1670612462.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1670612462;
        // ---------- Original Method ----------
        //switch (error) {
        //case RETURN_FAILURE:
            //return "Failure to connect to SOCKS server";
        //case RETURN_CANNOT_CONNECT_TO_IDENTD:
            //return "Unable to connect to identd to verify user";
        //case RETURN_DIFFERENT_USER_IDS:
            //return "Failure - user ids do not match";
        //default:
            //return "Success";
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.101 -0400", hash_original_method = "3E8202366775B7F03BFD8ECC0DED5E39", hash_generated_method = "30A5592320969E0C6BF88261E4306B00")
    public byte[] getBytes() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_237582024 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_237582024;
        // ---------- Original Method ----------
        //return buffer;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.103 -0400", hash_original_method = "B2CC94DDACEA4538F2C9BF58B190DB1B", hash_generated_method = "8FFFA50BE222DCDA22DFB17E7EC58591")
    private String getString(int offset, int maxLength) {
        String varB4EAC82CA7396A68D541C85D26508E83_176787767 = null; //Variable for return #1
        int index;
        index = offset;
        int lastIndex;
        lastIndex = index + maxLength;
        varB4EAC82CA7396A68D541C85D26508E83_176787767 = new String(buffer, offset, index - offset, Charsets.ISO_8859_1);
        addTaint(offset);
        addTaint(maxLength);
        varB4EAC82CA7396A68D541C85D26508E83_176787767.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_176787767;
        // ---------- Original Method ----------
        //int index = offset;
        //int lastIndex = index + maxLength;
        //while (index < lastIndex && (buffer[index] != 0)) {
            //index++;
        //}
        //return new String(buffer, offset, index - offset, Charsets.ISO_8859_1);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.103 -0400", hash_original_method = "7A63CD666B1834D5EA2D981ACB832F0E", hash_generated_method = "6D26E70C8B582EBD2536BFF1AA36EFA8")
    private int getVersionNumber() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1411161456 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1411161456;
        // ---------- Original Method ----------
        //return buffer[INDEX_VERSION];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.106 -0400", hash_original_method = "9E3EFE7D6597C76393DFD5F31266B92C", hash_generated_method = "1537606C933AAC35FCB0D2AB5A1AEABE")
    private void setString(int offset, int maxLength, String theString) {
        byte[] stringBytes;
        stringBytes = theString.getBytes(Charsets.ISO_8859_1);
        int length;
        length = Math.min(stringBytes.length, maxLength);
        System.arraycopy(stringBytes, 0, buffer, offset, length);
        buffer[offset + length] = 0;
        addTaint(maxLength);
        addTaint(theString.getTaint());
        // ---------- Original Method ----------
        //byte[] stringBytes = theString.getBytes(Charsets.ISO_8859_1);
        //int length = Math.min(stringBytes.length, maxLength);
        //System.arraycopy(stringBytes, 0, buffer, offset, length);
        //buffer[offset + length] = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.106 -0400", hash_original_method = "551CE4AE0E4E79E50F85783B3E28117C", hash_generated_method = "057034333245897DECAF09231E016CBC")
    private void setVersionNumber(int number) {
        buffer[INDEX_VERSION] = (byte) number;
        // ---------- Original Method ----------
        //buffer[INDEX_VERSION] = (byte) number;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.107 -0400", hash_original_field = "C5FF2770841EEFCE383E8EE6D75273FB", hash_generated_field = "803A36E24E12C85351F99443E8F10665")

    static int COMMAND_CONNECT = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.110 -0400", hash_original_field = "32DC8996110ACF18979D71096383FA9F", hash_generated_field = "509291D30AED6CDE8911643D62357E01")

    static int COMMAND_BIND = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.110 -0400", hash_original_field = "8C7BC1007E9ED4B2A45191FE9478145A", hash_generated_field = "E92762FFC6EDC526C2682473F2CF618C")

    static int RETURN_SUCCESS = 90;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.110 -0400", hash_original_field = "976D83FFC7094BBBC0BAE39D5A724887", hash_generated_field = "7A97411819A530E2CC33A79EC7241F83")

    static int RETURN_FAILURE = 91;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "4BF7DEB35C53E0B7B8879D07FA14F9D2", hash_generated_field = "132D662761654A8E6C186C394AAA0664")

    static int RETURN_CANNOT_CONNECT_TO_IDENTD = 92;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "33B1F35A25E7E4E0499C35CC8CF2F190", hash_generated_field = "380BE29D8622B446E9C628600C662243")

    static int RETURN_DIFFERENT_USER_IDS = 93;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "C4FFC497CF61DD83262469DCBF203A42", hash_generated_field = "BC2C4ACE81AA4C56A325AB3CD401BE84")

    static int REPLY_LENGTH = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "7D799A1EE30E6BD5FB068A4052A15310", hash_generated_field = "F0E5C945DC6CA94C5CEA3A028E9189A6")

    static int INDEX_VERSION = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "9EA229E82ADA2E6B224072D7E0BEAB52", hash_generated_field = "4B2C914AFB4521973BFA574620683508")

    private static int SOCKS_VERSION = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "A7ADFC25BE50E59A3A956A77C504CA4E", hash_generated_field = "076EB688A1E3DE83BE73D79AD607BF3E")

    private static int INDEX_COMMAND = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "91BD9959E9EC433EC243CF0BF3834242", hash_generated_field = "EC23C110761D7A399ECE517F52D37074")

    private static int INDEX_PORT = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "6E678873BC6A2265656702D1BBCB1D29", hash_generated_field = "82FA350006B73BF8DE1C3C8715CD7896")

    private static int INDEX_IP = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "31C4897737DEFEA6925C5A195156C7E8", hash_generated_field = "9DDC16B735B9B7790CCD877FD27347C0")

    private static int INDEX_USER_ID = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "9C50A15DCC2EF4E92AEADB144DF121E0", hash_generated_field = "B15D08685F38E9DF533FDF9AB82765C3")

    private static int BUFFER_LENGTH = 256;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:44.111 -0400", hash_original_field = "9434C63DCE6845E57773F13F4D1BB469", hash_generated_field = "131A8118B1EFFAFAA6975590C39EC328")

    private static int MAX_USER_ID_LENGTH = BUFFER_LENGTH - INDEX_USER_ID;
}

