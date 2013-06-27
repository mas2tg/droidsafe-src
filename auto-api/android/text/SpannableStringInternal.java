package android.text;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import com.android.internal.util.ArrayUtils;
import java.lang.reflect.Array;

abstract class SpannableStringInternal {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.365 -0400", hash_original_field = "39624508B9E3028D8A5DDA741D3E3DDE", hash_generated_field = "2EBA23F479A3FA4159B4CC40D57E4F25")

    private String mText;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.365 -0400", hash_original_field = "B8BD6FDCBEDAFD097A52EBBE1CF0F79A", hash_generated_field = "64DC9467A0917D43133A286556BA813F")

    private Object[] mSpans;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.365 -0400", hash_original_field = "39084B7BB41D0E9E280EBBE232CDF089", hash_generated_field = "938E92621B3F4547B2C3C20B887698D5")

    private int[] mSpanData;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.365 -0400", hash_original_field = "4FDCC29E70C8591103A1AD2BB2AC7494", hash_generated_field = "BDC8CC3C9B276345952883B6B6FC3B62")

    private int mSpanCount;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.367 -0400", hash_original_method = "6B8C85BD24C5FB6AAF3EB88754652005", hash_generated_method = "8D540CA76936C4D4B0311B590D748605")
      SpannableStringInternal(CharSequence source,
                                          int start, int end) {
        {
            boolean var4E1087633C042E83FE4F92861C5B2DA8_473329272 = (start == 0 && end == source.length());
            mText = source.toString();
            mText = source.toString().substring(start, end);
        } //End collapsed parenthetic
        int initial;
        initial = ArrayUtils.idealIntArraySize(0);
        mSpans = new Object[initial];
        mSpanData = new int[initial * 3];
        {
            Spanned sp;
            sp = (Spanned) source;
            Object[] spans;
            spans = sp.getSpans(start, end, Object.class);
            {
                int i;
                i = 0;
                {
                    int st;
                    st = sp.getSpanStart(spans[i]);
                    int en;
                    en = sp.getSpanEnd(spans[i]);
                    int fl;
                    fl = sp.getSpanFlags(spans[i]);
                    st = start;
                    en = end;
                    setSpan(spans[i], st - start, en - start, fl);
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.368 -0400", hash_original_method = "9A68249D01A4FE1CBD4D535668FCEB6F", hash_generated_method = "CDE203DBCCA7AC08E682B14BFA84A0F7")
    public final int length() {
        int var32A6F8CD5764B26A2339FAB65BD4098F_177875462 = (mText.length());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_528829972 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_528829972;
        // ---------- Original Method ----------
        //return mText.length();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.385 -0400", hash_original_method = "9584624FC2131094C464C9F194744C46", hash_generated_method = "FE6ED4EE9F0CF9208DD52F8D33EC9AA9")
    public final char charAt(int i) {
        char var2EAE77B7DE41F0E81C3AE4E49B8331B0_1256312380 = (mText.charAt(i));
        addTaint(i);
        char varA87DEB01C5F539E6BDA34829C8EF2368_306694494 = getTaintChar();
        return varA87DEB01C5F539E6BDA34829C8EF2368_306694494;
        // ---------- Original Method ----------
        //return mText.charAt(i);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.385 -0400", hash_original_method = "F8827D354B3A7F2AC0C2613E8BEFB45B", hash_generated_method = "4801AC7A7D94D3FF12E040466535F561")
    public final String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1146623998 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1146623998 = mText;
        varB4EAC82CA7396A68D541C85D26508E83_1146623998.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1146623998;
        // ---------- Original Method ----------
        //return mText;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.386 -0400", hash_original_method = "E3364302A15643D598F9B7C454DC0AA8", hash_generated_method = "8E7A93EE89948F5862C69A9D99BDDD65")
    public final void getChars(int start, int end, char[] dest, int off) {
        mText.getChars(start, end, dest, off);
        addTaint(start);
        addTaint(end);
        addTaint(dest[0]);
        addTaint(off);
        // ---------- Original Method ----------
        //mText.getChars(start, end, dest, off);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.388 -0400", hash_original_method = "7B198AB61B6B726FF2E2996AF3FF95CD", hash_generated_method = "90891D9437F1AAE1FF736EF0B3F6F9BD")
     void setSpan(Object what, int start, int end, int flags) {
        int nstart;
        nstart = start;
        int nend;
        nend = end;
        checkRange("setSpan", start, end);
        {
            {
                boolean var50D67EA6491FC514B6D92D2E40689E61_779869178 = (start != 0 && start != length());
                {
                    char c;
                    c = charAt(start - 1);
                    if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                            "PARAGRAPH span must start at paragraph boundary" +
                            " (" + start + " follows " + c + ")");
                } //End block
            } //End collapsed parenthetic
            {
                boolean var5B6CF9C5E41E159F793AF4E9C33451FF_886220296 = (end != 0 && end != length());
                {
                    char c;
                    c = charAt(end - 1);
                    if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                            "PARAGRAPH span must end at paragraph boundary" +
                            " (" + end + " follows " + c + ")");
                } //End block
            } //End collapsed parenthetic
        } //End block
        int count;
        count = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        {
            int i;
            i = 0;
            {
                {
                    int ostart;
                    ostart = data[i * COLUMNS + START];
                    int oend;
                    oend = data[i * COLUMNS + END];
                    data[i * COLUMNS + START] = start;
                    data[i * COLUMNS + END] = end;
                    data[i * COLUMNS + FLAGS] = flags;
                    sendSpanChanged(what, ostart, oend, nstart, nend);
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            int newsize;
            newsize = ArrayUtils.idealIntArraySize(mSpanCount + 1);
            Object[] newtags;
            newtags = new Object[newsize];
            int[] newdata;
            newdata = new int[newsize * 3];
            System.arraycopy(mSpans, 0, newtags, 0, mSpanCount);
            System.arraycopy(mSpanData, 0, newdata, 0, mSpanCount * 3);
            mSpans = newtags;
            mSpanData = newdata;
        } //End block
        mSpans[mSpanCount] = what;
        mSpanData[mSpanCount * COLUMNS + START] = start;
        mSpanData[mSpanCount * COLUMNS + END] = end;
        mSpanData[mSpanCount * COLUMNS + FLAGS] = flags;
        sendSpanAdded(what, nstart, nend);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.392 -0400", hash_original_method = "03C5B870069E116AF35881F1682BF48B", hash_generated_method = "6F31AFDBE93BBC4E1D53AEBF43004414")
     void removeSpan(Object what) {
        int count;
        count = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        {
            int i;
            i = count - 1;
            {
                {
                    int ostart;
                    ostart = data[i * COLUMNS + START];
                    int oend;
                    oend = data[i * COLUMNS + END];
                    int c;
                    c = count - (i + 1);
                    System.arraycopy(spans, i + 1, spans, i, c);
                    System.arraycopy(data, (i + 1) * COLUMNS,
                                 data, i * COLUMNS, c * COLUMNS);
                    sendSpanRemoved(what, ostart, oend);
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        // ---------- Original Method ----------
        //int count = mSpanCount;
        //Object[] spans = mSpans;
        //int[] data = mSpanData;
        //for (int i = count - 1; i >= 0; i--) {
            //if (spans[i] == what) {
                //int ostart = data[i * COLUMNS + START];
                //int oend = data[i * COLUMNS + END];
                //int c = count - (i + 1);
                //System.arraycopy(spans, i + 1, spans, i, c);
                //System.arraycopy(data, (i + 1) * COLUMNS,
                                 //data, i * COLUMNS, c * COLUMNS);
                //mSpanCount--;
                //sendSpanRemoved(what, ostart, oend);
                //return;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.393 -0400", hash_original_method = "2C34546685C4DD853C66A09CEFBD0C65", hash_generated_method = "86D01E32E3C7D1EDF4E9DF154BE8B5F7")
    public int getSpanStart(Object what) {
        int count;
        count = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        {
            int i;
            i = count - 1;
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_20079536 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_20079536;
        // ---------- Original Method ----------
        //int count = mSpanCount;
        //Object[] spans = mSpans;
        //int[] data = mSpanData;
        //for (int i = count - 1; i >= 0; i--) {
            //if (spans[i] == what) {
                //return data[i * COLUMNS + START];
            //}
        //}
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.409 -0400", hash_original_method = "D299E1841C6A6AC66FA9181AA7F112ED", hash_generated_method = "CF6EA2EBB403008D61C52A2683720987")
    public int getSpanEnd(Object what) {
        int count;
        count = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        {
            int i;
            i = count - 1;
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_4570322 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_4570322;
        // ---------- Original Method ----------
        //int count = mSpanCount;
        //Object[] spans = mSpans;
        //int[] data = mSpanData;
        //for (int i = count - 1; i >= 0; i--) {
            //if (spans[i] == what) {
                //return data[i * COLUMNS + END];
            //}
        //}
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.413 -0400", hash_original_method = "0BC2A6452DDDFB33D1E74093A43A22EC", hash_generated_method = "DBC83D2871219AFE2836B68AB3DD8678")
    public int getSpanFlags(Object what) {
        int count;
        count = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        {
            int i;
            i = count - 1;
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1567448921 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1567448921;
        // ---------- Original Method ----------
        //int count = mSpanCount;
        //Object[] spans = mSpans;
        //int[] data = mSpanData;
        //for (int i = count - 1; i >= 0; i--) {
            //if (spans[i] == what) {
                //return data[i * COLUMNS + FLAGS];
            //}
        //}
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.415 -0400", hash_original_method = "A79E5C3938B902091EA5DB757C342E2D", hash_generated_method = "8782A539F94FCA45154E9161B938DCF4")
    public <T> T[] getSpans(int queryStart, int queryEnd, Class<T> kind) {
        T[] varB4EAC82CA7396A68D541C85D26508E83_1267687486 = null; //Variable for return #1
        T[] varB4EAC82CA7396A68D541C85D26508E83_835534385 = null; //Variable for return #2
        T[] varB4EAC82CA7396A68D541C85D26508E83_21143587 = null; //Variable for return #3
        T[] varB4EAC82CA7396A68D541C85D26508E83_184119585 = null; //Variable for return #4
        int count;
        count = 0;
        int spanCount;
        spanCount = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        Object[] ret;
        ret = null;
        Object ret1;
        ret1 = null;
        {
            int i;
            i = 0;
            {
                {
                    boolean var5A4064A3325AEA774EE2C4EF95F67A65_305370691 = (kind != null && !kind.isInstance(spans[i]));
                } //End collapsed parenthetic
                int spanStart;
                spanStart = data[i * COLUMNS + START];
                int spanEnd;
                spanEnd = data[i * COLUMNS + END];
                {
                    ret1 = spans[i];
                } //End block
                {
                    {
                        ret = (Object[]) Array.newInstance(kind, spanCount - i + 1);
                        ret[0] = ret1;
                    } //End block
                    int prio;
                    prio = data[i * COLUMNS + FLAGS] & Spanned.SPAN_PRIORITY;
                    {
                        int j;
                        {
                            j = 0;
                            {
                                int p;
                                p = getSpanFlags(ret[j]) & Spanned.SPAN_PRIORITY;
                            } //End block
                        } //End collapsed parenthetic
                        System.arraycopy(ret, j, ret, j + 1, count - j);
                        ret[j] = spans[i];
                    } //End block
                    {
                        ret[count++] = spans[i];
                    } //End block
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            varB4EAC82CA7396A68D541C85D26508E83_1267687486 = (T[]) ArrayUtils.emptyArray(kind);
        } //End block
        {
            ret = (Object[]) Array.newInstance(kind, 1);
            ret[0] = ret1;
            varB4EAC82CA7396A68D541C85D26508E83_835534385 = (T[]) ret;
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_21143587 = (T[]) ret;
        } //End block
        Object[] nret;
        nret = (Object[]) Array.newInstance(kind, count);
        System.arraycopy(ret, 0, nret, 0, count);
        varB4EAC82CA7396A68D541C85D26508E83_184119585 = (T[]) nret;
        addTaint(queryStart);
        addTaint(queryEnd);
        addTaint(kind.getTaint());
        T[] varA7E53CE21691AB073D9660D615818899_1132670723; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1132670723 = varB4EAC82CA7396A68D541C85D26508E83_1267687486;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1132670723 = varB4EAC82CA7396A68D541C85D26508E83_835534385;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_1132670723 = varB4EAC82CA7396A68D541C85D26508E83_21143587;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1132670723 = varB4EAC82CA7396A68D541C85D26508E83_184119585;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1132670723.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1132670723;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.425 -0400", hash_original_method = "AE7B5CCE37B25ED0DAD474C110343705", hash_generated_method = "96AE09398ED15B8ACDC0342825D5EFA6")
    public int nextSpanTransition(int start, int limit, Class kind) {
        int count;
        count = mSpanCount;
        Object[] spans;
        spans = mSpans;
        int[] data;
        data = mSpanData;
        {
            kind = Object.class;
        } //End block
        {
            int i;
            i = 0;
            {
                int st;
                st = data[i * COLUMNS + START];
                int en;
                en = data[i * COLUMNS + END];
                {
                    boolean varF6D66FD5D17035475727187422C2B841_925230931 = (st > start && st < limit && kind.isInstance(spans[i]));
                    limit = st;
                } //End collapsed parenthetic
                {
                    boolean varDD4114CCD8FA698F5DA31E38C7560428_791916704 = (en > start && en < limit && kind.isInstance(spans[i]));
                    limit = en;
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(start);
        addTaint(limit);
        addTaint(kind.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_112242383 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_112242383;
        // ---------- Original Method ----------
        //int count = mSpanCount;
        //Object[] spans = mSpans;
        //int[] data = mSpanData;
        //if (kind == null) {
            //kind = Object.class;
        //}
        //for (int i = 0; i < count; i++) {
            //int st = data[i * COLUMNS + START];
            //int en = data[i * COLUMNS + END];
            //if (st > start && st < limit && kind.isInstance(spans[i]))
                //limit = st;
            //if (en > start && en < limit && kind.isInstance(spans[i]))
                //limit = en;
        //}
        //return limit;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.425 -0400", hash_original_method = "AE5753E793A4485018C5FAB8D6A92DBC", hash_generated_method = "13D19EBDBB52769EC7E615E3F4186D8A")
    private void sendSpanAdded(Object what, int start, int end) {
        SpanWatcher[] recip;
        recip = getSpans(start, end, SpanWatcher.class);
        int n;
        n = recip.length;
        {
            int i;
            i = 0;
            {
                recip[i].onSpanAdded((Spannable) this, what, start, end);
            } //End block
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        addTaint(start);
        addTaint(end);
        // ---------- Original Method ----------
        //SpanWatcher[] recip = getSpans(start, end, SpanWatcher.class);
        //int n = recip.length;
        //for (int i = 0; i < n; i++) {
            //recip[i].onSpanAdded((Spannable) this, what, start, end);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.432 -0400", hash_original_method = "60A86A7ABB49125FA35263BF87AB59D6", hash_generated_method = "4C2C1C71CC3C0F260E16EEF6C49C2867")
    private void sendSpanRemoved(Object what, int start, int end) {
        SpanWatcher[] recip;
        recip = getSpans(start, end, SpanWatcher.class);
        int n;
        n = recip.length;
        {
            int i;
            i = 0;
            {
                recip[i].onSpanRemoved((Spannable) this, what, start, end);
            } //End block
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        addTaint(start);
        addTaint(end);
        // ---------- Original Method ----------
        //SpanWatcher[] recip = getSpans(start, end, SpanWatcher.class);
        //int n = recip.length;
        //for (int i = 0; i < n; i++) {
            //recip[i].onSpanRemoved((Spannable) this, what, start, end);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.436 -0400", hash_original_method = "859EF27A1BB05860E7E5EF0EAB661D52", hash_generated_method = "8613154B00B10C893F4E36CC8BCDBBA6")
    private void sendSpanChanged(Object what, int s, int e, int st, int en) {
        SpanWatcher[] recip;
        recip = getSpans(Math.min(s, st), Math.max(e, en),
                                       SpanWatcher.class);
        int n;
        n = recip.length;
        {
            int i;
            i = 0;
            {
                recip[i].onSpanChanged((Spannable) this, what, s, e, st, en);
            } //End block
        } //End collapsed parenthetic
        addTaint(what.getTaint());
        addTaint(s);
        addTaint(e);
        addTaint(st);
        addTaint(en);
        // ---------- Original Method ----------
        //SpanWatcher[] recip = getSpans(Math.min(s, st), Math.max(e, en),
                                       //SpanWatcher.class);
        //int n = recip.length;
        //for (int i = 0; i < n; i++) {
            //recip[i].onSpanChanged((Spannable) this, what, s, e, st, en);
        //}
    }

    
        private static String region(int start, int end) {
        return "(" + start + " ... " + end + ")";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.438 -0400", hash_original_method = "70C480F1BBBBF461E174788F8B29326C", hash_generated_method = "DE1FAF1E68B7B13B5A9C11AC99D9BC5F")
    private void checkRange(final String operation, int start, int end) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IndexOutOfBoundsException(operation + " " +
                                                region(start, end) +
                                                " has end before start");
        } //End block
        int len;
        len = length();
        {
            if (DroidSafeAndroidRuntime.control) throw new IndexOutOfBoundsException(operation + " " +
                                                region(start, end) +
                                                " ends beyond length " + len);
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IndexOutOfBoundsException(operation + " " +
                                                region(start, end) +
                                                " starts before 0");
        } //End block
        addTaint(operation.getTaint());
        addTaint(start);
        addTaint(end);
        // ---------- Original Method ----------
        //if (end < start) {
            //throw new IndexOutOfBoundsException(operation + " " +
                                                //region(start, end) +
                                                //" has end before start");
        //}
        //int len = length();
        //if (start > len || end > len) {
            //throw new IndexOutOfBoundsException(operation + " " +
                                                //region(start, end) +
                                                //" ends beyond length " + len);
        //}
        //if (start < 0 || end < 0) {
            //throw new IndexOutOfBoundsException(operation + " " +
                                                //region(start, end) +
                                                //" starts before 0");
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.453 -0400", hash_original_field = "29B703ACBB9AD25AEF5009A0607792DF", hash_generated_field = "9EAEEAE26814CA588C780F3F6B50729B")

    static Object[] EMPTY = new Object[0];
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.453 -0400", hash_original_field = "28651E175A74BF99AEB0613FFD9E4311", hash_generated_field = "AE5FE26EA7B9C33A397985D690BEF58C")

    private static int START = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.453 -0400", hash_original_field = "94533C6AB91648145477E2B26E6ED259", hash_generated_field = "909B888D0CCF5C944B64280D77406FA4")

    private static int END = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.453 -0400", hash_original_field = "05041C87BF53DA30EC8A62B90D97ED7F", hash_generated_field = "F2521AF553782808A252068D8F78ACC5")

    private static int FLAGS = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:39.453 -0400", hash_original_field = "D8B6305C12C4CA4489AA48A1A8AE97DD", hash_generated_field = "3662BF10738CD0DCC66C8FFED7EADE22")

    private static int COLUMNS = 3;
}

