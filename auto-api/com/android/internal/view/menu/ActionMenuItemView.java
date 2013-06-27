package com.android.internal.view.menu;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ActionMenuItemView extends LinearLayout implements MenuView.ItemView, View.OnClickListener, View.OnLongClickListener, ActionMenuView.ActionMenuChildView {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "1F6C4899836DE7690E2FFD7BA4FE83E4", hash_generated_field = "B32E7CB0DF6786FBC4DDA7C50169A79B")

    private MenuItemImpl mItemData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "4B03BBB3AD21DBD17B2B689923FCF1F6", hash_generated_field = "ECAB18871B55104BACD4283C12B1074D")

    private CharSequence mTitle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "AB2CFA1082AD5EABA7FF59C86326776C", hash_generated_field = "FCA7C24D10E4756C2F866687779CE7A2")

    private MenuBuilder.ItemInvoker mItemInvoker;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "B46A9475B590D71DAC22FFF92B526569", hash_generated_field = "FAB3D217CE66519B4E9F8FFE982A38EF")

    private ImageButton mImageButton;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "3A930298E00D63BB2C7CE42A58E94428", hash_generated_field = "9B0FB4DD236A598CA5E9F899DD0004A7")

    private Button mTextButton;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "6E9B974F382AF000861E8A4BB9D2A625", hash_generated_field = "026998B37BE3694ADAD845A945E977A5")

    private boolean mAllowTextWithIcon;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "B3A27FF3D8463FDB775C445216DF0827", hash_generated_field = "8BCC0CCB20D7838DC0FF6BF986026A67")

    private boolean mExpandedFormat;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.012 -0400", hash_original_field = "2FB832D2671571BF4EC0C84F8DA6AA79", hash_generated_field = "ED0C6BF081117F2A257C521DB4125AB9")

    private int mMinWidth;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.013 -0400", hash_original_method = "A9C9E45D494EF4E28228859D4DA5948C", hash_generated_method = "8AE7A8B46B263A83796861159E003845")
    public  ActionMenuItemView(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.013 -0400", hash_original_method = "414C1C737BA41080151B3C84CB3C1FDA", hash_generated_method = "D747FA8D05F67DD3BD6F452E5C4A861B")
    public  ActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.020 -0400", hash_original_method = "7FEBDC4FE1DC1778EBE8D4C1AD12D9F5", hash_generated_method = "C7C9A52C6A723E58CE862F6A5DB15CBC")
    public  ActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Resources res;
        res = context.getResources();
        mAllowTextWithIcon = res.getBoolean(
                com.android.internal.R.bool.config_allowActionMenuItemTextWithIcon);
        TypedArray a;
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.ActionMenuItemView, 0, 0);
        mMinWidth = a.getDimensionPixelSize(
                com.android.internal.R.styleable.ActionMenuItemView_minWidth, 0);
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        //final Resources res = context.getResources();
        //mAllowTextWithIcon = res.getBoolean(
                //com.android.internal.R.bool.config_allowActionMenuItemTextWithIcon);
        //TypedArray a = context.obtainStyledAttributes(attrs,
                //com.android.internal.R.styleable.ActionMenuItemView, 0, 0);
        //mMinWidth = a.getDimensionPixelSize(
                //com.android.internal.R.styleable.ActionMenuItemView_minWidth, 0);
        //a.recycle();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.022 -0400", hash_original_method = "97E99CBFA7DAC670C6AD27C0843F8326", hash_generated_method = "B97291A5FF679C68FDE6F45741CA7D42")
    @Override
    public void onFinishInflate() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mImageButton = (ImageButton) findViewById(com.android.internal.R.id.imageButton);
        mTextButton = (Button) findViewById(com.android.internal.R.id.textButton);
        mImageButton.setOnClickListener(this);
        mTextButton.setOnClickListener(this);
        mImageButton.setOnLongClickListener(this);
        setOnClickListener(this);
        setOnLongClickListener(this);
        // ---------- Original Method ----------
        //mImageButton = (ImageButton) findViewById(com.android.internal.R.id.imageButton);
        //mTextButton = (Button) findViewById(com.android.internal.R.id.textButton);
        //mImageButton.setOnClickListener(this);
        //mTextButton.setOnClickListener(this);
        //mImageButton.setOnLongClickListener(this);
        //setOnClickListener(this);
        //setOnLongClickListener(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.027 -0400", hash_original_method = "F39E0849ABCF707480ABC0B9D2EE2311", hash_generated_method = "5413D3C289832F6538F3F01CA90A9A2D")
    public MenuItemImpl getItemData() {
        MenuItemImpl varB4EAC82CA7396A68D541C85D26508E83_520252900 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_520252900 = mItemData;
        varB4EAC82CA7396A68D541C85D26508E83_520252900.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_520252900;
        // ---------- Original Method ----------
        //return mItemData;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.033 -0400", hash_original_method = "F3ADD2CA2E2A1F1636EEF9ECFE1172AF", hash_generated_method = "59FBB66F175F8B6A46B3B1E710DA63C2")
    public void initialize(MenuItemImpl itemData, int menuType) {
        mItemData = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.getTitleForItemView(this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? View.VISIBLE : View.GONE);
        setEnabled(itemData.isEnabled());
        addTaint(menuType);
        // ---------- Original Method ----------
        //mItemData = itemData;
        //setIcon(itemData.getIcon());
        //setTitle(itemData.getTitleForItemView(this));
        //setId(itemData.getItemId());
        //setVisibility(itemData.isVisible() ? View.VISIBLE : View.GONE);
        //setEnabled(itemData.isEnabled());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.035 -0400", hash_original_method = "CB61F2977C03C3D4A47A54A8D609CC23", hash_generated_method = "819AA5F325DD0645B8FC5528FEABD958")
    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        mImageButton.setEnabled(enabled);
        mTextButton.setEnabled(enabled);
        addTaint(enabled);
        // ---------- Original Method ----------
        //super.setEnabled(enabled);
        //mImageButton.setEnabled(enabled);
        //mTextButton.setEnabled(enabled);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.036 -0400", hash_original_method = "B665A21C15F294A662D29A2BA3A7A359", hash_generated_method = "9FD508E69D55F83CDB8ECEB13F4AFB93")
    public void onClick(View v) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            mItemInvoker.invokeItem(mItemData);
        } //End block
        addTaint(v.getTaint());
        // ---------- Original Method ----------
        //if (mItemInvoker != null) {
            //mItemInvoker.invokeItem(mItemData);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.037 -0400", hash_original_method = "D4B10D907261C4745939FD5942191820", hash_generated_method = "270FC8FDA3818D246FF2F1F090AA616A")
    public void setItemInvoker(MenuBuilder.ItemInvoker invoker) {
        mItemInvoker = invoker;
        // ---------- Original Method ----------
        //mItemInvoker = invoker;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.037 -0400", hash_original_method = "A2F62AB27113ADE9EE493677370BEC6F", hash_generated_method = "A3F4602287B1ADD2027D8866B02B8E7D")
    public boolean prefersCondensedTitle() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2124352272 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2124352272;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.042 -0400", hash_original_method = "206C9D092F8D2CE8A945E1A45B818CB4", hash_generated_method = "BA66FBB494F3C28FF06B59EB6EC283AE")
    public void setCheckable(boolean checkable) {
        addTaint(checkable);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.043 -0400", hash_original_method = "98D5E38367DB01B2323D3E891737183A", hash_generated_method = "E13CE4DF4F9AB654448A696784A01853")
    public void setChecked(boolean checked) {
        addTaint(checked);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.043 -0400", hash_original_method = "4B7C35F58E3B5D585DF448A46B8AF434", hash_generated_method = "226847A47F96B3F5CDCE6EF15E0CDEEE")
    public void setExpandedFormat(boolean expandedFormat) {
        {
            mExpandedFormat = expandedFormat;
            {
                mItemData.actionFormatChanged();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (mExpandedFormat != expandedFormat) {
            //mExpandedFormat = expandedFormat;
            //if (mItemData != null) {
                //mItemData.actionFormatChanged();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.051 -0400", hash_original_method = "A914366A36A1D33567DEDC1A62560744", hash_generated_method = "AED81A7E3307AC6153D8625850340F1C")
    private void updateTextButtonVisibility() {
        boolean visible;
        visible = !TextUtils.isEmpty(mTextButton.getText());
        visible &= mImageButton.getDrawable() == null ||
                (mItemData.showsTextAsAction() && (mAllowTextWithIcon || mExpandedFormat));
        mTextButton.setVisibility(visible ? VISIBLE : GONE);
        // ---------- Original Method ----------
        //boolean visible = !TextUtils.isEmpty(mTextButton.getText());
        //visible &= mImageButton.getDrawable() == null ||
                //(mItemData.showsTextAsAction() && (mAllowTextWithIcon || mExpandedFormat));
        //mTextButton.setVisibility(visible ? VISIBLE : GONE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.052 -0400", hash_original_method = "48979BF203DB7148CE59E9B74A531A1E", hash_generated_method = "70546EBF3D141CBE316E69ED608C183C")
    public void setIcon(Drawable icon) {
        mImageButton.setImageDrawable(icon);
        {
            mImageButton.setVisibility(VISIBLE);
        } //End block
        {
            mImageButton.setVisibility(GONE);
        } //End block
        updateTextButtonVisibility();
        addTaint(icon.getTaint());
        // ---------- Original Method ----------
        //mImageButton.setImageDrawable(icon);
        //if (icon != null) {
            //mImageButton.setVisibility(VISIBLE);
        //} else {
            //mImageButton.setVisibility(GONE);
        //}
        //updateTextButtonVisibility();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.057 -0400", hash_original_method = "DAE9552F4F404C09BF99313735727BF7", hash_generated_method = "09268E8A5598CBC2009567C97A71BF7B")
    public boolean hasText() {
        boolean varF5FAB128084D5D7ABF824447FC5A8FC0_1315575565 = (mTextButton.getVisibility() != GONE);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_891813562 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_891813562;
        // ---------- Original Method ----------
        //return mTextButton.getVisibility() != GONE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.057 -0400", hash_original_method = "85A41D343B47A7443CFB0CEF90E94BCA", hash_generated_method = "601A0A10221E619A1CAEB4BBE66EF7F8")
    public void setShortcut(boolean showShortcut, char shortcutKey) {
        addTaint(showShortcut);
        addTaint(shortcutKey);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.057 -0400", hash_original_method = "E35411C4CA419EBD2C9EFEDC089EF32B", hash_generated_method = "E6232845222D16CB5B1317A1EBB18D80")
    public void setTitle(CharSequence title) {
        mTitle = title;
        mTextButton.setText(mTitle);
        setContentDescription(mTitle);
        updateTextButtonVisibility();
        // ---------- Original Method ----------
        //mTitle = title;
        //mTextButton.setText(mTitle);
        //setContentDescription(mTitle);
        //updateTextButtonVisibility();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.059 -0400", hash_original_method = "CFB95F18A35F8E50D440D10682646E0E", hash_generated_method = "1754B1669CA4F81F50141725D6A54C45")
    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        onPopulateAccessibilityEvent(event);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1501757963 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1501757963;
        // ---------- Original Method ----------
        //onPopulateAccessibilityEvent(event);
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.060 -0400", hash_original_method = "FDE4E65FE29B6BBB876E3C716DF53BA6", hash_generated_method = "ECCFE8DC1F8839C179172E80C10E6E2E")
    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onPopulateAccessibilityEvent(event);
        CharSequence cdesc;
        cdesc = getContentDescription();
        {
            boolean var084C16D53D5FFC75BDE8D9D1CF00C211_2037437979 = (!TextUtils.isEmpty(cdesc));
            {
                event.getText().add(cdesc);
            } //End block
        } //End collapsed parenthetic
        addTaint(event.getTaint());
        // ---------- Original Method ----------
        //super.onPopulateAccessibilityEvent(event);
        //final CharSequence cdesc = getContentDescription();
        //if (!TextUtils.isEmpty(cdesc)) {
            //event.getText().add(cdesc);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.060 -0400", hash_original_method = "757AA99E9D5B690C1E0FFF7AC4DD062B", hash_generated_method = "CC33C51A1088DF3DCFD5E06F08672CFE")
    @Override
    public boolean dispatchHoverEvent(MotionEvent event) {
        boolean var20FA514C60FFF8C5D29FC4243A17D964_1639163877 = (onHoverEvent(event));
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1187415048 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1187415048;
        // ---------- Original Method ----------
        //return onHoverEvent(event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.068 -0400", hash_original_method = "C76AE16CD3DCE07A39A065D6C2B5EB3F", hash_generated_method = "C0756EC4BC7E4BF339D9CA56F535CBCF")
    public boolean showsIcon() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_85247119 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_85247119;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.068 -0400", hash_original_method = "6E6CD62A341ADB3BA1A0AA59225DD877", hash_generated_method = "52CE3707EFEBCC40BC0349A3D6616313")
    public boolean needsDividerBefore() {
        boolean varC391B8333746DF3495063ECE87850875_132870947 = (hasText() && mItemData.getIcon() == null);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_518092831 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_518092831;
        // ---------- Original Method ----------
        //return hasText() && mItemData.getIcon() == null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.069 -0400", hash_original_method = "20C5403BD48B33FD0977D6BAA2D766A2", hash_generated_method = "1332CFAB26221BBB488AC7BD62CF3FC2")
    public boolean needsDividerAfter() {
        boolean varFE379F5963DF6F578F28789FBF75C885_2051509683 = (hasText());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_899483855 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_899483855;
        // ---------- Original Method ----------
        //return hasText();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.070 -0400", hash_original_method = "10936D3B137771DD6A653DC8F3F943BC", hash_generated_method = "E75535EBC54131921D8A53086A933DB6")
    @Override
    public boolean onLongClick(View v) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var2426BFEBBB871B2BC0447A62A0462B28_653345306 = (hasText());
        } //End collapsed parenthetic
        int[] screenPos;
        screenPos = new int[2];
        Rect displayFrame;
        displayFrame = new Rect();
        getLocationOnScreen(screenPos);
        getWindowVisibleDisplayFrame(displayFrame);
        Context context;
        context = getContext();
        int width;
        width = getWidth();
        int height;
        height = getHeight();
        int midy;
        midy = screenPos[1] + height / 2;
        int screenWidth;
        screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        Toast cheatSheet;
        cheatSheet = Toast.makeText(context, mItemData.getTitle(), Toast.LENGTH_SHORT);
        {
            boolean varE02E65C8258A93EC7D0AFE2F76F131C1_1649693056 = (midy < displayFrame.height());
            {
                cheatSheet.setGravity(Gravity.TOP | Gravity.RIGHT,
                    screenWidth - screenPos[0] - width / 2, height);
            } //End block
            {
                cheatSheet.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, height);
            } //End block
        } //End collapsed parenthetic
        cheatSheet.show();
        addTaint(v.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1436173199 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1436173199;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.076 -0400", hash_original_method = "0390CA0D2B05A2CB99D4521DDD33A8D8", hash_generated_method = "5E075E06F6DFFB8AC6AA77736B54DE55")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode;
        widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int specSize;
        specSize = MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth;
        oldMeasuredWidth = getMeasuredWidth();
        int targetWidth;
        targetWidth = Math.min(specSize, mMinWidth);
        targetWidth = mMinWidth;
        {
            super.onMeasure(MeasureSpec.makeMeasureSpec(targetWidth, MeasureSpec.EXACTLY),
                    heightMeasureSpec);
        } //End block
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        //final int specSize = MeasureSpec.getSize(widthMeasureSpec);
        //final int oldMeasuredWidth = getMeasuredWidth();
        //final int targetWidth = widthMode == MeasureSpec.AT_MOST ? Math.min(specSize, mMinWidth)
                //: mMinWidth;
        //if (widthMode != MeasureSpec.EXACTLY && mMinWidth > 0 && oldMeasuredWidth < targetWidth) {
            //super.onMeasure(MeasureSpec.makeMeasureSpec(targetWidth, MeasureSpec.EXACTLY),
                    //heightMeasureSpec);
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:27.077 -0400", hash_original_field = "1B7293974E82EC0E13643EFB7F5F9643", hash_generated_field = "90C1C7543FE6362DB12201947F7D53E2")

    private static String TAG = "ActionMenuItemView";
}

