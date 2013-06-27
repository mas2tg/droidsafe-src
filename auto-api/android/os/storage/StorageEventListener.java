package android.os.storage;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public abstract class StorageEventListener {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.640 -0400", hash_original_method = "61076BC963620255AB850D9EEFFDEDA8", hash_generated_method = "61076BC963620255AB850D9EEFFDEDA8")
    public StorageEventListener ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.640 -0400", hash_original_method = "08B6588D85EC619CC2E0611C0812F3DA", hash_generated_method = "F3FE4A7A33440C9CE86D85B6EE7F350A")
    public void onUsbMassStorageConnectionChanged(boolean connected) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(connected);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.641 -0400", hash_original_method = "B80645FD27258B59A3B650E166B00E17", hash_generated_method = "DBEC1BEF2CD81F9ED8ED13FEB77B477B")
    public void onStorageStateChanged(String path, String oldState, String newState) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(path.getTaint());
        addTaint(oldState.getTaint());
        addTaint(newState.getTaint());
        // ---------- Original Method ----------
    }

    
}

