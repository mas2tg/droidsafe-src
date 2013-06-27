package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public abstract class AbsSeekBar extends ProgressBar {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.139 -0400", hash_original_field = "4C52B1548343B5F67E71ABAB98CDCE25", hash_generated_field = "A9FD89A9EA0824250F9B9C034928CB8F")

    private Drawable mThumb;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "A28BD1DCDFDB076ED8B0128D800E7517", hash_generated_field = "EDEA4E873C327B12CA4083E0E57BEE64")

    private int mThumbOffset;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "55F071D4796DEB743D84809F3A8DC6D5", hash_generated_field = "E221719242D0437E0E0816E9049A3A6E")

    float mTouchProgressOffset;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "281E125C1BC7343D2104EB0DF2965583", hash_generated_field = "267BD1149348204124B40DB8937D82FB")

    boolean mIsUserSeekable = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "D09059F0BDE48E485EF2977038ECC6B6", hash_generated_field = "DA3EB023D2AE87BC493256844DF4F8FC")

    private int mKeyProgressIncrement = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "442F8731C67AF26E1E29D47472A461BF", hash_generated_field = "BE45430B4E582ECC76FDAE96B324FF18")

    private float mDisabledAlpha;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "007A72391FE679B54C8CDBD6A79A1E3F", hash_generated_field = "A6018E4F8C21D3EE961380A6D74CC7E0")

    private int mScaledTouchSlop;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "82594ABA40C2D7123512A711436C704D", hash_generated_field = "A48801BD53279BF93DEF5A0855023B3F")

    private float mTouchDownX;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_field = "88529674006503CAD340B538C44A2C88", hash_generated_field = "71A2FEF14E89166E5A8A859417B1663A")

    private boolean mIsDragging;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.140 -0400", hash_original_method = "559FDCE349858758D50BC2905EE88B67", hash_generated_method = "FDA7C2EB8B5296D46FCCA250BF0143BC")
    public  AbsSeekBar(Context context) {
        super(context);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.150 -0400", hash_original_method = "9B53DFB86DC24D620F7DF1D33C461438", hash_generated_method = "8981791067297A7D7A8651F841A4D04B")
    public  AbsSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.152 -0400", hash_original_method = "1A34D5E8CF032B0AA6AD65EE16F7EFF6", hash_generated_method = "23F3D0CE8502E06553B45218C0866775")
    public  AbsSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray a;
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.SeekBar, defStyle, 0);
        Drawable thumb;
        thumb = a.getDrawable(com.android.internal.R.styleable.SeekBar_thumb);
        setThumb(thumb);
        int thumbOffset;
        thumbOffset = a.getDimensionPixelOffset(
                com.android.internal.R.styleable.SeekBar_thumbOffset, getThumbOffset());
        setThumbOffset(thumbOffset);
        a.recycle();
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.Theme, 0, 0);
        mDisabledAlpha = a.getFloat(com.android.internal.R.styleable.Theme_disabledAlpha, 0.5f);
        a.recycle();
        mScaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs,
                //com.android.internal.R.styleable.SeekBar, defStyle, 0);
        //Drawable thumb = a.getDrawable(com.android.internal.R.styleable.SeekBar_thumb);
        //setThumb(thumb);
        //int thumbOffset = a.getDimensionPixelOffset(
                //com.android.internal.R.styleable.SeekBar_thumbOffset, getThumbOffset());
        //setThumbOffset(thumbOffset);
        //a.recycle();
        //a = context.obtainStyledAttributes(attrs,
                //com.android.internal.R.styleable.Theme, 0, 0);
        //mDisabledAlpha = a.getFloat(com.android.internal.R.styleable.Theme_disabledAlpha, 0.5f);
        //a.recycle();
        //mScaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.168 -0400", hash_original_method = "998F0AEDC4C83C00C5B5C0950AA82FAF", hash_generated_method = "87B137A6A5D496EF87E0242647C17CAE")
    public void setThumb(Drawable thumb) {
        boolean needUpdate;
        {
            mThumb.setCallback(null);
            needUpdate = true;
        } //End block
        {
            needUpdate = false;
        } //End block
        {
            thumb.setCallback(this);
            mThumbOffset = thumb.getIntrinsicWidth() / 2;
            {
                boolean var59DF2AD9A1CFAFF2C2350A5FD63D8E2E_227060586 = (needUpdate &&
                    (thumb.getIntrinsicWidth() != mThumb.getIntrinsicWidth()
                        || thumb.getIntrinsicHeight() != mThumb.getIntrinsicHeight()));
                {
                    requestLayout();
                } //End block
            } //End collapsed parenthetic
        } //End block
        mThumb = thumb;
        invalidate();
        {
            updateThumbPos(getWidth(), getHeight());
            {
                boolean varFCD92C730287EA43C3C6E5B7570040DB_1119006100 = (thumb.isStateful());
                {
                    int[] state;
                    state = getDrawableState();
                    thumb.setState(state);
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.169 -0400", hash_original_method = "55BCE64F6AB8A7FA94D80EC71DE6965C", hash_generated_method = "13847119F7402A489208343E576A0F2A")
    public int getThumbOffset() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1946408290 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1946408290;
        // ---------- Original Method ----------
        //return mThumbOffset;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.169 -0400", hash_original_method = "19F18537D3EF5D294C0A19C19876A9D3", hash_generated_method = "C1AE1170153E1358AA343297EAC9437B")
    public void setThumbOffset(int thumbOffset) {
        mThumbOffset = thumbOffset;
        invalidate();
        // ---------- Original Method ----------
        //mThumbOffset = thumbOffset;
        //invalidate();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.169 -0400", hash_original_method = "47EA7303B3E1A2D7511BD2240E8B9AF2", hash_generated_method = "23FC38C564F6AB4BEDBEB8AF8AF33262")
    public void setKeyProgressIncrement(int increment) {
        mKeyProgressIncrement = increment < 0 ? -increment : increment;
        // ---------- Original Method ----------
        //mKeyProgressIncrement = increment < 0 ? -increment : increment;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.170 -0400", hash_original_method = "1305A27F8447A6D05AC7D82E2D035BB9", hash_generated_method = "44561F497541136FE1B1C7D7D8E08575")
    public int getKeyProgressIncrement() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_766747971 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_766747971;
        // ---------- Original Method ----------
        //return mKeyProgressIncrement;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.170 -0400", hash_original_method = "B86F9FD250EB4E355A6234A6154554E5", hash_generated_method = "E3CBF26414B1C868D690010AC7DC12DF")
    @Override
    public synchronized void setMax(int max) {
        super.setMax(max);
        {
            boolean var5A2D5B08CD2B6F9FFB530FF2ED2BD2AF_1437696104 = ((mKeyProgressIncrement == 0) || (getMax() / mKeyProgressIncrement > 20));
            {
                setKeyProgressIncrement(Math.max(1, Math.round((float) getMax() / 20)));
            } //End block
        } //End collapsed parenthetic
        addTaint(max);
        // ---------- Original Method ----------
        //super.setMax(max);
        //if ((mKeyProgressIncrement == 0) || (getMax() / mKeyProgressIncrement > 20)) {
            //setKeyProgressIncrement(Math.max(1, Math.round((float) getMax() / 20)));
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.171 -0400", hash_original_method = "9C2A9BDC8A382BBBC0B52ACD6BB3E808", hash_generated_method = "5F9E0217F34D96E75AD297DB881CB29C")
    @Override
    protected boolean verifyDrawable(Drawable who) {
        boolean varE1C56A7DB014338269CA53D8B5F618C2_2079185919 = (who == mThumb || super.verifyDrawable(who));
        addTaint(who.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2087190716 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2087190716;
        // ---------- Original Method ----------
        //return who == mThumb || super.verifyDrawable(who);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.171 -0400", hash_original_method = "A2BEB9099595ED17C9F72C657E221F4D", hash_generated_method = "DA07F644E239140FB7E0B906AAB88BB2")
    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        mThumb.jumpToCurrentState();
        // ---------- Original Method ----------
        //super.jumpDrawablesToCurrentState();
        //if (mThumb != null) mThumb.jumpToCurrentState();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.172 -0400", hash_original_method = "18D3C014C29EEACE1B64A99674108866", hash_generated_method = "FDFACC55DC58C648F7B1A2DC26028F06")
    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable progressDrawable;
        progressDrawable = getProgressDrawable();
        {
            progressDrawable.setAlpha(isEnabled() ? NO_ALPHA : (int) (NO_ALPHA * mDisabledAlpha));
        } //End block
        {
            boolean varBADFD63D920DCCB8A0340B6A85499F1D_414283021 = (mThumb != null && mThumb.isStateful());
            {
                int[] state;
                state = getDrawableState();
                mThumb.setState(state);
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //super.drawableStateChanged();
        //Drawable progressDrawable = getProgressDrawable();
        //if (progressDrawable != null) {
            //progressDrawable.setAlpha(isEnabled() ? NO_ALPHA : (int) (NO_ALPHA * mDisabledAlpha));
        //}
        //if (mThumb != null && mThumb.isStateful()) {
            //int[] state = getDrawableState();
            //mThumb.setState(state);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.172 -0400", hash_original_method = "BD33A56797AEA3D6F712418E2C1B11B9", hash_generated_method = "975ED7315D5FC041DAC0BE3A92EF93CB")
    @Override
     void onProgressRefresh(float scale, boolean fromUser) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onProgressRefresh(scale, fromUser);
        Drawable thumb;
        thumb = mThumb;
        {
            setThumbPos(getWidth(), thumb, scale, Integer.MIN_VALUE);
            invalidate();
        } //End block
        addTaint(scale);
        addTaint(fromUser);
        // ---------- Original Method ----------
        //super.onProgressRefresh(scale, fromUser);
        //Drawable thumb = mThumb;
        //if (thumb != null) {
            //setThumbPos(getWidth(), thumb, scale, Integer.MIN_VALUE);
            //invalidate();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.172 -0400", hash_original_method = "A1D4A37B8CF40CBB929E8D311A74C166", hash_generated_method = "BD3F4A89917ED7394619AAB306509CBF")
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        updateThumbPos(w, h);
        addTaint(w);
        addTaint(h);
        addTaint(oldw);
        addTaint(oldh);
        // ---------- Original Method ----------
        //updateThumbPos(w, h);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.173 -0400", hash_original_method = "EBB195A6F6AE70942CBBB72014D4E630", hash_generated_method = "D96FE2BB87C9676C72D5B039EF4EEC34")
    private void updateThumbPos(int w, int h) {
        Drawable d;
        d = getCurrentDrawable();
        Drawable thumb;
        thumb = mThumb;
        int thumbHeight;
        thumbHeight = 0;
        thumbHeight = thumb.getIntrinsicHeight();
        int trackHeight;
        trackHeight = Math.min(mMaxHeight, h - mPaddingTop - mPaddingBottom);
        int max;
        max = getMax();
        float scale;
        scale = (float) getProgress() / (float) max;
        scale = 0;
        {
            {
                setThumbPos(w, thumb, scale, 0);
            } //End block
            int gapForCenteringTrack;
            gapForCenteringTrack = (thumbHeight - trackHeight) / 2;
            {
                d.setBounds(0, gapForCenteringTrack, 
                        w - mPaddingRight - mPaddingLeft, h - mPaddingBottom - gapForCenteringTrack
                        - mPaddingTop);
            } //End block
        } //End block
        {
            {
                d.setBounds(0, 0, w - mPaddingRight - mPaddingLeft, h - mPaddingBottom
                        - mPaddingTop);
            } //End block
            int gap;
            gap = (trackHeight - thumbHeight) / 2;
            {
                setThumbPos(w, thumb, scale, gap);
            } //End block
        } //End block
        addTaint(w);
        addTaint(h);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.187 -0400", hash_original_method = "CA4C19C8B40982548F0C235E2E1E696B", hash_generated_method = "23F6C0632436D8DDA7D111AE8F7CB297")
    private void setThumbPos(int w, Drawable thumb, float scale, int gap) {
        int available;
        available = w - mPaddingLeft - mPaddingRight;
        int thumbWidth;
        thumbWidth = thumb.getIntrinsicWidth();
        int thumbHeight;
        thumbHeight = thumb.getIntrinsicHeight();
        available -= thumbWidth;
        available += mThumbOffset * 2;
        int thumbPos;
        thumbPos = (int) (scale * available);
        int topBound, bottomBound;
        {
            Rect oldBounds;
            oldBounds = thumb.getBounds();
            topBound = oldBounds.top;
            bottomBound = oldBounds.bottom;
        } //End block
        {
            topBound = gap;
            bottomBound = gap + thumbHeight;
        } //End block
        thumb.setBounds(thumbPos, topBound, thumbPos + thumbWidth, bottomBound);
        addTaint(w);
        addTaint(thumb.getTaint());
        addTaint(scale);
        addTaint(gap);
        // ---------- Original Method ----------
        //int available = w - mPaddingLeft - mPaddingRight;
        //int thumbWidth = thumb.getIntrinsicWidth();
        //int thumbHeight = thumb.getIntrinsicHeight();
        //available -= thumbWidth;
        //available += mThumbOffset * 2;
        //int thumbPos = (int) (scale * available);
        //int topBound, bottomBound;
        //if (gap == Integer.MIN_VALUE) {
            //Rect oldBounds = thumb.getBounds();
            //topBound = oldBounds.top;
            //bottomBound = oldBounds.bottom;
        //} else {
            //topBound = gap;
            //bottomBound = gap + thumbHeight;
        //}
        //thumb.setBounds(thumbPos, topBound, thumbPos + thumbWidth, bottomBound);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.188 -0400", hash_original_method = "317EB63F41EF20BCBD26EC2C5FF1A8E2", hash_generated_method = "3191AD8A9B9449A65B03106CEC988F1A")
    @Override
    protected synchronized void onDraw(Canvas canvas) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onDraw(canvas);
        {
            canvas.save();
            canvas.translate(mPaddingLeft - mThumbOffset, mPaddingTop);
            mThumb.draw(canvas);
            canvas.restore();
        } //End block
        addTaint(canvas.getTaint());
        // ---------- Original Method ----------
        //super.onDraw(canvas);
        //if (mThumb != null) {
            //canvas.save();
            //canvas.translate(mPaddingLeft - mThumbOffset, mPaddingTop);
            //mThumb.draw(canvas);
            //canvas.restore();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.190 -0400", hash_original_method = "6FE23FC5494DD28976118E3A2B4F8E1A", hash_generated_method = "90D1C00D2BA4B9A22BE4465E1DD8391B")
    @Override
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        Drawable d;
        d = getCurrentDrawable();
        int thumbHeight;
        thumbHeight = 0;
        thumbHeight = mThumb.getIntrinsicHeight();
        int dw;
        dw = 0;
        int dh;
        dh = 0;
        {
            dw = Math.max(mMinWidth, Math.min(mMaxWidth, d.getIntrinsicWidth()));
            dh = Math.max(mMinHeight, Math.min(mMaxHeight, d.getIntrinsicHeight()));
            dh = Math.max(thumbHeight, dh);
        } //End block
        dw += mPaddingLeft + mPaddingRight;
        dh += mPaddingTop + mPaddingBottom;
        setMeasuredDimension(resolveSizeAndState(dw, widthMeasureSpec, 0),
                resolveSizeAndState(dh, heightMeasureSpec, 0));
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        //Drawable d = getCurrentDrawable();
        //int thumbHeight = mThumb == null ? 0 : mThumb.getIntrinsicHeight();
        //int dw = 0;
        //int dh = 0;
        //if (d != null) {
            //dw = Math.max(mMinWidth, Math.min(mMaxWidth, d.getIntrinsicWidth()));
            //dh = Math.max(mMinHeight, Math.min(mMaxHeight, d.getIntrinsicHeight()));
            //dh = Math.max(thumbHeight, dh);
        //}
        //dw += mPaddingLeft + mPaddingRight;
        //dh += mPaddingTop + mPaddingBottom;
        //setMeasuredDimension(resolveSizeAndState(dw, widthMeasureSpec, 0),
                //resolveSizeAndState(dh, heightMeasureSpec, 0));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.191 -0400", hash_original_method = "E10F6AB7670DC24DEEA2309682812EC7", hash_generated_method = "8D9E3FE28BF35534A8A268F9F4C12058")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var8142D51ECE34BA115A5095ACA8798364_1065842413 = (!mIsUserSeekable || !isEnabled());
        } //End collapsed parenthetic
        {
            Object var9E1FBD251DF7E53AB77C3A31F15B2B38_42263442 = (event.getAction());
            //Begin case MotionEvent.ACTION_DOWN 
            {
                boolean varEE20AD2B6B37E9F2660E1C9FA2DDFF2D_1647398820 = (isInScrollingContainer());
                {
                    mTouchDownX = event.getX();
                } //End block
                {
                    setPressed(true);
                    {
                        invalidate(mThumb.getBounds());
                    } //End block
                    onStartTrackingTouch();
                    trackTouchEvent(event);
                    attemptClaimDrag();
                } //End block
            } //End collapsed parenthetic
            //End case MotionEvent.ACTION_DOWN 
            //Begin case MotionEvent.ACTION_MOVE 
            {
                trackTouchEvent(event);
            } //End block
            {
                float x;
                x = event.getX();
                {
                    boolean varEBF41794203D169307B1311D8438F448_474095254 = (Math.abs(x - mTouchDownX) > mScaledTouchSlop);
                    {
                        setPressed(true);
                        {
                            invalidate(mThumb.getBounds());
                        } //End block
                        onStartTrackingTouch();
                        trackTouchEvent(event);
                        attemptClaimDrag();
                    } //End block
                } //End collapsed parenthetic
            } //End block
            //End case MotionEvent.ACTION_MOVE 
            //Begin case MotionEvent.ACTION_UP 
            {
                trackTouchEvent(event);
                onStopTrackingTouch();
                setPressed(false);
            } //End block
            {
                onStartTrackingTouch();
                trackTouchEvent(event);
                onStopTrackingTouch();
            } //End block
            //End case MotionEvent.ACTION_UP 
            //Begin case MotionEvent.ACTION_UP 
            invalidate();
            //End case MotionEvent.ACTION_UP 
            //Begin case MotionEvent.ACTION_CANCEL 
            {
                onStopTrackingTouch();
                setPressed(false);
            } //End block
            //End case MotionEvent.ACTION_CANCEL 
            //Begin case MotionEvent.ACTION_CANCEL 
            invalidate();
            //End case MotionEvent.ACTION_CANCEL 
        } //End collapsed parenthetic
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1760887627 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1760887627;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.197 -0400", hash_original_method = "B852C5F326259FF2E0714D28C9BE0803", hash_generated_method = "04332D3CFE0881C6ED14DA566C7046D2")
    private void trackTouchEvent(MotionEvent event) {
        int width;
        width = getWidth();
        int available;
        available = width - mPaddingLeft - mPaddingRight;
        int x;
        x = (int)event.getX();
        float scale;
        float progress;
        progress = 0;
        {
            scale = 0.0f;
        } //End block
        {
            scale = 1.0f;
        } //End block
        {
            scale = (float)(x - mPaddingLeft) / (float)available;
            progress = mTouchProgressOffset;
        } //End block
        int max;
        max = getMax();
        progress += scale * max;
        setProgress((int) progress, true);
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //final int width = getWidth();
        //final int available = width - mPaddingLeft - mPaddingRight;
        //int x = (int)event.getX();
        //float scale;
        //float progress = 0;
        //if (x < mPaddingLeft) {
            //scale = 0.0f;
        //} else if (x > width - mPaddingRight) {
            //scale = 1.0f;
        //} else {
            //scale = (float)(x - mPaddingLeft) / (float)available;
            //progress = mTouchProgressOffset;
        //}
        //final int max = getMax();
        //progress += scale * max;
        //setProgress((int) progress, true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.197 -0400", hash_original_method = "EE6806E5D0C523D5F375E4021A29EB50", hash_generated_method = "2E73808719931C1764DD979BEA00A4A0")
    private void attemptClaimDrag() {
        {
            mParent.requestDisallowInterceptTouchEvent(true);
        } //End block
        // ---------- Original Method ----------
        //if (mParent != null) {
            //mParent.requestDisallowInterceptTouchEvent(true);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.214 -0400", hash_original_method = "81C3D3C536033DCEF00354E775EF2F98", hash_generated_method = "7CAEA821CD5CFD558839E482944A4FF3")
     void onStartTrackingTouch() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mIsDragging = true;
        // ---------- Original Method ----------
        //mIsDragging = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.215 -0400", hash_original_method = "E756AFD9567E2119FB96458DFE00C6A9", hash_generated_method = "28194EE71D53A1717F5B76FA4AF6B1F3")
     void onStopTrackingTouch() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mIsDragging = false;
        // ---------- Original Method ----------
        //mIsDragging = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.215 -0400", hash_original_method = "F04551903C4B751B14DE46074D4BB62C", hash_generated_method = "335DF8C256CE085A3A9253CFE15462AB")
     void onKeyChange() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.216 -0400", hash_original_method = "E4D4B44B4B0BF8B3ACFCDB808BF98F5B", hash_generated_method = "06E6FB4C5E1DD90570420C8F2BC959C1")
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var7DF3FD71A82DB900422A2663707EECDE_113542464 = (isEnabled());
            {
                int progress;
                progress = getProgress();
                //Begin case KeyEvent.KEYCODE_DPAD_LEFT 
                setProgress(progress - mKeyProgressIncrement, true);
                //End case KeyEvent.KEYCODE_DPAD_LEFT 
                //Begin case KeyEvent.KEYCODE_DPAD_LEFT 
                onKeyChange();
                //End case KeyEvent.KEYCODE_DPAD_LEFT 
                //Begin case KeyEvent.KEYCODE_DPAD_RIGHT 
                {
                    boolean varB82DC9CDF51DAE5C4FBB90D1385705AF_1053580121 = (progress >= getMax());
                } //End collapsed parenthetic
                //End case KeyEvent.KEYCODE_DPAD_RIGHT 
                //Begin case KeyEvent.KEYCODE_DPAD_RIGHT 
                setProgress(progress + mKeyProgressIncrement, true);
                //End case KeyEvent.KEYCODE_DPAD_RIGHT 
                //Begin case KeyEvent.KEYCODE_DPAD_RIGHT 
                onKeyChange();
                //End case KeyEvent.KEYCODE_DPAD_RIGHT 
            } //End block
        } //End collapsed parenthetic
        boolean var8C6E6C19273FC56B5C56CC7DEF63ED7B_1889904775 = (super.onKeyDown(keyCode, event));
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1813193554 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1813193554;
        // ---------- Original Method ----------
        //if (isEnabled()) {
            //int progress = getProgress();
            //switch (keyCode) {
                //case KeyEvent.KEYCODE_DPAD_LEFT:
                    //if (progress <= 0) break;
                    //setProgress(progress - mKeyProgressIncrement, true);
                    //onKeyChange();
                    //return true;
                //case KeyEvent.KEYCODE_DPAD_RIGHT:
                    //if (progress >= getMax()) break;
                    //setProgress(progress + mKeyProgressIncrement, true);
                    //onKeyChange();
                    //return true;
            //}
        //}
        //return super.onKeyDown(keyCode, event);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:02.216 -0400", hash_original_field = "B56B6FA624E764C4691175252EBD6A92", hash_generated_field = "28475991B8EB38153B0B8E2972CE05D0")

    private static int NO_ALPHA = 0xFF;
}

