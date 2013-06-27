package org.apache.harmony.security.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.Arrays;
import org.apache.harmony.security.asn1.ASN1Any;
import org.apache.harmony.security.asn1.ASN1Oid;
import org.apache.harmony.security.asn1.ASN1Sequence;
import org.apache.harmony.security.asn1.ASN1Type;
import org.apache.harmony.security.asn1.BerInputStream;
import org.apache.harmony.security.asn1.ObjectIdentifier;
import org.apache.harmony.security.utils.AlgNameMapper;

public final class AlgorithmIdentifier {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.300 -0400", hash_original_field = "ED469618898D75B149E5C7C4B6A1C415", hash_generated_field = "40E4722A302366B2A43F1CD6C99E2454")

    private String algorithm;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.300 -0400", hash_original_field = "D74BA757D8516B995BEF66ADBC091A9F", hash_generated_field = "4A61F6719BEAA78381132679E3C29E60")

    private String algorithmName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.300 -0400", hash_original_field = "166E64F6C3677D0C513901242A3E702D", hash_generated_field = "BDB7CE72F1F070C790060F407EE69616")

    private byte[] parameters;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.301 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "ACB189C73E1A6432570001B3B9D3D516")

    private byte[] encoding;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.301 -0400", hash_original_method = "2A12FAF842ACAA2DBD4904F8F0273D03", hash_generated_method = "2EBF08AB7CEC761BB58F4F2AC8E07597")
    public  AlgorithmIdentifier(String algorithm) {
        this(algorithm, null, null);
        addTaint(algorithm.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.314 -0400", hash_original_method = "3A9ADFAB73D31AB7E50DF2B242FDEB53", hash_generated_method = "9244EB32DF26EF79DE8CD7B637B89F03")
    public  AlgorithmIdentifier(String algorithm, byte[] parameters) {
        this(algorithm, parameters, null);
        addTaint(algorithm.getTaint());
        addTaint(parameters[0]);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.315 -0400", hash_original_method = "D2431539DF2ECCEF9FBA946BEDC34F61", hash_generated_method = "B03A559CDDF8734F7178FAD091F38793")
    private  AlgorithmIdentifier(String algorithm, byte[] parameters, byte[] encoding) {
        this.algorithm = algorithm;
        this.parameters = parameters;
        this.encoding = encoding;
        // ---------- Original Method ----------
        //this.algorithm = algorithm;
        //this.parameters = parameters;
        //this.encoding = encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.315 -0400", hash_original_method = "545C988DDCCD8AD6AA15877CD458F7D6", hash_generated_method = "B77A760576F373715EAE827D76C7B5E8")
    public String getAlgorithm() {
        String varB4EAC82CA7396A68D541C85D26508E83_1764277932 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1764277932 = algorithm;
        varB4EAC82CA7396A68D541C85D26508E83_1764277932.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1764277932;
        // ---------- Original Method ----------
        //return algorithm;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.316 -0400", hash_original_method = "EFA02412B3D98573C0B83612EF561CD2", hash_generated_method = "1D934FD4789C5F39B61B797341E3FDBB")
    public String getAlgorithmName() {
        String varB4EAC82CA7396A68D541C85D26508E83_382924762 = null; //Variable for return #1
        {
            algorithmName = AlgNameMapper.map2AlgName(algorithm);
            {
                algorithmName = algorithm;
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_382924762 = algorithmName;
        varB4EAC82CA7396A68D541C85D26508E83_382924762.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_382924762;
        // ---------- Original Method ----------
        //if (algorithmName == null) {
            //algorithmName = AlgNameMapper.map2AlgName(algorithm);
            //if (algorithmName == null) {
                //algorithmName = algorithm;
            //}
        //}
        //return algorithmName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.316 -0400", hash_original_method = "360B58AAED509D402161560B83FBF1AD", hash_generated_method = "273E783449A6D3033A44698A4E6524EE")
    public byte[] getParameters() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_462782816 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_462782816;
        // ---------- Original Method ----------
        //return parameters;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.316 -0400", hash_original_method = "8CF73AB8FE0E45F61A0A453F52513BE8", hash_generated_method = "E8AD4166B31465A235B8020926B83A99")
    public byte[] getEncoded() {
        {
            encoding = ASN1.encode(this);
        } //End block
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1448782663 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1448782663;
        // ---------- Original Method ----------
        //if (encoding == null) {
            //encoding = ASN1.encode(this);
        //}
        //return encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.316 -0400", hash_original_method = "CF4BFB68A01F84A2E157841F7FC296C6", hash_generated_method = "597305CECA98ED27B2FD30AEA35FC19B")
    @Override
    public boolean equals(Object ai) {
        AlgorithmIdentifier algid;
        algid = (AlgorithmIdentifier) ai;
        boolean varFF1C3FA168E06CAC42B1D1728A51F2BD_982541979 = ((algorithm.equals(algid.algorithm))
            && ((parameters == null)
                    ? algid.parameters == null
                    : Arrays.equals(parameters, algid.parameters))); //DSFIXME:  CODE0008: Nested ternary operator in expression
        addTaint(ai.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_227234082 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_227234082;
        // ---------- Original Method ----------
        //if (!(ai instanceof AlgorithmIdentifier)) {
            //return false;
        //}
        //AlgorithmIdentifier algid = (AlgorithmIdentifier) ai;
        //return (algorithm.equals(algid.algorithm))
            //&& ((parameters == null)
                    //? algid.parameters == null
                    //: Arrays.equals(parameters, algid.parameters));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.323 -0400", hash_original_method = "E65C54FCC20A7D2FAC5D39EC6758FF2C", hash_generated_method = "6D2C399F49D8DD388A8BCD4473A8896B")
    @Override
    public int hashCode() {
        int var00D3F6CF5AE875535D0485512E3CCCA7_1288503544 = (algorithm.hashCode() * 37 + (parameters != null ? Arrays.hashCode(parameters) : 0)); //DSFIXME:  CODE0008: Nested ternary operator in expression
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1834933562 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1834933562;
        // ---------- Original Method ----------
        //return algorithm.hashCode() * 37 + (parameters != null ? Arrays.hashCode(parameters) : 0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.324 -0400", hash_original_method = "BB3CE84D97D9ED23CA58D78F5AD0AB33", hash_generated_method = "3CAD9530771051823FFB5F3E887743DE")
    public void dumpValue(StringBuilder sb) {
        sb.append(getAlgorithmName());
        {
            sb.append(", no params, ");
        } //End block
        {
            sb.append(", params unparsed, ");
        } //End block
        sb.append("OID = ");
        sb.append(getAlgorithm());
        addTaint(sb.getTaint());
        // ---------- Original Method ----------
        //sb.append(getAlgorithmName());
        //if (parameters == null) {
            //sb.append(", no params, ");
        //} else {
            //sb.append(", params unparsed, ");
        //}
        //sb.append("OID = ");
        //sb.append(getAlgorithm());
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:09.324 -0400", hash_original_field = "0379B40A69260257BE6FAF87FE8921A2", hash_generated_field = "D57B6C9D256FA01BB83ACCC1550296AC")

    public static final ASN1Sequence ASN1 = new ASN1Sequence(new ASN1Type[] {
            ASN1Oid.getInstance(), ASN1Any.getInstance() }) {
        {
            setOptional(1); 
        }

        @Override protected Object getDecodedObject(BerInputStream in) {
            Object[] values = (Object[]) in.content;
            return new AlgorithmIdentifier(ObjectIdentifier
                    .toString((int[]) values[0]), (byte[]) values[1]);
        }

        @Override protected void getValues(Object object, Object[] values) {

            AlgorithmIdentifier aID = (AlgorithmIdentifier) object;

            values[0] = ObjectIdentifier.toIntArray(aID.getAlgorithm());
            values[1] = aID.getParameters();
        }
    };
}

