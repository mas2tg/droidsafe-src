package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class ProtocolException extends java.io.IOException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.630 -0400", hash_original_method = "F33E95B361A636BB80AA643BEE16494D", hash_generated_method = "E9DEBF640D79AE700FB76DD1B00C9C48")
    public  ProtocolException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.630 -0400", hash_original_method = "8A7B1748C796BD03C7089BCC55139778", hash_generated_method = "8CC4C616FF643B0D0AA5D9A66BC2BFAD")
    public  ProtocolException(String detailMessage) {
        super(detailMessage);
        addTaint(detailMessage.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.631 -0400", hash_original_method = "8A280093AAE5F90F3CD44950672A326E", hash_generated_method = "23510BB99DD55D140668FB13DEB2CB3B")
    public  ProtocolException(String detailMessage, Throwable cause) {
        super(detailMessage, cause);
        addTaint(detailMessage.getTaint());
        addTaint(cause.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.631 -0400", hash_original_field = "EF597D0A71D077B57161E2A20B14AF7C", hash_generated_field = "5D6F76E12565FA8B6F39A520203745F1")

    private static long serialVersionUID = -6098449442062388080L;
}

