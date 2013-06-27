package java.nio.charset;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class IllegalCharsetNameException extends IllegalArgumentException {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.776 -0400", hash_original_field = "2016A4FE38556B6598C5FEB99F123C01", hash_generated_field = "294F0480F54B014FA8831418027DC6AA")

    private String charsetName;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.776 -0400", hash_original_method = "363E701FA2AE5454AC2A0E287832EEC6", hash_generated_method = "BE871CB47977F4E2161BE7EB36CE861E")
    public  IllegalCharsetNameException(String charsetName) {
        super((charsetName != null) ? charsetName : "null");
        this.charsetName = charsetName;
        // ---------- Original Method ----------
        //this.charsetName = charsetName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.781 -0400", hash_original_method = "62D3F36CA78A6EC4185A2D1A05C169E6", hash_generated_method = "23B3EB92883A25617792C49E53DC6DE4")
    public String getCharsetName() {
        String varB4EAC82CA7396A68D541C85D26508E83_517218673 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_517218673 = charsetName;
        varB4EAC82CA7396A68D541C85D26508E83_517218673.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_517218673;
        // ---------- Original Method ----------
        //return charsetName;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:46.781 -0400", hash_original_field = "A0EFB0ED18D9D9E1373041665F58419A", hash_generated_field = "4D6422A6EE6C4932C516247130A802A6")

    private static long serialVersionUID = 1457525358470002989L;
}

