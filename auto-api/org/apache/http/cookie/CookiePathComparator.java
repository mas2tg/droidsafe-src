package org.apache.http.cookie;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.Serializable;
import java.util.Comparator;

public class CookiePathComparator implements Serializable, Comparator<Cookie> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.738 -0400", hash_original_method = "29A50A9D1E136547D3D05BF6575A3E25", hash_generated_method = "29A50A9D1E136547D3D05BF6575A3E25")
    public CookiePathComparator ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.746 -0400", hash_original_method = "679ADE09B30DFC8534697854331FFCFD", hash_generated_method = "5FAE913C3943D76D57C500935BF0AEAA")
    private String normalizePath(final Cookie cookie) {
        String varB4EAC82CA7396A68D541C85D26508E83_1086252898 = null; //Variable for return #1
        String path;
        path = cookie.getPath();
        {
            path = "/";
        } //End block
        {
            boolean varBB23901A8493ABD61472E931AAF204C3_744188334 = (!path.endsWith("/"));
            {
                path = path + '/';
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1086252898 = path;
        addTaint(cookie.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1086252898.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1086252898;
        // ---------- Original Method ----------
        //String path = cookie.getPath();
        //if (path == null) {
            //path = "/";
        //}
        //if (!path.endsWith("/")) {
            //path = path + '/';
        //}
        //return path;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.747 -0400", hash_original_method = "38114A956CA6EEFF2831D01642E4D39A", hash_generated_method = "558D23295D409E7825BA78A116B3AECA")
    public int compare(final Cookie c1, final Cookie c2) {
        String path1;
        path1 = normalizePath(c1);
        String path2;
        path2 = normalizePath(c2);
        {
            boolean var0CB2E8E81DE73DB2B03BCB11AF1D6765_2120602042 = (path1.equals(path2));
            {
                boolean varA1180DE4FDF24371C229B75A0E6ECA2A_2118960436 = (path1.startsWith(path2));
                {
                    boolean varC27A2A885FF8387770C1D629049B5822_1747722599 = (path2.startsWith(path1));
                } //End collapsed parenthetic
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        addTaint(c1.getTaint());
        addTaint(c2.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1660698340 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1660698340;
        // ---------- Original Method ----------
        //String path1 = normalizePath(c1);
        //String path2 = normalizePath(c2);
        //if (path1.equals(path2)) {
            //return 0;
        //} else if (path1.startsWith(path2)) {
            //return -1;
        //} else if (path2.startsWith(path1)) {
            //return 1;
        //} else {
            //return 0;
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.747 -0400", hash_original_field = "0F87541D9DDA243624A2462D4F476B97", hash_generated_field = "4C01B8F174E1BBEBEF74A65C3272B21E")

    private static long serialVersionUID = 7523645369616405818L;
}

