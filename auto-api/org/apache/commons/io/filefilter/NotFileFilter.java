package org.apache.commons.io.filefilter;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.Serializable;

public class NotFileFilter extends AbstractFileFilter implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.635 -0400", hash_original_field = "B2C97AE425DD751B0E48A3ACAE79CF4A", hash_generated_field = "52033831AA90808CFA0612D7E68F3072")

    private IOFileFilter filter;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.637 -0400", hash_original_method = "04147093F1D1C98977C291FCABD47396", hash_generated_method = "85B019E6DF3088463879CD7DAEBFF200")
    public  NotFileFilter(IOFileFilter filter) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("The filter must not be null");
        } //End block
        this.filter = filter;
        // ---------- Original Method ----------
        //if (filter == null) {
            //throw new IllegalArgumentException("The filter must not be null");
        //}
        //this.filter = filter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.637 -0400", hash_original_method = "B4759F01CF5E4CDF4AA4061B5D979652", hash_generated_method = "D92F1AD9F13240E090529CDCAF680330")
    @Override
    public boolean accept(File file) {
        boolean var80D9FD0923D43FFBF468F0752630EE80_1841507176 = (! filter.accept(file));
        addTaint(file.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1684028899 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1684028899;
        // ---------- Original Method ----------
        //return ! filter.accept(file);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.649 -0400", hash_original_method = "B0A127C96A64726487AA51E16A0E3CC5", hash_generated_method = "0BC333C4AD4AE2998FAC8CDBC71FAE5A")
    @Override
    public boolean accept(File file, String name) {
        boolean var6F09DE2E60A0CA42F51700E9824CECB6_1404226378 = (! filter.accept(file, name));
        addTaint(file.getTaint());
        addTaint(name.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1986334318 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1986334318;
        // ---------- Original Method ----------
        //return ! filter.accept(file, name);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.650 -0400", hash_original_method = "0F98CEE5769F2D254ED7C2ED79018DD6", hash_generated_method = "93DBDE5F44F257CB5A653D7949392A3B")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1243176399 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1243176399 = super.toString() + "(" + filter.toString()  + ")";
        varB4EAC82CA7396A68D541C85D26508E83_1243176399.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1243176399;
        // ---------- Original Method ----------
        //return super.toString() + "(" + filter.toString()  + ")";
    }

    
}

