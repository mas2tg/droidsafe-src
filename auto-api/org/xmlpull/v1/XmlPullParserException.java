package org.xmlpull.v1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class XmlPullParserException extends Exception {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.466 -0400", hash_original_field = "951DA6B7179A4F697CC89D36ACF74E52", hash_generated_field = "EDAD1988191BC8FE2A32ADF91A96320C")

    protected Throwable detail;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.466 -0400", hash_original_field = "22776FFD2C63CB4C7CEDBC66AF6F6A56", hash_generated_field = "156AAEA15ABF3CBA31DAC677D9612539")

    protected int row = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.466 -0400", hash_original_field = "B3A19A47A90FB8C09BFA54CBD0EAC83C", hash_generated_field = "A5B3244522132AF33705DB6C2189351A")

    protected int column = -1;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.467 -0400", hash_original_method = "81C346207A813FD28C849879E7041B6E", hash_generated_method = "B09839E492214B3948379BFD0CEB6868")
    public  XmlPullParserException(String s) {
        super(s);
        addTaint(s.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.467 -0400", hash_original_method = "28FAE29CB2E621B52838DE3161E10D49", hash_generated_method = "702DDD54A322997A4CC30F68A68CD103")
    public  XmlPullParserException(String msg, XmlPullParser parser, Throwable chain) {
        super ((msg == null ? "" : msg+" ")
               + (parser == null ? "" : "(position:"+parser.getPositionDescription()+") ")
               + (chain == null ? "" : "caused by: "+chain));
        {
            this.row = parser.getLineNumber();
            this.column = parser.getColumnNumber();
        } //End block
        this.detail = chain;
        addTaint(msg.getTaint());
        // ---------- Original Method ----------
        //if (parser != null) {
            //this.row = parser.getLineNumber();
            //this.column = parser.getColumnNumber();
        //}
        //this.detail = chain;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.470 -0400", hash_original_method = "94BA5080D380911C58CAC3733D4C69AF", hash_generated_method = "E97968EB3EE4DD53424DBAA4BB034DD3")
    public Throwable getDetail() {
        Throwable varB4EAC82CA7396A68D541C85D26508E83_105775946 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_105775946 = detail;
        varB4EAC82CA7396A68D541C85D26508E83_105775946.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_105775946;
        // ---------- Original Method ----------
        //return detail;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.471 -0400", hash_original_method = "0760FB4E162E5971E2E765B2D1FE0093", hash_generated_method = "C55FB3CC2F08765AB5E35A6A9CC64E3E")
    public int getLineNumber() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_512739374 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_512739374;
        // ---------- Original Method ----------
        //return row;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.471 -0400", hash_original_method = "52272B3AE5723072E22E93854866B927", hash_generated_method = "CA0C331F30CAA0477DA1F5D30EAC7022")
    public int getColumnNumber() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1715179841 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1715179841;
        // ---------- Original Method ----------
        //return column;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:22.472 -0400", hash_original_method = "5154476310B69FA819C717F88BC0BDF0", hash_generated_method = "BAFCA4B04999A280CFE0860DB3B9FE41")
    public void printStackTrace() {
        {
            super.printStackTrace();
        } //End block
        {
            {
                System.err.println(super.getMessage() + "; nested exception is:");
                detail.printStackTrace();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if (detail == null) {
            //super.printStackTrace();
        //} else {
            //synchronized(System.err) {
                //System.err.println(super.getMessage() + "; nested exception is:");
                //detail.printStackTrace();
            //}
        //}
    }

    
}

