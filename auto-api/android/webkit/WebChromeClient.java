package android.webkit;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;

public class WebChromeClient {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.812 -0400", hash_original_method = "99482C8BD0C5E621D29A3393913944E6", hash_generated_method = "99482C8BD0C5E621D29A3393913944E6")
    public WebChromeClient ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.812 -0400", hash_original_method = "0356D3C5779031E83EBAA5536F22FD2C", hash_generated_method = "B9E24D0ACB0DE27D94879C7EAF6FDD4F")
    public void onProgressChanged(WebView view, int newProgress) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(newProgress);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.813 -0400", hash_original_method = "EF8501574F8D969A2FEBAA77F34054B1", hash_generated_method = "6F589466EC18F11268D0E4CAF10507B6")
    public void onReceivedTitle(WebView view, String title) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(title.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.813 -0400", hash_original_method = "29596704FB7D5BB460F59F26BE233C70", hash_generated_method = "9CF423C34FBC5B290A66B5AB9DB8C08B")
    public void onReceivedIcon(WebView view, Bitmap icon) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(icon.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.813 -0400", hash_original_method = "A4C5B5257D00BF3A62B0EECD068EB4AE", hash_generated_method = "66EC4FE9A91B268E9D376343AEF09182")
    public void onReceivedTouchIconUrl(WebView view, String url,
            boolean precomposed) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(url.getTaint());
        addTaint(precomposed);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.814 -0400", hash_original_method = "77F78B4AA1FEBCA4548885095C178085", hash_generated_method = "3EB4841132FBCD03ECEA1260761CC0E6")
    public void onShowCustomView(View view, CustomViewCallback callback) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(callback.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.814 -0400", hash_original_method = "42AC916863A44836B06C58A8705D2934", hash_generated_method = "1CF08050D1303B3506FD4BA9073CE684")
    public void onShowCustomView(View view, int requestedOrientation,
            CustomViewCallback callback) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(requestedOrientation);
        addTaint(callback.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.814 -0400", hash_original_method = "3C82DC078459A71064D67069FEC24583", hash_generated_method = "63612F93E831F6A65719E999215E74B0")
    public void onHideCustomView() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.835 -0400", hash_original_method = "0F7608F947A0ECBD179808AAF0AFEB9B", hash_generated_method = "16AB92C8CCCC0F5BDA6DCC03EADE12F3")
    public boolean onCreateWindow(WebView view, boolean isDialog,
            boolean isUserGesture, Message resultMsg) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(isDialog);
        addTaint(isUserGesture);
        addTaint(resultMsg.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_952916845 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_952916845;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.837 -0400", hash_original_method = "9D3C2A06B7A580B802B062ACCF072DA0", hash_generated_method = "64D238AFAD4B295CDFBA5195914F9D59")
    public void onRequestFocus(WebView view) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.837 -0400", hash_original_method = "20C36406AC14D1B2BB4595DEF25401D6", hash_generated_method = "17B0D6382CA8583138299CC5368185E2")
    public void onCloseWindow(WebView window) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(window.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.843 -0400", hash_original_method = "B665260C93890B7DFFFEE826876C181C", hash_generated_method = "F6096253629ED8F5BE77794649D7BCD7")
    public boolean onJsAlert(WebView view, String url, String message,
            JsResult result) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(url.getTaint());
        addTaint(message.getTaint());
        addTaint(result.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_674797070 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_674797070;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.843 -0400", hash_original_method = "96B1179CA869CC7F0C650459C80E91A1", hash_generated_method = "EA1DD80CD05DE680488CFE03D59331EA")
    public boolean onJsConfirm(WebView view, String url, String message,
            JsResult result) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(url.getTaint());
        addTaint(message.getTaint());
        addTaint(result.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_525977588 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_525977588;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.843 -0400", hash_original_method = "B0F8165C36C1E06488928BD9B36CF34F", hash_generated_method = "F37832433EF7D621A9A8D435F1717F57")
    public boolean onJsPrompt(WebView view, String url, String message,
            String defaultValue, JsPromptResult result) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(url.getTaint());
        addTaint(message.getTaint());
        addTaint(defaultValue.getTaint());
        addTaint(result.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1812204021 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1812204021;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.844 -0400", hash_original_method = "9A70F346469CE5ADB362459FFD66F0CC", hash_generated_method = "0529922D14E9EE5ABDA5BF2ED1404668")
    public boolean onJsBeforeUnload(WebView view, String url, String message,
            JsResult result) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(view.getTaint());
        addTaint(url.getTaint());
        addTaint(message.getTaint());
        addTaint(result.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2133457104 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2133457104;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.844 -0400", hash_original_method = "E698A9F452C6783F3C6DB7E7A071CA1D", hash_generated_method = "C66350AF13D637D903AA9C24740A0FFF")
    public void onExceededDatabaseQuota(String url, String databaseIdentifier,
        long currentQuota, long estimatedSize, long totalUsedQuota,
        WebStorage.QuotaUpdater quotaUpdater) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        quotaUpdater.updateQuota(currentQuota);
        addTaint(url.getTaint());
        addTaint(databaseIdentifier.getTaint());
        addTaint(currentQuota);
        addTaint(estimatedSize);
        addTaint(totalUsedQuota);
        addTaint(quotaUpdater.getTaint());
        // ---------- Original Method ----------
        //quotaUpdater.updateQuota(currentQuota);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.845 -0400", hash_original_method = "EC4B1817B796D6243C1BADFF5A19DD19", hash_generated_method = "1A7A542466820953CE5E47C07E350550")
    public void onReachedMaxAppCacheSize(long spaceNeeded, long totalUsedQuota,
            WebStorage.QuotaUpdater quotaUpdater) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        quotaUpdater.updateQuota(0);
        addTaint(spaceNeeded);
        addTaint(totalUsedQuota);
        addTaint(quotaUpdater.getTaint());
        // ---------- Original Method ----------
        //quotaUpdater.updateQuota(0);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.845 -0400", hash_original_method = "98993092A89284EC0BBF79A8D8B73F2B", hash_generated_method = "1D7210C647DA24CAC84B03D607A3FA75")
    public void onGeolocationPermissionsShowPrompt(String origin,
            GeolocationPermissions.Callback callback) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(origin.getTaint());
        addTaint(callback.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.845 -0400", hash_original_method = "C2C3AAB43EA40B6144BCEFE67B905422", hash_generated_method = "09A93B8FC5C244974809187C87D6D13D")
    public void onGeolocationPermissionsHidePrompt() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.851 -0400", hash_original_method = "D3576F706DC2F920D86267B1909BCF87", hash_generated_method = "EFCD8F151E3EDEFF7BD935FD8A72F1C3")
    public boolean onJsTimeout() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1613307629 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1613307629;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.852 -0400", hash_original_method = "79CD152A32E05A12E47F3ADA435EA3CF", hash_generated_method = "8355126BE77A2C1839FAE12F77E14C55")
    @Deprecated
    public void onConsoleMessage(String message, int lineNumber, String sourceID) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(message.getTaint());
        addTaint(lineNumber);
        addTaint(sourceID.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.852 -0400", hash_original_method = "CFDCDEC28BDAF7613A605474C11A52D7", hash_generated_method = "2C73051BDF2D6495237B3C7B0203AD3B")
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        onConsoleMessage(consoleMessage.message(), consoleMessage.lineNumber(),
                consoleMessage.sourceId());
        addTaint(consoleMessage.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1939609565 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1939609565;
        // ---------- Original Method ----------
        //onConsoleMessage(consoleMessage.message(), consoleMessage.lineNumber(),
                //consoleMessage.sourceId());
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.879 -0400", hash_original_method = "B12C654EAF6D1EF1BD2CB65AEE47A82B", hash_generated_method = "54E48A652B09E12003C33BF18AEB47FD")
    public Bitmap getDefaultVideoPoster() {
        Bitmap varB4EAC82CA7396A68D541C85D26508E83_54939443 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_54939443 = null;
        varB4EAC82CA7396A68D541C85D26508E83_54939443.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_54939443;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.883 -0400", hash_original_method = "72F535BEAD962B4F42D879A83B63BF5A", hash_generated_method = "260C86BF170EB6E46F3FDB98484E7146")
    public View getVideoLoadingProgressView() {
        View varB4EAC82CA7396A68D541C85D26508E83_1651058325 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1651058325 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1651058325.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1651058325;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.883 -0400", hash_original_method = "15B2ED72F970B566935619473880B5EF", hash_generated_method = "BA512EB5D2761BE8B0438D5D592FEEEA")
    public void getVisitedHistory(ValueCallback<String[]> callback) {
        addTaint(callback.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.884 -0400", hash_original_method = "DA085B71ADFBAF37C9145F2BAEC7CA78", hash_generated_method = "F3857862C42019BD010F57F5452ADEF4")
    public void openFileChooser(ValueCallback<Uri> uploadFile, String acceptType) {
        uploadFile.onReceiveValue(null);
        addTaint(uploadFile.getTaint());
        addTaint(acceptType.getTaint());
        // ---------- Original Method ----------
        //uploadFile.onReceiveValue(null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.884 -0400", hash_original_method = "BB19EC4B0210D5A42E9ED0382D14771D", hash_generated_method = "3785D8125E00E011E4B23B7F3B399B15")
    public void setInstallableWebApp() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:59.884 -0400", hash_original_method = "681C2C146739845C582C6BB934543E3C", hash_generated_method = "C666B0A683AEF8D6BD999984A8F9AA26")
    public void setupAutoFill(Message msg) {
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
    }

    
    public interface CustomViewCallback {
        
        public void onCustomViewHidden();
    }
    
}

