package org.bouncycastle.asn1.x500;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class AttributeTypeAndValue extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.619 -0400", hash_original_field = "599DCCE2998A6B40B1E38E8C6006CB0A", hash_generated_field = "E22429FEAB7082A9C22F35F915934F74")

    private ASN1ObjectIdentifier type;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.619 -0400", hash_original_field = "2063C1608D6E0BAF80249C42E2BE5804", hash_generated_field = "65616B4EF69DB0ADA11533A065E6A511")

    private ASN1Encodable value;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.622 -0400", hash_original_method = "15E850D5749E9732B50BB178D64D47F4", hash_generated_method = "BE576E64C27CB2D4D46CA97900EFABC5")
    private  AttributeTypeAndValue(ASN1Sequence seq) {
        type = (ASN1ObjectIdentifier)seq.getObjectAt(0);
        value = (ASN1Encodable)seq.getObjectAt(1);
        // ---------- Original Method ----------
        //type = (ASN1ObjectIdentifier)seq.getObjectAt(0);
        //value = (ASN1Encodable)seq.getObjectAt(1);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.623 -0400", hash_original_method = "455B7405955E1E537DECB7E0764A59EF", hash_generated_method = "E84A2F5BBB1F65ED45E2832DE9ADFE01")
    public  AttributeTypeAndValue(
        ASN1ObjectIdentifier type,
        ASN1Encodable value) {
        this.type = type;
        this.value = value;
        // ---------- Original Method ----------
        //this.type = type;
        //this.value = value;
    }

    
        public static AttributeTypeAndValue getInstance(Object o) {
        if (o instanceof AttributeTypeAndValue)
        {
            return (AttributeTypeAndValue)o;
        }
        else if (o != null)
        {
            return new AttributeTypeAndValue(ASN1Sequence.getInstance(o));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.626 -0400", hash_original_method = "55F928B5E605E2163AD3D5D479C3E067", hash_generated_method = "99BC4718921238C23C83BF458DFCC376")
    public ASN1ObjectIdentifier getType() {
        ASN1ObjectIdentifier varB4EAC82CA7396A68D541C85D26508E83_1938849148 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1938849148 = type;
        varB4EAC82CA7396A68D541C85D26508E83_1938849148.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1938849148;
        // ---------- Original Method ----------
        //return type;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.630 -0400", hash_original_method = "C951B7A7C5D7EABF1F828E9D0FE876A9", hash_generated_method = "3ABAC24838396A57BF1C559BD22DE295")
    public ASN1Encodable getValue() {
        ASN1Encodable varB4EAC82CA7396A68D541C85D26508E83_1860797508 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1860797508 = value;
        varB4EAC82CA7396A68D541C85D26508E83_1860797508.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1860797508;
        // ---------- Original Method ----------
        //return value;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.638 -0400", hash_original_method = "5081032FA8CA5E98B22B4FF57246FC38", hash_generated_method = "9B03133DAEEBDA7A3C8BDB0E6CB8D82B")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_2110123510 = null; //Variable for return #1
        ASN1EncodableVector v;
        v = new ASN1EncodableVector();
        v.add(type);
        v.add(value);
        varB4EAC82CA7396A68D541C85D26508E83_2110123510 = new DERSequence(v);
        varB4EAC82CA7396A68D541C85D26508E83_2110123510.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2110123510;
        // ---------- Original Method ----------
        //ASN1EncodableVector v = new ASN1EncodableVector();
        //v.add(type);
        //v.add(value);
        //return new DERSequence(v);
    }

    
}

