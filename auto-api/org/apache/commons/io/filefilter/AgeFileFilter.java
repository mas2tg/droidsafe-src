package org.apache.commons.io.filefilter;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.io.FileUtils;

public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.449 -0400", hash_original_field = "933FA3A069B4DCB4634512A74E88617C", hash_generated_field = "81965751CDEA420A369B1B538289676A")

    private long cutoff;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.449 -0400", hash_original_field = "C1127FDB5B826D258860ECFA22F41469", hash_generated_field = "576CD9DEAB435A89864055E3BE928DA3")

    private boolean acceptOlder;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.449 -0400", hash_original_method = "92F5494CF4D9D109324ADFB75FCABD0E", hash_generated_method = "3A57668500B30FD8DC061EF6DCF933FD")
    public  AgeFileFilter(long cutoff) {
        this(cutoff, true);
        addTaint(cutoff);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.450 -0400", hash_original_method = "831674657A405FDE7D8847FE1F919007", hash_generated_method = "F62F064C6905752E13E3501E4A42BDD0")
    public  AgeFileFilter(long cutoff, boolean acceptOlder) {
        this.acceptOlder = acceptOlder;
        this.cutoff = cutoff;
        // ---------- Original Method ----------
        //this.acceptOlder = acceptOlder;
        //this.cutoff = cutoff;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.450 -0400", hash_original_method = "D8BC969A867ECF7BB5F00F6D0F678B06", hash_generated_method = "1BE0FDEFF80A2769FB06B8EEFE403550")
    public  AgeFileFilter(Date cutoffDate) {
        this(cutoffDate, true);
        addTaint(cutoffDate.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.450 -0400", hash_original_method = "E5B19505EE022DF11F6B87B3BEA51BB3", hash_generated_method = "BED5BE38F4003F7DD9BCFEFA9CD22E3C")
    public  AgeFileFilter(Date cutoffDate, boolean acceptOlder) {
        this(cutoffDate.getTime(), acceptOlder);
        addTaint(cutoffDate.getTaint());
        addTaint(acceptOlder);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.460 -0400", hash_original_method = "FE76F52B20D2DBCABA13ACBB8614BB4C", hash_generated_method = "39F8BEF1941DBF89641C959D454E57A4")
    public  AgeFileFilter(File cutoffReference) {
        this(cutoffReference, true);
        addTaint(cutoffReference.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.466 -0400", hash_original_method = "FE81CA629F548A2360BBC608169A9827", hash_generated_method = "ADEA221336DDEB87553C68F6E3968C17")
    public  AgeFileFilter(File cutoffReference, boolean acceptOlder) {
        this(cutoffReference.lastModified(), acceptOlder);
        addTaint(cutoffReference.getTaint());
        addTaint(acceptOlder);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.466 -0400", hash_original_method = "C00DF150BD7A81B8538F88231B296818", hash_generated_method = "36F05CAE3B7E291FF647C54E6D5DC6D1")
    @Override
    public boolean accept(File file) {
        boolean newer;
        newer = FileUtils.isFileNewer(file, cutoff);
        addTaint(file.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_225463743 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_225463743;
        // ---------- Original Method ----------
        //boolean newer = FileUtils.isFileNewer(file, cutoff);
        //return acceptOlder ? !newer : newer;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.467 -0400", hash_original_method = "99B5BE3867B40B3085E3122FEC15BA27", hash_generated_method = "1FD826882EED2C0C45BCA667B99DDD47")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_23951218 = null; //Variable for return #1
        String condition;
        condition = "<=";
        condition = ">";
        varB4EAC82CA7396A68D541C85D26508E83_23951218 = super.toString() + "(" + condition + cutoff + ")";
        varB4EAC82CA7396A68D541C85D26508E83_23951218.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_23951218;
        // ---------- Original Method ----------
        //String condition = acceptOlder ? "<=" : ">";
        //return super.toString() + "(" + condition + cutoff + ")";
    }

    
}

