package android.text.method;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import java.text.BreakIterator;
import java.util.Locale;

public class WordIterator implements Selection.PositionIterator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.310 -0400", hash_original_field = "18E347BCBCDD07E01563671B6BDE7905", hash_generated_field = "C0B8B41E10B6EC8767D645F51D421276")

    private String mString;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.310 -0400", hash_original_field = "AAA1668480E5CC9F624C9ACFAC1E336C", hash_generated_field = "0BBD7CD100EB425800EA2CBA37261EAE")

    private int mOffsetShift;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.310 -0400", hash_original_field = "D0DDF189DBD48BEB487B547FA441AE98", hash_generated_field = "3FDD48BD1B9B72C0290CDC044056432E")

    private BreakIterator mIterator;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.310 -0400", hash_original_method = "AB8CC8AEC36CC88806001A57825CD492", hash_generated_method = "F6A3B701594167B73AD57D2CAA166CCE")
    public  WordIterator() {
        this(Locale.getDefault());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.311 -0400", hash_original_method = "2A66FD73F959B53947CB4E0B8EDD927F", hash_generated_method = "947127AB01A128D57F4F13C6D40967B8")
    public  WordIterator(Locale locale) {
        mIterator = BreakIterator.getWordInstance(locale);
        // ---------- Original Method ----------
        //mIterator = BreakIterator.getWordInstance(locale);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.312 -0400", hash_original_method = "2DDA1ACFC823FC1E605D540F8F620C39", hash_generated_method = "CC5DD6AB4D1BE7CCB7692833410230E5")
    public void setCharSequence(CharSequence charSequence, int start, int end) {
        mOffsetShift = Math.max(0, start - WINDOW_WIDTH);
        int windowEnd;
        windowEnd = Math.min(charSequence.length(), end + WINDOW_WIDTH);
        {
            mString = ((SpannableStringBuilder) charSequence).substring(mOffsetShift, windowEnd);
        } //End block
        {
            mString = charSequence.subSequence(mOffsetShift, windowEnd).toString();
        } //End block
        mIterator.setText(mString);
        addTaint(end);
        // ---------- Original Method ----------
        //mOffsetShift = Math.max(0, start - WINDOW_WIDTH);
        //final int windowEnd = Math.min(charSequence.length(), end + WINDOW_WIDTH);
        //if (charSequence instanceof SpannableStringBuilder) {
            //mString = ((SpannableStringBuilder) charSequence).substring(mOffsetShift, windowEnd);
        //} else {
            //mString = charSequence.subSequence(mOffsetShift, windowEnd).toString();
        //}
        //mIterator.setText(mString);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.312 -0400", hash_original_method = "17B38EF0704190E954BC6997CBD1C0A2", hash_generated_method = "3943DF2C3D21C16C1338F0A2672C8CF0")
    public int preceding(int offset) {
        int shiftedOffset;
        shiftedOffset = offset - mOffsetShift;
        {
            shiftedOffset = mIterator.preceding(shiftedOffset);
            {
                boolean varA0D6CF585DE1570EA7F3E44E7DD22466_1169996128 = (isOnLetterOrDigit(shiftedOffset));
            } //End collapsed parenthetic
        } //End block
        addTaint(offset);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_214773402 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_214773402;
        // ---------- Original Method ----------
        //int shiftedOffset = offset - mOffsetShift;
        //do {
            //shiftedOffset = mIterator.preceding(shiftedOffset);
            //if (shiftedOffset == BreakIterator.DONE) {
                //return BreakIterator.DONE;
            //}
            //if (isOnLetterOrDigit(shiftedOffset)) {
                //return shiftedOffset + mOffsetShift;
            //}
        //} while (true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.313 -0400", hash_original_method = "DA3F9C05695BD8FAB846E8868344998B", hash_generated_method = "EAF980678C22848566801968E255F7FC")
    public int following(int offset) {
        int shiftedOffset;
        shiftedOffset = offset - mOffsetShift;
        {
            shiftedOffset = mIterator.following(shiftedOffset);
            {
                boolean var1A6C2F729F39D012AD39EC3D2AA37043_456063819 = (isAfterLetterOrDigit(shiftedOffset));
            } //End collapsed parenthetic
        } //End block
        addTaint(offset);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_942090556 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_942090556;
        // ---------- Original Method ----------
        //int shiftedOffset = offset - mOffsetShift;
        //do {
            //shiftedOffset = mIterator.following(shiftedOffset);
            //if (shiftedOffset == BreakIterator.DONE) {
                //return BreakIterator.DONE;
            //}
            //if (isAfterLetterOrDigit(shiftedOffset)) {
                //return shiftedOffset + mOffsetShift;
            //}
        //} while (true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.317 -0400", hash_original_method = "0D432F790B6324713F4FDAF5BC7F832D", hash_generated_method = "F1C4E1C762A6EE19EB5F17C952C83164")
    public int getBeginning(int offset) {
        int shiftedOffset;
        shiftedOffset = offset - mOffsetShift;
        checkOffsetIsValid(shiftedOffset);
        {
            boolean var286F63C1A1ACC72F5129580E231B3F19_1691941334 = (isOnLetterOrDigit(shiftedOffset));
            {
                {
                    boolean varB4B4C05081CBE63E902D225AEECF6D8B_1726186128 = (mIterator.isBoundary(shiftedOffset));
                    {
                        int var0A2878D3CBF57DD815ED8A1F32FCD48E_1340066883 = (mIterator.preceding(shiftedOffset) + mOffsetShift);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                {
                    boolean var06ADDEE422599DDFA75CE6C849AE5C97_1829285410 = (isAfterLetterOrDigit(shiftedOffset));
                    {
                        int var0A2878D3CBF57DD815ED8A1F32FCD48E_1618075553 = (mIterator.preceding(shiftedOffset) + mOffsetShift);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(offset);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_935819333 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_935819333;
        // ---------- Original Method ----------
        //final int shiftedOffset = offset - mOffsetShift;
        //checkOffsetIsValid(shiftedOffset);
        //if (isOnLetterOrDigit(shiftedOffset)) {
            //if (mIterator.isBoundary(shiftedOffset)) {
                //return shiftedOffset + mOffsetShift;
            //} else {
                //return mIterator.preceding(shiftedOffset) + mOffsetShift;
            //}
        //} else {
            //if (isAfterLetterOrDigit(shiftedOffset)) {
                //return mIterator.preceding(shiftedOffset) + mOffsetShift;
            //}
        //}
        //return BreakIterator.DONE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.318 -0400", hash_original_method = "BDAE18DC1A45A79C9134EA83087086A0", hash_generated_method = "6C7442FDB468E3706A6F56A945E2B030")
    public int getEnd(int offset) {
        int shiftedOffset;
        shiftedOffset = offset - mOffsetShift;
        checkOffsetIsValid(shiftedOffset);
        {
            boolean varD9CBCC7E3838E9931857B4F04B672176_909287644 = (isAfterLetterOrDigit(shiftedOffset));
            {
                {
                    boolean varB4B4C05081CBE63E902D225AEECF6D8B_1559089758 = (mIterator.isBoundary(shiftedOffset));
                    {
                        int varF4B4DE286A47D4A70E1CFDBAB0A64D1A_1027090689 = (mIterator.following(shiftedOffset) + mOffsetShift);
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                {
                    boolean var5BE6A27E5B96D50DA4647B360B2874CE_102270354 = (isOnLetterOrDigit(shiftedOffset));
                    {
                        int varF4B4DE286A47D4A70E1CFDBAB0A64D1A_1748439271 = (mIterator.following(shiftedOffset) + mOffsetShift);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(offset);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_898873107 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_898873107;
        // ---------- Original Method ----------
        //final int shiftedOffset = offset - mOffsetShift;
        //checkOffsetIsValid(shiftedOffset);
        //if (isAfterLetterOrDigit(shiftedOffset)) {
            //if (mIterator.isBoundary(shiftedOffset)) {
                //return shiftedOffset + mOffsetShift;
            //} else {
                //return mIterator.following(shiftedOffset) + mOffsetShift;
            //}
        //} else {
            //if (isOnLetterOrDigit(shiftedOffset)) {
                //return mIterator.following(shiftedOffset) + mOffsetShift;
            //}
        //}
        //return BreakIterator.DONE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.318 -0400", hash_original_method = "60A45BC82DD7A1F2C5F7476F31AEBCCE", hash_generated_method = "4A9E6D52E4B9E0F88F8A4AC538FAA896")
    private boolean isAfterLetterOrDigit(int shiftedOffset) {
        {
            boolean varF5393482EF6F317B07B1C94DACFBF909_446396177 = (shiftedOffset >= 1 && shiftedOffset <= mString.length());
            {
                int codePoint;
                codePoint = mString.codePointBefore(shiftedOffset);
                {
                    boolean varD6606A5963F93B6F3C8BBCF888FAF831_1841628478 = (Character.isLetterOrDigit(codePoint));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(shiftedOffset);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1342788651 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1342788651;
        // ---------- Original Method ----------
        //if (shiftedOffset >= 1 && shiftedOffset <= mString.length()) {
            //final int codePoint = mString.codePointBefore(shiftedOffset);
            //if (Character.isLetterOrDigit(codePoint)) return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.332 -0400", hash_original_method = "C811EDD4D225F2A549F13F257AE33EBA", hash_generated_method = "18946130104A9488D2185DD037B88762")
    private boolean isOnLetterOrDigit(int shiftedOffset) {
        {
            boolean varC25052DD31B57AC010FD859A0CFC1253_465276994 = (shiftedOffset >= 0 && shiftedOffset < mString.length());
            {
                int codePoint;
                codePoint = mString.codePointAt(shiftedOffset);
                {
                    boolean varD6606A5963F93B6F3C8BBCF888FAF831_123581142 = (Character.isLetterOrDigit(codePoint));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(shiftedOffset);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_601637755 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_601637755;
        // ---------- Original Method ----------
        //if (shiftedOffset >= 0 && shiftedOffset < mString.length()) {
            //final int codePoint = mString.codePointAt(shiftedOffset);
            //if (Character.isLetterOrDigit(codePoint)) return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.332 -0400", hash_original_method = "715BE561E387B8F91746DB56405B0D1C", hash_generated_method = "F4AA52FCC278C8A2781C608B16AC1304")
    private void checkOffsetIsValid(int shiftedOffset) {
        {
            boolean var07121F6B0236069059E5A0DA04661899_1884498750 = (shiftedOffset < 0 || shiftedOffset > mString.length());
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Invalid offset: " + (shiftedOffset + mOffsetShift) +
                    ". Valid range is [" + mOffsetShift + ", " + (mString.length() + mOffsetShift) +
                    "]");
            } //End block
        } //End collapsed parenthetic
        addTaint(shiftedOffset);
        // ---------- Original Method ----------
        //if (shiftedOffset < 0 || shiftedOffset > mString.length()) {
            //throw new IllegalArgumentException("Invalid offset: " + (shiftedOffset + mOffsetShift) +
                    //". Valid range is [" + mOffsetShift + ", " + (mString.length() + mOffsetShift) +
                    //"]");
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:43.332 -0400", hash_original_field = "BBBC6FD050DCA304328F0C35252C11AD", hash_generated_field = "054ECD79A14836BF14A9CE7CD90DF7A0")

    private static int WINDOW_WIDTH = 50;
}

