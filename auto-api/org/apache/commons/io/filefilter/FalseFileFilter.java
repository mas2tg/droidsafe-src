package org.apache.commons.io.filefilter;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.Serializable;

public class FalseFileFilter implements IOFileFilter, Serializable {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.570 -0400", hash_original_method = "FFD73B06BFF281953B16F54803697DC3", hash_generated_method = "7209813E30987E0B494305DE2B1132C6")
    protected  FalseFileFilter() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.571 -0400", hash_original_method = "DB29F58DE9255B6C1BC35903D533B6E7", hash_generated_method = "4F71B81440170DACF045FBF134B1E07E")
    public boolean accept(File file) {
        addTaint(file.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_241723060 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_241723060;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.571 -0400", hash_original_method = "7D8493348446C8D120E5A36A74BD3C3A", hash_generated_method = "827E96A17B5AF1E3558F2EA2C6F88CC1")
    public boolean accept(File dir, String name) {
        addTaint(dir.getTaint());
        addTaint(name.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_706643761 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_706643761;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.571 -0400", hash_original_field = "83D9BCCE8C09DE6EACC57425715EA842", hash_generated_field = "5B429CAA2ED34C884FCE3BCB14471E67")

    public static final IOFileFilter FALSE = new FalseFileFilter();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.571 -0400", hash_original_field = "A6323C00C9CB3A0030663D51A642C287", hash_generated_field = "BA754C3807B1DF45A15D05704684C2BC")

    public static final IOFileFilter INSTANCE = FALSE;
}

