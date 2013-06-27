package java.lang;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocal<T> {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.541 -0400", hash_original_field = "426DC84987C4B2179AAC3652CD9F0630", hash_generated_field = "E14646D6702A5CBF0A0BFB961D432098")

    private Reference<ThreadLocal<T>> reference = new WeakReference<ThreadLocal<T>>(this);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.541 -0400", hash_original_field = "2D91048F537A2D73A5B9E4039D2A22B5", hash_generated_field = "B821C80D50722B6632D94FA304F6CE88")

    private int hash = hashCounter.getAndAdd(0x61c88647 * 2);
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.542 -0400", hash_original_method = "CCBA978684365F19FBD68BD48C79C23F", hash_generated_method = "A892989B2AACDC92217F9E3C26407114")
    public  ThreadLocal() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.543 -0400", hash_original_method = "17AB1D63AD8B7EADE4880D6FD1744965", hash_generated_method = "6645616453D73305274ABB2362350F95")
    @SuppressWarnings("unchecked")
    public T get() {
        T varB4EAC82CA7396A68D541C85D26508E83_507352573 = null; //Variable for return #1
        T varB4EAC82CA7396A68D541C85D26508E83_687220591 = null; //Variable for return #2
        Thread currentThread;
        currentThread = Thread.currentThread();
        Values values;
        values = values(currentThread);
        {
            Object[] table;
            table = values.table;
            int index;
            index = hash & values.mask;
            {
                varB4EAC82CA7396A68D541C85D26508E83_507352573 = (T) table[index + 1];
            } //End block
        } //End block
        {
            values = initializeValues(currentThread);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_687220591 = (T) values.getAfterMiss(this);
        T varA7E53CE21691AB073D9660D615818899_1901855609; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1901855609 = varB4EAC82CA7396A68D541C85D26508E83_507352573;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1901855609 = varB4EAC82CA7396A68D541C85D26508E83_687220591;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1901855609.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1901855609;
        // ---------- Original Method ----------
        //Thread currentThread = Thread.currentThread();
        //Values values = values(currentThread);
        //if (values != null) {
            //Object[] table = values.table;
            //int index = hash & values.mask;
            //if (this.reference == table[index]) {
                //return (T) table[index + 1];
            //}
        //} else {
            //values = initializeValues(currentThread);
        //}
        //return (T) values.getAfterMiss(this);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.559 -0400", hash_original_method = "65001977AEEFEE3DB28BF88E33FB8DD1", hash_generated_method = "79F9C73AD9BA2A9D86B0EB80176B7369")
    protected T initialValue() {
        T varB4EAC82CA7396A68D541C85D26508E83_571990725 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_571990725 = null;
        varB4EAC82CA7396A68D541C85D26508E83_571990725.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_571990725;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.559 -0400", hash_original_method = "93D51722B7CB3C8EF0C38EE234F866B9", hash_generated_method = "A3BCC2D4946A015C8F11AF3E28E77FD1")
    public void set(T value) {
        Thread currentThread;
        currentThread = Thread.currentThread();
        Values values;
        values = values(currentThread);
        {
            values = initializeValues(currentThread);
        } //End block
        values.put(this, value);
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //Thread currentThread = Thread.currentThread();
        //Values values = values(currentThread);
        //if (values == null) {
            //values = initializeValues(currentThread);
        //}
        //values.put(this, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.559 -0400", hash_original_method = "E12F04AD7D9687B33AD1C273DE0809EB", hash_generated_method = "50DDBD2D144DB8649B8B5B9641348108")
    public void remove() {
        Thread currentThread;
        currentThread = Thread.currentThread();
        Values values;
        values = values(currentThread);
        {
            values.remove(this);
        } //End block
        // ---------- Original Method ----------
        //Thread currentThread = Thread.currentThread();
        //Values values = values(currentThread);
        //if (values != null) {
            //values.remove(this);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_method = "F6756F2BA503B7A43E41A22536745AD1", hash_generated_method = "1B0481F45123943BDB297A7602691AB5")
     Values initializeValues(Thread current) {
        Values varB4EAC82CA7396A68D541C85D26508E83_923174283 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_923174283 = current.localValues = new Values();
        addTaint(current.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_923174283.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_923174283;
        // ---------- Original Method ----------
        //return current.localValues = new Values();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_method = "303C743BABF91BBE1D2B949725040AC0", hash_generated_method = "5040378F25EA4A42BF5FAA1BE94A7321")
     Values values(Thread current) {
        Values varB4EAC82CA7396A68D541C85D26508E83_1530147592 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1530147592 = current.localValues;
        addTaint(current.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1530147592.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1530147592;
        // ---------- Original Method ----------
        //return current.localValues;
    }

    
    static class Values {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_field = "AAB9E1DE16F38176F86D7A92BA337A8D", hash_generated_field = "FD72DCEA1BA087F9DFD15C7A360AA526")

        private Object[] table;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_field = "F2CE11EBF110993621BEDD8E747D7B1B", hash_generated_field = "CB9C3356548F555F843424D7B01932DE")

        private int mask;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "F06612A05C836674433E69C513561353")

        private int size;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_field = "F665DDFDFDD1E28A26618501F76D7106", hash_generated_field = "97BD139A14B9108FDB72C084E57FF305")

        private int tombstones;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_field = "41A009FBDA3ED027F977216A29F00D00", hash_generated_field = "84B0D7BDAD4BEF6EA743B0D3D294E91E")

        private int maximumLoad;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.560 -0400", hash_original_field = "123402C04DCFB6625F688F771A5FC05D", hash_generated_field = "D443419CB814AFCD3668DE2EA3A4C6CB")

        private int clean;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.561 -0400", hash_original_method = "8603CA8C8DA2F2A8742D0D3D57F85A73", hash_generated_method = "0F4D9E6506A7695CFEA2C062F4777A67")
          Values() {
            initializeTable(INITIAL_SIZE);
            this.size = 0;
            this.tombstones = 0;
            // ---------- Original Method ----------
            //initializeTable(INITIAL_SIZE);
            //this.size = 0;
            //this.tombstones = 0;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.562 -0400", hash_original_method = "1543F2E70FF0D503FC0C174797134204", hash_generated_method = "F7721AC4BA5FF82A1C46E64C289CD04E")
          Values(Values fromParent) {
            this.table = fromParent.table.clone();
            this.mask = fromParent.mask;
            this.size = fromParent.size;
            this.tombstones = fromParent.tombstones;
            this.maximumLoad = fromParent.maximumLoad;
            this.clean = fromParent.clean;
            inheritValues(fromParent);
            // ---------- Original Method ----------
            //this.table = fromParent.table.clone();
            //this.mask = fromParent.mask;
            //this.size = fromParent.size;
            //this.tombstones = fromParent.tombstones;
            //this.maximumLoad = fromParent.maximumLoad;
            //this.clean = fromParent.clean;
            //inheritValues(fromParent);
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.580 -0400", hash_original_method = "9BD4203D3E5EBD7464FA7B2A4E6BD9E0", hash_generated_method = "4B58EE549BCD68D57A9DB85C65157A75")
        @SuppressWarnings({"unchecked"})
        private void inheritValues(Values fromParent) {
            Object[] table;
            table = this.table;
            {
                int i;
                i = table.length - 2;
                i -= 2;
                {
                    Object k;
                    k = table[i];
                    Reference<InheritableThreadLocal<?>> reference;
                    reference = (Reference<InheritableThreadLocal<?>>) k;
                    InheritableThreadLocal key;
                    key = reference.get();
                    {
                        table[i + 1] = key.childValue(fromParent.table[i + 1]);
                    } //End block
                    {
                        table[i] = TOMBSTONE;
                        table[i + 1] = null;
                        fromParent.table[i] = TOMBSTONE;
                        fromParent.table[i + 1] = null;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.581 -0400", hash_original_method = "8D46CF6663407215221C449D596ED15A", hash_generated_method = "C7EB45EBDA4EAA513131B1354BE102DF")
        private void initializeTable(int capacity) {
            this.table = new Object[capacity * 2];
            this.mask = table.length - 1;
            this.clean = 0;
            this.maximumLoad = capacity * 2 / 3;
            // ---------- Original Method ----------
            //this.table = new Object[capacity * 2];
            //this.mask = table.length - 1;
            //this.clean = 0;
            //this.maximumLoad = capacity * 2 / 3;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.582 -0400", hash_original_method = "9C8BB7874FA14669E3E1A4855CFECE2B", hash_generated_method = "B6FE9BCBD496BEA24D745ED1A6E9DD47")
        private void cleanUp() {
            {
                boolean var11013A33888A8BC57FF439A64A6EF186_12018032 = (rehash());
            } //End collapsed parenthetic
            int index;
            index = clean;
            Object[] table;
            table = this.table;
            {
                int counter;
                counter = table.length;
                counter >>= 1;
                index = next(index);
                {
                    Object k;
                    k = table[index];
                    @SuppressWarnings("unchecked") Reference<ThreadLocal<?>> reference;
                    reference = (Reference<ThreadLocal<?>>) k;
                    {
                        boolean var5DDBB567418B6E5B7055803AF7D32404_234040672 = (reference.get() == null);
                        {
                            table[index] = TOMBSTONE;
                            table[index + 1] = null;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            clean = index;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.589 -0400", hash_original_method = "D5329B07F2A83D8B781C7C8F5FD2D30A", hash_generated_method = "762C390D35C27D8958127AD88BCC0CBC")
        private boolean rehash() {
            int capacity;
            capacity = table.length >> 1;
            int newCapacity;
            newCapacity = capacity;
            {
                newCapacity = capacity * 2;
            } //End block
            Object[] oldTable;
            oldTable = this.table;
            initializeTable(newCapacity);
            this.tombstones = 0;
            {
                int i;
                i = oldTable.length - 2;
                i -= 2;
                {
                    Object k;
                    k = oldTable[i];
                    @SuppressWarnings("unchecked") Reference<ThreadLocal<?>> reference;
                    reference = (Reference<ThreadLocal<?>>) k;
                    ThreadLocal<?> key;
                    key = reference.get();
                    {
                        add(key, oldTable[i + 1]);
                    } //End block
                } //End block
            } //End collapsed parenthetic
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_37405645 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_37405645;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.590 -0400", hash_original_method = "8FD2790587F2719E68EBC052DE90327C", hash_generated_method = "E1343F1E9038570B7DAF7787246D4AF0")
         void add(ThreadLocal<?> key, Object value) {
            {
                int index;
                index = key.hash & mask;
                index = next(index);
                {
                    Object k;
                    k = table[index];
                    {
                        table[index] = key.reference;
                        table[index + 1] = value;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            // ---------- Original Method ----------
            //for (int index = key.hash & mask;; index = next(index)) {
                //Object k = table[index];
                //if (k == null) {
                    //table[index] = key.reference;
                    //table[index + 1] = value;
                    //return;
                //}
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.621 -0400", hash_original_method = "F7F8B7C8923C08ADEC94E7E7276E0E2F", hash_generated_method = "D097DDB9089EFCB97FC71B1FDBF02CDD")
         void put(ThreadLocal<?> key, Object value) {
            cleanUp();
            int firstTombstone;
            firstTombstone = -1;
            {
                int index;
                index = key.hash & mask;
                index = next(index);
                {
                    Object k;
                    k = table[index];
                    {
                        table[index + 1] = value;
                    } //End block
                    {
                        {
                            table[index] = key.reference;
                            table[index + 1] = value;
                        } //End block
                        table[firstTombstone] = key.reference;
                        table[firstTombstone + 1] = value;
                    } //End block
                    {
                        firstTombstone = index;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.626 -0400", hash_original_method = "27C70593962E283B71D24D73AE4C9368", hash_generated_method = "3B5125600EF6427CA010ED90B1692DBE")
         Object getAfterMiss(ThreadLocal<?> key) {
            Object varB4EAC82CA7396A68D541C85D26508E83_1318225503 = null; //Variable for return #1
            Object varB4EAC82CA7396A68D541C85D26508E83_694941037 = null; //Variable for return #2
            Object varB4EAC82CA7396A68D541C85D26508E83_272523778 = null; //Variable for return #3
            Object varB4EAC82CA7396A68D541C85D26508E83_232201541 = null; //Variable for return #4
            Object varB4EAC82CA7396A68D541C85D26508E83_555560744 = null; //Variable for return #5
            Object varB4EAC82CA7396A68D541C85D26508E83_420555023 = null; //Variable for return #6
            Object[] table;
            table = this.table;
            int index;
            index = key.hash & mask;
            {
                Object value;
                value = key.initialValue();
                {
                    table[index] = key.reference;
                    table[index + 1] = value;
                    cleanUp();
                    varB4EAC82CA7396A68D541C85D26508E83_1318225503 = value;
                } //End block
                put(key, value);
                varB4EAC82CA7396A68D541C85D26508E83_694941037 = value;
            } //End block
            int firstTombstone;
            firstTombstone = -1;
            {
                index = next(index);
                index = next(index);
                {
                    Object reference;
                    reference = table[index];
                    {
                        varB4EAC82CA7396A68D541C85D26508E83_272523778 = table[index + 1];
                    } //End block
                    {
                        Object value;
                        value = key.initialValue();
                        {
                            {
                                table[firstTombstone] = key.reference;
                                table[firstTombstone + 1] = value;
                                varB4EAC82CA7396A68D541C85D26508E83_232201541 = value;
                            } //End block
                            {
                                table[index] = key.reference;
                                table[index + 1] = value;
                                cleanUp();
                                varB4EAC82CA7396A68D541C85D26508E83_555560744 = value;
                            } //End block
                        } //End block
                        put(key, value);
                        varB4EAC82CA7396A68D541C85D26508E83_420555023 = value;
                    } //End block
                    {
                        firstTombstone = index;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            Object varA7E53CE21691AB073D9660D615818899_961032859; //Final return value
            switch (DroidSafeAndroidRuntime.switchControl) {
                case 1: //Assign result for return ordinal #1
                    varA7E53CE21691AB073D9660D615818899_961032859 = varB4EAC82CA7396A68D541C85D26508E83_1318225503;
                    break;
                case 2: //Assign result for return ordinal #2
                    varA7E53CE21691AB073D9660D615818899_961032859 = varB4EAC82CA7396A68D541C85D26508E83_694941037;
                    break;
                case 3: //Assign result for return ordinal #3
                    varA7E53CE21691AB073D9660D615818899_961032859 = varB4EAC82CA7396A68D541C85D26508E83_272523778;
                    break;
                case 4: //Assign result for return ordinal #4
                    varA7E53CE21691AB073D9660D615818899_961032859 = varB4EAC82CA7396A68D541C85D26508E83_232201541;
                    break;
                case 5: //Assign result for return ordinal #5
                    varA7E53CE21691AB073D9660D615818899_961032859 = varB4EAC82CA7396A68D541C85D26508E83_555560744;
                    break;
                default:
                    varA7E53CE21691AB073D9660D615818899_961032859 = varB4EAC82CA7396A68D541C85D26508E83_420555023;
                    break;
            }
            varA7E53CE21691AB073D9660D615818899_961032859.addTaint(getTaint()); //Add taint from parent
            return varA7E53CE21691AB073D9660D615818899_961032859;
            // ---------- Original Method ----------
            // Original Method Too Long, Refer to Original Implementation
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.628 -0400", hash_original_method = "0360B175C51ABE1598A686E1C95592B6", hash_generated_method = "BE86B7926709FB5A9374D36E924A2E87")
         void remove(ThreadLocal<?> key) {
            cleanUp();
            {
                int index;
                index = key.hash & mask;
                index = next(index);
                {
                    Object reference;
                    reference = table[index];
                    {
                        table[index] = TOMBSTONE;
                        table[index + 1] = null;
                    } //End block
                } //End block
            } //End collapsed parenthetic
            addTaint(key.getTaint());
            // ---------- Original Method ----------
            //cleanUp();
            //for (int index = key.hash & mask;; index = next(index)) {
                //Object reference = table[index];
                //if (reference == key.reference) {
                    //table[index] = TOMBSTONE;
                    //table[index + 1] = null;
                    //tombstones++;
                    //size--;
                    //return;
                //}
                //if (reference == null) {
                    //return;
                //}
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.630 -0400", hash_original_method = "A1B9AE6202C436A7C194238B45D86066", hash_generated_method = "9B240DA33CF170EE51C870E06E98FBC7")
        private int next(int index) {
            addTaint(index);
            int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1366213255 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1366213255;
            // ---------- Original Method ----------
            //return (index + 2) & mask;
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.630 -0400", hash_original_field = "DA9469906E1F2A2491D3A90AD3EDBF47", hash_generated_field = "36CC51CB37A058313D2CFAEA5D04DBA7")

        private static int INITIAL_SIZE = 16;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.630 -0400", hash_original_field = "7FF9D9BF98FB0E986E1BEB357C0948A3", hash_generated_field = "A8105D375ED6D2E349ED310B52D21573")

        private static Object TOMBSTONE = new Object();
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.631 -0400", hash_original_field = "4E607393E03575F758B020F7E9FA37D7", hash_generated_field = "D0904C715877D79D507857C3DBB2EE5E")

    private static AtomicInteger hashCounter = new AtomicInteger(0);
}

