package java.lang;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class ClassCastException extends RuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:40.164 -0400", hash_original_method = "54A88184B9052FBFDEDAE165A6A4F85C", hash_generated_method = "BCB3275847821F22276E01938C0B7F6E")
    public  ClassCastException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:40.164 -0400", hash_original_method = "9AC0043646A15326C62DB46FBF4E3D5F", hash_generated_method = "9FD3FE8C12D0E4FBA0110BE3D15D9556")
    public  ClassCastException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:40.165 -0400", hash_original_field = "00346CAE463660FD5A9B2B5B29621F56", hash_generated_field = "BFF60E64FF0FDD89AA9AA78BE493D9DD")

    private static long serialVersionUID = -9223365651070458532L;
}

