package org.apache.http.client.protocol;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;

public class RequestProxyAuthentication implements HttpRequestInterceptor {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.041 -0400", hash_original_field = "0B7469F2850D918A96D1C36E99B23F5C", hash_generated_field = "4E4E630304492253CB8147CAE1C7D2A5")

    private Log log = LogFactory.getLog(getClass());
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.041 -0400", hash_original_method = "A74AF022CE8AD2F75949F498B58D4DA7", hash_generated_method = "019FDF755D508F75C35A23CC550E2502")
    public  RequestProxyAuthentication() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.042 -0400", hash_original_method = "1DDB9F7549C36B7BB96A2BD680DEEE30", hash_generated_method = "E339EC73F29A89AAB2D3E893F89AF1CD")
    public void process(final HttpRequest request, final HttpContext context) throws HttpException, IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP request may not be null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP context may not be null");
        } //End block
        {
            boolean var80F589E703289AABB6C0DCAA767E1B05_226722034 = (request.containsHeader(AUTH.PROXY_AUTH_RESP));
        } //End collapsed parenthetic
        AuthState authState;
        authState = (AuthState) context.getAttribute(
                ClientContext.PROXY_AUTH_STATE);
        AuthScheme authScheme;
        authScheme = authState.getAuthScheme();
        Credentials creds;
        creds = authState.getCredentials();
        {
            this.log.debug("User credentials not available");
        } //End block
        {
            boolean var73CC55FE287FD82949D5517028158444_1906119557 = (authState.getAuthScope() != null || !authScheme.isConnectionBased());
            {
                try 
                {
                    request.addHeader(authScheme.authenticate(creds, request));
                } //End block
                catch (AuthenticationException ex)
                {
                    {
                        boolean varCC1F3FA71CB16F8E717B30D522A0DAFD_1593833274 = (this.log.isErrorEnabled());
                        {
                            this.log.error("Proxy authentication error: " + ex.getMessage());
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(request.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

