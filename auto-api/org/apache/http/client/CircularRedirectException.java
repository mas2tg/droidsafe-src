package org.apache.http.client;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class CircularRedirectException extends RedirectException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:13.846 -0400", hash_original_method = "3163E6492879DE65B32F21199BC78667", hash_generated_method = "8EC3C449331F2CBDF12BF47BD100F15B")
    public  CircularRedirectException() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:13.854 -0400", hash_original_method = "EFEABC4C711DA14ECED12A57E29FC504", hash_generated_method = "2CC69D2B535BF7167C1BB04FDCEDD128")
    public  CircularRedirectException(String message) {
        super(message);
        addTaint(message.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:13.857 -0400", hash_original_method = "6EF8346EA0EE517139281306D8FFC8B9", hash_generated_method = "E14ECCF642EF1195212047AA1D7C489F")
    public  CircularRedirectException(String message, Throwable cause) {
        super(message, cause);
        addTaint(message.getTaint());
        addTaint(cause.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:13.857 -0400", hash_original_field = "69973FD4352C6332399B09C2E5C1219F", hash_generated_field = "4A96C6245D4711C45FED00EAA6494553")

    private static long serialVersionUID = 6830063487001091803L;
}

