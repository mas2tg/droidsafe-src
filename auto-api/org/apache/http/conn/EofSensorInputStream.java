package org.apache.http.conn;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.InputStream;
import java.io.IOException;

public class EofSensorInputStream extends InputStream implements ConnectionReleaseTrigger {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.279 -0400", hash_original_field = "D0BF9123FAB84E3B79E1ED23A59D1B53", hash_generated_field = "75EE73214070AB1FED136199F98CB7D5")

    protected InputStream wrappedStream;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.279 -0400", hash_original_field = "095A370CA6B8C603CAAA75F2B4F12919", hash_generated_field = "41AE24AA8B5ED51DCEF7DAEC1C441A42")

    private boolean selfClosed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.279 -0400", hash_original_field = "5F7CFA8693A30C3927B4D76CE04FED85", hash_generated_field = "604EC2A2F6D75D40086FC63DE46C1C59")

    private EofSensorWatcher eofWatcher;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.284 -0400", hash_original_method = "9B2B9BBE0E73ACBBC201B99B60B700AE", hash_generated_method = "BFEAEFD864C7B7C167F3D650317BD360")
    public  EofSensorInputStream(final InputStream in,
                                final EofSensorWatcher watcher) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException
                ("Wrapped stream may not be null.");
        } //End block
        wrappedStream = in;
        selfClosed = false;
        eofWatcher = watcher;
        // ---------- Original Method ----------
        //if (in == null) {
            //throw new IllegalArgumentException
                //("Wrapped stream may not be null.");
        //}
        //wrappedStream = in;
        //selfClosed = false;
        //eofWatcher = watcher;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.284 -0400", hash_original_method = "7D1410F2491A2101D94AEDEF5E6D4821", hash_generated_method = "A460A9D6FE611DA84B2B46D004F44F91")
    protected boolean isReadAllowed() throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IOException("Attempted read on closed stream.");
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2128326203 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2128326203;
        // ---------- Original Method ----------
        //if (selfClosed) {
            //throw new IOException("Attempted read on closed stream.");
        //}
        //return (wrappedStream != null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.288 -0400", hash_original_method = "EEFED13FF9B8A7AEEF5F21DDE66222B5", hash_generated_method = "FA9559B0F6ACF7640DA0CEE0DCDAB00F")
    @Override
    public int read() throws IOException {
        int l;
        l = -1;
        {
            boolean var915B4B12F597D73B6690953E1CD9245C_1852881800 = (isReadAllowed());
            {
                try 
                {
                    l = wrappedStream.read();
                    checkEOF(l);
                } //End block
                catch (IOException ex)
                {
                    checkAbort();
                    if (DroidSafeAndroidRuntime.control) throw ex;
                } //End block
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1328281526 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1328281526;
        // ---------- Original Method ----------
        //int l = -1;
        //if (isReadAllowed()) {
            //try {
                //l = wrappedStream.read();
                //checkEOF(l);
            //} catch (IOException ex) {
                //checkAbort();
                //throw ex;
            //}
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.299 -0400", hash_original_method = "140106DCDF4EB864C1587DEC2B46B903", hash_generated_method = "4AEBBF4B83FFC0941D0EF8A08E1F7D6D")
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int l;
        l = -1;
        {
            boolean var915B4B12F597D73B6690953E1CD9245C_212502723 = (isReadAllowed());
            {
                try 
                {
                    l = wrappedStream.read(b,  off,  len);
                    checkEOF(l);
                } //End block
                catch (IOException ex)
                {
                    checkAbort();
                    if (DroidSafeAndroidRuntime.control) throw ex;
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(b[0]);
        addTaint(off);
        addTaint(len);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1873460350 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1873460350;
        // ---------- Original Method ----------
        //int l = -1;
        //if (isReadAllowed()) {
            //try {
                //l = wrappedStream.read(b,  off,  len);
                //checkEOF(l);
            //} catch (IOException ex) {
                //checkAbort();
                //throw ex;
            //}
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.301 -0400", hash_original_method = "4F7157F64E168AA9C8D7643824C693E0", hash_generated_method = "CA0B82144B92442070EA6022B208D557")
    @Override
    public int read(byte[] b) throws IOException {
        int l;
        l = -1;
        {
            boolean var915B4B12F597D73B6690953E1CD9245C_93691691 = (isReadAllowed());
            {
                try 
                {
                    l = wrappedStream.read(b);
                    checkEOF(l);
                } //End block
                catch (IOException ex)
                {
                    checkAbort();
                    if (DroidSafeAndroidRuntime.control) throw ex;
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(b[0]);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2104916270 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2104916270;
        // ---------- Original Method ----------
        //int l = -1;
        //if (isReadAllowed()) {
            //try {
                //l = wrappedStream.read(b);
                //checkEOF(l);
            //} catch (IOException ex) {
                //checkAbort();
                //throw ex;
            //}
        //}
        //return l;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.308 -0400", hash_original_method = "4A9A4C62148DEF77484BCFABD0B37515", hash_generated_method = "C48BAC755BA2EEBE7E16934CB0D40668")
    @Override
    public int available() throws IOException {
        int a;
        a = 0;
        {
            boolean var915B4B12F597D73B6690953E1CD9245C_679542233 = (isReadAllowed());
            {
                try 
                {
                    a = wrappedStream.available();
                } //End block
                catch (IOException ex)
                {
                    checkAbort();
                    if (DroidSafeAndroidRuntime.control) throw ex;
                } //End block
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_264406295 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_264406295;
        // ---------- Original Method ----------
        //int a = 0;
        //if (isReadAllowed()) {
            //try {
                //a = wrappedStream.available();
            //} catch (IOException ex) {
                //checkAbort();
                //throw ex;
            //}
        //}
        //return a;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.309 -0400", hash_original_method = "BBB2789F4CB1F09FFDECF0070B286C07", hash_generated_method = "9CE787676AF3BC2FF1BCDDF0C7498C87")
    @Override
    public void close() throws IOException {
        selfClosed = true;
        checkClose();
        // ---------- Original Method ----------
        //selfClosed = true;
        //checkClose();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.309 -0400", hash_original_method = "AE762594E7D7874DF7D34819786C5E24", hash_generated_method = "EBC206F85900A1DFBD808EF5DB857266")
    protected void checkEOF(int eof) throws IOException {
        {
            try 
            {
                boolean scws;
                scws = true;
                scws = eofWatcher.eofDetected(wrappedStream);
                wrappedStream.close();
            } //End block
            finally 
            {
                wrappedStream = null;
            } //End block
        } //End block
        addTaint(eof);
        // ---------- Original Method ----------
        //if ((wrappedStream != null) && (eof < 0)) {
            //try {
                //boolean scws = true; 
                //if (eofWatcher != null)
                    //scws = eofWatcher.eofDetected(wrappedStream);
                //if (scws)
                    //wrappedStream.close();
            //} finally {
                //wrappedStream = null;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.310 -0400", hash_original_method = "5F2207AEF37490FFD8B76672ACFD7F2C", hash_generated_method = "0E6B2FF5222476FA16F2F654C8C8CD75")
    protected void checkClose() throws IOException {
        {
            try 
            {
                boolean scws;
                scws = true;
                scws = eofWatcher.streamClosed(wrappedStream);
                wrappedStream.close();
            } //End block
            finally 
            {
                wrappedStream = null;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (wrappedStream != null) {
            //try {
                //boolean scws = true; 
                //if (eofWatcher != null)
                    //scws = eofWatcher.streamClosed(wrappedStream);
                //if (scws)
                    //wrappedStream.close();
            //} finally {
                //wrappedStream = null;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.310 -0400", hash_original_method = "85C58A54B3CFDF3144733266DFBF6D58", hash_generated_method = "710BA0026BEA4628987BDC98CF1530ED")
    protected void checkAbort() throws IOException {
        {
            try 
            {
                boolean scws;
                scws = true;
                scws = eofWatcher.streamAbort(wrappedStream);
                wrappedStream.close();
            } //End block
            finally 
            {
                wrappedStream = null;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (wrappedStream != null) {
            //try {
                //boolean scws = true; 
                //if (eofWatcher != null)
                    //scws = eofWatcher.streamAbort(wrappedStream);
                //if (scws)
                    //wrappedStream.close();
            //} finally {
                //wrappedStream = null;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.310 -0400", hash_original_method = "02046A66B4E60C074CA5E7223CFCAAA0", hash_generated_method = "AAF8AA5F8B1ADF608224C02DBF968299")
    public void releaseConnection() throws IOException {
        this.close();
        // ---------- Original Method ----------
        //this.close();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.311 -0400", hash_original_method = "0D022924489DD4E5DC4E4B7CC5A41FBA", hash_generated_method = "2816D09D80A223528F6FAFD5D9771168")
    public void abortConnection() throws IOException {
        selfClosed = true;
        checkAbort();
        // ---------- Original Method ----------
        //selfClosed = true;
        //checkAbort();
    }

    
}

