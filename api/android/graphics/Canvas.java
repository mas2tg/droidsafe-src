package android.graphics;

import droidsafe.annotations.DSC;
import droidsafe.annotations.DSModeled;

public class Canvas {
	
	private Bitmap  mBitmap;
	
	@DSModeled(value = DSC.SAFE)
	public Canvas() {
		//Do Nothing
	}
	
	@DSModeled(DSC.SAFE)
	public void drawLine(float startX, float startY, float stopX, float stopY,
            Paint paint) {
		/*
		 * This method calls a native method that draws to a native canvas which
		 * is represented by the mNativeCanvas (a pointer/handle) value in the SDK 
		 * implementation the call will modify the bitmap managed by the native code.
		 * 
		 * DSFIXME:  Technically the underlying bitmap will be changed 
		 * (represented by the int mNativeCanvas).  It appears that this
		 * operation happens in real time, so tracking taint is difficult
		 * on the upflow.
		 */
		dsTaint.addTaint(startX);
		dsTaint.addTaint(startY);
		dsTaint.addTaint(stopX);
		dsTaint.addTaint(stopY);
		dsTaint.addTaint(paint.dsTaint);
	}
	
	@DSModeled(DSC.SAFE)
	public void drawColor(int i) {
		dsTaint.addTaint(i);
	}
	
	@DSModeled(DSC.SAFE)
	public int save(int i) {
		dsTaint.addTaint(i);
		return dsTaint.getTaintInt();
	}
	
	@DSModeled(value = DSC.SAFE)
	public int getDensity() {
		return dsTaint.getTaintInt();
		//return mDensity;
    }
	
	@DSModeled(value = DSC.SAFE)
	public void setDensity(int density) {
		dsTaint.addTaint(density);  //Density is saved both here and in the bitmap
		mBitmap.setDensity(density);  //setDensity will track the taint in the Bitmap object
		/*
        if (mBitmap != null) {
            mBitmap.setDensity(density);
        }
        mDensity = density;
        */
	}
	
	@DSModeled(value = DSC.SAFE)
	public void setBitmap(Bitmap bitmap) {
		dsTaint.addTaint(bitmap.dsTaint);
		dsTaint.addTaint(bitmap.getDensity()); //getDensity will return a tainted value
		/*
        if (isHardwareAccelerated()) {
            throw new RuntimeException("Can't set a bitmap device on a GL canvas");
        }

        int pointer = 0;
        if (bitmap != null) {
            if (!bitmap.isMutable()) {
                throw new IllegalStateException();
            }
            throwIfRecycled(bitmap);
            mDensity = bitmap.mDensity;
            pointer = bitmap.ni();
        }

        native_setBitmap(mNativeCanvas, pointer);
        mBitmap = bitmap;
        */
    }
	
	@DSModeled(DSC.SAFE)
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
		dsTaint.addTaint(bitmap.dsTaint);
		dsTaint.addTaint(left);
		dsTaint.addTaint(top);
		dsTaint.addTaint(paint.dsTaint);
		
		/*
        throwIfRecycled(bitmap);
        native_drawBitmap(mNativeCanvas, bitmap.ni(), left, top,
                paint != null ? paint.mNativePaint : 0, mDensity, mScreenDensity,
                bitmap.mDensity);
        */
    }
	
	/**
     * Draw the specified oval using the specified paint. The oval will be
     * filled or framed based on the Style in the paint.
     *
     * @param oval The rectangle bounds of the oval to be drawn
     */
	@DSModeled(DSC.SAFE)
    public void drawOval(RectF oval, Paint paint) {
		dsTaint.addTaint(oval.dsTaint);
		dsTaint.addTaint(paint.dsTaint);
    	/* GITI DSModeled
        if (oval == null) {
            throw new NullPointerException();
        }
        native_drawOval(mNativeCanvas, oval, paint.mNativePaint);
        */
    }
	
	@DSModeled(DSC.SAFE)
    public void drawPath(Path path, Paint paint) {
		dsTaint.addTaint(path.dsTaint);
		dsTaint.addTaint(paint.dsTaint);
        /*
         native_drawPath(mNativeCanvas, path.ni(), paint.mNativePaint);
        */
    }
	
	//DSFIXME - Do not think this method needs to have any implementation, but need
	// 			to verify.
	@DSModeled(DSC.SAFE)
    public void restore() {
		
	}
	
	@DSModeled(DSC.SAFE)
	public void rotate(float degrees) {
		dsTaint.addTaint(degrees);
	}
	
	@DSModeled(DSC.SAFE)
	public void scale(float sx, float sy) {
		dsTaint.addTaint(sx);
		dsTaint.addTaint(sy);
	}
	
	@DSModeled(DSC.SAFE)
	public void translate(float dx, float dy) {
		dsTaint.addTaint(dx);
		dsTaint.addTaint(dy);
	}
	
	@DSModeled(DSC.SAFE)
	public void concat(Matrix matrix) {
		dsTaint.addTaint(matrix.native_instance);
    }
	
	@DSModeled(DSC.SAFE)
	public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
		dsTaint.addTaint(bitmap.dsTaint);
		dsTaint.addTaint(src.dsTaint);
		dsTaint.addTaint(dst.dsTaint);
		dsTaint.addTaint(paint.dsTaint);
    }
	
}