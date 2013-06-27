package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

class ComparableTimSort {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.388 -0400", hash_original_field = "0CC175B9C0F1B6A831C399E269772661", hash_generated_field = "57C26AE792187D8B778587C6F2CC693D")

    private Object[] a;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.389 -0400", hash_original_field = "1723F00AEB55EB29D345BB8FC560DDDD", hash_generated_field = "4AEA7058F4222AE4711A0802F956E706")

    private int minGallop = MIN_GALLOP;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.389 -0400", hash_original_field = "FA816EDB83E95BF0C8DA580BDFD491EF", hash_generated_field = "F29293D0549CBA3455BA89626253287F")

    private Object[] tmp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.389 -0400", hash_original_field = "D756571CC98275F49C20580A59B44F17", hash_generated_field = "D6178E85D65285FC9BE783DCA3A89A35")

    private int stackSize = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.389 -0400", hash_original_field = "BCD0032E9C5292693B10DFF6E98018C6", hash_generated_field = "A46172EB2BFB60FE7750E3A2D782A167")

    private int[] runBase;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.389 -0400", hash_original_field = "00BAF48D4AB09F7E1E16965DEC3C2EED", hash_generated_field = "C560C98366AB8D77B05FAE57238ADA8D")

    private int[] runLen;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.397 -0400", hash_original_method = "542A19C49303D6524BE63DEB812200B5", hash_generated_method = "5BBD9FCBC32870AC846AB34589A15C8A")
    private  ComparableTimSort(Object[] a) {
        this.a = a;
        int len;
        len = a.length;
        @SuppressWarnings({"unchecked", "UnnecessaryLocalVariable"}) Object[] newArray;
        newArray = new Object[len < 2 * INITIAL_TMP_STORAGE_LENGTH ?
                                       len >>> 1 : INITIAL_TMP_STORAGE_LENGTH];//DSFIXME:  CODE0008: Nested ternary operator in expression
        tmp = newArray;
        int stackLen;
        stackLen = (len <    120  ?  5 :
                        len <   1542  ? 10 :
                        len < 119151  ? 19 : 40);//DSFIXME:  CODE0008: Nested ternary operator in expression
        runBase = new int[stackLen];
        runLen = new int[stackLen];
        // ---------- Original Method ----------
        //this.a = a;
        //int len = a.length;
        //@SuppressWarnings({"unchecked", "UnnecessaryLocalVariable"})
        //Object[] newArray = new Object[len < 2 * INITIAL_TMP_STORAGE_LENGTH ?
                                       //len >>> 1 : INITIAL_TMP_STORAGE_LENGTH];
        //tmp = newArray;
        //int stackLen = (len <    120  ?  5 :
                        //len <   1542  ? 10 :
                        //len < 119151  ? 19 : 40);
        //runBase = new int[stackLen];
        //runLen = new int[stackLen];
    }

    
        static void sort(Object[] a) {
        sort(a, 0, a.length);
    }

    
        static void sort(Object[] a, int lo, int hi) {
        Arrays.checkStartAndEnd(a.length, lo, hi);
        int nRemaining  = hi - lo;
        if (nRemaining < 2)
            return;
        if (nRemaining < MIN_MERGE) {
            int initRunLen = countRunAndMakeAscending(a, lo, hi);
            binarySort(a, lo, hi, lo + initRunLen);
            return;
        }
        ComparableTimSort ts = new ComparableTimSort(a);
        int minRun = minRunLength(nRemaining);
        do {
            int runLen = countRunAndMakeAscending(a, lo, hi);
            if (runLen < minRun) {
                int force = nRemaining <= minRun ? nRemaining : minRun;
                binarySort(a, lo, lo + force, lo + runLen);
                runLen = force;
            }
            ts.pushRun(lo, runLen);
            ts.mergeCollapse();
            lo += runLen;
            nRemaining -= runLen;
        } while (nRemaining != 0);
        if (DEBUG) assert lo == hi;
        ts.mergeForceCollapse();
        if (DEBUG) assert ts.stackSize == 1;
    }

    
        @SuppressWarnings("fallthrough")
    private static void binarySort(Object[] a, int lo, int hi, int start) {
        if (DEBUG) assert lo <= start && start <= hi;
        if (start == lo)
            start++;
        for ( ; start < hi; start++) {
            @SuppressWarnings("unchecked")
            Comparable<Object> pivot = (Comparable) a[start];
            int left = lo;
            int right = start;
            if (DEBUG) assert left <= right;
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (pivot.compareTo(a[mid]) < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            if (DEBUG) assert left == right;
            int n = start - left;  
            switch(n) {
                case 2:  a[left + 2] = a[left + 1];
                case 1:  a[left + 1] = a[left];
                         break;
                default: System.arraycopy(a, left, a, left + 1, n);
            }
            a[left] = pivot;
        }
    }

    
        @SuppressWarnings("unchecked")
    private static int countRunAndMakeAscending(Object[] a, int lo, int hi) {
        if (DEBUG) assert lo < hi;
        int runHi = lo + 1;
        if (runHi == hi)
            return 1;
        if (((Comparable) a[runHi++]).compareTo(a[lo]) < 0) { 
            while(runHi < hi && ((Comparable) a[runHi]).compareTo(a[runHi - 1]) < 0)
                runHi++;
            reverseRange(a, lo, runHi);
        } else {                              
            while (runHi < hi && ((Comparable) a[runHi]).compareTo(a[runHi - 1]) >= 0)
                runHi++;
        }
        return runHi - lo;
    }

    
        private static void reverseRange(Object[] a, int lo, int hi) {
        hi--;
        while (lo < hi) {
            Object t = a[lo];
            a[lo++] = a[hi];
            a[hi--] = t;
        }
    }

    
        private static int minRunLength(int n) {
        if (DEBUG) assert n >= 0;
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.399 -0400", hash_original_method = "4FF06135DA529EA5945D38DB9DEC9B0E", hash_generated_method = "FEFC76C70CAF77D41BBF6E81160EBCA3")
    private void pushRun(int runBase, int runLen) {
        this.runBase[stackSize] = runBase;
        this.runLen[stackSize] = runLen;
        // ---------- Original Method ----------
        //this.runBase[stackSize] = runBase;
        //this.runLen[stackSize] = runLen;
        //stackSize++;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.400 -0400", hash_original_method = "3156E5829AEB14A787F26082DFE50344", hash_generated_method = "FF5A728369FAAAA218A73E83F69512EC")
    private void mergeCollapse() {
        {
            int n;
            n = stackSize - 2;
            {
                mergeAt(n);
            } //End block
            {
                mergeAt(n);
            } //End block
        } //End block
        // ---------- Original Method ----------
        //while (stackSize > 1) {
            //int n = stackSize - 2;
            //if (n > 0 && runLen[n-1] <= runLen[n] + runLen[n+1]) {
                //if (runLen[n - 1] < runLen[n + 1])
                    //n--;
                //mergeAt(n);
            //} else if (runLen[n] <= runLen[n + 1]) {
                //mergeAt(n);
            //} else {
                //break; 
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.401 -0400", hash_original_method = "97921B5E4166F5AC1B7B582C04340D66", hash_generated_method = "BD499F03B86E4CD678033407C5F9DBAA")
    private void mergeForceCollapse() {
        {
            int n;
            n = stackSize - 2;
            mergeAt(n);
        } //End block
        // ---------- Original Method ----------
        //while (stackSize > 1) {
            //int n = stackSize - 2;
            //if (n > 0 && runLen[n - 1] < runLen[n + 1])
                //n--;
            //mergeAt(n);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.413 -0400", hash_original_method = "D1D435DBB100F2E004D61A3172BCBED6", hash_generated_method = "7D8E63EB69F38C592B37812C98E8336C")
    @SuppressWarnings("unchecked")
    private void mergeAt(int i) {
        int base1;
        base1 = runBase[i];
        int len1;
        len1 = runLen[i];
        int base2;
        base2 = runBase[i + 1];
        int len2;
        len2 = runLen[i + 1];
        runLen[i] = len1 + len2;
        {
            runBase[i + 1] = runBase[i + 2];
            runLen[i + 1] = runLen[i + 2];
        } //End block
        int k;
        k = gallopRight((Comparable<Object>) a[base2], a, base1, len1, 0);
        base1 += k;
        len1 -= k;
        len2 = gallopLeft((Comparable<Object>) a[base1 + len1 - 1], a,
                base2, len2, len2 - 1);
        mergeLo(base1, len1, base2, len2);
        mergeHi(base1, len1, base2, len2);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        private static int gallopLeft(Comparable<Object> key, Object[] a,
            int base, int len, int hint) {
        if (DEBUG) assert len > 0 && hint >= 0 && hint < len;
        int lastOfs = 0;
        int ofs = 1;
        if (key.compareTo(a[base + hint]) > 0) {
            int maxOfs = len - hint;
            while (ofs < maxOfs && key.compareTo(a[base + hint + ofs]) > 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;
            lastOfs += hint;
            ofs += hint;
        } else { 
            final int maxOfs = hint + 1;
            while (ofs < maxOfs && key.compareTo(a[base + hint - ofs]) <= 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;
            int tmp = lastOfs;
            lastOfs = hint - ofs;
            ofs = hint - tmp;
        }
        if (DEBUG) assert -1 <= lastOfs && lastOfs < ofs && ofs <= len;
        lastOfs++;
        while (lastOfs < ofs) {
            int m = lastOfs + ((ofs - lastOfs) >>> 1);
            if (key.compareTo(a[base + m]) > 0)
                lastOfs = m + 1;  
            else
                ofs = m;          
        }
        if (DEBUG) assert lastOfs == ofs;
        return ofs;
    }

    
        private static int gallopRight(Comparable<Object> key, Object[] a,
            int base, int len, int hint) {
        if (DEBUG) assert len > 0 && hint >= 0 && hint < len;
        int ofs = 1;
        int lastOfs = 0;
        if (key.compareTo(a[base + hint]) < 0) {
            int maxOfs = hint + 1;
            while (ofs < maxOfs && key.compareTo(a[base + hint - ofs]) < 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;
            int tmp = lastOfs;
            lastOfs = hint - ofs;
            ofs = hint - tmp;
        } else { 
            int maxOfs = len - hint;
            while (ofs < maxOfs && key.compareTo(a[base + hint + ofs]) >= 0) {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;
            lastOfs += hint;
            ofs += hint;
        }
        if (DEBUG) assert -1 <= lastOfs && lastOfs < ofs && ofs <= len;
        lastOfs++;
        while (lastOfs < ofs) {
            int m = lastOfs + ((ofs - lastOfs) >>> 1);
            if (key.compareTo(a[base + m]) < 0)
                ofs = m;          
            else
                lastOfs = m + 1;  
        }
        if (DEBUG) assert lastOfs == ofs;
        return ofs;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.439 -0400", hash_original_method = "45427D901AB4A7DC08467113333FDBE7", hash_generated_method = "B7F92B516149DEC05EDC858B27054B55")
    @SuppressWarnings("unchecked")
    private void mergeLo(int base1, int len1, int base2, int len2) {
        Object[] a;
        a = this.a;
        Object[] tmp;
        tmp = ensureCapacity(len1);
        System.arraycopy(a, base1, tmp, 0, len1);
        int cursor1;
        cursor1 = 0;
        int cursor2;
        cursor2 = base2;
        int dest;
        dest = base1;
        a[dest++] = a[cursor2++];
        {
            System.arraycopy(tmp, cursor1, a, dest, len1);
        } //End block
        {
            System.arraycopy(a, cursor2, a, dest, len2);
            a[dest + len2] = tmp[cursor1];
        } //End block
        int minGallop;
        minGallop = this.minGallop;
        {
            int count1;
            count1 = 0;
            int count2;
            count2 = 0;
            {
                {
                    boolean var5CF5BA598A18E1F3EB7F396B833F6C31_846739128 = (((Comparable) a[cursor2]).compareTo(tmp[cursor1]) < 0);
                    {
                        a[dest++] = a[cursor2++];
                        count1 = 0;
                    } //End block
                    {
                        a[dest++] = tmp[cursor1++];
                        count2 = 0;
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                count1 = gallopRight((Comparable) a[cursor2], tmp, cursor1, len1, 0);
                {
                    System.arraycopy(tmp, cursor1, a, dest, count1);
                    dest += count1;
                    cursor1 += count1;
                    len1 -= count1;
                } //End block
                a[dest++] = a[cursor2++];
                count2 = gallopLeft((Comparable) tmp[cursor1], a, cursor2, len2, 0);
                {
                    System.arraycopy(a, cursor2, a, dest, count2);
                    dest += count2;
                    cursor2 += count2;
                    len2 -= count2;
                } //End block
                a[dest++] = tmp[cursor1++];
            } //End block
            minGallop = 0;
            minGallop += 2;
        } //End block
        this.minGallop = minGallop < 1 ? 1 : minGallop;
        {
            System.arraycopy(a, cursor2, a, dest, len2);
            a[dest + len2] = tmp[cursor1];
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                "Comparison method violates its general contract!");
        } //End block
        {
            System.arraycopy(tmp, cursor1, a, dest, len1);
        } //End block
        addTaint(base1);
        addTaint(len1);
        addTaint(base2);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.465 -0400", hash_original_method = "6C6CE95C2E304E4FD1D38A30136C639B", hash_generated_method = "4683530BCAB99FA8F68A3341AA52012A")
    @SuppressWarnings("unchecked")
    private void mergeHi(int base1, int len1, int base2, int len2) {
        Object[] a;
        a = this.a;
        Object[] tmp;
        tmp = ensureCapacity(len2);
        System.arraycopy(a, base2, tmp, 0, len2);
        int cursor1;
        cursor1 = base1 + len1 - 1;
        int cursor2;
        cursor2 = len2 - 1;
        int dest;
        dest = base2 + len2 - 1;
        a[dest--] = a[cursor1--];
        {
            System.arraycopy(tmp, 0, a, dest - (len2 - 1), len2);
        } //End block
        {
            dest -= len1;
            cursor1 -= len1;
            System.arraycopy(a, cursor1 + 1, a, dest + 1, len1);
            a[dest] = tmp[cursor2];
        } //End block
        int minGallop;
        minGallop = this.minGallop;
        {
            int count1;
            count1 = 0;
            int count2;
            count2 = 0;
            {
                {
                    boolean var046B503408434B65FA127E27B1D3015A_854658477 = (((Comparable) tmp[cursor2]).compareTo(a[cursor1]) < 0);
                    {
                        a[dest--] = a[cursor1--];
                        count2 = 0;
                    } //End block
                    {
                        a[dest--] = tmp[cursor2--];
                        count1 = 0;
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                count1 = len1 - gallopRight((Comparable) tmp[cursor2], a, base1, len1, len1 - 1);
                {
                    dest -= count1;
                    cursor1 -= count1;
                    len1 -= count1;
                    System.arraycopy(a, cursor1 + 1, a, dest + 1, count1);
                } //End block
                a[dest--] = tmp[cursor2--];
                count2 = len2 - gallopLeft((Comparable) a[cursor1], tmp, 0, len2, len2 - 1);
                {
                    dest -= count2;
                    cursor2 -= count2;
                    len2 -= count2;
                    System.arraycopy(tmp, cursor2 + 1, a, dest + 1, count2);
                } //End block
                a[dest--] = a[cursor1--];
            } //End block
            minGallop = 0;
            minGallop += 2;
        } //End block
        this.minGallop = minGallop < 1 ? 1 : minGallop;
        {
            dest -= len1;
            cursor1 -= len1;
            System.arraycopy(a, cursor1 + 1, a, dest + 1, len1);
            a[dest] = tmp[cursor2];
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                "Comparison method violates its general contract!");
        } //End block
        {
            System.arraycopy(tmp, 0, a, dest - (len2 - 1), len2);
        } //End block
        addTaint(base1);
        addTaint(len1);
        addTaint(base2);
        addTaint(len2);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.466 -0400", hash_original_method = "D7ECC5727F84FF288304F35202B3A04B", hash_generated_method = "30D540B371DE226B9C8193CDDB79FC17")
    private Object[] ensureCapacity(int minCapacity) {
        Object[] varB4EAC82CA7396A68D541C85D26508E83_705327211 = null; //Variable for return #1
        {
            int newSize;
            newSize = minCapacity;
            newSize |= newSize >> 1;
            newSize |= newSize >> 2;
            newSize |= newSize >> 4;
            newSize |= newSize >> 8;
            newSize |= newSize >> 16;
            newSize = minCapacity;
            newSize = Math.min(newSize, a.length >>> 1);
            @SuppressWarnings({"unchecked", "UnnecessaryLocalVariable"}) Object[] newArray;
            newArray = new Object[newSize];
            tmp = newArray;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_705327211 = tmp;
        addTaint(minCapacity);
        varB4EAC82CA7396A68D541C85D26508E83_705327211.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_705327211;
        // ---------- Original Method ----------
        //if (tmp.length < minCapacity) {
            //int newSize = minCapacity;
            //newSize |= newSize >> 1;
            //newSize |= newSize >> 2;
            //newSize |= newSize >> 4;
            //newSize |= newSize >> 8;
            //newSize |= newSize >> 16;
            //newSize++;
            //if (newSize < 0) 
                //newSize = minCapacity;
            //else
                //newSize = Math.min(newSize, a.length >>> 1);
            //@SuppressWarnings({"unchecked", "UnnecessaryLocalVariable"})
            //Object[] newArray = new Object[newSize];
            //tmp = newArray;
        //}
        //return tmp;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.466 -0400", hash_original_field = "4A490259FC4AAE2038058967988E5B8B", hash_generated_field = "3931B083EBCAB8BFF212B05D7382794B")

    private static int MIN_MERGE = 32;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.466 -0400", hash_original_field = "A6ABC415A6B00555997959B418653BE3", hash_generated_field = "4A5421B440C2BA29D0228B2FD860C79B")

    private static int MIN_GALLOP = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.466 -0400", hash_original_field = "BA59E61BD2B58B5E9EC1C9B9EE84017A", hash_generated_field = "7A5CF663CEF691DAACC94837A499F835")

    private static int INITIAL_TMP_STORAGE_LENGTH = 256;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:50.467 -0400", hash_original_field = "021906CCEC815FC820B74F760E7368C7", hash_generated_field = "E83DF1E2E661A92B1AFDA8C473D190B2")

    private static boolean DEBUG = false;
}

