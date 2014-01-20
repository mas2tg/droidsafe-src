package android.net.http;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

class CharArrayBuffers {

    /**
     * Returns true if the buffer contains the given string. Ignores leading
     * whitespace and case.
     *
     * @param buffer to search
     * @param beginIndex index at which we should start
     * @param str to search for
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:36:12.594 -0500", hash_original_method = "14BDAF38F8E4DBDB46D640654A4FD3CD", hash_generated_method = "EE0E5D5A8B29129E0A019FCBD0E7A8E6")
    
static boolean containsIgnoreCaseTrimmed(CharArrayBuffer buffer,
            int beginIndex, final String str) {
        int len = buffer.length();
        char[] chars = buffer.buffer();
        while (beginIndex < len && HTTP.isWhitespace(chars[beginIndex])) {
            beginIndex++;
        }
        int size = str.length();
        boolean ok = len >= beginIndex + size;
        for (int j=0; ok && (j<size); j++) {
            char a = chars[beginIndex+j];
            char b = str.charAt(j);
            if (a != b) {
                a = toLower(a);
                b = toLower(b);
                ok = a == b;
            }
        }
        return ok;
    }

    /**
     * Returns index of first occurence ch. Lower cases characters leading up
     * to first occurrence of ch.
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:36:12.597 -0500", hash_original_method = "4CADF077932F3A8A3D23326E66B54935", hash_generated_method = "6F88683D6B19460AB98E6529FA6AC33B")
    
static int setLowercaseIndexOf(CharArrayBuffer buffer, final int ch) {

        int beginIndex = 0;
        int endIndex = buffer.length();
        char[] chars = buffer.buffer();

        for (int i = beginIndex; i < endIndex; i++) {
            char current = chars[i];
            if (current == ch) {
                return i;
            } else if (current >= 'A' && current <= 'Z'){
                // make lower case
                current += uppercaseAddon;
                chars[i] = current;
            }
        }
        return -1;
    }

    @DSComment("Private Method")
    @DSBan(DSCat.PRIVATE_METHOD)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:36:12.599 -0500", hash_original_method = "29B6D57F0C4C946FE15B5F16943E4D7D", hash_generated_method = "D08A8C824654082C89BE8A224FBB07F1")
    
private static char toLower(char c) {
        if (c >= 'A' && c <= 'Z'){
            c += uppercaseAddon;
        }
        return c;
    }
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 12:36:12.592 -0500", hash_original_field = "3816CC3E335E581DB7D1A94C7707CF43", hash_generated_field = "B3E115C5CFE77FCACE5B31A27B8BA562")

    static final char uppercaseAddon = 'a' - 'A';
    
    @DSComment("Package priviledge")
    @DSBan(DSCat.DEFAULT_MODIFIER)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:19.864 -0400", hash_original_method = "757048C9429CD89F62E53746321F0081", hash_generated_method = "757048C9429CD89F62E53746321F0081")
    public CharArrayBuffers ()
    {
        //Synthesized constructor
    }
}

