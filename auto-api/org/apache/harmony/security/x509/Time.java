package org.apache.harmony.security.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.apache.harmony.security.asn1.ASN1Choice;
import org.apache.harmony.security.asn1.ASN1GeneralizedTime;
import org.apache.harmony.security.asn1.ASN1Type;
import org.apache.harmony.security.asn1.ASN1UTCTime;

public final class Time {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.323 -0400", hash_original_method = "60A6F367D2F724DF18FDD3D5AB6D0102", hash_generated_method = "60A6F367D2F724DF18FDD3D5AB6D0102")
    public Time ()
    {
        //Synthesized constructor
    }


    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.324 -0400", hash_original_field = "DA43EA6AD8CF8BCDE2F986867809F928", hash_generated_field = "31C905BA88927274FF817750B344F25A")

    private static long JAN_01_2050 = 2524608000000L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:10.324 -0400", hash_original_field = "D4CE7ED758AC0A209131DFF4462353A2", hash_generated_field = "E0A02F87CBE396A8FFA512F3071B8CD6")

    public static final ASN1Choice ASN1 = new ASN1Choice(new ASN1Type[] {
            ASN1GeneralizedTime.getInstance(), ASN1UTCTime.getInstance() }) {

        public int getIndex(java.lang.Object object) {
            
            if (((java.util.Date) object).getTime() < JAN_01_2050) {
                return 1; 
            } else {
                return 0; 
            }
        }

        public Object getObjectToEncode(Object object) {
            return object;
        }
    };
}

