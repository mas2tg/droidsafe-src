package java.nio.charset;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class CoderMalfunctionError extends Error {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.689 -0400", hash_original_method = "883FFC59265DE3B21E7C8AE56E57641B", hash_generated_method = "2133BCAD975CC26F38D1A082BEC9E5A3")
    public  CoderMalfunctionError(Exception ex) {
        super(ex);
        addTaint(ex.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.690 -0400", hash_original_field = "1A335B9C4DBEB9C7F7E507913845A35B", hash_generated_field = "93DD298E37B9537D2AABE682CD928AE9")

    private static long serialVersionUID = -1151412348057794301L;
}

