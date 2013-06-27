package com.android.internal.telephony;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class ATParseEx extends RuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:12.977 -0400", hash_original_method = "F1F3845C26D0582188BC2F6275397113", hash_generated_method = "7AB30A637E4F0CAF99CB86D5CB1C62DA")
    public  ATParseEx() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:12.978 -0400", hash_original_method = "A4FE2FA4458A54BB360DFC853573FC1A", hash_generated_method = "BF30A9AE1F73E4BD305CEDD9A044A8E8")
    public  ATParseEx(String s) {
        super(s);
        addTaint(s.getTaint());
        // ---------- Original Method ----------
    }

    
}

