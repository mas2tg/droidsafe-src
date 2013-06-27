package java.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public abstract class Writer implements Appendable, Closeable, Flushable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.882 -0400", hash_original_field = "DCE7C4174CE9323904A934A486C41288", hash_generated_field = "AB852390F41C8C6739EA01C427D6BB51")

    protected Object lock;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.883 -0400", hash_original_method = "673B7AADE5290DAEA83488F65491132B", hash_generated_method = "A151A94197A0C9FE391BFFF503DB9D13")
    protected  Writer() {
        lock = this;
        // ---------- Original Method ----------
        //lock = this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.884 -0400", hash_original_method = "D96C97132BD2547E52536C41B19A9E8C", hash_generated_method = "C7D1EC716B474F3DF52CE4BE77091078")
    protected  Writer(Object lock) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        this.lock = lock;
        // ---------- Original Method ----------
        //if (lock == null) {
            //throw new NullPointerException();
        //}
        //this.lock = lock;
    }

    
    public abstract void close() throws IOException;

    
    public abstract void flush() throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.887 -0400", hash_original_method = "3613EF644BBA13BB917F4671227467C0", hash_generated_method = "BBEED4818033725679C6DDA135D21E59")
    public void write(char[] buf) throws IOException {
        write(buf, 0, buf.length);
        addTaint(buf[0]);
        // ---------- Original Method ----------
        //write(buf, 0, buf.length);
    }

    
    public abstract void write(char[] buf, int offset, int count) throws IOException;

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.888 -0400", hash_original_method = "8F6AF6BA5D86D88C527DBF804753FF5E", hash_generated_method = "84655C397EE8A6C3AF265BA1D902A5DC")
    public void write(int oneChar) throws IOException {
        {
            char[] oneCharArray;
            oneCharArray = new char[1];
            oneCharArray[0] = (char) oneChar;
            write(oneCharArray);
        } //End block
        addTaint(oneChar);
        // ---------- Original Method ----------
        //synchronized (lock) {
            //char[] oneCharArray = new char[1];
            //oneCharArray[0] = (char) oneChar;
            //write(oneCharArray);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.889 -0400", hash_original_method = "2CB0ACB6DB74A20D3FAA9874B0AAEB97", hash_generated_method = "1B1C6FA9969D47416B15D191A98D6963")
    public void write(String str) throws IOException {
        write(str, 0, str.length());
        addTaint(str.getTaint());
        // ---------- Original Method ----------
        //write(str, 0, str.length());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.889 -0400", hash_original_method = "2D3658401DD29E26DBD40724F9EE6A10", hash_generated_method = "E73881596B4108094D4208DF6543A7D0")
    public void write(String str, int offset, int count) throws IOException {
        {
            boolean var692490DEFA1D61E18F718478B787B00C_1736395229 = ((offset | count) < 0 || offset > str.length() - count);
            {
                if (DroidSafeAndroidRuntime.control) throw new StringIndexOutOfBoundsException(str, offset, count);
            } //End block
        } //End collapsed parenthetic
        char[] buf;
        buf = new char[count];
        str.getChars(offset, offset + count, buf, 0);
        {
            write(buf, 0, buf.length);
        } //End block
        addTaint(str.getTaint());
        addTaint(offset);
        addTaint(count);
        // ---------- Original Method ----------
        //if ((offset | count) < 0 || offset > str.length() - count) {
            //throw new StringIndexOutOfBoundsException(str, offset, count);
        //}
        //char[] buf = new char[count];
        //str.getChars(offset, offset + count, buf, 0);
        //synchronized (lock) {
            //write(buf, 0, buf.length);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.891 -0400", hash_original_method = "9D99658000F160BDAECAED91EC9BFB5D", hash_generated_method = "7FF9A5093E3B8CEE1FFC4F5F167DE6D6")
    public Writer append(char c) throws IOException {
        Writer varB4EAC82CA7396A68D541C85D26508E83_479869308 = null; //Variable for return #1
        write(c);
        varB4EAC82CA7396A68D541C85D26508E83_479869308 = this;
        addTaint(c);
        varB4EAC82CA7396A68D541C85D26508E83_479869308.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_479869308;
        // ---------- Original Method ----------
        //write(c);
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.902 -0400", hash_original_method = "D993D81DE6953743EFA25FF281FB0E15", hash_generated_method = "9291EE6C0646C1F62BF458B07B8627C6")
    public Writer append(CharSequence csq) throws IOException {
        Writer varB4EAC82CA7396A68D541C85D26508E83_134040129 = null; //Variable for return #1
        {
            csq = "null";
        } //End block
        write(csq.toString());
        varB4EAC82CA7396A68D541C85D26508E83_134040129 = this;
        addTaint(csq.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_134040129.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_134040129;
        // ---------- Original Method ----------
        //if (csq == null) {
            //csq = "null";
        //}
        //write(csq.toString());
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.915 -0400", hash_original_method = "44B7413EC481F793F1919C886AE2AD0E", hash_generated_method = "C84978F8829411FB88C237F5CD1D8E8E")
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        Writer varB4EAC82CA7396A68D541C85D26508E83_81611697 = null; //Variable for return #1
        {
            csq = "null";
        } //End block
        write(csq.subSequence(start, end).toString());
        varB4EAC82CA7396A68D541C85D26508E83_81611697 = this;
        addTaint(csq.getTaint());
        addTaint(start);
        addTaint(end);
        varB4EAC82CA7396A68D541C85D26508E83_81611697.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_81611697;
        // ---------- Original Method ----------
        //if (csq == null) {
            //csq = "null";
        //}
        //write(csq.subSequence(start, end).toString());
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:39.919 -0400", hash_original_method = "0FEA708DB7A5B3B6D16FEC9623D0EEF8", hash_generated_method = "F06188DC958BC6906BFCF9045EF255C4")
     boolean checkError() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2132358320 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2132358320;
        // ---------- Original Method ----------
        //return false;
    }

    
}

