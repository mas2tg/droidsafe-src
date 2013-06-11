package java.nio;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;


public final class ByteOrder {
    private static final ByteOrder NATIVE_ORDER;
    public static final ByteOrder BIG_ENDIAN;
    public static final ByteOrder LITTLE_ENDIAN;
    private final String name;
    public final boolean needsSwap;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.479 -0400", hash_original_method = "B317EBC8D5650E5C34B265838B9D3EC5", hash_generated_method = "84B2E7CC8878AF345C01E32217DC7536")
    @DSModeled(DSC.SAFE)
    private ByteOrder(String name, boolean needsSwap) {
        dsTaint.addTaint(needsSwap);
        dsTaint.addTaint(name);
        // ---------- Original Method ----------
        //this.name = name;
        //this.needsSwap = needsSwap;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.479 -0400", hash_original_method = "625760F1157C2F408F981CEA403AD7B4", hash_generated_method = "0F9CBCE24B45AED168E194ADA97C65A0")
    private static boolean isLittleEndian() {
        //DSFIXME:  CODE0010: Native static method requires manual modeling
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.479 -0400", hash_original_method = "D07BFAC609E59F2C654790B31AE5FD0D", hash_generated_method = "A24B785DD11572D2B52D969BDBCFE967")
    public static ByteOrder nativeOrder() {
        return NATIVE_ORDER;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.479 -0400", hash_original_method = "0EB66BA5E965B83E191719250E0A82FF", hash_generated_method = "61033FF7128FD0D2C124C7BC4289F7A2")
    @DSModeled(DSC.SAFE)
    @Override
    public String toString() {
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return name;
    }

    
    static {
        boolean isLittleEndian = isLittleEndian();
        BIG_ENDIAN = new ByteOrder("BIG_ENDIAN", isLittleEndian);
        LITTLE_ENDIAN = new ByteOrder("LITTLE_ENDIAN", !isLittleEndian);
        NATIVE_ORDER = isLittleEndian ? LITTLE_ENDIAN : BIG_ENDIAN;
    }
    
}


