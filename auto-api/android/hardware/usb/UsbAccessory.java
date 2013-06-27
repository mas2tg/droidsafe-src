package android.hardware.usb;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class UsbAccessory implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.203 -0400", hash_original_field = "6D6C47A5EB4751EE95A0B83ED231F29F", hash_generated_field = "FB8FA14B444DCDECB7E1F2DE256B790B")

    private String mManufacturer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.203 -0400", hash_original_field = "E9F27DD04F1F9F18E074C35BBF2786B6", hash_generated_field = "35458D5F083D1893A2F645F3B2CF5FC8")

    private String mModel;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.203 -0400", hash_original_field = "FF2B9B684DDD70D7BE468C8D9A54343D", hash_generated_field = "D58E2E2E369193E8B6C54168B334B477")

    private String mDescription;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.203 -0400", hash_original_field = "31DABD0EACF4143CCA942BDEEA018E36", hash_generated_field = "AC3A255360E36E7AB143ED8BE7D264A7")

    private String mVersion;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.203 -0400", hash_original_field = "5FBE3730DCFF234F97B15868D5CE649D", hash_generated_field = "E9F1A1B9306C90FC7C133E78A4DA2C70")

    private String mUri;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.203 -0400", hash_original_field = "8CC0BA4F3132C785BD42D542F7CA8632", hash_generated_field = "FBBAA9495E4F4854D260B36E22AD653D")

    private String mSerial;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.204 -0400", hash_original_method = "7CD9FDFE8EAEAE0E43B9A1D60D60D495", hash_generated_method = "2BD440FEB3D93B660A14AFD3D7FACE44")
    public  UsbAccessory(String manufacturer, String model, String description,
            String version, String uri, String serial) {
        mManufacturer = manufacturer;
        mModel = model;
        mDescription = description;
        mVersion = version;
        mUri = uri;
        mSerial = serial;
        // ---------- Original Method ----------
        //mManufacturer = manufacturer;
        //mModel = model;
        //mDescription = description;
        //mVersion = version;
        //mUri = uri;
        //mSerial = serial;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.207 -0400", hash_original_method = "D12B07FB292F613652E291AA784D1EC3", hash_generated_method = "85F4E0DF4FB13ED6AAC867EA2394FF31")
    public  UsbAccessory(String[] strings) {
        mManufacturer = strings[0];
        mModel = strings[1];
        mDescription = strings[2];
        mVersion = strings[3];
        mUri = strings[4];
        mSerial = strings[5];
        // ---------- Original Method ----------
        //mManufacturer = strings[0];
        //mModel = strings[1];
        //mDescription = strings[2];
        //mVersion = strings[3];
        //mUri = strings[4];
        //mSerial = strings[5];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.207 -0400", hash_original_method = "EECC97019E28DA07B84EC558152DCFEE", hash_generated_method = "E6B8BE0D7FF0134F4949625531DC7EBF")
    public String getManufacturer() {
        String varB4EAC82CA7396A68D541C85D26508E83_1866886967 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1866886967 = mManufacturer;
        varB4EAC82CA7396A68D541C85D26508E83_1866886967.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1866886967;
        // ---------- Original Method ----------
        //return mManufacturer;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.218 -0400", hash_original_method = "375C14568C2F8D8E7E614D0D011D7B99", hash_generated_method = "11C5736604E467E7E459D74EC4A325A2")
    public String getModel() {
        String varB4EAC82CA7396A68D541C85D26508E83_1118870677 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1118870677 = mModel;
        varB4EAC82CA7396A68D541C85D26508E83_1118870677.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1118870677;
        // ---------- Original Method ----------
        //return mModel;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.218 -0400", hash_original_method = "177DD147D2F75620FD2B154278EC57FA", hash_generated_method = "4DAE72CA61CD747CCBC8A0BD63C0F236")
    public String getDescription() {
        String varB4EAC82CA7396A68D541C85D26508E83_886729846 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_886729846 = mDescription;
        varB4EAC82CA7396A68D541C85D26508E83_886729846.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_886729846;
        // ---------- Original Method ----------
        //return mDescription;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.219 -0400", hash_original_method = "F243A33CF0A3D0D255225863927F4698", hash_generated_method = "752DE4E4F3F07634DFC8AD310B35E2D4")
    public String getVersion() {
        String varB4EAC82CA7396A68D541C85D26508E83_1875328516 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1875328516 = mVersion;
        varB4EAC82CA7396A68D541C85D26508E83_1875328516.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1875328516;
        // ---------- Original Method ----------
        //return mVersion;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.220 -0400", hash_original_method = "8CFE2355A63AF986F8238800728B9A56", hash_generated_method = "047FE9C892001D8585B40B4D9B789999")
    public String getUri() {
        String varB4EAC82CA7396A68D541C85D26508E83_314898806 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_314898806 = mUri;
        varB4EAC82CA7396A68D541C85D26508E83_314898806.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_314898806;
        // ---------- Original Method ----------
        //return mUri;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.227 -0400", hash_original_method = "E1067F8A99D04B6FDB11E19036F1F2CD", hash_generated_method = "A91AD3D701EE11101330C8D78E6F54AA")
    public String getSerial() {
        String varB4EAC82CA7396A68D541C85D26508E83_1870719751 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1870719751 = mSerial;
        varB4EAC82CA7396A68D541C85D26508E83_1870719751.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1870719751;
        // ---------- Original Method ----------
        //return mSerial;
    }

    
        private static boolean compare(String s1, String s2) {
        if (s1 == null) return (s2 == null);
        return s1.equals(s2);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.237 -0400", hash_original_method = "865A8510E9F7675674A503A19BC93814", hash_generated_method = "7C36DD7E657A54AE938C4F572EA7D9AA")
    @Override
    public boolean equals(Object obj) {
        {
            UsbAccessory accessory;
            accessory = (UsbAccessory)obj;
            boolean varA895D95C7854CC8CC90C4D356421ADA3_797126144 = ((compare(mManufacturer, accessory.getManufacturer()) &&
                    compare(mModel, accessory.getModel()) &&
                    compare(mDescription, accessory.getDescription()) &&
                    compare(mVersion, accessory.getVersion()) &&
                    compare(mUri, accessory.getUri()) &&
                    compare(mSerial, accessory.getSerial())));
        } //End block
        addTaint(obj.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_685852168 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_685852168;
        // ---------- Original Method ----------
        //if (obj instanceof UsbAccessory) {
            //UsbAccessory accessory = (UsbAccessory)obj;
            //return (compare(mManufacturer, accessory.getManufacturer()) &&
                    //compare(mModel, accessory.getModel()) &&
                    //compare(mDescription, accessory.getDescription()) &&
                    //compare(mVersion, accessory.getVersion()) &&
                    //compare(mUri, accessory.getUri()) &&
                    //compare(mSerial, accessory.getSerial()));
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.255 -0400", hash_original_method = "1CBDEBF34085121F316849C19724C53C", hash_generated_method = "D4585DD6DAD8A4F0462342DB87896F4D")
    @Override
    public int hashCode() {
        int var9F95CCB73C326710698733DF7B6AA12D_1773733581 = (((mManufacturer == null ? 0 : mManufacturer.hashCode()) ^
                (mModel == null ? 0 : mModel.hashCode()) ^
                (mDescription == null ? 0 : mDescription.hashCode()) ^
                (mVersion == null ? 0 : mVersion.hashCode()) ^
                (mUri == null ? 0 : mUri.hashCode()) ^
                (mSerial == null ? 0 : mSerial.hashCode()))); //DSFIXME:  CODE0008: Nested ternary operator in expression
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1759939588 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1759939588;
        // ---------- Original Method ----------
        //return ((mManufacturer == null ? 0 : mManufacturer.hashCode()) ^
                //(mModel == null ? 0 : mModel.hashCode()) ^
                //(mDescription == null ? 0 : mDescription.hashCode()) ^
                //(mVersion == null ? 0 : mVersion.hashCode()) ^
                //(mUri == null ? 0 : mUri.hashCode()) ^
                //(mSerial == null ? 0 : mSerial.hashCode()));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.256 -0400", hash_original_method = "95290F8A4A72A3956B1D8FB9C7186754", hash_generated_method = "6B50D7F8FEAB491620CAF7406D165777")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_14134362 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_14134362 = "UsbAccessory[mManufacturer=" + mManufacturer +
                            ", mModel=" + mModel +
                            ", mDescription=" + mDescription +
                            ", mVersion=" + mVersion +
                            ", mUri=" + mUri +
                            ", mSerial=" + mSerial + "]";
        varB4EAC82CA7396A68D541C85D26508E83_14134362.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_14134362;
        // ---------- Original Method ----------
        //return "UsbAccessory[mManufacturer=" + mManufacturer +
                            //", mModel=" + mModel +
                            //", mDescription=" + mDescription +
                            //", mVersion=" + mVersion +
                            //", mUri=" + mUri +
                            //", mSerial=" + mSerial + "]";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.257 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "2F831847F881730AF4770BDB96762295")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1389847884 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1389847884;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.260 -0400", hash_original_method = "5A34BF0EEFA04466D13EE884FC2C2BC9", hash_generated_method = "C3A9FCA09014C62D67343683D3BF908C")
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(mManufacturer);
        parcel.writeString(mModel);
        parcel.writeString(mDescription);
        parcel.writeString(mVersion);
        parcel.writeString(mUri);
        parcel.writeString(mSerial);
        addTaint(parcel.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //parcel.writeString(mManufacturer);
        //parcel.writeString(mModel);
        //parcel.writeString(mDescription);
        //parcel.writeString(mVersion);
        //parcel.writeString(mUri);
        //parcel.writeString(mSerial);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.261 -0400", hash_original_field = "570257644692EF1791FD6BF594DCB4C3", hash_generated_field = "992E4C9AB67678303464136AA79DC380")

    private static String TAG = "UsbAccessory";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:15.261 -0400", hash_original_field = "A3A2DE3014AFDD086B0F9108E7253288", hash_generated_field = "41EBB7534711D99912BB3375E9A3165A")

    public static final Parcelable.Creator<UsbAccessory> CREATOR =
        new Parcelable.Creator<UsbAccessory>() {
        public UsbAccessory createFromParcel(Parcel in) {
            String manufacturer = in.readString();
            String model = in.readString();
            String description = in.readString();
            String version = in.readString();
            String uri = in.readString();
            String serial = in.readString();
            return new UsbAccessory(manufacturer, model, description, version, uri, serial);
        }

        public UsbAccessory[] newArray(int size) {
            return new UsbAccessory[size];
        }
    };
}

