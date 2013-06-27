package java.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public abstract class FilterReader extends Reader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.932 -0400", hash_original_field = "13B5BFE96F3E2FE411C9F66F4A582ADF", hash_generated_field = "F15B9A182F31EEA4A8B216C74398FC35")

    protected Reader in;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.933 -0400", hash_original_method = "F3D1BE373A56A0B558A4F2E00F8B10E0", hash_generated_method = "739351D73AD74357F67B0EF04AC04675")
    protected  FilterReader(Reader in) {
        super(in);
        this.in = in;
        // ---------- Original Method ----------
        //this.in = in;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.933 -0400", hash_original_method = "501891754658354231C7815C688E4921", hash_generated_method = "956EE7B21C07FF87AA03579B86C19190")
    @Override
    public void close() throws IOException {
        {
            in.close();
        } //End block
        // ---------- Original Method ----------
        //synchronized (lock) {
            //in.close();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.933 -0400", hash_original_method = "CF9F5D7515858833C08423EA9B6FCE6A", hash_generated_method = "FD7E62D5643F69AF252F1E3CDCC11774")
    @Override
    public synchronized void mark(int readlimit) throws IOException {
        {
            in.mark(readlimit);
        } //End block
        addTaint(readlimit);
        // ---------- Original Method ----------
        //synchronized (lock) {
            //in.mark(readlimit);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.933 -0400", hash_original_method = "2ED4924508737903A79CF3129A066F71", hash_generated_method = "C6D649EAD5269C683C4856BD06A5A9D1")
    @Override
    public boolean markSupported() {
        {
            boolean var3964817164F6EBBE5D8A7523A43CF480_1935694598 = (in.markSupported());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1439053540 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1439053540;
        // ---------- Original Method ----------
        //synchronized (lock) {
            //return in.markSupported();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.934 -0400", hash_original_method = "25E05A20196B2EF8776FA69AEA6A01AB", hash_generated_method = "C60DC494E1A149BDC5A26DF0E07EE7ED")
    @Override
    public int read() throws IOException {
        {
            int varDAF10C977F6298D4B794A37C0307BFC8_2121805317 = (in.read());
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_205646630 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_205646630;
        // ---------- Original Method ----------
        //synchronized (lock) {
            //return in.read();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.934 -0400", hash_original_method = "1EA26595B36EBCA6FE882CBA9CA8B025", hash_generated_method = "AC034A26D21DAF60769A21E225798F2E")
    @Override
    public int read(char[] buffer, int offset, int count) throws IOException {
        {
            int var5E7CF19AB1EBC57617DFB11C44893871_2092444090 = (in.read(buffer, offset, count));
        } //End block
        addTaint(buffer[0]);
        addTaint(offset);
        addTaint(count);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_323840093 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_323840093;
        // ---------- Original Method ----------
        //synchronized (lock) {
            //return in.read(buffer, offset, count);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.934 -0400", hash_original_method = "3B619AD38F7F67E79C5355301607CFA3", hash_generated_method = "A29442A756DD61CFB40C1D5C81FAC601")
    @Override
    public boolean ready() throws IOException {
        {
            boolean var0C6F32F006D456011D89BF2F028E95C1_1652258413 = (in.ready());
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1503921452 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1503921452;
        // ---------- Original Method ----------
        //synchronized (lock) {
            //return in.ready();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.935 -0400", hash_original_method = "14FB3B3EA5640BFE7D124E930BE279E7", hash_generated_method = "B226D0761131B38F702B6BD1373C3D63")
    @Override
    public void reset() throws IOException {
        {
            in.reset();
        } //End block
        // ---------- Original Method ----------
        //synchronized (lock) {
            //in.reset();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:38.936 -0400", hash_original_method = "1B3BA6A4C9DAFF7D8DBE3635EB5F6FB9", hash_generated_method = "E5F32855F29A6B70E2ED6F38811DC8B1")
    @Override
    public long skip(long charCount) throws IOException {
        {
            long varFA0377A0F3545E20F4778AB9A51E9CBE_331673508 = (in.skip(charCount));
        } //End block
        addTaint(charCount);
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1785414604 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1785414604;
        // ---------- Original Method ----------
        //synchronized (lock) {
            //return in.skip(charCount);
        //}
    }

    
}

