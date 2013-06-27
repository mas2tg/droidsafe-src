package android.net.wifi;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Parcelable;
import android.os.Parcel;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkUtils;
import java.net.InetAddress;
import java.net.Inet6Address;
import java.net.UnknownHostException;
import java.util.EnumMap;

public class WifiInfo implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "70A98F8E3B025E9E336D67915E7E13CE", hash_generated_field = "53C0C50586977D30F50A38A02FF5AA68")

    private SupplicantState mSupplicantState;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "1C1428D5777AF4409C8BF453AC7E458E", hash_generated_field = "8B037BB299AA86EC9205CCC26093C407")

    private String mBSSID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "7716CEC6DBA53009089E95C39E656047", hash_generated_field = "2B2BE2BFB640EA8BAB57AED2C4B7FB28")

    private String mSSID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "BE656451182C514680105DD47C42A32D", hash_generated_field = "7A5A39D03C1616F994D4D06922BB67CA")

    private int mNetworkId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "86A3E116AF4DD8599B45ADFA018A1AC3", hash_generated_field = "E44F3137D11F225B15705595FA8A88CF")

    private boolean mHiddenSSID;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "367DEE652AE08B1E7A6DD8CD03A62B84", hash_generated_field = "6944DD992E34997F099DF17CBFD1CEA4")

    private int mRssi;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "70D41883A6F12DC864CBBEF055901AAB", hash_generated_field = "43B3DE4173B552748C6B7489CCBEC17C")

    private int mLinkSpeed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "12F1774A6D777BB668453F898B159538", hash_generated_field = "8748C1AB2EADB5D1897B9503B257BEA4")

    private InetAddress mIpAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.605 -0400", hash_original_field = "DBFBD193BA28092C2860AF16BF0DB3E5", hash_generated_field = "3901352E95CA91998F9C2F8294C84B42")

    private String mMacAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.606 -0400", hash_original_field = "B89633D2CCA7286F7A10098841F72B41", hash_generated_field = "8A066F33F6CB5BC95F526BC987310751")

    private boolean mExplicitConnect;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.635 -0400", hash_original_method = "3BA330D18DA6D0534E844B32F499A548", hash_generated_method = "283DC6763562F72F36B3A0DB544BF2E3")
      WifiInfo() {
        mSSID = null;
        mBSSID = null;
        mNetworkId = -1;
        mSupplicantState = SupplicantState.UNINITIALIZED;
        mRssi = -9999;
        mLinkSpeed = -1;
        mHiddenSSID = false;
        mExplicitConnect = false;
        // ---------- Original Method ----------
        //mSSID = null;
        //mBSSID = null;
        //mNetworkId = -1;
        //mSupplicantState = SupplicantState.UNINITIALIZED;
        //mRssi = -9999;
        //mLinkSpeed = -1;
        //mHiddenSSID = false;
        //mExplicitConnect = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.640 -0400", hash_original_method = "405CB5D945A11DFB599C76C83B7C3513", hash_generated_method = "7ECAB8A9D8702D3D776C9751693F6B98")
    public  WifiInfo(WifiInfo source) {
        {
            mSupplicantState = source.mSupplicantState;
            mBSSID = source.mBSSID;
            mSSID = source.mSSID;
            mNetworkId = source.mNetworkId;
            mHiddenSSID = source.mHiddenSSID;
            mRssi = source.mRssi;
            mLinkSpeed = source.mLinkSpeed;
            mIpAddress = source.mIpAddress;
            mMacAddress = source.mMacAddress;
            mExplicitConnect = source.mExplicitConnect;
        } //End block
        // ---------- Original Method ----------
        //if (source != null) {
            //mSupplicantState = source.mSupplicantState;
            //mBSSID = source.mBSSID;
            //mSSID = source.mSSID;
            //mNetworkId = source.mNetworkId;
            //mHiddenSSID = source.mHiddenSSID;
            //mRssi = source.mRssi;
            //mLinkSpeed = source.mLinkSpeed;
            //mIpAddress = source.mIpAddress;
            //mMacAddress = source.mMacAddress;
            //mExplicitConnect = source.mExplicitConnect;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.654 -0400", hash_original_method = "89967329215A273EB27CD79E5BB8124F", hash_generated_method = "1F59F6132E892235B3AF5FC05C1DB6B9")
     void setSSID(String SSID) {
        mSSID = SSID;
        mHiddenSSID = false;
        // ---------- Original Method ----------
        //mSSID = SSID;
        //mHiddenSSID = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.655 -0400", hash_original_method = "79B89773022C9616E7A28BB8F338ADFD", hash_generated_method = "BEBA94DF3D434A9B55260E1094E4577A")
    public String getSSID() {
        String varB4EAC82CA7396A68D541C85D26508E83_62241884 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_62241884 = mSSID;
        varB4EAC82CA7396A68D541C85D26508E83_62241884.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_62241884;
        // ---------- Original Method ----------
        //return mSSID;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.656 -0400", hash_original_method = "66D619B3A9C00436F0EA6225848F76E2", hash_generated_method = "BD548F6E82AB5618699240A24DE36BEC")
     void setBSSID(String BSSID) {
        mBSSID = BSSID;
        // ---------- Original Method ----------
        //mBSSID = BSSID;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.657 -0400", hash_original_method = "4164893247FD5E84E98B26376E6216D7", hash_generated_method = "7AC923CFDAC65E18441CCC45970C496B")
    public String getBSSID() {
        String varB4EAC82CA7396A68D541C85D26508E83_1630895600 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1630895600 = mBSSID;
        varB4EAC82CA7396A68D541C85D26508E83_1630895600.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1630895600;
        // ---------- Original Method ----------
        //return mBSSID;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.657 -0400", hash_original_method = "EAA2EB56C456A75F6A36236287457095", hash_generated_method = "209DE19B911CFF4D0B188C94C315DAB3")
    public int getRssi() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2146689241 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2146689241;
        // ---------- Original Method ----------
        //return mRssi;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.677 -0400", hash_original_method = "DC61695B2550927FEF6924BD6DCCD37F", hash_generated_method = "E19A60BAC9A9678F7738ECF74A703A1A")
     void setRssi(int rssi) {
        mRssi = rssi;
        // ---------- Original Method ----------
        //mRssi = rssi;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.677 -0400", hash_original_method = "78D01A80334309441C41F6B9CC957D2A", hash_generated_method = "7148C46109D5E66A189EEC40EC830A9D")
    public int getLinkSpeed() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_274923135 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_274923135;
        // ---------- Original Method ----------
        //return mLinkSpeed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.679 -0400", hash_original_method = "BE3FF818F2C5FDEDBAE4E9D0AB590378", hash_generated_method = "3D5209C2A702486DC92F36B939583D1F")
     void setLinkSpeed(int linkSpeed) {
        this.mLinkSpeed = linkSpeed;
        // ---------- Original Method ----------
        //this.mLinkSpeed = linkSpeed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.679 -0400", hash_original_method = "D01D60678F7B1D8F273F61CB3F3E57D7", hash_generated_method = "A3E9B719E887830890CD4DD14E0AD494")
     void setMacAddress(String macAddress) {
        this.mMacAddress = macAddress;
        // ---------- Original Method ----------
        //this.mMacAddress = macAddress;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.696 -0400", hash_original_method = "3C8E67358ACD99AD783D244CA0276ACD", hash_generated_method = "DACEDB85240A9F0E631E9AAF0199622B")
    public String getMacAddress() {
        String varB4EAC82CA7396A68D541C85D26508E83_1184467498 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1184467498 = mMacAddress;
        varB4EAC82CA7396A68D541C85D26508E83_1184467498.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1184467498;
        // ---------- Original Method ----------
        //return mMacAddress;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.708 -0400", hash_original_method = "9EA9BCBB38651D2FFE57E5088D2224E9", hash_generated_method = "F5B7D15D1F9FA86D48D303046B1BC4C0")
     void setNetworkId(int id) {
        mNetworkId = id;
        // ---------- Original Method ----------
        //mNetworkId = id;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.709 -0400", hash_original_method = "1123FC1D4BB4576127DCFBEFE95B45B2", hash_generated_method = "E2BD1E9546331AF89A115B1D133F4CC6")
    public boolean isExplicitConnect() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_902670901 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_902670901;
        // ---------- Original Method ----------
        //return mExplicitConnect;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.710 -0400", hash_original_method = "3A4A87F80F04538D566E1F3D87FB9121", hash_generated_method = "419BFD214B5C4008C8900EF6C9DFFFC6")
    public void setExplicitConnect(boolean explicitConnect) {
        this.mExplicitConnect = explicitConnect;
        // ---------- Original Method ----------
        //this.mExplicitConnect = explicitConnect;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.710 -0400", hash_original_method = "B76AAD80CE4B08426894CE7F5D58A537", hash_generated_method = "9B1D89BD650D31C99376108467E6201A")
    public int getNetworkId() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_331289560 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_331289560;
        // ---------- Original Method ----------
        //return mNetworkId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.711 -0400", hash_original_method = "8E3F1F3B329B69F39A487C61B59EF2C9", hash_generated_method = "0CFE58E23A760A81D1E6CA3B94D7DA43")
    public SupplicantState getSupplicantState() {
        SupplicantState varB4EAC82CA7396A68D541C85D26508E83_763969533 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_763969533 = mSupplicantState;
        varB4EAC82CA7396A68D541C85D26508E83_763969533.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_763969533;
        // ---------- Original Method ----------
        //return mSupplicantState;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.712 -0400", hash_original_method = "D88102438CF5144569D4601488BE4027", hash_generated_method = "6FA517D61A9E3825E9AD9449126434D5")
     void setSupplicantState(SupplicantState state) {
        mSupplicantState = state;
        // ---------- Original Method ----------
        //mSupplicantState = state;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.713 -0400", hash_original_method = "34F62DC8D94CF645975CE5993EA04307", hash_generated_method = "1DF1B64E8A2F4E71966A2BDAA44D73EC")
     void setInetAddress(InetAddress address) {
        mIpAddress = address;
        // ---------- Original Method ----------
        //mIpAddress = address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.730 -0400", hash_original_method = "B90838B740ABA91EEFFDC5A9A5E25B34", hash_generated_method = "321383DA3736B75E7E0083223EB991DC")
    public int getIpAddress() {
        int varBCEEF5AE8C416DD5DB7F7A6563440778_200077326 = (NetworkUtils.inetAddressToInt(mIpAddress));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_272754562 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_272754562;
        // ---------- Original Method ----------
        //if (mIpAddress == null || mIpAddress instanceof Inet6Address) return 0;
        //return NetworkUtils.inetAddressToInt(mIpAddress);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.732 -0400", hash_original_method = "C4A754B6DCF0E16A6381A21399FCB1B9", hash_generated_method = "40BCBD99D44321AA995D260B48E7A283")
    public boolean getHiddenSSID() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2077809591 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2077809591;
        // ---------- Original Method ----------
        //return mHiddenSSID;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.733 -0400", hash_original_method = "FC84BEFBD9B7D8BF135E20B2EE1BDB16", hash_generated_method = "86ED33E9FF91B448E715AC8EE3AB36F5")
    public void setHiddenSSID(boolean hiddenSSID) {
        mHiddenSSID = hiddenSSID;
        // ---------- Original Method ----------
        //mHiddenSSID = hiddenSSID;
    }

    
        public static DetailedState getDetailedStateOf(SupplicantState suppState) {
        return stateMap.get(suppState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.748 -0400", hash_original_method = "C2C24AA87816421D7C3613D024B55B7F", hash_generated_method = "AF85132A71CCF13F9BC9ACB2864B1AAF")
     void setSupplicantState(String stateName) {
        mSupplicantState = valueOf(stateName);
        // ---------- Original Method ----------
        //mSupplicantState = valueOf(stateName);
    }

    
        static SupplicantState valueOf(String stateName) {
        if ("4WAY_HANDSHAKE".equalsIgnoreCase(stateName))
            return SupplicantState.FOUR_WAY_HANDSHAKE;
        else {
            try {
                return SupplicantState.valueOf(stateName.toUpperCase());
            } catch (IllegalArgumentException e) {
                return SupplicantState.INVALID;
            }
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.766 -0400", hash_original_method = "E7F8A705E19A9ABF8AEEB72FBC5B6139", hash_generated_method = "3504C147DBB0B0E5963F0FDE5F03B6BC")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1179985607 = null; //Variable for return #1
        StringBuffer sb;
        sb = new StringBuffer();
        String none;
        none = "<none>";
        sb.append("SSID: ").append(mSSID == null ? none : mSSID).
            append(", BSSID: ").append(mBSSID == null ? none : mBSSID).
            append(", MAC: ").append(mMacAddress == null ? none : mMacAddress).
            append(", Supplicant state: ").
            append(mSupplicantState == null ? none : mSupplicantState).
            append(", RSSI: ").append(mRssi).
            append(", Link speed: ").append(mLinkSpeed).
            append(", Net ID: ").append(mNetworkId).
            append(", Explicit connect: ").append(mExplicitConnect);
        varB4EAC82CA7396A68D541C85D26508E83_1179985607 = sb.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1179985607.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1179985607;
        // ---------- Original Method ----------
        //StringBuffer sb = new StringBuffer();
        //String none = "<none>";
        //sb.append("SSID: ").append(mSSID == null ? none : mSSID).
            //append(", BSSID: ").append(mBSSID == null ? none : mBSSID).
            //append(", MAC: ").append(mMacAddress == null ? none : mMacAddress).
            //append(", Supplicant state: ").
            //append(mSupplicantState == null ? none : mSupplicantState).
            //append(", RSSI: ").append(mRssi).
            //append(", Link speed: ").append(mLinkSpeed).
            //append(", Net ID: ").append(mNetworkId).
            //append(", Explicit connect: ").append(mExplicitConnect);
        //return sb.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.767 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "9D8D10DF229643320BFE8CB3ADD19161")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1927453510 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1927453510;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.781 -0400", hash_original_method = "D24857F81D2FD5D48ED12D74EE96B85F", hash_generated_method = "642262E56072A4847F4A83174AD828F5")
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mNetworkId);
        dest.writeInt(mRssi);
        dest.writeInt(mLinkSpeed);
        {
            dest.writeByte((byte)1);
            dest.writeByteArray(mIpAddress.getAddress());
        } //End block
        {
            dest.writeByte((byte)0);
        } //End block
        dest.writeString(getSSID());
        dest.writeString(mBSSID);
        dest.writeString(mMacAddress);
        dest.writeByte(mExplicitConnect ? (byte)1 : (byte)0);
        mSupplicantState.writeToParcel(dest, flags);
        addTaint(dest.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //dest.writeInt(mNetworkId);
        //dest.writeInt(mRssi);
        //dest.writeInt(mLinkSpeed);
        //if (mIpAddress != null) {
            //dest.writeByte((byte)1);
            //dest.writeByteArray(mIpAddress.getAddress());
        //} else {
            //dest.writeByte((byte)0);
        //}
        //dest.writeString(getSSID());
        //dest.writeString(mBSSID);
        //dest.writeString(mMacAddress);
        //dest.writeByte(mExplicitConnect ? (byte)1 : (byte)0);
        //mSupplicantState.writeToParcel(dest, flags);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.781 -0400", hash_original_field = "2E7611B81E51EE7B7624D963557CD1B4", hash_generated_field = "59A8902FA728F008541A3CAC75E5FF1B")

    private static EnumMap<SupplicantState, DetailedState> stateMap = new EnumMap<SupplicantState, DetailedState>(SupplicantState.class);
    static {
        stateMap.put(SupplicantState.DISCONNECTED, DetailedState.DISCONNECTED);
        stateMap.put(SupplicantState.INTERFACE_DISABLED, DetailedState.DISCONNECTED);
        stateMap.put(SupplicantState.INACTIVE, DetailedState.IDLE);
        stateMap.put(SupplicantState.SCANNING, DetailedState.SCANNING);
        stateMap.put(SupplicantState.AUTHENTICATING, DetailedState.CONNECTING);
        stateMap.put(SupplicantState.ASSOCIATING, DetailedState.CONNECTING);
        stateMap.put(SupplicantState.ASSOCIATED, DetailedState.CONNECTING);
        stateMap.put(SupplicantState.FOUR_WAY_HANDSHAKE, DetailedState.AUTHENTICATING);
        stateMap.put(SupplicantState.GROUP_HANDSHAKE, DetailedState.AUTHENTICATING);
        stateMap.put(SupplicantState.COMPLETED, DetailedState.OBTAINING_IPADDR);
        stateMap.put(SupplicantState.DORMANT, DetailedState.DISCONNECTED);
        stateMap.put(SupplicantState.UNINITIALIZED, DetailedState.IDLE);
        stateMap.put(SupplicantState.INVALID, DetailedState.FAILED);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.782 -0400", hash_original_field = "B7F1F356FEEAD57116C9A3D854687994", hash_generated_field = "ABAFD2EF3023F1403E0A2BE381C4FBB6")

    public static final String LINK_SPEED_UNITS = "Mbps";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:23.796 -0400", hash_original_field = "377CD1781B3B021A8514603282CD1326", hash_generated_field = "1B405BAB9AF1675AAD98451A10C8598C")

    public static final Creator<WifiInfo> CREATOR =
        new Creator<WifiInfo>() {
            public WifiInfo createFromParcel(Parcel in) {
                WifiInfo info = new WifiInfo();
                info.setNetworkId(in.readInt());
                info.setRssi(in.readInt());
                info.setLinkSpeed(in.readInt());
                if (in.readByte() == 1) {
                    try {
                        info.setInetAddress(InetAddress.getByAddress(in.createByteArray()));
                    } catch (UnknownHostException e) {}
                }
                info.setSSID(in.readString());
                info.mBSSID = in.readString();
                info.mMacAddress = in.readString();
                info.mExplicitConnect = in.readByte() == 1 ? true : false;
                info.mSupplicantState = SupplicantState.CREATOR.createFromParcel(in);
                return info;
            }

            public WifiInfo[] newArray(int size) {
                return new WifiInfo[size];
            }
        };
}

