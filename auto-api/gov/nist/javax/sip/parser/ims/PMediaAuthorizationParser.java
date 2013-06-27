package gov.nist.javax.sip.parser.ims;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.text.ParseException;
import javax.sip.InvalidArgumentException;
import gov.nist.javax.sip.header.ims.PMediaAuthorizationList;
import gov.nist.javax.sip.header.ims.PMediaAuthorization;
import gov.nist.javax.sip.header.ims.SIPHeaderNamesIms;
import gov.nist.core.Token;
import gov.nist.javax.sip.header.SIPHeader;
import gov.nist.javax.sip.parser.HeaderParser;
import gov.nist.javax.sip.parser.Lexer;
import gov.nist.javax.sip.parser.TokenTypes;

public class PMediaAuthorizationParser extends HeaderParser implements TokenTypes {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.750 -0400", hash_original_method = "FCF1A64239185FEE2932A543D4AD92F3", hash_generated_method = "7EAFE3DE02D9D17DF2E0738E9BDD2152")
    public  PMediaAuthorizationParser(String mediaAuthorization) {
        super(mediaAuthorization);
        addTaint(mediaAuthorization.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.750 -0400", hash_original_method = "D716B8B267E7C915523592278E20949F", hash_generated_method = "DC168B067E61EC34E3696FA9D6B2308B")
    public  PMediaAuthorizationParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.765 -0400", hash_original_method = "C50B4E6383FAF29D7342642FAF098C0C", hash_generated_method = "5F23851F0B97C71B171DA9560DEF6E50")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_685007948 = null; //Variable for return #1
        PMediaAuthorizationList mediaAuthorizationList;
        mediaAuthorizationList = new PMediaAuthorizationList();
        dbg_enter("MediaAuthorizationParser.parse");
        try 
        {
            headerName(TokenTypes.P_MEDIA_AUTHORIZATION);
            PMediaAuthorization mediaAuthorization;
            mediaAuthorization = new PMediaAuthorization();
            mediaAuthorization.setHeaderName(SIPHeaderNamesIms.P_MEDIA_AUTHORIZATION);
            {
                boolean varA38820C66B6BCE71087D920E2767FF09_1649426272 = (lexer.lookAhead(0) != '\n');
                {
                    this.lexer.match(TokenTypes.ID);
                    Token token;
                    token = lexer.getNextToken();
                    try 
                    {
                        mediaAuthorization.setMediaAuthorizationToken(token.getTokenValue());
                    } //End block
                    catch (InvalidArgumentException e)
                    {
                        if (DroidSafeAndroidRuntime.control) throw createParseException(e.getMessage());
                    } //End block
                    mediaAuthorizationList.add(mediaAuthorization);
                    this.lexer.SPorHT();
                    {
                        boolean var7DC6EF7D2962860F171D1CEF6887AFF5_1112610046 = (lexer.lookAhead(0) == ',');
                        {
                            this.lexer.match(',');
                            mediaAuthorization = new PMediaAuthorization();
                        } //End block
                    } //End collapsed parenthetic
                    this.lexer.SPorHT();
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_685007948 = mediaAuthorizationList;
        } //End block
        finally 
        {
            dbg_leave("MediaAuthorizationParser.parse");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_685007948.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_685007948;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

