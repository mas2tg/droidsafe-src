package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import libcore.util.EmptyArray;

public class ArrayList<E> extends AbstractList<E> implements Cloneable, Serializable, RandomAccess {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.448 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "673BDAEBF4FBC900963E210E042549D6")

    int size;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.448 -0400", hash_original_field = "F1F713C9E000F5D3F280ADBD124DF4F5", hash_generated_field = "7675584818BEF48C593B15A4C030F967")

    transient Object[] array;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.457 -0400", hash_original_method = "3E3801877D646C78E965A019C35437FB", hash_generated_method = "787A8AE4754B859BD998B72D9CEADBE9")
    public  ArrayList(int capacity) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
        } //End block
        array = (capacity == 0 ? EmptyArray.OBJECT : new Object[capacity]);
        // ---------- Original Method ----------
        //if (capacity < 0) {
            //throw new IllegalArgumentException();
        //}
        //array = (capacity == 0 ? EmptyArray.OBJECT : new Object[capacity]);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.457 -0400", hash_original_method = "A7503C07B95C656689F43518416554F0", hash_generated_method = "A3AEAA024802F16BF2F719D937C47F2E")
    public  ArrayList() {
        array = EmptyArray.OBJECT;
        // ---------- Original Method ----------
        //array = EmptyArray.OBJECT;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.457 -0400", hash_original_method = "AE7C60C91D4192AC5637CB5677158233", hash_generated_method = "F00F7D20693EDF48C83AADF7F90557FF")
    public  ArrayList(Collection<? extends E> collection) {
        Object[] a;
        a = collection.toArray();
        {
            boolean var16F77EF61B9474A82FE398A385F0E9B1_1861681853 = (a.getClass() != Object[].class);
            {
                Object[] newArray;
                newArray = new Object[a.length];
                System.arraycopy(a, 0, newArray, 0, a.length);
                a = newArray;
            } //End block
        } //End collapsed parenthetic
        array = a;
        size = a.length;
        addTaint(collection.getTaint());
        // ---------- Original Method ----------
        //Object[] a = collection.toArray();
        //if (a.getClass() != Object[].class) {
            //Object[] newArray = new Object[a.length];
            //System.arraycopy(a, 0, newArray, 0, a.length);
            //a = newArray;
        //}
        //array = a;
        //size = a.length;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.462 -0400", hash_original_method = "2E95EC775538EB90DD9A0EBE35FC856F", hash_generated_method = "07C75FE1C9A2B2AF7FA6D4580FE2DBC6")
    @Override
    public boolean add(E object) {
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            Object[] newArray;
            newArray = new Object[s +
                    (s < (MIN_CAPACITY_INCREMENT / 2) ?
                     MIN_CAPACITY_INCREMENT : s >> 1)];//DSFIXME:  CODE0008: Nested ternary operator in expression
            System.arraycopy(a, 0, newArray, 0, s);
            array = a = newArray;
        } //End block
        a[s] = object;
        size = s + 1;
        addTaint(object.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_853844497 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_853844497;
        // ---------- Original Method ----------
        //Object[] a = array;
        //int s = size;
        //if (s == a.length) {
            //Object[] newArray = new Object[s +
                    //(s < (MIN_CAPACITY_INCREMENT / 2) ?
                     //MIN_CAPACITY_INCREMENT : s >> 1)];
            //System.arraycopy(a, 0, newArray, 0, s);
            //array = a = newArray;
        //}
        //a[s] = object;
        //size = s + 1;
        //modCount++;
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.464 -0400", hash_original_method = "C5A93B072C15A6072F87F254E0F87786", hash_generated_method = "8A21790609C3C3350A9A2CEDE25D259F")
    @Override
    public void add(int index, E object) {
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            throwIndexOutOfBoundsException(index, s);
        } //End block
        {
            System.arraycopy(a, index, a, index + 1, s - index);
        } //End block
        {
            Object[] newArray;
            newArray = new Object[newCapacity(s)];
            System.arraycopy(a, 0, newArray, 0, index);
            System.arraycopy(a, index, newArray, index + 1, s - index);
            array = a = newArray;
        } //End block
        a[index] = object;
        size = s + 1;
        addTaint(index);
        addTaint(object.getTaint());
        // ---------- Original Method ----------
        //Object[] a = array;
        //int s = size;
        //if (index > s || index < 0) {
            //throwIndexOutOfBoundsException(index, s);
        //}
        //if (s < a.length) {
            //System.arraycopy(a, index, a, index + 1, s - index);
        //} else {
            //Object[] newArray = new Object[newCapacity(s)];
            //System.arraycopy(a, 0, newArray, 0, index);
            //System.arraycopy(a, index, newArray, index + 1, s - index);
            //array = a = newArray;
        //}
        //a[index] = object;
        //size = s + 1;
        //modCount++;
    }

    
        private static int newCapacity(int currentCapacity) {
        int increment = (currentCapacity < (MIN_CAPACITY_INCREMENT / 2) ?
                MIN_CAPACITY_INCREMENT : currentCapacity >> 1);
        return currentCapacity + increment;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.469 -0400", hash_original_method = "C337453C40DBE6A93E9B9333DA2BDDBD", hash_generated_method = "0FB56033B1CB9FAAFD49A82C4420E800")
    @Override
    public boolean addAll(Collection<? extends E> collection) {
        Object[] newPart;
        newPart = collection.toArray();
        int newPartSize;
        newPartSize = newPart.length;
        Object[] a;
        a = array;
        int s;
        s = size;
        int newSize;
        newSize = s + newPartSize;
        {
            int newCapacity;
            newCapacity = newCapacity(newSize - 1);
            Object[] newArray;
            newArray = new Object[newCapacity];
            System.arraycopy(a, 0, newArray, 0, s);
            array = a = newArray;
        } //End block
        System.arraycopy(newPart, 0, a, s, newPartSize);
        size = newSize;
        addTaint(collection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1618818284 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1618818284;
        // ---------- Original Method ----------
        //Object[] newPart = collection.toArray();
        //int newPartSize = newPart.length;
        //if (newPartSize == 0) {
            //return false;
        //}
        //Object[] a = array;
        //int s = size;
        //int newSize = s + newPartSize;
        //if (newSize > a.length) {
            //int newCapacity = newCapacity(newSize - 1);  
            //Object[] newArray = new Object[newCapacity];
            //System.arraycopy(a, 0, newArray, 0, s);
            //array = a = newArray;
        //}
        //System.arraycopy(newPart, 0, a, s, newPartSize);
        //size = newSize;
        //modCount++;
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.470 -0400", hash_original_method = "878D1F0A34AD7389A9EB37A1AF5C813D", hash_generated_method = "4F1A3782EAF2416EFAA9BF14DC51F151")
    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {
        int s;
        s = size;
        {
            throwIndexOutOfBoundsException(index, s);
        } //End block
        Object[] newPart;
        newPart = collection.toArray();
        int newPartSize;
        newPartSize = newPart.length;
        Object[] a;
        a = array;
        int newSize;
        newSize = s + newPartSize;
        {
            System.arraycopy(a, index, a, index + newPartSize, s - index);
        } //End block
        {
            int newCapacity;
            newCapacity = newCapacity(newSize - 1);
            Object[] newArray;
            newArray = new Object[newCapacity];
            System.arraycopy(a, 0, newArray, 0, index);
            System.arraycopy(a, index, newArray, index + newPartSize, s-index);
            array = a = newArray;
        } //End block
        System.arraycopy(newPart, 0, a, index, newPartSize);
        size = newSize;
        addTaint(index);
        addTaint(collection.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1861452215 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1861452215;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        static IndexOutOfBoundsException throwIndexOutOfBoundsException(int index, int size) {
        throw new IndexOutOfBoundsException("Invalid index " + index + ", size is " + size);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.473 -0400", hash_original_method = "C8A90352D37E56C32915D97A4B0A7D28", hash_generated_method = "32F9F0A50B6063DF0522FFBEB7BCE20A")
    @Override
    public void clear() {
        {
            Arrays.fill(array, 0, size, null);
            size = 0;
        } //End block
        // ---------- Original Method ----------
        //if (size != 0) {
            //Arrays.fill(array, 0, size, null);
            //size = 0;
            //modCount++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.473 -0400", hash_original_method = "B3DA051C4891B8092C007B9652169D27", hash_generated_method = "5207D2E878AED5ABCC57E06A15BA85BE")
    @Override
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1860208681 = null; //Variable for return #1
        try 
        {
            ArrayList<?> result;
            result = (ArrayList<?>) super.clone();
            result.array = array.clone();
            varB4EAC82CA7396A68D541C85D26508E83_1860208681 = result;
        } //End block
        catch (CloneNotSupportedException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1860208681.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1860208681;
        // ---------- Original Method ----------
        //try {
            //ArrayList<?> result = (ArrayList<?>) super.clone();
            //result.array = array.clone();
            //return result;
        //} catch (CloneNotSupportedException e) {
           //throw new AssertionError();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.475 -0400", hash_original_method = "0AF2E3B013DB3C28C26CEAAD130BA61A", hash_generated_method = "1D3CC7BEF64E34603D17B3D00CF1799A")
    public void ensureCapacity(int minimumCapacity) {
        Object[] a;
        a = array;
        {
            Object[] newArray;
            newArray = new Object[minimumCapacity];
            System.arraycopy(a, 0, newArray, 0, size);
            array = newArray;
        } //End block
        addTaint(minimumCapacity);
        // ---------- Original Method ----------
        //Object[] a = array;
        //if (a.length < minimumCapacity) {
            //Object[] newArray = new Object[minimumCapacity];
            //System.arraycopy(a, 0, newArray, 0, size);
            //array = newArray;
            //modCount++;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.475 -0400", hash_original_method = "BE11B967A1A0587EBAE1CDD4CD567558", hash_generated_method = "B8BD41DD5DF6EFA5813DC5928D8960B3")
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        E varB4EAC82CA7396A68D541C85D26508E83_596995713 = null; //Variable for return #1
        {
            throwIndexOutOfBoundsException(index, size);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_596995713 = (E) array[index];
        addTaint(index);
        varB4EAC82CA7396A68D541C85D26508E83_596995713.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_596995713;
        // ---------- Original Method ----------
        //if (index >= size) {
            //throwIndexOutOfBoundsException(index, size);
        //}
        //return (E) array[index];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.481 -0400", hash_original_method = "3CA361324F026F8C9B0AA94A864ACDD9", hash_generated_method = "5DAF3D62247C395FA362388CBA0BA5C8")
    @Override
    public int size() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1785363515 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1785363515;
        // ---------- Original Method ----------
        //return size;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.489 -0400", hash_original_method = "186376BCBF1440029A4A8EF9D3327AB7", hash_generated_method = "3194F4FFE5F90206A3BC6AFCB66F592F")
    @Override
    public boolean isEmpty() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_278130944 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_278130944;
        // ---------- Original Method ----------
        //return size == 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.489 -0400", hash_original_method = "64966ED2F2DBD125FF02B9B2F4262D7F", hash_generated_method = "9EEA382B36D6E4C553D8E77103FE69D1")
    @Override
    public boolean contains(Object object) {
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            {
                int i;
                i = 0;
                {
                    {
                        boolean varA6976E8F17BE504D77EDD08C90B63DC8_1298152610 = (object.equals(a[i]));
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                int i;
                i = 0;
            } //End collapsed parenthetic
        } //End block
        addTaint(object.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1751195996 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1751195996;
        // ---------- Original Method ----------
        //Object[] a = array;
        //int s = size;
        //if (object != null) {
            //for (int i = 0; i < s; i++) {
                //if (object.equals(a[i])) {
                    //return true;
                //}
            //}
        //} else {
            //for (int i = 0; i < s; i++) {
                //if (a[i] == null) {
                    //return true;
                //}
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.490 -0400", hash_original_method = "0D1C6275419222204CF4CD7DEABF4627", hash_generated_method = "5AE356FF7C51FCF05B4F396C52E5FAB8")
    @Override
    public int indexOf(Object object) {
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            {
                int i;
                i = 0;
                {
                    {
                        boolean varA6976E8F17BE504D77EDD08C90B63DC8_801102592 = (object.equals(a[i]));
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                int i;
                i = 0;
            } //End collapsed parenthetic
        } //End block
        addTaint(object.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_162829646 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_162829646;
        // ---------- Original Method ----------
        //Object[] a = array;
        //int s = size;
        //if (object != null) {
            //for (int i = 0; i < s; i++) {
                //if (object.equals(a[i])) {
                    //return i;
                //}
            //}
        //} else {
            //for (int i = 0; i < s; i++) {
                //if (a[i] == null) {
                    //return i;
                //}
            //}
        //}
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.490 -0400", hash_original_method = "A33DDE97246530740ADA37CC6A9CC384", hash_generated_method = "8F1D812126883ECB0CFA3E92C47B519E")
    @Override
    public int lastIndexOf(Object object) {
        Object[] a;
        a = array;
        {
            {
                int i;
                i = size - 1;
                {
                    {
                        boolean varA6976E8F17BE504D77EDD08C90B63DC8_320095905 = (object.equals(a[i]));
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                int i;
                i = size - 1;
            } //End collapsed parenthetic
        } //End block
        addTaint(object.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1021384089 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1021384089;
        // ---------- Original Method ----------
        //Object[] a = array;
        //if (object != null) {
            //for (int i = size - 1; i >= 0; i--) {
                //if (object.equals(a[i])) {
                    //return i;
                //}
            //}
        //} else {
            //for (int i = size - 1; i >= 0; i--) {
                //if (a[i] == null) {
                    //return i;
                //}
            //}
        //}
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.491 -0400", hash_original_method = "A1787B19405DA1FA0654C3278265A2A8", hash_generated_method = "7F31BC1794031FD774592D13437A78E1")
    @Override
    public E remove(int index) {
        E varB4EAC82CA7396A68D541C85D26508E83_1633445041 = null; //Variable for return #1
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            throwIndexOutOfBoundsException(index, s);
        } //End block
        @SuppressWarnings("unchecked") E result;
        result = (E) a[index];
        System.arraycopy(a, index + 1, a, index, --s - index);
        a[s] = null;
        size = s;
        varB4EAC82CA7396A68D541C85D26508E83_1633445041 = result;
        addTaint(index);
        varB4EAC82CA7396A68D541C85D26508E83_1633445041.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1633445041;
        // ---------- Original Method ----------
        //Object[] a = array;
        //int s = size;
        //if (index >= s) {
            //throwIndexOutOfBoundsException(index, s);
        //}
        //@SuppressWarnings("unchecked") E result = (E) a[index];
        //System.arraycopy(a, index + 1, a, index, --s - index);
        //a[s] = null;
        //size = s;
        //modCount++;
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.492 -0400", hash_original_method = "C2B3C3C4D1766953FF0E432D86502585", hash_generated_method = "559A7A17FC0AD1DAF7D6B17D6F5C71F7")
    @Override
    public boolean remove(Object object) {
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            {
                int i;
                i = 0;
                {
                    {
                        boolean varA6976E8F17BE504D77EDD08C90B63DC8_1869816250 = (object.equals(a[i]));
                        {
                            System.arraycopy(a, i + 1, a, i, --s - i);
                            a[s] = null;
                            size = s;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                int i;
                i = 0;
                {
                    {
                        System.arraycopy(a, i + 1, a, i, --s - i);
                        a[s] = null;
                        size = s;
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(object.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1612669961 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1612669961;
        // ---------- Original Method ----------
        //Object[] a = array;
        //int s = size;
        //if (object != null) {
            //for (int i = 0; i < s; i++) {
                //if (object.equals(a[i])) {
                    //System.arraycopy(a, i + 1, a, i, --s - i);
                    //a[s] = null;  
                    //size = s;
                    //modCount++;
                    //return true;
                //}
            //}
        //} else {
            //for (int i = 0; i < s; i++) {
                //if (a[i] == null) {
                    //System.arraycopy(a, i + 1, a, i, --s - i);
                    //a[s] = null;  
                    //size = s;
                    //modCount++;
                    //return true;
                //}
            //}
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.493 -0400", hash_original_method = "D866DECE8E8344A6C98BF327EDBE1AFF", hash_generated_method = "02423E199BBD4B83D220499BC243FA0F")
    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        Object[] a;
        a = array;
        int s;
        s = size;
        {
            if (DroidSafeAndroidRuntime.control) throw new IndexOutOfBoundsException("fromIndex " + fromIndex
                    + " >= size " + size);
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IndexOutOfBoundsException("toIndex " + toIndex
                    + " > size " + size);
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IndexOutOfBoundsException("fromIndex " + fromIndex
                    + " > toIndex " + toIndex);
        } //End block
        System.arraycopy(a, toIndex, a, fromIndex, s - toIndex);
        int rangeSize;
        rangeSize = toIndex - fromIndex;
        Arrays.fill(a, s - rangeSize, s, null);
        size = s - rangeSize;
        addTaint(fromIndex);
        addTaint(toIndex);
        // ---------- Original Method ----------
        //if (fromIndex == toIndex) {
            //return;
        //}
        //Object[] a = array;
        //int s = size;
        //if (fromIndex >= s) {
            //throw new IndexOutOfBoundsException("fromIndex " + fromIndex
                    //+ " >= size " + size);
        //}
        //if (toIndex > s) {
            //throw new IndexOutOfBoundsException("toIndex " + toIndex
                    //+ " > size " + size);
        //}
        //if (fromIndex > toIndex) {
            //throw new IndexOutOfBoundsException("fromIndex " + fromIndex
                    //+ " > toIndex " + toIndex);
        //}
        //System.arraycopy(a, toIndex, a, fromIndex, s - toIndex);
        //int rangeSize = toIndex - fromIndex;
        //Arrays.fill(a, s - rangeSize, s, null);
        //size = s - rangeSize;
        //modCount++;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.493 -0400", hash_original_method = "F03306481ED210492B573188BD80D78C", hash_generated_method = "72CD92CB9AA49A68015118475BFDDC4A")
    @Override
    public E set(int index, E object) {
        E varB4EAC82CA7396A68D541C85D26508E83_840318851 = null; //Variable for return #1
        Object[] a;
        a = array;
        {
            throwIndexOutOfBoundsException(index, size);
        } //End block
        @SuppressWarnings("unchecked") E result;
        result = (E) a[index];
        a[index] = object;
        varB4EAC82CA7396A68D541C85D26508E83_840318851 = result;
        addTaint(index);
        addTaint(object.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_840318851.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_840318851;
        // ---------- Original Method ----------
        //Object[] a = array;
        //if (index >= size) {
            //throwIndexOutOfBoundsException(index, size);
        //}
        //@SuppressWarnings("unchecked") E result = (E) a[index];
        //a[index] = object;
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.506 -0400", hash_original_method = "52977A01663ACB51F489F59A603BA7D4", hash_generated_method = "F2DEF49C0AE525949C0B0959DFD0662C")
    @Override
    public Object[] toArray() {
        Object[] varB4EAC82CA7396A68D541C85D26508E83_1767469496 = null; //Variable for return #1
        int s;
        s = size;
        Object[] result;
        result = new Object[s];
        System.arraycopy(array, 0, result, 0, s);
        varB4EAC82CA7396A68D541C85D26508E83_1767469496 = result;
        varB4EAC82CA7396A68D541C85D26508E83_1767469496.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1767469496;
        // ---------- Original Method ----------
        //int s = size;
        //Object[] result = new Object[s];
        //System.arraycopy(array, 0, result, 0, s);
        //return result;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.507 -0400", hash_original_method = "C3B471E5DAFB04B40866B17E5BAEF530", hash_generated_method = "E85EC3557F5D8CBF980AFEA5F1936BB7")
    @Override
    public <T> T[] toArray(T[] contents) {
        T[] varB4EAC82CA7396A68D541C85D26508E83_1485083222 = null; //Variable for return #1
        int s;
        s = size;
        {
            @SuppressWarnings("unchecked") T[] newArray;
            newArray = (T[]) Array.newInstance(contents.getClass().getComponentType(), s);
            contents = newArray;
        } //End block
        System.arraycopy(this.array, 0, contents, 0, s);
        {
            contents[s] = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1485083222 = contents;
        addTaint(contents[0].getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1485083222.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1485083222;
        // ---------- Original Method ----------
        //int s = size;
        //if (contents.length < s) {
            //@SuppressWarnings("unchecked") T[] newArray
                //= (T[]) Array.newInstance(contents.getClass().getComponentType(), s);
            //contents = newArray;
        //}
        //System.arraycopy(this.array, 0, contents, 0, s);
        //if (contents.length > s) {
            //contents[s] = null;
        //}
        //return contents;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.507 -0400", hash_original_method = "7330C01325C25FBEA000A4F3E32D26DF", hash_generated_method = "647A3F4DBD2005BD55EDFEAA28693BFF")
    public void trimToSize() {
        int s;
        s = size;
        {
            array = EmptyArray.OBJECT;
        } //End block
        {
            Object[] newArray;
            newArray = new Object[s];
            System.arraycopy(array, 0, newArray, 0, s);
            array = newArray;
        } //End block
        // ---------- Original Method ----------
        //int s = size;
        //if (s == array.length) {
            //return;
        //}
        //if (s == 0) {
            //array = EmptyArray.OBJECT;
        //} else {
            //Object[] newArray = new Object[s];
            //System.arraycopy(array, 0, newArray, 0, s);
            //array = newArray;
        //}
        //modCount++;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.508 -0400", hash_original_method = "CE193891A7B397E3A9A2EF577B10DC50", hash_generated_method = "13DC6E4CAB70C26DFE860981486C8DB5")
    @Override
    public Iterator<E> iterator() {
        Iterator<E> varB4EAC82CA7396A68D541C85D26508E83_1405081152 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1405081152 = new ArrayListIterator();
        varB4EAC82CA7396A68D541C85D26508E83_1405081152.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1405081152;
        // ---------- Original Method ----------
        //return new ArrayListIterator();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.508 -0400", hash_original_method = "5DBD6A40EED7E4F643FF32288E994D2A", hash_generated_method = "F05ADF761D1409CE1AB7C9CB08D02DF5")
    @Override
    public int hashCode() {
        Object[] a;
        a = array;
        int hashCode;
        hashCode = 1;
        {
            int i, s;
            i = 0;
            s = size;
            {
                Object e;
                e = a[i];
                hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2123552439 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2123552439;
        // ---------- Original Method ----------
        //Object[] a = array;
        //int hashCode = 1;
        //for (int i = 0, s = size; i < s; i++) {
            //Object e = a[i];
            //hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        //}
        //return hashCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.525 -0400", hash_original_method = "B6BBD42460E139DEDE8E165726366EA3", hash_generated_method = "363FA92A8251343C16C1A0FB1DB324A4")
    @Override
    public boolean equals(Object o) {
        {
            boolean var6D2CFEECAA6CC7108820D0CDDD5631C7_178260525 = (o == this);
        } //End collapsed parenthetic
        List<?> that;
        that = (List<?>) o;
        int s;
        s = size;
        {
            boolean var6DDD04FB5A8F18C16A04CEB45843304E_2066632720 = (that.size() != s);
        } //End collapsed parenthetic
        Object[] a;
        a = array;
        {
            {
                int i;
                i = 0;
                {
                    Object eThis;
                    eThis = a[i];
                    Object ethat;
                    ethat = that.get(i);
                    {
                        {
                            boolean varEBC000A495141DDD1C176F0EB6DDFA1C_1692493482 = (!eThis.equals(ethat));
                        } //End flattened ternary
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            Iterator<?> it;
            it = that.iterator();
            {
                int i;
                i = 0;
                {
                    Object eThis;
                    eThis = a[i];
                    Object eThat;
                    eThat = it.next();
                    {
                        {
                            boolean var76B138E21032A28626298252682756E4_1185272416 = (!eThis.equals(eThat));
                        } //End flattened ternary
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(o.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2084250603 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2084250603;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.525 -0400", hash_original_method = "291F806CA114E9A8DDD079DF7CDB05EA", hash_generated_method = "A4A594F8B96820C282005B8F26D12EA6")
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(array.length);
        {
            int i;
            i = 0;
            {
                stream.writeObject(array[i]);
            } //End block
        } //End collapsed parenthetic
        addTaint(stream.getTaint());
        // ---------- Original Method ----------
        //stream.defaultWriteObject();
        //stream.writeInt(array.length);
        //for (int i = 0; i < size; i++) {
            //stream.writeObject(array[i]);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.526 -0400", hash_original_method = "07E10AF7F234C75E84F0879D60F4FA74", hash_generated_method = "52E7A3A70A6FF17A2C8877FF80973555")
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int cap;
        cap = stream.readInt();
        {
            if (DroidSafeAndroidRuntime.control) throw new InvalidObjectException(
                    "Capacity: " + cap + " < size: " + size);
        } //End block
        array = (cap == 0 ? EmptyArray.OBJECT : new Object[cap]);
        {
            int i;
            i = 0;
            {
                array[i] = stream.readObject();
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //stream.defaultReadObject();
        //int cap = stream.readInt();
        //if (cap < size) {
            //throw new InvalidObjectException(
                    //"Capacity: " + cap + " < size: " + size);
        //}
        //array = (cap == 0 ? EmptyArray.OBJECT : new Object[cap]);
        //for (int i = 0; i < size; i++) {
            //array[i] = stream.readObject();
        //}
    }

    
    private class ArrayListIterator implements Iterator<E> {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.526 -0400", hash_original_field = "D76D0FBFB93E4AF78A9BBB774A17F61B", hash_generated_field = "4C1C48D586843493C1E6DDDE251ECE70")

        private int remaining = size;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.526 -0400", hash_original_field = "9E2D0354A755F31DF2B86013A1F84ABE", hash_generated_field = "87A3426B077DEFAAD6A51D7DCC7B66F7")

        private int removalIndex = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.526 -0400", hash_original_field = "587E194BCD330DA9D6CB9DB53EA8709A", hash_generated_field = "70917CA63DF275E00A8791CE0E39E48E")

        private int expectedModCount = modCount;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.526 -0400", hash_original_method = "A2AE73C6B653383A81528A6CCE4C5FCB", hash_generated_method = "A2AE73C6B653383A81528A6CCE4C5FCB")
        public ArrayListIterator ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.526 -0400", hash_original_method = "44DFBDD5F60969C85FF7C62CEFF63BE1", hash_generated_method = "91C4D8F0662B512B976EFD0B815FB79E")
        public boolean hasNext() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_995772525 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_995772525;
            // ---------- Original Method ----------
            //return remaining != 0;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.527 -0400", hash_original_method = "4E01EE32653D357535C28CF692990943", hash_generated_method = "0C496C20DB2B05A09DBF6061CE6F5D85")
        @SuppressWarnings("unchecked")
        public E next() {
            E varB4EAC82CA7396A68D541C85D26508E83_330236709 = null; //Variable for return #1
            ArrayList<E> ourList;
            ourList = ArrayList.this;
            int rem;
            rem = remaining;
            {
                if (DroidSafeAndroidRuntime.control) throw new ConcurrentModificationException();
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new NoSuchElementException();
            } //End block
            remaining = rem - 1;
            varB4EAC82CA7396A68D541C85D26508E83_330236709 = (E) ourList.array[removalIndex = ourList.size - rem];
            varB4EAC82CA7396A68D541C85D26508E83_330236709.addTaint(getTaint()); //Add taint from parent
            return varB4EAC82CA7396A68D541C85D26508E83_330236709;
            // ---------- Original Method ----------
            //ArrayList<E> ourList = ArrayList.this;
            //int rem = remaining;
            //if (ourList.modCount != expectedModCount) {
                //throw new ConcurrentModificationException();
            //}
            //if (rem == 0) {
                //throw new NoSuchElementException();
            //}
            //remaining = rem - 1;
            //return (E) ourList.array[removalIndex = ourList.size - rem];
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.528 -0400", hash_original_method = "2CA6472AB4D5ED4AA6A79E4E390FB476", hash_generated_method = "5640C775C14A8753D9585C1BE4ADE039")
        public void remove() {
            Object[] a;
            a = array;
            int removalIdx;
            removalIdx = removalIndex;
            {
                if (DroidSafeAndroidRuntime.control) throw new ConcurrentModificationException();
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalStateException();
            } //End block
            System.arraycopy(a, removalIdx + 1, a, removalIdx, remaining);
            a[--size] = null;
            removalIndex = -1;
            expectedModCount = ++modCount;
            // ---------- Original Method ----------
            //Object[] a = array;
            //int removalIdx = removalIndex;
            //if (modCount != expectedModCount) {
                //throw new ConcurrentModificationException();
            //}
            //if (removalIdx < 0) {
                //throw new IllegalStateException();
            //}
            //System.arraycopy(a, removalIdx + 1, a, removalIdx, remaining);
            //a[--size] = null;
            //removalIndex = -1;
            //expectedModCount = ++modCount;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.537 -0400", hash_original_field = "F9F98993EEA9BE3997005456026F76D9", hash_generated_field = "0ADB9921F542B3480B7A783BB054702A")

    private static int MIN_CAPACITY_INCREMENT = 12;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:49.537 -0400", hash_original_field = "C1AC5D7497D25261150408B53250333D", hash_generated_field = "0E898385336822BE83EA11CBDBB69FA2")

    private static long serialVersionUID = 8683452581122892189L;
}

