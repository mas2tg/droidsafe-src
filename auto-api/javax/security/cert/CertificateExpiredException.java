package javax.security.cert;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class CertificateExpiredException extends CertificateException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:00.828 -0400", hash_original_method = "695ACDE1E8C2F900ABF7FF7E73A29503", hash_generated_method = "3E035F91FD1EAB99F6CA5B96A6EC5AFC")
    public  CertificateExpiredException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:00.828 -0400", hash_original_method = "308175145F4FC5BAB795337D4AA9A477", hash_generated_method = "A30B860C6CB55FC6EAE15A8B4C39A0E5")
    public  CertificateExpiredException() {
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:00.828 -0400", hash_original_field = "BDEF10718894A49884ACD6D2914B5333", hash_generated_field = "F71A58AE4C31953625C0B4A898B8C40B")

    private static long serialVersionUID = 5091601212177261883L;
}

