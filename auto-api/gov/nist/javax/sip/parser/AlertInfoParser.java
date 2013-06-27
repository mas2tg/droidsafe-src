package gov.nist.javax.sip.parser;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.javax.sip.address.GenericURI;
import gov.nist.javax.sip.header.AlertInfo;
import gov.nist.javax.sip.header.AlertInfoList;
import gov.nist.javax.sip.header.SIPHeader;
import gov.nist.javax.sip.header.SIPHeaderNames;
import java.text.ParseException;

public class AlertInfoParser extends ParametersParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.320 -0400", hash_original_method = "D981F7025F52BA8E1CEDC583E21B710C", hash_generated_method = "41BACA132BB4D5A2EA759A0E45FC23E8")
    public  AlertInfoParser(String alertInfo) {
        super(alertInfo);
        addTaint(alertInfo.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.320 -0400", hash_original_method = "FBB9329DBFDB9634284D1CD105BFF940", hash_generated_method = "FD6C3DC5F66F572DD8205BD78C09C230")
    protected  AlertInfoParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.321 -0400", hash_original_method = "01178CDB4B591AEEFEAB9C463FFB7ADD", hash_generated_method = "C3E3E332E2805A084E04F70585B60592")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_1892146544 = null; //Variable for return #1
        dbg_enter("AlertInfoParser.parse");
        AlertInfoList list;
        list = new AlertInfoList();
        try 
        {
            headerName(TokenTypes.ALERT_INFO);
            {
                boolean varA38820C66B6BCE71087D920E2767FF09_1999881917 = (lexer.lookAhead(0) != '\n');
                {
                    AlertInfo alertInfo;
                    alertInfo = new AlertInfo();
                    alertInfo.setHeaderName(SIPHeaderNames.ALERT_INFO);
                    URLParser urlParser;
                    GenericURI uri;
                    {
                        this.lexer.SPorHT();
                        {
                            boolean varE004C7CB8B05EEA814FA2754FBC458B9_536240588 = (this.lexer.lookAhead(0) == '<');
                            {
                                this.lexer.match('<');
                                urlParser = new URLParser((Lexer) this.lexer);
                                uri = urlParser.uriReference( true );
                                alertInfo.setAlertInfo(uri);
                                this.lexer.match('>');
                            } //End block
                            {
                                String alertInfoStr;
                                alertInfoStr = this.lexer.byteStringNoSemicolon();
                                alertInfo.setAlertInfo(alertInfoStr);
                            } //End block
                        } //End collapsed parenthetic
                        this.lexer.SPorHT();
                        super.parse(alertInfo);
                        list.add(alertInfo);
                        {
                            boolean var9AE54EB6EBAEA27AE99856C2C81EF714_517605798 = (lexer.lookAhead(0) == ',');
                            {
                                this.lexer.match(',');
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_1892146544 = list;
        } //End block
        finally 
        {
            dbg_leave("AlertInfoParser.parse");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1892146544.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1892146544;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

