package org.bouncycastle.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;

public class BERTaggedObjectParser implements ASN1TaggedObjectParser {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.855 -0400", hash_original_field = "B52D9E9D9646E0353AB30807D53B3F06", hash_generated_field = "FF4CF5F81862B8524694C4DB9DDE635D")

    private boolean _constructed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.856 -0400", hash_original_field = "EAE2E4D0FF1C370A789CC8A0673A645C", hash_generated_field = "62F1DF151C857CACD0771E182D275DC9")

    private int _tagNumber;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.856 -0400", hash_original_field = "5431B8D4D4E17964894E609DD0DF69C0", hash_generated_field = "76949B28A5103E4F545C65F9E6322200")

    private ASN1StreamParser _parser;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.856 -0400", hash_original_method = "CEDFC0E6C0BD9B3FF1D771A70B508D94", hash_generated_method = "B7692F4602B2684854AF66EFA322266A")
    protected  BERTaggedObjectParser(
        int         baseTag,
        int         tagNumber,
        InputStream contentStream) {
        this((baseTag & DERTags.CONSTRUCTED) != 0, tagNumber, new ASN1StreamParser(contentStream));
        addTaint(baseTag);
        addTaint(tagNumber);
        addTaint(contentStream.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.857 -0400", hash_original_method = "641FC71F34D5E5D1E36A069067B2FFCA", hash_generated_method = "4224D6E59DB0E81A205C5A86FC970910")
      BERTaggedObjectParser(
        boolean             constructed,
        int                 tagNumber,
        ASN1StreamParser    parser) {
        _constructed = constructed;
        _tagNumber = tagNumber;
        _parser = parser;
        // ---------- Original Method ----------
        //_constructed = constructed;
        //_tagNumber = tagNumber;
        //_parser = parser;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.857 -0400", hash_original_method = "E640F7F01BC858A63ED48B7251E0457D", hash_generated_method = "938DC8D357600E02E86C6320BCA6F4B5")
    public boolean isConstructed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1565328189 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1565328189;
        // ---------- Original Method ----------
        //return _constructed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.857 -0400", hash_original_method = "B35ABF3B77036668E0072FBBE52EC3E8", hash_generated_method = "E2F2A15FA260A73A931FC2AC8E573DA0")
    public int getTagNo() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_822112702 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_822112702;
        // ---------- Original Method ----------
        //return _tagNumber;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.858 -0400", hash_original_method = "4AD739EA93AB775B40026E215844A8E7", hash_generated_method = "75D1E3EED8625482ECF6CABA0D7FC853")
    public DEREncodable getObjectParser(
        int     tag,
        boolean isExplicit) throws IOException {
        DEREncodable varB4EAC82CA7396A68D541C85D26508E83_727102454 = null; //Variable for return #1
        DEREncodable varB4EAC82CA7396A68D541C85D26508E83_542455752 = null; //Variable for return #2
        {
            {
                if (DroidSafeAndroidRuntime.control) throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
            } //End block
            varB4EAC82CA7396A68D541C85D26508E83_727102454 = _parser.readObject();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_542455752 = _parser.readImplicit(_constructed, tag);
        addTaint(tag);
        addTaint(isExplicit);
        DEREncodable varA7E53CE21691AB073D9660D615818899_1009962133; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1009962133 = varB4EAC82CA7396A68D541C85D26508E83_727102454;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1009962133 = varB4EAC82CA7396A68D541C85D26508E83_542455752;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1009962133.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1009962133;
        // ---------- Original Method ----------
        //if (isExplicit)
        //{
            //if (!_constructed)
            //{
                //throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
            //}
            //return _parser.readObject();
        //}
        //return _parser.readImplicit(_constructed, tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.858 -0400", hash_original_method = "966C66B264046D402E2F3ED8541B4BF3", hash_generated_method = "B520900FF908870FE4705B2BE2FFAE57")
    public DERObject getLoadedObject() throws IOException {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_969672707 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_969672707 = _parser.readTaggedObject(_constructed, _tagNumber);
        varB4EAC82CA7396A68D541C85D26508E83_969672707.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_969672707;
        // ---------- Original Method ----------
        //return _parser.readTaggedObject(_constructed, _tagNumber);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:17.858 -0400", hash_original_method = "8993E91076953DCCDD0896DB0B3E91BE", hash_generated_method = "DB3FF5A1D92B38CDED55DA4B5C8A4A1A")
    public DERObject getDERObject() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1451961694 = null; //Variable for return #1
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1451961694 = this.getLoadedObject();
        } //End block
        catch (IOException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new ASN1ParsingException(e.getMessage());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1451961694.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1451961694;
        // ---------- Original Method ----------
        //try
        //{
            //return this.getLoadedObject();
        //}
        //catch (IOException e)
        //{
            //throw new ASN1ParsingException(e.getMessage());
        //}
    }

    
}

