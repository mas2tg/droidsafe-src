package org.apache.http.impl.conn.tsccm;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.Date;
import java.util.concurrent.locks.Condition;

public class WaitingThread {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.058 -0400", hash_original_field = "26542FB18A8B14C9775AA475F23C909F", hash_generated_field = "E7E85605CD9DCB175BB641FD2FDA33A7")

    private Condition cond;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.058 -0400", hash_original_field = "B10A8C0BEDE9EB4EA771B04DB3149F28", hash_generated_field = "E21679471610B2B7ED2D35D85B755050")

    private RouteSpecificPool pool;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.058 -0400", hash_original_field = "F64CFF138020A2060A9817272F563B3C", hash_generated_field = "33CCD5EB6905F134ACE39F8BADCDC158")

    private Thread waiter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.058 -0400", hash_original_field = "DFB7069BFC6E0064A6C667626ECA07B4", hash_generated_field = "7C8E769DDEE22768B70313CCC815CA01")

    private boolean aborted;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.059 -0400", hash_original_method = "4E0FEF0D8484D6DA3DA82AB98780B168", hash_generated_method = "22FBE09E57837ABC6A8A6163E2ED45B1")
    public  WaitingThread(Condition cond, RouteSpecificPool pool) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Condition must not be null.");
        } //End block
        this.cond = cond;
        this.pool = pool;
        // ---------- Original Method ----------
        //if (cond == null) {
            //throw new IllegalArgumentException("Condition must not be null.");
        //}
        //this.cond = cond;
        //this.pool = pool;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.062 -0400", hash_original_method = "06148A18B01DA630C8E9D1BE56535730", hash_generated_method = "895745DD713267856781E41D1190CA3B")
    public final Condition getCondition() {
        Condition varB4EAC82CA7396A68D541C85D26508E83_1390991770 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1390991770 = this.cond;
        varB4EAC82CA7396A68D541C85D26508E83_1390991770.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1390991770;
        // ---------- Original Method ----------
        //return this.cond;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.064 -0400", hash_original_method = "7ACEF95834A46E1067A2FCD807704A00", hash_generated_method = "8DEE479471771F5503016695323BC61D")
    public final RouteSpecificPool getPool() {
        RouteSpecificPool varB4EAC82CA7396A68D541C85D26508E83_652103776 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_652103776 = this.pool;
        varB4EAC82CA7396A68D541C85D26508E83_652103776.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_652103776;
        // ---------- Original Method ----------
        //return this.pool;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.065 -0400", hash_original_method = "71CC45999E743AA15F11389550D41BFD", hash_generated_method = "47AEC2742DE7C863731C0488D22661AC")
    public final Thread getThread() {
        Thread varB4EAC82CA7396A68D541C85D26508E83_1346496893 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1346496893 = this.waiter;
        varB4EAC82CA7396A68D541C85D26508E83_1346496893.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1346496893;
        // ---------- Original Method ----------
        //return this.waiter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.065 -0400", hash_original_method = "7B6DA174509B07DB7E171D838B6C3551", hash_generated_method = "5159F50CAC96DB760A84D184D4E87E11")
    public boolean await(Date deadline) throws InterruptedException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException
                ("A thread is already waiting on this object." +
                 "\ncaller: " + Thread.currentThread() +
                 "\nwaiter: " + this.waiter);
        } //End block
        if (DroidSafeAndroidRuntime.control) throw new InterruptedException("Operation interrupted");
        this.waiter = Thread.currentThread();
        boolean success;
        success = false;
        try 
        {
            {
                success = this.cond.awaitUntil(deadline);
            } //End block
            {
                this.cond.await();
                success = true;
            } //End block
            if (DroidSafeAndroidRuntime.control) throw new InterruptedException("Operation interrupted");
        } //End block
        finally 
        {
            this.waiter = null;
        } //End block
        addTaint(deadline.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1057181815 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1057181815;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.070 -0400", hash_original_method = "BAB31B5D41D1F7BEE0FF6A7B649DDB38", hash_generated_method = "63271BF5CCC07312701AB020FDE84FFA")
    public void wakeup() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException
                ("Nobody waiting on this object.");
        } //End block
        this.cond.signalAll();
        // ---------- Original Method ----------
        //if (this.waiter == null) {
            //throw new IllegalStateException
                //("Nobody waiting on this object.");
        //}
        //this.cond.signalAll();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:16.070 -0400", hash_original_method = "BFE3F8B3CBA9A24F2514C6FAB517057D", hash_generated_method = "A5EA451F6D91CB4B8E0C2D7D002E7ED2")
    public void interrupt() {
        aborted = true;
        this.cond.signalAll();
        // ---------- Original Method ----------
        //aborted = true;
        //this.cond.signalAll();
    }

    
}

