package java.util;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;

public class ServiceConfigurationError extends Error {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:58:04.510 -0500", hash_original_field = "1451342603363B872DD5EDEC33F94158", hash_generated_field = "D00548B78989F717848473F1BA6889B7")

    private static final long serialVersionUID = 74132770414881L;

    /**
     * Constructs a new error with the given detail message.
     * @param message the detail message, or null
     */
    @DSComment("From safe class list")
    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:58:04.513 -0500", hash_original_method = "EBAE74DC80F9C6BC38A9630AD570AE77", hash_generated_method = "A44B995D98502C226FF53B0B869781E4")
    
public ServiceConfigurationError(String message) {
        super(message);
    }

    /**
     * Constructs a new error with the given detail message and cause.
     * @param message the detail message, or null
     * @param cause the cause, null
     */
    @DSComment("From safe class list")
    @DSSafe(DSCat.SAFE_LIST)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:58:04.516 -0500", hash_original_method = "29CC4F4897E024335846D9CA60D25833", hash_generated_method = "BDB68C5F14AD6DB4B86180F47B790D44")
    
public ServiceConfigurationError(String message, Throwable cause) {
        super(message, cause);
    }
}

