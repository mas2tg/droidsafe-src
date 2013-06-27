package android.content.res;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.pm.ActivityInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LocaleUtil;
import java.util.Locale;

public final class Configuration implements Parcelable, Comparable<Configuration> {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "B38FCF4846290DA93140EFB4E89B8F2D", hash_generated_field = "016D232391C2B00F2A8278147A165D44")

    public float fontScale;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "F46F944E351F8B92E40C3308318738A3", hash_generated_field = "76F73DAFF3E7C6F271BA01993CC2C8A0")

    public int mcc;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "06B53047CF294F7207789FF5293AD2DC", hash_generated_field = "C8C1335BDB14963CECDE57EFB65EFFB2")

    public int mnc;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "FB216D9E8791E63C8D12BDC420956839", hash_generated_field = "EF7DFF54937494EEB34A3C19D5A51B82")

    public Locale locale;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "9E71C45EB9B4E0F85100FB392267BAAC", hash_generated_field = "F3C329D4A00E76B33E7CA6034FEEE8BB")

    public boolean userSetLocale;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "5921A7D5054B5457A1EC4806F917A87F", hash_generated_field = "75E75221BDD4324EC7A7F0F3380DBC45")

    public int screenLayout;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "269D83C50D8CED832B0B6078C1431796", hash_generated_field = "7BD24F9029D9389CC85A72E927933491")

    public int touchscreen;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "388A56DBB62A010DC26A378981346247", hash_generated_field = "D4FF6D7D378EEFA5FEB32686A0ACC1A0")

    public int keyboard;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.021 -0400", hash_original_field = "4B0EA73ED19E21C2D8876B450E12FC52", hash_generated_field = "9B39F39EEA3B5BB28D62E068260E180D")

    public int keyboardHidden;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "78A0AF4F0A39E93B3C9825ED68F6AB05", hash_generated_field = "8A23D435735D9E7B81CB249D67B2E8FE")

    public int hardKeyboardHidden;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "FD9160BBD656F75AB74E8935E4330D9E", hash_generated_field = "68D4E1B9231A90B60C9E05FC54251CC3")

    public int navigation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "EF558F40DF833D0141F35F04EC98C3F0", hash_generated_field = "740578DD4AD1CDA0CBD2EBE65083C7DD")

    public int navigationHidden;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "DA1639422AD8F355D2371428471379B5", hash_generated_field = "039D4A8EAE0AA6D0501E4B6BB899CCE8")

    public int orientation;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "6ACA8708A1592227EF40C70007308BBB", hash_generated_field = "D3CE92A20BB4AD432061A982E440F89E")

    public int uiMode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "BA2170D852E7FC15E6B4C5DD24A1FE76", hash_generated_field = "B4623D6B8749E7B32286E6BED8FF75B9")

    public int screenWidthDp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "1430010359D08233CD6C533F10E77872", hash_generated_field = "FFF43C61292F4D4B68AA77F5BEB79B0E")

    public int screenHeightDp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "EE6AFB6CA939285EFAF6E46021730F45", hash_generated_field = "B2BA3B7260CF99D8A56816651AD7EA2D")

    public int smallestScreenWidthDp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "36E1391B512D4F75ECDAC95FEF5419AF", hash_generated_field = "23072A9468BA47F7005C3C4C2BDC4C76")

    public int compatScreenWidthDp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.022 -0400", hash_original_field = "6B7BDB77C35F74369C8EF9D6A2606F0C", hash_generated_field = "F0CB2F26359485B5DDD1C8D4F0AE43EE")

    public int compatScreenHeightDp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.023 -0400", hash_original_field = "E28766C3E1D29841C93167A7940EDB6A", hash_generated_field = "412A44FB6BBF0D556AD1A50E6E2E13C7")

    public int compatSmallestScreenWidthDp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.037 -0400", hash_original_field = "BD72D27CB6E65C087EB19E1F02DA0D3B", hash_generated_field = "C81CA55E4FEC275F629D6067F4E91B44")

    public int textLayoutDirection;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.037 -0400", hash_original_field = "E068C2DE26D760F20CF10AFC4B87EF0F", hash_generated_field = "602E67FBFEA6A5896A55513E0F9DCC8A")

    public int seq;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.038 -0400", hash_original_method = "7E58BC7E066573DB3913F9DCCD9EE638", hash_generated_method = "91F3585416146E7055FAB87D152FFB0B")
    public  Configuration() {
        setToDefaults();
        // ---------- Original Method ----------
        //setToDefaults();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.039 -0400", hash_original_method = "152BBD78ACB87D16BE4EC07F107E0DF8", hash_generated_method = "50F971D27EFCA341F854464B72C368BD")
    public  Configuration(Configuration o) {
        setTo(o);
        addTaint(o.getTaint());
        // ---------- Original Method ----------
        //setTo(o);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.040 -0400", hash_original_method = "8A45855DAEA6DBD5399558BF539AE2C5", hash_generated_method = "E2B1C158DB0DAC34E83B04374560DECD")
    private  Configuration(Parcel source) {
        readFromParcel(source);
        addTaint(source.getTaint());
        // ---------- Original Method ----------
        //readFromParcel(source);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.042 -0400", hash_original_method = "7CF138C6ADBDA7579D8D5CA6B783C43E", hash_generated_method = "BDF457831FD4AC9A781FB1DA24ED9189")
    public boolean isLayoutSizeAtLeast(int size) {
        int cur;
        cur = screenLayout&SCREENLAYOUT_SIZE_MASK;
        addTaint(size);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_180662415 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_180662415;
        // ---------- Original Method ----------
        //int cur = screenLayout&SCREENLAYOUT_SIZE_MASK;
        //if (cur == SCREENLAYOUT_SIZE_UNDEFINED) return false;
        //return cur >= size;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.165 -0400", hash_original_method = "0746F8F2DFB5C09A503AAF70E445D6DB", hash_generated_method = "097E0B3A52CD157791701823D4501404")
    public void setTo(Configuration o) {
        fontScale = o.fontScale;
        mcc = o.mcc;
        mnc = o.mnc;
        {
            locale = (Locale) o.locale.clone();
            textLayoutDirection = o.textLayoutDirection;
        } //End block
        userSetLocale = o.userSetLocale;
        touchscreen = o.touchscreen;
        keyboard = o.keyboard;
        keyboardHidden = o.keyboardHidden;
        hardKeyboardHidden = o.hardKeyboardHidden;
        navigation = o.navigation;
        navigationHidden = o.navigationHidden;
        orientation = o.orientation;
        screenLayout = o.screenLayout;
        uiMode = o.uiMode;
        screenWidthDp = o.screenWidthDp;
        screenHeightDp = o.screenHeightDp;
        smallestScreenWidthDp = o.smallestScreenWidthDp;
        compatScreenWidthDp = o.compatScreenWidthDp;
        compatScreenHeightDp = o.compatScreenHeightDp;
        compatSmallestScreenWidthDp = o.compatSmallestScreenWidthDp;
        seq = o.seq;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.246 -0400", hash_original_method = "D48CF32F0604807A2B9F35AE6E9C5375", hash_generated_method = "9E1BEAFB5682F092C781BFDA27B005CC")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_98410688 = null; //Variable for return #1
        StringBuilder sb;
        sb = new StringBuilder(128);
        sb.append("{");
        sb.append(fontScale);
        sb.append(" ");
        sb.append(mcc);
        sb.append("mcc");
        sb.append(mnc);
        sb.append("mnc");
        {
            sb.append(" ");
            sb.append(locale);
        } //End block
        {
            sb.append(" (no locale)");
        } //End block
        //Begin case LocaleUtil.TEXT_LAYOUT_DIRECTION_RTL_DO_NOT_USE 
        sb.append(" rtl");
        //End case LocaleUtil.TEXT_LAYOUT_DIRECTION_RTL_DO_NOT_USE 
        //Begin case default 
        sb.append(" layoutdir=");
        //End case default 
        //Begin case default 
        sb.append(textLayoutDirection);
        //End case default 
        {
            sb.append(" sw");
            sb.append(smallestScreenWidthDp);
            sb.append("dp");
        } //End block
        {
            sb.append(" ?swdp");
        } //End block
        {
            sb.append(" w");
            sb.append(screenWidthDp);
            sb.append("dp");
        } //End block
        {
            sb.append(" ?wdp");
        } //End block
        {
            sb.append(" h");
            sb.append(screenHeightDp);
            sb.append("dp");
        } //End block
        {
            sb.append(" ?hdp");
        } //End block
        //Begin case SCREENLAYOUT_SIZE_UNDEFINED 
        sb.append(" ?lsize");
        //End case SCREENLAYOUT_SIZE_UNDEFINED 
        //Begin case SCREENLAYOUT_SIZE_SMALL 
        sb.append(" smll");
        //End case SCREENLAYOUT_SIZE_SMALL 
        //Begin case SCREENLAYOUT_SIZE_NORMAL 
        sb.append(" nrml");
        //End case SCREENLAYOUT_SIZE_NORMAL 
        //Begin case SCREENLAYOUT_SIZE_LARGE 
        sb.append(" lrg");
        //End case SCREENLAYOUT_SIZE_LARGE 
        //Begin case SCREENLAYOUT_SIZE_XLARGE 
        sb.append(" xlrg");
        //End case SCREENLAYOUT_SIZE_XLARGE 
        //Begin case default 
        sb.append(" layoutSize=");
        //End case default 
        //Begin case default 
        sb.append(screenLayout&SCREENLAYOUT_SIZE_MASK);
        //End case default 
        //Begin case SCREENLAYOUT_LONG_UNDEFINED 
        sb.append(" ?long");
        //End case SCREENLAYOUT_LONG_UNDEFINED 
        //Begin case SCREENLAYOUT_LONG_YES 
        sb.append(" long");
        //End case SCREENLAYOUT_LONG_YES 
        //Begin case default 
        sb.append(" layoutLong=");
        //End case default 
        //Begin case default 
        sb.append(screenLayout&SCREENLAYOUT_LONG_MASK);
        //End case default 
        //Begin case ORIENTATION_UNDEFINED 
        sb.append(" ?orien");
        //End case ORIENTATION_UNDEFINED 
        //Begin case ORIENTATION_LANDSCAPE 
        sb.append(" land");
        //End case ORIENTATION_LANDSCAPE 
        //Begin case ORIENTATION_PORTRAIT 
        sb.append(" port");
        //End case ORIENTATION_PORTRAIT 
        //Begin case default 
        sb.append(" orien=");
        //End case default 
        //Begin case default 
        sb.append(orientation);
        //End case default 
        //Begin case UI_MODE_TYPE_UNDEFINED 
        sb.append(" ?uimode");
        //End case UI_MODE_TYPE_UNDEFINED 
        //Begin case UI_MODE_TYPE_DESK 
        sb.append(" desk");
        //End case UI_MODE_TYPE_DESK 
        //Begin case UI_MODE_TYPE_CAR 
        sb.append(" car");
        //End case UI_MODE_TYPE_CAR 
        //Begin case UI_MODE_TYPE_TELEVISION 
        sb.append(" television");
        //End case UI_MODE_TYPE_TELEVISION 
        //Begin case default 
        sb.append(" uimode=");
        //End case default 
        //Begin case default 
        sb.append(uiMode&UI_MODE_TYPE_MASK);
        //End case default 
        //Begin case UI_MODE_NIGHT_UNDEFINED 
        sb.append(" ?night");
        //End case UI_MODE_NIGHT_UNDEFINED 
        //Begin case UI_MODE_NIGHT_YES 
        sb.append(" night");
        //End case UI_MODE_NIGHT_YES 
        //Begin case default 
        sb.append(" night=");
        //End case default 
        //Begin case default 
        sb.append(uiMode&UI_MODE_NIGHT_MASK);
        //End case default 
        //Begin case TOUCHSCREEN_UNDEFINED 
        sb.append(" ?touch");
        //End case TOUCHSCREEN_UNDEFINED 
        //Begin case TOUCHSCREEN_NOTOUCH 
        sb.append(" -touch");
        //End case TOUCHSCREEN_NOTOUCH 
        //Begin case TOUCHSCREEN_STYLUS 
        sb.append(" stylus");
        //End case TOUCHSCREEN_STYLUS 
        //Begin case TOUCHSCREEN_FINGER 
        sb.append(" finger");
        //End case TOUCHSCREEN_FINGER 
        //Begin case default 
        sb.append(" touch=");
        //End case default 
        //Begin case default 
        sb.append(touchscreen);
        //End case default 
        //Begin case KEYBOARD_UNDEFINED 
        sb.append(" ?keyb");
        //End case KEYBOARD_UNDEFINED 
        //Begin case KEYBOARD_NOKEYS 
        sb.append(" -keyb");
        //End case KEYBOARD_NOKEYS 
        //Begin case KEYBOARD_QWERTY 
        sb.append(" qwerty");
        //End case KEYBOARD_QWERTY 
        //Begin case KEYBOARD_12KEY 
        sb.append(" 12key");
        //End case KEYBOARD_12KEY 
        //Begin case default 
        sb.append(" keys=");
        //End case default 
        //Begin case default 
        sb.append(keyboard);
        //End case default 
        //Begin case KEYBOARDHIDDEN_UNDEFINED 
        sb.append("/?");
        //End case KEYBOARDHIDDEN_UNDEFINED 
        //Begin case KEYBOARDHIDDEN_NO 
        sb.append("/v");
        //End case KEYBOARDHIDDEN_NO 
        //Begin case KEYBOARDHIDDEN_YES 
        sb.append("/h");
        //End case KEYBOARDHIDDEN_YES 
        //Begin case KEYBOARDHIDDEN_SOFT 
        sb.append("/s");
        //End case KEYBOARDHIDDEN_SOFT 
        //Begin case default 
        sb.append("/");
        //End case default 
        //Begin case default 
        sb.append(keyboardHidden);
        //End case default 
        //Begin case HARDKEYBOARDHIDDEN_UNDEFINED 
        sb.append("/?");
        //End case HARDKEYBOARDHIDDEN_UNDEFINED 
        //Begin case HARDKEYBOARDHIDDEN_NO 
        sb.append("/v");
        //End case HARDKEYBOARDHIDDEN_NO 
        //Begin case HARDKEYBOARDHIDDEN_YES 
        sb.append("/h");
        //End case HARDKEYBOARDHIDDEN_YES 
        //Begin case default 
        sb.append("/");
        //End case default 
        //Begin case default 
        sb.append(hardKeyboardHidden);
        //End case default 
        //Begin case NAVIGATION_UNDEFINED 
        sb.append(" ?nav");
        //End case NAVIGATION_UNDEFINED 
        //Begin case NAVIGATION_NONAV 
        sb.append(" -nav");
        //End case NAVIGATION_NONAV 
        //Begin case NAVIGATION_DPAD 
        sb.append(" dpad");
        //End case NAVIGATION_DPAD 
        //Begin case NAVIGATION_TRACKBALL 
        sb.append(" tball");
        //End case NAVIGATION_TRACKBALL 
        //Begin case NAVIGATION_WHEEL 
        sb.append(" wheel");
        //End case NAVIGATION_WHEEL 
        //Begin case default 
        sb.append(" nav=");
        //End case default 
        //Begin case default 
        sb.append(navigation);
        //End case default 
        //Begin case NAVIGATIONHIDDEN_UNDEFINED 
        sb.append("/?");
        //End case NAVIGATIONHIDDEN_UNDEFINED 
        //Begin case NAVIGATIONHIDDEN_NO 
        sb.append("/v");
        //End case NAVIGATIONHIDDEN_NO 
        //Begin case NAVIGATIONHIDDEN_YES 
        sb.append("/h");
        //End case NAVIGATIONHIDDEN_YES 
        //Begin case default 
        sb.append("/");
        //End case default 
        //Begin case default 
        sb.append(navigationHidden);
        //End case default 
        {
            sb.append(" s.");
            sb.append(seq);
        } //End block
        sb.append('}');
        varB4EAC82CA7396A68D541C85D26508E83_98410688 = sb.toString();
        varB4EAC82CA7396A68D541C85D26508E83_98410688.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_98410688;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.260 -0400", hash_original_method = "147ACC888212AB34BF4DFBA0C89EE45F", hash_generated_method = "C9CB6755A580929C7AAF213990A1EEFA")
    public void setToDefaults() {
        fontScale = 1;
        mcc = mnc = 0;
        locale = null;
        userSetLocale = false;
        touchscreen = TOUCHSCREEN_UNDEFINED;
        keyboard = KEYBOARD_UNDEFINED;
        keyboardHidden = KEYBOARDHIDDEN_UNDEFINED;
        hardKeyboardHidden = HARDKEYBOARDHIDDEN_UNDEFINED;
        navigation = NAVIGATION_UNDEFINED;
        navigationHidden = NAVIGATIONHIDDEN_UNDEFINED;
        orientation = ORIENTATION_UNDEFINED;
        screenLayout = SCREENLAYOUT_SIZE_UNDEFINED;
        uiMode = UI_MODE_TYPE_UNDEFINED;
        screenWidthDp = compatScreenWidthDp = SCREEN_WIDTH_DP_UNDEFINED;
        screenHeightDp = compatScreenHeightDp = SCREEN_HEIGHT_DP_UNDEFINED;
        smallestScreenWidthDp = compatSmallestScreenWidthDp = SMALLEST_SCREEN_WIDTH_DP_UNDEFINED;
        textLayoutDirection = LocaleUtil.TEXT_LAYOUT_DIRECTION_LTR_DO_NOT_USE;
        seq = 0;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.292 -0400", hash_original_method = "7A9BC90479DED562CC828BA992C8D29B", hash_generated_method = "F4925C1856E621330FA07AC8612E16F3")
    @Deprecated
    public void makeDefault() {
        setToDefaults();
        // ---------- Original Method ----------
        //setToDefaults();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.378 -0400", hash_original_method = "B89305EEF1411ADF7E3555A325399492", hash_generated_method = "54431C0D352711FC6ED0D438E9F4744E")
    public int updateFrom(Configuration delta) {
        int changed;
        changed = 0;
        {
            changed |= ActivityInfo.CONFIG_FONT_SCALE;
            fontScale = delta.fontScale;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_MCC;
            mcc = delta.mcc;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_MNC;
            mnc = delta.mnc;
        } //End block
        {
            boolean var4196EA4334D61313D1945CBA952C7DCB_33794776 = (delta.locale != null
                && (locale == null || !locale.equals(delta.locale)));
            {
                changed |= ActivityInfo.CONFIG_LOCALE;
                locale = delta.locale != null
                    ? (Locale) delta.locale.clone() : null;
                textLayoutDirection = LocaleUtil.getLayoutDirectionFromLocale(locale);
            } //End block
        } //End collapsed parenthetic
        {
            userSetLocale = true;
            changed |= ActivityInfo.CONFIG_LOCALE;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_TOUCHSCREEN;
            touchscreen = delta.touchscreen;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD;
            keyboard = delta.keyboard;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD_HIDDEN;
            keyboardHidden = delta.keyboardHidden;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD_HIDDEN;
            hardKeyboardHidden = delta.hardKeyboardHidden;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_NAVIGATION;
            navigation = delta.navigation;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD_HIDDEN;
            navigationHidden = delta.navigationHidden;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_ORIENTATION;
            orientation = delta.orientation;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SCREEN_LAYOUT;
            screenLayout = delta.screenLayout;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_UI_MODE;
            {
                uiMode = (uiMode&~UI_MODE_TYPE_MASK)
                        | (delta.uiMode&UI_MODE_TYPE_MASK);
            } //End block
            {
                uiMode = (uiMode&~UI_MODE_NIGHT_MASK)
                        | (delta.uiMode&UI_MODE_NIGHT_MASK);
            } //End block
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SCREEN_SIZE;
            screenWidthDp = delta.screenWidthDp;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SCREEN_SIZE;
            screenHeightDp = delta.screenHeightDp;
        } //End block
        {
            smallestScreenWidthDp = delta.smallestScreenWidthDp;
        } //End block
        {
            compatScreenWidthDp = delta.compatScreenWidthDp;
        } //End block
        {
            compatScreenHeightDp = delta.compatScreenHeightDp;
        } //End block
        {
            compatSmallestScreenWidthDp = delta.compatSmallestScreenWidthDp;
        } //End block
        {
            seq = delta.seq;
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1816935514 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1816935514;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.422 -0400", hash_original_method = "386D1A4CE5F28E1920F878E4D6E46D78", hash_generated_method = "D3082ABF6C46C90A7BFFE5DBE8207EFF")
    public int diff(Configuration delta) {
        int changed;
        changed = 0;
        {
            changed |= ActivityInfo.CONFIG_FONT_SCALE;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_MCC;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_MNC;
        } //End block
        {
            boolean var4196EA4334D61313D1945CBA952C7DCB_400655119 = (delta.locale != null
                && (locale == null || !locale.equals(delta.locale)));
            {
                changed |= ActivityInfo.CONFIG_LOCALE;
            } //End block
        } //End collapsed parenthetic
        {
            changed |= ActivityInfo.CONFIG_TOUCHSCREEN;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD_HIDDEN;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD_HIDDEN;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_NAVIGATION;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_KEYBOARD_HIDDEN;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_ORIENTATION;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SCREEN_LAYOUT;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_UI_MODE;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SCREEN_SIZE;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SCREEN_SIZE;
        } //End block
        {
            changed |= ActivityInfo.CONFIG_SMALLEST_SCREEN_SIZE;
        } //End block
        addTaint(delta.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_830943711 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_830943711;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        public static boolean needNewResources(int configChanges, int interestingChanges) {
        return (configChanges & (interestingChanges|ActivityInfo.CONFIG_FONT_SCALE)) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.424 -0400", hash_original_method = "B2BFCC713F7EA940A38F0F416218BA87", hash_generated_method = "D4272E00BFED3DBDA5B6C6DCAE657106")
    public boolean isOtherSeqNewer(Configuration other) {
        int diff;
        diff = other.seq - seq;
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1339378037 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1339378037;
        // ---------- Original Method ----------
        //if (other == null) {
            //return false;
        //}
        //if (other.seq == 0) {
            //return true;
        //}
        //if (seq == 0) {
            //return true;
        //}
        //int diff = other.seq - seq;
        //if (diff > 0x10000) {
            //return false;
        //}
        //return diff > 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.425 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "F1424643C50C84BB6D8971BF7D132BA5")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1817947519 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1817947519;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.466 -0400", hash_original_method = "1BC6CD0BF36648989C04BB1E69C07CD0", hash_generated_method = "FA6ACE1568C173E1F0FB04F89B2AD126")
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(fontScale);
        dest.writeInt(mcc);
        dest.writeInt(mnc);
        {
            dest.writeInt(0);
        } //End block
        {
            dest.writeInt(1);
            dest.writeString(locale.getLanguage());
            dest.writeString(locale.getCountry());
            dest.writeString(locale.getVariant());
        } //End block
        {
            dest.writeInt(1);
        } //End block
        {
            dest.writeInt(0);
        } //End block
        dest.writeInt(touchscreen);
        dest.writeInt(keyboard);
        dest.writeInt(keyboardHidden);
        dest.writeInt(hardKeyboardHidden);
        dest.writeInt(navigation);
        dest.writeInt(navigationHidden);
        dest.writeInt(orientation);
        dest.writeInt(screenLayout);
        dest.writeInt(uiMode);
        dest.writeInt(screenWidthDp);
        dest.writeInt(screenHeightDp);
        dest.writeInt(smallestScreenWidthDp);
        dest.writeInt(compatScreenWidthDp);
        dest.writeInt(compatScreenHeightDp);
        dest.writeInt(compatSmallestScreenWidthDp);
        dest.writeInt(textLayoutDirection);
        dest.writeInt(seq);
        addTaint(dest.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.501 -0400", hash_original_method = "D035835FD349CA35BBAA1421EFF90B4A", hash_generated_method = "BDF350A4C379F616958EBBC1E7B0B866")
    public void readFromParcel(Parcel source) {
        fontScale = source.readFloat();
        mcc = source.readInt();
        mnc = source.readInt();
        {
            boolean varFD16828A378FD83700BE97539951F787_64011460 = (source.readInt() != 0);
            {
                locale = new Locale(source.readString(), source.readString(),
                    source.readString());
            } //End block
        } //End collapsed parenthetic
        userSetLocale = (source.readInt()==1);
        touchscreen = source.readInt();
        keyboard = source.readInt();
        keyboardHidden = source.readInt();
        hardKeyboardHidden = source.readInt();
        navigation = source.readInt();
        navigationHidden = source.readInt();
        orientation = source.readInt();
        screenLayout = source.readInt();
        uiMode = source.readInt();
        screenWidthDp = source.readInt();
        screenHeightDp = source.readInt();
        smallestScreenWidthDp = source.readInt();
        compatScreenWidthDp = source.readInt();
        compatScreenHeightDp = source.readInt();
        compatSmallestScreenWidthDp = source.readInt();
        textLayoutDirection = source.readInt();
        seq = source.readInt();
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.572 -0400", hash_original_method = "A5C14F26D7300C5E96037FF80E52AAB2", hash_generated_method = "C41FBBE1DBDAEA32263148413801D98F")
    public int compareTo(Configuration that) {
        int n;
        float a;
        a = this.fontScale;
        float b;
        b = that.fontScale;
        n = this.mcc - that.mcc;
        n = this.mnc - that.mnc;
        {
            n = this.locale.getLanguage().compareTo(that.locale.getLanguage());
            n = this.locale.getCountry().compareTo(that.locale.getCountry());
            n = this.locale.getVariant().compareTo(that.locale.getVariant());
        } //End block
        n = this.touchscreen - that.touchscreen;
        n = this.keyboard - that.keyboard;
        n = this.keyboardHidden - that.keyboardHidden;
        n = this.hardKeyboardHidden - that.hardKeyboardHidden;
        n = this.navigation - that.navigation;
        n = this.navigationHidden - that.navigationHidden;
        n = this.orientation - that.orientation;
        n = this.screenLayout - that.screenLayout;
        n = this.uiMode - that.uiMode;
        n = this.screenWidthDp - that.screenWidthDp;
        n = this.screenHeightDp - that.screenHeightDp;
        n = this.smallestScreenWidthDp - that.smallestScreenWidthDp;
        addTaint(that.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_754523089 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_754523089;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.582 -0400", hash_original_method = "7EC3698B1B9649830BA1D150A7700ABF", hash_generated_method = "395E158266CD987A7BE628CE1EBFC45B")
    public boolean equals(Configuration that) {
        {
            boolean var264A9522C72B4B1AC5C8FEC213FC9A77_2016413237 = (that == this);
        } //End collapsed parenthetic
        boolean var41C2CBFC55263D1C5596E781F8311FC6_1391029020 = (this.compareTo(that) == 0);
        addTaint(that.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_782922866 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_782922866;
        // ---------- Original Method ----------
        //if (that == null) return false;
        //if (that == this) return true;
        //return this.compareTo(that) == 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.583 -0400", hash_original_method = "EE31E2EDAF6F402A909910F793361153", hash_generated_method = "7BE49CCD0FA26894797E09A4899DBFD5")
    public boolean equals(Object that) {
        try 
        {
            boolean varD7DC298F5093D437BB12478685AA37AB_750091028 = (equals((Configuration)that));
        } //End block
        catch (ClassCastException e)
        { }
        addTaint(that.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1336379078 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1336379078;
        // ---------- Original Method ----------
        //try {
            //return equals((Configuration)that);
        //} catch (ClassCastException e) {
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_method = "046D4D394490FA85ED827B86F99F4B68", hash_generated_method = "23433CE82CFD8ECC40BD76ADF6EEDBCB")
    public int hashCode() {
        int result;
        result = 17;
        result = 31 * result + Float.floatToIntBits(fontScale);
        result = 31 * result + mcc;
        result = 31 * result + mnc;
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + touchscreen;
        result = 31 * result + keyboard;
        result = 31 * result + keyboardHidden;
        result = 31 * result + hardKeyboardHidden;
        result = 31 * result + navigation;
        result = 31 * result + navigationHidden;
        result = 31 * result + orientation;
        result = 31 * result + screenLayout;
        result = 31 * result + uiMode;
        result = 31 * result + screenWidthDp;
        result = 31 * result + screenHeightDp;
        result = 31 * result + smallestScreenWidthDp;
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_747375285 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_747375285;
        // ---------- Original Method ----------
        //int result = 17;
        //result = 31 * result + Float.floatToIntBits(fontScale);
        //result = 31 * result + mcc;
        //result = 31 * result + mnc;
        //result = 31 * result + (locale != null ? locale.hashCode() : 0);
        //result = 31 * result + touchscreen;
        //result = 31 * result + keyboard;
        //result = 31 * result + keyboardHidden;
        //result = 31 * result + hardKeyboardHidden;
        //result = 31 * result + navigation;
        //result = 31 * result + navigationHidden;
        //result = 31 * result + orientation;
        //result = 31 * result + screenLayout;
        //result = 31 * result + uiMode;
        //result = 31 * result + screenWidthDp;
        //result = 31 * result + screenHeightDp;
        //result = 31 * result + smallestScreenWidthDp;
        //return result;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_field = "9389BEEE61408AB40A43EB3605A0309D", hash_generated_field = "B346CDA4558DB20C72B6AF98D39CC438")

    public static final int SCREENLAYOUT_SIZE_MASK = 0x0f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_field = "76CDB5C90A727BD6304C2F16A4730227", hash_generated_field = "9F5362A941D202AFF041CB2D1CFA608A")

    public static final int SCREENLAYOUT_SIZE_UNDEFINED = 0x00;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_field = "EF3AC1807CE6563859055C327E2D6CD9", hash_generated_field = "803804A6E8EF0051FD582511CB210442")

    public static final int SCREENLAYOUT_SIZE_SMALL = 0x01;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_field = "A8713940186697FBAA5FDB57528AAB2B", hash_generated_field = "2D871A5AC547C36BADCAEE9D4C5FEE6B")

    public static final int SCREENLAYOUT_SIZE_NORMAL = 0x02;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_field = "2EA35C09842C311CB98BCF5BDD887D88", hash_generated_field = "430CB565357F7CE4159D1181AEEFCD75")

    public static final int SCREENLAYOUT_SIZE_LARGE = 0x03;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.616 -0400", hash_original_field = "FD3C56EC572EB60CA9DD4BD4A7419312", hash_generated_field = "063E90CA990B679B946724BD1F48FDF8")

    public static final int SCREENLAYOUT_SIZE_XLARGE = 0x04;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.617 -0400", hash_original_field = "285AACBD0E42E1EBC0A3A156191BC283", hash_generated_field = "83DF942B9520E78A49689D25D3AA02BF")

    public static final int SCREENLAYOUT_LONG_MASK = 0x30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.617 -0400", hash_original_field = "053196AA4CCEDA7AF565C26B260CC97B", hash_generated_field = "E7FBEB3394EED592FB1D4D7B5D023CBC")

    public static final int SCREENLAYOUT_LONG_UNDEFINED = 0x00;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.632 -0400", hash_original_field = "248639D56B92F77159E6A4804DDE9183", hash_generated_field = "9BFB6EA0D6E07F35DD143CA937C7CE8E")

    public static final int SCREENLAYOUT_LONG_NO = 0x10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.632 -0400", hash_original_field = "607F829B25FC53D95EBD7D2319CE2F18", hash_generated_field = "9E65CE17F1FC653413AE213ED7C2C2BC")

    public static final int SCREENLAYOUT_LONG_YES = 0x20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "F3B92E34B854F0E063920D8C5F30A699", hash_generated_field = "E64EBA8622584CA6009DEC2FBD315324")

    public static final int SCREENLAYOUT_COMPAT_NEEDED = 0x10000000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "A9BDF5DA018ACEE3ADDC70376FBB7D28", hash_generated_field = "B0101AA9A1EFC2958B2BD97935F5E43F")

    public static final int TOUCHSCREEN_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "9DDDC633796BD12974C5F027A51E253F", hash_generated_field = "FC751613C0D874E0D62CAD5911C37168")

    public static final int TOUCHSCREEN_NOTOUCH = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "F8BC192ED5852FF3A6EC02FD566D4ACD", hash_generated_field = "C3C62D0D5C3E1FCC186AB5565969A16A")

    public static final int TOUCHSCREEN_STYLUS = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "1332D033EAB3A07FA27965DA2957E7CB", hash_generated_field = "EF740BB43C76B625100AB3DDAC1CB848")

    public static final int TOUCHSCREEN_FINGER = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "CD28C583F0ADD41F3036F72D75170763", hash_generated_field = "973D7C88B4953DD48CB18EC38FFA7E40")

    public static final int KEYBOARD_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "342D579EBE35A17CEE4B4078DC8E4F46", hash_generated_field = "ED47AEFC2904A88498A3417274EB5B28")

    public static final int KEYBOARD_NOKEYS = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "C0E862FDE80BAC2E7F7DC08706A53F2F", hash_generated_field = "29EA5AF2C91F1AB9B20D2BE16CEA90BA")

    public static final int KEYBOARD_QWERTY = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "A57056EF9C30850B8569C0E95DB56560", hash_generated_field = "1E094ABA5C5141E80F7EFD80F5FF36B3")

    public static final int KEYBOARD_12KEY = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.633 -0400", hash_original_field = "A8B4DC0E0734E324CF2D1FB24A3562CD", hash_generated_field = "8D5810494CA6F4A6156ED47E6AE64DB8")

    public static final int KEYBOARDHIDDEN_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "898ED68A4DCE1CD1870B364EF20027BE", hash_generated_field = "2FC4FFF97A1D643FBF08B0B36322F8C4")

    public static final int KEYBOARDHIDDEN_NO = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "80E0DE4FED75227FADC9598B602A1255", hash_generated_field = "6E397BE484C0EF4151CA42CA0FF55845")

    public static final int KEYBOARDHIDDEN_YES = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "45303D49324A0383070F1127C23D05D6", hash_generated_field = "12C4876D3640B60BB30F8A7D36AC1BE7")

    public static final int KEYBOARDHIDDEN_SOFT = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "1C207C3BB8E9EA316D52E85C8747906A", hash_generated_field = "95E584687387E211D6DEB6D7272BA7E1")

    public static final int HARDKEYBOARDHIDDEN_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "E319622E43501E0718091086A9055E90", hash_generated_field = "498B6D95CC5FFEE7EA277824D6255431")

    public static final int HARDKEYBOARDHIDDEN_NO = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "0F4E42023B97598C906068FC0B5BF5A5", hash_generated_field = "8FD6C4F87C30287D39602C79F45C4E7E")

    public static final int HARDKEYBOARDHIDDEN_YES = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "B115EA2D81DE5C02659406BDC10AFF3C", hash_generated_field = "932D1DB5ECECF03B56E0079FF2C36729")

    public static final int NAVIGATION_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.634 -0400", hash_original_field = "765E28A10EC49CCCFFEA4A6910FEEB1F", hash_generated_field = "8D80BAD85677E02C825FEB169936882A")

    public static final int NAVIGATION_NONAV = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "ED5FD19935B15C9C09E08A38BFBEC527", hash_generated_field = "8C9D8797F167F4EC820DB72CAC4CD715")

    public static final int NAVIGATION_DPAD = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "A09154CAFC1EC0C78918861DCEF71B50", hash_generated_field = "FCE06A270F820644B1F88884AE2F271F")

    public static final int NAVIGATION_TRACKBALL = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "510CB5C9B1C16878B0A07A900A3CBB82", hash_generated_field = "6FECECA346D65FAC4BD02F6E2A0AB60C")

    public static final int NAVIGATION_WHEEL = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "BF96B956CEF034ED741504B9C05C55DD", hash_generated_field = "08162A93D56DB79FB6836A1D7BD8E65F")

    public static final int NAVIGATIONHIDDEN_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "F587F09A48AE9CE81641BDB4DB611132", hash_generated_field = "E2DD859C53EEC94FC7108000065D16BD")

    public static final int NAVIGATIONHIDDEN_NO = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "2E0D16B737F72760045721A09D849C23", hash_generated_field = "C4DF0E23CF380592463F3B20C09F9634")

    public static final int NAVIGATIONHIDDEN_YES = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "9FB271DB9A792392A834B83862588506", hash_generated_field = "C828CE7228710CDEF23518F65ADADABD")

    public static final int ORIENTATION_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "098F5FBB43EC00DC9C8CC2E6123A0A45", hash_generated_field = "E8BEF95B801ACE9332F80B0F3A2A2E23")

    public static final int ORIENTATION_PORTRAIT = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.635 -0400", hash_original_field = "0DCB6B122B1DB62F32E790C65B279352", hash_generated_field = "15A4FF77941A8BE76B02E2B2E899580C")

    public static final int ORIENTATION_LANDSCAPE = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "82C659C91EA3F94A676BC829284FA4DD", hash_generated_field = "22E9247C76EB276847BFA8251392E5F3")

    public static final int ORIENTATION_SQUARE = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "8B443B42A5AE9118859820E8821C5CC1", hash_generated_field = "CE645321C68D6EAE4F20040E151DFEBD")

    public static final int UI_MODE_TYPE_MASK = 0x0f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "9293E61B6E5C62F3CF285D2E0F6337EA", hash_generated_field = "75B384221BDBDD1ECBC2C2091A72BCA3")

    public static final int UI_MODE_TYPE_UNDEFINED = 0x00;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "6A86E8F7412BF703D1B78AC19BCACF22", hash_generated_field = "EF99BB083AF588C21F667D28F38E3849")

    public static final int UI_MODE_TYPE_NORMAL = 0x01;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "8E522A591EF987EED8DE7AFF5091EAEB", hash_generated_field = "BA800E97C02982CCF1CDA6C32F47C9EC")

    public static final int UI_MODE_TYPE_DESK = 0x02;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "514825BEE7F02D274BF38F041BC53B14", hash_generated_field = "F30C183AF3B6AE31DD369E3628B3AF97")

    public static final int UI_MODE_TYPE_CAR = 0x03;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "7501825D55D3208DA9B17AB200BCA0B0", hash_generated_field = "DFC9061FC07194CBAE10078BE0D3B5A8")

    public static final int UI_MODE_TYPE_TELEVISION = 0x04;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "5F1DDC80CAEDE6E1296208F1023DF2F8", hash_generated_field = "898C0CEDBB65AA44FBAA229A1058F918")

    public static final int UI_MODE_NIGHT_MASK = 0x30;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "4B457057D8F16DA6A5AD6028A9841397", hash_generated_field = "85556771939DEED6E975323A05749A53")

    public static final int UI_MODE_NIGHT_UNDEFINED = 0x00;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.636 -0400", hash_original_field = "10679998B8ACBF3EF90D709EFA84CFEF", hash_generated_field = "ED352808DBE642379622C1D8B72F92CB")

    public static final int UI_MODE_NIGHT_NO = 0x10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.637 -0400", hash_original_field = "9BA4B0602EE577CE2B893697D2CDCA70", hash_generated_field = "CB2F7464255937F099EEC6D692D82CCC")

    public static final int UI_MODE_NIGHT_YES = 0x20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.637 -0400", hash_original_field = "0E528082955B64D5A46C3BECD7E3EEC1", hash_generated_field = "A7CE3388F40BEF0EB84DB64B575D81FB")

    public static final int SCREEN_WIDTH_DP_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.637 -0400", hash_original_field = "7643C8F85B129CAC127E9DDE03FE428A", hash_generated_field = "4981084D9255AA8DA4E2488051EAD47D")

    public static final int SCREEN_HEIGHT_DP_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.637 -0400", hash_original_field = "1DE1008585B1C7C8F58EF016BEA2AD5F", hash_generated_field = "5CB7CC2CFE40F6BFE0C6F652FED847EA")

    public static final int SMALLEST_SCREEN_WIDTH_DP_UNDEFINED = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:07.637 -0400", hash_original_field = "B878BA31EDC1EBF03B984722591EF325", hash_generated_field = "5F2782F95CCC299BBC0483C419009027")

    public static final Parcelable.Creator<Configuration> CREATOR
            = new Parcelable.Creator<Configuration>() {
        public Configuration createFromParcel(Parcel source) {
            return new Configuration(source);
        }

        public Configuration[] newArray(int size) {
            return new Configuration[size];
        }
    };
}

