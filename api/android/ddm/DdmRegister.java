package android.ddm;

// Droidsafe Imports
import droidsafe.annotations.*;
import org.apache.harmony.dalvik.ddmc.DdmServer;

import android.util.Log;


public class DdmRegister {
    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:09.316 -0400", hash_original_method = "7B8C628EED4FBAEB3F2321039DB7D59A", hash_generated_method = "DF606A387D5DE4F2C61C8EFBABDB78F2")
    private  DdmRegister() {
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.BAN)
    public static void registerHandlers() {
        if (false)
            Log.v("ddm", "Registering DDM message handlers");
        DdmHandleHello.register();
        DdmHandleThread.register();
        DdmHandleHeap.register();
        DdmHandleNativeHeap.register();
        DdmHandleProfiling.register();
        DdmHandleExit.register();
        DdmServer.registrationComplete();
    }

    
}

