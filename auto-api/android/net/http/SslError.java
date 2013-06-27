package android.net.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.security.cert.X509Certificate;

public class SslError {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.195 -0400", hash_original_field = "D750EAC634DEAED12CF378E4BA272A33", hash_generated_field = "A1A4B77C81BB0C0C3F4262BD3992D7FD")

    int mErrors;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.195 -0400", hash_original_field = "1229A917B4D1D7ED185029644D045D14", hash_generated_field = "8722B9770017213537D317FB65A9919D")

    SslCertificate mCertificate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.195 -0400", hash_original_field = "8299C83E9CFFA2EF5909444648349221", hash_generated_field = "CA88DB4A75B79130313A74537195706C")

    String mUrl;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.195 -0400", hash_original_method = "E54E1790034E06C2564EA8F8D322C604", hash_generated_method = "3AF4F51B3608A5BAC87B70469C9D4244")
    @Deprecated
    public  SslError(int error, SslCertificate certificate) {
        this(error, certificate, "");
        addTaint(error);
        addTaint(certificate.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.195 -0400", hash_original_method = "D4D6A5236E4F49764789FE2E4242FD0D", hash_generated_method = "0C4F0C38208B33D6CC308F972D612214")
    @Deprecated
    public  SslError(int error, X509Certificate certificate) {
        this(error, certificate, "");
        addTaint(error);
        addTaint(certificate.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.196 -0400", hash_original_method = "85B2ECB0DBC9283B8022F29E2B26DB48", hash_generated_method = "C4AE8A8089B57EA926B313F33B463792")
    public  SslError(int error, SslCertificate certificate, String url) {
        addError(error);
        mCertificate = certificate;
        mUrl = url;
        addTaint(error);
        // ---------- Original Method ----------
        //assert certificate != null;
        //assert url != null;
        //addError(error);
        //mCertificate = certificate;
        //mUrl = url;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.196 -0400", hash_original_method = "3533EE541F404B8ADD4D4E5426E464A7", hash_generated_method = "D5E56FAAE17BD91A9C23EBA16B9A51AA")
    public  SslError(int error, X509Certificate certificate, String url) {
        this(error, new SslCertificate(certificate), url);
        addTaint(error);
        addTaint(certificate.getTaint());
        addTaint(url.getTaint());
        // ---------- Original Method ----------
    }

    
        public static SslError SslErrorFromChromiumErrorCode(
            int error, SslCertificate cert, String url) {
        assert (error >= -299 && error <= -200);
        if (error == -200)
            return new SslError(SSL_IDMISMATCH, cert, url);
        if (error == -201)
            return new SslError(SSL_DATE_INVALID, cert, url);
        if (error == -202)
            return new SslError(SSL_UNTRUSTED, cert, url);
        return new SslError(SSL_INVALID, cert, url);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.198 -0400", hash_original_method = "7F448377575EC929DDEDD2BF1EB435C4", hash_generated_method = "FDF1F6FA3C7181E22E23698B164E5166")
    public SslCertificate getCertificate() {
        SslCertificate varB4EAC82CA7396A68D541C85D26508E83_492967243 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_492967243 = mCertificate;
        varB4EAC82CA7396A68D541C85D26508E83_492967243.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_492967243;
        // ---------- Original Method ----------
        //return mCertificate;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.215 -0400", hash_original_method = "13CE30FBE362EA44FDCE282CA01E7BBC", hash_generated_method = "72B14D4EB163F273CFAAB8A65CC5BE72")
    public String getUrl() {
        String varB4EAC82CA7396A68D541C85D26508E83_769437630 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_769437630 = mUrl;
        varB4EAC82CA7396A68D541C85D26508E83_769437630.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_769437630;
        // ---------- Original Method ----------
        //return mUrl;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.217 -0400", hash_original_method = "AE664F52BD7226DBAA3D1D1034C9653E", hash_generated_method = "57A8A5AB3330BAE0C341CD5EF78DF865")
    public boolean addError(int error) {
        boolean rval;
        rval = (0 <= error && error < SslError.SSL_MAX_ERROR);
        {
            mErrors |= (0x1 << error);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_802368043 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_802368043;
        // ---------- Original Method ----------
        //boolean rval = (0 <= error && error < SslError.SSL_MAX_ERROR);
        //if (rval) {
            //mErrors |= (0x1 << error);
        //}
        //return rval;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.242 -0400", hash_original_method = "B3A224AA064D57107491E8991A407E79", hash_generated_method = "7D24B347F3B60AF9E7E59DE2A736FBA5")
    public boolean hasError(int error) {
        boolean rval;
        rval = (0 <= error && error < SslError.SSL_MAX_ERROR);
        {
            rval = ((mErrors & (0x1 << error)) != 0);
        } //End block
        addTaint(error);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_745876808 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_745876808;
        // ---------- Original Method ----------
        //boolean rval = (0 <= error && error < SslError.SSL_MAX_ERROR);
        //if (rval) {
            //rval = ((mErrors & (0x1 << error)) != 0);
        //}
        //return rval;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.243 -0400", hash_original_method = "3A5499989FF366B2E4D135ECA3891E4C", hash_generated_method = "9564104978F265E49670AA1258358FE4")
    public int getPrimaryError() {
        {
            {
                int error;
                error = SslError.SSL_MAX_ERROR - 1;
            } //End collapsed parenthetic
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1311417421 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1311417421;
        // ---------- Original Method ----------
        //if (mErrors != 0) {
            //for (int error = SslError.SSL_MAX_ERROR - 1; error >= 0; --error) {
                //if ((mErrors & (0x1 << error)) != 0) {
                    //return error;
                //}
            //}
            //assert false;
        //}
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.261 -0400", hash_original_method = "18A0C6CD1FD66E60B7FF0A9F205CF54C", hash_generated_method = "B008B84D8D40471C90A068A66ABA1703")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_368346945 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_368346945 = "primary error: " + getPrimaryError() +
                " certificate: " + getCertificate() +
                " on URL: " + getUrl();
        varB4EAC82CA7396A68D541C85D26508E83_368346945.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_368346945;
        // ---------- Original Method ----------
        //return "primary error: " + getPrimaryError() +
                //" certificate: " + getCertificate() +
                //" on URL: " + getUrl();
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.261 -0400", hash_original_field = "D2EA2C10F5328BED16ECA1B1C3232857", hash_generated_field = "41D8CEB3ECE7A9944FA4156476889EAF")

    public static final int SSL_NOTYETVALID = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.261 -0400", hash_original_field = "E3090C974939AF365323AF4AB9F65BB8", hash_generated_field = "BAAD9CBD08CD0D2093B10402B8464A98")

    public static final int SSL_EXPIRED = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.262 -0400", hash_original_field = "9B753F19A5B24F8D81CE7F53EB7231DB", hash_generated_field = "13B7485113DA8A602D91A2F53C58C15F")

    public static final int SSL_IDMISMATCH = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.262 -0400", hash_original_field = "A972E47F33ED55CA475DE44DDF17D784", hash_generated_field = "0E952E7AEE36B79768B89A0EECDF70AB")

    public static final int SSL_UNTRUSTED = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.262 -0400", hash_original_field = "E39EE78A32105F7C1CEDD9EFE4B572F8", hash_generated_field = "7A71850528D1C5A05BCC2F8DAA5B23B9")

    public static final int SSL_DATE_INVALID = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.262 -0400", hash_original_field = "5BB142B47414CD2F616DDAF6DC30267F", hash_generated_field = "37C2C751255A73F019D90F63D8AA6D24")

    public static final int SSL_INVALID = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:22.262 -0400", hash_original_field = "088EEB373D581113C76F39764FE6E168", hash_generated_field = "751C3F66A9B17BB4E0BF7C23C8DBFC0A")

    @Deprecated
    public static final int SSL_MAX_ERROR = 6;
}

