package com.google.android.gles_jni;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import javax.microedition.khronos.egl.*;

public class EGLSurfaceImpl extends EGLSurface {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:28.768 -0400", hash_original_field = "3DC8CA11CDD01EA82F28251758139AEE", hash_generated_field = "296DD015E00E19A6AFBFBEA67F8ACDA3")

    int mEGLSurface;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:28.768 -0400", hash_original_field = "84A5293844ED914C29A49CB1899ECF8B", hash_generated_field = "76B5871A33DA54FE461481FECA9BEAF0")

    private int mNativePixelRef;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:28.768 -0400", hash_original_method = "86437EA058F070B58780D104343F6F45", hash_generated_method = "BD3D140B3EACB46D78F5FF7C9D82DC7F")
    public  EGLSurfaceImpl() {
        mEGLSurface = 0;
        mNativePixelRef = 0;
        // ---------- Original Method ----------
        //mEGLSurface = 0;
        //mNativePixelRef = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:28.774 -0400", hash_original_method = "547A9AA0BBA76A5D7ACA46BEF8F827CB", hash_generated_method = "5F6E2499529C43EEA5E7AD98D02539E6")
    public  EGLSurfaceImpl(int surface) {
        mEGLSurface = surface;
        mNativePixelRef = 0;
        // ---------- Original Method ----------
        //mEGLSurface = surface;
        //mNativePixelRef = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:28.775 -0400", hash_original_method = "686C2DC893E9E8D9D02295779AC83C23", hash_generated_method = "C76F1D9D93302057917C937A3E74C029")
    @Override
    public boolean equals(Object o) {
        {
            boolean var62E9FD43E59369C472D5FDFD656300C3_640010213 = (o == null || getClass() != o.getClass());
        } //End collapsed parenthetic
        EGLSurfaceImpl that;
        that = (EGLSurfaceImpl) o;
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1069528618 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1069528618;
        // ---------- Original Method ----------
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        //EGLSurfaceImpl that = (EGLSurfaceImpl) o;
        //return mEGLSurface == that.mEGLSurface;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:28.775 -0400", hash_original_method = "688B514F649E9FC55EF131746A1254F0", hash_generated_method = "F5BD2A25114B75A4BA1B6ADCFD9107EF")
    @Override
    public int hashCode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_577082562 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_577082562;
        // ---------- Original Method ----------
        //return mEGLSurface;
    }

    
}

