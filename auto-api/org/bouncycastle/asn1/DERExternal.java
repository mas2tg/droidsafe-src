package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DERExternal extends ASN1Object {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.990 -0400", hash_original_field = "87CF319575A80D82C7B08518EB1A138A", hash_generated_field = "8B451B3DBA24F8A6DD2DAC687FC92958")

    private DERObjectIdentifier directReference;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.990 -0400", hash_original_field = "44A5FC20CC91CDBBCCF26603C8D6D3E6", hash_generated_field = "4BDDE807B370ABCD06D1D8B56EE5C7C4")

    private DERInteger indirectReference;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.990 -0400", hash_original_field = "D4C330BFB9DA13B3E1D95A39A28A5037", hash_generated_field = "A8803A57E0AB1FAD59A5878D307FCE93")

    private ASN1Object dataValueDescriptor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.990 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "E77A569AB1DC34BFC03164971297EE8D")

    private int encoding;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.990 -0400", hash_original_field = "44D2CB943C9C2DEB0EDB1C94BEBB0486", hash_generated_field = "8CF4A9E6D02D0338F11DF53BC2A4E23F")

    private DERObject externalContent;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.991 -0400", hash_original_method = "5B6E321D0FF0F6E358DB9222EA98BCB7", hash_generated_method = "DDB2BA72C204280D708FC4892EFDB47F")
    public  DERExternal(ASN1EncodableVector vector) {
        int offset;
        offset = 0;
        DERObject enc;
        enc = getObjFromVector(vector, offset);
        {
            directReference = (DERObjectIdentifier)enc;
            enc = getObjFromVector(vector, offset);
        } //End block
        {
            indirectReference = (DERInteger) enc;
            enc = getObjFromVector(vector, offset);
        } //End block
        {
            dataValueDescriptor = (ASN1Object) enc;
            enc = getObjFromVector(vector, offset);
        } //End block
        {
            boolean var6EA570A14539C56A79A93DEAE306A7BD_1220840054 = (vector.size() != offset + 1);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("input vector too large");
            } //End block
        } //End collapsed parenthetic
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        } //End block
        DERTaggedObject obj;
        obj = (DERTaggedObject)enc;
        setEncoding(obj.getTagNo());
        externalContent = obj.getObject();
        addTaint(vector.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.992 -0400", hash_original_method = "3E78E5A9498D2FA8094C2F6169A192AD", hash_generated_method = "95CAF0C47E93653FB6275114B6596558")
    public  DERExternal(DERObjectIdentifier directReference, DERInteger indirectReference, ASN1Object dataValueDescriptor, DERTaggedObject externalData) {
        this(directReference, indirectReference, dataValueDescriptor, externalData.getTagNo(), externalData.getDERObject());
        addTaint(directReference.getTaint());
        addTaint(indirectReference.getTaint());
        addTaint(dataValueDescriptor.getTaint());
        addTaint(externalData.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.993 -0400", hash_original_method = "865736B8E6D41CC27E8C4571B72736D6", hash_generated_method = "5629508F98BB487327353D098964CB71")
    public  DERExternal(DERObjectIdentifier directReference, DERInteger indirectReference, ASN1Object dataValueDescriptor, int encoding, DERObject externalData) {
        setDirectReference(directReference);
        setIndirectReference(indirectReference);
        setDataValueDescriptor(dataValueDescriptor);
        setEncoding(encoding);
        setExternalContent(externalData.getDERObject());
        addTaint(directReference.getTaint());
        addTaint(indirectReference.getTaint());
        addTaint(dataValueDescriptor.getTaint());
        addTaint(encoding);
        addTaint(externalData.getTaint());
        // ---------- Original Method ----------
        //setDirectReference(directReference);
        //setIndirectReference(indirectReference);
        //setDataValueDescriptor(dataValueDescriptor);
        //setEncoding(encoding);
        //setExternalContent(externalData.getDERObject());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.993 -0400", hash_original_method = "B967C566758213AD266FDB24FA14151A", hash_generated_method = "1D4556AA3E7CC1F4B798A9DA4FAF58D1")
    private DERObject getObjFromVector(ASN1EncodableVector v, int index) {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1981086001 = null; //Variable for return #1
        {
            boolean varB4DD559B658EEAA09048D55546AD49A8_174482389 = (v.size() <= index);
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("too few objects in input vector");
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1981086001 = v.get(index).getDERObject();
        addTaint(v.getTaint());
        addTaint(index);
        varB4EAC82CA7396A68D541C85D26508E83_1981086001.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1981086001;
        // ---------- Original Method ----------
        //if (v.size() <= index)
        //{
            //throw new IllegalArgumentException("too few objects in input vector");
        //}
        //return v.get(index).getDERObject();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.994 -0400", hash_original_method = "E789B91521559DD1093D7E9087176FAE", hash_generated_method = "4963EFA89567956B688E45DF3C530A1C")
    public int hashCode() {
        int ret;
        ret = 0;
        {
            ret = directReference.hashCode();
        } //End block
        {
            ret ^= indirectReference.hashCode();
        } //End block
        {
            ret ^= dataValueDescriptor.hashCode();
        } //End block
        ret ^= externalContent.hashCode();
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1313961557 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1313961557;
        // ---------- Original Method ----------
        //int ret = 0;
        //if (directReference != null)
        //{
            //ret = directReference.hashCode();
        //}
        //if (indirectReference != null)
        //{
            //ret ^= indirectReference.hashCode();
        //}
        //if (dataValueDescriptor != null)
        //{
            //ret ^= dataValueDescriptor.hashCode();
        //}
        //ret ^= externalContent.hashCode();
        //return ret;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.999 -0400", hash_original_method = "95E5CCE7002362171E5372628ECC5970", hash_generated_method = "CDF4D47281D6B67333E796C6D498E6EC")
     void encode(DEROutputStream out) throws IOException {
        ByteArrayOutputStream baos;
        baos = new ByteArrayOutputStream();
        {
            baos.write(directReference.getDEREncoded());
        } //End block
        {
            baos.write(indirectReference.getDEREncoded());
        } //End block
        {
            baos.write(dataValueDescriptor.getDEREncoded());
        } //End block
        DERTaggedObject obj;
        obj = new DERTaggedObject(encoding, externalContent);
        baos.write(obj.getDEREncoded());
        out.writeEncoded(DERTags.CONSTRUCTED, DERTags.EXTERNAL, baos.toByteArray());
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //if (directReference != null)
        //{
            //baos.write(directReference.getDEREncoded());
        //}
        //if (indirectReference != null)
        //{
            //baos.write(indirectReference.getDEREncoded());
        //}
        //if (dataValueDescriptor != null)
        //{
            //baos.write(dataValueDescriptor.getDEREncoded());
        //}
        //DERTaggedObject obj = new DERTaggedObject(encoding, externalContent);
        //baos.write(obj.getDEREncoded());
        //out.writeEncoded(DERTags.CONSTRUCTED, DERTags.EXTERNAL, baos.toByteArray());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.000 -0400", hash_original_method = "B6A4F973EBC78A6793C4703762E4E562", hash_generated_method = "91639FF81E74F40C09392352A88B60FE")
     boolean asn1Equals(DERObject o) {
        DERExternal other;
        other = (DERExternal)o;
        {
            {
                boolean varBCA992D41F0A8ABD2928F8753178D46A_1103177325 = (other.directReference == null || !other.directReference.equals(directReference));
            } //End collapsed parenthetic
        } //End block
        {
            {
                boolean varD78E958F12DFBF6C5C476998EE281259_1258846805 = (other.indirectReference == null || !other.indirectReference.equals(indirectReference));
            } //End collapsed parenthetic
        } //End block
        {
            {
                boolean var78A31C65277A5AE8A41B30C47A65F869_1999701866 = (other.dataValueDescriptor == null || !other.dataValueDescriptor.equals(dataValueDescriptor));
            } //End collapsed parenthetic
        } //End block
        boolean var99C5035F414E5B2D03D7EFBDDE3288EE_2081128870 = (externalContent.equals(other.externalContent));
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1344929939 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1344929939;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.009 -0400", hash_original_method = "0B6DEA5056C96F68CB576A145B8163A4", hash_generated_method = "081765C9415AA44C345A8AE6D90EFE97")
    public ASN1Object getDataValueDescriptor() {
        ASN1Object varB4EAC82CA7396A68D541C85D26508E83_651166894 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_651166894 = dataValueDescriptor;
        varB4EAC82CA7396A68D541C85D26508E83_651166894.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_651166894;
        // ---------- Original Method ----------
        //return dataValueDescriptor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.009 -0400", hash_original_method = "5D19E791BF0146D74AAC703832ECF7B9", hash_generated_method = "329F42CC0052E4F9E78F63EF4A99A6E5")
    public DERObjectIdentifier getDirectReference() {
        DERObjectIdentifier varB4EAC82CA7396A68D541C85D26508E83_344310016 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_344310016 = directReference;
        varB4EAC82CA7396A68D541C85D26508E83_344310016.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_344310016;
        // ---------- Original Method ----------
        //return directReference;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.009 -0400", hash_original_method = "20B2CEB64A03B59C5CB213FEC1AC33C9", hash_generated_method = "C256B260BA757A66878C73F8EAA4F5E7")
    public int getEncoding() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_568143975 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_568143975;
        // ---------- Original Method ----------
        //return encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.010 -0400", hash_original_method = "A31A01A5BEAE5C1C675F68CA7DEBC312", hash_generated_method = "76FC47941C567BFC82DDF83F98D78E7A")
    public DERObject getExternalContent() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1319571754 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1319571754 = externalContent;
        varB4EAC82CA7396A68D541C85D26508E83_1319571754.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1319571754;
        // ---------- Original Method ----------
        //return externalContent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.010 -0400", hash_original_method = "A48170CD86EA456F3F5BDA9638D90BB1", hash_generated_method = "CCDB20F8BEE72C3271A3F2A1D321F3CD")
    public DERInteger getIndirectReference() {
        DERInteger varB4EAC82CA7396A68D541C85D26508E83_966477105 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_966477105 = indirectReference;
        varB4EAC82CA7396A68D541C85D26508E83_966477105.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_966477105;
        // ---------- Original Method ----------
        //return indirectReference;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.010 -0400", hash_original_method = "0BD65C140FCC2077661040D20B226912", hash_generated_method = "EF6BD976ABD259EA66BA89BDDB768754")
    private void setDataValueDescriptor(ASN1Object dataValueDescriptor) {
        this.dataValueDescriptor = dataValueDescriptor;
        // ---------- Original Method ----------
        //this.dataValueDescriptor = dataValueDescriptor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.011 -0400", hash_original_method = "A83523D5E22547A02A231238C93C9842", hash_generated_method = "D6AD4C337C3FD3A0AD5109A0D5A2ACE9")
    private void setDirectReference(DERObjectIdentifier directReferemce) {
        this.directReference = directReferemce;
        // ---------- Original Method ----------
        //this.directReference = directReferemce;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.011 -0400", hash_original_method = "D6EB4173694568A37E5CF8BEC224CE9C", hash_generated_method = "2B487965DAAA3E510EDB70A66A295BF9")
    private void setEncoding(int encoding) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("invalid encoding value: " + encoding);
        } //End block
        this.encoding = encoding;
        // ---------- Original Method ----------
        //if (encoding < 0 || encoding > 2)
        //{
            //throw new IllegalArgumentException("invalid encoding value: " + encoding);
        //}
        //this.encoding = encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.011 -0400", hash_original_method = "DE6F2795286824746E38E92F0B41BA33", hash_generated_method = "24CEF734212704228B883286898B188C")
    private void setExternalContent(DERObject externalContent) {
        this.externalContent = externalContent;
        // ---------- Original Method ----------
        //this.externalContent = externalContent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:18.017 -0400", hash_original_method = "0014F60DB99B68C720B34F07B78773E4", hash_generated_method = "D2EB81AEFDE4F6F36CC34563A6AD7814")
    private void setIndirectReference(DERInteger indirectReference) {
        this.indirectReference = indirectReference;
        // ---------- Original Method ----------
        //this.indirectReference = indirectReference;
    }

    
}

