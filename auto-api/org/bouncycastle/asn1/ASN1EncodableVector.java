package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.Vector;

public class ASN1EncodableVector extends DEREncodableVector {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.485 -0400", hash_original_field = "7333F09B91C7F702C0D4E47815B90759", hash_generated_field = "A7A9A9F7A17391F6E585D35448FF7802")

    Vector v = new Vector();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.485 -0400", hash_original_method = "631383CBD9A750B80992BEF56F7E2945", hash_generated_method = "967E45ED59354704C65E0D33E00C0F4F")
    public  ASN1EncodableVector() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.486 -0400", hash_original_method = "D2631DDAF2947787DEB94C0E4C39923E", hash_generated_method = "CE4D5174E359CB6A647B86553DDBC198")
    public void add(DEREncodable obj) {
        v.addElement(obj);
        addTaint(obj.getTaint());
        // ---------- Original Method ----------
        //v.addElement(obj);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.503 -0400", hash_original_method = "B314138255529409821E04A292C38866", hash_generated_method = "4458885657474983DFBB1925C19EA1B5")
    public DEREncodable get(int i) {
        DEREncodable varB4EAC82CA7396A68D541C85D26508E83_107668005 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_107668005 = (DEREncodable)v.elementAt(i);
        addTaint(i);
        varB4EAC82CA7396A68D541C85D26508E83_107668005.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_107668005;
        // ---------- Original Method ----------
        //return (DEREncodable)v.elementAt(i);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.503 -0400", hash_original_method = "F82248B1BB6EFF1F27955CBD5C3A97B0", hash_generated_method = "135BB6FC86C093384FB8684CDA7D4439")
    public int size() {
        int varE3024CD2899AAFA1DB065784012AAC08_247196835 = (v.size());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_256178705 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_256178705;
        // ---------- Original Method ----------
        //return v.size();
    }

    
}

