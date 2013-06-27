package gov.nist.javax.sip.header.ims;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.ParseException;
import javax.sip.InvalidArgumentException;
import javax.sip.header.ExtensionHeader;
import gov.nist.javax.sip.address.AddressImpl;
import gov.nist.javax.sip.header.AddressParametersHeader;

public class PServedUser extends AddressParametersHeader implements PServedUserHeader, SIPHeaderNamesIms, ExtensionHeader {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.365 -0400", hash_original_method = "CE4E031625CF531C1B85FA453494B504", hash_generated_method = "D2CD9B450BEE17B2C8CB1F031EBB4B29")
    public  PServedUser(AddressImpl address) {
        super(P_SERVED_USER);
        this.address = address;
        addTaint(address.getTaint());
        // ---------- Original Method ----------
        //this.address = address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.365 -0400", hash_original_method = "88679C40290AB234E035EF50535B4D0D", hash_generated_method = "9DF219AB55C86B79DEECEA502C213C52")
    public  PServedUser() {
        super(NAME);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.366 -0400", hash_original_method = "060F42FFBCCB73E6969A6CFC80051047", hash_generated_method = "000B506446F209A8E6D440C143D899AC")
    public String getRegistrationState() {
        String varB4EAC82CA7396A68D541C85D26508E83_1563806682 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1563806682 = getParameter(ParameterNamesIms.REGISTRATION_STATE);
        varB4EAC82CA7396A68D541C85D26508E83_1563806682.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1563806682;
        // ---------- Original Method ----------
        //return getParameter(ParameterNamesIms.REGISTRATION_STATE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.366 -0400", hash_original_method = "86F2D3309EA08C107052AE36BBC425BC", hash_generated_method = "E02625B59301292C2B5F3F4866077CD3")
    public String getSessionCase() {
        String varB4EAC82CA7396A68D541C85D26508E83_690205439 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_690205439 = getParameter(ParameterNamesIms.SESSION_CASE);
        varB4EAC82CA7396A68D541C85D26508E83_690205439.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_690205439;
        // ---------- Original Method ----------
        //return getParameter(ParameterNamesIms.SESSION_CASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.367 -0400", hash_original_method = "8A05E91630AB7D0557A40B65641F2C82", hash_generated_method = "F153FE3376E12B1FD94DE6137422C01A")
    public void setRegistrationState(String registrationState) {
        {
            {
                boolean varBA8681E7A138FDBF12BDB0A2B4AEE0BD_441306609 = (registrationState.equals("reg")||registrationState.equals("unreg"));
                {
                    try 
                    {
                        setParameter(ParameterNamesIms.REGISTRATION_STATE, registrationState);
                    } //End block
                    catch (ParseException e)
                    {
                        e.printStackTrace();
                    } //End block
                } //End block
                {
                    try 
                    {
                        if (DroidSafeAndroidRuntime.control) throw new InvalidArgumentException("Value can be either reg or unreg");
                    } //End block
                    catch (InvalidArgumentException e)
                    {
                        e.printStackTrace();
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("regstate Parameter value is null");
        } //End block
        addTaint(registrationState.getTaint());
        // ---------- Original Method ----------
        //if((registrationState!=null))
        //{
            //if(registrationState.equals("reg")||registrationState.equals("unreg"))
            //{
                //try {
                    //setParameter(ParameterNamesIms.REGISTRATION_STATE, registrationState);
                //} catch (ParseException e) {
                    //e.printStackTrace();
                //}
            //}
              //else
              //{
                  //try {
                      //throw new InvalidArgumentException("Value can be either reg or unreg");
                  //} catch (InvalidArgumentException e) {
                         //e.printStackTrace();
                    //}
              //}
        //}
        //else
        //{
            //throw new NullPointerException("regstate Parameter value is null");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.368 -0400", hash_original_method = "B96D543F72B1B5850C059C4E8A513320", hash_generated_method = "007D61B2FEED4AE666D3CFCD02C7DC69")
    public void setSessionCase(String sessionCase) {
        {
            {
                boolean var06E6B3A3543F32AF4A1823DD7B4D6730_1246303829 = ((sessionCase.equals("orig"))||(sessionCase.equals("term")));
                {
                    try 
                    {
                        setParameter(ParameterNamesIms.SESSION_CASE, sessionCase);
                    } //End block
                    catch (ParseException e)
                    {
                        e.printStackTrace();
                    } //End block
                } //End block
                {
                    try 
                    {
                        if (DroidSafeAndroidRuntime.control) throw new InvalidArgumentException("Value can be either orig or term");
                    } //End block
                    catch (InvalidArgumentException e)
                    {
                        e.printStackTrace();
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("sess-case Parameter value is null");
        } //End block
        addTaint(sessionCase.getTaint());
        // ---------- Original Method ----------
        //if((sessionCase!=null))
        //{
            //if((sessionCase.equals("orig"))||(sessionCase.equals("term")))
            //{
                //try {
                    //setParameter(ParameterNamesIms.SESSION_CASE, sessionCase);
                //} catch (ParseException e) {
                    //e.printStackTrace();
                //}
            //}
              //else
              //{
                  //try {
                    //throw new InvalidArgumentException("Value can be either orig or term");
                //} catch (InvalidArgumentException e) {
                    //e.printStackTrace();
                //}
              //}
        //}
        //else
        //{
            //throw new NullPointerException("sess-case Parameter value is null");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.380 -0400", hash_original_method = "5C1FD3ED8946938E44DEC9CB0584970B", hash_generated_method = "2AD796F9D09F9878996134D2CC609596")
    @Override
    protected String encodeBody() {
        String varB4EAC82CA7396A68D541C85D26508E83_1001080262 = null; //Variable for return #1
        StringBuffer retval;
        retval = new StringBuffer();
        retval.append(address.encode());
        {
            boolean varD3C027666130F10CDC2A85B288EA20D6_749875109 = (parameters.containsKey(ParameterNamesIms.REGISTRATION_STATE));
            retval.append(SEMICOLON).append(ParameterNamesIms.REGISTRATION_STATE).append(EQUALS)
            .append(this.getRegistrationState());
        } //End collapsed parenthetic
        {
            boolean var441A52915CCC05FB5E68369C7AE68912_952783538 = (parameters.containsKey(ParameterNamesIms.SESSION_CASE));
            retval.append(SEMICOLON).append(ParameterNamesIms.SESSION_CASE).append(EQUALS)
            .append(this.getSessionCase());
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1001080262 = retval.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1001080262.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1001080262;
        // ---------- Original Method ----------
        //StringBuffer retval = new StringBuffer();
        //retval.append(address.encode());
        //if(parameters.containsKey(ParameterNamesIms.REGISTRATION_STATE))
            //retval.append(SEMICOLON).append(ParameterNamesIms.REGISTRATION_STATE).append(EQUALS)
            //.append(this.getRegistrationState());
        //if(parameters.containsKey(ParameterNamesIms.SESSION_CASE))
            //retval.append(SEMICOLON).append(ParameterNamesIms.SESSION_CASE).append(EQUALS)
            //.append(this.getSessionCase());
        //return retval.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.381 -0400", hash_original_method = "4B92A49D74A1215E0C3EC12D290AF61B", hash_generated_method = "263BB18DC54AB83D62E13F134B9FEB9D")
    public void setValue(String value) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new ParseException(value,0);
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //throw new ParseException(value,0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.382 -0400", hash_original_method = "5DE7CF1B2BFD7CED31E376D58425CB92", hash_generated_method = "1877A205B6AD006F6487C19ECF2C89D5")
    public boolean equals(Object other) {
        {
            PServedUserHeader psu;
            psu = (PServedUserHeader)other;
            boolean varD89FCAB86EA829CE7D9EF46AFDFD7F15_1405508291 = (this.getAddress().equals(((PServedUser) other).getAddress()));
        } //End block
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1138060993 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1138060993;
        // ---------- Original Method ----------
        //if(other instanceof PServedUser)
         //{
            //final PServedUserHeader psu = (PServedUserHeader)other;
            //return this.getAddress().equals(((PServedUser) other).getAddress());
         //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:33.394 -0400", hash_original_method = "E31F82669EB953245AD29DB03C98C513", hash_generated_method = "3F3D043FCEB0A59A5C5EB861B4364615")
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_277696888 = null; //Variable for return #1
        PServedUser retval;
        retval = (PServedUser) super.clone();
        varB4EAC82CA7396A68D541C85D26508E83_277696888 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_277696888.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_277696888;
        // ---------- Original Method ----------
        //PServedUser retval = (PServedUser) super.clone();
        //return retval;
    }

    
}

