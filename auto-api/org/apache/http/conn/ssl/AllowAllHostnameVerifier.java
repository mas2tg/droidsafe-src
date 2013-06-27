package org.apache.http.conn.ssl;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class AllowAllHostnameVerifier extends AbstractVerifier {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.551 -0400", hash_original_method = "0CAE1F760C1CA01C015DCB961B7341AF", hash_generated_method = "0CAE1F760C1CA01C015DCB961B7341AF")
    public AllowAllHostnameVerifier ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.552 -0400", hash_original_method = "F0A4B9BAEEEE63400ECBAAB6ED04E07E", hash_generated_method = "15A9DAC73CF85EC760ED3C26069B0670")
    public final void verify(
            final String host, 
            final String[] cns,
            final String[] subjectAlts) {
        addTaint(host.getTaint());
        addTaint(cns[0].getTaint());
        addTaint(subjectAlts[0].getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.553 -0400", hash_original_method = "ED955C33EA6685325DA62D50910E36BE", hash_generated_method = "DA49E07ED642613DD7EDBC255EDF2F23")
    @Override
    public final String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_223416254 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_223416254 = "ALLOW_ALL";
        varB4EAC82CA7396A68D541C85D26508E83_223416254.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_223416254;
        // ---------- Original Method ----------
        //return "ALLOW_ALL";
    }

    
}

