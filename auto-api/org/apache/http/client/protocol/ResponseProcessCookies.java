package org.apache.http.client.protocol;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HttpContext;

public class ResponseProcessCookies implements HttpResponseInterceptor {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.183 -0400", hash_original_field = "0B7469F2850D918A96D1C36E99B23F5C", hash_generated_field = "4E4E630304492253CB8147CAE1C7D2A5")

    private Log log = LogFactory.getLog(getClass());
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.184 -0400", hash_original_method = "4D600FAEAE45D81498CB22DB2E88FC55", hash_generated_method = "24DEF7D8C332AA18A2A34FD1AC38543A")
    public  ResponseProcessCookies() {
        super();
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.204 -0400", hash_original_method = "DEAF5EA61A5D1778D6CCA56F636FFAFD", hash_generated_method = "AE87D53A5468BCC835A97AFDB311F2C9")
    public void process(final HttpResponse response, final HttpContext context) throws HttpException, IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP request may not be null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP context may not be null");
        } //End block
        CookieStore cookieStore;
        cookieStore = (CookieStore) context.getAttribute(
                ClientContext.COOKIE_STORE);
        {
            this.log.info("Cookie store not available in HTTP context");
        } //End block
        CookieSpec cookieSpec;
        cookieSpec = (CookieSpec) context.getAttribute(
                ClientContext.COOKIE_SPEC);
        {
            this.log.info("CookieSpec not available in HTTP context");
        } //End block
        CookieOrigin cookieOrigin;
        cookieOrigin = (CookieOrigin) context.getAttribute(
                ClientContext.COOKIE_ORIGIN);
        {
            this.log.info("CookieOrigin not available in HTTP context");
        } //End block
        HeaderIterator it;
        it = response.headerIterator(SM.SET_COOKIE);
        processCookies(it, cookieSpec, cookieOrigin, cookieStore);
        {
            boolean var2A413FC23D37E9130A24B941ADD873A1_143674837 = (cookieSpec.getVersion() > 0);
            {
                it = response.headerIterator(SM.SET_COOKIE2);
                processCookies(it, cookieSpec, cookieOrigin, cookieStore);
            } //End block
        } //End collapsed parenthetic
        addTaint(response.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.287 -0400", hash_original_method = "91DFC6E3C42B7F0C9ED2CF0B4905D6AD", hash_generated_method = "ED83D2BF9842A282F7DBB614D5448BD5")
    private void processCookies(
            final HeaderIterator iterator, 
            final CookieSpec cookieSpec,
            final CookieOrigin cookieOrigin,
            final CookieStore cookieStore) {
        {
            boolean var15F7FE2AD7E10C613CA4B915023EF041_1306049848 = (iterator.hasNext());
            {
                Header header;
                header = iterator.nextHeader();
                try 
                {
                    List<Cookie> cookies;
                    cookies = cookieSpec.parse(header, cookieOrigin);
                    {
                        Iterator<Cookie> var122FD713E52C825D20E0B3FA83D127D8_1651738875 = (cookies).iterator();
                        var122FD713E52C825D20E0B3FA83D127D8_1651738875.hasNext();
                        Cookie cookie = var122FD713E52C825D20E0B3FA83D127D8_1651738875.next();
                        {
                            try 
                            {
                                cookieSpec.validate(cookie, cookieOrigin);
                                cookieStore.addCookie(cookie);
                                {
                                    boolean var3DF9FAF67937974C7A395023CF7157D0_1915476742 = (this.log.isDebugEnabled());
                                    {
                                        this.log.debug("Cookie accepted: \""
                                    + cookieToString(cookie) + "\". ");
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                            catch (MalformedCookieException ex)
                            {
                                {
                                    boolean var98AE6279036784B25F38A97DC5F00031_2098221609 = (this.log.isWarnEnabled());
                                    {
                                        this.log.warn("Cookie rejected: \""
                                    + cookieToString(cookie) + "\". " + ex.getMessage());
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                        } //End block
                    } //End collapsed parenthetic
                } //End block
                catch (MalformedCookieException ex)
                {
                    {
                        boolean varD29FD34C323BA0A83865093467758E81_136356824 = (this.log.isWarnEnabled());
                        {
                            this.log.warn("Invalid cookie header: \""
                            + header + "\". " + ex.getMessage());
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(iterator.getTaint());
        addTaint(cookieSpec.getTaint());
        addTaint(cookieOrigin.getTaint());
        addTaint(cookieStore.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:14.291 -0400", hash_original_method = "7F26B81C9250A7120577E4D4C011F353", hash_generated_method = "6EE003DC01625FAD1A41FD8F49894081")
    private String cookieToString(Cookie cookie) {
        String varB4EAC82CA7396A68D541C85D26508E83_1147101046 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1147101046 = cookie.getClass().getSimpleName()
                + "[version=" + cookie.getVersion()
                + ",name=" + cookie.getName()
                + ",domain=" + cookie.getDomain()
                + ",path=" + cookie.getPath()
                + ",expiry=" + cookie.getExpiryDate()
                + "]";
        addTaint(cookie.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1147101046.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1147101046;
        // ---------- Original Method ----------
        //return cookie.getClass().getSimpleName()
                //+ "[version=" + cookie.getVersion()
                //+ ",name=" + cookie.getName()
                //+ ",domain=" + cookie.getDomain()
                //+ ",path=" + cookie.getPath()
                //+ ",expiry=" + cookie.getExpiryDate()
                //+ "]";
    }

    
}

