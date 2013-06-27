package org.bouncycastle.asn1.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class RSAPublicKeyStructure extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.047 -0400", hash_original_field = "06EFBA23B1F3A9B846A25C6B49F30348", hash_generated_field = "3E4E39310D57F50C3E323DC3AEC4D41E")

    private BigInteger modulus;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.049 -0400", hash_original_field = "81999BDC63C67199D52FF9A6FC17D274", hash_generated_field = "79B82A8776BB04757B8A80F0464419F4")

    private BigInteger publicExponent;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.050 -0400", hash_original_method = "48EB528539A20A4AFED405FA2E9D9E5C", hash_generated_method = "4144DD2AAFD9958A803584B776141B25")
    public  RSAPublicKeyStructure(
        BigInteger  modulus,
        BigInteger  publicExponent) {
        this.modulus = modulus;
        this.publicExponent = publicExponent;
        // ---------- Original Method ----------
        //this.modulus = modulus;
        //this.publicExponent = publicExponent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.051 -0400", hash_original_method = "E4CEBF5DEC44F0033674466A43F99CB9", hash_generated_method = "2258307F5B82D46D7F1492C4B5244137")
    public  RSAPublicKeyStructure(
        ASN1Sequence  seq) {
        {
            boolean var97DBDEEC2A320E15512526B0CE06A30A_407372710 = (seq.size() != 2);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Bad sequence size: "
                    + seq.size());
            } //End block
        } //End collapsed parenthetic
        Enumeration e;
        e = seq.getObjects();
        modulus = DERInteger.getInstance(e.nextElement()).getPositiveValue();
        publicExponent = DERInteger.getInstance(e.nextElement()).getPositiveValue();
        addTaint(seq.getTaint());
        // ---------- Original Method ----------
        //if (seq.size() != 2)
        //{
            //throw new IllegalArgumentException("Bad sequence size: "
                    //+ seq.size());
        //}
        //Enumeration e = seq.getObjects();
        //modulus = DERInteger.getInstance(e.nextElement()).getPositiveValue();
        //publicExponent = DERInteger.getInstance(e.nextElement()).getPositiveValue();
    }

    
        public static RSAPublicKeyStructure getInstance(
        ASN1TaggedObject obj,
        boolean          explicit) {
        return getInstance(ASN1Sequence.getInstance(obj, explicit));
    }

    
        public static RSAPublicKeyStructure getInstance(
        Object obj) {
        if(obj == null || obj instanceof RSAPublicKeyStructure) 
        {
            return (RSAPublicKeyStructure)obj;
        }
        if(obj instanceof ASN1Sequence) 
        {
            return new RSAPublicKeyStructure((ASN1Sequence)obj);
        }
        throw new IllegalArgumentException("Invalid RSAPublicKeyStructure: " + obj.getClass().getName());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.057 -0400", hash_original_method = "A6C1BE2632CACEB59AFFE6BB866E7B69", hash_generated_method = "4F7FA6195F8FEE7FD47F8E0D96F2C272")
    public BigInteger getModulus() {
        BigInteger varB4EAC82CA7396A68D541C85D26508E83_1178850246 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1178850246 = modulus;
        varB4EAC82CA7396A68D541C85D26508E83_1178850246.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1178850246;
        // ---------- Original Method ----------
        //return modulus;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.065 -0400", hash_original_method = "32183112217BF048572A8B0F43293474", hash_generated_method = "1ADF4983E7FE0D7F35CE91860D17E1B7")
    public BigInteger getPublicExponent() {
        BigInteger varB4EAC82CA7396A68D541C85D26508E83_152534247 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_152534247 = publicExponent;
        varB4EAC82CA7396A68D541C85D26508E83_152534247.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_152534247;
        // ---------- Original Method ----------
        //return publicExponent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.068 -0400", hash_original_method = "2A6A9DB413CE77685147AC30675BFEF2", hash_generated_method = "BCC8DB416CC615F78820BD1FA84181E8")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_691530987 = null; //Variable for return #1
        ASN1EncodableVector v;
        v = new ASN1EncodableVector();
        v.add(new DERInteger(getModulus()));
        v.add(new DERInteger(getPublicExponent()));
        varB4EAC82CA7396A68D541C85D26508E83_691530987 = new DERSequence(v);
        varB4EAC82CA7396A68D541C85D26508E83_691530987.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_691530987;
        // ---------- Original Method ----------
        //ASN1EncodableVector  v = new ASN1EncodableVector();
        //v.add(new DERInteger(getModulus()));
        //v.add(new DERInteger(getPublicExponent()));
        //return new DERSequence(v);
    }

    
}

