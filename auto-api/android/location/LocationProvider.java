package android.location;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.RemoteException;
import android.util.Log;

public abstract class LocationProvider {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.343 -0400", hash_original_field = "311C2C8498DF6A626CBDB8AA4193499C", hash_generated_field = "886C24C67739C97CF77B8DD239E412F9")

    private String mName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.343 -0400", hash_original_field = "D96EB21FC1A83B484FAE33A12B05D9CB", hash_generated_field = "172E00EA90AE9807366F5CA34B42799B")

    private ILocationManager mService;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.344 -0400", hash_original_method = "BAF0DB5834B7193F7ED3616F680059B0", hash_generated_method = "622691E3DF2675B831E16E9376F95A12")
    public  LocationProvider(String name, ILocationManager service) {
        {
            boolean varB4D0ACA360CC3A8CDEEB8791521063B2_405981965 = (name.matches(BAD_CHARS_REGEX));
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("name " + name +
                " contains an illegal character");
            } //End block
        } //End collapsed parenthetic
        mName = name;
        mService = service;
        // ---------- Original Method ----------
        //if (name.matches(BAD_CHARS_REGEX)) {
            //throw new IllegalArgumentException("name " + name +
                //" contains an illegal character");
        //}
        //mName = name;
        //mService = service;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.356 -0400", hash_original_method = "9194A7433912D38B9A3F1171AC921C56", hash_generated_method = "8765E17044583B3F04379F48F9285205")
    public String getName() {
        String varB4EAC82CA7396A68D541C85D26508E83_543381202 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_543381202 = mName;
        varB4EAC82CA7396A68D541C85D26508E83_543381202.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_543381202;
        // ---------- Original Method ----------
        //return mName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.368 -0400", hash_original_method = "635BF1E9CDC5B7DBCFDF1ACD3F6E624D", hash_generated_method = "3B80874788DE56D2B7BF56A8069E43C1")
    public boolean meetsCriteria(Criteria criteria) {
        try 
        {
            boolean var195CD10D7384B80733627E7A4A95E4BA_1521976973 = (mService.providerMeetsCriteria(mName, criteria));
        } //End block
        catch (RemoteException e)
        { }
        addTaint(criteria.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1739916393 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1739916393;
        // ---------- Original Method ----------
        //try {
            //return mService.providerMeetsCriteria(mName, criteria);
        //} catch (RemoteException e) {
            //Log.e(TAG, "meetsCriteria: RemoteException", e);
            //return false;
        //}
    }

    
    public abstract boolean requiresNetwork();

    
    public abstract boolean requiresSatellite();

    
    public abstract boolean requiresCell();

    
    public abstract boolean hasMonetaryCost();

    
    public abstract boolean supportsAltitude();

    
    public abstract boolean supportsSpeed();

    
    public abstract boolean supportsBearing();

    
    public abstract int getPowerRequirement();

    
    public abstract int getAccuracy();

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.388 -0400", hash_original_field = "B067EBE768F4DC555D675AFC3B7A3A83", hash_generated_field = "F53070F0A1AD7C67842900EDE1A2483F")

    private static String TAG = "LocationProvider";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.388 -0400", hash_original_field = "1BD760940DCF4B31479C267B709A7056", hash_generated_field = "8579B5A4D942E126D468733D0F90991A")

    static String BAD_CHARS_REGEX = "[^a-zA-Z0-9]";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.388 -0400", hash_original_field = "379AD3D6C566357A345692A65FD14593", hash_generated_field = "7F47E89ED92EB0041561E3E6FDFC0CA8")

    public static final int OUT_OF_SERVICE = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.388 -0400", hash_original_field = "2AAE365236DECFBEDF3C4DBC04BC833A", hash_generated_field = "8FC12DE1A6F66422CA33C5DF3A2CD280")

    public static final int TEMPORARILY_UNAVAILABLE = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:17.388 -0400", hash_original_field = "3D413F7DAEB0CA418E5A18E317C11370", hash_generated_field = "299301506C5B5A1C60298C6C87349C6B")

    public static final int AVAILABLE = 2;
}

