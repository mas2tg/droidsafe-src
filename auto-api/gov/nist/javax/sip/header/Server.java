package gov.nist.javax.sip.header;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.ParseException;
import javax.sip.header.*;
import java.util.*;

public class Server extends SIPHeader implements ServerHeader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.530 -0400", hash_original_field = "9688EFB908EECBA4C560247BC17C9D80", hash_generated_field = "23BE30BA77F76A348892FB57EBB6010B")

    protected List productTokens;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.533 -0400", hash_original_method = "28A485C01704A957BCAF31556583EFBE", hash_generated_method = "305518061AF0A2CB840B318B99F5BA97")
    public  Server() {
        super(NAME);
        productTokens = new LinkedList();
        // ---------- Original Method ----------
        //productTokens = new LinkedList();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.538 -0400", hash_original_method = "3BD03A3FDC86F025553E39D4B6A63060", hash_generated_method = "972BD4A154DAED772FD05E4AC45AD802")
    private String encodeProduct() {
        String varB4EAC82CA7396A68D541C85D26508E83_827167029 = null; //Variable for return #1
        StringBuffer tokens;
        tokens = new StringBuffer();
        ListIterator it;
        it = productTokens.listIterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_1236109583 = (it.hasNext());
            {
                tokens.append((String) it.next());
                {
                    boolean var3DEC40B862508A9A2151C7EC9CE55CF3_351996062 = (it.hasNext());
                    tokens.append('/');
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_827167029 = tokens.toString();
        varB4EAC82CA7396A68D541C85D26508E83_827167029.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_827167029;
        // ---------- Original Method ----------
        //StringBuffer tokens = new StringBuffer();
        //ListIterator it = productTokens.listIterator();
        //while (it.hasNext()) {
            //tokens.append((String) it.next());
            //if (it.hasNext())
                //tokens.append('/');
            //else
                //break;
        //}
        //return tokens.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.541 -0400", hash_original_method = "ABC17F5FB7BD95EF5278D9B937F06D5F", hash_generated_method = "CEF2772B8F413B5DE4C8BE1EE4727C42")
    public void addProductToken(String pt) {
        productTokens.add(pt);
        addTaint(pt.getTaint());
        // ---------- Original Method ----------
        //productTokens.add(pt);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.542 -0400", hash_original_method = "C0BFA4AD92D4DEF654107ADD12EA3FEE", hash_generated_method = "84E553DFB4EEB7D9D247CEBE394E20E3")
    public String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_1691275209 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1691275209 = encodeProduct();
        varB4EAC82CA7396A68D541C85D26508E83_1691275209.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1691275209;
        // ---------- Original Method ----------
        //return encodeProduct();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.542 -0400", hash_original_method = "FCFEA9A6A04C032A17913D323F8D82A6", hash_generated_method = "84D2FD6CAD0A68D2A40395D03315ED93")
    public ListIterator getProduct() {
        ListIterator varB4EAC82CA7396A68D541C85D26508E83_796327544 = null; //Variable for return #1
        ListIterator varB4EAC82CA7396A68D541C85D26508E83_173424526 = null; //Variable for return #2
        {
            boolean var6FC43180604DFF08774360C95FED0CF9_1766551768 = (productTokens == null || productTokens.isEmpty());
            varB4EAC82CA7396A68D541C85D26508E83_796327544 = null;
            varB4EAC82CA7396A68D541C85D26508E83_173424526 = productTokens.listIterator();
        } //End collapsed parenthetic
        ListIterator varA7E53CE21691AB073D9660D615818899_282617361; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_282617361 = varB4EAC82CA7396A68D541C85D26508E83_796327544;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_282617361 = varB4EAC82CA7396A68D541C85D26508E83_173424526;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_282617361.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_282617361;
        // ---------- Original Method ----------
        //if (productTokens == null || productTokens.isEmpty())
            //return null;
        //else
            //return productTokens.listIterator();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.548 -0400", hash_original_method = "3D9ECE8DAEA4B32C617B95DA481A8348", hash_generated_method = "3149F1655FD6DBB53E41037D379F9BA7")
    public void setProduct(List product) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException(
                "JAIN-SIP Exception, UserAgent, "
                    + "setProduct(), the "
                    + " product parameter is null");
        productTokens = product;
        // ---------- Original Method ----------
        //if (product == null)
            //throw new NullPointerException(
                //"JAIN-SIP Exception, UserAgent, "
                    //+ "setProduct(), the "
                    //+ " product parameter is null");
        //productTokens = product;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:32.549 -0400", hash_original_field = "C650C2D202702263731A478D25505F7E", hash_generated_field = "BA3CF02A53D375867061175F59E40547")

    private static long serialVersionUID = -3587764149383342973L;
}

