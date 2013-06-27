package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.ParseException;
import gov.nist.javax.sip.address.AddressImpl;
import gov.nist.javax.sip.header.AddressParametersHeader;
import javax.sip.header.ExtensionHeader;

public class PProfileKey extends AddressParametersHeader implements PProfileKeyHeader, SIPHeaderNamesIms, ExtensionHeader {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.331 -0400", hash_original_method = "62A39FCB1E97FABE3CE56B88DF28D500", hash_generated_method = "6CF76ED268EA92EBF0466748DD23DF23")
    public  PProfileKey( ) {
        super(P_PROFILE_KEY);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.353 -0400", hash_original_method = "0A29E597AFEA61D9850CF327C87E8DD7", hash_generated_method = "02F88E63386430911094E035542C5A35")
    public  PProfileKey(AddressImpl address) {
        super(NAME);
        this.address = address;
        addTaint(address.getTaint());
        // ---------- Original Method ----------
        //this.address = address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.354 -0400", hash_original_method = "DD9AA0788424353442B0CFE218D97412", hash_generated_method = "32E02A49FCC1855BBBECEA2B41CAC061")
    @Override
    protected String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_1734590345 = null; //Variable for return #1
        StringBuffer retval;
        retval = new StringBuffer();
        {
            boolean varA8A94084CEDB8AE131E76CDFE26F1997_1615649647 = (address.getAddressType() == AddressImpl.ADDRESS_SPEC);
            {
                retval.append(LESS_THAN);
            } //End block
        } //End collapsed parenthetic
        retval.append(address.encode());
        {
            boolean varA8A94084CEDB8AE131E76CDFE26F1997_1284730177 = (address.getAddressType() == AddressImpl.ADDRESS_SPEC);
            {
                retval.append(GREATER_THAN);
            } //End block
        } //End collapsed parenthetic
        {
            boolean varB381AD842454BDB2397F4C2DAD0B3FA1_1436637400 = (!parameters.isEmpty());
            retval.append(SEMICOLON + this.parameters.encode());
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1734590345 = retval.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1734590345.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1734590345;
        // ---------- Original Method ----------
        //StringBuffer retval = new StringBuffer();
        //if (address.getAddressType() == AddressImpl.ADDRESS_SPEC) {
            //retval.append(LESS_THAN);
        //}
        //retval.append(address.encode());
        //if (address.getAddressType() == AddressImpl.ADDRESS_SPEC) {
            //retval.append(GREATER_THAN);
        //}
        //if (!parameters.isEmpty())
            //retval.append(SEMICOLON + this.parameters.encode());
        //return retval.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.354 -0400", hash_original_method = "4B92A49D74A1215E0C3EC12D290AF61B", hash_generated_method = "263BB18DC54AB83D62E13F134B9FEB9D")
    public void setValue(String value) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new ParseException(value,0);
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //throw new ParseException(value,0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.355 -0400", hash_original_method = "9C9266054F44A0CD7DB49784A3A7D69D", hash_generated_method = "AA0EA79BA7DD388056086AC280015E62")
    public boolean equals(Object other) {
        boolean varCA4B4D302580B6347E8C5820870B3AF3_797108340 = ((other instanceof PProfileKey) && super.equals(other));
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_999495312 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_999495312;
        // ---------- Original Method ----------
        //return (other instanceof PProfileKey) && super.equals(other);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.355 -0400", hash_original_method = "38197786CF7CEF8229067A4B5205EC8C", hash_generated_method = "274FF2990870AFD23818C9C8180FC4FB")
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1293318753 = null; //Variable for return #1
        PProfileKey retval;
        retval = (PProfileKey) super.clone();
        varB4EAC82CA7396A68D541C85D26508E83_1293318753 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_1293318753.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1293318753;
        // ---------- Original Method ----------
        //PProfileKey retval = (PProfileKey) super.clone();
        //return retval;
    }

    
}

