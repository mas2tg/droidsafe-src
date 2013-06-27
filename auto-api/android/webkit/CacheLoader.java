package android.webkit;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.net.http.Headers;
import android.text.TextUtils;
import android.webkit.JniUtil;

class CacheLoader extends StreamLoader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:56.939 -0400", hash_original_field = "214CBCF3E2AD0D57BF05ACDE798A8E91", hash_generated_field = "B8E944361CAE1A88801CDDF7F334AC6D")

    CacheManager.CacheResult mCacheResult;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:56.939 -0400", hash_original_method = "5AF96706DF9FEED69E5A85053239A8E2", hash_generated_method = "B65A0BAE1301533AD63363BBCEF1A4B3")
      CacheLoader(LoadListener loadListener, CacheManager.CacheResult result) {
        super(loadListener);
        mCacheResult = result;
        addTaint(loadListener.getTaint());
        // ---------- Original Method ----------
        //assert !JniUtil.useChromiumHttpStack();
        //mCacheResult = result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:56.940 -0400", hash_original_method = "5DFC3C12C1D0EBA5023FB5F302EE8813", hash_generated_method = "607673EA9FA061B86937E794410F6B13")
    @Override
    protected boolean setupStreamAndSendStatus() {
        mDataStream = mCacheResult.inStream;
        mContentLength = mCacheResult.contentLength;
        mLoadListener.status(1, 1, mCacheResult.httpStatusCode, "OK");
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_591593418 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_591593418;
        // ---------- Original Method ----------
        //mDataStream = mCacheResult.inStream;
        //mContentLength = mCacheResult.contentLength;
        //mLoadListener.status(1, 1, mCacheResult.httpStatusCode, "OK");
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:56.940 -0400", hash_original_method = "09EA95975DEA7D7D43A5B322B32B5DDD", hash_generated_method = "33A811948C8F2759DD6686F41E806A1D")
    @Override
    protected void buildHeaders(Headers headers) {
        StringBuilder sb;
        sb = new StringBuilder(mCacheResult.mimeType);
        {
            boolean varAA9DD98176BC7E4C558C312499F0DC87_690671075 = (!TextUtils.isEmpty(mCacheResult.encoding));
            {
                sb.append(';');
                sb.append(mCacheResult.encoding);
            } //End block
        } //End collapsed parenthetic
        headers.setContentType(sb.toString());
        {
            boolean var2AB1B988E1A823180096207E3A1DD69B_1102263656 = (!TextUtils.isEmpty(mCacheResult.location));
            {
                headers.setLocation(mCacheResult.location);
            } //End block
        } //End collapsed parenthetic
        {
            boolean var5A5B7E55E6141F5C77AA200692ADA201_970780793 = (!TextUtils.isEmpty(mCacheResult.expiresString));
            {
                headers.setExpires(mCacheResult.expiresString);
            } //End block
        } //End collapsed parenthetic
        {
            boolean varF419A7BAAB919C8802ABABFFAE8A7582_857737801 = (!TextUtils.isEmpty(mCacheResult.contentdisposition));
            {
                headers.setContentDisposition(mCacheResult.contentdisposition);
            } //End block
        } //End collapsed parenthetic
        {
            boolean varA478B5521C4B854F39D54F90D5ED7D8B_1403395041 = (!TextUtils.isEmpty(mCacheResult.crossDomain));
            {
                headers.setXPermittedCrossDomainPolicies(mCacheResult.crossDomain);
            } //End block
        } //End collapsed parenthetic
        addTaint(headers.getTaint());
        // ---------- Original Method ----------
        //StringBuilder sb = new StringBuilder(mCacheResult.mimeType);
        //if (!TextUtils.isEmpty(mCacheResult.encoding)) {
            //sb.append(';');
            //sb.append(mCacheResult.encoding);
        //}
        //headers.setContentType(sb.toString());
        //if (!TextUtils.isEmpty(mCacheResult.location)) {
            //headers.setLocation(mCacheResult.location);
        //}
        //if (!TextUtils.isEmpty(mCacheResult.expiresString)) {
            //headers.setExpires(mCacheResult.expiresString);
        //}
        //if (!TextUtils.isEmpty(mCacheResult.contentdisposition)) {
            //headers.setContentDisposition(mCacheResult.contentdisposition);
        //}
        //if (!TextUtils.isEmpty(mCacheResult.crossDomain)) {
            //headers.setXPermittedCrossDomainPolicies(mCacheResult.crossDomain);
        //}
    }

    
}

