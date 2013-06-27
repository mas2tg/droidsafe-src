package java.lang;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class IllegalThreadStateException extends IllegalArgumentException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:40.590 -0400", hash_original_method = "5791A934E1D6D40F1C86D615B455C03B", hash_generated_method = "298A639F0F6CE69715D3CB67F1B0216A")
    public  IllegalThreadStateException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:40.590 -0400", hash_original_method = "3CBEBFECA4223415F4314CC0B87A4ECE", hash_generated_method = "F3A1A13066998D97467C5D3E334EAAF1")
    public  IllegalThreadStateException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:40.590 -0400", hash_original_field = "79084BBDA638CDAE70E8BD007B3FACD0", hash_generated_field = "7191AD233E6587D75CB0AC278F62202E")

    private static long serialVersionUID = -7626246362397460174L;
}

