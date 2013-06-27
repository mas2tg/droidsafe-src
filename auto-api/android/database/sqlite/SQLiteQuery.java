package android.database.sqlite;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.database.CursorWindow;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;

public class SQLiteQuery extends SQLiteProgram {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.315 -0400", hash_original_field = "4A4AFE184AA8D6209A0E3DD0DCD593B5", hash_generated_field = "834FF8F7040C5E40B4484771C7969574")

    private int mOffsetIndex = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.315 -0400", hash_original_field = "D72871D5CE2EB17105099280224B0CCD", hash_generated_field = "0FB4858B613824FE6FDA94A379EBC4D0")

    private boolean mClosed = false;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.316 -0400", hash_original_method = "B04E51F22DB6FA67074D367FD62C2A3B", hash_generated_method = "8914B1AB11B0D4C21E3DA2EFBAD7968B")
      SQLiteQuery(SQLiteDatabase db, String query, int offsetIndex, String[] bindArgs) {
        super(db, query);
        mOffsetIndex = offsetIndex;
        bindAllArgsAsStrings(bindArgs);
        addTaint(db.getTaint());
        addTaint(query.getTaint());
        addTaint(bindArgs[0].getTaint());
        // ---------- Original Method ----------
        //mOffsetIndex = offsetIndex;
        //bindAllArgsAsStrings(bindArgs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.317 -0400", hash_original_method = "ACE77F48482E9278318C8F93FF273D4F", hash_generated_method = "7B621664D0D3B1034B549C18CA917F36")
      SQLiteQuery(SQLiteDatabase db, SQLiteQuery query) {
        super(db, query.mSql);
        this.mBindArgs = query.mBindArgs;
        this.mOffsetIndex = query.mOffsetIndex;
        addTaint(db.getTaint());
        // ---------- Original Method ----------
        //this.mBindArgs = query.mBindArgs;
        //this.mOffsetIndex = query.mOffsetIndex;
    }

    
        private static int nativeFillWindow(int databasePtr, int statementPtr, int windowPtr,
            int startPos, int offsetParam) {
        return DSUtils.UNKNOWN_INT;
    }

    
        private static int nativeColumnCount(int statementPtr) {
        return DSUtils.UNKNOWN_INT;
    }

    
        private static String nativeColumnName(int statementPtr, int columnIndex) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.347 -0400", hash_original_method = "D55C6AB533D249202FC7A2AC29FF93BB", hash_generated_method = "70834BAEB3E97D3A757BD37EDA56541A")
     int fillWindow(CursorWindow window) {
        mDatabase.lock(mSql);
        long timeStart;
        timeStart = SystemClock.uptimeMillis();
        try 
        {
            acquireReference();
            try 
            {
                window.acquireReference();
                int startPos;
                startPos = window.getStartPosition();
                int numRows;
                numRows = nativeFillWindow(nHandle, nStatement, window.mWindowPtr,
                        startPos, mOffsetIndex);
                {
                    long elapsed;
                    elapsed = SystemClock.uptimeMillis() - timeStart;
                    {
                        boolean var988A9DFF582FC3584A942C7F256FAFD2_1754479481 = (SQLiteDebug.shouldLogSlowQuery(elapsed));
                        {
                            Log.d(TAG, "fillWindow took " + elapsed
                                + " ms: window=\"" + window
                                + "\", startPos=" + startPos
                                + ", offset=" + mOffsetIndex
                                + ", filledRows=" + window.getNumRows()
                                + ", countedRows=" + numRows
                                + ", query=\"" + mSql + "\""
                                + ", args=[" + (mBindArgs != null ?
                                        TextUtils.join(", ", mBindArgs.values()) : "")
                                + "]");
                        } //End block
                    } //End collapsed parenthetic
                } //End block
                mDatabase.logTimeStat(mSql, timeStart);
            } //End block
            catch (IllegalStateException e)
            { }
            catch (SQLiteDatabaseCorruptException e)
            {
                mDatabase.onCorruption();
                if (DroidSafeAndroidRuntime.control) throw e;
            } //End block
            catch (SQLiteException e)
            {
                if (DroidSafeAndroidRuntime.control) throw e;
            } //End block
            finally 
            {
                window.releaseReference();
            } //End block
        } //End block
        finally 
        {
            releaseReference();
            mDatabase.unlock();
        } //End block
        addTaint(window.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_406244505 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_406244505;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.349 -0400", hash_original_method = "54618FF47D2C419F49442C51D0DA0774", hash_generated_method = "AF4B0325992256A76B7D9613662894EA")
     int columnCountLocked() {
        acquireReference();
        try 
        {
            int var4CE791ADD9DE7633E946332B2B15C816_1089216792 = (nativeColumnCount(nStatement));
        } //End block
        finally 
        {
            releaseReference();
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1145594275 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1145594275;
        // ---------- Original Method ----------
        //acquireReference();
        //try {
            //return nativeColumnCount(nStatement);
        //} finally {
            //releaseReference();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.362 -0400", hash_original_method = "B5AB077B4013E218660670FE95A73F4B", hash_generated_method = "0C42C943CEDD5EB21FC88E4FF15FDC01")
     String columnNameLocked(int columnIndex) {
        String varB4EAC82CA7396A68D541C85D26508E83_2022365266 = null; //Variable for return #1
        acquireReference();
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_2022365266 = nativeColumnName(nStatement, columnIndex);
        } //End block
        finally 
        {
            releaseReference();
        } //End block
        addTaint(columnIndex);
        varB4EAC82CA7396A68D541C85D26508E83_2022365266.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2022365266;
        // ---------- Original Method ----------
        //acquireReference();
        //try {
            //return nativeColumnName(nStatement, columnIndex);
        //} finally {
            //releaseReference();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.363 -0400", hash_original_method = "818F0EC4250B389213C92FDEA7A7A5CE", hash_generated_method = "D76C52AA112A308153584AAC1F3D1E7E")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1505555057 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1505555057 = "SQLiteQuery: " + mSql;
        varB4EAC82CA7396A68D541C85D26508E83_1505555057.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1505555057;
        // ---------- Original Method ----------
        //return "SQLiteQuery: " + mSql;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.364 -0400", hash_original_method = "C1F8301470323E9B4CE9B1F32DF8E225", hash_generated_method = "6C73A8E1493172E7E20CAF1DBE3B5224")
    @Override
    public void close() {
        super.close();
        mClosed = true;
        // ---------- Original Method ----------
        //super.close();
        //mClosed = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.379 -0400", hash_original_method = "10930ECAA546E890A142B67C44E349E2", hash_generated_method = "54FBEE154273A70AA944D1037CC0878E")
     void requery() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("requerying a closed cursor");
        } //End block
        compileAndbindAllArgs();
        // ---------- Original Method ----------
        //if (mClosed) {
            //throw new IllegalStateException("requerying a closed cursor");
        //}
        //compileAndbindAllArgs();
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:10.379 -0400", hash_original_field = "B4D62BC7E132324EDD96845B1B8BA5B6", hash_generated_field = "77186025B5115C74A2B304E5FDE786A8")

    private static String TAG = "SQLiteQuery";
}

