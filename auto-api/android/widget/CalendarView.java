package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.annotation.Widget;
import android.app.Service;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import com.android.internal.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import libcore.icu.LocaleData;

public class CalendarView extends FrameLayout {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "ED78BABF354FEF8D61EC60FB59A2000B", hash_generated_field = "8B23991BED629DDCFDA8E1DD88120AF5")

    private int mWeekSeperatorLineWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "1D34B47E8775BB2ECA8D8931C9929E4C", hash_generated_field = "3897E934AACB2D4B5C6B0C16CCB429A0")

    private int mDateTextSize;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "FB12A71334A6D7EE07106F45B00108F2", hash_generated_field = "A59A89A5D83C758D66546FEAE58F54D4")

    private Drawable mSelectedDateVerticalBar;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "C73B64367500D418F6D9EE65E112239B", hash_generated_field = "2C1B7E5AE5693E0A43249D97A45D63E8")

    private int mSelectedDateVerticalBarWidth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "8392E587DA00F5D5D7236C5119EC162F", hash_generated_field = "74B6E0C11198E97BD97CA4756AB27759")

    private int mSelectedWeekBackgroundColor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "DF5E3F482A39E59C0A6FD713E1F7B79D", hash_generated_field = "A9584354BACE2D8F069618758B081B06")

    private int mFocusedMonthDateColor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "27BBE21312EE1580A61F6D3E69496189", hash_generated_field = "7D2BE4C5D269E856747B17281912BE9C")

    private int mUnfocusedMonthDateColor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "BE2F3C75D7D9AC89B14EF2F89598BB24", hash_generated_field = "8DDBF4CBD718C3948A0F42D2C1DB5D99")

    private int mWeekSeparatorLineColor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "746B0FA1EB20C3937304705FE5C23493", hash_generated_field = "6A25546F44B6068A62792DA64248742A")

    private int mWeekNumberColor;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.031 -0400", hash_original_field = "8AD37204774915335DFF4E89A8110A64", hash_generated_field = "5665B7B8CC3DF642A1DAF00F3DE77EFA")

    private int mListScrollTopOffset = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "58F9877B31CDB53B0DEBB1000C39DD90", hash_generated_field = "D65BAA41D805492896870D587D162209")

    private int mWeekMinVisibleHeight = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "F651E579DA04CEFE11049FBAA43D493E", hash_generated_field = "5FC459B021EAF2699021DD8B9B1D6C2B")

    private int mBottomBuffer = 20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "D0CCED79166044E967E93767AAFDB4D2", hash_generated_field = "6CB09EC87311D40CB9B77369F5C620A1")

    private int mShownWeekCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "53E3E568843E4B190CE603DFFAC9D53E", hash_generated_field = "0A0881CE0345FE41D9B257D56D8D82CA")

    private boolean mShowWeekNumber;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "005222EB6C4F0D144BE8F9C50ECD901D", hash_generated_field = "0792CCA61E447A5A7FB7126E5ABF29EC")

    private int mDaysPerWeek = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "0212E969626F0F0D1636343F1309E195", hash_generated_field = "78A6141C2BBA378820D9128DA7F22F8D")

    private float mFriction = .05f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "53A4ECF35C3EFF748C559F23D0631904", hash_generated_field = "E3AADF3834C4F3228039B1ED679BE2BE")

    private float mVelocityScale = 0.333f;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "59E9F255F2F17EC006AE601269EA8540", hash_generated_field = "C5ED7BC1BF12E15BC029B4E0815E71E3")

    private WeeksAdapter mAdapter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "3F37B910066E368A8F9F00CF63E3318B", hash_generated_field = "7E41BBAA7AC45D61F96A7CC2A5AFF94F")

    private ListView mListView;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "18448757CD3C825FD4B679B03ECA4680", hash_generated_field = "3BCC597FF6F62DFD9F809924D1A9B7CC")

    private TextView mMonthName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "12D57B519396B84F36E1C5CCCE7BEFD7", hash_generated_field = "E95A3921B8AB382181ED602DFBF5F267")

    private ViewGroup mDayNamesHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "6EF4E151400CEC15A8876C51787B7E10", hash_generated_field = "59E44C9DFCE7DBB845766E4E65180588")

    private String[] mDayLabels;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "FD868BD5C2AC35186323583DC33DC09D", hash_generated_field = "30452844013892C49D8827DAE1E459DE")

    private int mFirstDayOfWeek;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "2FC11E055DD064417E49C7C20C8CD874", hash_generated_field = "41289D9BED76260F340EB785FCC2056A")

    private int mCurrentMonthDisplayed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "FE81B8EDAAB742D1A97D166BED21F370", hash_generated_field = "A32E25FFB7BC22A215A1EAB2F45C9CD4")

    private long mPreviousScrollPosition;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "11AB8A4F6569B0496A3B3BFA0E1C3F20", hash_generated_field = "5B9F7E9646034BCC8F83298FA039B637")

    private boolean mIsScrollingUp = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "A67CBF76ED54FBC5D55CD0E77A575947", hash_generated_field = "F3024B0C881FFDC3012F965272357A8A")

    private int mPreviousScrollState = OnScrollListener.SCROLL_STATE_IDLE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "81988B32590D1655D65A6770ED17DCEF", hash_generated_field = "328AD7D92706C021C1C22127BE75612C")

    private int mCurrentScrollState = OnScrollListener.SCROLL_STATE_IDLE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "811A2D8EF3A390BABF52F43FDF0E05DE", hash_generated_field = "05EE47F5BF2CAC4310C2BEEFD3D65AE0")

    private OnDateChangeListener mOnDateChangeListener;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "02096E197DDBCC617385B7820770714F", hash_generated_field = "2729908D3AF534B2F645E718D75BC4E8")

    private ScrollStateRunnable mScrollStateChangedRunnable = new ScrollStateRunnable();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "2CD58DB7365E32A740CCEDC539E005B5", hash_generated_field = "915400C77BD703DACB8E97CD72BFFD5E")

    private Calendar mTempDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "9B3201C38EFD7F45CCD545D51C752709", hash_generated_field = "D29AF2C549B988F84E81471C8F4DFA25")

    private Calendar mFirstDayOfMonth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "E65E4BB5B38AD013B1E2F00B4ED9DF18", hash_generated_field = "681C6D172B5A021A54543F6E6ED5BD03")

    private Calendar mMinDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "022B7F9BF85FB96A21762C2F3C1B66E0", hash_generated_field = "4C58BCC5BEA466149D70675257F2009F")

    private Calendar mMaxDate;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.032 -0400", hash_original_field = "D09E60E802BCF776E697BC72D82FD915", hash_generated_field = "DD6C69E67AB2E9F8A9F9FF9AC021283E")

    private java.text.DateFormat mDateFormat = new SimpleDateFormat(DATE_FORMAT);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.033 -0400", hash_original_field = "A21C83444D8B0E7E33D76B52140C960A", hash_generated_field = "88175FFB524B6CC60F82A34D8C4EC643")

    private Locale mCurrentLocale;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.043 -0400", hash_original_method = "52384FB40509E71BA2451D4915E5D413", hash_generated_method = "E8B74CDF68DAAB62882F628129916D13")
    public  CalendarView(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.049 -0400", hash_original_method = "79D5762FBD0B1A46CF2745AED4E3FAD9", hash_generated_method = "03C2BAB24513DB995CE8568B55BDED26")
    public  CalendarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.071 -0400", hash_original_method = "B881CA40E8482968634BC9086836F338", hash_generated_method = "EFD760B04512F4104E80D26ACD4DE3B5")
    public  CalendarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, 0);
        setCurrentLocale(Locale.getDefault());
        TypedArray attributesArray;
        attributesArray = context.obtainStyledAttributes(attrs, R.styleable.CalendarView,
                R.attr.calendarViewStyle, 0);
        mShowWeekNumber = attributesArray.getBoolean(R.styleable.CalendarView_showWeekNumber,
                DEFAULT_SHOW_WEEK_NUMBER);
        mFirstDayOfWeek = attributesArray.getInt(R.styleable.CalendarView_firstDayOfWeek,
                LocaleData.get(Locale.getDefault()).firstDayOfWeek);
        String minDate;
        minDate = attributesArray.getString(R.styleable.CalendarView_minDate);
        {
            boolean var90AD151C49446DC9B6504DDCC69BA991_1795624016 = (TextUtils.isEmpty(minDate) || !parseDate(minDate, mMinDate));
            {
                parseDate(DEFAULT_MIN_DATE, mMinDate);
            } //End block
        } //End collapsed parenthetic
        String maxDate;
        maxDate = attributesArray.getString(R.styleable.CalendarView_maxDate);
        {
            boolean varE3F62D79DFB1CE6472EF517746A3B9BD_1512628356 = (TextUtils.isEmpty(maxDate) || !parseDate(maxDate, mMaxDate));
            {
                parseDate(DEFAULT_MAX_DATE, mMaxDate);
            } //End block
        } //End collapsed parenthetic
        {
            boolean var3EF097584A45D1A3246AC332EAF623F3_1942505197 = (mMaxDate.before(mMinDate));
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Max date cannot be before min date.");
            } //End block
        } //End collapsed parenthetic
        mShownWeekCount = attributesArray.getInt(R.styleable.CalendarView_shownWeekCount,
                DEFAULT_SHOWN_WEEK_COUNT);
        mSelectedWeekBackgroundColor = attributesArray.getColor(
                R.styleable.CalendarView_selectedWeekBackgroundColor, 0);
        mFocusedMonthDateColor = attributesArray.getColor(
                R.styleable.CalendarView_focusedMonthDateColor, 0);
        mUnfocusedMonthDateColor = attributesArray.getColor(
                R.styleable.CalendarView_unfocusedMonthDateColor, 0);
        mWeekSeparatorLineColor = attributesArray.getColor(
                R.styleable.CalendarView_weekSeparatorLineColor, 0);
        mWeekNumberColor = attributesArray.getColor(R.styleable.CalendarView_weekNumberColor, 0);
        mSelectedDateVerticalBar = attributesArray.getDrawable(
                R.styleable.CalendarView_selectedDateVerticalBar);
        int dateTextAppearanceResId;
        dateTextAppearanceResId = attributesArray.getResourceId(
                R.styleable.CalendarView_dateTextAppearance, R.style.TextAppearance_Small);
        TypedArray dateTextAppearance;
        dateTextAppearance = context.obtainStyledAttributes(dateTextAppearanceResId,
                com.android.internal.R.styleable.TextAppearance);
        mDateTextSize = dateTextAppearance.getDimensionPixelSize(
                R.styleable.TextAppearance_textSize, DEFAULT_DATE_TEXT_SIZE);
        dateTextAppearance.recycle();
        int weekDayTextAppearanceResId;
        weekDayTextAppearanceResId = attributesArray.getResourceId(
                R.styleable.CalendarView_weekDayTextAppearance,
                DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID);
        attributesArray.recycle();
        DisplayMetrics displayMetrics;
        displayMetrics = getResources().getDisplayMetrics();
        mWeekMinVisibleHeight = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                UNSCALED_WEEK_MIN_VISIBLE_HEIGHT, displayMetrics);
        mListScrollTopOffset = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                UNSCALED_LIST_SCROLL_TOP_OFFSET, displayMetrics);
        mBottomBuffer = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                UNSCALED_BOTTOM_BUFFER, displayMetrics);
        mSelectedDateVerticalBarWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                UNSCALED_SELECTED_DATE_VERTICAL_BAR_WIDTH, displayMetrics);
        mWeekSeperatorLineWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                UNSCALED_WEEK_SEPARATOR_LINE_WIDTH, displayMetrics);
        LayoutInflater layoutInflater;
        layoutInflater = (LayoutInflater) mContext
                .getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        View content;
        content = layoutInflater.inflate(R.layout.calendar_view, null, false);
        addView(content);
        mListView = (ListView) findViewById(R.id.list);
        mDayNamesHeader = (ViewGroup) content.findViewById(com.android.internal.R.id.day_names);
        mMonthName = (TextView) content.findViewById(com.android.internal.R.id.month_name);
        setUpHeader(weekDayTextAppearanceResId);
        setUpListView();
        setUpAdapter();
        mTempDate.setTimeInMillis(System.currentTimeMillis());
        {
            boolean var723089A440AF4CB7CC64C5EEF62BE8A3_1446742229 = (mTempDate.before(mMinDate));
            {
                goTo(mMinDate, false, true, true);
            } //End block
            {
                boolean var3CD27D6CFCFE61CCC254254F95A4E4B6_35910438 = (mMaxDate.before(mTempDate));
                {
                    goTo(mMaxDate, false, true, true);
                } //End block
                {
                    goTo(mTempDate, false, true, true);
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        invalidate();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        addTaint(defStyle);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.072 -0400", hash_original_method = "1D9E2CC40134FA188645AC8C7A8FADC7", hash_generated_method = "FF7DBA35B8768F9E6F6F7DD42CFB060E")
    @Override
    public void setEnabled(boolean enabled) {
        mListView.setEnabled(enabled);
        addTaint(enabled);
        // ---------- Original Method ----------
        //mListView.setEnabled(enabled);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.072 -0400", hash_original_method = "93B4809DF8FBD1AECB02AFF6547691F9", hash_generated_method = "D21A1587787E9E7B4D39CFDE79F016A6")
    @Override
    public boolean isEnabled() {
        boolean var3EFC8F76722ABBAE67832DDF2F2F242C_396219069 = (mListView.isEnabled());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_229089046 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_229089046;
        // ---------- Original Method ----------
        //return mListView.isEnabled();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.073 -0400", hash_original_method = "C452430AEDBDDD78DF8F4D12B9175E89", hash_generated_method = "FB0A11FC0C47EF7B377125BF2E9C2DD7")
    @Override
    protected void onConfigurationChanged(Configuration newConfig) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onConfigurationChanged(newConfig);
        setCurrentLocale(newConfig.locale);
        addTaint(newConfig.getTaint());
        // ---------- Original Method ----------
        //super.onConfigurationChanged(newConfig);
        //setCurrentLocale(newConfig.locale);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.073 -0400", hash_original_method = "967B291ED0BCED68F7E3E5A0CEF03695", hash_generated_method = "3B2FA81D7AEE5C11E14A4B0E3308A71A")
    public long getMinDate() {
        long varE9182735C4E0F8DB15688CAB80ADDB8E_818121076 = (mMinDate.getTimeInMillis());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_995256442 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_995256442;
        // ---------- Original Method ----------
        //return mMinDate.getTimeInMillis();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.074 -0400", hash_original_method = "FF5386D03D60B1076A84367A6FF3DA28", hash_generated_method = "EF84D125665EA2138363F0954065D689")
    public void setMinDate(long minDate) {
        mTempDate.setTimeInMillis(minDate);
        {
            boolean varBA6899CBD1B589E9C9339139EE86931B_1829310308 = (isSameDate(mTempDate, mMinDate));
        } //End collapsed parenthetic
        mMinDate.setTimeInMillis(minDate);
        Calendar date;
        date = mAdapter.mSelectedDate;
        {
            boolean varC241E660552FCC0CC300BD358680B846_1118390701 = (date.before(mMinDate));
            {
                mAdapter.setSelectedDay(mMinDate);
            } //End block
        } //End collapsed parenthetic
        mAdapter.init();
        {
            boolean varC241E660552FCC0CC300BD358680B846_1872999125 = (date.before(mMinDate));
            {
                setDate(mTempDate.getTimeInMillis());
            } //End block
            {
                goTo(date, false, true, false);
            } //End block
        } //End collapsed parenthetic
        addTaint(minDate);
        // ---------- Original Method ----------
        //mTempDate.setTimeInMillis(minDate);
        //if (isSameDate(mTempDate, mMinDate)) {
            //return;
        //}
        //mMinDate.setTimeInMillis(minDate);
        //Calendar date = mAdapter.mSelectedDate;
        //if (date.before(mMinDate)) {
            //mAdapter.setSelectedDay(mMinDate);
        //}
        //mAdapter.init();
        //if (date.before(mMinDate)) {
            //setDate(mTempDate.getTimeInMillis());
        //} else {
            //goTo(date, false, true, false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.074 -0400", hash_original_method = "4B53E128D2B815FDD1432B3F6B079B5B", hash_generated_method = "543EA33B813007E1DC1450D14D1F21C4")
    public long getMaxDate() {
        long var7E289ED2E917AFBA91EF20B25A644C8B_2005394647 = (mMaxDate.getTimeInMillis());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1799620489 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1799620489;
        // ---------- Original Method ----------
        //return mMaxDate.getTimeInMillis();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.074 -0400", hash_original_method = "A06814E3E9CB43249648A0F0C1DE0D5D", hash_generated_method = "879EC40EB28218972626E8273AA83DDA")
    public void setMaxDate(long maxDate) {
        mTempDate.setTimeInMillis(maxDate);
        {
            boolean var47D8C586FDF6BA5C53CDC73D89D4E5F7_1985136857 = (isSameDate(mTempDate, mMaxDate));
        } //End collapsed parenthetic
        mMaxDate.setTimeInMillis(maxDate);
        mAdapter.init();
        Calendar date;
        date = mAdapter.mSelectedDate;
        {
            boolean var41089FD40A46564D975094B1E25CAEC5_261454574 = (date.after(mMaxDate));
            {
                setDate(mMaxDate.getTimeInMillis());
            } //End block
            {
                goTo(date, false, true, false);
            } //End block
        } //End collapsed parenthetic
        addTaint(maxDate);
        // ---------- Original Method ----------
        //mTempDate.setTimeInMillis(maxDate);
        //if (isSameDate(mTempDate, mMaxDate)) {
            //return;
        //}
        //mMaxDate.setTimeInMillis(maxDate);
        //mAdapter.init();
        //Calendar date = mAdapter.mSelectedDate;
        //if (date.after(mMaxDate)) {
            //setDate(mMaxDate.getTimeInMillis());
        //} else {
            //goTo(date, false, true, false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.075 -0400", hash_original_method = "F2BDD8F6BF1030E3F09A2B5F73B0EF93", hash_generated_method = "4F02A578BC90711A7E9BF40197332F4B")
    public void setShowWeekNumber(boolean showWeekNumber) {
        mShowWeekNumber = showWeekNumber;
        mAdapter.notifyDataSetChanged();
        setUpHeader(DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID);
        // ---------- Original Method ----------
        //if (mShowWeekNumber == showWeekNumber) {
            //return;
        //}
        //mShowWeekNumber = showWeekNumber;
        //mAdapter.notifyDataSetChanged();
        //setUpHeader(DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.075 -0400", hash_original_method = "466B93651CABC20F69979D67C7EC6971", hash_generated_method = "B63173F14C2FD43DD61DFD6C00054BF8")
    public boolean getShowWeekNumber() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1990277026 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1990277026;
        // ---------- Original Method ----------
        //return mShowWeekNumber;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.075 -0400", hash_original_method = "13AE9B7D254FD4442860EE49493A72AE", hash_generated_method = "30FABCE94B4756FFEE49A3735D35ECED")
    public int getFirstDayOfWeek() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_292477148 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_292477148;
        // ---------- Original Method ----------
        //return mFirstDayOfWeek;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.076 -0400", hash_original_method = "631B1F3A15EE6F7D95BE757EDF5B5B91", hash_generated_method = "1ED779547D6FB4666ED6D4C1ECE6F18D")
    public void setFirstDayOfWeek(int firstDayOfWeek) {
        mFirstDayOfWeek = firstDayOfWeek;
        mAdapter.init();
        mAdapter.notifyDataSetChanged();
        setUpHeader(DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID);
        // ---------- Original Method ----------
        //if (mFirstDayOfWeek == firstDayOfWeek) {
            //return;
        //}
        //mFirstDayOfWeek = firstDayOfWeek;
        //mAdapter.init();
        //mAdapter.notifyDataSetChanged();
        //setUpHeader(DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.076 -0400", hash_original_method = "2EC5480533B2BF54D56B2049BA7CA5D7", hash_generated_method = "40E23822C44A26C2CDF30A58488DCCDD")
    public void setOnDateChangeListener(OnDateChangeListener listener) {
        mOnDateChangeListener = listener;
        // ---------- Original Method ----------
        //mOnDateChangeListener = listener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.076 -0400", hash_original_method = "1C8908BABBBBE904441B712A0F71BAD8", hash_generated_method = "10DF67DF48CB1DBC727C5B9E569D8B53")
    public long getDate() {
        long var0F1B39E7345B9CDA182064903BF8E5F0_394210375 = (mAdapter.mSelectedDate.getTimeInMillis());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1732906722 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1732906722;
        // ---------- Original Method ----------
        //return mAdapter.mSelectedDate.getTimeInMillis();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.077 -0400", hash_original_method = "D6F29E7F63D0C42CAD60620E4D2FC504", hash_generated_method = "186913A4358C1D2AE1647BFD444D9924")
    public void setDate(long date) {
        setDate(date, false, false);
        addTaint(date);
        // ---------- Original Method ----------
        //setDate(date, false, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.077 -0400", hash_original_method = "7D056A885692AA64348F6515B99D8688", hash_generated_method = "E9255C7C65D8C12EFD666C7CC7D57CAA")
    public void setDate(long date, boolean animate, boolean center) {
        mTempDate.setTimeInMillis(date);
        {
            boolean var33AC8D86F9EF69ABC5D4276E04DCBF36_622027930 = (isSameDate(mTempDate, mAdapter.mSelectedDate));
        } //End collapsed parenthetic
        goTo(mTempDate, animate, true, center);
        addTaint(date);
        addTaint(animate);
        addTaint(center);
        // ---------- Original Method ----------
        //mTempDate.setTimeInMillis(date);
        //if (isSameDate(mTempDate, mAdapter.mSelectedDate)) {
            //return;
        //}
        //goTo(mTempDate, animate, true, center);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.083 -0400", hash_original_method = "4AE549580BCF2D6667C808ED8CCBDCDC", hash_generated_method = "9E2FB745F235F8D139F006CCC501FB22")
    private void setCurrentLocale(Locale locale) {
        {
            boolean varD1CF46D36E6B1C6187CE68AE2BC3F432_1482207005 = (locale.equals(mCurrentLocale));
        } //End collapsed parenthetic
        mCurrentLocale = locale;
        mTempDate = getCalendarForLocale(mTempDate, locale);
        mFirstDayOfMonth = getCalendarForLocale(mFirstDayOfMonth, locale);
        mMinDate = getCalendarForLocale(mMinDate, locale);
        mMaxDate = getCalendarForLocale(mMaxDate, locale);
        // ---------- Original Method ----------
        //if (locale.equals(mCurrentLocale)) {
            //return;
        //}
        //mCurrentLocale = locale;
        //mTempDate = getCalendarForLocale(mTempDate, locale);
        //mFirstDayOfMonth = getCalendarForLocale(mFirstDayOfMonth, locale);
        //mMinDate = getCalendarForLocale(mMinDate, locale);
        //mMaxDate = getCalendarForLocale(mMaxDate, locale);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.083 -0400", hash_original_method = "FA738DF80665124C3A5E01ADC04827D9", hash_generated_method = "EF323C17A520AD11F3610070344DA502")
    private Calendar getCalendarForLocale(Calendar oldCalendar, Locale locale) {
        Calendar varB4EAC82CA7396A68D541C85D26508E83_2115975767 = null; //Variable for return #1
        Calendar varB4EAC82CA7396A68D541C85D26508E83_2129634922 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_2115975767 = Calendar.getInstance(locale);
        } //End block
        {
            long currentTimeMillis;
            currentTimeMillis = oldCalendar.getTimeInMillis();
            Calendar newCalendar;
            newCalendar = Calendar.getInstance(locale);
            newCalendar.setTimeInMillis(currentTimeMillis);
            varB4EAC82CA7396A68D541C85D26508E83_2129634922 = newCalendar;
        } //End block
        addTaint(oldCalendar.getTaint());
        addTaint(locale.getTaint());
        Calendar varA7E53CE21691AB073D9660D615818899_1761470946; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1761470946 = varB4EAC82CA7396A68D541C85D26508E83_2115975767;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1761470946 = varB4EAC82CA7396A68D541C85D26508E83_2129634922;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1761470946.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1761470946;
        // ---------- Original Method ----------
        //if (oldCalendar == null) {
            //return Calendar.getInstance(locale);
        //} else {
            //final long currentTimeMillis = oldCalendar.getTimeInMillis();
            //Calendar newCalendar = Calendar.getInstance(locale);
            //newCalendar.setTimeInMillis(currentTimeMillis);
            //return newCalendar;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.182 -0400", hash_original_method = "70DC9A9889795E848236506BBC0A481B", hash_generated_method = "AD82B33E1AC11A97C6439E56F49BDDB9")
    private boolean isSameDate(Calendar firstDate, Calendar secondDate) {
        boolean varE5DDF39B5D0EB5D777CDF593735BA5B3_2003632112 = ((firstDate.get(Calendar.DAY_OF_YEAR) == secondDate.get(Calendar.DAY_OF_YEAR)
                && firstDate.get(Calendar.YEAR) == secondDate.get(Calendar.YEAR)));
        addTaint(firstDate.getTaint());
        addTaint(secondDate.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_703424017 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_703424017;
        // ---------- Original Method ----------
        //return (firstDate.get(Calendar.DAY_OF_YEAR) == secondDate.get(Calendar.DAY_OF_YEAR)
                //&& firstDate.get(Calendar.YEAR) == secondDate.get(Calendar.YEAR));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.188 -0400", hash_original_method = "513863F202D0E7C406F959CC7EBC2D43", hash_generated_method = "4DB6F390BD178B3A5AA4CCBB0D27268E")
    private void setUpAdapter() {
        {
            mAdapter = new WeeksAdapter(getContext());
            mAdapter.registerDataSetObserver(new DataSetObserver() {                
                @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.188 -0400", hash_original_method = "CEA948C87231173C338757A31D25F841", hash_generated_method = "39121B26D4CB930BD1433E11904FC96E")
                @Override
                public void onChanged() {
                    //DSFIXME:  CODE0009: Possible callback target function detected
                    {
                        Calendar selectedDay;
                        selectedDay = mAdapter.getSelectedDay();
                        mOnDateChangeListener.onSelectedDayChange(CalendarView.this,
                                selectedDay.get(Calendar.YEAR),
                                selectedDay.get(Calendar.MONTH),
                                selectedDay.get(Calendar.DAY_OF_MONTH));
                    } //End block
                    // ---------- Original Method ----------
                    //if (mOnDateChangeListener != null) {
                        //Calendar selectedDay = mAdapter.getSelectedDay();
                        //mOnDateChangeListener.onSelectedDayChange(CalendarView.this,
                                //selectedDay.get(Calendar.YEAR),
                                //selectedDay.get(Calendar.MONTH),
                                //selectedDay.get(Calendar.DAY_OF_MONTH));
                    //}
                }
});
            mListView.setAdapter(mAdapter);
        } //End block
        mAdapter.notifyDataSetChanged();
        // ---------- Original Method ----------
        //if (mAdapter == null) {
            //mAdapter = new WeeksAdapter(getContext());
            //mAdapter.registerDataSetObserver(new DataSetObserver() {
                //@Override
                //public void onChanged() {
                    //if (mOnDateChangeListener != null) {
                        //Calendar selectedDay = mAdapter.getSelectedDay();
                        //mOnDateChangeListener.onSelectedDayChange(CalendarView.this,
                                //selectedDay.get(Calendar.YEAR),
                                //selectedDay.get(Calendar.MONTH),
                                //selectedDay.get(Calendar.DAY_OF_MONTH));
                    //}
                //}
            //});
            //mListView.setAdapter(mAdapter);
        //}
        //mAdapter.notifyDataSetChanged();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.204 -0400", hash_original_method = "2BEB208CF4EFB41463E1218ACA7650C9", hash_generated_method = "FE632FE4590915EA96FD6C3F74DC55EA")
    private void setUpHeader(int weekDayTextAppearanceResId) {
        mDayLabels = new String[mDaysPerWeek];
        {
            int i, count;
            i = mFirstDayOfWeek;
            count = mFirstDayOfWeek + mDaysPerWeek;
            {
                int calendarDay;
                calendarDay = i - Calendar.SATURDAY;
                calendarDay = i;
                mDayLabels[i - mFirstDayOfWeek] = DateUtils.getDayOfWeekString(calendarDay,
                    DateUtils.LENGTH_SHORTEST);
            } //End block
        } //End collapsed parenthetic
        TextView label;
        label = (TextView) mDayNamesHeader.getChildAt(0);
        {
            label.setVisibility(View.VISIBLE);
        } //End block
        {
            label.setVisibility(View.GONE);
        } //End block
        {
            int i, count;
            i = 1;
            count = mDayNamesHeader.getChildCount();
            {
                label = (TextView) mDayNamesHeader.getChildAt(i);
                {
                    label.setTextAppearance(mContext, weekDayTextAppearanceResId);
                } //End block
                {
                    label.setText(mDayLabels[i - 1]);
                    label.setVisibility(View.VISIBLE);
                } //End block
                {
                    label.setVisibility(View.GONE);
                } //End block
            } //End block
        } //End collapsed parenthetic
        mDayNamesHeader.invalidate();
        addTaint(weekDayTextAppearanceResId);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.207 -0400", hash_original_method = "CFADBCF95F8E177F25E22F1FC2115F77", hash_generated_method = "B4557EB2EC2C808C3A2BA70AD3CE2687")
    private void setUpListView() {
        mListView.setDivider(null);
        mListView.setItemsCanFocus(true);
        mListView.setVerticalScrollBarEnabled(false);
        mListView.setOnScrollListener(new OnScrollListener() {            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.206 -0400", hash_original_method = "00F32D753053A861AE7DBFD213079352", hash_generated_method = "1440D062D8FF2F2BBCAFE414F0534FCE")
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                CalendarView.this.onScrollStateChanged(view, scrollState);
                addTaint(view.getTaint());
                addTaint(scrollState);
                // ---------- Original Method ----------
                //CalendarView.this.onScrollStateChanged(view, scrollState);
            }
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.206 -0400", hash_original_method = "E68786505B378D9C994B2BFCAEDF7B06", hash_generated_method = "802A3891201685653DD4F3AA6DFC549A")
            public void onScroll(
                    AbsListView view, int firstVisibleItem, int visibleItemCount,
                    int totalItemCount) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                CalendarView.this.onScroll(view, firstVisibleItem, visibleItemCount,
                        totalItemCount);
                addTaint(view.getTaint());
                addTaint(firstVisibleItem);
                addTaint(visibleItemCount);
                addTaint(totalItemCount);
                // ---------- Original Method ----------
                //CalendarView.this.onScroll(view, firstVisibleItem, visibleItemCount,
                        //totalItemCount);
            }
});
        mListView.setFriction(mFriction);
        mListView.setVelocityScale(mVelocityScale);
        // ---------- Original Method ----------
        //mListView.setDivider(null);
        //mListView.setItemsCanFocus(true);
        //mListView.setVerticalScrollBarEnabled(false);
        //mListView.setOnScrollListener(new OnScrollListener() {
            //public void onScrollStateChanged(AbsListView view, int scrollState) {
                //CalendarView.this.onScrollStateChanged(view, scrollState);
            //}
            //public void onScroll(
                    //AbsListView view, int firstVisibleItem, int visibleItemCount,
                    //int totalItemCount) {
                //CalendarView.this.onScroll(view, firstVisibleItem, visibleItemCount,
                        //totalItemCount);
            //}
        //});
        //mListView.setFriction(mFriction);
        //mListView.setVelocityScale(mVelocityScale);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.216 -0400", hash_original_method = "9885B6A6E0E890A0EF52CBA474F609AF", hash_generated_method = "1A2B447A356F6491C51C42122AA26747")
    private void goTo(Calendar date, boolean animate, boolean setSelected, boolean forceScroll) {
        {
            boolean var56349B8CA12AF843B6D9A651DBD6DD45_1507883079 = (date.before(mMinDate) || date.after(mMaxDate));
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Time not between " + mMinDate.getTime()
                    + " and " + mMaxDate.getTime());
            } //End block
        } //End collapsed parenthetic
        int firstFullyVisiblePosition;
        firstFullyVisiblePosition = mListView.getFirstVisiblePosition();
        View firstChild;
        firstChild = mListView.getChildAt(0);
        {
            boolean varB1D20EF5A4B647F4D83F0C989C37AB89_1510293422 = (firstChild != null && firstChild.getTop() < 0);
        } //End collapsed parenthetic
        int lastFullyVisiblePosition;
        lastFullyVisiblePosition = firstFullyVisiblePosition + mShownWeekCount - 1;
        {
            boolean var487141D1BA9B101D21ABAA229C5620F7_1916374737 = (firstChild != null && firstChild.getTop() > mBottomBuffer);
        } //End collapsed parenthetic
        {
            mAdapter.setSelectedDay(date);
        } //End block
        int position;
        position = getWeeksSinceMinDate(date);
        {
            mFirstDayOfMonth.setTimeInMillis(date.getTimeInMillis());
            mFirstDayOfMonth.set(Calendar.DAY_OF_MONTH, 1);
            setMonthDisplayed(mFirstDayOfMonth);
            {
                boolean varA5F71149318293426D0DC11EF1E3EDB8_534934143 = (mFirstDayOfMonth.before(mMinDate));
                {
                    position = 0;
                } //End block
                {
                    position = getWeeksSinceMinDate(mFirstDayOfMonth);
                } //End block
            } //End collapsed parenthetic
            mPreviousScrollState = OnScrollListener.SCROLL_STATE_FLING;
            {
                mListView.smoothScrollToPositionFromTop(position, mListScrollTopOffset,
                        GOTO_SCROLL_DURATION);
            } //End block
            {
                mListView.setSelectionFromTop(position, mListScrollTopOffset);
                onScrollStateChanged(mListView, OnScrollListener.SCROLL_STATE_IDLE);
            } //End block
        } //End block
        {
            setMonthDisplayed(date);
        } //End block
        addTaint(date.getTaint());
        addTaint(animate);
        addTaint(setSelected);
        addTaint(forceScroll);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.217 -0400", hash_original_method = "4EF37BB5E8B6D289AE6D0021CE0D4FEB", hash_generated_method = "6646132ED57FDDA30D67A14D28E2B7B8")
    private boolean parseDate(String date, Calendar outDate) {
        try 
        {
            outDate.setTime(mDateFormat.parse(date));
        } //End block
        catch (ParseException e)
        { }
        addTaint(date.getTaint());
        addTaint(outDate.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1296309356 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1296309356;
        // ---------- Original Method ----------
        //try {
            //outDate.setTime(mDateFormat.parse(date));
            //return true;
        //} catch (ParseException e) {
            //Log.w(LOG_TAG, "Date: " + date + " not in format: " + DATE_FORMAT);
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.217 -0400", hash_original_method = "F153BBCA7962990A30E79BE6D90D9C30", hash_generated_method = "D3775CDF8671BE04CD9A2671C1247838")
    private void onScrollStateChanged(AbsListView view, int scrollState) {
        mScrollStateChangedRunnable.doScrollStateChange(view, scrollState);
        addTaint(view.getTaint());
        addTaint(scrollState);
        // ---------- Original Method ----------
        //mScrollStateChangedRunnable.doScrollStateChange(view, scrollState);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.218 -0400", hash_original_method = "FE6404A8901B8111BDEFCBB086ABC460", hash_generated_method = "0C2ED2D1B022A34C3C720D94ECE19127")
    private void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
            int totalItemCount) {
        WeekView child;
        child = (WeekView) view.getChildAt(0);
        long currScroll;
        currScroll = view.getFirstVisiblePosition() * child.getHeight() - child.getBottom();
        {
            mIsScrollingUp = true;
        } //End block
        {
            mIsScrollingUp = false;
        } //End block
        int offset;
        boolean varB8609941F58CE0559139A9EC21B0733F_1121653994 = (child.getBottom() < mWeekMinVisibleHeight);
        offset = 1;
        offset = 0;
        {
            child = (WeekView) view.getChildAt(SCROLL_HYST_WEEKS + offset);
        } //End block
        {
            child = (WeekView) view.getChildAt(offset);
        } //End block
        int month;
        {
            month = child.getMonthOfFirstWeekDay();
        } //End block
        {
            month = child.getMonthOfLastWeekDay();
        } //End block
        int monthDiff;
        {
            monthDiff = 1;
        } //End block
        {
            monthDiff = -1;
        } //End block
        {
            monthDiff = month - mCurrentMonthDisplayed;
        } //End block
        {
            Calendar firstDay;
            firstDay = child.getFirstDay();
            {
                firstDay.add(Calendar.DAY_OF_MONTH, -DAYS_PER_WEEK);
            } //End block
            {
                firstDay.add(Calendar.DAY_OF_MONTH, DAYS_PER_WEEK);
            } //End block
            setMonthDisplayed(firstDay);
        } //End block
        mPreviousScrollPosition = currScroll;
        mPreviousScrollState = mCurrentScrollState;
        addTaint(view.getTaint());
        addTaint(firstVisibleItem);
        addTaint(visibleItemCount);
        addTaint(totalItemCount);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.219 -0400", hash_original_method = "2D87D8A121385B44A48D783AA9D15CB4", hash_generated_method = "017D7BFD5D04BA6D8CC86939B9DC6487")
    private void setMonthDisplayed(Calendar calendar) {
        int newMonthDisplayed;
        newMonthDisplayed = calendar.get(Calendar.MONTH);
        {
            mCurrentMonthDisplayed = newMonthDisplayed;
            mAdapter.setFocusMonth(mCurrentMonthDisplayed);
            int flags;
            flags = DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_MONTH_DAY
                    | DateUtils.FORMAT_SHOW_YEAR;
            long millis;
            millis = calendar.getTimeInMillis();
            String newMonthName;
            newMonthName = DateUtils.formatDateRange(mContext, millis, millis, flags);
            mMonthName.setText(newMonthName);
            mMonthName.invalidate();
        } //End block
        addTaint(calendar.getTaint());
        // ---------- Original Method ----------
        //final int newMonthDisplayed = calendar.get(Calendar.MONTH);
        //if (mCurrentMonthDisplayed != newMonthDisplayed) {
            //mCurrentMonthDisplayed = newMonthDisplayed;
            //mAdapter.setFocusMonth(mCurrentMonthDisplayed);
            //final int flags = DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NO_MONTH_DAY
                    //| DateUtils.FORMAT_SHOW_YEAR;
            //final long millis = calendar.getTimeInMillis();
            //String newMonthName = DateUtils.formatDateRange(mContext, millis, millis, flags);
            //mMonthName.setText(newMonthName);
            //mMonthName.invalidate();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.219 -0400", hash_original_method = "025B6CEC43A90DA392B09F9FACE78FF5", hash_generated_method = "28BAFC25B2DFA2ED0F5018242A7BEC35")
    private int getWeeksSinceMinDate(Calendar date) {
        {
            boolean varC241E660552FCC0CC300BD358680B846_1570042631 = (date.before(mMinDate));
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("fromDate: " + mMinDate.getTime()
                    + " does not precede toDate: " + date.getTime());
            } //End block
        } //End collapsed parenthetic
        long endTimeMillis;
        endTimeMillis = date.getTimeInMillis()
                + date.getTimeZone().getOffset(date.getTimeInMillis());
        long startTimeMillis;
        startTimeMillis = mMinDate.getTimeInMillis()
                + mMinDate.getTimeZone().getOffset(mMinDate.getTimeInMillis());
        long dayOffsetMillis;
        dayOffsetMillis = (mMinDate.get(Calendar.DAY_OF_WEEK) - mFirstDayOfWeek)
                * MILLIS_IN_DAY;
        addTaint(date.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_496319141 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_496319141;
        // ---------- Original Method ----------
        //if (date.before(mMinDate)) {
            //throw new IllegalArgumentException("fromDate: " + mMinDate.getTime()
                    //+ " does not precede toDate: " + date.getTime());
        //}
        //long endTimeMillis = date.getTimeInMillis()
                //+ date.getTimeZone().getOffset(date.getTimeInMillis());
        //long startTimeMillis = mMinDate.getTimeInMillis()
                //+ mMinDate.getTimeZone().getOffset(mMinDate.getTimeInMillis());
        //long dayOffsetMillis = (mMinDate.get(Calendar.DAY_OF_WEEK) - mFirstDayOfWeek)
                //* MILLIS_IN_DAY;
        //return (int) ((endTimeMillis - startTimeMillis + dayOffsetMillis) / MILLIS_IN_WEEK);
    }

    
    private class ScrollStateRunnable implements Runnable {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.219 -0400", hash_original_field = "7D6C73188D7990FE5A4B99F8F090B9EA", hash_generated_field = "1F3C2B019CE351B6A3F4C6C3616C5C0E")

        private AbsListView mView;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.219 -0400", hash_original_field = "175471B610D1F5C8823729FE892FAC81", hash_generated_field = "B54F7897F242D86283E88CF300719E2B")

        private int mNewState;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.219 -0400", hash_original_method = "F2F7D55B897550D0A526C19F647B806C", hash_generated_method = "F2F7D55B897550D0A526C19F647B806C")
        public ScrollStateRunnable ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.220 -0400", hash_original_method = "69E5B9D1AE0F98719D28BA5FB866EF08", hash_generated_method = "AD254F241E34912551E41EEB0E981169")
        public void doScrollStateChange(AbsListView view, int scrollState) {
            mView = view;
            mNewState = scrollState;
            removeCallbacks(this);
            postDelayed(this, SCROLL_CHANGE_DELAY);
            // ---------- Original Method ----------
            //mView = view;
            //mNewState = scrollState;
            //removeCallbacks(this);
            //postDelayed(this, SCROLL_CHANGE_DELAY);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.220 -0400", hash_original_method = "62729E70BB0456A375600477CC5D2643", hash_generated_method = "7B86FF88AF2DF2CFC903DFECE82C901D")
        public void run() {
            mCurrentScrollState = mNewState;
            {
                View child;
                child = mView.getChildAt(0);
                int dist;
                dist = child.getBottom() - mListScrollTopOffset;
                {
                    {
                        mView.smoothScrollBy(dist - child.getHeight(), ADJUSTMENT_SCROLL_DURATION);
                    } //End block
                    {
                        mView.smoothScrollBy(dist, ADJUSTMENT_SCROLL_DURATION);
                    } //End block
                } //End block
            } //End block
            mPreviousScrollState = mNewState;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
    }


    
    private class WeeksAdapter extends BaseAdapter implements OnTouchListener {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.220 -0400", hash_original_field = "87C5B793293EF336BDD19BF5E63E4DA8", hash_generated_field = "5BF9B16DA16CA4B8867BE9E962493092")

        private int mSelectedWeek;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.220 -0400", hash_original_field = "EBDAC0BE41D965D60A46156878A6BB30", hash_generated_field = "DA7C2146C29AB67A18FA4519D8BF6725")

        private GestureDetector mGestureDetector;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.221 -0400", hash_original_field = "5E580E0FCD6C56A118A33AEB961A4EFC", hash_generated_field = "F72CF38F2566D6E733620DFADA8D38C7")

        private int mFocusedMonth;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.221 -0400", hash_original_field = "680C00076DF77E826310D3524A5D9353", hash_generated_field = "247172E6B5029A2CE7B4CF519C9FBA96")

        private Calendar mSelectedDate = Calendar.getInstance();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.221 -0400", hash_original_field = "106D976A13769982F741242E3234CDEC", hash_generated_field = "740B29A5145E76BF427504A23D8A9471")

        private int mTotalWeekCount;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.235 -0400", hash_original_method = "A5340406393612546D90AF6654589F05", hash_generated_method = "03E63CB5027271FD7D9FD5A1CCD21357")
        public  WeeksAdapter(Context context) {
            mContext = context;
            mGestureDetector = new GestureDetector(mContext, new CalendarGestureListener());
            init();
            addTaint(context.getTaint());
            // ---------- Original Method ----------
            //mContext = context;
            //mGestureDetector = new GestureDetector(mContext, new CalendarGestureListener());
            //init();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.235 -0400", hash_original_method = "155544AF4C95F51C95BCC140A715A96B", hash_generated_method = "8B38B88041B5A90703400BCF698C3F4C")
        private void init() {
            mSelectedWeek = getWeeksSinceMinDate(mSelectedDate);
            mTotalWeekCount = getWeeksSinceMinDate(mMaxDate);
            {
                boolean varDAA403C0FA949103F0ECF6EFDF5EE393_1394738349 = (mMinDate.get(Calendar.DAY_OF_WEEK) != mFirstDayOfWeek
                || mMaxDate.get(Calendar.DAY_OF_WEEK) != mFirstDayOfWeek);
            } //End collapsed parenthetic
            // ---------- Original Method ----------
            //mSelectedWeek = getWeeksSinceMinDate(mSelectedDate);
            //mTotalWeekCount = getWeeksSinceMinDate(mMaxDate);
            //if (mMinDate.get(Calendar.DAY_OF_WEEK) != mFirstDayOfWeek
                //|| mMaxDate.get(Calendar.DAY_OF_WEEK) != mFirstDayOfWeek) {
                //mTotalWeekCount++;
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.248 -0400", hash_original_method = "D3DE83E2185E4ADE498D767CEB2FBE21", hash_generated_method = "518B688058A058389E4512B113912EE0")
        public void setSelectedDay(Calendar selectedDay) {
            {
                boolean varCD7956ABABC4DE892AEFB296DF0E8383_1272248554 = (selectedDay.get(Calendar.DAY_OF_YEAR) == mSelectedDate.get(Calendar.DAY_OF_YEAR)
                    && selectedDay.get(Calendar.YEAR) == mSelectedDate.get(Calendar.YEAR));
            } //End collapsed parenthetic
            mSelectedDate.setTimeInMillis(selectedDay.getTimeInMillis());
            mSelectedWeek = getWeeksSinceMinDate(mSelectedDate);
            mFocusedMonth = mSelectedDate.get(Calendar.MONTH);
            notifyDataSetChanged();
            addTaint(selectedDay.getTaint());
            // ---------- Original Method ----------
            //if (selectedDay.get(Calendar.DAY_OF_YEAR) == mSelectedDate.get(Calendar.DAY_OF_YEAR)
                    //&& selectedDay.get(Calendar.YEAR) == mSelectedDate.get(Calendar.YEAR)) {
                //return;
            //}
            //mSelectedDate.setTimeInMillis(selectedDay.getTimeInMillis());
            //mSelectedWeek = getWeeksSinceMinDate(mSelectedDate);
            //mFocusedMonth = mSelectedDate.get(Calendar.MONTH);
            //notifyDataSetChanged();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.249 -0400", hash_original_method = "B5E95894B654555C190BA20C07877305", hash_generated_method = "069950B1BC36A1261258F2EA535EF28E")
        public Calendar getSelectedDay() {
            Calendar varB4EAC82CA7396A68D541C85D26508E83_679845738 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_679845738 = mSelectedDate;
            varB4EAC82CA7396A68D541C85D26508E83_679845738.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_679845738;
            // ---------- Original Method ----------
            //return mSelectedDate;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.249 -0400", hash_original_method = "F04F5B9FBE7B2AAA41BE9F0558597E2D", hash_generated_method = "BBDAB0960CBD197E48D35B23FD6782DE")
        @Override
        public int getCount() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1611395192 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1611395192;
            // ---------- Original Method ----------
            //return mTotalWeekCount;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.250 -0400", hash_original_method = "AE0D3BF5CEF608E0D2B9C47624E8B8EC", hash_generated_method = "54D274D5E1FB0AE478F12E0A950B7A98")
        @Override
        public Object getItem(int position) {
            Object varB4EAC82CA7396A68D541C85D26508E83_495390850 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_495390850 = null;
            addTaint(position);
            varB4EAC82CA7396A68D541C85D26508E83_495390850.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_495390850;
            // ---------- Original Method ----------
            //return null;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.250 -0400", hash_original_method = "7144EF990F660E75AA61001CF21A1CD5", hash_generated_method = "8C63984ACAB321513CE53D8E2CAEC84F")
        @Override
        public long getItemId(int position) {
            addTaint(position);
            long var0F5264038205EDFB1AC05FBB0E8C5E94_1027660622 = getTaintLong();
            return var0F5264038205EDFB1AC05FBB0E8C5E94_1027660622;
            // ---------- Original Method ----------
            //return position;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.257 -0400", hash_original_method = "381E4A6A7165FC308D77C676467DC158", hash_generated_method = "0B078ACD8681A79333928BEEF964CDCB")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View varB4EAC82CA7396A68D541C85D26508E83_1779804262 = null; //Variable for return #1
            WeekView weekView;
            weekView = null;
            {
                weekView = (WeekView) convertView;
            } //End block
            {
                weekView = new WeekView(mContext);
                android.widget.AbsListView.LayoutParams params;
                params = new android.widget.AbsListView.LayoutParams(LayoutParams.WRAP_CONTENT,
                            LayoutParams.WRAP_CONTENT);
                weekView.setLayoutParams(params);
                weekView.setClickable(true);
                weekView.setOnTouchListener(this);
            } //End block
            int selectedWeekDay;
            selectedWeekDay = mSelectedDate.get(
                    Calendar.DAY_OF_WEEK);
            selectedWeekDay = -1;
            weekView.init(position, selectedWeekDay, mFocusedMonth);
            varB4EAC82CA7396A68D541C85D26508E83_1779804262 = weekView;
            addTaint(position);
            addTaint(convertView.getTaint());
            addTaint(parent.getTaint());
            varB4EAC82CA7396A68D541C85D26508E83_1779804262.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1779804262;
            // ---------- Original Method ----------
            //WeekView weekView = null;
            //if (convertView != null) {
                //weekView = (WeekView) convertView;
            //} else {
                //weekView = new WeekView(mContext);
                //android.widget.AbsListView.LayoutParams params =
                    //new android.widget.AbsListView.LayoutParams(LayoutParams.WRAP_CONTENT,
                            //LayoutParams.WRAP_CONTENT);
                //weekView.setLayoutParams(params);
                //weekView.setClickable(true);
                //weekView.setOnTouchListener(this);
            //}
            //int selectedWeekDay = (mSelectedWeek == position) ? mSelectedDate.get(
                    //Calendar.DAY_OF_WEEK) : -1;
            //weekView.init(position, selectedWeekDay, mFocusedMonth);
            //return weekView;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.257 -0400", hash_original_method = "3E18205C8C59D0D94EAE40666647C4EA", hash_generated_method = "434605172BF3E3A0F138AD8D83F03EA5")
        public void setFocusMonth(int month) {
            mFocusedMonth = month;
            notifyDataSetChanged();
            // ---------- Original Method ----------
            //if (mFocusedMonth == month) {
                //return;
            //}
            //mFocusedMonth = month;
            //notifyDataSetChanged();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.276 -0400", hash_original_method = "0A87811DE71587238059DB215F3C12EA", hash_generated_method = "24BF996B7225C63D75485DD34A091E66")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            {
                boolean var277EB5C98A687F20CD30DB195A6907DC_589454146 = (mListView.isEnabled() && mGestureDetector.onTouchEvent(event));
                {
                    WeekView weekView;
                    weekView = (WeekView) v;
                    {
                        boolean varE873966111B65757788D695912C81706_337069264 = (!weekView.getDayFromLocation(event.getX(), mTempDate));
                    } //End collapsed parenthetic
                    {
                        boolean var06D364B3EF750849619343EA8C49C6D6_1426963102 = (mTempDate.before(mMinDate) || mTempDate.after(mMaxDate));
                    } //End collapsed parenthetic
                    onDateTapped(mTempDate);
                } //End block
            } //End collapsed parenthetic
            addTaint(v.getTaint());
            addTaint(event.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_115880312 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_115880312;
            // ---------- Original Method ----------
            //if (mListView.isEnabled() && mGestureDetector.onTouchEvent(event)) {
                //WeekView weekView = (WeekView) v;
                //if (!weekView.getDayFromLocation(event.getX(), mTempDate)) {
                    //return true;
                //}
                //if (mTempDate.before(mMinDate) || mTempDate.after(mMaxDate)) {
                    //return true;
                //}
                //onDateTapped(mTempDate);
                //return true;
            //}
            //return false;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_method = "DDBBBC0FCC832A9812721416C01B8F28", hash_generated_method = "AFCD6817757B5FE70C709BF8CB234C0B")
        private void onDateTapped(Calendar day) {
            setSelectedDay(day);
            setMonthDisplayed(day);
            addTaint(day.getTaint());
            // ---------- Original Method ----------
            //setSelectedDay(day);
            //setMonthDisplayed(day);
        }

        
        class CalendarGestureListener extends GestureDetector.SimpleOnGestureListener {
            
            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_method = "CB9AB034B294CB4BEC33AF8713B8812C", hash_generated_method = "CB9AB034B294CB4BEC33AF8713B8812C")
            public CalendarGestureListener ()
            {
                //Synthesized constructor
            }


            @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_method = "685EB340645172BC9B4FCDA0078720CA", hash_generated_method = "191C05F25141107D8AFB83E6D218CBC8")
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                //DSFIXME:  CODE0009: Possible callback target function detected
                addTaint(e.getTaint());
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1273502783 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_1273502783;
                // ---------- Original Method ----------
                //return true;
            }

            
        }


        
    }


    
    private class WeekView extends View {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_field = "DF43B278CEE8933271AB3D9F9E312F86", hash_generated_field = "AFFA54D19F07A10EE8847CF76FC95323")

        private Rect mTempRect = new Rect();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_field = "394BE8F49DD1F8686145CEDF6D7D200A", hash_generated_field = "B67DB790B5F2FD503EBAAC882DFF65D2")

        private Paint mDrawPaint = new Paint();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_field = "4A4ADF952F5968BAED427F046CBF37FE", hash_generated_field = "E912B980C3787ACB8917161FE447D6F6")

        private Paint mMonthNumDrawPaint = new Paint();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_field = "22DBF63C8E4F821B54530537F76A52B6", hash_generated_field = "78D1BFA8C5AB20E3FA796AF37BFF531E")

        private String[] mDayNumbers;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.277 -0400", hash_original_field = "18DE4256C2B0C53BE2F29B6D186CFFFF", hash_generated_field = "952CF69DC05C27C042F9A535F18EABAA")

        private boolean[] mFocusDay;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "87F6D1BA22A6EC13E132AB98FEAFF205", hash_generated_field = "BA0F23DA4A4FAB8F0FD3B66F58517BD2")

        private Calendar mFirstDay;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "AB7C22B117CDEEA55E65036752634736", hash_generated_field = "FB82DB14926CC1AA0BF7C4500B4879E0")

        private int mMonthOfFirstWeekDay = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "C86E3487156BCCE50E31F5EEA81618EF", hash_generated_field = "2E4EA70A3DFCC5BD9972525121790DF9")

        private int mLastWeekDayMonth = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "C307A3447C42A7BC6C7C6B5030BB815C", hash_generated_field = "90778EE1CDF324DB4B5F442558960D7A")

        private int mWeek = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "A3DB1626A190732E588FD0D14FC8FB31", hash_generated_field = "380984B6D3BA888BD05804A5D24041AE")

        private int mWidth;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "483542B05A951AA16D89C7F809C20811", hash_generated_field = "9A13F430E09A05B31C551CE62B9A37C1")

        private int mHeight;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "90BDD061BFE910EE6291BC190F64210C", hash_generated_field = "F079C68689F59A1F17CEAEF7A0E64F7E")

        private boolean mHasSelectedDay = false;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "9287FCC60987F8DA299E360E30656177", hash_generated_field = "473DF409EEE7296C165945C249CB7F25")

        private int mSelectedDay = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "58EED62B2D852E87C04DA2E6A0365DCE", hash_generated_field = "84AEAB75604C7FBC0916DC2DDFA2924F")

        private int mNumCells;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "AA5E13FFEAC37665A0A31B62B2F782FE", hash_generated_field = "4298CFE393B84E2395510D4EDDD01514")

        private int mSelectedLeft = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_field = "1D3EADA04AEB61A86356B94F32DC8646", hash_generated_field = "47DB8CDE061685EA777E17F9CDE00FAF")

        private int mSelectedRight = -1;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.278 -0400", hash_original_method = "FA7001D4C667668E5D1235594C9A8E32", hash_generated_method = "DC92DD162E494359C77A1EA2B4FA82D5")
        public  WeekView(Context context) {
            super(context);
            mHeight = (mListView.getHeight() - mListView.getPaddingTop() - mListView
                    .getPaddingBottom()) / mShownWeekCount;
            setPaintProperties();
            addTaint(context.getTaint());
            // ---------- Original Method ----------
            //mHeight = (mListView.getHeight() - mListView.getPaddingTop() - mListView
                    //.getPaddingBottom()) / mShownWeekCount;
            //setPaintProperties();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.295 -0400", hash_original_method = "27089ACBC4590C27BA2DDE1963872C77", hash_generated_method = "A54D97104142A274925F165393A365E7")
        public void init(int weekNumber, int selectedWeekDay, int focusedMonth) {
            mSelectedDay = selectedWeekDay;
            mHasSelectedDay = mSelectedDay != -1;
            mNumCells = mShowWeekNumber ? mDaysPerWeek + 1 : mDaysPerWeek;
            mWeek = weekNumber;
            mTempDate.setTimeInMillis(mMinDate.getTimeInMillis());
            mTempDate.add(Calendar.WEEK_OF_YEAR, mWeek);
            mTempDate.setFirstDayOfWeek(mFirstDayOfWeek);
            mDayNumbers = new String[mNumCells];
            mFocusDay = new boolean[mNumCells];
            int i;
            i = 0;
            {
                mDayNumbers[0] = Integer.toString(mTempDate.get(Calendar.WEEK_OF_YEAR));
            } //End block
            int diff;
            diff = mFirstDayOfWeek - mTempDate.get(Calendar.DAY_OF_WEEK);
            mTempDate.add(Calendar.DAY_OF_MONTH, diff);
            mFirstDay = (Calendar) mTempDate.clone();
            mMonthOfFirstWeekDay = mTempDate.get(Calendar.MONTH);
            {
                mFocusDay[i] = (mTempDate.get(Calendar.MONTH) == focusedMonth);
                {
                    boolean varA4C78B059CEDEB9FC682C10660E5AFEC_1019387771 = (mTempDate.before(mMinDate) || mTempDate.after(mMaxDate));
                    {
                        mDayNumbers[i] = "";
                    } //End block
                    {
                        mDayNumbers[i] = Integer.toString(mTempDate.get(Calendar.DAY_OF_MONTH));
                    } //End block
                } //End collapsed parenthetic
                mTempDate.add(Calendar.DAY_OF_MONTH, 1);
            } //End block
            {
                boolean varB636F6DD6694AE5DF7206E7A350EAAF0_590109979 = (mTempDate.get(Calendar.DAY_OF_MONTH) == 1);
                {
                    mTempDate.add(Calendar.DAY_OF_MONTH, -1);
                } //End block
            } //End collapsed parenthetic
            mLastWeekDayMonth = mTempDate.get(Calendar.MONTH);
            updateSelectionPositions();
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.296 -0400", hash_original_method = "FEF07EDEB83DCD7D850BA0B7A04A7856", hash_generated_method = "0EDF79AFD422A561AEFB941B8564204D")
        private void setPaintProperties() {
            mDrawPaint.setFakeBoldText(false);
            mDrawPaint.setAntiAlias(true);
            mDrawPaint.setTextSize(mDateTextSize);
            mDrawPaint.setStyle(Style.FILL);
            mMonthNumDrawPaint.setFakeBoldText(true);
            mMonthNumDrawPaint.setAntiAlias(true);
            mMonthNumDrawPaint.setTextSize(mDateTextSize);
            mMonthNumDrawPaint.setColor(mFocusedMonthDateColor);
            mMonthNumDrawPaint.setStyle(Style.FILL);
            mMonthNumDrawPaint.setTextAlign(Align.CENTER);
            // ---------- Original Method ----------
            //mDrawPaint.setFakeBoldText(false);
            //mDrawPaint.setAntiAlias(true);
            //mDrawPaint.setTextSize(mDateTextSize);
            //mDrawPaint.setStyle(Style.FILL);
            //mMonthNumDrawPaint.setFakeBoldText(true);
            //mMonthNumDrawPaint.setAntiAlias(true);
            //mMonthNumDrawPaint.setTextSize(mDateTextSize);
            //mMonthNumDrawPaint.setColor(mFocusedMonthDateColor);
            //mMonthNumDrawPaint.setStyle(Style.FILL);
            //mMonthNumDrawPaint.setTextAlign(Align.CENTER);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.296 -0400", hash_original_method = "132ACA3161A5E95F30BDE89FA7E699D9", hash_generated_method = "082756074A7BDBD08843DDBA20FE0CA7")
        public int getMonthOfFirstWeekDay() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_30905728 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_30905728;
            // ---------- Original Method ----------
            //return mMonthOfFirstWeekDay;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.297 -0400", hash_original_method = "CD3B8D9B4D0AF03A28010706DE17FBAB", hash_generated_method = "77E09AFAB56C07B6D1A55A5E3304D242")
        public int getMonthOfLastWeekDay() {
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1989085585 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1989085585;
            // ---------- Original Method ----------
            //return mLastWeekDayMonth;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.316 -0400", hash_original_method = "58CF666CFDF77BB5B426C92097C0AA79", hash_generated_method = "DA3DC3C558FC5B5257F577E0AAF2AE88")
        public Calendar getFirstDay() {
            Calendar varB4EAC82CA7396A68D541C85D26508E83_1812668725 = null; //Variable for return #1
            varB4EAC82CA7396A68D541C85D26508E83_1812668725 = mFirstDay;
            varB4EAC82CA7396A68D541C85D26508E83_1812668725.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1812668725;
            // ---------- Original Method ----------
            //return mFirstDay;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.317 -0400", hash_original_method = "967438ECCB56B80859C1A92A3366B466", hash_generated_method = "47CC614B98A109384FA5F5852E699D5E")
        public boolean getDayFromLocation(float x, Calendar outCalendar) {
            int dayStart;
            dayStart = mWidth / mNumCells;
            dayStart = 0;
            {
                outCalendar.clear();
            } //End block
            int dayPosition;
            dayPosition = (int) ((x - dayStart) * mDaysPerWeek
                    / (mWidth - dayStart));
            outCalendar.setTimeInMillis(mFirstDay.getTimeInMillis());
            outCalendar.add(Calendar.DAY_OF_MONTH, dayPosition);
            addTaint(x);
            addTaint(outCalendar.getTaint());
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_542321672 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_542321672;
            // ---------- Original Method ----------
            //int dayStart = mShowWeekNumber ? mWidth / mNumCells : 0;
            //if (x < dayStart || x > mWidth) {
                //outCalendar.clear();
                //return false;
            //}
            //int dayPosition = (int) ((x - dayStart) * mDaysPerWeek
                    /// (mWidth - dayStart));
            //outCalendar.setTimeInMillis(mFirstDay.getTimeInMillis());
            //outCalendar.add(Calendar.DAY_OF_MONTH, dayPosition);
            //return true;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.317 -0400", hash_original_method = "2CF8C160EAF6EF1682AC691B4F4CBC56", hash_generated_method = "43DD5C7F82CC8E31B77ADF7E1E8655F4")
        @Override
        protected void onDraw(Canvas canvas) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            drawBackground(canvas);
            drawWeekNumbers(canvas);
            drawWeekSeparators(canvas);
            drawSelectedDateVerticalBars(canvas);
            addTaint(canvas.getTaint());
            // ---------- Original Method ----------
            //drawBackground(canvas);
            //drawWeekNumbers(canvas);
            //drawWeekSeparators(canvas);
            //drawSelectedDateVerticalBars(canvas);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.319 -0400", hash_original_method = "86B2559C98404D7EBD9D2D1A57D5B7B9", hash_generated_method = "EC9EE7FC0B6B1427101D53071CB4FDAE")
        private void drawBackground(Canvas canvas) {
            mDrawPaint.setColor(mSelectedWeekBackgroundColor);
            mTempRect.top = mWeekSeperatorLineWidth;
            mTempRect.bottom = mHeight;
            mTempRect.left = mShowWeekNumber ? mWidth / mNumCells : 0;
            mTempRect.right = mSelectedLeft - 2;
            canvas.drawRect(mTempRect, mDrawPaint);
            mTempRect.left = mSelectedRight + 3;
            mTempRect.right = mWidth;
            canvas.drawRect(mTempRect, mDrawPaint);
            addTaint(canvas.getTaint());
            // ---------- Original Method ----------
            //if (!mHasSelectedDay) {
                //return;
            //}
            //mDrawPaint.setColor(mSelectedWeekBackgroundColor);
            //mTempRect.top = mWeekSeperatorLineWidth;
            //mTempRect.bottom = mHeight;
            //mTempRect.left = mShowWeekNumber ? mWidth / mNumCells : 0;
            //mTempRect.right = mSelectedLeft - 2;
            //canvas.drawRect(mTempRect, mDrawPaint);
            //mTempRect.left = mSelectedRight + 3;
            //mTempRect.right = mWidth;
            //canvas.drawRect(mTempRect, mDrawPaint);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.320 -0400", hash_original_method = "D3ED4C16A7F0A5B2E5F9E818EC82B4AE", hash_generated_method = "48F010CDB6DE5B612FFBFCA3E272CFB0")
        private void drawWeekNumbers(Canvas canvas) {
            float textHeight;
            textHeight = mDrawPaint.getTextSize();
            int y;
            y = (int) ((mHeight + textHeight) / 2) - mWeekSeperatorLineWidth;
            int nDays;
            nDays = mNumCells;
            mDrawPaint.setTextAlign(Align.CENTER);
            int i;
            i = 0;
            int divisor;
            divisor = 2 * nDays;
            {
                mDrawPaint.setColor(mWeekNumberColor);
                int x;
                x = mWidth / divisor;
                canvas.drawText(mDayNumbers[0], x, y, mDrawPaint);
            } //End block
            {
                mMonthNumDrawPaint.setColor(mFocusDay[i] ? mFocusedMonthDateColor
                        : mUnfocusedMonthDateColor);
                int x;
                x = (2 * i + 1) * mWidth / divisor;
                canvas.drawText(mDayNumbers[i], x, y, mMonthNumDrawPaint);
            } //End block
            addTaint(canvas.getTaint());
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.340 -0400", hash_original_method = "D028062BEA4F3ED75274534BCA9F109C", hash_generated_method = "1844CEDD3538B94FA4D726EE770BBA2E")
        private void drawWeekSeparators(Canvas canvas) {
            int firstFullyVisiblePosition;
            firstFullyVisiblePosition = mListView.getFirstVisiblePosition();
            {
                boolean varBD978972D5D723FA8E099F9CC95E4825_151771314 = (mListView.getChildAt(0).getTop() < 0);
            } //End collapsed parenthetic
            mDrawPaint.setColor(mWeekSeparatorLineColor);
            mDrawPaint.setStrokeWidth(mWeekSeperatorLineWidth);
            float x;
            x = mWidth / mNumCells;
            x = 0;
            canvas.drawLine(x, 0, mWidth, 0, mDrawPaint);
            addTaint(canvas.getTaint());
            // ---------- Original Method ----------
            //int firstFullyVisiblePosition = mListView.getFirstVisiblePosition();
            //if (mListView.getChildAt(0).getTop() < 0) {
                //firstFullyVisiblePosition++;
            //}
            //if (firstFullyVisiblePosition == mWeek) {
                //return;
            //}
            //mDrawPaint.setColor(mWeekSeparatorLineColor);
            //mDrawPaint.setStrokeWidth(mWeekSeperatorLineWidth);
            //float x = mShowWeekNumber ? mWidth / mNumCells : 0;
            //canvas.drawLine(x, 0, mWidth, 0, mDrawPaint);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.341 -0400", hash_original_method = "A1C98C2320B89AC1B0E9DE7623F0F5E4", hash_generated_method = "D36D39D991EC6874FB1179ABEB60CC32")
        private void drawSelectedDateVerticalBars(Canvas canvas) {
            mSelectedDateVerticalBar.setBounds(mSelectedLeft - mSelectedDateVerticalBarWidth / 2,
                    mWeekSeperatorLineWidth,
                    mSelectedLeft + mSelectedDateVerticalBarWidth / 2, mHeight);
            mSelectedDateVerticalBar.draw(canvas);
            mSelectedDateVerticalBar.setBounds(mSelectedRight - mSelectedDateVerticalBarWidth / 2,
                    mWeekSeperatorLineWidth,
                    mSelectedRight + mSelectedDateVerticalBarWidth / 2, mHeight);
            mSelectedDateVerticalBar.draw(canvas);
            addTaint(canvas.getTaint());
            // ---------- Original Method ----------
            //if (!mHasSelectedDay) {
                //return;
            //}
            //mSelectedDateVerticalBar.setBounds(mSelectedLeft - mSelectedDateVerticalBarWidth / 2,
                    //mWeekSeperatorLineWidth,
                    //mSelectedLeft + mSelectedDateVerticalBarWidth / 2, mHeight);
            //mSelectedDateVerticalBar.draw(canvas);
            //mSelectedDateVerticalBar.setBounds(mSelectedRight - mSelectedDateVerticalBarWidth / 2,
                    //mWeekSeperatorLineWidth,
                    //mSelectedRight + mSelectedDateVerticalBarWidth / 2, mHeight);
            //mSelectedDateVerticalBar.draw(canvas);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.342 -0400", hash_original_method = "07B6C7DD90A0E1B5FAECCFBA1208B086", hash_generated_method = "1972DAE3BCDF252B5E7725991B95831C")
        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            mWidth = w;
            updateSelectionPositions();
            addTaint(h);
            addTaint(oldw);
            addTaint(oldh);
            // ---------- Original Method ----------
            //mWidth = w;
            //updateSelectionPositions();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.342 -0400", hash_original_method = "F4AE55BB3F9C613E7E5A646F02C33791", hash_generated_method = "A1C1EACB3C15FEE5BBBF9560CC9CBA4F")
        private void updateSelectionPositions() {
            {
                int selectedPosition;
                selectedPosition = mSelectedDay - mFirstDayOfWeek;
                {
                    selectedPosition += 7;
                } //End block
                mSelectedLeft = selectedPosition * mWidth / mNumCells;
                mSelectedRight = (selectedPosition + 1) * mWidth / mNumCells;
            } //End block
            // ---------- Original Method ----------
            //if (mHasSelectedDay) {
                //int selectedPosition = mSelectedDay - mFirstDayOfWeek;
                //if (selectedPosition < 0) {
                    //selectedPosition += 7;
                //}
                //if (mShowWeekNumber) {
                    //selectedPosition++;
                //}
                //mSelectedLeft = selectedPosition * mWidth / mNumCells;
                //mSelectedRight = (selectedPosition + 1) * mWidth / mNumCells;
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_method = "F89A4F4FAB6DC416DC0DD7077DC69E1C", hash_generated_method = "B106B2333717447AF45A115BEFE82AB6")
        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), mHeight);
            addTaint(widthMeasureSpec);
            addTaint(heightMeasureSpec);
            // ---------- Original Method ----------
            //setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), mHeight);
        }

        
    }


    
    public interface OnDateChangeListener {

        
        public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "9D3BCF7D4519E93E9628DBE4424A7368", hash_generated_field = "A61B5034C53CA702090DCC4A413375EA")

    private static String LOG_TAG = CalendarView.class.getSimpleName();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "AFDA9FAB15D7C033010EBA67D4668032", hash_generated_field = "256D54A3B380C1EDA5C95633A77478F6")

    private static boolean DEFAULT_SHOW_WEEK_NUMBER = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "75B2168E67F32942A7660EE332C31135", hash_generated_field = "6228BE8ADE9B15B163C0DC1A233E70A1")

    private static long MILLIS_IN_DAY = 86400000L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "E73E3F6BACE835190EB51D4284D4F12F", hash_generated_field = "DB2A4D4017073B3D65A5E8F4D02E5168")

    private static int DAYS_PER_WEEK = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "3E4652C159428BF86522F98B26713746", hash_generated_field = "015FDD6F2BE1746481A0366EC36F1A7B")

    private static long MILLIS_IN_WEEK = DAYS_PER_WEEK * MILLIS_IN_DAY;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "4B2AC5C58D3448E41283380DF77299BB", hash_generated_field = "3DDFB49539A85262BA2ECF42F1E0D57A")

    private static int SCROLL_HYST_WEEKS = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "D8263D549687B4628B92BAE2BB05D39D", hash_generated_field = "218DC53C825A29CD72E8E024B83E74D4")

    private static int GOTO_SCROLL_DURATION = 1000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "65291FF078235139EB25043B4C411CA6", hash_generated_field = "6D412ACBC8B0A2009FE2372CA8D4817A")

    private static int ADJUSTMENT_SCROLL_DURATION = 500;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "9126C0F569F8BFC4BBF915A9A40A38A4", hash_generated_field = "DF3515098EAF9982A1B698AC9E455C53")

    private static int SCROLL_CHANGE_DELAY = 40;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "7D0AA228503FFF788A6CED655322E089", hash_generated_field = "1B81C4DDEAD135AB37016062483E4CB7")

    private static String DATE_FORMAT = "MM/dd/yyyy";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "4F04DCD0A895B76C4E10897110A5FF1F", hash_generated_field = "40BFFB645275251FD2BED2C95A5C8FDB")

    private static String DEFAULT_MIN_DATE = "01/01/1900";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.343 -0400", hash_original_field = "74FBF6AD55305F912C4747F0851D9160", hash_generated_field = "379A00B052F7698C6A3B79DB65EBE294")

    private static String DEFAULT_MAX_DATE = "01/01/2100";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "DC5440C1DB9B69DE0E7FBAEBBF35CE8A", hash_generated_field = "D97E7DC4B21BD1965121E457B878439D")

    private static int DEFAULT_SHOWN_WEEK_COUNT = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "08F8397780669F0148C5F4E72CD58D16", hash_generated_field = "4B9E08EEBEE7558C3D489A99B0974133")

    private static int DEFAULT_DATE_TEXT_SIZE = 14;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "181CB101E5C05308B5D55B88B0936114", hash_generated_field = "0AC5D5D599512646149F3BB99D8114F4")

    private static int UNSCALED_SELECTED_DATE_VERTICAL_BAR_WIDTH = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "E2F5CCF7BD4DCAA6357FE33CE58250D9", hash_generated_field = "E8D069EFDEF53547098B4C652EBC73C8")

    private static int UNSCALED_WEEK_MIN_VISIBLE_HEIGHT = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "1D6B554C3C6BCE4E3706D02C1803AE0D", hash_generated_field = "1A65A7FCDD336830177296C182EF6494")

    private static int UNSCALED_LIST_SCROLL_TOP_OFFSET = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "D78F4B563158048112FA3DDCAA2E7A0A", hash_generated_field = "E1A9EB9844CDFC5033AF1D9413C6CEFB")

    private static int UNSCALED_BOTTOM_BUFFER = 20;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "DB767308D105578E5E82E56B7F0DC432", hash_generated_field = "441167A0780EF9812705977B4CC2CD7E")

    private static int UNSCALED_WEEK_SEPARATOR_LINE_WIDTH = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:05.344 -0400", hash_original_field = "D5F646191AC5848A917A9A89EEED7A43", hash_generated_field = "8035865128EF9AC14E2BBB65318DC6B6")

    private static int DEFAULT_WEEK_DAY_TEXT_APPEARANCE_RES_ID = -1;
}

