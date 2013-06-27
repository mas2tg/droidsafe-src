package java.util.concurrent;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.concurrent.locks.*;
import java.util.*;

public class PriorityBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>, java.io.Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.073 -0400", hash_original_field = "A9D1CBF71942327E98B40CF5EF38A960", hash_generated_field = "BA6E9BA522BED220E542D0B7B7CCF63A")

    private transient Object[] queue;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.073 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "55DCA83C6162ACD637EB02860F7422EE")

    private transient int size;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.091 -0400", hash_original_field = "4092F21BD0E2CC3C9CA971DF59AA8608", hash_generated_field = "5D5D7D779E97F5198B6F4EBA3322C270")

    private transient Comparator<? super E> comparator;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.091 -0400", hash_original_field = "DCE7C4174CE9323904A934A486C41288", hash_generated_field = "DFE928B318585A72A4580EF29A43B994")

    private ReentrantLock lock;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.091 -0400", hash_original_field = "4D495F503708F3E21723219DA12E7651", hash_generated_field = "6208B332BB61DB5EFD3387E35BF3069A")

    private Condition notEmpty;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.091 -0400", hash_original_field = "972C7B8078DBEF6629BA49B6EBAE2B27", hash_generated_field = "36643E2CE9D2E85479B8D7D985E5BE19")

    private transient volatile int allocationSpinLock;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.092 -0400", hash_original_field = "7694F4A66316E53C8CDD9D9954BD611D", hash_generated_field = "2F802CAB7C8B52D1CCE596848B3698CE")

    private PriorityQueue q;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.092 -0400", hash_original_method = "7097644646C71112C54FBC7AFE99B502", hash_generated_method = "EB3E09F342C2EF21559210AC909696C8")
    public  PriorityBlockingQueue() {
        this(DEFAULT_INITIAL_CAPACITY, null);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.092 -0400", hash_original_method = "9FD50C62507B9B1E2683A0AA12E68611", hash_generated_method = "402DD8B086F03DC462CEFEA0A97221C2")
    public  PriorityBlockingQueue(int initialCapacity) {
        this(initialCapacity, null);
        addTaint(initialCapacity);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.093 -0400", hash_original_method = "DD3F77DD82D0390F8152735FEB2697B3", hash_generated_method = "6ACF53F34DC97EDEA86146D4C16B9B24")
    public  PriorityBlockingQueue(int initialCapacity,
                                 Comparator<? super E> comparator) {
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
        this.lock = new ReentrantLock();
        this.notEmpty = lock.newCondition();
        this.comparator = comparator;
        this.queue = new Object[initialCapacity];
        // ---------- Original Method ----------
        //if (initialCapacity < 1)
            //throw new IllegalArgumentException();
        //this.lock = new ReentrantLock();
        //this.notEmpty = lock.newCondition();
        //this.comparator = comparator;
        //this.queue = new Object[initialCapacity];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.110 -0400", hash_original_method = "39ADFE75332ACE4FAADBC9E7644F48C0", hash_generated_method = "0D8B657DB223F46A944D5358875BADC7")
    public  PriorityBlockingQueue(Collection<? extends E> c) {
        this.lock = new ReentrantLock();
        this.notEmpty = lock.newCondition();
        boolean heapify;
        heapify = true;
        boolean screen;
        screen = true;
        {
            SortedSet<? extends E> ss;
            ss = (SortedSet<? extends E>) c;
            this.comparator = (Comparator<? super E>) ss.comparator();
            heapify = false;
        } //End block
        {
            PriorityBlockingQueue<? extends E> pq;
            pq = (PriorityBlockingQueue<? extends E>) c;
            this.comparator = (Comparator<? super E>) pq.comparator();
            screen = false;
            {
                boolean var942B84B8F6DD12D131B1B426D916BED5_1650095490 = (pq.getClass() == PriorityBlockingQueue.class);
                heapify = false;
            } //End collapsed parenthetic
        } //End block
        Object[] a;
        a = c.toArray();
        int n;
        n = a.length;
        {
            boolean var16F77EF61B9474A82FE398A385F0E9B1_1632758648 = (a.getClass() != Object[].class);
            a = Arrays.copyOf(a, n, Object[].class);
        } //End collapsed parenthetic
        {
            {
                int i;
                i = 0;
                if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
            } //End collapsed parenthetic
        } //End block
        this.queue = a;
        this.size = n;
        heapify();
        addTaint(c.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.112 -0400", hash_original_method = "4FD20927C2E38EB86416DF04242C2C20", hash_generated_method = "D847F87773FDCC27E6E0DEB6BFF0800D")
    private void tryGrow(Object[] array, int oldCap) {
        lock.unlock();
        Object[] newArray;
        newArray = null;
        {
            boolean var5CBD7A5158A3DA3D554450B05320E898_325476328 = (allocationSpinLock == 0 &&
            UNSAFE.compareAndSwapInt(this, allocationSpinLockOffset,
                                     0, 1));
            {
                try 
                {
                    int newCap;
                    newCap = oldCap + ((oldCap < 64) ?
                                       (oldCap + 2) : 
                                       (oldCap >> 1));//DSFIXME:  CODE0008: Nested ternary operator in expression
                    {
                        int minCap;
                        minCap = oldCap + 1;
                        if (DroidSafeAndroidRuntime.control) throw new OutOfMemoryError();
                        newCap = MAX_ARRAY_SIZE;
                    } //End block
                    newArray = new Object[newCap];
                } //End block
                finally 
                {
                    allocationSpinLock = 0;
                } //End block
            } //End block
        } //End collapsed parenthetic
        Thread.yield();
        lock.lock();
        {
            queue = newArray;
            System.arraycopy(array, 0, newArray, 0, oldCap);
        } //End block
        addTaint(array[0].getTaint());
        addTaint(oldCap);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.113 -0400", hash_original_method = "B92133B4F8095968C1CAA0CBFEDBAB19", hash_generated_method = "350DDCF360FFA4721B208620299D45CA")
    private E extract() {
        E varB4EAC82CA7396A68D541C85D26508E83_1626643949 = null; //Variable for return #1
        E result;
        int n;
        n = size - 1;
        result = null;
        {
            Object[] array;
            array = queue;
            result = (E) array[0];
            E x;
            x = (E) array[n];
            array[n] = null;
            Comparator<? super E> cmp;
            cmp = comparator;
            siftDownComparable(0, x, array, n);
            siftDownUsingComparator(0, x, array, n, cmp);
            size = n;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1626643949 = result;
        varB4EAC82CA7396A68D541C85D26508E83_1626643949.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1626643949;
        // ---------- Original Method ----------
        //E result;
        //int n = size - 1;
        //if (n < 0)
            //result = null;
        //else {
            //Object[] array = queue;
            //result = (E) array[0];
            //E x = (E) array[n];
            //array[n] = null;
            //Comparator<? super E> cmp = comparator;
            //if (cmp == null)
                //siftDownComparable(0, x, array, n);
            //else
                //siftDownUsingComparator(0, x, array, n, cmp);
            //size = n;
        //}
        //return result;
    }

    
        private static <T> void siftUpComparable(int k, T x, Object[] array) {
        Comparable<? super T> key = (Comparable<? super T>) x;
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            Object e = array[parent];
            if (key.compareTo((T) e) >= 0)
                break;
            array[k] = e;
            k = parent;
        }
        array[k] = key;
    }

    
        private static <T> void siftUpUsingComparator(int k, T x, Object[] array,
                                       Comparator<? super T> cmp) {
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            Object e = array[parent];
            if (cmp.compare(x, (T) e) >= 0)
                break;
            array[k] = e;
            k = parent;
        }
        array[k] = x;
    }

    
        private static <T> void siftDownComparable(int k, T x, Object[] array,
                                               int n) {
        Comparable<? super T> key = (Comparable<? super T>)x;
        int half = n >>> 1;
        while (k < half) {
            int child = (k << 1) + 1; 
            Object c = array[child];
            int right = child + 1;
            if (right < n &&
                ((Comparable<? super T>) c).compareTo((T) array[right]) > 0)
                c = array[child = right];
            if (key.compareTo((T) c) <= 0)
                break;
            array[k] = c;
            k = child;
        }
        array[k] = key;
    }

    
        private static <T> void siftDownUsingComparator(int k, T x, Object[] array,
                                                    int n,
                                                    Comparator<? super T> cmp) {
        int half = n >>> 1;
        while (k < half) {
            int child = (k << 1) + 1;
            Object c = array[child];
            int right = child + 1;
            if (right < n && cmp.compare((T) c, (T) array[right]) > 0)
                c = array[child = right];
            if (cmp.compare(x, (T) c) <= 0)
                break;
            array[k] = c;
            k = child;
        }
        array[k] = x;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.145 -0400", hash_original_method = "EE7D24D9E196708648F7B6757F98A148", hash_generated_method = "5904B4315A37EE5AAB561D94BEF22885")
    private void heapify() {
        Object[] array;
        array = queue;
        int n;
        n = size;
        int half;
        half = (n >>> 1) - 1;
        Comparator<? super E> cmp;
        cmp = comparator;
        {
            {
                int i;
                i = half;
                siftDownComparable(i, (E) array[i], array, n);
            } //End collapsed parenthetic
        } //End block
        {
            {
                int i;
                i = half;
                siftDownUsingComparator(i, (E) array[i], array, n, cmp);
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //Object[] array = queue;
        //int n = size;
        //int half = (n >>> 1) - 1;
        //Comparator<? super E> cmp = comparator;
        //if (cmp == null) {
            //for (int i = half; i >= 0; i--)
                //siftDownComparable(i, (E) array[i], array, n);
        //}
        //else {
            //for (int i = half; i >= 0; i--)
                //siftDownUsingComparator(i, (E) array[i], array, n, cmp);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.145 -0400", hash_original_method = "F77A4F330ECF7476CC7AF200B57EFA7F", hash_generated_method = "0766A6939993CCB33D5F3980BACB1AF4")
    public boolean add(E e) {
        boolean var42B2AD017FC8EAA920A05640330B5300_23758080 = (offer(e));
        addTaint(e.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1911813498 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1911813498;
        // ---------- Original Method ----------
        //return offer(e);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.159 -0400", hash_original_method = "775A55093A20D9C3EB5D5F7F7F70C525", hash_generated_method = "C3BAC1F71B531F70EB5F315AC37B2891")
    public boolean offer(E e) {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        int n, cap;
        Object[] array;
        {
            boolean var4531DD35A6B47ED89177DB8A0F1B2960_279467620 = ((n = size) >= (cap = (array = queue).length));
            tryGrow(array, cap);
        } //End collapsed parenthetic
        try 
        {
            Comparator<? super E> cmp;
            cmp = comparator;
            siftUpComparable(n, e, array);
            siftUpUsingComparator(n, e, array, cmp);
            size = n + 1;
            notEmpty.signal();
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(e.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_206978239 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_206978239;
        // ---------- Original Method ----------
        //if (e == null)
            //throw new NullPointerException();
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //int n, cap;
        //Object[] array;
        //while ((n = size) >= (cap = (array = queue).length))
            //tryGrow(array, cap);
        //try {
            //Comparator<? super E> cmp = comparator;
            //if (cmp == null)
                //siftUpComparable(n, e, array);
            //else
                //siftUpUsingComparator(n, e, array, cmp);
            //size = n + 1;
            //notEmpty.signal();
        //} finally {
            //lock.unlock();
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.159 -0400", hash_original_method = "C9D180903A7CC0CD8F17729AA0E80F49", hash_generated_method = "518037778B4178C6B51A84243CFC11C5")
    public void put(E e) {
        offer(e);
        addTaint(e.getTaint());
        // ---------- Original Method ----------
        //offer(e);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.160 -0400", hash_original_method = "BFDD71499687D637F57FF5151EA7665D", hash_generated_method = "C5AE2425734D6F82D7C2EBE67F0E5F3B")
    public boolean offer(E e, long timeout, TimeUnit unit) {
        boolean var42B2AD017FC8EAA920A05640330B5300_1327669785 = (offer(e));
        addTaint(e.getTaint());
        addTaint(timeout);
        addTaint(unit.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1717755801 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1717755801;
        // ---------- Original Method ----------
        //return offer(e);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.160 -0400", hash_original_method = "A22423A10175E57DE557DAE1EC700763", hash_generated_method = "345D96C6E25F4022FE9A33DA423C6D05")
    public E poll() {
        E varB4EAC82CA7396A68D541C85D26508E83_539413152 = null; //Variable for return #1
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        E result;
        try 
        {
            result = extract();
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_539413152 = result;
        varB4EAC82CA7396A68D541C85D26508E83_539413152.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_539413152;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //E result;
        //try {
            //result = extract();
        //} finally {
            //lock.unlock();
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.161 -0400", hash_original_method = "7702BF7782A7372B6632BD3C70F3CD0F", hash_generated_method = "DDB647468306BE2F5A09737FBE6C6B0F")
    public E take() throws InterruptedException {
        E varB4EAC82CA7396A68D541C85D26508E83_749080590 = null; //Variable for return #1
        ReentrantLock lock;
        lock = this.lock;
        lock.lockInterruptibly();
        E result;
        try 
        {
            {
                boolean varC9C5225C062A6E8E6EB29A2DE54BC6B7_1841955577 = ((result = extract()) == null);
                notEmpty.await();
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_749080590 = result;
        varB4EAC82CA7396A68D541C85D26508E83_749080590.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_749080590;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lockInterruptibly();
        //E result;
        //try {
            //while ( (result = extract()) == null)
                //notEmpty.await();
        //} finally {
            //lock.unlock();
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.162 -0400", hash_original_method = "E1FF0BE92CA560531F5134C8D376F3E9", hash_generated_method = "57F3B945AEBA1446BEBC9B03D8382334")
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        E varB4EAC82CA7396A68D541C85D26508E83_1546042485 = null; //Variable for return #1
        long nanos;
        nanos = unit.toNanos(timeout);
        ReentrantLock lock;
        lock = this.lock;
        lock.lockInterruptibly();
        E result;
        try 
        {
            {
                boolean var8F587AA462BBB3430969A2F03A01845E_113531490 = ((result = extract()) == null && nanos > 0);
                nanos = notEmpty.awaitNanos(nanos);
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1546042485 = result;
        addTaint(timeout);
        addTaint(unit.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1546042485.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1546042485;
        // ---------- Original Method ----------
        //long nanos = unit.toNanos(timeout);
        //final ReentrantLock lock = this.lock;
        //lock.lockInterruptibly();
        //E result;
        //try {
            //while ( (result = extract()) == null && nanos > 0)
                //nanos = notEmpty.awaitNanos(nanos);
        //} finally {
            //lock.unlock();
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.178 -0400", hash_original_method = "6160A1DDBF053B72DB86495140716C8D", hash_generated_method = "1FA847974E73DAA44DA885476C3F4860")
    public E peek() {
        E varB4EAC82CA7396A68D541C85D26508E83_1382325005 = null; //Variable for return #1
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        E result;
        try 
        {
            result = size > 0 ? (E) queue[0] : null;
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1382325005 = result;
        varB4EAC82CA7396A68D541C85D26508E83_1382325005.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1382325005;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //E result;
        //try {
            //result = size > 0 ? (E) queue[0] : null;
        //} finally {
            //lock.unlock();
        //}
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.179 -0400", hash_original_method = "83ACC201A16F2FDDF97B6B07FFFB2168", hash_generated_method = "54B4701D9AFECC39E07DEE45CC0C9DDB")
    public Comparator<? super E> comparator() {
        Comparator<? super E> varB4EAC82CA7396A68D541C85D26508E83_159200552 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_159200552 = comparator;
        varB4EAC82CA7396A68D541C85D26508E83_159200552.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_159200552;
        // ---------- Original Method ----------
        //return comparator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.179 -0400", hash_original_method = "FB53A461CD3B1BACC3DB27D415F5CC64", hash_generated_method = "58B90F3D18808FBFA6FA1A8D069FC4EE")
    public int size() {
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1674527972 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1674527972;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //return size;
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.180 -0400", hash_original_method = "E7CDD1D543D1F61B1D969765A4629893", hash_generated_method = "A502ADA2C2D3C4C3565C72700EAF1E5F")
    public int remainingCapacity() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_225702633 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_225702633;
        // ---------- Original Method ----------
        //return Integer.MAX_VALUE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.180 -0400", hash_original_method = "EC3B7D586FF4D36081EA6F7D19ADE62F", hash_generated_method = "1A1A3C04B94E241B98DE28ED49CAF268")
    private int indexOf(Object o) {
        {
            Object[] array;
            array = queue;
            int n;
            n = size;
            {
                int i;
                i = 0;
                {
                    boolean varD361998FE043BDE60F5D0B136966DE37_1628746187 = (o.equals(array[i]));
                } //End collapsed parenthetic
            } //End collapsed parenthetic
        } //End block
        addTaint(o.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2128277419 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2128277419;
        // ---------- Original Method ----------
        //if (o != null) {
            //Object[] array = queue;
            //int n = size;
            //for (int i = 0; i < n; i++)
                //if (o.equals(array[i]))
                    //return i;
        //}
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.192 -0400", hash_original_method = "9D73270D970CE651CDDED76CEC412EF8", hash_generated_method = "E2157C8C1B93A7AC583E55D8E914C191")
    private void removeAt(int i) {
        Object[] array;
        array = queue;
        int n;
        n = size - 1;
        array[i] = null;
        {
            E moved;
            moved = (E) array[n];
            array[n] = null;
            Comparator<? super E> cmp;
            cmp = comparator;
            siftDownComparable(i, moved, array, n);
            siftDownUsingComparator(i, moved, array, n, cmp);
            {
                siftUpComparable(i, moved, array);
                siftUpUsingComparator(i, moved, array, cmp);
            } //End block
        } //End block
        size = n;
        addTaint(i);
        // ---------- Original Method ----------
        //Object[] array = queue;
        //int n = size - 1;
        //if (n == i) 
            //array[i] = null;
        //else {
            //E moved = (E) array[n];
            //array[n] = null;
            //Comparator<? super E> cmp = comparator;
            //if (cmp == null)
                //siftDownComparable(i, moved, array, n);
            //else
                //siftDownUsingComparator(i, moved, array, n, cmp);
            //if (array[i] == moved) {
                //if (cmp == null)
                    //siftUpComparable(i, moved, array);
                //else
                    //siftUpUsingComparator(i, moved, array, cmp);
            //}
        //}
        //size = n;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.193 -0400", hash_original_method = "9C7EDF9574A228DB080DCC7A28F18F6B", hash_generated_method = "81E49B86AA240A66E78B52ACBDB8DB09")
    public boolean remove(Object o) {
        boolean removed;
        removed = false;
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            int i;
            i = indexOf(o);
            {
                removeAt(i);
                removed = true;
            } //End block
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1450749622 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1450749622;
        // ---------- Original Method ----------
        //boolean removed = false;
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //int i = indexOf(o);
            //if (i != -1) {
                //removeAt(i);
                //removed = true;
            //}
        //} finally {
            //lock.unlock();
        //}
        //return removed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.194 -0400", hash_original_method = "32C7969330E75D54F62841F3B8B9051A", hash_generated_method = "EE67C25A354A20A17CA049E0A1344B78")
    private void removeEQ(Object o) {
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            Object[] array;
            array = queue;
            int n;
            n = size;
            {
                int i;
                i = 0;
                {
                    {
                        removeAt(i);
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(o.getTaint());
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //Object[] array = queue;
            //int n = size;
            //for (int i = 0; i < n; i++) {
                //if (o == array[i]) {
                    //removeAt(i);
                    //break;
                //}
            //}
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.195 -0400", hash_original_method = "C9C3AD49D429D8919794902BE1E1A9F2", hash_generated_method = "4174FF4E69CF9F408DDAC2387C9741CD")
    public boolean contains(Object o) {
        int index;
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            index = indexOf(o);
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1967834369 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1967834369;
        // ---------- Original Method ----------
        //int index;
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //index = indexOf(o);
        //} finally {
            //lock.unlock();
        //}
        //return index != -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.201 -0400", hash_original_method = "8A09FBF09ED2852585642BCE8CE60ACB", hash_generated_method = "7CBB2025382BE994A9FC1CA3DA9F649C")
    public Object[] toArray() {
        Object[] varB4EAC82CA7396A68D541C85D26508E83_1252814694 = null; //Variable for return #1
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1252814694 = Arrays.copyOf(queue, size);
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1252814694.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1252814694;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //return Arrays.copyOf(queue, size);
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.207 -0400", hash_original_method = "394B446E36D7177A8AA9580B0613E718", hash_generated_method = "F5E4392B65BC2C2F23C00C0B9CF9BCCE")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_972570372 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1092259233 = null; //Variable for return #2
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            int n;
            n = size;
            varB4EAC82CA7396A68D541C85D26508E83_972570372 = "[]";
            StringBuilder sb;
            sb = new StringBuilder();
            sb.append('[');
            {
                int i;
                i = 0;
                {
                    E e;
                    e = (E)queue[i];
                    sb.append(e == this ? "(this Collection)" : e);
                    sb.append(',').append(' ');
                } //End block
            } //End collapsed parenthetic
            varB4EAC82CA7396A68D541C85D26508E83_1092259233 = sb.append(']').toString();
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        String varA7E53CE21691AB073D9660D615818899_1258379344; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1258379344 = varB4EAC82CA7396A68D541C85D26508E83_972570372;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1258379344 = varB4EAC82CA7396A68D541C85D26508E83_1092259233;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1258379344.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1258379344;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //int n = size;
            //if (n == 0)
                //return "[]";
            //StringBuilder sb = new StringBuilder();
            //sb.append('[');
            //for (int i = 0; i < n; ++i) {
                //E e = (E)queue[i];
                //sb.append(e == this ? "(this Collection)" : e);
                //if (i != n - 1)
                    //sb.append(',').append(' ');
            //}
            //return sb.append(']').toString();
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.208 -0400", hash_original_method = "805242EB6CDCF550F39FC4583E9E3F8E", hash_generated_method = "322F8C22335BEE8E2230E5DD99909910")
    public int drainTo(Collection<? super E> c) {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        {
            boolean var9AEE7ACC5B0D4AF26CA46D5AFC07CCF3_1714373126 = (c == this);
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
        } //End collapsed parenthetic
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            int n;
            n = 0;
            E e;
            {
                boolean var848661D55AF18EF6F0879531DA6060ED_822644570 = ((e = extract()) != null);
                {
                    c.add(e);
                } //End block
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(c.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2017515536 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2017515536;
        // ---------- Original Method ----------
        //if (c == null)
            //throw new NullPointerException();
        //if (c == this)
            //throw new IllegalArgumentException();
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //int n = 0;
            //E e;
            //while ( (e = extract()) != null) {
                //c.add(e);
                //++n;
            //}
            //return n;
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.234 -0400", hash_original_method = "B5B895AF26F1F939F2943E595D444903", hash_generated_method = "7A20660B19DE71AF59DABEF002829E63")
    public int drainTo(Collection<? super E> c, int maxElements) {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        {
            boolean var9AEE7ACC5B0D4AF26CA46D5AFC07CCF3_1922015868 = (c == this);
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
        } //End collapsed parenthetic
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            int n;
            n = 0;
            E e;
            {
                boolean var96F054DB41F6958DDD9A74B3CA794CE9_1906070066 = (n < maxElements && (e = extract()) != null);
                {
                    c.add(e);
                } //End block
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(c.getTaint());
        addTaint(maxElements);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_31935861 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_31935861;
        // ---------- Original Method ----------
        //if (c == null)
            //throw new NullPointerException();
        //if (c == this)
            //throw new IllegalArgumentException();
        //if (maxElements <= 0)
            //return 0;
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //int n = 0;
            //E e;
            //while (n < maxElements && (e = extract()) != null) {
                //c.add(e);
                //++n;
            //}
            //return n;
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.235 -0400", hash_original_method = "D7ED8780EA10829FC69FCC0BE368EAAC", hash_generated_method = "CDC426E75E84D805FA341831FD3EE675")
    public void clear() {
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            Object[] array;
            array = queue;
            int n;
            n = size;
            size = 0;
            {
                int i;
                i = 0;
                array[i] = null;
            } //End collapsed parenthetic
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //Object[] array = queue;
            //int n = size;
            //size = 0;
            //for (int i = 0; i < n; i++)
                //array[i] = null;
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.240 -0400", hash_original_method = "6C84403244E1C1A4059442AFEB39A418", hash_generated_method = "98723C30FDFDBD4EE7C8D80DB664F26A")
    public <T> T[] toArray(T[] a) {
        T[] varB4EAC82CA7396A68D541C85D26508E83_844764196 = null; //Variable for return #1
        T[] varB4EAC82CA7396A68D541C85D26508E83_49197404 = null; //Variable for return #2
        ReentrantLock lock;
        lock = this.lock;
        lock.lock();
        try 
        {
            int n;
            n = size;
            varB4EAC82CA7396A68D541C85D26508E83_844764196 = (T[]) Arrays.copyOf(queue, size, a.getClass());
            System.arraycopy(queue, 0, a, 0, n);
            a[n] = null;
            varB4EAC82CA7396A68D541C85D26508E83_49197404 = a;
        } //End block
        finally 
        {
            lock.unlock();
        } //End block
        addTaint(a[0].getTaint());
        T[] varA7E53CE21691AB073D9660D615818899_415944947; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_415944947 = varB4EAC82CA7396A68D541C85D26508E83_844764196;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_415944947 = varB4EAC82CA7396A68D541C85D26508E83_49197404;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_415944947.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_415944947;
        // ---------- Original Method ----------
        //final ReentrantLock lock = this.lock;
        //lock.lock();
        //try {
            //int n = size;
            //if (a.length < n)
                //return (T[]) Arrays.copyOf(queue, size, a.getClass());
            //System.arraycopy(queue, 0, a, 0, n);
            //if (a.length > n)
                //a[n] = null;
            //return a;
        //} finally {
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.240 -0400", hash_original_method = "42CB3EDA719DA2D528DF0D9481F5BC1E", hash_generated_method = "EE59A5012EFC66BA708B91C8E8A4D607")
    public Iterator<E> iterator() {
        Iterator<E> varB4EAC82CA7396A68D541C85D26508E83_1128188792 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1128188792 = new Itr(toArray());
        varB4EAC82CA7396A68D541C85D26508E83_1128188792.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1128188792;
        // ---------- Original Method ----------
        //return new Itr(toArray());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.241 -0400", hash_original_method = "4F878ABF7AAF09586275C9E3C0FC32B2", hash_generated_method = "1C0F94CC7DBA36CB2C7E4FCE5CFEAF74")
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        lock.lock();
        try 
        {
            int n;
            n = size;
            q = new PriorityQueue<E>(n == 0 ? 1 : n, comparator);
            q.addAll(this);
            s.defaultWriteObject();
        } //End block
        finally 
        {
            q = null;
            lock.unlock();
        } //End block
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //lock.lock();
        //try {
            //int n = size; 
            //q = new PriorityQueue<E>(n == 0 ? 1 : n, comparator);
            //q.addAll(this);
            //s.defaultWriteObject();
        //} finally {
            //q = null;
            //lock.unlock();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.241 -0400", hash_original_method = "29A8172D11EE1F6C2B41EDC469205BD4", hash_generated_method = "93034FB6F0B6D7269346FC5CF72C253B")
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        try 
        {
            s.defaultReadObject();
            this.queue = new Object[q.size()];
            comparator = q.comparator();
            addAll(q);
        } //End block
        finally 
        {
            q = null;
        } //End block
        addTaint(s.getTaint());
        // ---------- Original Method ----------
        //try {
            //s.defaultReadObject();
            //this.queue = new Object[q.size()];
            //comparator = q.comparator();
            //addAll(q);
        //} finally {
            //q = null;
        //}
    }

    
        static long objectFieldOffset(sun.misc.Unsafe UNSAFE,
                                  String field, Class<?> klazz) {
        try {
            return UNSAFE.objectFieldOffset(klazz.getDeclaredField(field));
        } catch (NoSuchFieldException e) {
            NoSuchFieldError error = new NoSuchFieldError(field);
            error.initCause(e);
            throw error;
        }
    }

    
    final class Itr implements Iterator<E> {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.242 -0400", hash_original_field = "F1F713C9E000F5D3F280ADBD124DF4F5", hash_generated_field = "3E4C52F6F0428C39E4E692D20A9AA9AA")

        Object[] array;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.242 -0400", hash_original_field = "1791A97A8403730EE0760489A2AEB992", hash_generated_field = "574451AF3BDD0EC887A8F04530DC95F1")

        int cursor;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.242 -0400", hash_original_field = "BB3AE5C41B0FFE5CC0DAF60D4592524F", hash_generated_field = "8BE11FCC759F9AA5663F1AF67D0DDBCD")

        int lastRet;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.242 -0400", hash_original_method = "3D5D0E3420638FA7514533715C7FD5D4", hash_generated_method = "EB06B38A7CA55EB34A1139317AF2CA46")
          Itr(Object[] array) {
            lastRet = -1;
            this.array = array;
            // ---------- Original Method ----------
            //lastRet = -1;
            //this.array = array;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.243 -0400", hash_original_method = "C1264B905CC60CA39EE5BE51F177AC9A", hash_generated_method = "7BF198D5C74150B357D86CDDDD929B86")
        public boolean hasNext() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_172819353 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_172819353;
            // ---------- Original Method ----------
            //return cursor < array.length;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.243 -0400", hash_original_method = "F81A0847679B1E16464240B404F27074", hash_generated_method = "A22B56AF700A87400659AF5D70D72F75")
        public E next() {
            E varB4EAC82CA7396A68D541C85D26508E83_1817918649 = null; //Variable for return #1
            if (DroidSafeAndroidRuntime.control) throw new NoSuchElementException();
            lastRet = cursor;
            varB4EAC82CA7396A68D541C85D26508E83_1817918649 = (E)array[cursor++];
            varB4EAC82CA7396A68D541C85D26508E83_1817918649.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_1817918649;
            // ---------- Original Method ----------
            //if (cursor >= array.length)
                //throw new NoSuchElementException();
            //lastRet = cursor;
            //return (E)array[cursor++];
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.244 -0400", hash_original_method = "1F047BB3E034A57C737F1A0202C892CE", hash_generated_method = "08E09F4344B39683C618BD42C209568B")
        public void remove() {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException();
            removeEQ(array[lastRet]);
            lastRet = -1;
            // ---------- Original Method ----------
            //if (lastRet < 0)
                //throw new IllegalStateException();
            //removeEQ(array[lastRet]);
            //lastRet = -1;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.244 -0400", hash_original_field = "6586B719D1CFEBF763733CE7541EF857", hash_generated_field = "C79B4E5249391BCFC09BA8F5EBED5B33")

    private static long serialVersionUID = 5595510919245408276L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.244 -0400", hash_original_field = "E9227ABF9BE6865B37299BE3C2962628", hash_generated_field = "D3DF17C6FDE1C078E068BD135F4E57FB")

    private static int DEFAULT_INITIAL_CAPACITY = 11;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.244 -0400", hash_original_field = "7495A79320523C6630B77A5679432676", hash_generated_field = "84B86A4B858A693C254DFC874A964D65")

    private static int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.244 -0400", hash_original_field = "3E088F71F6042050BDAAA79B57C7A5CD", hash_generated_field = "C80AC2E3A7FB8F5C36B566CB2C09667F")

    private static sun.misc.Unsafe UNSAFE = sun.misc.Unsafe.getUnsafe();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:57.244 -0400", hash_original_field = "FB72FFD9F0A458E85B595F5B3C6B2241", hash_generated_field = "C2AD30373E1F98DED667F80C281D7F7B")

    private static long allocationSpinLockOffset = objectFieldOffset(UNSAFE, "allocationSpinLock",
                          PriorityBlockingQueue.class);
}

