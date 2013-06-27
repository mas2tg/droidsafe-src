package javax.security.cert;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class CertificateException extends Exception {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:00.815 -0400", hash_original_method = "B94F5C9247EB09D2A3B5F93CD6C3CCDF", hash_generated_method = "CA8DC42717F9257D4E33DE097DDBCEB4")
    public  CertificateException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:00.815 -0400", hash_original_method = "FF458EF7F95F357456B3AFD0871B002E", hash_generated_method = "A2AF1A669908D746BA2B02B73E8AC2C3")
    public  CertificateException() {
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:00.815 -0400", hash_original_field = "4DC836BAAA104EE1E3C74330D57726D5", hash_generated_field = "AEE3F45008D78D143538C50C83484C77")

    private static long serialVersionUID = -5757213374030785290L;
}

