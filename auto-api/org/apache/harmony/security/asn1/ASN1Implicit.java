package org.apache.harmony.security.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;

public final class ASN1Implicit extends ASN1Type {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.246 -0400", hash_original_field = "599DCCE2998A6B40B1E38E8C6006CB0A", hash_generated_field = "97A5429C38872EFB5A45FC680B4DDEE1")

    private ASN1Type type;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.246 -0400", hash_original_field = "D1A49B1D6CCB03EA6713AD822A73052F", hash_generated_field = "5F27CEAB9F1A8FD006A951F92DDD6657")

    private int taggingType;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.259 -0400", hash_original_method = "885EAD88CE0EDAA6AE8B231FCD302B70", hash_generated_method = "BBA6C3595845AC415198DDB7E0426329")
    public  ASN1Implicit(int tagNumber, ASN1Type type) {
        super(CLASS_CONTEXTSPECIFIC, tagNumber);
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Implicit tagging can not be used for ASN.1 ANY or CHOICE type");
        } //End block
        this.type = type;
        {
            boolean var7D16F4D21FCDA7B88995592766A30F11_771597362 = (type.checkTag(type.id));
            {
                {
                    boolean var198894DB5720C5DF4565C2CB8C2924C0_27599276 = (type.checkTag(type.constrId));
                    {
                        taggingType = TAGGING_STRING;
                    } //End block
                    {
                        taggingType = TAGGING_PRIMITIVE;
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                taggingType = TAGGING_CONSTRUCTED;
            } //End block
        } //End collapsed parenthetic
        addTaint(tagNumber);
        // ---------- Original Method ----------
        //if ((type instanceof ASN1Choice) || (type instanceof ASN1Any)) {
            //throw new IllegalArgumentException("Implicit tagging can not be used for ASN.1 ANY or CHOICE type");
        //}
        //this.type = type;
        //if (type.checkTag(type.id)) {
            //if (type.checkTag(type.constrId)) {
                //taggingType = TAGGING_STRING;
            //} else {
                //taggingType = TAGGING_PRIMITIVE;
            //}
        //} else {
            //taggingType = TAGGING_CONSTRUCTED;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.261 -0400", hash_original_method = "D92B272BF30997E81DA1469852FE3C4F", hash_generated_method = "408F19A7F6F5AB41E0952208304E4976")
    public final boolean checkTag(int identifier) {
        addTaint(identifier);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_415033144 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_415033144;
        // ---------- Original Method ----------
        //switch (taggingType) {
        //case TAGGING_PRIMITIVE:
            //return id == identifier;
        //case TAGGING_CONSTRUCTED:
            //return constrId == identifier;
        //default: 
            //return id == identifier || constrId == identifier;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.262 -0400", hash_original_method = "7AB778F30F3F4E1DD4EDD8138709F383", hash_generated_method = "6A6AE9C9730E5BD25F7F0275C979D767")
    public Object decode(BerInputStream in) throws IOException {
        Object varB4EAC82CA7396A68D541C85D26508E83_156513515 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1756619703 = null; //Variable for return #2
        {
            boolean var766EA6E7D31783D8197180D70708A15A_1573910132 = (!checkTag(in.tag));
            {
                if (DroidSafeAndroidRuntime.control) throw new ASN1Exception("ASN.1 implicitly tagged type expected at " +
                    "[" + in.tagOffset + "]. Expected tag: " + Integer.toHexString(id) + ", " +
                    "but got " + Integer.toHexString(in.tag));
            } //End block
        } //End collapsed parenthetic
        {
            in.tag = type.id;
        } //End block
        {
            in.tag = type.constrId;
        } //End block
        in.content = type.decode(in);
        {
            varB4EAC82CA7396A68D541C85D26508E83_156513515 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1756619703 = getDecodedObject(in);
        addTaint(in.getTaint());
        Object varA7E53CE21691AB073D9660D615818899_1928203253; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1928203253 = varB4EAC82CA7396A68D541C85D26508E83_156513515;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1928203253 = varB4EAC82CA7396A68D541C85D26508E83_1756619703;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1928203253.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1928203253;
        // ---------- Original Method ----------
        //if (!checkTag(in.tag)) {
            //throw new ASN1Exception("ASN.1 implicitly tagged type expected at " +
                    //"[" + in.tagOffset + "]. Expected tag: " + Integer.toHexString(id) + ", " +
                    //"but got " + Integer.toHexString(in.tag));
        //}
        //if (id == in.tag) {
            //in.tag = type.id;
        //} else {
            //in.tag = type.constrId;
        //}
        //in.content = type.decode(in);
        //if (in.isVerify) {
            //return null;
        //}
        //return getDecodedObject(in);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.262 -0400", hash_original_method = "5EC2F9C60EB654B91B6E1D4F997368F9", hash_generated_method = "CC3D3DA42FE0B58BBBF7DFEE1F37C190")
    public void encodeASN(BerOutputStream out) {
        {
            out.encodeTag(constrId);
        } //End block
        {
            out.encodeTag(id);
        } //End block
        encodeContent(out);
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //if (taggingType == TAGGING_CONSTRUCTED) {
            //out.encodeTag(constrId);
        //} else {
            //out.encodeTag(id);
        //}
        //encodeContent(out);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.264 -0400", hash_original_method = "774C00840199094903FD771E0305B5DA", hash_generated_method = "B634C0F6CFCE72DC7759DA451C566F15")
    public void encodeContent(BerOutputStream out) {
        type.encodeContent(out);
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //type.encodeContent(out);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.268 -0400", hash_original_method = "142D84AECEAB554A6A5BF2DED12EF71F", hash_generated_method = "C766A6615417BC63F27B41B692AEF6AF")
    public void setEncodingContent(BerOutputStream out) {
        type.setEncodingContent(out);
        addTaint(out.getTaint());
        // ---------- Original Method ----------
        //type.setEncodingContent(out);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.268 -0400", hash_original_field = "FB409548849E29986196ACFE45A33892", hash_generated_field = "59E9A4D981278548F34924D20AA45E50")

    private static int TAGGING_PRIMITIVE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.268 -0400", hash_original_field = "19C39931BDB0B9C880D081A28C29320F", hash_generated_field = "5B5E1F15307533433EC1A82D6B141C94")

    private static int TAGGING_CONSTRUCTED = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:08.268 -0400", hash_original_field = "CE1A7680B2ACB1874B766B87BC3FC771", hash_generated_field = "2D4592C55D57FBF6CC973825B08076F9")

    private static int TAGGING_STRING = 2;
}

