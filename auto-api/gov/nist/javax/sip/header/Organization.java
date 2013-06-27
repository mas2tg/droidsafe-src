package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.ParseException;
import javax.sip.header.*;

public class Organization extends SIPHeader implements OrganizationHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.129 -0400", hash_original_field = "B4C1948C087FAFC89A88450FCBB64C77", hash_generated_field = "7B6519A46F5BF8862075151D042F1E20")

    protected String organization;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.129 -0400", hash_original_method = "A22A45BA0A2B2678454705CA5BB968BD", hash_generated_method = "77544CC18B49DD4CBC9F054FA924E69C")
    public  Organization() {
        super(ORGANIZATION);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.129 -0400", hash_original_method = "64094CFB244C647C5657F3E488B1D7D6", hash_generated_method = "1B0744DA7D712631E3ECCEAD6D23562E")
    public String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_2070832701 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2070832701 = organization;
        varB4EAC82CA7396A68D541C85D26508E83_2070832701.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2070832701;
        // ---------- Original Method ----------
        //return organization;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.130 -0400", hash_original_method = "9435FCCFD7C054307D934681F7070D26", hash_generated_method = "95C07544521BCAC6AAF85542419A41D8")
    public String getOrganization() {
        String varB4EAC82CA7396A68D541C85D26508E83_360551307 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_360551307 = organization;
        varB4EAC82CA7396A68D541C85D26508E83_360551307.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_360551307;
        // ---------- Original Method ----------
        //return organization;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.130 -0400", hash_original_method = "525AB078049049253D355424AD5A3E65", hash_generated_method = "745D4B183738B4A222409D3D22C2DDEB")
    public void setOrganization(String o) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException(
                "JAIN-SIP Exception,"
                    + " Organization, setOrganization(), the organization parameter is null");
        organization = o;
        // ---------- Original Method ----------
        //if (o == null)
            //throw new NullPointerException(
                //"JAIN-SIP Exception,"
                    //+ " Organization, setOrganization(), the organization parameter is null");
        //organization = o;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.130 -0400", hash_original_field = "4141766911F0F3B58A3082026A876C2C", hash_generated_field = "9F6C1AB2418B4609594CE58F7827069E")

    private static long serialVersionUID = -2775003113740192712L;
}

