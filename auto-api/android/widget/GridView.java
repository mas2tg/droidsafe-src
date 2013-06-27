package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.GridLayoutAnimationController;
import android.widget.RemoteViews.RemoteView;

public class GridView extends AbsListView {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "47E234C72F8463B7C6770D658A5E41C2", hash_generated_field = "CAA46A02DF073835D5C8346AD9A9CB63")

    private int mNumColumns = AUTO_FIT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "984A75716F93CAE1C49F1090E6A0CB2C", hash_generated_field = "E9FAC14F36FB56A0DCAB954B62C2DF2B")

    private int mHorizontalSpacing = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "FE80057B725E738FDE5E09E6B3B7F8F2", hash_generated_field = "A39AD23AD5FCB84AB23C237FC706C8F3")

    private int mRequestedHorizontalSpacing;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "04A0AE56E019E90823DFCF538F9EB200", hash_generated_field = "84EB60F5A5BD3F778480F01C86BB8AA9")

    private int mVerticalSpacing = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "D2D9B35C5FA16AAC3C153C6F6D51079F", hash_generated_field = "AEA63239A963A24EEC1FCFD67B3B96A7")

    private int mStretchMode = STRETCH_COLUMN_WIDTH;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "E1663A40DA302B5F0D865267D61B180B", hash_generated_field = "20F46DBB58574C7E2F33333D8FE15571")

    private int mColumnWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "145243760978B68BCAB5FA8129C172AE", hash_generated_field = "7063064B546DF13BA7FDA901DDEC5780")

    private int mRequestedColumnWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "53E8A93614B65E7EB80706CE2B65D07B", hash_generated_field = "583D48FC72E3B18BBAD06B1F4E148F28")

    private int mRequestedNumColumns;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "94710AAABC607EA664B744BE97844000", hash_generated_field = "7823B4B6322E0EBEB34297B0E440B23B")

    private View mReferenceView = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "5238F9CB997751442CCEC167A710A933", hash_generated_field = "E909A7C80DCAC01F178BEF4C30386FF5")

    private View mReferenceViewInSelectedRow = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "32B080F2E8D2B31FD5606656CD48D0F9", hash_generated_field = "B1F879D1C3141C34182BB7A64318C608")

    private int mGravity = Gravity.LEFT;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.125 -0400", hash_original_field = "DF43B278CEE8933271AB3D9F9E312F86", hash_generated_field = "AFFA54D19F07A10EE8847CF76FC95323")

    private Rect mTempRect = new Rect();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.126 -0400", hash_original_method = "6B9AD93D67DF35D03ADA1536C0A58FBF", hash_generated_method = "983C8391566F7BB71FF28D509435B241")
    public  GridView(Context context) {
        super(context);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.126 -0400", hash_original_method = "2A531A248703ACB5E0E1C6A31088A2B2", hash_generated_method = "E11680A0214921982AE47985C34842A5")
    public  GridView(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.gridViewStyle);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.127 -0400", hash_original_method = "49F6501DFACF5B2EADDBFC02F7376929", hash_generated_method = "6196F5D5CB9ACA776DDDBE63EB320CFD")
    public  GridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray a;
        a = context.obtainStyledAttributes(attrs,
                com.android.internal.R.styleable.GridView, defStyle, 0);
        int hSpacing;
        hSpacing = a.getDimensionPixelOffset(
                com.android.internal.R.styleable.GridView_horizontalSpacing, 0);
        setHorizontalSpacing(hSpacing);
        int vSpacing;
        vSpacing = a.getDimensionPixelOffset(
                com.android.internal.R.styleable.GridView_verticalSpacing, 0);
        setVerticalSpacing(vSpacing);
        int index;
        index = a.getInt(com.android.internal.R.styleable.GridView_stretchMode, STRETCH_COLUMN_WIDTH);
        {
            setStretchMode(index);
        } //End block
        int columnWidth;
        columnWidth = a.getDimensionPixelOffset(com.android.internal.R.styleable.GridView_columnWidth, -1);
        {
            setColumnWidth(columnWidth);
        } //End block
        int numColumns;
        numColumns = a.getInt(com.android.internal.R.styleable.GridView_numColumns, 1);
        setNumColumns(numColumns);
        index = a.getInt(com.android.internal.R.styleable.GridView_gravity, -1);
        {
            setGravity(index);
        } //End block
        a.recycle();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.138 -0400", hash_original_method = "0E1A05724C497F45D7FB6AC34C501814", hash_generated_method = "5C34D454A51AE3C5DC17CA067E121E50")
    @Override
    public ListAdapter getAdapter() {
        ListAdapter varB4EAC82CA7396A68D541C85D26508E83_1192082791 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1192082791 = mAdapter;
        varB4EAC82CA7396A68D541C85D26508E83_1192082791.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1192082791;
        // ---------- Original Method ----------
        //return mAdapter;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.138 -0400", hash_original_method = "8AB2C6958FD7CEC3A8A71FE59763D6A4", hash_generated_method = "D18E7401555F2345B6B780E77B86E39C")
    @android.view.RemotableViewMethod
    public void setRemoteViewsAdapter(Intent intent) {
        super.setRemoteViewsAdapter(intent);
        addTaint(intent.getTaint());
        // ---------- Original Method ----------
        //super.setRemoteViewsAdapter(intent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.140 -0400", hash_original_method = "3B0F7EFF2AD6466D19A6F404E2E1BAAD", hash_generated_method = "014B452474A7529F55549F247915612A")
    @Override
    public void setAdapter(ListAdapter adapter) {
        {
            mAdapter.unregisterDataSetObserver(mDataSetObserver);
        } //End block
        resetList();
        mRecycler.clear();
        mAdapter = adapter;
        mOldSelectedPosition = INVALID_POSITION;
        mOldSelectedRowId = INVALID_ROW_ID;
        super.setAdapter(adapter);
        {
            mOldItemCount = mItemCount;
            mItemCount = mAdapter.getCount();
            mDataChanged = true;
            checkFocus();
            mDataSetObserver = new AdapterDataSetObserver();
            mAdapter.registerDataSetObserver(mDataSetObserver);
            mRecycler.setViewTypeCount(mAdapter.getViewTypeCount());
            int position;
            {
                position = lookForSelectablePosition(mItemCount - 1, false);
            } //End block
            {
                position = lookForSelectablePosition(0, true);
            } //End block
            setSelectedPositionInt(position);
            setNextSelectedPositionInt(position);
            checkSelectionChanged();
        } //End block
        {
            checkFocus();
            checkSelectionChanged();
        } //End block
        requestLayout();
        addTaint(adapter.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.141 -0400", hash_original_method = "D52FAC74E641441314EFBB7F4E58B879", hash_generated_method = "F8DC8EE48E963153338A2B6B379F37AA")
    @Override
     int lookForSelectablePosition(int position, boolean lookDown) {
        ListAdapter adapter;
        adapter = mAdapter;
        {
            boolean var35A1F64E67CC6E0C06A8BA9582F2435F_295247451 = (adapter == null || isInTouchMode());
        } //End collapsed parenthetic
        addTaint(position);
        addTaint(lookDown);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_555179389 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_555179389;
        // ---------- Original Method ----------
        //final ListAdapter adapter = mAdapter;
        //if (adapter == null || isInTouchMode()) {
            //return INVALID_POSITION;
        //}
        //if (position < 0 || position >= mItemCount) {
            //return INVALID_POSITION;
        //}
        //return position;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.162 -0400", hash_original_method = "A62E9A831AF61A8CD347891B2F9D44DF", hash_generated_method = "C4B56A17ECFC3D8798D9C6AD5ACAC0EF")
    @Override
     void fillGap(boolean down) {
        int numColumns;
        numColumns = mNumColumns;
        int verticalSpacing;
        verticalSpacing = mVerticalSpacing;
        int count;
        count = getChildCount();
        {
            int paddingTop;
            paddingTop = 0;
            {
                paddingTop = getListPaddingTop();
            } //End block
            int startOffset;
            startOffset = getChildAt(count - 1).getBottom() + verticalSpacing;
            startOffset = paddingTop;
            int position;
            position = mFirstPosition + count;
            {
                position += numColumns - 1;
            } //End block
            fillDown(position, startOffset);
            correctTooHigh(numColumns, verticalSpacing, getChildCount());
        } //End block
        {
            int paddingBottom;
            paddingBottom = 0;
            {
                paddingBottom = getListPaddingBottom();
            } //End block
            int startOffset;
            startOffset = getChildAt(0).getTop() - verticalSpacing;
            startOffset = getHeight() - paddingBottom;
            int position;
            position = mFirstPosition;
            {
                position -= numColumns;
            } //End block
            fillUp(position, startOffset);
            correctTooLow(numColumns, verticalSpacing, getChildCount());
        } //End block
        addTaint(down);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.163 -0400", hash_original_method = "6F9360E73E1EB4E0BD6CC48A029E26CB", hash_generated_method = "27DE58C39A3EE9DC1801B75C300729D1")
    private View fillDown(int pos, int nextTop) {
        View varB4EAC82CA7396A68D541C85D26508E83_1553461778 = null; //Variable for return #1
        View selectedView;
        selectedView = null;
        int end;
        end = (mBottom - mTop);
        {
            end -= mListPadding.bottom;
        } //End block
        {
            View temp;
            temp = makeRow(pos, nextTop, true);
            {
                selectedView = temp;
            } //End block
            nextTop = mReferenceView.getBottom() + mVerticalSpacing;
            pos += mNumColumns;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1553461778 = selectedView;
        addTaint(pos);
        addTaint(nextTop);
        varB4EAC82CA7396A68D541C85D26508E83_1553461778.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1553461778;
        // ---------- Original Method ----------
        //View selectedView = null;
        //int end = (mBottom - mTop);
        //if ((mGroupFlags & CLIP_TO_PADDING_MASK) == CLIP_TO_PADDING_MASK) {
            //end -= mListPadding.bottom;
        //}
        //while (nextTop < end && pos < mItemCount) {
            //View temp = makeRow(pos, nextTop, true);
            //if (temp != null) {
                //selectedView = temp;
            //}
            //nextTop = mReferenceView.getBottom() + mVerticalSpacing;
            //pos += mNumColumns;
        //}
        //return selectedView;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.177 -0400", hash_original_method = "DFB797BE7486A81865BE6BA7ABEE8F5A", hash_generated_method = "D06212760E66018BBF4EF41B2BA55DE4")
    private View makeRow(int startPos, int y, boolean flow) {
        View varB4EAC82CA7396A68D541C85D26508E83_1003771068 = null; //Variable for return #1
        int columnWidth;
        columnWidth = mColumnWidth;
        int horizontalSpacing;
        horizontalSpacing = mHorizontalSpacing;
        int last;
        int nextLeft;
        nextLeft = mListPadding.left +
                ((mStretchMode == STRETCH_SPACING_UNIFORM) ? horizontalSpacing : 0);//DSFIXME:  CODE0008: Nested ternary operator in expression
        {
            last = Math.min(startPos + mNumColumns, mItemCount);
        } //End block
        {
            last = startPos + 1;
            startPos = Math.max(0, startPos - mNumColumns + 1);
            {
                nextLeft += (mNumColumns - (last - startPos)) * (columnWidth + horizontalSpacing);
            } //End block
        } //End block
        View selectedView;
        selectedView = null;
        boolean hasFocus;
        hasFocus = shouldShowSelector();
        boolean inClick;
        inClick = touchModeDrawsInPressedState();
        int selectedPosition;
        selectedPosition = mSelectedPosition;
        View child;
        child = null;
        {
            int pos;
            pos = startPos;
            {
                boolean selected;
                selected = pos == selectedPosition;
                int where;
                where = -1;
                where = pos - startPos;
                child = makeAndAddView(pos, y, flow, nextLeft, selected, where);
                nextLeft += columnWidth;
                {
                    nextLeft += horizontalSpacing;
                } //End block
                {
                    selectedView = child;
                } //End block
            } //End block
        } //End collapsed parenthetic
        mReferenceView = child;
        {
            mReferenceViewInSelectedRow = mReferenceView;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1003771068 = selectedView;
        addTaint(startPos);
        addTaint(y);
        addTaint(flow);
        varB4EAC82CA7396A68D541C85D26508E83_1003771068.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1003771068;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.193 -0400", hash_original_method = "0AADB00D4F358179B46AC864F825D76F", hash_generated_method = "3EAA18587E8450282C80D28558B8FF6C")
    private View fillUp(int pos, int nextBottom) {
        View varB4EAC82CA7396A68D541C85D26508E83_684302612 = null; //Variable for return #1
        View selectedView;
        selectedView = null;
        int end;
        end = 0;
        {
            end = mListPadding.top;
        } //End block
        {
            View temp;
            temp = makeRow(pos, nextBottom, false);
            {
                selectedView = temp;
            } //End block
            nextBottom = mReferenceView.getTop() - mVerticalSpacing;
            mFirstPosition = pos;
            pos -= mNumColumns;
        } //End block
        {
            mFirstPosition = Math.max(0, pos + 1);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_684302612 = selectedView;
        addTaint(pos);
        addTaint(nextBottom);
        varB4EAC82CA7396A68D541C85D26508E83_684302612.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_684302612;
        // ---------- Original Method ----------
        //View selectedView = null;
        //int end = 0;
        //if ((mGroupFlags & CLIP_TO_PADDING_MASK) == CLIP_TO_PADDING_MASK) {
            //end = mListPadding.top;
        //}
        //while (nextBottom > end && pos >= 0) {
            //View temp = makeRow(pos, nextBottom, false);
            //if (temp != null) {
                //selectedView = temp;
            //}
            //nextBottom = mReferenceView.getTop() - mVerticalSpacing;
            //mFirstPosition = pos;
            //pos -= mNumColumns;
        //}
        //if (mStackFromBottom) {
            //mFirstPosition = Math.max(0, pos + 1);
        //}
        //return selectedView;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.194 -0400", hash_original_method = "ECD7EEB642891ACE11FADF160200B8D1", hash_generated_method = "70D19CD6C3F06449C6278C32E45682C6")
    private View fillFromTop(int nextTop) {
        View varB4EAC82CA7396A68D541C85D26508E83_1921565467 = null; //Variable for return #1
        mFirstPosition = Math.min(mFirstPosition, mSelectedPosition);
        mFirstPosition = Math.min(mFirstPosition, mItemCount - 1);
        {
            mFirstPosition = 0;
        } //End block
        mFirstPosition -= mFirstPosition % mNumColumns;
        varB4EAC82CA7396A68D541C85D26508E83_1921565467 = fillDown(mFirstPosition, nextTop);
        addTaint(nextTop);
        varB4EAC82CA7396A68D541C85D26508E83_1921565467.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1921565467;
        // ---------- Original Method ----------
        //mFirstPosition = Math.min(mFirstPosition, mSelectedPosition);
        //mFirstPosition = Math.min(mFirstPosition, mItemCount - 1);
        //if (mFirstPosition < 0) {
            //mFirstPosition = 0;
        //}
        //mFirstPosition -= mFirstPosition % mNumColumns;
        //return fillDown(mFirstPosition, nextTop);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.202 -0400", hash_original_method = "0818B9EEFC7CF79A0018AB61F39070C0", hash_generated_method = "ABF359C5776D9EF612868DDFFDBB9DE3")
    private View fillFromBottom(int lastPosition, int nextBottom) {
        View varB4EAC82CA7396A68D541C85D26508E83_689263055 = null; //Variable for return #1
        lastPosition = Math.max(lastPosition, mSelectedPosition);
        lastPosition = Math.min(lastPosition, mItemCount - 1);
        int invertedPosition;
        invertedPosition = mItemCount - 1 - lastPosition;
        lastPosition = mItemCount - 1 - (invertedPosition - (invertedPosition % mNumColumns));
        varB4EAC82CA7396A68D541C85D26508E83_689263055 = fillUp(lastPosition, nextBottom);
        addTaint(lastPosition);
        addTaint(nextBottom);
        varB4EAC82CA7396A68D541C85D26508E83_689263055.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_689263055;
        // ---------- Original Method ----------
        //lastPosition = Math.max(lastPosition, mSelectedPosition);
        //lastPosition = Math.min(lastPosition, mItemCount - 1);
        //final int invertedPosition = mItemCount - 1 - lastPosition;
        //lastPosition = mItemCount - 1 - (invertedPosition - (invertedPosition % mNumColumns));
        //return fillUp(lastPosition, nextBottom);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.204 -0400", hash_original_method = "B869E7B5DD0E41AF8A9344426795B32C", hash_generated_method = "F8985A58CE5773644AF71CF4D701BC4A")
    private View fillSelection(int childrenTop, int childrenBottom) {
        View varB4EAC82CA7396A68D541C85D26508E83_1145867990 = null; //Variable for return #1
        int selectedPosition;
        selectedPosition = reconcileSelectedPosition();
        int numColumns;
        numColumns = mNumColumns;
        int verticalSpacing;
        verticalSpacing = mVerticalSpacing;
        int rowStart;
        int rowEnd;
        rowEnd = -1;
        {
            rowStart = selectedPosition - (selectedPosition % numColumns);
        } //End block
        {
            int invertedSelection;
            invertedSelection = mItemCount - 1 - selectedPosition;
            rowEnd = mItemCount - 1 - (invertedSelection - (invertedSelection % numColumns));
            rowStart = Math.max(0, rowEnd - numColumns + 1);
        } //End block
        int fadingEdgeLength;
        fadingEdgeLength = getVerticalFadingEdgeLength();
        int topSelectionPixel;
        topSelectionPixel = getTopSelectionPixel(childrenTop, fadingEdgeLength, rowStart);
        View sel;
        sel = makeRow(mStackFromBottom ? rowEnd : rowStart, topSelectionPixel, true);//DSFIXME:  CODE0008: Nested ternary operator in expression
        mFirstPosition = rowStart;
        View referenceView;
        referenceView = mReferenceView;
        {
            fillDown(rowStart + numColumns, referenceView.getBottom() + verticalSpacing);
            pinToBottom(childrenBottom);
            fillUp(rowStart - numColumns, referenceView.getTop() - verticalSpacing);
            adjustViewsUpOrDown();
        } //End block
        {
            int bottomSelectionPixel;
            bottomSelectionPixel = getBottomSelectionPixel(childrenBottom,
                    fadingEdgeLength, numColumns, rowStart);
            int offset;
            offset = bottomSelectionPixel - referenceView.getBottom();
            offsetChildrenTopAndBottom(offset);
            fillUp(rowStart - 1, referenceView.getTop() - verticalSpacing);
            pinToTop(childrenTop);
            fillDown(rowEnd + numColumns, referenceView.getBottom() + verticalSpacing);
            adjustViewsUpOrDown();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1145867990 = sel;
        addTaint(childrenTop);
        addTaint(childrenBottom);
        varB4EAC82CA7396A68D541C85D26508E83_1145867990.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1145867990;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.204 -0400", hash_original_method = "535BA4E594C209A488B214DB13AE774F", hash_generated_method = "0B43BAF4A9D9AA7EAE57F1AF59884719")
    private void pinToTop(int childrenTop) {
        {
            int top;
            top = getChildAt(0).getTop();
            int offset;
            offset = childrenTop - top;
            {
                offsetChildrenTopAndBottom(offset);
            } //End block
        } //End block
        addTaint(childrenTop);
        // ---------- Original Method ----------
        //if (mFirstPosition == 0) {
            //final int top = getChildAt(0).getTop();
            //final int offset = childrenTop - top;
            //if (offset < 0) {
                //offsetChildrenTopAndBottom(offset);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.212 -0400", hash_original_method = "554B5C3A9DEE69BDD0B0F70052D29046", hash_generated_method = "8B45EA1590854BC0D812192E1992F0E7")
    private void pinToBottom(int childrenBottom) {
        int count;
        count = getChildCount();
        {
            int bottom;
            bottom = getChildAt(count - 1).getBottom();
            int offset;
            offset = childrenBottom - bottom;
            {
                offsetChildrenTopAndBottom(offset);
            } //End block
        } //End block
        addTaint(childrenBottom);
        // ---------- Original Method ----------
        //final int count = getChildCount();
        //if (mFirstPosition + count == mItemCount) {
            //final int bottom = getChildAt(count - 1).getBottom();
            //final int offset = childrenBottom - bottom;
            //if (offset > 0) {
                //offsetChildrenTopAndBottom(offset);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.215 -0400", hash_original_method = "584D06EE6653E11D28AE97D7ADF4C3E4", hash_generated_method = "AE13545E973415C333F0C261DA6A4E43")
    @Override
     int findMotionRow(int y) {
        int childCount;
        childCount = getChildCount();
        {
            int numColumns;
            numColumns = mNumColumns;
            {
                {
                    int i;
                    i = 0;
                    i += numColumns;
                    {
                        {
                            boolean varC0173D202327EB6C7A35540C10A8AA25_639356355 = (y <= getChildAt(i).getBottom());
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                {
                    int i;
                    i = childCount - 1;
                    i -= numColumns;
                    {
                        {
                            boolean var0C308B788546DD5F7421232B1F43CEB9_1337062374 = (y >= getChildAt(i).getTop());
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End block
        addTaint(y);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_563439650 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_563439650;
        // ---------- Original Method ----------
        //final int childCount = getChildCount();
        //if (childCount > 0) {
            //final int numColumns = mNumColumns;
            //if (!mStackFromBottom) {
                //for (int i = 0; i < childCount; i += numColumns) {
                    //if (y <= getChildAt(i).getBottom()) {
                        //return mFirstPosition + i;
                    //}
                //}
            //} else {
                //for (int i = childCount - 1; i >= 0; i -= numColumns) {
                    //if (y >= getChildAt(i).getTop()) {
                        //return mFirstPosition + i;
                    //}
                //}
            //}
        //}
        //return INVALID_POSITION;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.228 -0400", hash_original_method = "2BE5C63CD6BB6072D8C1046433555060", hash_generated_method = "99B1875B9165E1A7038A1796B1284364")
    private View fillSpecific(int position, int top) {
        View varB4EAC82CA7396A68D541C85D26508E83_536539834 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_261556616 = null; //Variable for return #2
        View varB4EAC82CA7396A68D541C85D26508E83_699867183 = null; //Variable for return #3
        View varB4EAC82CA7396A68D541C85D26508E83_1668245764 = null; //Variable for return #4
        int numColumns;
        numColumns = mNumColumns;
        int motionRowStart;
        int motionRowEnd;
        motionRowEnd = -1;
        {
            motionRowStart = position - (position % numColumns);
        } //End block
        {
            int invertedSelection;
            invertedSelection = mItemCount - 1 - position;
            motionRowEnd = mItemCount - 1 - (invertedSelection - (invertedSelection % numColumns));
            motionRowStart = Math.max(0, motionRowEnd - numColumns + 1);
        } //End block
        View temp;
        temp = makeRow(mStackFromBottom ? motionRowEnd : motionRowStart, top, true);//DSFIXME:  CODE0008: Nested ternary operator in expression
        mFirstPosition = motionRowStart;
        View referenceView;
        referenceView = mReferenceView;
        {
            varB4EAC82CA7396A68D541C85D26508E83_536539834 = null;
        } //End block
        int verticalSpacing;
        verticalSpacing = mVerticalSpacing;
        View above;
        View below;
        {
            above = fillUp(motionRowStart - numColumns, referenceView.getTop() - verticalSpacing);
            adjustViewsUpOrDown();
            below = fillDown(motionRowStart + numColumns, referenceView.getBottom() + verticalSpacing);
            int childCount;
            childCount = getChildCount();
            {
                correctTooHigh(numColumns, verticalSpacing, childCount);
            } //End block
        } //End block
        {
            below = fillDown(motionRowEnd + numColumns, referenceView.getBottom() + verticalSpacing);
            adjustViewsUpOrDown();
            above = fillUp(motionRowStart - 1, referenceView.getTop() - verticalSpacing);
            int childCount;
            childCount = getChildCount();
            {
                correctTooLow(numColumns, verticalSpacing, childCount);
            } //End block
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_261556616 = temp;
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_699867183 = above;
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1668245764 = below;
        } //End block
        addTaint(position);
        addTaint(top);
        View varA7E53CE21691AB073D9660D615818899_1795255983; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1795255983 = varB4EAC82CA7396A68D541C85D26508E83_536539834;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1795255983 = varB4EAC82CA7396A68D541C85D26508E83_261556616;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1795255983 = varB4EAC82CA7396A68D541C85D26508E83_699867183;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1795255983 = varB4EAC82CA7396A68D541C85D26508E83_1668245764;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1795255983.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1795255983;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.229 -0400", hash_original_method = "61C0C7B3D4F01380F7804BB62430F50F", hash_generated_method = "57E56A62D5184DB34EE9CC8ACCE6CD32")
    private void correctTooHigh(int numColumns, int verticalSpacing, int childCount) {
        int lastPosition;
        lastPosition = mFirstPosition + childCount - 1;
        {
            View lastChild;
            lastChild = getChildAt(childCount - 1);
            int lastBottom;
            lastBottom = lastChild.getBottom();
            int end;
            end = (mBottom - mTop) - mListPadding.bottom;
            int bottomOffset;
            bottomOffset = end - lastBottom;
            View firstChild;
            firstChild = getChildAt(0);
            int firstTop;
            firstTop = firstChild.getTop();
            {
                {
                    bottomOffset = Math.min(bottomOffset, mListPadding.top - firstTop);
                } //End block
                offsetChildrenTopAndBottom(bottomOffset);
                {
                    fillUp(mFirstPosition - (mStackFromBottom ? 1 : numColumns),
                            firstChild.getTop() - verticalSpacing);
                    adjustViewsUpOrDown();
                } //End block
            } //End block
        } //End block
        addTaint(numColumns);
        addTaint(verticalSpacing);
        addTaint(childCount);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.230 -0400", hash_original_method = "C582B4D472853F3118C6A87E3BA2D3CE", hash_generated_method = "9C030B6C22F93FF41267740367EEA1CE")
    private void correctTooLow(int numColumns, int verticalSpacing, int childCount) {
        {
            View firstChild;
            firstChild = getChildAt(0);
            int firstTop;
            firstTop = firstChild.getTop();
            int start;
            start = mListPadding.top;
            int end;
            end = (mBottom - mTop) - mListPadding.bottom;
            int topOffset;
            topOffset = firstTop - start;
            View lastChild;
            lastChild = getChildAt(childCount - 1);
            int lastBottom;
            lastBottom = lastChild.getBottom();
            int lastPosition;
            lastPosition = mFirstPosition + childCount - 1;
            {
                {
                    topOffset = Math.min(topOffset, lastBottom - end);
                } //End block
                offsetChildrenTopAndBottom(-topOffset);
                {
                    fillDown(lastPosition + (!mStackFromBottom ? 1 : numColumns),
                            lastChild.getBottom() + verticalSpacing);
                    adjustViewsUpOrDown();
                } //End block
            } //End block
        } //End block
        addTaint(numColumns);
        addTaint(verticalSpacing);
        addTaint(childCount);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.231 -0400", hash_original_method = "AC707126EF44BD77373D761D306CE415", hash_generated_method = "302B2140064493F8F45A549002B5ED1B")
    private View fillFromSelection(int selectedTop, int childrenTop, int childrenBottom) {
        View varB4EAC82CA7396A68D541C85D26508E83_1976076231 = null; //Variable for return #1
        int fadingEdgeLength;
        fadingEdgeLength = getVerticalFadingEdgeLength();
        int selectedPosition;
        selectedPosition = mSelectedPosition;
        int numColumns;
        numColumns = mNumColumns;
        int verticalSpacing;
        verticalSpacing = mVerticalSpacing;
        int rowStart;
        int rowEnd;
        rowEnd = -1;
        {
            rowStart = selectedPosition - (selectedPosition % numColumns);
        } //End block
        {
            int invertedSelection;
            invertedSelection = mItemCount - 1 - selectedPosition;
            rowEnd = mItemCount - 1 - (invertedSelection - (invertedSelection % numColumns));
            rowStart = Math.max(0, rowEnd - numColumns + 1);
        } //End block
        View sel;
        View referenceView;
        int topSelectionPixel;
        topSelectionPixel = getTopSelectionPixel(childrenTop, fadingEdgeLength, rowStart);
        int bottomSelectionPixel;
        bottomSelectionPixel = getBottomSelectionPixel(childrenBottom, fadingEdgeLength,
                numColumns, rowStart);
        sel = makeRow(mStackFromBottom ? rowEnd : rowStart, selectedTop, true);
        mFirstPosition = rowStart;
        referenceView = mReferenceView;
        adjustForTopFadingEdge(referenceView, topSelectionPixel, bottomSelectionPixel);
        adjustForBottomFadingEdge(referenceView, topSelectionPixel, bottomSelectionPixel);
        {
            fillUp(rowStart - numColumns, referenceView.getTop() - verticalSpacing);
            adjustViewsUpOrDown();
            fillDown(rowStart + numColumns, referenceView.getBottom() + verticalSpacing);
        } //End block
        {
            fillDown(rowEnd + numColumns, referenceView.getBottom() + verticalSpacing);
            adjustViewsUpOrDown();
            fillUp(rowStart - 1, referenceView.getTop() - verticalSpacing);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1976076231 = sel;
        addTaint(selectedTop);
        addTaint(childrenTop);
        addTaint(childrenBottom);
        varB4EAC82CA7396A68D541C85D26508E83_1976076231.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1976076231;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.258 -0400", hash_original_method = "3B93521E4F8B514C6E0E966E64E45808", hash_generated_method = "A9ED9485AF6F407C5A8EFA66A444A3AD")
    private int getBottomSelectionPixel(int childrenBottom, int fadingEdgeLength,
            int numColumns, int rowStart) {
        int bottomSelectionPixel;
        bottomSelectionPixel = childrenBottom;
        {
            bottomSelectionPixel -= fadingEdgeLength;
        } //End block
        addTaint(childrenBottom);
        addTaint(fadingEdgeLength);
        addTaint(numColumns);
        addTaint(rowStart);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2020725668 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2020725668;
        // ---------- Original Method ----------
        //int bottomSelectionPixel = childrenBottom;
        //if (rowStart + numColumns - 1 < mItemCount - 1) {
            //bottomSelectionPixel -= fadingEdgeLength;
        //}
        //return bottomSelectionPixel;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.259 -0400", hash_original_method = "D0A32123B024D3BD3B829FD608C467F8", hash_generated_method = "72854DEC059D7424F6190EA7D4B11773")
    private int getTopSelectionPixel(int childrenTop, int fadingEdgeLength, int rowStart) {
        int topSelectionPixel;
        topSelectionPixel = childrenTop;
        {
            topSelectionPixel += fadingEdgeLength;
        } //End block
        addTaint(childrenTop);
        addTaint(fadingEdgeLength);
        addTaint(rowStart);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2115856919 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2115856919;
        // ---------- Original Method ----------
        //int topSelectionPixel = childrenTop;
        //if (rowStart > 0) {
            //topSelectionPixel += fadingEdgeLength;
        //}
        //return topSelectionPixel;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.260 -0400", hash_original_method = "683433A1D2226A93C6C052E4367B337E", hash_generated_method = "6F7DF808E1DC3164FC89722BB5BB7B9C")
    private void adjustForBottomFadingEdge(View childInSelectedRow,
            int topSelectionPixel, int bottomSelectionPixel) {
        {
            boolean var2726325E9F58F141269CF4C5709BEFD8_1660214723 = (childInSelectedRow.getBottom() > bottomSelectionPixel);
            {
                int spaceAbove;
                spaceAbove = childInSelectedRow.getTop() - topSelectionPixel;
                int spaceBelow;
                spaceBelow = childInSelectedRow.getBottom() - bottomSelectionPixel;
                int offset;
                offset = Math.min(spaceAbove, spaceBelow);
                offsetChildrenTopAndBottom(-offset);
            } //End block
        } //End collapsed parenthetic
        addTaint(childInSelectedRow.getTaint());
        addTaint(topSelectionPixel);
        addTaint(bottomSelectionPixel);
        // ---------- Original Method ----------
        //if (childInSelectedRow.getBottom() > bottomSelectionPixel) {
            //int spaceAbove = childInSelectedRow.getTop() - topSelectionPixel;
            //int spaceBelow = childInSelectedRow.getBottom() - bottomSelectionPixel;
            //int offset = Math.min(spaceAbove, spaceBelow);
            //offsetChildrenTopAndBottom(-offset);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.261 -0400", hash_original_method = "E9E54F71CD8326C8AF2C780315CD689D", hash_generated_method = "9AFC12D31F07C90B03FA07B6C5E9B9B9")
    private void adjustForTopFadingEdge(View childInSelectedRow,
            int topSelectionPixel, int bottomSelectionPixel) {
        {
            boolean varA6AD2992672F69243A86BE094F867981_2068425279 = (childInSelectedRow.getTop() < topSelectionPixel);
            {
                int spaceAbove;
                spaceAbove = topSelectionPixel - childInSelectedRow.getTop();
                int spaceBelow;
                spaceBelow = bottomSelectionPixel - childInSelectedRow.getBottom();
                int offset;
                offset = Math.min(spaceAbove, spaceBelow);
                offsetChildrenTopAndBottom(offset);
            } //End block
        } //End collapsed parenthetic
        addTaint(childInSelectedRow.getTaint());
        addTaint(topSelectionPixel);
        addTaint(bottomSelectionPixel);
        // ---------- Original Method ----------
        //if (childInSelectedRow.getTop() < topSelectionPixel) {
            //int spaceAbove = topSelectionPixel - childInSelectedRow.getTop();
            //int spaceBelow = bottomSelectionPixel - childInSelectedRow.getBottom();
            //int offset = Math.min(spaceAbove, spaceBelow);
            //offsetChildrenTopAndBottom(offset);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.261 -0400", hash_original_method = "19B54E9E42F50C19B80602093C26BC32", hash_generated_method = "7A5836635E40602F9283C444E4C38BE2")
    @android.view.RemotableViewMethod
    public void smoothScrollToPosition(int position) {
        super.smoothScrollToPosition(position);
        addTaint(position);
        // ---------- Original Method ----------
        //super.smoothScrollToPosition(position);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.261 -0400", hash_original_method = "9A2E566018459C8A4F9FE2F49DBB98B8", hash_generated_method = "DF8A45AA7313754A97BDE7860400CCDD")
    @android.view.RemotableViewMethod
    public void smoothScrollByOffset(int offset) {
        super.smoothScrollByOffset(offset);
        addTaint(offset);
        // ---------- Original Method ----------
        //super.smoothScrollByOffset(offset);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.281 -0400", hash_original_method = "55F676D436FF1EC67ECC1C028E81ED27", hash_generated_method = "8A568EC7A9D76EA0766EA04EA9308B78")
    private View moveSelection(int delta, int childrenTop, int childrenBottom) {
        View varB4EAC82CA7396A68D541C85D26508E83_139492921 = null; //Variable for return #1
        int fadingEdgeLength;
        fadingEdgeLength = getVerticalFadingEdgeLength();
        int selectedPosition;
        selectedPosition = mSelectedPosition;
        int numColumns;
        numColumns = mNumColumns;
        int verticalSpacing;
        verticalSpacing = mVerticalSpacing;
        int oldRowStart;
        int rowStart;
        int rowEnd;
        rowEnd = -1;
        {
            oldRowStart = (selectedPosition - delta) - ((selectedPosition - delta) % numColumns);
            rowStart = selectedPosition - (selectedPosition % numColumns);
        } //End block
        {
            int invertedSelection;
            invertedSelection = mItemCount - 1 - selectedPosition;
            rowEnd = mItemCount - 1 - (invertedSelection - (invertedSelection % numColumns));
            rowStart = Math.max(0, rowEnd - numColumns + 1);
            invertedSelection = mItemCount - 1 - (selectedPosition - delta);
            oldRowStart = mItemCount - 1 - (invertedSelection - (invertedSelection % numColumns));
            oldRowStart = Math.max(0, oldRowStart - numColumns + 1);
        } //End block
        int rowDelta;
        rowDelta = rowStart - oldRowStart;
        int topSelectionPixel;
        topSelectionPixel = getTopSelectionPixel(childrenTop, fadingEdgeLength, rowStart);
        int bottomSelectionPixel;
        bottomSelectionPixel = getBottomSelectionPixel(childrenBottom, fadingEdgeLength,
                numColumns, rowStart);
        mFirstPosition = rowStart;
        View sel;
        View referenceView;
        {
            int oldBottom;
            oldBottom = 0;
            oldBottom = mReferenceViewInSelectedRow.getBottom();
            sel = makeRow(mStackFromBottom ? rowEnd : rowStart, oldBottom + verticalSpacing, true);
            referenceView = mReferenceView;
            adjustForBottomFadingEdge(referenceView, topSelectionPixel, bottomSelectionPixel);
        } //End block
        {
            int oldTop;
            oldTop = 0;
            oldTop = mReferenceViewInSelectedRow .getTop();
            sel = makeRow(mStackFromBottom ? rowEnd : rowStart, oldTop - verticalSpacing, false);
            referenceView = mReferenceView;
            adjustForTopFadingEdge(referenceView, topSelectionPixel, bottomSelectionPixel);
        } //End block
        {
            int oldTop;
            oldTop = 0;
            oldTop = mReferenceViewInSelectedRow .getTop();
            sel = makeRow(mStackFromBottom ? rowEnd : rowStart, oldTop, true);
            referenceView = mReferenceView;
        } //End block
        {
            fillUp(rowStart - numColumns, referenceView.getTop() - verticalSpacing);
            adjustViewsUpOrDown();
            fillDown(rowStart + numColumns, referenceView.getBottom() + verticalSpacing);
        } //End block
        {
            fillDown(rowEnd + numColumns, referenceView.getBottom() + verticalSpacing);
            adjustViewsUpOrDown();
            fillUp(rowStart - 1, referenceView.getTop() - verticalSpacing);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_139492921 = sel;
        addTaint(delta);
        addTaint(childrenTop);
        addTaint(childrenBottom);
        varB4EAC82CA7396A68D541C85D26508E83_139492921.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_139492921;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.299 -0400", hash_original_method = "971C7C8872B1F8EEBA5FB107FC6F8364", hash_generated_method = "93F6205E9F94EC8FB21533B17049E324")
    private boolean determineColumns(int availableSpace) {
        int requestedHorizontalSpacing;
        requestedHorizontalSpacing = mRequestedHorizontalSpacing;
        int stretchMode;
        stretchMode = mStretchMode;
        int requestedColumnWidth;
        requestedColumnWidth = mRequestedColumnWidth;
        boolean didNotInitiallyFit;
        didNotInitiallyFit = false;
        {
            {
                mNumColumns = (availableSpace + requestedHorizontalSpacing) /
                        (requestedColumnWidth + requestedHorizontalSpacing);
            } //End block
            {
                mNumColumns = 2;
            } //End block
        } //End block
        {
            mNumColumns = mRequestedNumColumns;
        } //End block
        {
            mNumColumns = 1;
        } //End block
        //Begin case NO_STRETCH 
        mColumnWidth = requestedColumnWidth;
        //End case NO_STRETCH 
        //Begin case NO_STRETCH 
        mHorizontalSpacing = requestedHorizontalSpacing;
        //End case NO_STRETCH 
        //Begin case default 
        int spaceLeftOver;
        spaceLeftOver = availableSpace - (mNumColumns * requestedColumnWidth) -
                    ((mNumColumns - 1) * requestedHorizontalSpacing);
        //End case default 
        //Begin case default 
        {
            didNotInitiallyFit = true;
        } //End block
        //End case default 
        //Begin case default 
        //Begin case STRETCH_COLUMN_WIDTH 
        mColumnWidth = requestedColumnWidth + spaceLeftOver / mNumColumns;
        //End case STRETCH_COLUMN_WIDTH 
        //Begin case STRETCH_COLUMN_WIDTH 
        mHorizontalSpacing = requestedHorizontalSpacing;
        //End case STRETCH_COLUMN_WIDTH 
        //Begin case STRETCH_SPACING 
        mColumnWidth = requestedColumnWidth;
        //End case STRETCH_SPACING 
        //Begin case STRETCH_SPACING 
        {
            mHorizontalSpacing = requestedHorizontalSpacing + 
                        spaceLeftOver / (mNumColumns - 1);
        } //End block
        {
            mHorizontalSpacing = requestedHorizontalSpacing + spaceLeftOver;
        } //End block
        //End case STRETCH_SPACING 
        //Begin case STRETCH_SPACING_UNIFORM 
        mColumnWidth = requestedColumnWidth;
        //End case STRETCH_SPACING_UNIFORM 
        //Begin case STRETCH_SPACING_UNIFORM 
        {
            mHorizontalSpacing = requestedHorizontalSpacing + 
                        spaceLeftOver / (mNumColumns + 1);
        } //End block
        {
            mHorizontalSpacing = requestedHorizontalSpacing + spaceLeftOver;
        } //End block
        //End case STRETCH_SPACING_UNIFORM 
        //End case default 
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_163396372 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_163396372;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.308 -0400", hash_original_method = "DE2B2122B3B8477B4CE53B0961FAB462", hash_generated_method = "86FA6F5BEB4E7641C992C4A3D585F4A2")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode;
        widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode;
        heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int widthSize;
        widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize;
        heightSize = MeasureSpec.getSize(heightMeasureSpec);
        {
            {
                widthSize = mColumnWidth + mListPadding.left + mListPadding.right;
            } //End block
            {
                widthSize = mListPadding.left + mListPadding.right;
            } //End block
            widthSize += getVerticalScrollbarWidth();
        } //End block
        int childWidth;
        childWidth = widthSize - mListPadding.left - mListPadding.right;
        boolean didNotInitiallyFit;
        didNotInitiallyFit = determineColumns(childWidth);
        int childHeight;
        childHeight = 0;
        int childState;
        childState = 0;
        mItemCount = mAdapter == null ? 0 : mAdapter.getCount();
        int count;
        count = mItemCount;
        {
            View child;
            child = obtainView(0, mIsScrap);
            AbsListView.LayoutParams p;
            p = (AbsListView.LayoutParams)child.getLayoutParams();
            {
                p = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT, 0);
                child.setLayoutParams(p);
            } //End block
            p.viewType = mAdapter.getItemViewType(0);
            p.forceAdd = true;
            int childHeightSpec;
            childHeightSpec = getChildMeasureSpec(
                    MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED), 0, p.height);
            int childWidthSpec;
            childWidthSpec = getChildMeasureSpec(
                    MeasureSpec.makeMeasureSpec(mColumnWidth, MeasureSpec.EXACTLY), 0, p.width);
            child.measure(childWidthSpec, childHeightSpec);
            childHeight = child.getMeasuredHeight();
            childState = combineMeasuredStates(childState, child.getMeasuredState());
            {
                boolean varE2DAD11F47B1E984D553A4A012EB052E_155949673 = (mRecycler.shouldRecycleViewType(p.viewType));
                {
                    mRecycler.addScrapView(child, -1);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            heightSize = mListPadding.top + mListPadding.bottom + childHeight +
                    getVerticalFadingEdgeLength() * 2;
        } //End block
        {
            int ourSize;
            ourSize = mListPadding.top + mListPadding.bottom;
            int numColumns;
            numColumns = mNumColumns;
            {
                int i;
                i = 0;
                i += numColumns;
                {
                    ourSize += childHeight;
                    {
                        ourSize += mVerticalSpacing;
                    } //End block
                    {
                        ourSize = heightSize;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            heightSize = ourSize;
        } //End block
        {
            int ourSize;
            ourSize = (mRequestedNumColumns*mColumnWidth)
                    + ((mRequestedNumColumns-1)*mHorizontalSpacing)
                    + mListPadding.left + mListPadding.right;
            {
                widthSize |= MEASURED_STATE_TOO_SMALL;
            } //End block
        } //End block
        setMeasuredDimension(widthSize, heightSize);
        mWidthMeasureSpec = widthMeasureSpec;
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.310 -0400", hash_original_method = "B083102DF451B0F743637B4C2ECFBD00", hash_generated_method = "FC78F3EF52E66C36A50C1B26364656F3")
    @Override
    protected void attachLayoutAnimationParameters(View child,
            ViewGroup.LayoutParams params, int index, int count) {
        GridLayoutAnimationController.AnimationParameters animationParams;
        animationParams = (GridLayoutAnimationController.AnimationParameters) params.layoutAnimationParameters;
        {
            animationParams = new GridLayoutAnimationController.AnimationParameters();
            params.layoutAnimationParameters = animationParams;
        } //End block
        animationParams.count = count;
        animationParams.index = index;
        animationParams.columnsCount = mNumColumns;
        animationParams.rowsCount = count / mNumColumns;
        {
            animationParams.column = index % mNumColumns;
            animationParams.row = index / mNumColumns;
        } //End block
        {
            int invertedIndex;
            invertedIndex = count - 1 - index;
            animationParams.column = mNumColumns - 1 - (invertedIndex % mNumColumns);
            animationParams.row = animationParams.rowsCount - 1 - invertedIndex / mNumColumns;
        } //End block
        addTaint(child.getTaint());
        addTaint(params.getTaint());
        addTaint(index);
        addTaint(count);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.342 -0400", hash_original_method = "22970971C8FD1FE9524617A911939C41", hash_generated_method = "4D763A2F7F05DEDD50AF13E353065290")
    @Override
    protected void layoutChildren() {
        boolean blockLayoutRequests;
        blockLayoutRequests = mBlockLayoutRequests;
        {
            mBlockLayoutRequests = true;
        } //End block
        try 
        {
            super.layoutChildren();
            invalidate();
            {
                resetList();
                invokeOnItemScrollListener();
            } //End block
            int childrenTop;
            childrenTop = mListPadding.top;
            int childrenBottom;
            childrenBottom = mBottom - mTop - mListPadding.bottom;
            int childCount;
            childCount = getChildCount();
            int index;
            int delta;
            delta = 0;
            View sel;
            View oldSel;
            oldSel = null;
            View oldFirst;
            oldFirst = null;
            View newSel;
            newSel = null;
            //Begin case LAYOUT_SET_SELECTION 
            index = mNextSelectedPosition - mFirstPosition;
            //End case LAYOUT_SET_SELECTION 
            //Begin case LAYOUT_SET_SELECTION 
            {
                newSel = getChildAt(index);
            } //End block
            //End case LAYOUT_SET_SELECTION 
            //Begin case LAYOUT_MOVE_SELECTION 
            {
                delta = mNextSelectedPosition - mSelectedPosition;
            } //End block
            //End case LAYOUT_MOVE_SELECTION 
            //Begin case default 
            index = mSelectedPosition - mFirstPosition;
            //End case default 
            //Begin case default 
            {
                oldSel = getChildAt(index);
            } //End block
            //End case default 
            //Begin case default 
            oldFirst = getChildAt(0);
            //End case default 
            boolean dataChanged;
            dataChanged = mDataChanged;
            {
                handleDataChanged();
            } //End block
            {
                resetList();
                invokeOnItemScrollListener();
            } //End block
            setSelectedPositionInt(mNextSelectedPosition);
            int firstPosition;
            firstPosition = mFirstPosition;
            RecycleBin recycleBin;
            recycleBin = mRecycler;
            {
                {
                    int i;
                    i = 0;
                    {
                        recycleBin.addScrapView(getChildAt(i), firstPosition+i);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                recycleBin.fillActiveViews(childCount, firstPosition);
            } //End block
            detachAllViewsFromParent();
            //Begin case LAYOUT_SET_SELECTION 
            {
                sel = fillFromSelection(newSel.getTop(), childrenTop, childrenBottom);
            } //End block
            {
                sel = fillSelection(childrenTop, childrenBottom);
            } //End block
            //End case LAYOUT_SET_SELECTION 
            //Begin case LAYOUT_FORCE_TOP 
            mFirstPosition = 0;
            //End case LAYOUT_FORCE_TOP 
            //Begin case LAYOUT_FORCE_TOP 
            sel = fillFromTop(childrenTop);
            //End case LAYOUT_FORCE_TOP 
            //Begin case LAYOUT_FORCE_TOP 
            adjustViewsUpOrDown();
            //End case LAYOUT_FORCE_TOP 
            //Begin case LAYOUT_FORCE_BOTTOM 
            sel = fillUp(mItemCount - 1, childrenBottom);
            //End case LAYOUT_FORCE_BOTTOM 
            //Begin case LAYOUT_FORCE_BOTTOM 
            adjustViewsUpOrDown();
            //End case LAYOUT_FORCE_BOTTOM 
            //Begin case LAYOUT_SPECIFIC 
            sel = fillSpecific(mSelectedPosition, mSpecificTop);
            //End case LAYOUT_SPECIFIC 
            //Begin case LAYOUT_SYNC 
            sel = fillSpecific(mSyncPosition, mSpecificTop);
            //End case LAYOUT_SYNC 
            //Begin case LAYOUT_MOVE_SELECTION 
            sel = moveSelection(delta, childrenTop, childrenBottom);
            //End case LAYOUT_MOVE_SELECTION 
            //Begin case default 
            {
                {
                    setSelectedPositionInt(mAdapter == null || isInTouchMode() ?
                                INVALID_POSITION : 0);
                    sel = fillFromTop(childrenTop);
                } //End block
                {
                    int last;
                    last = mItemCount - 1;
                    setSelectedPositionInt(mAdapter == null || isInTouchMode() ?
                                INVALID_POSITION : last);
                    sel = fillFromBottom(last, childrenBottom);
                } //End block
            } //End block
            {
                {
                    sel = fillSpecific(mSelectedPosition, oldSel == null ?
                                childrenTop : oldSel.getTop());
                } //End block
                {
                    sel = fillSpecific(mFirstPosition, oldFirst == null ?
                                childrenTop : oldFirst.getTop());
                } //End block
                {
                    sel = fillSpecific(0, childrenTop);
                } //End block
            } //End block
            //End case default 
            recycleBin.scrapActiveViews();
            {
                positionSelector(INVALID_POSITION, sel);
                mSelectedTop = sel.getTop();
            } //End block
            {
                View child;
                child = getChildAt(mMotionPosition - mFirstPosition);
                positionSelector(mMotionPosition, child);
            } //End block
            {
                mSelectedTop = 0;
                mSelectorRect.setEmpty();
            } //End block
            mLayoutMode = LAYOUT_NORMAL;
            mDataChanged = false;
            mNeedSync = false;
            setNextSelectedPositionInt(mSelectedPosition);
            updateScrollIndicators();
            {
                checkSelectionChanged();
            } //End block
            invokeOnItemScrollListener();
        } //End block
        finally 
        {
            {
                mBlockLayoutRequests = false;
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.349 -0400", hash_original_method = "D1571833DCBC36BAA4E4DA8F2A5DB363", hash_generated_method = "84E984C6A618D2A08619E8B73930F053")
    private View makeAndAddView(int position, int y, boolean flow, int childrenLeft,
            boolean selected, int where) {
        View varB4EAC82CA7396A68D541C85D26508E83_1199651565 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_2098758802 = null; //Variable for return #2
        View child;
        {
            child = mRecycler.getActiveView(position);
            {
                setupChild(child, position, y, flow, childrenLeft, selected, true, where);
                varB4EAC82CA7396A68D541C85D26508E83_1199651565 = child;
            } //End block
        } //End block
        child = obtainView(position, mIsScrap);
        setupChild(child, position, y, flow, childrenLeft, selected, mIsScrap[0], where);
        varB4EAC82CA7396A68D541C85D26508E83_2098758802 = child;
        addTaint(position);
        addTaint(y);
        addTaint(flow);
        addTaint(childrenLeft);
        addTaint(selected);
        addTaint(where);
        View varA7E53CE21691AB073D9660D615818899_1549287456; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1549287456 = varB4EAC82CA7396A68D541C85D26508E83_1199651565;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1549287456 = varB4EAC82CA7396A68D541C85D26508E83_2098758802;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1549287456.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1549287456;
        // ---------- Original Method ----------
        //View child;
        //if (!mDataChanged) {
            //child = mRecycler.getActiveView(position);
            //if (child != null) {
                //setupChild(child, position, y, flow, childrenLeft, selected, true, where);
                //return child;
            //}
        //}
        //child = obtainView(position, mIsScrap);
        //setupChild(child, position, y, flow, childrenLeft, selected, mIsScrap[0], where);
        //return child;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.364 -0400", hash_original_method = "F1D84EEF4E6902A923E61B402C707D18", hash_generated_method = "9901AF2C1112B10553ED84ACB45B2D8D")
    private void setupChild(View child, int position, int y, boolean flow, int childrenLeft,
            boolean selected, boolean recycled, int where) {
        boolean isSelected;
        isSelected = selected && shouldShowSelector();
        boolean updateChildSelected;
        updateChildSelected = isSelected != child.isSelected();
        int mode;
        mode = mTouchMode;
        boolean isPressed;
        isPressed = mode > TOUCH_MODE_DOWN && mode < TOUCH_MODE_SCROLL &&
                mMotionPosition == position;
        boolean updateChildPressed;
        updateChildPressed = isPressed != child.isPressed();
        boolean needToMeasure;
        needToMeasure = !recycled || updateChildSelected || child.isLayoutRequested();
        AbsListView.LayoutParams p;
        p = (AbsListView.LayoutParams)child.getLayoutParams();
        {
            p = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT, 0);
        } //End block
        p.viewType = mAdapter.getItemViewType(position);
        {
            attachViewToParent(child, where, p);
        } //End block
        {
            p.forceAdd = false;
            addViewInLayout(child, where, p, true);
        } //End block
        {
            child.setSelected(isSelected);
            {
                requestFocus();
            } //End block
        } //End block
        {
            child.setPressed(isPressed);
        } //End block
        {
            {
                ((Checkable) child).setChecked(mCheckStates.get(position));
            } //End block
            {
                boolean var6B8ECFCCB35D70022AE775423EF95EFF_1920371388 = (getContext().getApplicationInfo().targetSdkVersion
                    >= android.os.Build.VERSION_CODES.HONEYCOMB);
                {
                    child.setActivated(mCheckStates.get(position));
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            int childHeightSpec;
            childHeightSpec = ViewGroup.getChildMeasureSpec(
                    MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED), 0, p.height);
            int childWidthSpec;
            childWidthSpec = ViewGroup.getChildMeasureSpec(
                    MeasureSpec.makeMeasureSpec(mColumnWidth, MeasureSpec.EXACTLY), 0, p.width);
            child.measure(childWidthSpec, childHeightSpec);
        } //End block
        {
            cleanupLayoutState(child);
        } //End block
        int w;
        w = child.getMeasuredWidth();
        int h;
        h = child.getMeasuredHeight();
        int childLeft;
        int childTop;
        childTop = y;
        childTop = y - h;
        int layoutDirection;
        layoutDirection = getResolvedLayoutDirection();
        int absoluteGravity;
        absoluteGravity = Gravity.getAbsoluteGravity(mGravity, layoutDirection);
        //Begin case Gravity.LEFT 
        childLeft = childrenLeft;
        //End case Gravity.LEFT 
        //Begin case Gravity.CENTER_HORIZONTAL 
        childLeft = childrenLeft + ((mColumnWidth - w) / 2);
        //End case Gravity.CENTER_HORIZONTAL 
        //Begin case Gravity.RIGHT 
        childLeft = childrenLeft + mColumnWidth - w;
        //End case Gravity.RIGHT 
        //Begin case default 
        childLeft = childrenLeft;
        //End case default 
        {
            int childRight;
            childRight = childLeft + w;
            int childBottom;
            childBottom = childTop + h;
            child.layout(childLeft, childTop, childRight, childBottom);
        } //End block
        {
            child.offsetLeftAndRight(childLeft - child.getLeft());
            child.offsetTopAndBottom(childTop - child.getTop());
        } //End block
        {
            child.setDrawingCacheEnabled(true);
        } //End block
        {
            boolean varCA9C9DB394586E5C1281E2A995FFCD63_173571472 = (recycled && (((AbsListView.LayoutParams)child.getLayoutParams()).scrappedFromPosition)
                != position);
            {
                child.jumpDrawablesToCurrentState();
            } //End block
        } //End collapsed parenthetic
        addTaint(child.getTaint());
        addTaint(position);
        addTaint(y);
        addTaint(flow);
        addTaint(childrenLeft);
        addTaint(selected);
        addTaint(recycled);
        addTaint(where);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.370 -0400", hash_original_method = "F036989DC17B53D064E56E9048AF8088", hash_generated_method = "49947206499E0CDDD43E8D4169B5E5BE")
    @Override
    public void setSelection(int position) {
        {
            boolean var3DA6B9D2A4DFFBF2A8164819B7AFE9DF_707741472 = (!isInTouchMode());
            {
                setNextSelectedPositionInt(position);
            } //End block
            {
                mResurrectToPosition = position;
            } //End block
        } //End collapsed parenthetic
        mLayoutMode = LAYOUT_SET_SELECTION;
        requestLayout();
        addTaint(position);
        // ---------- Original Method ----------
        //if (!isInTouchMode()) {
            //setNextSelectedPositionInt(position);
        //} else {
            //mResurrectToPosition = position;
        //}
        //mLayoutMode = LAYOUT_SET_SELECTION;
        //requestLayout();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.370 -0400", hash_original_method = "BFD03D39F54176AB600127B7C1132704", hash_generated_method = "4682C06F24ACE6A825E4503FB72D8D6B")
    @Override
     void setSelectionInt(int position) {
        int previousSelectedPosition;
        previousSelectedPosition = mNextSelectedPosition;
        setNextSelectedPositionInt(position);
        layoutChildren();
        int next;
        next = mItemCount - 1  - mNextSelectedPosition;
        next = mNextSelectedPosition;
        int previous;
        previous = mItemCount - 1
                - previousSelectedPosition;
        previous = previousSelectedPosition;
        int nextRow;
        nextRow = next / mNumColumns;
        int previousRow;
        previousRow = previous / mNumColumns;
        {
            awakenScrollBars();
        } //End block
        addTaint(position);
        // ---------- Original Method ----------
        //int previousSelectedPosition = mNextSelectedPosition;
        //setNextSelectedPositionInt(position);
        //layoutChildren();
        //final int next = mStackFromBottom ? mItemCount - 1  - mNextSelectedPosition : 
            //mNextSelectedPosition;
        //final int previous = mStackFromBottom ? mItemCount - 1
                //- previousSelectedPosition : previousSelectedPosition;
        //final int nextRow = next / mNumColumns;
        //final int previousRow = previous / mNumColumns;
        //if (nextRow != previousRow) {
            //awakenScrollBars();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.372 -0400", hash_original_method = "82498D99AFEB0700B1F959E9E9927B59", hash_generated_method = "258AEB950AB5A12CB86634F534C59C47")
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var7B6BE27715D36B6032CB7DA2718D4FF1_2034482062 = (commonKey(keyCode, 1, event));
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_847780463 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_847780463;
        // ---------- Original Method ----------
        //return commonKey(keyCode, 1, event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.372 -0400", hash_original_method = "C105EC1B6481173F2A66D1C47882507B", hash_generated_method = "981FDFCEE6E611884A7C7CA6678EEF3E")
    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean varACEC8A58158104BC4BBB2FE543212B03_181476928 = (commonKey(keyCode, repeatCount, event));
        addTaint(keyCode);
        addTaint(repeatCount);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_679663807 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_679663807;
        // ---------- Original Method ----------
        //return commonKey(keyCode, repeatCount, event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.376 -0400", hash_original_method = "FFB4A1626C41573790F9B17FF23F8A09", hash_generated_method = "1D8883EB7CDF799B7F1F2A58F0AAF1AA")
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        boolean var7B6BE27715D36B6032CB7DA2718D4FF1_779318849 = (commonKey(keyCode, 1, event));
        addTaint(keyCode);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_410063050 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_410063050;
        // ---------- Original Method ----------
        //return commonKey(keyCode, 1, event);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.389 -0400", hash_original_method = "91535B300D60431313446AA401FFCFE7", hash_generated_method = "F2FA52D44E9401B5D550218BC1D7320D")
    private boolean commonKey(int keyCode, int count, KeyEvent event) {
        {
            layoutChildren();
        } //End block
        boolean handled;
        handled = false;
        int action;
        action = event.getAction();
        {
            //Begin case KeyEvent.KEYCODE_DPAD_LEFT 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_1370042051 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || arrowScroll(FOCUS_LEFT);
                } //End block
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_DPAD_LEFT 
            //Begin case KeyEvent.KEYCODE_DPAD_RIGHT 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_452362420 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || arrowScroll(FOCUS_RIGHT);
                } //End block
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_DPAD_RIGHT 
            //Begin case KeyEvent.KEYCODE_DPAD_UP 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_652666349 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || arrowScroll(FOCUS_UP);
                } //End block
                {
                    boolean varAB36CD08CFCE6244F546B808D5F456D4_648250949 = (event.hasModifiers(KeyEvent.META_ALT_ON));
                    {
                        handled = resurrectSelectionIfNeeded() || fullScroll(FOCUS_UP);
                    } //End block
                } //End collapsed parenthetic
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_DPAD_UP 
            //Begin case KeyEvent.KEYCODE_DPAD_DOWN 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_1324823453 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || arrowScroll(FOCUS_DOWN);
                } //End block
                {
                    boolean varAB36CD08CFCE6244F546B808D5F456D4_553362413 = (event.hasModifiers(KeyEvent.META_ALT_ON));
                    {
                        handled = resurrectSelectionIfNeeded() || fullScroll(FOCUS_DOWN);
                    } //End block
                } //End collapsed parenthetic
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_DPAD_DOWN 
            //Begin case KeyEvent.KEYCODE_DPAD_CENTER KeyEvent.KEYCODE_ENTER 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_2027986196 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded();
                    {
                        boolean var8C90301B2F58C5750CCB877C7F321644_316041759 = (!handled
                                && event.getRepeatCount() == 0 && getChildCount() > 0);
                        {
                            keyPressed();
                            handled = true;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_DPAD_CENTER KeyEvent.KEYCODE_ENTER 
            //Begin case KeyEvent.KEYCODE_SPACE 
            {
                boolean varC5267D5BFE7A3E261BDE80A07A8ECCFA_1310566453 = (mPopup == null || !mPopup.isShowing());
                {
                    {
                        boolean var3A3095F7575E47050F710FB26AF5006E_32029935 = (event.hasNoModifiers());
                        {
                            handled = resurrectSelectionIfNeeded() || pageScroll(FOCUS_DOWN);
                        } //End block
                        {
                            boolean varC6F58190DE4A31A0CF9704EF99A62451_645774565 = (event.hasModifiers(KeyEvent.META_SHIFT_ON));
                            {
                                handled = resurrectSelectionIfNeeded() || pageScroll(FOCUS_UP);
                            } //End block
                        } //End collapsed parenthetic
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_SPACE 
            //Begin case KeyEvent.KEYCODE_PAGE_UP 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_961979392 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || pageScroll(FOCUS_UP);
                } //End block
                {
                    boolean varAB36CD08CFCE6244F546B808D5F456D4_1172117334 = (event.hasModifiers(KeyEvent.META_ALT_ON));
                    {
                        handled = resurrectSelectionIfNeeded() || fullScroll(FOCUS_UP);
                    } //End block
                } //End collapsed parenthetic
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_PAGE_UP 
            //Begin case KeyEvent.KEYCODE_PAGE_DOWN 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_1661034673 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || pageScroll(FOCUS_DOWN);
                } //End block
                {
                    boolean varAB36CD08CFCE6244F546B808D5F456D4_521921366 = (event.hasModifiers(KeyEvent.META_ALT_ON));
                    {
                        handled = resurrectSelectionIfNeeded() || fullScroll(FOCUS_DOWN);
                    } //End block
                } //End collapsed parenthetic
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_PAGE_DOWN 
            //Begin case KeyEvent.KEYCODE_MOVE_HOME 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_1353944237 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || fullScroll(FOCUS_UP);
                } //End block
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_MOVE_HOME 
            //Begin case KeyEvent.KEYCODE_MOVE_END 
            {
                boolean var01265F35364458CD2A88FFB15C2C1B92_1176260093 = (event.hasNoModifiers());
                {
                    handled = resurrectSelectionIfNeeded() || fullScroll(FOCUS_DOWN);
                } //End block
            } //End collapsed parenthetic
            //End case KeyEvent.KEYCODE_MOVE_END 
            //Begin case KeyEvent.KEYCODE_TAB 
            {
                {
                    boolean varC77C0C11194BD87DFEE086A32DCE5C18_1752775864 = (event.hasNoModifiers());
                    {
                        handled = resurrectSelectionIfNeeded()
                                    || sequenceScroll(FOCUS_FORWARD);
                    } //End block
                    {
                        boolean var7B1040B2192949CFC257B6EE7F25C319_735967456 = (event.hasModifiers(KeyEvent.META_SHIFT_ON));
                        {
                            handled = resurrectSelectionIfNeeded()
                                    || sequenceScroll(FOCUS_BACKWARD);
                        } //End block
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End block
            //End case KeyEvent.KEYCODE_TAB 
        } //End block
        {
            boolean varF6449376E291BB335EF050093EE80110_1575692698 = (sendToTextFilter(keyCode, count, event));
        } //End collapsed parenthetic
        //Begin case KeyEvent.ACTION_DOWN 
        boolean var8C6E6C19273FC56B5C56CC7DEF63ED7B_310191630 = (super.onKeyDown(keyCode, event));
        //End case KeyEvent.ACTION_DOWN 
        //Begin case KeyEvent.ACTION_UP 
        boolean varEDD771EBF66425AD21882AB08CD0EE48_762503174 = (super.onKeyUp(keyCode, event));
        //End case KeyEvent.ACTION_UP 
        //Begin case KeyEvent.ACTION_MULTIPLE 
        boolean varC0357E39557DD275ECAF43C782C78502_1854373546 = (super.onKeyMultiple(keyCode, count, event));
        //End case KeyEvent.ACTION_MULTIPLE 
        addTaint(keyCode);
        addTaint(count);
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2078152404 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2078152404;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.390 -0400", hash_original_method = "7F69D44B4A5B870A2ADF67B34BC1B3FD", hash_generated_method = "2FC6872EE3C7D4B287FD1E1CAE406064")
     boolean pageScroll(int direction) {
        int nextPage;
        nextPage = -1;
        {
            nextPage = Math.max(0, mSelectedPosition - getChildCount());
        } //End block
        {
            nextPage = Math.min(mItemCount - 1, mSelectedPosition + getChildCount());
        } //End block
        {
            setSelectionInt(nextPage);
            invokeOnItemScrollListener();
            awakenScrollBars();
        } //End block
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_448153464 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_448153464;
        // ---------- Original Method ----------
        //int nextPage = -1;
        //if (direction == FOCUS_UP) {
            //nextPage = Math.max(0, mSelectedPosition - getChildCount());
        //} else if (direction == FOCUS_DOWN) {
            //nextPage = Math.min(mItemCount - 1, mSelectedPosition + getChildCount());
        //}
        //if (nextPage >= 0) {
            //setSelectionInt(nextPage);
            //invokeOnItemScrollListener();
            //awakenScrollBars();
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.393 -0400", hash_original_method = "8921946161DEF2C387CE09B16F70206C", hash_generated_method = "73515F89B913940BDB46D6E4D87A7606")
     boolean fullScroll(int direction) {
        boolean moved;
        moved = false;
        {
            mLayoutMode = LAYOUT_SET_SELECTION;
            setSelectionInt(0);
            invokeOnItemScrollListener();
            moved = true;
        } //End block
        {
            mLayoutMode = LAYOUT_SET_SELECTION;
            setSelectionInt(mItemCount - 1);
            invokeOnItemScrollListener();
            moved = true;
        } //End block
        {
            awakenScrollBars();
        } //End block
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2119421648 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2119421648;
        // ---------- Original Method ----------
        //boolean moved = false;
        //if (direction == FOCUS_UP) {
            //mLayoutMode = LAYOUT_SET_SELECTION;
            //setSelectionInt(0);
            //invokeOnItemScrollListener();
            //moved = true;
        //} else if (direction == FOCUS_DOWN) {
            //mLayoutMode = LAYOUT_SET_SELECTION;
            //setSelectionInt(mItemCount - 1);
            //invokeOnItemScrollListener();
            //moved = true;
        //}
        //if (moved) {
            //awakenScrollBars();
        //}
        //return moved;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.395 -0400", hash_original_method = "8CD79681F48962D4344E68AA337F0770", hash_generated_method = "00AADD2992BF03EC55290B200A2200DC")
     boolean arrowScroll(int direction) {
        int selectedPosition;
        selectedPosition = mSelectedPosition;
        int numColumns;
        numColumns = mNumColumns;
        int startOfRowPos;
        int endOfRowPos;
        boolean moved;
        moved = false;
        {
            startOfRowPos = (selectedPosition / numColumns) * numColumns;
            endOfRowPos = Math.min(startOfRowPos + numColumns - 1, mItemCount - 1);
        } //End block
        {
            int invertedSelection;
            invertedSelection = mItemCount - 1 - selectedPosition;
            endOfRowPos = mItemCount - 1 - (invertedSelection / numColumns) * numColumns;
            startOfRowPos = Math.max(0, endOfRowPos - numColumns + 1);
        } //End block
        //Begin case FOCUS_UP 
        {
            mLayoutMode = LAYOUT_MOVE_SELECTION;
            setSelectionInt(Math.max(0, selectedPosition - numColumns));
            moved = true;
        } //End block
        //End case FOCUS_UP 
        //Begin case FOCUS_DOWN 
        {
            mLayoutMode = LAYOUT_MOVE_SELECTION;
            setSelectionInt(Math.min(selectedPosition + numColumns, mItemCount - 1));
            moved = true;
        } //End block
        //End case FOCUS_DOWN 
        //Begin case FOCUS_LEFT 
        {
            mLayoutMode = LAYOUT_MOVE_SELECTION;
            setSelectionInt(Math.max(0, selectedPosition - 1));
            moved = true;
        } //End block
        //End case FOCUS_LEFT 
        //Begin case FOCUS_RIGHT 
        {
            mLayoutMode = LAYOUT_MOVE_SELECTION;
            setSelectionInt(Math.min(selectedPosition + 1, mItemCount - 1));
            moved = true;
        } //End block
        //End case FOCUS_RIGHT 
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
            invokeOnItemScrollListener();
        } //End block
        {
            awakenScrollBars();
        } //End block
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2130372773 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2130372773;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.515 -0400", hash_original_method = "3D7E63CDF154AB38FFF5F8515CF699BF", hash_generated_method = "48BB7FF918E859D36F342D41D5C4FB4D")
     boolean sequenceScroll(int direction) {
        int selectedPosition;
        selectedPosition = mSelectedPosition;
        int numColumns;
        numColumns = mNumColumns;
        int count;
        count = mItemCount;
        int startOfRow;
        int endOfRow;
        {
            startOfRow = (selectedPosition / numColumns) * numColumns;
            endOfRow = Math.min(startOfRow + numColumns - 1, count - 1);
        } //End block
        {
            int invertedSelection;
            invertedSelection = count - 1 - selectedPosition;
            endOfRow = count - 1 - (invertedSelection / numColumns) * numColumns;
            startOfRow = Math.max(0, endOfRow - numColumns + 1);
        } //End block
        boolean moved;
        moved = false;
        boolean showScroll;
        showScroll = false;
        //Begin case FOCUS_FORWARD 
        {
            mLayoutMode = LAYOUT_MOVE_SELECTION;
            setSelectionInt(selectedPosition + 1);
            moved = true;
            showScroll = selectedPosition == endOfRow;
        } //End block
        //End case FOCUS_FORWARD 
        //Begin case FOCUS_BACKWARD 
        {
            mLayoutMode = LAYOUT_MOVE_SELECTION;
            setSelectionInt(selectedPosition - 1);
            moved = true;
            showScroll = selectedPosition == startOfRow;
        } //End block
        //End case FOCUS_BACKWARD 
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(direction));
            invokeOnItemScrollListener();
        } //End block
        {
            awakenScrollBars();
        } //End block
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1536781672 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1536781672;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.521 -0400", hash_original_method = "0FD361D132773200063DCB66E88E964C", hash_generated_method = "F5A440FB07E64F4566788BDCD6C3F605")
    @Override
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        int closestChildIndex;
        closestChildIndex = -1;
        {
            previouslyFocusedRect.offset(mScrollX, mScrollY);
            Rect otherRect;
            otherRect = mTempRect;
            int minDistance;
            minDistance = Integer.MAX_VALUE;
            int childCount;
            childCount = getChildCount();
            {
                int i;
                i = 0;
                {
                    {
                        boolean var4F49F74F736BC8C7CC9FE76A9F30A707_2135495413 = (!isCandidateSelection(i, direction));
                    } //End collapsed parenthetic
                    View other;
                    other = getChildAt(i);
                    other.getDrawingRect(otherRect);
                    offsetDescendantRectToMyCoords(other, otherRect);
                    int distance;
                    distance = getDistance(previouslyFocusedRect, otherRect, direction);
                    {
                        minDistance = distance;
                        closestChildIndex = i;
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            setSelection(closestChildIndex + mFirstPosition);
        } //End block
        {
            requestLayout();
        } //End block
        addTaint(gainFocus);
        addTaint(direction);
        addTaint(previouslyFocusedRect.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.526 -0400", hash_original_method = "84D213429BEB1496C8F56DF85FD23E87", hash_generated_method = "4C3903B823DCAF96015CA0840D9F3FAE")
    private boolean isCandidateSelection(int childIndex, int direction) {
        int count;
        count = getChildCount();
        int invertedIndex;
        invertedIndex = count - 1 - childIndex;
        int rowStart;
        int rowEnd;
        {
            rowStart = childIndex - (childIndex % mNumColumns);
            rowEnd = Math.max(rowStart + mNumColumns - 1, count);
        } //End block
        {
            rowEnd = count - 1 - (invertedIndex - (invertedIndex % mNumColumns));
            rowStart = Math.max(0, rowEnd - mNumColumns + 1);
        } //End block
        //Begin case default 
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("direction must be one of "
                        + "{FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, "
                        + "FOCUS_FORWARD, FOCUS_BACKWARD}.");
        //End case default 
        addTaint(childIndex);
        addTaint(direction);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_996597633 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_996597633;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.527 -0400", hash_original_method = "FC2053B842AF8EFA285EBFCDE9A6D098", hash_generated_method = "BAD7C3D6E170462E620A3F127FF1B253")
    public void setGravity(int gravity) {
        {
            mGravity = gravity;
            requestLayoutIfNecessary();
        } //End block
        // ---------- Original Method ----------
        //if (mGravity != gravity) {
            //mGravity = gravity;
            //requestLayoutIfNecessary();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.527 -0400", hash_original_method = "F4AD294FF1286508B5C248EDCA212E5B", hash_generated_method = "0974E6853BAE84E8A34EC949A0ED119B")
    public void setHorizontalSpacing(int horizontalSpacing) {
        {
            mRequestedHorizontalSpacing = horizontalSpacing;
            requestLayoutIfNecessary();
        } //End block
        // ---------- Original Method ----------
        //if (horizontalSpacing != mRequestedHorizontalSpacing) {
            //mRequestedHorizontalSpacing = horizontalSpacing;
            //requestLayoutIfNecessary();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.543 -0400", hash_original_method = "18D0FB9D8A0D215DBABAAD70588CEE39", hash_generated_method = "D293B570439C006E3649F59931BF24AA")
    public void setVerticalSpacing(int verticalSpacing) {
        {
            mVerticalSpacing = verticalSpacing;
            requestLayoutIfNecessary();
        } //End block
        // ---------- Original Method ----------
        //if (verticalSpacing != mVerticalSpacing) {
            //mVerticalSpacing = verticalSpacing;
            //requestLayoutIfNecessary();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.543 -0400", hash_original_method = "C49A7586B9CFE9BA77F47A780C0C8544", hash_generated_method = "D39AC0879D99FD55925DCABCD912FF43")
    public void setStretchMode(int stretchMode) {
        {
            mStretchMode = stretchMode;
            requestLayoutIfNecessary();
        } //End block
        // ---------- Original Method ----------
        //if (stretchMode != mStretchMode) {
            //mStretchMode = stretchMode;
            //requestLayoutIfNecessary();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.545 -0400", hash_original_method = "B323AFE5AE5939BBDA58166A4DF4B096", hash_generated_method = "6967AFA6DCABE8B900E8BFED1EDD47EE")
    public int getStretchMode() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1869319111 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1869319111;
        // ---------- Original Method ----------
        //return mStretchMode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.552 -0400", hash_original_method = "2D3707A47407D7324964709BC50279C2", hash_generated_method = "BB62D2A99825B7D1702BE76188A98365")
    public void setColumnWidth(int columnWidth) {
        {
            mRequestedColumnWidth = columnWidth;
            requestLayoutIfNecessary();
        } //End block
        // ---------- Original Method ----------
        //if (columnWidth != mRequestedColumnWidth) {
            //mRequestedColumnWidth = columnWidth;
            //requestLayoutIfNecessary();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.552 -0400", hash_original_method = "EB843153C85390AE48F1C91EE0B42CDB", hash_generated_method = "FA6F80A9406D7B9F5F4E2A6711A09668")
    public void setNumColumns(int numColumns) {
        {
            mRequestedNumColumns = numColumns;
            requestLayoutIfNecessary();
        } //End block
        // ---------- Original Method ----------
        //if (numColumns != mRequestedNumColumns) {
            //mRequestedNumColumns = numColumns;
            //requestLayoutIfNecessary();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.553 -0400", hash_original_method = "B011FDCEBE38F0939F62249D6B5BC711", hash_generated_method = "C778FAC7E732DE3C58E30A3AF5CF9445")
    @ViewDebug.ExportedProperty
    public int getNumColumns() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_27742519 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_27742519;
        // ---------- Original Method ----------
        //return mNumColumns;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.565 -0400", hash_original_method = "614329ACA245384517EF28FF3609B04B", hash_generated_method = "9FA2292934F9A98536289BB9C57477FA")
    private void adjustViewsUpOrDown() {
        int childCount;
        childCount = getChildCount();
        {
            int delta;
            View child;
            {
                child = getChildAt(0);
                delta = child.getTop() - mListPadding.top;
                {
                    delta -= mVerticalSpacing;
                } //End block
                {
                    delta = 0;
                } //End block
            } //End block
            {
                child = getChildAt(childCount - 1);
                delta = child.getBottom() - (getHeight() - mListPadding.bottom);
                {
                    delta += mVerticalSpacing;
                } //End block
                {
                    delta = 0;
                } //End block
            } //End block
            {
                offsetChildrenTopAndBottom(-delta);
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.567 -0400", hash_original_method = "0FB16985DD2A598E66D7882D349B86AF", hash_generated_method = "E3D82BE538554CC666B287BBCF0AD27F")
    @Override
    protected int computeVerticalScrollExtent() {
        int count;
        count = getChildCount();
        {
            int numColumns;
            numColumns = mNumColumns;
            int rowCount;
            rowCount = (count + numColumns - 1) / numColumns;
            int extent;
            extent = rowCount * 100;
            View view;
            view = getChildAt(0);
            int top;
            top = view.getTop();
            int height;
            height = view.getHeight();
            {
                extent += (top * 100) / height;
            } //End block
            view = getChildAt(count - 1);
            int bottom;
            bottom = view.getBottom();
            height = view.getHeight();
            {
                extent -= ((bottom - getHeight()) * 100) / height;
            } //End block
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_767165070 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_767165070;
        // ---------- Original Method ----------
        //final int count = getChildCount();
        //if (count > 0) {
            //final int numColumns = mNumColumns;
            //final int rowCount = (count + numColumns - 1) / numColumns;
            //int extent = rowCount * 100;
            //View view = getChildAt(0);
            //final int top = view.getTop();
            //int height = view.getHeight();
            //if (height > 0) {
                //extent += (top * 100) / height;
            //}
            //view = getChildAt(count - 1);
            //final int bottom = view.getBottom();
            //height = view.getHeight();
            //if (height > 0) {
                //extent -= ((bottom - getHeight()) * 100) / height;
            //}
            //return extent;
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.575 -0400", hash_original_method = "77C851014C1118924C7173C75459421E", hash_generated_method = "20D05BC3C25AAE6CD739343628B9316D")
    @Override
    protected int computeVerticalScrollOffset() {
        {
            boolean var55F650244283761A6D0270E03F2533A0_307396546 = (mFirstPosition >= 0 && getChildCount() > 0);
            {
                View view;
                view = getChildAt(0);
                int top;
                top = view.getTop();
                int height;
                height = view.getHeight();
                {
                    int numColumns;
                    numColumns = mNumColumns;
                    int whichRow;
                    whichRow = mFirstPosition / numColumns;
                    int rowCount;
                    rowCount = (mItemCount + numColumns - 1) / numColumns;
                    int varBBCDFA4A3F60B9FD9A50F6BC86F61153_167366083 = (Math.max(whichRow * 100 - (top * 100) / height +
                        (int) ((float) mScrollY / getHeight() * rowCount * 100), 0));
                } //End block
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_533008361 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_533008361;
        // ---------- Original Method ----------
        //if (mFirstPosition >= 0 && getChildCount() > 0) {
            //final View view = getChildAt(0);
            //final int top = view.getTop();
            //int height = view.getHeight();
            //if (height > 0) {
                //final int numColumns = mNumColumns;
                //final int whichRow = mFirstPosition / numColumns;
                //final int rowCount = (mItemCount + numColumns - 1) / numColumns;
                //return Math.max(whichRow * 100 - (top * 100) / height +
                        //(int) ((float) mScrollY / getHeight() * rowCount * 100), 0);
            //}
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.576 -0400", hash_original_method = "2E67C9F09804D125789DA130D24F2E03", hash_generated_method = "FF8EC01FBDC547168EF91B1B1335D987")
    @Override
    protected int computeVerticalScrollRange() {
        int numColumns;
        numColumns = mNumColumns;
        int rowCount;
        rowCount = (mItemCount + numColumns - 1) / numColumns;
        int result;
        result = Math.max(rowCount * 100, 0);
        {
            result += Math.abs((int) ((float) mScrollY / getHeight() * rowCount * 100));
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1255049131 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1255049131;
        // ---------- Original Method ----------
        //final int numColumns = mNumColumns;
        //final int rowCount = (mItemCount + numColumns - 1) / numColumns;
        //int result = Math.max(rowCount * 100, 0);
        //if (mScrollY != 0) {
            //result += Math.abs((int) ((float) mScrollY / getHeight() * rowCount * 100));
        //}
        //return result;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.582 -0400", hash_original_field = "3C6C842350FA9DF4AF7C1577C5481D7F", hash_generated_field = "9591D43DFDB00D3CA815C6412336BEEB")

    public static final int NO_STRETCH = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.582 -0400", hash_original_field = "C781279666F1CFCA96E5F3E8F379648C", hash_generated_field = "9E8C93D13663D982A634A608E98FDD9B")

    public static final int STRETCH_SPACING = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.582 -0400", hash_original_field = "93F50EC30CD0856C8A19939E9B64DED3", hash_generated_field = "289B7802E2F88C85889BF1B0A565B14F")

    public static final int STRETCH_COLUMN_WIDTH = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.582 -0400", hash_original_field = "321EC49DA83893E4048EDCC856EFEFB3", hash_generated_field = "6D329753C82DAECBEDD98AD073821537")

    public static final int STRETCH_SPACING_UNIFORM = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:07.582 -0400", hash_original_field = "57174C1594A18EA6304DDA366FEF8B68", hash_generated_field = "4306712C3BDDA946F401316F516F19DA")

    public static final int AUTO_FIT = -1;
}

