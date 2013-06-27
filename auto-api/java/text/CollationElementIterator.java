package java.text;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import libcore.icu.CollationElementIteratorICU;

public final class CollationElementIterator {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.837 -0400", hash_original_field = "30A759D190B9BD50E37FE9E9A3CC3CC5", hash_generated_field = "84C6F5065A9015D8FD721C1742E21463")

    private CollationElementIteratorICU icuIterator;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.837 -0400", hash_original_method = "C4D82AD91997942FF2D2C5DD5D5F8256", hash_generated_method = "2A5E66AEE713561DB977D9A2014C7603")
      CollationElementIterator(CollationElementIteratorICU iterator) {
        this.icuIterator = iterator;
        // ---------- Original Method ----------
        //this.icuIterator = iterator;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.842 -0400", hash_original_method = "3D8662E172DF94DE766C937C706B5067", hash_generated_method = "1C0F3E9CBD7C4BB77F4351C8FF5FB9C9")
    public int getMaxExpansion(int order) {
        int var53B287FFE6A4D32D12803360CEDF35E3_1719043789 = (this.icuIterator.getMaxExpansion(order));
        addTaint(order);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_572752976 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_572752976;
        // ---------- Original Method ----------
        //return this.icuIterator.getMaxExpansion(order);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.843 -0400", hash_original_method = "86FFE9FC429F590289C595CEB48BC74B", hash_generated_method = "76FB53786DDEE8F1452D87A1B9F2302B")
    public int getOffset() {
        int var5739C0B4683059F65EBB237D4FD4211D_2018897693 = (this.icuIterator.getOffset());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1311172601 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1311172601;
        // ---------- Original Method ----------
        //return this.icuIterator.getOffset();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.844 -0400", hash_original_method = "57F823A473B8AE20AA92B1969F9DE507", hash_generated_method = "EACDDBDD6CB93D2EAEFD47132C1D726B")
    public int next() {
        int var066A4E6567C83EA54AE23323998B2CC8_493141423 = (this.icuIterator.next());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_169205469 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_169205469;
        // ---------- Original Method ----------
        //return this.icuIterator.next();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.844 -0400", hash_original_method = "3E3F3B80F1885FD18E0677AD75F46948", hash_generated_method = "BF46143401A2DEDBA62103B1F8143EC8")
    public int previous() {
        int varC24AAB22F8742E290FD8F53A2E6E0860_1706907124 = (this.icuIterator.previous());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1433408982 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1433408982;
        // ---------- Original Method ----------
        //return this.icuIterator.previous();
    }

    
        public static final int primaryOrder(int order) {
        return CollationElementIteratorICU.primaryOrder(order);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.844 -0400", hash_original_method = "CFBEE5200E8F292823205998EF4A1A4C", hash_generated_method = "317A1E790ADE9D574D1C254F3228769B")
    public void reset() {
        this.icuIterator.reset();
        // ---------- Original Method ----------
        //this.icuIterator.reset();
    }

    
        public static final short secondaryOrder(int order) {
        return (short) CollationElementIteratorICU.secondaryOrder(order);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.845 -0400", hash_original_method = "B5159E04ADD34F8792FC76901FA3C75B", hash_generated_method = "A07CCFA422054CD58D224664976D7AC4")
    public void setOffset(int newOffset) {
        this.icuIterator.setOffset(newOffset);
        addTaint(newOffset);
        // ---------- Original Method ----------
        //this.icuIterator.setOffset(newOffset);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.848 -0400", hash_original_method = "4B7E5FB8D17EE6600C521F075CD85C4D", hash_generated_method = "26A396D324C250CE0217BF22C38507DA")
    public void setText(CharacterIterator source) {
        this.icuIterator.setText(source);
        addTaint(source.getTaint());
        // ---------- Original Method ----------
        //this.icuIterator.setText(source);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.849 -0400", hash_original_method = "5641B3FAAAA5E41E8D2876C4B877177C", hash_generated_method = "EB92E4AF042884D10C97EA0C0888CCDF")
    public void setText(String source) {
        this.icuIterator.setText(source);
        addTaint(source.getTaint());
        // ---------- Original Method ----------
        //this.icuIterator.setText(source);
    }

    
        public static final short tertiaryOrder(int order) {
        return (short) CollationElementIteratorICU.tertiaryOrder(order);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:47.849 -0400", hash_original_field = "CDF72F05F93E159801A5871838A03D4C", hash_generated_field = "507498C0E339FEAE686FB3D8460C0395")

    public static final int NULLORDER = -1;
}

