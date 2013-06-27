package android.view;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.res.CompatibilityInfo;
import android.content.res.Configuration;
import android.graphics.PixelFormat;
import android.opengl.ManagedEGLContext;
import android.os.IBinder;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;

final class WindowLeaked extends AndroidRuntimeException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.878 -0400", hash_original_method = "FBED2002249AD131D5B5A71E6D66FC21", hash_generated_method = "B428DBE2E7043E67065C3E1AC92F2B4B")
    public  WindowLeaked(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
    }

    
}

public class WindowManagerImpl implements WindowManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.878 -0400", hash_original_field = "F4A2381F0ED039C4005692ED45DE82D7", hash_generated_field = "1FE8B5AC02273EF00EC01B5EE801E265")

    private View[] mViews;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.878 -0400", hash_original_field = "C5109F9CE8A636F7BCE9D70BF3CB312D", hash_generated_field = "30F0340706746C5BEBF7EDA66601F6B0")

    private ViewRootImpl[] mRoots;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.878 -0400", hash_original_field = "18200E5D7C3839693F00E5A4D3DAD0B6", hash_generated_field = "CD18B20CABA4892D4B646B54A9A2A4C6")

    private WindowManager.LayoutParams[] mParams;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.878 -0400", hash_original_method = "3EABCF2A614A6DEC3CA7FC91E47982AB", hash_generated_method = "3EABCF2A614A6DEC3CA7FC91E47982AB")
    public WindowManagerImpl ()
    {
        //Synthesized constructor
    }


        public static WindowManagerImpl getDefault() {
        return sWindowManager;
    }

    
        public static WindowManager getDefault(CompatibilityInfo compatInfo) {
        CompatibilityInfoHolder cih = new CompatibilityInfoHolder();
        cih.set(compatInfo);
        if (cih.getIfNeeded() == null) {
            return sWindowManager;
        }
        synchronized (sLock) {
            WindowManager wm = sCompatWindowManagers.get(compatInfo);
            if (wm == null) {
                wm = new CompatModeWrapper(sWindowManager, cih);
                sCompatWindowManagers.put(compatInfo, wm);
            }
            return wm;
        }
    }

    
        public static WindowManager getDefault(CompatibilityInfoHolder compatInfo) {
        return new CompatModeWrapper(sWindowManager, compatInfo);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.879 -0400", hash_original_method = "8E464E19F5A7F279FF3FC1B84D15C4F0", hash_generated_method = "45535A8F40285B2DAD902CC8DDBDD68C")
    public boolean isHardwareAccelerated() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_459530133 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_459530133;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.880 -0400", hash_original_method = "3A47767500C080C4B7D3F95A5195D385", hash_generated_method = "FB36DAEAEF4BD4BF826A1D9BA1F1967F")
    public void addView(View view) {
        addView(view, new WindowManager.LayoutParams(
            WindowManager.LayoutParams.TYPE_APPLICATION, 0, PixelFormat.OPAQUE));
        addTaint(view.getTaint());
        // ---------- Original Method ----------
        //addView(view, new WindowManager.LayoutParams(
            //WindowManager.LayoutParams.TYPE_APPLICATION, 0, PixelFormat.OPAQUE));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.880 -0400", hash_original_method = "133D7EA484587CEAA64BDEB4AE9186C6", hash_generated_method = "6ABA7112A4C93E29505A413988B87F07")
    public void addView(View view, ViewGroup.LayoutParams params) {
        addView(view, params, null, false);
        addTaint(view.getTaint());
        addTaint(params.getTaint());
        // ---------- Original Method ----------
        //addView(view, params, null, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.881 -0400", hash_original_method = "6E55E902889BC8630B8C2A4EBA8587B9", hash_generated_method = "1F723570A1FA0A7AA86EFF9BE1B343FE")
    public void addView(View view, ViewGroup.LayoutParams params, CompatibilityInfoHolder cih) {
        addView(view, params, cih, false);
        addTaint(view.getTaint());
        addTaint(params.getTaint());
        addTaint(cih.getTaint());
        // ---------- Original Method ----------
        //addView(view, params, cih, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.883 -0400", hash_original_method = "FC07162832A382775417964F34DC350F", hash_generated_method = "1CDFC4849B96E4AABF9C728248768420")
    private void addView(View view, ViewGroup.LayoutParams params,
            CompatibilityInfoHolder cih, boolean nest) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                    "Params must be WindowManager.LayoutParams");
        } //End block
        WindowManager.LayoutParams wparams;
        wparams = (WindowManager.LayoutParams)params;
        ViewRootImpl root;
        View panelParentView;
        panelParentView = null;
        {
            int index;
            index = findViewLocked(view, false);
            {
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("View " + view
                            + " has already been added to the window manager.");
                } //End block
                root = mRoots[index];
                view.setLayoutParams(wparams);
                root.setLayoutParams(wparams, true);
            } //End block
            {
                int count;
                count = mViews.length;
                count = 0;
                {
                    int i;
                    i = 0;
                    {
                        {
                            boolean var1D105CECC30286641BD50965ABC9FB7E_400491199 = (mRoots[i].mWindow.asBinder() == wparams.token);
                            {
                                panelParentView = mViews[i];
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
            root = new ViewRootImpl(view.getContext());
            root.mAddNesting = 1;
            {
                root.mCompatibilityInfo = new CompatibilityInfoHolder();
            } //End block
            {
                root.mCompatibilityInfo = cih;
            } //End block
            view.setLayoutParams(wparams);
            {
                index = 1;
                mViews = new View[1];
                mRoots = new ViewRootImpl[1];
                mParams = new WindowManager.LayoutParams[1];
            } //End block
            {
                index = mViews.length + 1;
                Object[] old;
                old = mViews;
                mViews = new View[index];
                System.arraycopy(old, 0, mViews, 0, index-1);
                old = mRoots;
                mRoots = new ViewRootImpl[index];
                System.arraycopy(old, 0, mRoots, 0, index-1);
                old = mParams;
                mParams = new WindowManager.LayoutParams[index];
                System.arraycopy(old, 0, mParams, 0, index-1);
            } //End block
            mViews[index] = view;
            mRoots[index] = root;
            mParams[index] = wparams;
        } //End block
        root.setView(view, wparams, panelParentView);
        addTaint(params.getTaint());
        addTaint(cih.getTaint());
        addTaint(nest);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.884 -0400", hash_original_method = "ED95BEACF52CBB6AE255A4987CA1BF10", hash_generated_method = "469869B946AD1F399D0DE56274441D3E")
    public void updateViewLayout(View view, ViewGroup.LayoutParams params) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Params must be WindowManager.LayoutParams");
        } //End block
        WindowManager.LayoutParams wparams;
        wparams = (WindowManager.LayoutParams)params;
        view.setLayoutParams(wparams);
        {
            int index;
            index = findViewLocked(view, true);
            ViewRootImpl root;
            root = mRoots[index];
            mParams[index] = wparams;
            root.setLayoutParams(wparams, false);
        } //End block
        addTaint(view.getTaint());
        addTaint(params.getTaint());
        // ---------- Original Method ----------
        //if (!(params instanceof WindowManager.LayoutParams)) {
            //throw new IllegalArgumentException("Params must be WindowManager.LayoutParams");
        //}
        //final WindowManager.LayoutParams wparams
                //= (WindowManager.LayoutParams)params;
        //view.setLayoutParams(wparams);
        //synchronized (this) {
            //int index = findViewLocked(view, true);
            //ViewRootImpl root = mRoots[index];
            //mParams[index] = wparams;
            //root.setLayoutParams(wparams, false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.905 -0400", hash_original_method = "6ED1D335390D20FBE30CC53F4D61DE9F", hash_generated_method = "43CA0819B04F549F881CD9E0ADC73D14")
    public void removeView(View view) {
        {
            int index;
            index = findViewLocked(view, true);
            View curView;
            curView = removeViewLocked(index);
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Calling with view " + view
                    + " but the ViewAncestor is attached to " + curView);
        } //End block
        addTaint(view.getTaint());
        // ---------- Original Method ----------
        //synchronized (this) {
            //int index = findViewLocked(view, true);
            //View curView = removeViewLocked(index);
            //if (curView == view) {
                //return;
            //}
            //throw new IllegalStateException("Calling with view " + view
                    //+ " but the ViewAncestor is attached to " + curView);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.907 -0400", hash_original_method = "EE35B3CBE21A32408B24AA67A208567E", hash_generated_method = "EE452692542F604C53A5A94CF1821A6F")
    public void removeViewImmediate(View view) {
        {
            int index;
            index = findViewLocked(view, true);
            ViewRootImpl root;
            root = mRoots[index];
            View curView;
            curView = root.getView();
            root.mAddNesting = 0;
            root.die(true);
            finishRemoveViewLocked(curView, index);
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Calling with view " + view
                    + " but the ViewAncestor is attached to " + curView);
        } //End block
        addTaint(view.getTaint());
        // ---------- Original Method ----------
        //synchronized (this) {
            //int index = findViewLocked(view, true);
            //ViewRootImpl root = mRoots[index];
            //View curView = root.getView();
            //root.mAddNesting = 0;
            //root.die(true);
            //finishRemoveViewLocked(curView, index);
            //if (curView == view) {
                //return;
            //}
            //throw new IllegalStateException("Calling with view " + view
                    //+ " but the ViewAncestor is attached to " + curView);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.918 -0400", hash_original_method = "45C6626A33F0E52A8F561F8DE7007122", hash_generated_method = "4C1D408477AC6CA1F860E46218EB0E86")
     View removeViewLocked(int index) {
        View varB4EAC82CA7396A68D541C85D26508E83_726937009 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_948805237 = null; //Variable for return #2
        ViewRootImpl root;
        root = mRoots[index];
        View view;
        view = root.getView();
        {
            varB4EAC82CA7396A68D541C85D26508E83_726937009 = view;
        } //End block
        {
            InputMethodManager imm;
            imm = InputMethodManager.getInstance(view.getContext());
            {
                imm.windowDismissed(mViews[index].getWindowToken());
            } //End block
        } //End block
        root.die(false);
        finishRemoveViewLocked(view, index);
        varB4EAC82CA7396A68D541C85D26508E83_948805237 = view;
        addTaint(index);
        View varA7E53CE21691AB073D9660D615818899_312469998; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_312469998 = varB4EAC82CA7396A68D541C85D26508E83_726937009;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_312469998 = varB4EAC82CA7396A68D541C85D26508E83_948805237;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_312469998.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_312469998;
        // ---------- Original Method ----------
        //ViewRootImpl root = mRoots[index];
        //View view = root.getView();
        //root.mAddNesting--;
        //if (root.mAddNesting > 0) {
            //return view;
        //}
        //if (view != null) {
            //InputMethodManager imm = InputMethodManager.getInstance(view.getContext());
            //if (imm != null) {
                //imm.windowDismissed(mViews[index].getWindowToken());
            //}
        //}
        //root.die(false);
        //finishRemoveViewLocked(view, index);
        //return view;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.932 -0400", hash_original_method = "4A1C8F1E2D0E07B0DD1B6F93F46E614A", hash_generated_method = "D51B292C012717840C3A793751F728F6")
     void finishRemoveViewLocked(View view, int index) {
        int count;
        count = mViews.length;
        View[] tmpViews;
        tmpViews = new View[count-1];
        removeItem(tmpViews, mViews, index);
        mViews = tmpViews;
        ViewRootImpl[] tmpRoots;
        tmpRoots = new ViewRootImpl[count-1];
        removeItem(tmpRoots, mRoots, index);
        mRoots = tmpRoots;
        WindowManager.LayoutParams[] tmpParams;
        tmpParams = new WindowManager.LayoutParams[count-1];
        removeItem(tmpParams, mParams, index);
        mParams = tmpParams;
        {
            view.assignParent(null);
        } //End block
        addTaint(view.getTaint());
        addTaint(index);
        // ---------- Original Method ----------
        //final int count = mViews.length;
        //View[] tmpViews = new View[count-1];
        //removeItem(tmpViews, mViews, index);
        //mViews = tmpViews;
        //ViewRootImpl[] tmpRoots = new ViewRootImpl[count-1];
        //removeItem(tmpRoots, mRoots, index);
        //mRoots = tmpRoots;
        //WindowManager.LayoutParams[] tmpParams
                //= new WindowManager.LayoutParams[count-1];
        //removeItem(tmpParams, mParams, index);
        //mParams = tmpParams;
        //if (view != null) {
            //view.assignParent(null);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.933 -0400", hash_original_method = "235A702EEE225FF475D5967A0654B4AA", hash_generated_method = "DF12168D09C4CDD4799FCCF40A702753")
    public void closeAll(IBinder token, String who, String what) {
        {
            int count;
            count = mViews.length;
            {
                int i;
                i = 0;
                {
                    {
                        ViewRootImpl root;
                        root = mRoots[i];
                        root.mAddNesting = 1;
                        {
                            WindowLeaked leak;
                            leak = new WindowLeaked(
                                what + " " + who + " has leaked window "
                                + root.getView() + " that was originally added here");
                            leak.setStackTrace(root.getLocation().getStackTrace());
                        } //End block
                        removeViewLocked(i);
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(token.getTaint());
        addTaint(who.getTaint());
        addTaint(what.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.934 -0400", hash_original_method = "1760CCD9A30F61845B0A646D5EFB7F37", hash_generated_method = "6C71129FCEA6A8536F8F2D69E451145A")
    public void trimMemory(int level) {
        {
            boolean varC5B5975D48585E4D1B9A993F5AABAEDD_1102947997 = (HardwareRenderer.isAvailable());
            {
                //Begin case ComponentCallbacks2.TRIM_MEMORY_COMPLETE ComponentCallbacks2.TRIM_MEMORY_MODERATE 
                {
                    boolean var08753D6884B6AA0740247389AD694E8A_2006509781 = (!ActivityManager.isHighEndGfx(getDefaultDisplay()));
                    {
                        HardwareRenderer.trimMemory(ComponentCallbacks2.TRIM_MEMORY_COMPLETE);
                        {
                            int count;
                            count = mViews.length;
                            {
                                int i;
                                i = 0;
                                {
                                    mRoots[i].terminateHardwareResources();
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                        ManagedEGLContext.doTerminate();
                    } //End block
                } //End collapsed parenthetic
                //End case ComponentCallbacks2.TRIM_MEMORY_COMPLETE ComponentCallbacks2.TRIM_MEMORY_MODERATE 
                //Begin case default 
                HardwareRenderer.trimMemory(level);
                //End case default 
            } //End block
        } //End collapsed parenthetic
        addTaint(level);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.934 -0400", hash_original_method = "B85ACF4E2D1A27D42C4275E82179233A", hash_generated_method = "89B7904BCD8A124941146FC575383CC5")
    public void trimLocalMemory() {
        {
            int count;
            count = mViews.length;
            {
                int i;
                i = 0;
                {
                    mRoots[i].destroyHardwareLayers();
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //synchronized (this) {
            //if (mViews == null) return;
            //int count = mViews.length;
            //for (int i = 0; i < count; i++) {
                //mRoots[i].destroyHardwareLayers();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.948 -0400", hash_original_method = "8E8B6C2ACDFF2687F40321E0E64E3BBE", hash_generated_method = "538987C40D5684EE9C97D6166CB2DC13")
    public void dumpGfxInfo(FileDescriptor fd) {
        FileOutputStream fout;
        fout = new FileOutputStream(fd);
        PrintWriter pw;
        pw = new PrintWriter(fout);
        try 
        {
            {
                {
                    pw.println("View hierarchy:");
                    int count;
                    count = mViews.length;
                    int viewsCount;
                    viewsCount = 0;
                    int displayListsSize;
                    displayListsSize = 0;
                    int[] info;
                    info = new int[2];
                    {
                        int i;
                        i = 0;
                        {
                            ViewRootImpl root;
                            root = mRoots[i];
                            root.dumpGfxInfo(pw, info);
                            String name;
                            name = root.getClass().getName() + '@' +
                                Integer.toHexString(hashCode());
                            pw.printf("  %s: %d views, %.2f kB (display lists)\n",
                                name, info[0], info[1] / 1024.0f);
                            viewsCount += info[0];
                            displayListsSize += info[1];
                        } //End block
                    } //End collapsed parenthetic
                    pw.printf("\nTotal ViewRootImpl: %d\n", count);
                    pw.printf("Total Views:        %d\n", viewsCount);
                    pw.printf("Total DisplayList:  %.2f kB\n\n", displayListsSize / 1024.0f);
                } //End block
            } //End block
        } //End block
        finally 
        {
            pw.flush();
        } //End block
        addTaint(fd.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.950 -0400", hash_original_method = "32E6F8530311607C65FF5EAF5F0BD6AD", hash_generated_method = "6BBA1EB62E0D588E4D40934457E333BB")
    public void setStoppedState(IBinder token, boolean stopped) {
        {
            int count;
            count = mViews.length;
            {
                int i;
                i = 0;
                {
                    {
                        ViewRootImpl root;
                        root = mRoots[i];
                        root.setStopped(stopped);
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(token.getTaint());
        addTaint(stopped);
        // ---------- Original Method ----------
        //synchronized (this) {
            //if (mViews == null)
                //return;
            //int count = mViews.length;
            //for (int i=0; i<count; i++) {
                //if (token == null || mParams[i].token == token) {
                    //ViewRootImpl root = mRoots[i];
                    //root.setStopped(stopped);
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.962 -0400", hash_original_method = "5FCDC552B8E05196F9C2F723B4C31106", hash_generated_method = "ED56E514A35E9EC2CF096B5D7E057168")
    public void reportNewConfiguration(Configuration config) {
        {
            int count;
            count = mViews.length;
            config = new Configuration(config);
            {
                int i;
                i = 0;
                {
                    ViewRootImpl root;
                    root = mRoots[i];
                    root.requestUpdateConfiguration(config);
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(config.getTaint());
        // ---------- Original Method ----------
        //synchronized (this) {
            //int count = mViews.length;
            //config = new Configuration(config);
            //for (int i=0; i<count; i++) {
                //ViewRootImpl root = mRoots[i];
                //root.requestUpdateConfiguration(config);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.963 -0400", hash_original_method = "1CFBFD36B7BEFA0EB1A8D0118BDA1924", hash_generated_method = "0BD875354EC44127AAB9540CEDED9140")
    public WindowManager.LayoutParams getRootViewLayoutParameter(View view) {
        WindowManager.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_883482713 = null; //Variable for return #1
        WindowManager.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_935707979 = null; //Variable for return #2
        WindowManager.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_1542843568 = null; //Variable for return #3
        ViewParent vp;
        vp = view.getParent();
        {
            vp = vp.getParent();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_883482713 = null;
        ViewRootImpl vr;
        vr = (ViewRootImpl)vp;
        int N;
        N = mRoots.length;
        {
            int i;
            i = 0;
            {
                {
                    varB4EAC82CA7396A68D541C85D26508E83_935707979 = mParams[i];
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1542843568 = null;
        addTaint(view.getTaint());
        WindowManager.LayoutParams varA7E53CE21691AB073D9660D615818899_927459148; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_927459148 = varB4EAC82CA7396A68D541C85D26508E83_883482713;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_927459148 = varB4EAC82CA7396A68D541C85D26508E83_935707979;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_927459148 = varB4EAC82CA7396A68D541C85D26508E83_1542843568;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_927459148.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_927459148;
        // ---------- Original Method ----------
        //ViewParent vp = view.getParent();
        //while (vp != null && !(vp instanceof ViewRootImpl)) {
            //vp = vp.getParent();
        //}
        //if (vp == null) return null;
        //ViewRootImpl vr = (ViewRootImpl)vp;
        //int N = mRoots.length;
        //for (int i = 0; i < N; ++i) {
            //if (mRoots[i] == vr) {
                //return mParams[i];
            //}
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.964 -0400", hash_original_method = "2D5B77D42F80E7BB97C9217066ACC1E7", hash_generated_method = "910D676C81E32EF366F77F71D3376042")
    public void closeAll() {
        closeAll(null, null, null);
        // ---------- Original Method ----------
        //closeAll(null, null, null);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.964 -0400", hash_original_method = "6421FA4950C786DB3C3137628B8417F4", hash_generated_method = "929FB5A4559FD63B5D1FE12E9CC1C2E6")
    public Display getDefaultDisplay() {
        Display varB4EAC82CA7396A68D541C85D26508E83_571625245 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_571625245 = new Display(Display.DEFAULT_DISPLAY, null);
        varB4EAC82CA7396A68D541C85D26508E83_571625245.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_571625245;
        // ---------- Original Method ----------
        //return new Display(Display.DEFAULT_DISPLAY, null);
    }

    
        private static void removeItem(Object[] dst, Object[] src, int index) {
        if (dst.length > 0) {
            if (index > 0) {
                System.arraycopy(src, 0, dst, 0, index);
            }
            if (index < dst.length) {
                System.arraycopy(src, index+1, dst, index, src.length-index-1);
            }
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.965 -0400", hash_original_method = "D0BCCB21246B97649D4401D223B22EEE", hash_generated_method = "55249116D3B53A95EF970E21F7C1F554")
    private int findViewLocked(View view, boolean required) {
        {
            int count;
            count = mViews.length;
            count = 0;
            {
                int i;
                i = 0;
            } //End collapsed parenthetic
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                        "View not attached to window manager");
            } //End block
        } //End block
        addTaint(view.getTaint());
        addTaint(required);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_929883826 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_929883826;
        // ---------- Original Method ----------
        //synchronized (this) {
            //final int count = mViews != null ? mViews.length : 0;
            //for (int i=0; i<count; i++) {
                //if (mViews[i] == view) {
                    //return i;
                //}
            //}
            //if (required) {
                //throw new IllegalArgumentException(
                        //"View not attached to window manager");
            //}
            //return -1;
        //}
    }

    
    static class CompatModeWrapper implements WindowManager {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.965 -0400", hash_original_field = "306519E50E3A91B9733D09F5D8EB985C", hash_generated_field = "FEEC7915B51FB12A1344576DA3BE0D25")

        private WindowManagerImpl mWindowManager;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.965 -0400", hash_original_field = "17753C02FDB97D79869D5B96341900F6", hash_generated_field = "C3E7910AA914C8E7E284BFD6C9B88D3E")

        private Display mDefaultDisplay;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.965 -0400", hash_original_field = "27C9B400936470E0D86B9AA2CDF3AED4", hash_generated_field = "01AEB6BE7A1CFB44C6B781D7301EC317")

        private CompatibilityInfoHolder mCompatibilityInfo;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.981 -0400", hash_original_method = "3FF7A4C8C61ABC650A78463DAC06ED7D", hash_generated_method = "CE7D289C63B7CDEFAF189B0FC00F7069")
          CompatModeWrapper(WindowManager wm, CompatibilityInfoHolder ci) {
            mWindowManager = wm instanceof CompatModeWrapper
                    ? ((CompatModeWrapper)wm).mWindowManager : (WindowManagerImpl)wm;
            {
                mDefaultDisplay = mWindowManager.getDefaultDisplay();
            } //End block
            {
                mDefaultDisplay = Display.createCompatibleDisplay(
                        mWindowManager.getDefaultDisplay().getDisplayId(), ci);
            } //End block
            mCompatibilityInfo = ci;
            // ---------- Original Method ----------
            //mWindowManager = wm instanceof CompatModeWrapper
                    //? ((CompatModeWrapper)wm).mWindowManager : (WindowManagerImpl)wm;
            //if (ci == null) {
                //mDefaultDisplay = mWindowManager.getDefaultDisplay();
            //} else {
                //mDefaultDisplay = Display.createCompatibleDisplay(
                        //mWindowManager.getDefaultDisplay().getDisplayId(), ci);
            //}
            //mCompatibilityInfo = ci;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.982 -0400", hash_original_method = "7609871ECBC27319C7927D8EEDE045EA", hash_generated_method = "6CF46C49A000BECDAD4F809B0B9ECA2F")
        @Override
        public void addView(View view, android.view.ViewGroup.LayoutParams params) {
            mWindowManager.addView(view, params, mCompatibilityInfo);
            addTaint(view.getTaint());
            addTaint(params.getTaint());
            // ---------- Original Method ----------
            //mWindowManager.addView(view, params, mCompatibilityInfo);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.983 -0400", hash_original_method = "919C5545CD5BB1E858D85286FE5FCBED", hash_generated_method = "2FDA020E24C0BC05323CE49786639DBA")
        @Override
        public void updateViewLayout(View view, android.view.ViewGroup.LayoutParams params) {
            mWindowManager.updateViewLayout(view, params);
            addTaint(view.getTaint());
            addTaint(params.getTaint());
            // ---------- Original Method ----------
            //mWindowManager.updateViewLayout(view, params);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:53.984 -0400", hash_original_method = "5F05EF082DAFF0E6020E51FDACFCFBF6", hash_generated_method = "F879B490955646FB1E78A7CBF5304684")
        @Override
        public void removeView(View view) {
            mWindowManager.removeView(view);
            addTaint(view.getTaint());
            // ---------- Original Method ----------
            //mWindowManager.removeView(view);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.013 -0400", hash_original_method = "56BE5D6095195D262FD5BEEEDA100E7B", hash_generated_method = "F35F372F1406F066A78C65F28FBFA422")
        @Override
        public Display getDefaultDisplay() {
            Display varB4EAC82CA7396A68D541C85D26508E83_2059370877 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_2059370877 = mDefaultDisplay;
            varB4EAC82CA7396A68D541C85D26508E83_2059370877.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_2059370877;
            // ---------- Original Method ----------
            //return mDefaultDisplay;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.014 -0400", hash_original_method = "4EE5EB2962C6A561F3596BAB39C4DB7E", hash_generated_method = "2F3DB644C585255B166E384D13DB6E30")
        @Override
        public void removeViewImmediate(View view) {
            mWindowManager.removeViewImmediate(view);
            addTaint(view.getTaint());
            // ---------- Original Method ----------
            //mWindowManager.removeViewImmediate(view);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.014 -0400", hash_original_method = "E8FDE829A6ED2289D510D94BC19E7A4F", hash_generated_method = "3FC5506B4810BFB429E116A7BFF71555")
        @Override
        public boolean isHardwareAccelerated() {
            boolean var537FD339DB319870C25465E8732CD454_1673360152 = (mWindowManager.isHardwareAccelerated());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2061233246 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_2061233246;
            // ---------- Original Method ----------
            //return mWindowManager.isHardwareAccelerated();
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.014 -0400", hash_original_field = "096BF12F9EBCA28E49706C74E09FD905", hash_generated_field = "BEBDB0C4DE9800D9D6744BC8414EE1E3")

    public static final int RELAYOUT_RES_IN_TOUCH_MODE = 0x1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.014 -0400", hash_original_field = "1B20578EB71512F8EABE8E7F0F7FB607", hash_generated_field = "8F62C3BDE71832A2D68F514201B29E45")

    public static final int RELAYOUT_RES_FIRST_TIME = 0x2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "72C941E47F017B452573327573961320", hash_generated_field = "68A8891465BB14EE588048EAE11177B6")

    public static final int RELAYOUT_RES_SURFACE_CHANGED = 0x4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "604E01920957E315364B134C955C11F1", hash_generated_field = "3D5DD8B8FA44EAB5D12F636499EC9823")

    public static final int RELAYOUT_INSETS_PENDING = 0x1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "32D1EBFCBE50F75F286EA02D4C377D17", hash_generated_field = "174CC84AFA7FFC82F7BCA824DF5DBFB8")

    public static final int RELAYOUT_DEFER_SURFACE_DESTROY = 0x2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "FD57D39BAE14DD800BE94CD1FEC2F209", hash_generated_field = "B45631C5AC56ACFEA482DD61E10D666D")

    public static final int ADD_FLAG_APP_VISIBLE = 0x2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "1090FF8B24E420D2B55E68C183773C2F", hash_generated_field = "8A0B6E6C40A3B9E8AD1DB662FFBC63B1")

    public static final int ADD_FLAG_IN_TOUCH_MODE = RELAYOUT_RES_IN_TOUCH_MODE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "C1D359C476720A1A13CB6DD42DD9927D", hash_generated_field = "896EA10F4EEDBD22866D19F5C37C2883")

    public static final int ADD_OKAY = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "B8045D0803B176FA3C49EAD8DDCEE78D", hash_generated_field = "6250BE795ED30E4E71D089144220CBD2")

    public static final int ADD_BAD_APP_TOKEN = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "69BCE95D0619221231007FF0223CD5CA", hash_generated_field = "1E507DB8D29AA4E4EB75979C5B513862")

    public static final int ADD_BAD_SUBWINDOW_TOKEN = -2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "87D3BDC7125C9B7F3F0C5AAA3081CBEE", hash_generated_field = "CF74437B4ABA6A66CC5F33FAE0469A87")

    public static final int ADD_NOT_APP_TOKEN = -3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "83C33948AE1D352A3EB2C666F9FECDC6", hash_generated_field = "25698B4845820B88A430CDDB9E487015")

    public static final int ADD_APP_EXITING = -4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "164990C5E8C2ED546F72E8EBB28411DF", hash_generated_field = "3AF2CF38E39266B60A6668C9A516A055")

    public static final int ADD_DUPLICATE_ADD = -5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "54E79096188F641E1A287759CF9E265B", hash_generated_field = "D789E72C8CABCD14EC5B0824A2F2FC96")

    public static final int ADD_STARTING_NOT_NEEDED = -6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "FA9EC826AD38BA3AD63DC34123C61D1F", hash_generated_field = "EA6A54060B8C4D297CDC8FC5F3153ECE")

    public static final int ADD_MULTIPLE_SINGLETON = -7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "B6CCE3C35D140B35BBE6FDBA8B104F1A", hash_generated_field = "8036D9CCA49B1A5D7465CBB746CA2A36")

    public static final int ADD_PERMISSION_DENIED = -8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "6FBEC3E7BB69D1E09ECABF075E18871F", hash_generated_field = "E209496F9F2C9103A6260BCF69D3191B")

    private static Object sLock = new Object();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "83DB86F24D6A373312BF12EDD9A412A6", hash_generated_field = "36EDA87CB394B87ADAD1B8B3B7F5B938")

    private static WindowManagerImpl sWindowManager = new WindowManagerImpl();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:54.015 -0400", hash_original_field = "75C834DF5CDF76F1FB4C0DD3037986FA", hash_generated_field = "C553AA9D53060C9DA053ED949704E03E")

    private static HashMap<CompatibilityInfo, WindowManager> sCompatWindowManagers = new HashMap<CompatibilityInfo, WindowManager>();
}

