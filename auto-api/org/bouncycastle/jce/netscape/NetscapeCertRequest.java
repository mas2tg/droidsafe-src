package org.bouncycastle.jce.netscape;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class NetscapeCertRequest extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.915 -0400", hash_original_field = "8710B712D6001BE6B1DFD7058DD60BA8", hash_generated_field = "EE2A131D5158CEBBA9141A6C94018250")

    AlgorithmIdentifier sigAlg;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.915 -0400", hash_original_field = "C1DFA50174835A6BC19B08413D162AF0", hash_generated_field = "F8E5474138E75785580EBCE50F8F784A")

    AlgorithmIdentifier keyAlg;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.916 -0400", hash_original_field = "25E4726A06FDFB58BDAB77A972B4E29E", hash_generated_field = "121838C7870C129075D9A1E92F7A9839")

    byte sigBits[];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.916 -0400", hash_original_field = "B04EC0ADE3D49B4A079F0E207D5E2821", hash_generated_field = "250DD14315DBA25631465B27752AA1F4")

    String challenge;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.916 -0400", hash_original_field = "9A0364B9E99BB480DD25E1F0284C8555", hash_generated_field = "A2F3DA20BD1CF27986C84C664A50FCF1")

    DERBitString content;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.920 -0400", hash_original_field = "41CE59683FBBDF3F03B9D3AEF66BC3C9", hash_generated_field = "EC14682B5D712C02F4760CDD94DCE324")

    PublicKey pubkey;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.921 -0400", hash_original_method = "E784D2D6D9424F9738F1550A3283A21D", hash_generated_method = "578731D7077838229C848DAEA84ED2C9")
    public  NetscapeCertRequest(
        byte[]  req) throws IOException {
        this(getReq(req));
        addTaint(req[0]);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.929 -0400", hash_original_method = "F4E8ED02C3015EE5D86AD4E86AD94BA5", hash_generated_method = "BBBEF7E0E9A28AEFDA9B28D95ECCC469")
    public  NetscapeCertRequest(ASN1Sequence spkac) {
        try 
        {
            {
                boolean var1CDA8CBF2E504670ED75EA8A5D5754A4_1105284933 = (spkac.size() != 3);
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("invalid SPKAC (size):"
                        + spkac.size());
                } //End block
            } //End collapsed parenthetic
            sigAlg = new AlgorithmIdentifier((ASN1Sequence)spkac
                    .getObjectAt(1));
            sigBits = ((DERBitString)spkac.getObjectAt(2)).getBytes();
            ASN1Sequence pkac;
            pkac = (ASN1Sequence)spkac.getObjectAt(0);
            {
                boolean var87DA6BB260ECF90892240758CD8FBFF6_551333266 = (pkac.size() != 2);
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("invalid PKAC (len): "
                        + pkac.size());
                } //End block
            } //End collapsed parenthetic
            challenge = ((DERIA5String)pkac.getObjectAt(1)).getString();
            content = new DERBitString(pkac);
            SubjectPublicKeyInfo pubkeyinfo;
            pubkeyinfo = new SubjectPublicKeyInfo(
                    (ASN1Sequence)pkac.getObjectAt(0));
            X509EncodedKeySpec xspec;
            xspec = new X509EncodedKeySpec(new DERBitString(
                    pubkeyinfo).getBytes());
            keyAlg = pubkeyinfo.getAlgorithmId();
            pubkey = KeyFactory.getInstance(keyAlg.getObjectId().getId(), "BC")
                    .generatePublic(xspec);
        } //End block
        catch (Exception e)
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(e.toString());
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.930 -0400", hash_original_method = "1A82B1619517E26DD541E9FF2CF124F1", hash_generated_method = "E975C7407627508C062FC45918ED63D6")
    public  NetscapeCertRequest(
        String challenge,
        AlgorithmIdentifier signing_alg,
        PublicKey pub_key) throws NoSuchAlgorithmException,
            InvalidKeySpecException, NoSuchProviderException {
        this.challenge = challenge;
        sigAlg = signing_alg;
        pubkey = pub_key;
        ASN1EncodableVector content_der;
        content_der = new ASN1EncodableVector();
        content_der.add(getKeySpec());
        content_der.add(new DERIA5String(challenge));
        content = new DERBitString(new DERSequence(content_der));
        // ---------- Original Method ----------
        //this.challenge = challenge;
        //sigAlg = signing_alg;
        //pubkey = pub_key;
        //ASN1EncodableVector content_der = new ASN1EncodableVector();
        //content_der.add(getKeySpec());
        //content_der.add(new DERIA5String(challenge));
        //content = new DERBitString(new DERSequence(content_der));
    }

    
        private static ASN1Sequence getReq(
        byte[]  r) throws IOException {
        ASN1InputStream aIn = new ASN1InputStream(new ByteArrayInputStream(r));
        return ASN1Sequence.getInstance(aIn.readObject());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.931 -0400", hash_original_method = "ED4D5D58119D3F853ED82C63E0533A7D", hash_generated_method = "BBF3A80A8819DAB9314F2E76FBFBADF8")
    public String getChallenge() {
        String varB4EAC82CA7396A68D541C85D26508E83_23125692 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_23125692 = challenge;
        varB4EAC82CA7396A68D541C85D26508E83_23125692.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_23125692;
        // ---------- Original Method ----------
        //return challenge;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.931 -0400", hash_original_method = "301D77BA94E757D10A3FA603DC1F3204", hash_generated_method = "ED44293D30BFB95C03F13A1DC78A5455")
    public void setChallenge(String value) {
        challenge = value;
        // ---------- Original Method ----------
        //challenge = value;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.932 -0400", hash_original_method = "DEA71583AADCBA6F6FCA4AF03E02FF7E", hash_generated_method = "86BA22A2F07AD0445F08B46BD7B3DFE5")
    public AlgorithmIdentifier getSigningAlgorithm() {
        AlgorithmIdentifier varB4EAC82CA7396A68D541C85D26508E83_971192993 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_971192993 = sigAlg;
        varB4EAC82CA7396A68D541C85D26508E83_971192993.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_971192993;
        // ---------- Original Method ----------
        //return sigAlg;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.932 -0400", hash_original_method = "8DECC6DE401A18CABE51772A2768CD3E", hash_generated_method = "4234E9F4B9918E8F387A0E2A48DC8A2C")
    public void setSigningAlgorithm(AlgorithmIdentifier value) {
        sigAlg = value;
        // ---------- Original Method ----------
        //sigAlg = value;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.932 -0400", hash_original_method = "FE7B6AD2AAFCEFF19EF5259C1AEF0E0B", hash_generated_method = "7DFB022D8D173D51F97AF5072D8CC676")
    public AlgorithmIdentifier getKeyAlgorithm() {
        AlgorithmIdentifier varB4EAC82CA7396A68D541C85D26508E83_768005400 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_768005400 = keyAlg;
        varB4EAC82CA7396A68D541C85D26508E83_768005400.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_768005400;
        // ---------- Original Method ----------
        //return keyAlg;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.936 -0400", hash_original_method = "A707B494F7BE2B273065A846BD08233F", hash_generated_method = "3EAE43A81A989F21379DEDADCC255BDB")
    public void setKeyAlgorithm(AlgorithmIdentifier value) {
        keyAlg = value;
        // ---------- Original Method ----------
        //keyAlg = value;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.937 -0400", hash_original_method = "B14D7737A8CCC155007C211714C134B9", hash_generated_method = "3343DF1AE51AF01ACBA4681EA860A1AD")
    public PublicKey getPublicKey() {
        PublicKey varB4EAC82CA7396A68D541C85D26508E83_1263458728 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1263458728 = pubkey;
        varB4EAC82CA7396A68D541C85D26508E83_1263458728.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1263458728;
        // ---------- Original Method ----------
        //return pubkey;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.937 -0400", hash_original_method = "524BDADC1CE3625FA3734945CD591C94", hash_generated_method = "2D5D732B22E00431248C23383E075117")
    public void setPublicKey(PublicKey value) {
        pubkey = value;
        // ---------- Original Method ----------
        //pubkey = value;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.942 -0400", hash_original_method = "E3E7D887F34AE4BB0FD59D717AA1E296", hash_generated_method = "50975499127491A979FD301C6E9775DF")
    public boolean verify(String challenge) throws NoSuchAlgorithmException,
            InvalidKeyException, SignatureException, NoSuchProviderException {
        {
            boolean var0D496AECFCCD894E7DA774FAA5294373_2063534212 = (!challenge.equals(this.challenge));
        } //End collapsed parenthetic
        Signature sig;
        sig = Signature.getInstance(sigAlg.getObjectId().getId(),
                "BC");
        sig.initVerify(pubkey);
        sig.update(content.getBytes());
        boolean var5CE50919DB3CB98BA87EB1808E72D4B8_707946433 = (sig.verify(sigBits));
        addTaint(challenge.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1387551271 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1387551271;
        // ---------- Original Method ----------
        //if (!challenge.equals(this.challenge))
        //{
            //return false;
        //}
        //Signature sig = Signature.getInstance(sigAlg.getObjectId().getId(),
                //"BC");
        //sig.initVerify(pubkey);
        //sig.update(content.getBytes());
        //return sig.verify(sigBits);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.942 -0400", hash_original_method = "69BFD65CBC2833C297505F1023C7598F", hash_generated_method = "680E4547090D38BE5A6BE9E550A2193D")
    public void sign(PrivateKey priv_key) throws NoSuchAlgorithmException,
            InvalidKeyException, SignatureException, NoSuchProviderException,
            InvalidKeySpecException {
        sign(priv_key, null);
        addTaint(priv_key.getTaint());
        // ---------- Original Method ----------
        //sign(priv_key, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.944 -0400", hash_original_method = "D4E72A005612CE8E458CA009F1575A62", hash_generated_method = "49BBF4134F2A13A9E2CDD8D555B7D6BB")
    public void sign(PrivateKey priv_key, SecureRandom rand) throws NoSuchAlgorithmException, InvalidKeyException,
            SignatureException, NoSuchProviderException,
            InvalidKeySpecException {
        Signature sig;
        sig = Signature.getInstance(sigAlg.getObjectId().getId(),
                "BC");
        {
            sig.initSign(priv_key, rand);
        } //End block
        {
            sig.initSign(priv_key);
        } //End block
        ASN1EncodableVector pkac;
        pkac = new ASN1EncodableVector();
        pkac.add(getKeySpec());
        pkac.add(new DERIA5String(challenge));
        try 
        {
            sig.update(new DERSequence(pkac).getEncoded(ASN1Encodable.DER));
        } //End block
        catch (IOException ioe)
        {
            if (DroidSafeAndroidRuntime.control) throw new SignatureException(ioe.getMessage());
        } //End block
        sigBits = sig.sign();
        addTaint(priv_key.getTaint());
        addTaint(rand.getTaint());
        // ---------- Original Method ----------
        //Signature sig = Signature.getInstance(sigAlg.getObjectId().getId(),
                //"BC");
        //if (rand != null)
        //{
            //sig.initSign(priv_key, rand);
        //}
        //else
        //{
            //sig.initSign(priv_key);
        //}
        //ASN1EncodableVector pkac = new ASN1EncodableVector();
        //pkac.add(getKeySpec());
        //pkac.add(new DERIA5String(challenge));
        //try
        //{
            //sig.update(new DERSequence(pkac).getEncoded(ASN1Encodable.DER));
        //}
        //catch (IOException ioe)
        //{
            //throw new SignatureException(ioe.getMessage());
        //}
        //sigBits = sig.sign();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.954 -0400", hash_original_method = "500EEF6D5B4EBED065BB69A7AF04B4E9", hash_generated_method = "431BACE10F32270C1883561C20955ADD")
    private DERObject getKeySpec() throws NoSuchAlgorithmException,
            InvalidKeySpecException, NoSuchProviderException {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1554940209 = null; //Variable for return #1
        ByteArrayOutputStream baos;
        baos = new ByteArrayOutputStream();
        DERObject obj;
        obj = null;
        try 
        {
            baos.write(pubkey.getEncoded());
            baos.close();
            ASN1InputStream derin;
            derin = new ASN1InputStream(
                    new ByteArrayInputStream(baos.toByteArray()));
            obj = derin.readObject();
        } //End block
        catch (IOException ioe)
        {
            if (DroidSafeAndroidRuntime.control) throw new InvalidKeySpecException(ioe.getMessage());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1554940209 = obj;
        varB4EAC82CA7396A68D541C85D26508E83_1554940209.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1554940209;
        // ---------- Original Method ----------
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //DERObject obj = null;
        //try
        //{
            //baos.write(pubkey.getEncoded());
            //baos.close();
            //ASN1InputStream derin = new ASN1InputStream(
                    //new ByteArrayInputStream(baos.toByteArray()));
            //obj = derin.readObject();
        //}
        //catch (IOException ioe)
        //{
            //throw new InvalidKeySpecException(ioe.getMessage());
        //}
        //return obj;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.956 -0400", hash_original_method = "B0EE724D7F7552AF427D32E04334786D", hash_generated_method = "DB281E72D9C5CBD8C806DEB2ACD9D63A")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_756891952 = null; //Variable for return #1
        ASN1EncodableVector spkac;
        spkac = new ASN1EncodableVector();
        ASN1EncodableVector pkac;
        pkac = new ASN1EncodableVector();
        try 
        {
            pkac.add(getKeySpec());
        } //End block
        catch (Exception e)
        { }
        pkac.add(new DERIA5String(challenge));
        spkac.add(new DERSequence(pkac));
        spkac.add(sigAlg);
        spkac.add(new DERBitString(sigBits));
        varB4EAC82CA7396A68D541C85D26508E83_756891952 = new DERSequence(spkac);
        varB4EAC82CA7396A68D541C85D26508E83_756891952.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_756891952;
        // ---------- Original Method ----------
        //ASN1EncodableVector spkac = new ASN1EncodableVector();
        //ASN1EncodableVector pkac = new ASN1EncodableVector();
        //try
        //{
            //pkac.add(getKeySpec());
        //}
        //catch (Exception e)
        //{
        //}
        //pkac.add(new DERIA5String(challenge));
        //spkac.add(new DERSequence(pkac));
        //spkac.add(sigAlg);
        //spkac.add(new DERBitString(sigBits));
        //return new DERSequence(spkac);
    }

    
}

