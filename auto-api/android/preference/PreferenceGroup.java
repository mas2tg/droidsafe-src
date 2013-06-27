package android.preference;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public abstract class PreferenceGroup extends Preference implements GenericInflater.Parent<Preference> {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.535 -0400", hash_original_field = "49E5F06342B9A756471C57C41582CFFB", hash_generated_field = "18F192958EC897931FD8B3DA5BF85A77")

    private List<Preference> mPreferenceList;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.535 -0400", hash_original_field = "BFB6611E214C8472FF036C77EE32C446", hash_generated_field = "C2971599AC8149900D387CCAE8E63B08")

    private boolean mOrderingAsAdded = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.535 -0400", hash_original_field = "04B749A6CF9DDEB82655F535E8D335A2", hash_generated_field = "89C3262ADB33D2CAACE003244FE80C06")

    private int mCurrentPreferenceOrder = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.535 -0400", hash_original_field = "291B1E207D704F5AC4DDD6CA2EB1ACB3", hash_generated_field = "5A686733D92531666006F9E403A759CD")

    private boolean mAttachedToActivity = false;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.546 -0400", hash_original_method = "8E566EF8D5358FA15B6B3A62F4F4EA92", hash_generated_method = "04BB6F86C5886CC3753FD06FC76CCA9E")
    public  PreferenceGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mPreferenceList = new ArrayList<Preference>();
        TypedArray a;
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.PreferenceGroup, defStyle, 0);
        mOrderingAsAdded = a.getBoolean(com.android.internal.R.styleable.PreferenceGroup_orderingFromXml,
                mOrderingAsAdded);
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        //mPreferenceList = new ArrayList<Preference>();
        //TypedArray a = context.obtainStyledAttributes(attrs,
                //com.android.internal.R.styleable.PreferenceGroup, defStyle, 0);
        //mOrderingAsAdded = a.getBoolean(com.android.internal.R.styleable.PreferenceGroup_orderingFromXml,
                //mOrderingAsAdded);
        //a.recycle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.547 -0400", hash_original_method = "88A912CB88465E21C56F7A6B1304F32F", hash_generated_method = "7B856457141458BC85CD92B1486A591C")
    public  PreferenceGroup(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.548 -0400", hash_original_method = "6CBD3E9C112A20CE725E0B14080873B3", hash_generated_method = "FBB1310A5EFCDF2B72BEFBD717EF881F")
    public void setOrderingAsAdded(boolean orderingAsAdded) {
        mOrderingAsAdded = orderingAsAdded;
        // ---------- Original Method ----------
        //mOrderingAsAdded = orderingAsAdded;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.555 -0400", hash_original_method = "5AE1DA121FD737E8D77F265AA9EE4792", hash_generated_method = "4A7398B845B357CE744DB62CD6407583")
    public boolean isOrderingAsAdded() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1022702612 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1022702612;
        // ---------- Original Method ----------
        //return mOrderingAsAdded;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.557 -0400", hash_original_method = "DCFB2F7E3F738580B672E91DCD38CF42", hash_generated_method = "712FAC34D063796FEB63E5648E112F69")
    public void addItemFromInflater(Preference preference) {
        addPreference(preference);
        addTaint(preference.getTaint());
        // ---------- Original Method ----------
        //addPreference(preference);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.557 -0400", hash_original_method = "389AB97985CD6F44D465D155E8399BE9", hash_generated_method = "1B0FB4CB02E9A619F0AA2B08F7CA331C")
    public int getPreferenceCount() {
        int var0BB871AF6B245B4A49AE35894863E9A5_1031188843 = (mPreferenceList.size());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_30143598 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_30143598;
        // ---------- Original Method ----------
        //return mPreferenceList.size();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.558 -0400", hash_original_method = "109559B57B2B04AB981EEA935073C7C0", hash_generated_method = "64E600D47D62734D9E7CC8CA5EAE47BE")
    public Preference getPreference(int index) {
        Preference varB4EAC82CA7396A68D541C85D26508E83_1406302713 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1406302713 = mPreferenceList.get(index);
        addTaint(index);
        varB4EAC82CA7396A68D541C85D26508E83_1406302713.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1406302713;
        // ---------- Original Method ----------
        //return mPreferenceList.get(index);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.575 -0400", hash_original_method = "6848FE69024CCCF475A64E7D742A1E83", hash_generated_method = "C23B6348F655A761414FAAD87C2BC452")
    public boolean addPreference(Preference preference) {
        {
            boolean varAA49CA455D741C477FFE8ADBFBD323F3_1224038081 = (mPreferenceList.contains(preference));
        } //End collapsed parenthetic
        {
            boolean var5A335D067A83D83A8F4AC2D05532A103_624298062 = (preference.getOrder() == Preference.DEFAULT_ORDER);
            {
                {
                    preference.setOrder(mCurrentPreferenceOrder++);
                } //End block
                {
                    ((PreferenceGroup)preference).setOrderingAsAdded(mOrderingAsAdded);
                } //End block
            } //End block
        } //End collapsed parenthetic
        int insertionIndex;
        insertionIndex = Collections.binarySearch(mPreferenceList, preference);
        {
            insertionIndex = insertionIndex * -1 - 1;
        } //End block
        {
            boolean var756FE1F14894C08F38E5223F62838CF6_219202746 = (!onPrepareAddPreference(preference));
        } //End collapsed parenthetic
        {
            mPreferenceList.add(insertionIndex, preference);
        } //End block
        preference.onAttachedToHierarchy(getPreferenceManager());
        {
            preference.onAttachedToActivity();
        } //End block
        notifyHierarchyChanged();
        addTaint(preference.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_138526430 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_138526430;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.576 -0400", hash_original_method = "72E836216B00BC7CD61ADE8B9836B308", hash_generated_method = "5A7123F65FF6328436E3C63A33ED43CD")
    public boolean removePreference(Preference preference) {
        boolean returnValue;
        returnValue = removePreferenceInt(preference);
        notifyHierarchyChanged();
        addTaint(preference.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1318620108 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1318620108;
        // ---------- Original Method ----------
        //final boolean returnValue = removePreferenceInt(preference);
        //notifyHierarchyChanged();
        //return returnValue;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.576 -0400", hash_original_method = "4864D54B8C7134B3A64BC66D9DDCC7C4", hash_generated_method = "CB839C6228A48B9150601DF83C4B5D84")
    private boolean removePreferenceInt(Preference preference) {
        {
            preference.onPrepareForRemoval();
            boolean var1D2497A5EDC86D7B9B13C1103199C646_1611211726 = (mPreferenceList.remove(preference));
        } //End block
        addTaint(preference.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_82443134 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_82443134;
        // ---------- Original Method ----------
        //synchronized(this) {
            //preference.onPrepareForRemoval();
            //return mPreferenceList.remove(preference);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.577 -0400", hash_original_method = "70997B14FB6DABF4C7D8165F55B0B7BF", hash_generated_method = "4D740DCB50E421630D4716D5BAA06C83")
    public void removeAll() {
        {
            List<Preference> preferenceList;
            preferenceList = mPreferenceList;
            {
                int i;
                i = preferenceList.size() - 1;
                {
                    removePreferenceInt(preferenceList.get(0));
                } //End block
            } //End collapsed parenthetic
        } //End block
        notifyHierarchyChanged();
        // ---------- Original Method ----------
        //synchronized(this) {
            //List<Preference> preferenceList = mPreferenceList;
            //for (int i = preferenceList.size() - 1; i >= 0; i--) {
                //removePreferenceInt(preferenceList.get(0));
            //}
        //}
        //notifyHierarchyChanged();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.589 -0400", hash_original_method = "6AE303446925DAEA15C349B1AB59000B", hash_generated_method = "E1BC391B25B62183A01908406AE32DE4")
    protected boolean onPrepareAddPreference(Preference preference) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var51D4CB112DEF9326A450B864472CC55B_1058543290 = (!super.isEnabled());
            {
                preference.setEnabled(false);
            } //End block
        } //End collapsed parenthetic
        addTaint(preference.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_72417053 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_72417053;
        // ---------- Original Method ----------
        //if (!super.isEnabled()) {
            //preference.setEnabled(false);
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.591 -0400", hash_original_method = "28FD4F6AEC9563866A4A8A8A3B9D4A51", hash_generated_method = "6165E70964FCCA64BC4DC2BF72C5F1DF")
    public Preference findPreference(CharSequence key) {
        Preference varB4EAC82CA7396A68D541C85D26508E83_1086800982 = null; //Variable for return #1
        Preference varB4EAC82CA7396A68D541C85D26508E83_1354677421 = null; //Variable for return #2
        Preference varB4EAC82CA7396A68D541C85D26508E83_2035402526 = null; //Variable for return #3
        Preference varB4EAC82CA7396A68D541C85D26508E83_185521529 = null; //Variable for return #4
        {
            boolean var88F3B56867814E544B1683E80DFE607F_805694830 = (TextUtils.equals(getKey(), key));
            {
                varB4EAC82CA7396A68D541C85D26508E83_1086800982 = this;
            } //End block
        } //End collapsed parenthetic
        int preferenceCount;
        preferenceCount = getPreferenceCount();
        {
            int i;
            i = 0;
            {
                Preference preference;
                preference = getPreference(i);
                String curKey;
                curKey = preference.getKey();
                {
                    boolean var0241FC8FE55008008E20898BB849D89C_1533463094 = (curKey != null && curKey.equals(key));
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_1354677421 = preference;
                    } //End block
                } //End collapsed parenthetic
                {
                    Preference returnedPreference;
                    returnedPreference = ((PreferenceGroup)preference)
                        .findPreference(key);
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_2035402526 = returnedPreference;
                    } //End block
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_185521529 = null;
        addTaint(key.getTaint());
        Preference varA7E53CE21691AB073D9660D615818899_2128763579; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2128763579 = varB4EAC82CA7396A68D541C85D26508E83_1086800982;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_2128763579 = varB4EAC82CA7396A68D541C85D26508E83_1354677421;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_2128763579 = varB4EAC82CA7396A68D541C85D26508E83_2035402526;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2128763579 = varB4EAC82CA7396A68D541C85D26508E83_185521529;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2128763579.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2128763579;
        // ---------- Original Method ----------
        //if (TextUtils.equals(getKey(), key)) {
            //return this;
        //}
        //final int preferenceCount = getPreferenceCount();
        //for (int i = 0; i < preferenceCount; i++) {
            //final Preference preference = getPreference(i);
            //final String curKey = preference.getKey();
            //if (curKey != null && curKey.equals(key)) {
                //return preference;
            //}
            //if (preference instanceof PreferenceGroup) {
                //final Preference returnedPreference = ((PreferenceGroup)preference)
                        //.findPreference(key);
                //if (returnedPreference != null) {
                    //return returnedPreference;
                //}
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.595 -0400", hash_original_method = "DAC56CE9E9B1E4D46C67382001476B7D", hash_generated_method = "125C14666BD9BAAB34432F2D390AECD1")
    protected boolean isOnSameScreenAsChildren() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_787252687 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_787252687;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.612 -0400", hash_original_method = "1FE8E9DF20201DB390C6CDB4B44A4648", hash_generated_method = "217CFC112EC30BD5800D4038D3450227")
    @Override
    protected void onAttachedToActivity() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onAttachedToActivity();
        mAttachedToActivity = true;
        int preferenceCount;
        preferenceCount = getPreferenceCount();
        {
            int i;
            i = 0;
            {
                getPreference(i).onAttachedToActivity();
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //super.onAttachedToActivity();
        //mAttachedToActivity = true;
        //final int preferenceCount = getPreferenceCount();
        //for (int i = 0; i < preferenceCount; i++) {
            //getPreference(i).onAttachedToActivity();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.613 -0400", hash_original_method = "3A7D9D1FD83E5C89A0E712EE5F3DBB8B", hash_generated_method = "A9FE2CD2FBC3C91399937F271D4EC0AC")
    @Override
    protected void onPrepareForRemoval() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onPrepareForRemoval();
        mAttachedToActivity = false;
        // ---------- Original Method ----------
        //super.onPrepareForRemoval();
        //mAttachedToActivity = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.614 -0400", hash_original_method = "10614F6B57E80AB6C964E551AE06AF94", hash_generated_method = "3BE52DECAF633F5CC643BD988F35F020")
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        int preferenceCount;
        preferenceCount = getPreferenceCount();
        {
            int i;
            i = 0;
            {
                getPreference(i).setEnabled(enabled);
            } //End block
        } //End collapsed parenthetic
        addTaint(enabled);
        // ---------- Original Method ----------
        //super.setEnabled(enabled);
        //final int preferenceCount = getPreferenceCount();
        //for (int i = 0; i < preferenceCount; i++) {
            //getPreference(i).setEnabled(enabled);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.615 -0400", hash_original_method = "8DBDAE7DDABF4AEFA524423E392EC9C9", hash_generated_method = "243BA09E7EDBC4A38A7B4E7339AB87BC")
     void sortPreferences() {
        {
            Collections.sort(mPreferenceList);
        } //End block
        // ---------- Original Method ----------
        //synchronized (this) {
            //Collections.sort(mPreferenceList);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.615 -0400", hash_original_method = "62B814BB73D262A241B770A4F50FC903", hash_generated_method = "8925DD324EB98F82689A8270C90E5501")
    @Override
    protected void dispatchSaveInstanceState(Bundle container) {
        super.dispatchSaveInstanceState(container);
        int preferenceCount;
        preferenceCount = getPreferenceCount();
        {
            int i;
            i = 0;
            {
                getPreference(i).dispatchSaveInstanceState(container);
            } //End block
        } //End collapsed parenthetic
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //super.dispatchSaveInstanceState(container);
        //final int preferenceCount = getPreferenceCount();
        //for (int i = 0; i < preferenceCount; i++) {
            //getPreference(i).dispatchSaveInstanceState(container);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:28.632 -0400", hash_original_method = "F1DE64EBADCED3709EBA936E1D8777C2", hash_generated_method = "B3B1AB2F4983F66D77C0F41B7016BF8A")
    @Override
    protected void dispatchRestoreInstanceState(Bundle container) {
        super.dispatchRestoreInstanceState(container);
        int preferenceCount;
        preferenceCount = getPreferenceCount();
        {
            int i;
            i = 0;
            {
                getPreference(i).dispatchRestoreInstanceState(container);
            } //End block
        } //End collapsed parenthetic
        addTaint(container.getTaint());
        // ---------- Original Method ----------
        //super.dispatchRestoreInstanceState(container);
        //final int preferenceCount = getPreferenceCount();
        //for (int i = 0; i < preferenceCount; i++) {
            //getPreference(i).dispatchRestoreInstanceState(container);
        //}
    }

    
}

