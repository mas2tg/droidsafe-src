package gov.nist.javax.sip.parser;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.javax.sip.header.*;
import gov.nist.core.*;
import java.text.ParseException;
import javax.sip.*;

public class SubscriptionStateParser extends HeaderParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.307 -0400", hash_original_method = "604DE186E2AE6B899B90A7B635A83D11", hash_generated_method = "EE4717884D1C4FD3720AE6096B59C6FE")
    public  SubscriptionStateParser(String subscriptionState) {
        super(subscriptionState);
        addTaint(subscriptionState.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.307 -0400", hash_original_method = "DBAE404317B64960398576BE2AFF6197", hash_generated_method = "3DF077F7D908C07527C65DF0BE095586")
    protected  SubscriptionStateParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.317 -0400", hash_original_method = "0E07F05FFE6C1C2F83533D7132328ECC", hash_generated_method = "DCB035BDA5EE2FC8BDE10ABE3DD976D5")
    public SIPHeader parse() throws ParseException {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_1660764222 = null; //Variable for return #1
        dbg_enter("SubscriptionStateParser.parse");
        SubscriptionState subscriptionState;
        subscriptionState = new SubscriptionState();
        try 
        {
            headerName(TokenTypes.SUBSCRIPTION_STATE);
            subscriptionState.setHeaderName(SIPHeaderNames.SUBSCRIPTION_STATE);
            lexer.match(TokenTypes.ID);
            Token token;
            token = lexer.getNextToken();
            subscriptionState.setState(token.getTokenValue());
            {
                boolean var23D2B54EEDE70417D1C6C30933AF4A72_691183600 = (lexer.lookAhead(0) == ';');
                {
                    this.lexer.match(';');
                    this.lexer.SPorHT();
                    lexer.match(TokenTypes.ID);
                    token = lexer.getNextToken();
                    String value;
                    value = token.getTokenValue();
                    {
                        boolean var8CA0A679E60695598CA7208019527079_1616470288 = (value.equalsIgnoreCase("reason"));
                        {
                            this.lexer.match('=');
                            this.lexer.SPorHT();
                            lexer.match(TokenTypes.ID);
                            token = lexer.getNextToken();
                            value = token.getTokenValue();
                            subscriptionState.setReasonCode(value);
                        } //End block
                        {
                            boolean var414B5D94C2993E1BAEBD747D160C7C92_1931377513 = (value.equalsIgnoreCase("expires"));
                            {
                                this.lexer.match('=');
                                this.lexer.SPorHT();
                                lexer.match(TokenTypes.ID);
                                token = lexer.getNextToken();
                                value = token.getTokenValue();
                                try 
                                {
                                    int expires;
                                    expires = Integer.parseInt(value);
                                    subscriptionState.setExpires(expires);
                                } //End block
                                catch (NumberFormatException ex)
                                {
                                    if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                                } //End block
                                catch (InvalidArgumentException ex)
                                {
                                    if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                                } //End block
                            } //End block
                            {
                                boolean varBD4F51A266EE0B22E2DF148FAC6041BC_2011072518 = (value.equalsIgnoreCase("retry-after"));
                                {
                                    this.lexer.match('=');
                                    this.lexer.SPorHT();
                                    lexer.match(TokenTypes.ID);
                                    token = lexer.getNextToken();
                                    value = token.getTokenValue();
                                    try 
                                    {
                                        int retryAfter;
                                        retryAfter = Integer.parseInt(value);
                                        subscriptionState.setRetryAfter(retryAfter);
                                    } //End block
                                    catch (NumberFormatException ex)
                                    {
                                        if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                                    } //End block
                                    catch (InvalidArgumentException ex)
                                    {
                                        if (DroidSafeAndroidRuntime.control) throw createParseException(ex.getMessage());
                                    } //End block
                                } //End block
                                {
                                    this.lexer.match('=');
                                    this.lexer.SPorHT();
                                    lexer.match(TokenTypes.ID);
                                    Token secondToken;
                                    secondToken = lexer.getNextToken();
                                    String secondValue;
                                    secondValue = secondToken.getTokenValue();
                                    subscriptionState.setParameter(value, secondValue);
                                } //End block
                            } //End collapsed parenthetic
                        } //End collapsed parenthetic
                    } //End collapsed parenthetic
                    this.lexer.SPorHT();
                } //End block
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            dbg_leave("SubscriptionStateParser.parse");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1660764222 = subscriptionState;
        varB4EAC82CA7396A68D541C85D26508E83_1660764222.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1660764222;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

