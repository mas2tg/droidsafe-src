package org.apache.harmony.security.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public final class BitString {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.499 -0400", hash_original_field = "4B3A6218BB3E3A7303E8A171A60FCF92", hash_generated_field = "1395852C401E496F85701A0A9D82F003")

    public byte[] bytes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.500 -0400", hash_original_field = "0281DE09EFFCE9B1D9513C05E900A565", hash_generated_field = "21A6E7EB9F35414374A81AF4C0F0F758")

    public int unusedBits;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.511 -0400", hash_original_method = "4AD7912E7289EAB288F9F3EC6E0E1363", hash_generated_method = "2498849A18EE20D1E2226913F5744A78")
    public  BitString(byte[] bytes, int unusedBits) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Number of unused bits MUST be in range 0-7");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("For empty bit string unused bits MUST be 0");
        } //End block
        this.bytes = bytes;
        this.unusedBits = unusedBits;
        // ---------- Original Method ----------
        //if (unusedBits < 0 || unusedBits > 7) {
            //throw new IllegalArgumentException("Number of unused bits MUST be in range 0-7");
        //}
        //if (bytes.length == 0 && unusedBits != 0) {
            //throw new IllegalArgumentException("For empty bit string unused bits MUST be 0");
        //}
        //this.bytes = bytes;
        //this.unusedBits = unusedBits;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.512 -0400", hash_original_method = "8BDC421B437B146AA72D15C02ACDA1CF", hash_generated_method = "B4801D4F5A2FA7D5606434C5C485EE78")
    public  BitString(boolean[] values) {
        unusedBits = values.length % 8;
        int size;
        size = values.length / 8;
        bytes = new byte[size];
        {
            int i;
            i = 0;
            {
                setBit(i, values[i]);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //unusedBits = values.length % 8;
        //int size = values.length / 8;
        //if (unusedBits != 0) {
            //size++;
        //}
        //bytes = new byte[size];
        //for (int i = 0; i < values.length; i++) {
            //setBit(i, values[i]);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.512 -0400", hash_original_method = "286435896BFB2C2EB12779836BDE2B3F", hash_generated_method = "CFC00434104E11B4EFE2CEF42F142053")
    public boolean getBit(int bit) {
        int offset;
        offset = bit % 8;
        int index;
        index = bit / 8;
        addTaint(bit);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1230031982 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1230031982;
        // ---------- Original Method ----------
        //int offset = bit % 8;
        //int index = bit / 8;
        //return (bytes[index] & SET_MASK[offset]) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.513 -0400", hash_original_method = "64B37589A76FCD4AF41D04B8A51CCBFB", hash_generated_method = "6553815B505796C73A8BCF54D43DCDF0")
    public void setBit(int bit, boolean value) {
        int offset;
        offset = bit % 8;
        int index;
        index = bit / 8;
        {
            bytes[index] |= SET_MASK[offset];
        } //End block
        {
            bytes[index] &= RESET_MASK[offset];
        } //End block
        addTaint(bit);
        addTaint(value);
        // ---------- Original Method ----------
        //int offset = bit % 8;
        //int index = bit / 8;
        //if (value) {
            //bytes[index] |= SET_MASK[offset];
        //} else {
            //bytes[index] &= RESET_MASK[offset];
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.567 -0400", hash_original_method = "6591A9422CBA64DB7D3ADDA84BA94652", hash_generated_method = "BBF12D5D679D8E56C8FE184481585F54")
    public boolean[] toBooleanArray() {
        boolean[] result;
        result = new boolean[bytes.length * 8 - unusedBits];
        {
            int i;
            i = 0;
            {
                result[i] = getBit(i);
            } //End block
        } //End collapsed parenthetic
        boolean[] var503EB2F420079C4024483971CE5EDEA8_1708937466 = {getTaintBoolean()};
        return var503EB2F420079C4024483971CE5EDEA8_1708937466;
        // ---------- Original Method ----------
        //boolean[] result = new boolean[bytes.length * 8 - unusedBits];
        //for (int i = 0; i < result.length; i++) {
            //result[i] = getBit(i);
        //}
        //return result;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.567 -0400", hash_original_field = "82B8116D8A84475E2750CC92DE9DE1EE", hash_generated_field = "2D37E40650DB98B909921D4684433CAA")

    private static byte[] SET_MASK = ;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.567 -0400", hash_original_field = "D7A1EDCFA63975E1CFA228C21847FC5C", hash_generated_field = "6BEA2655E69D37982F3BF765D9EF10F8")

    private static byte[] RESET_MASK = ;
}

