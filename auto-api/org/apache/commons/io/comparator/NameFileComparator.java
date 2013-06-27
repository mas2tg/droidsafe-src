package org.apache.commons.io.comparator;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.io.IOCase;

public class NameFileComparator extends AbstractFileComparator implements Serializable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.398 -0400", hash_original_field = "9AE1535F968174A45A688181FD26E8A9", hash_generated_field = "21450A3017D0D6122C0877D57300E67A")

    private IOCase caseSensitivity;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.409 -0400", hash_original_method = "73B7A0C9686C873C380A7B8BF0105C29", hash_generated_method = "6B9AD2AB4A4F465B08DBD9725F31EFC7")
    public  NameFileComparator() {
        this.caseSensitivity = IOCase.SENSITIVE;
        // ---------- Original Method ----------
        //this.caseSensitivity = IOCase.SENSITIVE;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.410 -0400", hash_original_method = "D665A56B967657697241157E26C6DEC4", hash_generated_method = "21443EA44434C3425B617F9832F43EEE")
    public  NameFileComparator(IOCase caseSensitivity) {
        this.caseSensitivity = caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity;
        // ---------- Original Method ----------
        //this.caseSensitivity = caseSensitivity == null ? IOCase.SENSITIVE : caseSensitivity;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.410 -0400", hash_original_method = "63DEB46C163A106B104143300A10799E", hash_generated_method = "CE2DA92EE40600A19079AD2A8BF51095")
    public int compare(File file1, File file2) {
        int varAF16E1AD36A45FF92DA03214F2807904_1126946583 = (caseSensitivity.checkCompareTo(file1.getName(), file2.getName()));
        addTaint(file1.getTaint());
        addTaint(file2.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1434750102 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1434750102;
        // ---------- Original Method ----------
        //return caseSensitivity.checkCompareTo(file1.getName(), file2.getName());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.410 -0400", hash_original_method = "2C8858F1FEF258A79F4059C0A1CB8058", hash_generated_method = "12F09173A864838821ED1DA816A85C04")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_86209438 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_86209438 = super.toString() + "[caseSensitivity=" + caseSensitivity + "]";
        varB4EAC82CA7396A68D541C85D26508E83_86209438.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_86209438;
        // ---------- Original Method ----------
        //return super.toString() + "[caseSensitivity=" + caseSensitivity + "]";
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.410 -0400", hash_original_field = "35ED7CE72FF4B3E136971A5DDCB31F37", hash_generated_field = "D2692FCB5F0CC8A92B340B3B44820BBB")

    public static final Comparator<File> NAME_COMPARATOR = new NameFileComparator();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.410 -0400", hash_original_field = "36119C5A78376D6856A6D3463FD2712E", hash_generated_field = "A63D6B9684C1E8A5C3D2C0577CEE5178")

    public static final Comparator<File> NAME_REVERSE = new ReverseComparator(NAME_COMPARATOR);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.411 -0400", hash_original_field = "21D45690C150A0A51472624F88CFF210", hash_generated_field = "3922B859CAAA71B818757F740907C8BD")

    public static final Comparator<File> NAME_INSENSITIVE_COMPARATOR = new NameFileComparator(IOCase.INSENSITIVE);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.411 -0400", hash_original_field = "5F2AAAC4F8ACCFC44D17F2BA73B47AF5", hash_generated_field = "F544E67851C2065C11339C7370E3595A")

    public static final Comparator<File> NAME_INSENSITIVE_REVERSE = new ReverseComparator(NAME_INSENSITIVE_COMPARATOR);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.411 -0400", hash_original_field = "BCFD0E33726F3BB0C4528F0911CB8648", hash_generated_field = "1AC1C6FF1EEC32745ACBC75B14EE7156")

    public static final Comparator<File> NAME_SYSTEM_COMPARATOR = new NameFileComparator(IOCase.SYSTEM);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:06.411 -0400", hash_original_field = "1CE9E03EC5218845DEC4A33C83B1CCFB", hash_generated_field = "8F91729C6A2D6523D60FCE78EA7688DB")

    public static final Comparator<File> NAME_SYSTEM_REVERSE = new ReverseComparator(NAME_SYSTEM_COMPARATOR);
}

