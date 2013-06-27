package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class IllegalFormatPrecisionException extends IllegalFormatException {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:52.074 -0400", hash_original_field = "83878C91171338902E0FE0FB97A8C47A", hash_generated_field = "ABEFDFA766F5A06D36323240A3BFC77D")

    private int p;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:52.075 -0400", hash_original_method = "1F9B0D4B155F0DC19F08720A34E7C4BD", hash_generated_method = "13646296FDF6AF63AF33B67CE5FD65FA")
    public  IllegalFormatPrecisionException(int p) {
        this.p = p;
        // ---------- Original Method ----------
        //this.p = p;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:52.075 -0400", hash_original_method = "B9EA1DC143DCBA676654F6DE1FED4BDB", hash_generated_method = "E2398BB2097B1204AE3FC1310F1398C8")
    public int getPrecision() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_446363537 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_446363537;
        // ---------- Original Method ----------
        //return p;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:52.075 -0400", hash_original_method = "5619344DED486463EA63A3A2966EBEEE", hash_generated_method = "91CB04312A1384339F5F8F2C1423F8DA")
    @Override
    public String getMessage() {
        String varB4EAC82CA7396A68D541C85D26508E83_915214788 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_915214788 = Integer.toString(p);
        varB4EAC82CA7396A68D541C85D26508E83_915214788.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_915214788;
        // ---------- Original Method ----------
        //return Integer.toString(p);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:52.075 -0400", hash_original_field = "0F91C51332FA8F91A58DAD1F2729090F", hash_generated_field = "CB09771BB2C97892E9B32EA27B33B7F5")

    private static long serialVersionUID = 18711008L;
}

