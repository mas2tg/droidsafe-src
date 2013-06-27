package org.apache.harmony.xnet.provider.jsse;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.PrintStream;
import java.util.Locale;
import java.security.AccessController;
import java.security.PrivilegedAction;
import libcore.util.EmptyArray;

public class Logger {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.091 -0400", hash_original_method = "E12CB5567684A77D5AAB00FDDBE756D7", hash_generated_method = "E12CB5567684A77D5AAB00FDDBE756D7")
    public Logger ()
    {
        //Synthesized constructor
    }


        public static Stream getStream(String name) {
        for (int i=0; i<names.length; i++) {
            if (names[i].equals(name)) {
                return new Stream(name);
            }
        }
        return null;
    }

    
    public static class Stream extends PrintStream {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.091 -0400", hash_original_field = "851F5AC9941D720844D143ED9CFCF60A", hash_generated_field = "F717D382565968ED95842821FAEC62F9")

        private String prefix;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.091 -0400", hash_original_method = "5B47239B5174F6EBCA9E4F35C8BFA346", hash_generated_method = "C1A387A4B681305609275C7F863AB8E4")
        public  Stream(String name) {
            super(System.err);
            prefix = name + "["+Thread.currentThread().getName()+"] ";
            // ---------- Original Method ----------
            //prefix = name + "["+Thread.currentThread().getName()+"] ";
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.092 -0400", hash_original_method = "D4FE33DE2CA80BB3708E6A0E802F0C32", hash_generated_method = "022F439EB6FC4C69DE6365214392D6C1")
        @Override
        public void print(String msg) {
            {
                int i;
                i = 0;
                {
                    super.print("  ");
                } //End block
            } //End collapsed parenthetic
            super.print(msg);
            addTaint(msg.getTaint());
            // ---------- Original Method ----------
            //for (int i=0; i<indent; i++) {
                //super.print("  ");
            //}
            //super.print(msg);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.092 -0400", hash_original_method = "330ED05F95D8039149C4EE202C44E32C", hash_generated_method = "13E6B0A7ED2046F68EA1958C76857BC1")
        public void newIndent() {
            // ---------- Original Method ----------
            //indent ++;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.092 -0400", hash_original_method = "85AD8C1F1AFBCA83430C30D8B2614DB0", hash_generated_method = "949118FCC724942B9B24B51D90111D34")
        public void endIndent() {
            // ---------- Original Method ----------
            //indent --;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.092 -0400", hash_original_method = "9FCCAC1E0D29D125BE9308EF391306A0", hash_generated_method = "787792BF3EE3D8BEF4EFB7B7EC3FCE2D")
        @Override
        public void println(String msg) {
            print(prefix);
            super.println(msg);
            addTaint(msg.getTaint());
            // ---------- Original Method ----------
            //print(prefix);
            //super.println(msg);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.093 -0400", hash_original_method = "8FD37FA4B52BC22F9117E57A4C975FCE", hash_generated_method = "2800E721B589B47C39BB893A7F2FF3B6")
        public void print(byte[] data) {
            printAsHex(16, " ", "", data, 0, data.length);
            addTaint(data[0]);
            // ---------- Original Method ----------
            //printAsHex(16, " ", "", data, 0, data.length);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.093 -0400", hash_original_method = "97F4A1EEA64A5AE021D275219F0FBD08", hash_generated_method = "A6A7D35FF8763BEF21B5376BC2EF8E49")
        public void print(byte[] data, int offset, int len) {
            printAsHex(16, " ", "", data, offset, len);
            addTaint(data[0]);
            addTaint(offset);
            addTaint(len);
            // ---------- Original Method ----------
            //printAsHex(16, " ", "", data, offset, len);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.093 -0400", hash_original_method = "6BD913AAA4D9B14F7C28D0536E7C7B24", hash_generated_method = "6A7424D54EC83574CFD5077404FF0FB9")
        public void printAsHex(int perLine, String prefix, String delimiter, byte[] data) {
            printAsHex(perLine, prefix, delimiter, data, 0, data.length);
            addTaint(perLine);
            addTaint(prefix.getTaint());
            addTaint(delimiter.getTaint());
            addTaint(data[0]);
            // ---------- Original Method ----------
            //printAsHex(perLine, prefix, delimiter, data, 0, data.length);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.102 -0400", hash_original_method = "FDE1B5B6670F726EAB891149ED6137F5", hash_generated_method = "0E87054DA7A9FEC3DCA6095D513DE21D")
        public void printAsHex(int perLine, String prefix, String delimiter,
                byte[] data, int offset, int len) {
            StringBuilder line;
            line = new StringBuilder();
            {
                int i;
                i = 0;
                {
                    line.append(prefix);
                    line.append(Byte.toHexString(data[i+offset], false));
                    line.append(delimiter);
                    {
                        super.println(line.toString());
                        line = new StringBuilder();
                    } //End block
                } //End block
            } //End collapsed parenthetic
            super.println(line.toString());
            addTaint(perLine);
            addTaint(prefix.getTaint());
            addTaint(delimiter.getTaint());
            addTaint(data[0]);
            addTaint(offset);
            addTaint(len);
            // ---------- Original Method ----------
            //StringBuilder line = new StringBuilder();
            //for (int i = 0; i < len; i++) {
                //line.append(prefix);
                //line.append(Byte.toHexString(data[i+offset], false));
                //line.append(delimiter);
                //if (((i+1)%perLine) == 0) {
                    //super.println(line.toString());
                    //line = new StringBuilder();
                //}
            //}
            //super.println(line.toString());
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.102 -0400", hash_original_field = "423320F92FC463A2B5F25B94F633420D", hash_generated_field = "CC16B6CC34CB003B39D25C6316DD75BD")

        private static int indent = 0;
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:12.103 -0400", hash_original_field = "A8998C31A141924D06220074FCDC6925", hash_generated_field = "8B709FD8D963B8653EBAE16DA6B1F60B")

    private static String[] names;
    static {
        try {
            names = System.getProperty("jsse", "").split(",");
        } catch (Exception e) {
            names = EmptyArray.STRING;
        }
    }
    
}

