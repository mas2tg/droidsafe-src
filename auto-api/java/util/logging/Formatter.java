package java.util.logging;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.MessageFormat;
import java.util.ResourceBundle;

public abstract class Formatter {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:58.959 -0400", hash_original_method = "3D350E85A089AFD791F4A318777DFCA3", hash_generated_method = "6FBB4F35E1975CE926BE7C768BE8709E")
    protected  Formatter() {
        // ---------- Original Method ----------
    }

    
    public abstract String format(LogRecord r);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:58.962 -0400", hash_original_method = "C04F7375B92ACCB2488DC0EF0253C5B2", hash_generated_method = "30624D31D3C5F2AB1645C787E4A32E0E")
    public String formatMessage(LogRecord r) {
        String varB4EAC82CA7396A68D541C85D26508E83_1377583965 = null; //Variable for return #1
        String pattern;
        pattern = r.getMessage();
        ResourceBundle rb;
        rb = null;
        {
            boolean varBA984FB857383D5A65C9C6498F2E0AF7_1176719711 = ((rb = r.getResourceBundle()) != null);
            {
                try 
                {
                    pattern = rb.getString(pattern);
                } //End block
                catch (Exception e)
                {
                    pattern = r.getMessage();
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            Object[] params;
            params = r.getParameters();
            {
                boolean var8FAB585DC6784EA9512177C65E227803_1087952401 = (pattern.indexOf("{0") >= 0 && params != null && params.length > 0);
                {
                    try 
                    {
                        pattern = MessageFormat.format(pattern, params);
                    } //End block
                    catch (IllegalArgumentException e)
                    {
                        pattern = r.getMessage();
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1377583965 = pattern;
        addTaint(r.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1377583965.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1377583965;
        // ---------- Original Method ----------
        //String pattern = r.getMessage();
        //ResourceBundle rb = null;
        //if ((rb = r.getResourceBundle()) != null) {
            //try {
                //pattern = rb.getString(pattern);
            //} catch (Exception e) {
                //pattern = r.getMessage();
            //}
        //}
        //if (pattern != null) {
            //Object[] params = r.getParameters();
            //if (pattern.indexOf("{0") >= 0 && params != null && params.length > 0) {
                //try {
                    //pattern = MessageFormat.format(pattern, params);
                //} catch (IllegalArgumentException e) {
                    //pattern = r.getMessage();
                //}
            //}
        //}
        //return pattern;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:58.975 -0400", hash_original_method = "07107B089EAE5612AD155B7D9F923109", hash_generated_method = "098E227BAADC962D8D90BFA40A485BDF")
    public String getHead(Handler h) {
        String varB4EAC82CA7396A68D541C85D26508E83_7929915 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_7929915 = "";
        addTaint(h.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_7929915.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_7929915;
        // ---------- Original Method ----------
        //return "";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:58.978 -0400", hash_original_method = "C189C1A511189A9AF799AA8C081148A1", hash_generated_method = "FF1C831D04DE3B517775727D0E996830")
    public String getTail(Handler h) {
        String varB4EAC82CA7396A68D541C85D26508E83_1673866772 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1673866772 = "";
        addTaint(h.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1673866772.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1673866772;
        // ---------- Original Method ----------
        //return "";
    }

    
}

