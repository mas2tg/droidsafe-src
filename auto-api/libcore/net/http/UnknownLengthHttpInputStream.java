package libcore.net.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheRequest;
import java.util.Arrays;

final class UnknownLengthHttpInputStream extends AbstractHttpInputStream {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:04.750 -0400", hash_original_field = "136419F556A56B4DD064ACA8F98BADEF", hash_generated_field = "A47BA202024AEED5382C6DACAC7B8715")

    private boolean inputExhausted;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:04.750 -0400", hash_original_method = "03287555569090C6D887554C44738812", hash_generated_method = "61AE58F049BD60FB770E2A5DB09E2B67")
      UnknownLengthHttpInputStream(InputStream is, CacheRequest cacheRequest,
            HttpEngine httpEngine) throws IOException {
        super(is, httpEngine, cacheRequest);
        addTaint(is.getTaint());
        addTaint(cacheRequest.getTaint());
        addTaint(httpEngine.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:04.751 -0400", hash_original_method = "E2336783F7D37948479E1E76BEFE0EF2", hash_generated_method = "AEAB567A6B32F12FDEF0F79C190F917A")
    @Override
    public int read(byte[] buffer, int offset, int count) throws IOException {
        Arrays.checkOffsetAndCount(buffer.length, offset, count);
        checkNotClosed();
        int read;
        read = in.read(buffer, offset, count);
        {
            inputExhausted = true;
            endOfInput(false);
        } //End block
        cacheWrite(buffer, offset, read);
        addTaint(buffer[0]);
        addTaint(offset);
        addTaint(count);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_316478161 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_316478161;
        // ---------- Original Method ----------
        //Arrays.checkOffsetAndCount(buffer.length, offset, count);
        //checkNotClosed();
        //if (in == null || inputExhausted) {
            //return -1;
        //}
        //int read = in.read(buffer, offset, count);
        //if (read == -1) {
            //inputExhausted = true;
            //endOfInput(false);
            //return -1;
        //}
        //cacheWrite(buffer, offset, read);
        //return read;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:04.752 -0400", hash_original_method = "10BF8275103D8B9D888D9077AFBF2526", hash_generated_method = "19B4E3B864868DEA4BCA5E7C0B3E617B")
    @Override
    public int available() throws IOException {
        checkNotClosed();
        {
            Object varE4FA4B6C8AF71619986F605D31C31FCE_1438661994 = (in.available());
        } //End flattened ternary
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1996255584 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1996255584;
        // ---------- Original Method ----------
        //checkNotClosed();
        //return in == null ? 0 : in.available();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:04.753 -0400", hash_original_method = "EFD48677D2EFEA5B0824ED8113A97C5A", hash_generated_method = "5BED66F8770F620AC69D821ABE86ED2E")
    @Override
    public void close() throws IOException {
        closed = true;
        {
            unexpectedEndOfInput();
        } //End block
        // ---------- Original Method ----------
        //if (closed) {
            //return;
        //}
        //closed = true;
        //if (!inputExhausted) {
            //unexpectedEndOfInput();
        //}
    }

    
}

