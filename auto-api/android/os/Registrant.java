package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class Registrant {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.976 -0400", hash_original_field = "619B2A081B6E7006662C823A3E45AA2E", hash_generated_field = "0D5560AD898CE7ED29D9B0190B0760A0")

    WeakReference refH;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.976 -0400", hash_original_field = "4A2028ECEAC5E1F4D252EA13C71ECEC6", hash_generated_field = "6100FAC75E91CAC232945E82029A9682")

    int what;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.976 -0400", hash_original_field = "25C84ECB718C6159E9324F086F630B67", hash_generated_field = "F7E748C8E322C0020C08D9F5DB2D53B3")

    Object userObj;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.977 -0400", hash_original_method = "5F497FB9D04E2FF153E80911709BB474", hash_generated_method = "444AF8391A2EAFF305EC7E9002DF8C54")
    public  Registrant(Handler h, int what, Object obj) {
        refH = new WeakReference(h);
        this.what = what;
        userObj = obj;
        // ---------- Original Method ----------
        //refH = new WeakReference(h);
        //this.what = what;
        //userObj = obj;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.977 -0400", hash_original_method = "AD65744D6793AC8F89861EE1586F2E60", hash_generated_method = "0652DDD73EE83AEB0035EB645B57E65A")
    public void clear() {
        refH = null;
        userObj = null;
        // ---------- Original Method ----------
        //refH = null;
        //userObj = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.978 -0400", hash_original_method = "4409C699F4CAB16C2D504E283EFD3CDE", hash_generated_method = "28D035BF35B005A395534D365D96D57D")
    public void notifyRegistrant() {
        internalNotifyRegistrant (null, null);
        // ---------- Original Method ----------
        //internalNotifyRegistrant (null, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.978 -0400", hash_original_method = "64830107363F59A49C8D9CD8F53D1153", hash_generated_method = "46B86220224BBE554C6C21EAF79941A3")
    public void notifyResult(Object result) {
        internalNotifyRegistrant (result, null);
        addTaint(result.getTaint());
        // ---------- Original Method ----------
        //internalNotifyRegistrant (result, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:26.982 -0400", hash_original_method = "3375894D9F21481D987FA847F34F65EF", hash_generated_method = "6889968B02AE2A3512BF312AE25F4B67")
    public void notifyException(Throwable exception) {
        internalNotifyRegistrant (null, exception);
        addTaint(exception.getTaint());
        // ---------- Original Method ----------
        //internalNotifyRegistrant (null, exception);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.076 -0400", hash_original_method = "5E7A4559085AA819B0F18D8B5740229E", hash_generated_method = "CD48424D402122C12CA71365CDA1637A")
    public void notifyRegistrant(AsyncResult ar) {
        internalNotifyRegistrant (ar.result, ar.exception);
        addTaint(ar.getTaint());
        // ---------- Original Method ----------
        //internalNotifyRegistrant (ar.result, ar.exception);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.077 -0400", hash_original_method = "8E93682DAE1125F8892DB75F842EE54A", hash_generated_method = "309A4AD1BD630C1D4295637D0C7F2C0E")
     void internalNotifyRegistrant(Object result, Throwable exception) {
        Handler h;
        h = getHandler();
        {
            clear();
        } //End block
        {
            Message msg;
            msg = Message.obtain();
            msg.what = what;
            msg.obj = new AsyncResult(userObj, result, exception);
            h.sendMessage(msg);
        } //End block
        addTaint(result.getTaint());
        addTaint(exception.getTaint());
        // ---------- Original Method ----------
        //Handler h = getHandler();
        //if (h == null) {
            //clear();
        //} else {
            //Message msg = Message.obtain();
            //msg.what = what;
            //msg.obj = new AsyncResult(userObj, result, exception);
            //h.sendMessage(msg);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.078 -0400", hash_original_method = "D348E31FC7F90016E841E35B51E50760", hash_generated_method = "E4F69376411389D7D99FF67CB656F250")
    public Message messageForRegistrant() {
        Message varB4EAC82CA7396A68D541C85D26508E83_1998096229 = null; //Variable for return #1
        Message varB4EAC82CA7396A68D541C85D26508E83_1446518120 = null; //Variable for return #2
        Handler h;
        h = getHandler();
        {
            clear();
            varB4EAC82CA7396A68D541C85D26508E83_1998096229 = null;
        } //End block
        {
            Message msg;
            msg = h.obtainMessage();
            msg.what = what;
            msg.obj = userObj;
            varB4EAC82CA7396A68D541C85D26508E83_1446518120 = msg;
        } //End block
        Message varA7E53CE21691AB073D9660D615818899_620513599; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_620513599 = varB4EAC82CA7396A68D541C85D26508E83_1998096229;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_620513599 = varB4EAC82CA7396A68D541C85D26508E83_1446518120;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_620513599.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_620513599;
        // ---------- Original Method ----------
        //Handler h = getHandler();
        //if (h == null) {
            //clear();
            //return null;
        //} else {
            //Message msg = h.obtainMessage();
            //msg.what = what;
            //msg.obj = userObj;
            //return msg;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:27.088 -0400", hash_original_method = "7FEDB520AB82A5F00001E1B2C02807FF", hash_generated_method = "A6D3258AB000840F03D4D8B5FBFEEF23")
    public Handler getHandler() {
        Handler varB4EAC82CA7396A68D541C85D26508E83_364843807 = null; //Variable for return #1
        Handler varB4EAC82CA7396A68D541C85D26508E83_1575149521 = null; //Variable for return #2
        varB4EAC82CA7396A68D541C85D26508E83_364843807 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1575149521 = (Handler) refH.get();
        Handler varA7E53CE21691AB073D9660D615818899_1131322316; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1131322316 = varB4EAC82CA7396A68D541C85D26508E83_364843807;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1131322316 = varB4EAC82CA7396A68D541C85D26508E83_1575149521;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1131322316.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1131322316;
        // ---------- Original Method ----------
        //if (refH == null)
            //return null;
        //return (Handler) refH.get();
    }

    
}

