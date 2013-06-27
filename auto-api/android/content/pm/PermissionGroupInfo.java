package android.content.pm;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class PermissionGroupInfo extends PackageItemInfo implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.305 -0400", hash_original_field = "392A6E47A749448B7E51283719BBB183", hash_generated_field = "7C42762252277BD13653A4A0CE44470E")

    public int descriptionRes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.305 -0400", hash_original_field = "F132344C9D3F23D988965BDF2FE9E96E", hash_generated_field = "DC8641D3F3115BD1A7EE01A008EB7DE8")

    public CharSequence nonLocalizedDescription;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.326 -0400", hash_original_method = "82344B3D2D2745586AE3E2C39F67E56D", hash_generated_method = "C344FD7EBA0ACA0405579BE9BC8FB4E5")
    public  PermissionGroupInfo() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.327 -0400", hash_original_method = "86BDB0F775205D222755746395606069", hash_generated_method = "9E42539179CB72B7DF3C7D104B792B22")
    public  PermissionGroupInfo(PermissionGroupInfo orig) {
        super(orig);
        descriptionRes = orig.descriptionRes;
        nonLocalizedDescription = orig.nonLocalizedDescription;
        // ---------- Original Method ----------
        //descriptionRes = orig.descriptionRes;
        //nonLocalizedDescription = orig.nonLocalizedDescription;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.329 -0400", hash_original_method = "251C6C67446670431867B6BD14427B23", hash_generated_method = "C80CEF62BF9EA33C58DF216289241944")
    private  PermissionGroupInfo(Parcel source) {
        super(source);
        descriptionRes = source.readInt();
        nonLocalizedDescription = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
        // ---------- Original Method ----------
        //descriptionRes = source.readInt();
        //nonLocalizedDescription = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.348 -0400", hash_original_method = "EA6AC5CC522A2884BAFD1D1CC4525D81", hash_generated_method = "7CD0599ECBB68169510BCE984BF489D6")
    public CharSequence loadDescription(PackageManager pm) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1311300321 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_456022474 = null; //Variable for return #2
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1332337820 = null; //Variable for return #3
        {
            varB4EAC82CA7396A68D541C85D26508E83_1311300321 = nonLocalizedDescription;
        } //End block
        {
            CharSequence label;
            label = pm.getText(packageName, descriptionRes, null);
            {
                varB4EAC82CA7396A68D541C85D26508E83_456022474 = label;
            } //End block
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1332337820 = null;
        addTaint(pm.getTaint());
        CharSequence varA7E53CE21691AB073D9660D615818899_2020857314; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2020857314 = varB4EAC82CA7396A68D541C85D26508E83_1311300321;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_2020857314 = varB4EAC82CA7396A68D541C85D26508E83_456022474;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2020857314 = varB4EAC82CA7396A68D541C85D26508E83_1332337820;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2020857314.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2020857314;
        // ---------- Original Method ----------
        //if (nonLocalizedDescription != null) {
            //return nonLocalizedDescription;
        //}
        //if (descriptionRes != 0) {
            //CharSequence label = pm.getText(packageName, descriptionRes, null);
            //if (label != null) {
                //return label;
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.350 -0400", hash_original_method = "712313A7FB39E8068296CCC509012BB3", hash_generated_method = "B82AC0B30D954FBB04C1AE8591BBB483")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2067693488 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2067693488 = "PermissionGroupInfo{"
            + Integer.toHexString(System.identityHashCode(this))
            + " " + name + "}";
        varB4EAC82CA7396A68D541C85D26508E83_2067693488.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2067693488;
        // ---------- Original Method ----------
        //return "PermissionGroupInfo{"
            //+ Integer.toHexString(System.identityHashCode(this))
            //+ " " + name + "}";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.351 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "D48D0F1605FFA3AE7CADE76CFDE4474E")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_713294552 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_713294552;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.356 -0400", hash_original_method = "48DC2E300D4B0399A780C6669617C26B", hash_generated_method = "78475FB280E9FDF2A4BBFEC200A2A74F")
    public void writeToParcel(Parcel dest, int parcelableFlags) {
        super.writeToParcel(dest, parcelableFlags);
        dest.writeInt(descriptionRes);
        TextUtils.writeToParcel(nonLocalizedDescription, dest, parcelableFlags);
        addTaint(dest.getTaint());
        addTaint(parcelableFlags);
        // ---------- Original Method ----------
        //super.writeToParcel(dest, parcelableFlags);
        //dest.writeInt(descriptionRes);
        //TextUtils.writeToParcel(nonLocalizedDescription, dest, parcelableFlags);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:03.372 -0400", hash_original_field = "C5F42F5EC446394F1B5E3897D28E68B6", hash_generated_field = "157E7C3FA4773BF05F9A4ED13A8D2703")

    public static final Creator<PermissionGroupInfo> CREATOR =
            new Creator<PermissionGroupInfo>() {
        public PermissionGroupInfo createFromParcel(Parcel source) {
            return new PermissionGroupInfo(source);
        }
        public PermissionGroupInfo[] newArray(int size) {
            return new PermissionGroupInfo[size];
        }
    };
}

