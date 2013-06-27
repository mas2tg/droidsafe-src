package java.nio;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

abstract class LongArrayBuffer extends LongBuffer {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.675 -0400", hash_original_field = "8D50CD27AA8B6BEC65C484FFCC5B2334", hash_generated_field = "328A8BF34389CAFD34319C79BCDE07B5")

    protected long[] backingArray;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.675 -0400", hash_original_field = "7A86C157EE9713C34FBD7A1EE40F0C5A", hash_generated_field = "22BBBB3BDBDCD622FED3EBF1A70B4EC5")

    protected int offset;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.687 -0400", hash_original_method = "D20A97F337BC1EF41CF62C2D80A010BB", hash_generated_method = "FE0F345F00C1A48D4CB6AE2613BACF04")
      LongArrayBuffer(long[] array) {
        this(array.length, array, 0);
        addTaint(array[0]);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.687 -0400", hash_original_method = "EE894B007B87BC6BD13255E42716BBF0", hash_generated_method = "5AFAF67FACB01860C017417566B36978")
      LongArrayBuffer(int capacity) {
        this(capacity, new long[capacity], 0);
        addTaint(capacity);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.689 -0400", hash_original_method = "C693B30298FFAD9EFA29C4595321A1EB", hash_generated_method = "418079C70DB1152B059EE355A3C853A5")
      LongArrayBuffer(int capacity, long[] backingArray, int offset) {
        super(capacity);
        this.backingArray = backingArray;
        this.offset = offset;
        addTaint(capacity);
        // ---------- Original Method ----------
        //this.backingArray = backingArray;
        //this.offset = offset;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.691 -0400", hash_original_method = "E2FF30257BFFCB6B65D7425E7B88C7B2", hash_generated_method = "628F624A06CE3688BF4F1B80D2372A9F")
    @Override
    public final long get() {
        {
            if (DroidSafeAndroidRuntime.control) throw new BufferUnderflowException();
        } //End block
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1870102062 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1870102062;
        // ---------- Original Method ----------
        //if (position == limit) {
            //throw new BufferUnderflowException();
        //}
        //return backingArray[offset + position++];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.691 -0400", hash_original_method = "E501A733A2C96D5405AAE01CF07D222B", hash_generated_method = "99C481AEEBCA48F7B4595B76B6B8D402")
    @Override
    public final long get(int index) {
        checkIndex(index);
        addTaint(index);
        long var0F5264038205EDFB1AC05FBB0E8C5E94_2102069499 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_2102069499;
        // ---------- Original Method ----------
        //checkIndex(index);
        //return backingArray[offset + index];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.692 -0400", hash_original_method = "E85CBDF91AD45B8A94165F7B57575CBE", hash_generated_method = "336F31A5721036FEEC8DBE02FC7EBE71")
    @Override
    public final LongBuffer get(long[] dst, int dstOffset, int longCount) {
        LongBuffer varB4EAC82CA7396A68D541C85D26508E83_1259797118 = null; //Variable for return #1
        {
            boolean var689C4001D724360528D46748438966DA_679263955 = (longCount > remaining());
            {
                if (DroidSafeAndroidRuntime.control) throw new BufferUnderflowException();
            } //End block
        } //End collapsed parenthetic
        System.arraycopy(backingArray, offset + position, dst, dstOffset, longCount);
        position += longCount;
        varB4EAC82CA7396A68D541C85D26508E83_1259797118 = this;
        addTaint(dst[0]);
        addTaint(dstOffset);
        addTaint(longCount);
        varB4EAC82CA7396A68D541C85D26508E83_1259797118.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1259797118;
        // ---------- Original Method ----------
        //if (longCount > remaining()) {
            //throw new BufferUnderflowException();
        //}
        //System.arraycopy(backingArray, offset + position, dst, dstOffset, longCount);
        //position += longCount;
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.703 -0400", hash_original_method = "5B6C9F359344527666A57577F107BCAE", hash_generated_method = "D43DE824EF09FF37A498C6C16084BA24")
    @Override
    public final boolean isDirect() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1478422513 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1478422513;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:45.703 -0400", hash_original_method = "A08DEC6C777D2C1D29E23F2F39FEA4AD", hash_generated_method = "79E5579E1619AAA94E94DE0310BE1A09")
    @Override
    public final ByteOrder order() {
        ByteOrder varB4EAC82CA7396A68D541C85D26508E83_286893515 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_286893515 = ByteOrder.nativeOrder();
        varB4EAC82CA7396A68D541C85D26508E83_286893515.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_286893515;
        // ---------- Original Method ----------
        //return ByteOrder.nativeOrder();
    }

    
}

