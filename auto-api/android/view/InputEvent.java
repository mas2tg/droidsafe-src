package android.view;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class InputEvent implements Parcelable {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:47.411 -0400", hash_original_method = "5E30BC92EB346FB6C373466BBBDCD9C6", hash_generated_method = "4C32157640739D892888BF135F5DE17B")
      InputEvent() {
        // ---------- Original Method ----------
    }

    
    public abstract int getDeviceId();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:47.413 -0400", hash_original_method = "65C564B77C92C924B4A35B510EAEB2C6", hash_generated_method = "FF4348AAFFD2075777EABB5D4C132C67")
    public final InputDevice getDevice() {
        InputDevice varB4EAC82CA7396A68D541C85D26508E83_793640588 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_793640588 = InputDevice.getDevice(getDeviceId());
        varB4EAC82CA7396A68D541C85D26508E83_793640588.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_793640588;
        // ---------- Original Method ----------
        //return InputDevice.getDevice(getDeviceId());
    }

    
    public abstract int getSource();

    
    public abstract void setSource(int source);

    
    public abstract InputEvent copy();

    
    public abstract void recycle();

    
    public abstract boolean isTainted();

    
    public abstract void setTainted(boolean tainted);

    
    public abstract long getEventTimeNano();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:47.425 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "CF485D3FBB53A8E75F9C61F9E70AC512")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_338759531 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_338759531;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:47.426 -0400", hash_original_field = "9FCAD6001E54B39BF7B91756522D50FA", hash_generated_field = "0CC582244B5CFF535AF801E81340AA3C")

    protected static int PARCEL_TOKEN_MOTION_EVENT = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:47.426 -0400", hash_original_field = "32C6904ED6B2400200DEC29637EE8125", hash_generated_field = "6118031713C089EE76041B40189DC50D")

    protected static int PARCEL_TOKEN_KEY_EVENT = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:47.426 -0400", hash_original_field = "04B291F0A19F70F4DCABF30040F87AB0", hash_generated_field = "DFF9DB35F1A192334CC0B98EE577AF20")

    public static final Parcelable.Creator<InputEvent> CREATOR
            = new Parcelable.Creator<InputEvent>() {
        public InputEvent createFromParcel(Parcel in) {
            int token = in.readInt();
            if (token == PARCEL_TOKEN_KEY_EVENT) {
                return KeyEvent.createFromParcelBody(in);
            } else if (token == PARCEL_TOKEN_MOTION_EVENT) {
                return MotionEvent.createFromParcelBody(in);
            } else {
                throw new IllegalStateException("Unexpected input event type token in parcel.");
            }
        }
        
        public InputEvent[] newArray(int size) {
            return new InputEvent[size];
        }
    };
}

