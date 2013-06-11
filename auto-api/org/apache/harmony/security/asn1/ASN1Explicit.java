package org.apache.harmony.security.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import java.io.IOException;

public final class ASN1Explicit extends ASN1Constructed {
    public final ASN1Type type;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:17.630 -0400", hash_original_method = "B0F7BA820AB1A580DEB9F8D4C1B1D195", hash_generated_method = "E032415EDCD82956B1C4D1CCEFCA1015")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public ASN1Explicit(int tagNumber, ASN1Type type) {
        this(CLASS_CONTEXTSPECIFIC, tagNumber, type);
        dsTaint.addTaint(tagNumber);
        dsTaint.addTaint(type.dsTaint);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:17.630 -0400", hash_original_method = "3F0FA66BFD46DABED8E86D16322A75CE", hash_generated_method = "BD46719463E6B6BDF8AD0FFA40322F86")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public ASN1Explicit(int tagClass, int tagNumber, ASN1Type type) {
        super(tagClass, tagNumber);
        dsTaint.addTaint(tagNumber);
        dsTaint.addTaint(tagClass);
        dsTaint.addTaint(type.dsTaint);
        // ---------- Original Method ----------
        //this.type = type;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:17.630 -0400", hash_original_method = "BF5194A9A90A1C345CA0C933EC20C89E", hash_generated_method = "D603DF599BD088D31034BA332204CE4A")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public Object decode(BerInputStream in) throws IOException {
        dsTaint.addTaint(in.dsTaint);
        {
            throw new ASN1Exception("ASN.1 explicitly tagged type is expected at [" +
                    in.tagOffset + "]. Expected tag: " + Integer.toHexString(constrId) + ", " +
                    "but encountered tag " + Integer.toHexString(in.tag));
        } //End block
        in.next();
        in.content = type.decode(in);
        Object var883E4A51D9FE1FCA5622395E00C94DE9_1463762336 = (getDecodedObject(in));
        return (Object)dsTaint.getTaint();
        // ---------- Original Method ----------
        //if (constrId != in.tag) {
            //throw new ASN1Exception("ASN.1 explicitly tagged type is expected at [" +
                    //in.tagOffset + "]. Expected tag: " + Integer.toHexString(constrId) + ", " +
                    //"but encountered tag " + Integer.toHexString(in.tag));
        //}
        //in.next();
        //in.content = type.decode(in);
        //if (in.isVerify) {
            //return null;
        //}
        //return getDecodedObject(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:17.630 -0400", hash_original_method = "185B9650CC00F76A6008982D1539FA31", hash_generated_method = "83EDCF780EBAF8CB750A6C0341295828")
    @DSModeled(DSC.SAFE)
    public void encodeContent(BerOutputStream out) {
        dsTaint.addTaint(out.dsTaint);
        out.encodeExplicit(this);
        // ---------- Original Method ----------
        //out.encodeExplicit(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:17.630 -0400", hash_original_method = "8EE64F8332C91721514C0E16F4A7E840", hash_generated_method = "DD8AD852CAE90D1FFC8016157A2B6682")
    @DSModeled(DSC.SAFE)
    public void setEncodingContent(BerOutputStream out) {
        dsTaint.addTaint(out.dsTaint);
        out.getExplicitLength(this);
        // ---------- Original Method ----------
        //out.getExplicitLength(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:17.630 -0400", hash_original_method = "8627A6334FE9B6784BD6CB87A9255671", hash_generated_method = "3E228F385A240FC5F35C76013311587C")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public String toString() {
        String var888EE6156EB4D5341FA6651AA8BD3C31_812500983 = (super.toString() + " for type " + type);
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return super.toString() + " for type " + type;
    }

    
}


