package org.bouncycastle.asn1.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERString;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class X509Name extends ASN1Encodable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "A34048331D21536E4DEEECC5E8A1DED5", hash_generated_field = "9B1A952CEBF3178959A402DABEDC0A6B")

    private X509NameEntryConverter converter = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "1E8C32F4C6EEE7D3CD7F8426CD048BA3", hash_generated_field = "C8A65116741473EAA58816E75213B0AF")

    private Vector ordering = new Vector();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "7BCFB62748A3418E1EB532A92A7C5C78", hash_generated_field = "F7859DDEE63780863860095D2E4D0AB7")

    private Vector values = new Vector();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "ADFA51CFEE10A2F9F8E091B21ABE19E2", hash_generated_field = "93EE51D59E70850C8E38EBF0508102EE")

    private Vector added = new Vector();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "E068C2DE26D760F20CF10AFC4B87EF0F", hash_generated_field = "37E06257AFCE21CC4EDFE67F34DC271C")

    private ASN1Sequence seq;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "DE525AA08E2B8CBA006E16ED96D38FAC", hash_generated_field = "FFD3E18FB59EA084D3FD8E8945E2AACA")

    private boolean isHashCodeCalculated;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.475 -0400", hash_original_field = "4D002D69417019F289C8061B82207DD2", hash_generated_field = "D4D90810E0E6D99534BB2E8797B7FFA9")

    private int hashCodeValue;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.480 -0400", hash_original_method = "E0A402814C87C5337199B2B0EDD62792", hash_generated_method = "057550D58678CB656F886F7D19F48820")
    protected  X509Name() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.487 -0400", hash_original_method = "88A842BBAF40DA82D57137327D6884BA", hash_generated_method = "23D169074E4F90FC1B75D96A33ADF67D")
    public  X509Name(
        ASN1Sequence  seq) {
        this.seq = seq;
        Enumeration e;
        e = seq.getObjects();
        {
            boolean var3EB0A96682EDBE15308427BAC1EC4A4E_206718346 = (e.hasMoreElements());
            {
                ASN1Set set;
                set = ASN1Set.getInstance(((DEREncodable)e.nextElement()).getDERObject());
                {
                    int i;
                    i = 0;
                    boolean var283F9D758C051A5B97CBA76EAC39D561_761480340 = (i < set.size());
                    {
                        ASN1Sequence s;
                        s = ASN1Sequence.getInstance(set.getObjectAt(i));
                        {
                            boolean varB472F5D289D7DE3844A48FE91292B433_105179733 = (s.size() != 2);
                            {
                                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("badly sized pair");
                            } //End block
                        } //End collapsed parenthetic
                        ordering.addElement(DERObjectIdentifier.getInstance(s.getObjectAt(0)));
                        DEREncodable value;
                        value = s.getObjectAt(1);
                        {
                            String v;
                            v = ((DERString)value).getString();
                            {
                                boolean var148096EA0015061ACECD9B92902C453A_1898310870 = (v.length() > 0 && v.charAt(0) == '#');
                                {
                                    values.addElement("\\" + v);
                                } //End block
                                {
                                    values.addElement(v);
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                        {
                            values.addElement("#" + bytesToString(Hex.encode(value.getDERObject().getDEREncoded())));
                        } //End block
                        added.addElement(Boolean.valueOf(i != 0));
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.488 -0400", hash_original_method = "E338E099196C520643EABA462B148868", hash_generated_method = "4F3D38547E82E9E318C39F8B7A6E3207")
    public  X509Name(
        Hashtable  attributes) {
        this(null, attributes);
        addTaint(attributes.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.488 -0400", hash_original_method = "0E56A2506DE147DC0FDCD121F4661515", hash_generated_method = "F9EA526E9D9AC86340716A8C2E735E8A")
    public  X509Name(
        Vector      ordering,
        Hashtable   attributes) {
        this(ordering, attributes, new X509DefaultEntryConverter());
        addTaint(ordering.getTaint());
        addTaint(attributes.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.491 -0400", hash_original_method = "391D1DCB58738C4647988CF64EC70334", hash_generated_method = "3234858B56E719F0DCA43EEBCCB425D4")
    public  X509Name(
        Vector                   ordering,
        Hashtable                attributes,
        X509NameEntryConverter   converter) {
        this.converter = converter;
        {
            {
                int i;
                i = 0;
                boolean varA4D4DEC0DFCDB9B177EA78FEB51EFCA1_1286567781 = (i != ordering.size());
                {
                    this.ordering.addElement(ordering.elementAt(i));
                    this.added.addElement(FALSE);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            Enumeration e;
            e = attributes.keys();
            {
                boolean varE6301E07393E7C92A45A62612E875EEF_90857210 = (e.hasMoreElements());
                {
                    this.ordering.addElement(e.nextElement());
                    this.added.addElement(FALSE);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            int i;
            i = 0;
            boolean var934E5750B049A4DE3D33E178A08E8CB6_2133529350 = (i != this.ordering.size());
            {
                DERObjectIdentifier oid;
                oid = (DERObjectIdentifier)this.ordering.elementAt(i);
                {
                    boolean var86267A2CC393FE443165C51002699A8D_2065802969 = (attributes.get(oid) == null);
                    {
                        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("No attribute for object id - " + oid.getId() + " - passed to distinguished name");
                    } //End block
                } //End collapsed parenthetic
                this.values.addElement(attributes.get(oid));
            } //End block
        } //End collapsed parenthetic
        addTaint(ordering.getTaint());
        addTaint(attributes.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.492 -0400", hash_original_method = "09339315E74F09704223BAA476796553", hash_generated_method = "DB96580F3F37A8D34A7BFC738E60993D")
    public  X509Name(
        Vector  oids,
        Vector  values) {
        this(oids, values, new X509DefaultEntryConverter());
        addTaint(oids.getTaint());
        addTaint(values.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.498 -0400", hash_original_method = "492C8BC9ACE864159B4ED5D85649FE7D", hash_generated_method = "CC0CC42E78B778749D5316D99F468DF5")
    public  X509Name(
        Vector                  oids,
        Vector                  values,
        X509NameEntryConverter  converter) {
        this.converter = converter;
        {
            boolean varA91DDBAA8BB051AA664F17B4FD50E692_1669905337 = (oids.size() != values.size());
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("oids vector must be same length as values.");
            } //End block
        } //End collapsed parenthetic
        {
            int i;
            i = 0;
            boolean var442203792CE708143C2E5D7A53EA9196_1751883561 = (i < oids.size());
            {
                this.ordering.addElement(oids.elementAt(i));
                this.values.addElement(values.elementAt(i));
                this.added.addElement(FALSE);
            } //End block
        } //End collapsed parenthetic
        addTaint(oids.getTaint());
        addTaint(values.getTaint());
        // ---------- Original Method ----------
        //this.converter = converter;
        //if (oids.size() != values.size())
        //{
            //throw new IllegalArgumentException("oids vector must be same length as values.");
        //}
        //for (int i = 0; i < oids.size(); i++)
        //{
            //this.ordering.addElement(oids.elementAt(i));
            //this.values.addElement(values.elementAt(i));
            //this.added.addElement(FALSE);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.498 -0400", hash_original_method = "4DE51E849F59B0AA80C7ECB38F0D9925", hash_generated_method = "3DC3E88039FCBFD7D79B0174FAD45B0F")
    public  X509Name(
        String  dirName) {
        this(DefaultReverse, DefaultLookUp, dirName);
        addTaint(dirName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.503 -0400", hash_original_method = "225E7940DFC3CDF11421E5A31C692555", hash_generated_method = "9300F398B297BC0BA761BA065BBA9B7B")
    public  X509Name(
        String                  dirName,
        X509NameEntryConverter  converter) {
        this(DefaultReverse, DefaultLookUp, dirName, converter);
        addTaint(dirName.getTaint());
        addTaint(converter.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.503 -0400", hash_original_method = "A1386F925B8F997747CFC9FBEC64818C", hash_generated_method = "D1180782CD4A9B85538DD3BB73C75621")
    public  X509Name(
        boolean reverse,
        String  dirName) {
        this(reverse, DefaultLookUp, dirName);
        addTaint(reverse);
        addTaint(dirName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.503 -0400", hash_original_method = "0ED99673E1BB44384871E74A0AAAAEE6", hash_generated_method = "1DBD636F33A5CF4E7619819A0B1619AB")
    public  X509Name(
        boolean                 reverse,
        String                  dirName,
        X509NameEntryConverter  converter) {
        this(reverse, DefaultLookUp, dirName, converter);
        addTaint(reverse);
        addTaint(dirName.getTaint());
        addTaint(converter.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.504 -0400", hash_original_method = "AD0C5D6A617F7C4CAD4929B6BAF77A7F", hash_generated_method = "208916FBC96489BBCCB753E9D05CEC7B")
    public  X509Name(
        boolean     reverse,
        Hashtable   lookUp,
        String      dirName) {
        this(reverse, lookUp, dirName, new X509DefaultEntryConverter());
        addTaint(reverse);
        addTaint(lookUp.getTaint());
        addTaint(dirName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.518 -0400", hash_original_method = "E0536EE704C9789715788F9D659749FC", hash_generated_method = "418B65193DC8DA0BE46B54942B128334")
    public  X509Name(
        boolean                 reverse,
        Hashtable               lookUp,
        String                  dirName,
        X509NameEntryConverter  converter) {
        this.converter = converter;
        X509NameTokenizer nTok;
        nTok = new X509NameTokenizer(dirName);
        {
            boolean var5D041A33898A944DC0BAAB195D03F1FF_940067533 = (nTok.hasMoreTokens());
            {
                String token;
                token = nTok.nextToken();
                int index;
                index = token.indexOf('=');
                {
                    if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("badly formatted directory string");
                } //End block
                String name;
                name = token.substring(0, index);
                String value;
                value = token.substring(index + 1);
                DERObjectIdentifier oid;
                oid = decodeOID(name, lookUp);
                {
                    boolean var977C1F4B1586A47417081256484C04AC_621367994 = (value.indexOf('+') > 0);
                    {
                        X509NameTokenizer vTok;
                        vTok = new X509NameTokenizer(value, '+');
                        String v;
                        v = vTok.nextToken();
                        this.ordering.addElement(oid);
                        this.values.addElement(v);
                        this.added.addElement(FALSE);
                        {
                            boolean var4CBB22088904448AD73E4C6829FDF596_479891258 = (vTok.hasMoreTokens());
                            {
                                String sv;
                                sv = vTok.nextToken();
                                int ndx;
                                ndx = sv.indexOf('=');
                                String nm;
                                nm = sv.substring(0, ndx);
                                String vl;
                                vl = sv.substring(ndx + 1);
                                this.ordering.addElement(decodeOID(nm, lookUp));
                                this.values.addElement(vl);
                                this.added.addElement(TRUE);
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                    {
                        this.ordering.addElement(oid);
                        this.values.addElement(value);
                        this.added.addElement(FALSE);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            Vector o;
            o = new Vector();
            Vector v;
            v = new Vector();
            Vector a;
            a = new Vector();
            int count;
            count = 1;
            {
                int i;
                i = 0;
                boolean varF64732CAEACFF77ABA51CF6F28A2E913_1659545839 = (i < this.ordering.size());
                {
                    {
                        boolean varB1CBD15046D4BBEDE1E912351B5834EB_1025639652 = (((Boolean)this.added.elementAt(i)).booleanValue());
                        {
                            o.insertElementAt(this.ordering.elementAt(i), count);
                            v.insertElementAt(this.values.elementAt(i), count);
                            a.insertElementAt(this.added.elementAt(i), count);
                        } //End block
                        {
                            o.insertElementAt(this.ordering.elementAt(i), 0);
                            v.insertElementAt(this.values.elementAt(i), 0);
                            a.insertElementAt(this.added.elementAt(i), 0);
                            count = 1;
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            this.ordering = o;
            this.values = v;
            this.added = a;
        } //End block
        addTaint(reverse);
        addTaint(lookUp.getTaint());
        addTaint(dirName.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        public static X509Name getInstance(
        ASN1TaggedObject obj,
        boolean          explicit) {
        return getInstance(ASN1Sequence.getInstance(obj, explicit));
    }

    
        public static X509Name getInstance(
        Object  obj) {
        if (obj == null || obj instanceof X509Name)
        {
            return (X509Name)obj;
        }
        else if (obj instanceof X500Name)
        {
            return new X509Name(ASN1Sequence.getInstance(((X500Name)obj).getDERObject()));
        }
        else if (obj != null)
        {
            return new X509Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.529 -0400", hash_original_method = "964F6D63AF200DB73DB551657282148F", hash_generated_method = "EFB0A001797C592988A5C31FA28862BB")
    private DERObjectIdentifier decodeOID(
        String      name,
        Hashtable   lookUp) {
        DERObjectIdentifier varB4EAC82CA7396A68D541C85D26508E83_1354279534 = null; //Variable for return #1
        DERObjectIdentifier varB4EAC82CA7396A68D541C85D26508E83_281344356 = null; //Variable for return #2
        DERObjectIdentifier varB4EAC82CA7396A68D541C85D26508E83_1874553214 = null; //Variable for return #3
        {
            boolean var52BEDB01650B64F06E8B54FD442A5140_1647855792 = (Strings.toUpperCase(name).startsWith("OID."));
            {
                varB4EAC82CA7396A68D541C85D26508E83_1354279534 = new DERObjectIdentifier(name.substring(4));
            } //End block
            {
                boolean var67FEF9AA9BE53E5B5CB1136C496DC1D5_846715060 = (name.charAt(0) >= '0' && name.charAt(0) <= '9');
                {
                    varB4EAC82CA7396A68D541C85D26508E83_281344356 = new DERObjectIdentifier(name);
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        DERObjectIdentifier oid;
        oid = (DERObjectIdentifier)lookUp.get(Strings.toLowerCase(name));
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Unknown object id - " + name + " - passed to distinguished name");
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1874553214 = oid;
        addTaint(name.getTaint());
        addTaint(lookUp.getTaint());
        DERObjectIdentifier varA7E53CE21691AB073D9660D615818899_814891949; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_814891949 = varB4EAC82CA7396A68D541C85D26508E83_1354279534;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_814891949 = varB4EAC82CA7396A68D541C85D26508E83_281344356;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_814891949 = varB4EAC82CA7396A68D541C85D26508E83_1874553214;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_814891949.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_814891949;
        // ---------- Original Method ----------
        //if (Strings.toUpperCase(name).startsWith("OID."))
        //{
            //return new DERObjectIdentifier(name.substring(4));
        //}
        //else if (name.charAt(0) >= '0' && name.charAt(0) <= '9')
        //{
            //return new DERObjectIdentifier(name);
        //}
        //DERObjectIdentifier oid = (DERObjectIdentifier)lookUp.get(Strings.toLowerCase(name));
        //if (oid == null)
        //{
            //throw new IllegalArgumentException("Unknown object id - " + name + " - passed to distinguished name");
        //}
        //return oid;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.588 -0400", hash_original_method = "2D101B81AA4F7CB6B72317966361C7FD", hash_generated_method = "298AB404E498341CC0B87A3F35F46CC0")
    public Vector getOIDs() {
        Vector varB4EAC82CA7396A68D541C85D26508E83_207737648 = null; //Variable for return #1
        Vector v;
        v = new Vector();
        {
            int i;
            i = 0;
            boolean varB7FED1061E2523A61273B96DF514EF18_1091108052 = (i != ordering.size());
            {
                v.addElement(ordering.elementAt(i));
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_207737648 = v;
        varB4EAC82CA7396A68D541C85D26508E83_207737648.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_207737648;
        // ---------- Original Method ----------
        //Vector  v = new Vector();
        //for (int i = 0; i != ordering.size(); i++)
        //{
            //v.addElement(ordering.elementAt(i));
        //}
        //return v;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.589 -0400", hash_original_method = "F648A0377CD08E6DCA69D49343904A7E", hash_generated_method = "5986C862CDB9EFEB6B624D40DCCDE05B")
    public Vector getValues() {
        Vector varB4EAC82CA7396A68D541C85D26508E83_637844676 = null; //Variable for return #1
        Vector v;
        v = new Vector();
        {
            int i;
            i = 0;
            boolean varA1FE771989A80C73DAABF8C1FCDB6254_1720041338 = (i != values.size());
            {
                v.addElement(values.elementAt(i));
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_637844676 = v;
        varB4EAC82CA7396A68D541C85D26508E83_637844676.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_637844676;
        // ---------- Original Method ----------
        //Vector  v = new Vector();
        //for (int i = 0; i != values.size(); i++)
        //{
            //v.addElement(values.elementAt(i));
        //}
        //return v;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.590 -0400", hash_original_method = "B5B05F9A72085C1CEE80B6960CBCC4AA", hash_generated_method = "7E486690D8E6121CE6D709CD1EC824E9")
    public Vector getValues(
        DERObjectIdentifier oid) {
        Vector varB4EAC82CA7396A68D541C85D26508E83_150616426 = null; //Variable for return #1
        Vector v;
        v = new Vector();
        {
            int i;
            i = 0;
            boolean varA1FE771989A80C73DAABF8C1FCDB6254_527209643 = (i != values.size());
            {
                {
                    boolean var3ECC4B92F4195945FD4FEA9C2D0910D6_328317821 = (ordering.elementAt(i).equals(oid));
                    {
                        String val;
                        val = (String)values.elementAt(i);
                        {
                            boolean var2EB55943927E106BDA23C77127DEFA0E_1169176464 = (val.length() > 2 && val.charAt(0) == '\\' && val.charAt(1) == '#');
                            {
                                v.addElement(val.substring(1));
                            } //End block
                            {
                                v.addElement(val);
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_150616426 = v;
        addTaint(oid.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_150616426.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_150616426;
        // ---------- Original Method ----------
        //Vector  v = new Vector();
        //for (int i = 0; i != values.size(); i++)
        //{
            //if (ordering.elementAt(i).equals(oid))
            //{
                //String val = (String)values.elementAt(i);
                //if (val.length() > 2 && val.charAt(0) == '\\' && val.charAt(1) == '#')
                //{
                    //v.addElement(val.substring(1));
                //}
                //else
                //{
                    //v.addElement(val);
                //}
            //}
        //}
        //return v;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.608 -0400", hash_original_method = "3947A3064A86A512C4391326C6ABB01D", hash_generated_method = "616729FC9F0337C0230F70CCB7C1A386")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1922566640 = null; //Variable for return #1
        {
            ASN1EncodableVector vec;
            vec = new ASN1EncodableVector();
            ASN1EncodableVector sVec;
            sVec = new ASN1EncodableVector();
            DERObjectIdentifier lstOid;
            lstOid = null;
            {
                int i;
                i = 0;
                boolean varA4D4DEC0DFCDB9B177EA78FEB51EFCA1_1265305521 = (i != ordering.size());
                {
                    ASN1EncodableVector v;
                    v = new ASN1EncodableVector();
                    DERObjectIdentifier oid;
                    oid = (DERObjectIdentifier)ordering.elementAt(i);
                    v.add(oid);
                    String str;
                    str = (String)values.elementAt(i);
                    v.add(converter.getConvertedValue(oid, str));
                    {
                        boolean varCBBBFCFBF01BE5D1A1FB2F32C48B600A_1244553502 = (lstOid == null 
                    || ((Boolean)this.added.elementAt(i)).booleanValue());
                        {
                            sVec.add(new DERSequence(v));
                        } //End block
                        {
                            vec.add(new DERSet(sVec));
                            sVec = new ASN1EncodableVector();
                            sVec.add(new DERSequence(v));
                        } //End block
                    } //End collapsed parenthetic
                    lstOid = oid;
                } //End block
            } //End collapsed parenthetic
            vec.add(new DERSet(sVec));
            seq = new DERSequence(vec);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1922566640 = seq;
        varB4EAC82CA7396A68D541C85D26508E83_1922566640.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1922566640;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.609 -0400", hash_original_method = "280DBAE44A81315C42DC75BD60909480", hash_generated_method = "CECEAE9D677289651CFA80126B95BC67")
    public boolean equals(Object obj, boolean inOrder) {
        {
            boolean var2EFBBFC58B334E2883A34DBA1989E826_1947774386 = (this.equals(obj));
        } //End block
        {
            boolean var8D1D3E5F4C020ED4FA594AED365B4BD8_145158060 = (obj == this);
        } //End collapsed parenthetic
        DERObject derO;
        derO = ((DEREncodable)obj).getDERObject();
        {
            boolean var68F84D0793BBFC5B2D2B404A60842FDE_302365078 = (this.getDERObject().equals(derO));
        } //End collapsed parenthetic
        X509Name other;
        try 
        {
            other = X509Name.getInstance(obj);
        } //End block
        catch (IllegalArgumentException e)
        { }
        int orderingSize;
        orderingSize = ordering.size();
        {
            boolean var2044D2E3251D1DE7A0F398BAA340AA65_2033465461 = (orderingSize != other.ordering.size());
        } //End collapsed parenthetic
        {
            int i;
            i = 0;
            {
                DERObjectIdentifier oid;
                oid = (DERObjectIdentifier)ordering.elementAt(i);
                DERObjectIdentifier oOid;
                oOid = (DERObjectIdentifier)other.ordering.elementAt(i);
                {
                    boolean var17DA8412B1E53427AA4309C32F180A5B_173188650 = (oid.equals(oOid));
                    {
                        String value;
                        value = (String)values.elementAt(i);
                        String oValue;
                        oValue = (String)other.values.elementAt(i);
                        {
                            boolean var67DC15BF964A289802CC01AAD2E9C472_30289649 = (!equivalentStrings(value, oValue));
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(obj.getTaint());
        addTaint(inOrder);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1411321381 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1411321381;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.610 -0400", hash_original_method = "F1AF8C1EFC711A1D842EED436165BEED", hash_generated_method = "818605CED408CE9D91AFEFEAC6DD27A0")
    public int hashCode() {
        isHashCodeCalculated = true;
        {
            int i;
            i = 0;
            boolean varB7FED1061E2523A61273B96DF514EF18_29457639 = (i != ordering.size());
            i += 1;
            {
                String value;
                value = (String)values.elementAt(i);
                value = canonicalize(value);
                value = stripInternalSpaces(value);
                hashCodeValue ^= ordering.elementAt(i).hashCode();
                hashCodeValue ^= value.hashCode();
            } //End block
        } //End collapsed parenthetic
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_550372988 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_550372988;
        // ---------- Original Method ----------
        //if (isHashCodeCalculated)
        //{
            //return hashCodeValue;
        //}
        //isHashCodeCalculated = true;
        //for (int i = 0; i != ordering.size(); i += 1)
        //{
            //String value = (String)values.elementAt(i);
            //value = canonicalize(value);
            //value = stripInternalSpaces(value);
            //hashCodeValue ^= ordering.elementAt(i).hashCode();
            //hashCodeValue ^= value.hashCode();
        //}
        //return hashCodeValue;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.611 -0400", hash_original_method = "9BE112C8870FAD3CF61652B8C6BD4A74", hash_generated_method = "BCF1CBBB9CF1BC73840BE2B8FBFF91AE")
    public boolean equals(Object obj) {
        {
            boolean var8D1D3E5F4C020ED4FA594AED365B4BD8_1302263503 = (obj == this);
        } //End collapsed parenthetic
        DERObject derO;
        derO = ((DEREncodable)obj).getDERObject();
        {
            boolean var68F84D0793BBFC5B2D2B404A60842FDE_34249693 = (this.getDERObject().equals(derO));
        } //End collapsed parenthetic
        X509Name other;
        try 
        {
            other = X509Name.getInstance(obj);
        } //End block
        catch (IllegalArgumentException e)
        { }
        int orderingSize;
        orderingSize = ordering.size();
        {
            boolean var2044D2E3251D1DE7A0F398BAA340AA65_43446332 = (orderingSize != other.ordering.size());
        } //End collapsed parenthetic
        boolean[] indexes;
        indexes = new boolean[orderingSize];
        int start, end, delta;
        {
            boolean varEEAB117B91A2EB8235C9B2CF049A71B4_919047390 = (ordering.elementAt(0).equals(other.ordering.elementAt(0)));
            {
                start = 0;
                end = orderingSize;
                delta = 1;
            } //End block
            {
                start = orderingSize - 1;
                end = -1;
                delta = -1;
            } //End block
        } //End collapsed parenthetic
        {
            int i;
            i = start;
            i += delta;
            {
                boolean found;
                found = false;
                DERObjectIdentifier oid;
                oid = (DERObjectIdentifier)ordering.elementAt(i);
                String value;
                value = (String)values.elementAt(i);
                {
                    int j;
                    j = 0;
                    {
                        DERObjectIdentifier oOid;
                        oOid = (DERObjectIdentifier)other.ordering.elementAt(j);
                        {
                            boolean varCAF343187BA96BF18E70569CB7DCC42C_629277373 = (oid.equals(oOid));
                            {
                                String oValue;
                                oValue = (String)other.values.elementAt(j);
                                {
                                    boolean varFE5E566A27FB8ADFB2F8CEFB6A60B6C6_793269254 = (equivalentStrings(value, oValue));
                                    {
                                        indexes[j] = true;
                                        found      = true;
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(obj.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1678467849 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1678467849;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.612 -0400", hash_original_method = "4C05CDE4A9C2B68738F6FCFBDDBEA55B", hash_generated_method = "4D51E68190D545628D95628F7D2022CC")
    private boolean equivalentStrings(String s1, String s2) {
        String value;
        value = canonicalize(s1);
        String oValue;
        oValue = canonicalize(s2);
        {
            boolean varC3008AA8F61E21AA7AB6D4808FB3397A_1985082042 = (!value.equals(oValue));
            {
                value = stripInternalSpaces(value);
                oValue = stripInternalSpaces(oValue);
                {
                    boolean varB850FDC6C82B7860B5E3DCB18F1C294A_702749936 = (!value.equals(oValue));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(s1.getTaint());
        addTaint(s2.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_357293692 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_357293692;
        // ---------- Original Method ----------
        //String value = canonicalize(s1);
        //String oValue = canonicalize(s2);
        //if (!value.equals(oValue))
        //{
            //value = stripInternalSpaces(value);
            //oValue = stripInternalSpaces(oValue);
            //if (!value.equals(oValue))
            //{
                //return false;
            //}
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.640 -0400", hash_original_method = "94F49650EDA8FF5038678A71C47387EA", hash_generated_method = "C802B9DC4DF9FAFF4ED97EC3874C76C6")
    private String canonicalize(String s) {
        String varB4EAC82CA7396A68D541C85D26508E83_1931208513 = null; //Variable for return #1
        String value;
        value = Strings.toLowerCase(s.trim());
        {
            boolean var62C350AA68BC011FC1A9807B23C03C3A_285097512 = (value.length() > 0 && value.charAt(0) == '#');
            {
                DERObject obj;
                obj = decodeObject(value);
                {
                    value = Strings.toLowerCase(((DERString)obj).getString().trim());
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1931208513 = value;
        addTaint(s.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1931208513.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1931208513;
        // ---------- Original Method ----------
        //String value = Strings.toLowerCase(s.trim());
        //if (value.length() > 0 && value.charAt(0) == '#')
        //{
            //DERObject obj = decodeObject(value);
            //if (obj instanceof DERString)
            //{
                //value = Strings.toLowerCase(((DERString)obj).getString().trim());
            //}
        //}
        //return value;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.641 -0400", hash_original_method = "DA9861DC0244404A041AD42C955600B0", hash_generated_method = "15E61EED09FFA6468F85232CC7D49756")
    private ASN1Object decodeObject(String oValue) {
        ASN1Object varB4EAC82CA7396A68D541C85D26508E83_1081624044 = null; //Variable for return #1
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1081624044 = ASN1Object.fromByteArray(Hex.decode(oValue.substring(1)));
        } //End block
        catch (IOException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("unknown encoding in name: " + e);
        } //End block
        addTaint(oValue.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1081624044.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1081624044;
        // ---------- Original Method ----------
        //try
        //{
            //return ASN1Object.fromByteArray(Hex.decode(oValue.substring(1)));
        //}
        //catch (IOException e)
        //{
            //throw new IllegalStateException("unknown encoding in name: " + e);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.649 -0400", hash_original_method = "1E1DA2E49EB072DAE70813000ABE2315", hash_generated_method = "F3579EC095511C451C2DAAE682CDD5EE")
    private String stripInternalSpaces(
        String str) {
        String varB4EAC82CA7396A68D541C85D26508E83_1627454190 = null; //Variable for return #1
        StringBuffer res;
        res = new StringBuffer();
        {
            boolean var336C0F49115F2A036CBDD692CCB9D9F3_1069921678 = (str.length() != 0);
            {
                char c1;
                c1 = str.charAt(0);
                res.append(c1);
                {
                    int k;
                    k = 1;
                    boolean var8A1CAC546D16F536CF0DBD9F70E0063C_1650534468 = (k < str.length());
                    {
                        char c2;
                        c2 = str.charAt(k);
                        {
                            res.append(c2);
                        } //End block
                        c1 = c2;
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1627454190 = res.toString();
        addTaint(str.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1627454190.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1627454190;
        // ---------- Original Method ----------
        //StringBuffer res = new StringBuffer();
        //if (str.length() != 0)
        //{
            //char    c1 = str.charAt(0);
            //res.append(c1);
            //for (int k = 1; k < str.length(); k++)
            //{
                //char    c2 = str.charAt(k);
                //if (!(c1 == ' ' && c2 == ' '))
                //{
                    //res.append(c2);
                //}
                //c1 = c2;
            //}
        //}
        //return res.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.692 -0400", hash_original_method = "276C610AF86C7F7EC8233E2E5B295559", hash_generated_method = "D857CB6F7A85C623A8C44082E90FD897")
    private void appendValue(
        StringBuffer        buf,
        Hashtable           oidSymbols,
        DERObjectIdentifier oid,
        String              value) {
        String sym;
        sym = (String)oidSymbols.get(oid);
        {
            buf.append(sym);
        } //End block
        {
            buf.append(oid.getId());
        } //End block
        buf.append('=');
        int index;
        index = buf.length();
        buf.append(value);
        int end;
        end = buf.length();
        {
            boolean varBF8A4DE744CFE1091A63099D9893530C_768763140 = (value.length() >= 2 && value.charAt(0) == '\\' && value.charAt(1) == '#');
            {
                index += 2;
            } //End block
        } //End collapsed parenthetic
        {
            {
                boolean var1A231DA28216FDD408ADE77DE92065AA_1869076067 = ((buf.charAt(index) == ',')
               || (buf.charAt(index) == '"')
               || (buf.charAt(index) == '\\')
               || (buf.charAt(index) == '+')
               || (buf.charAt(index) == '=')
               || (buf.charAt(index) == '<')
               || (buf.charAt(index) == '>')
               || (buf.charAt(index) == ';'));
                {
                    buf.insert(index, "\\");
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(buf.getTaint());
        addTaint(oidSymbols.getTaint());
        addTaint(oid.getTaint());
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.694 -0400", hash_original_method = "656BABE23C68D82FE6D3AB319F560E81", hash_generated_method = "AD5F9C8097C03E6E306E8EECA728B69D")
    public String toString(
        boolean     reverse,
        Hashtable   oidSymbols) {
        String varB4EAC82CA7396A68D541C85D26508E83_522529946 = null; //Variable for return #1
        StringBuffer buf;
        buf = new StringBuffer();
        Vector components;
        components = new Vector();
        boolean first;
        first = true;
        StringBuffer ava;
        ava = null;
        {
            int i;
            i = 0;
            boolean var54FC6117995D5991BBCA4E17B0FBED54_866309962 = (i < ordering.size());
            {
                {
                    boolean var151700C45EE799D30B3534A7BB463D78_1209980577 = (((Boolean)added.elementAt(i)).booleanValue());
                    {
                        ava.append('+');
                        appendValue(ava, oidSymbols,
                    (DERObjectIdentifier)ordering.elementAt(i),
                    (String)values.elementAt(i));
                    } //End block
                    {
                        ava = new StringBuffer();
                        appendValue(ava, oidSymbols,
                    (DERObjectIdentifier)ordering.elementAt(i),
                    (String)values.elementAt(i));
                        components.addElement(ava);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            {
                int i;
                i = components.size() - 1;
                {
                    {
                        first = false;
                    } //End block
                    {
                        buf.append(',');
                    } //End block
                    buf.append(components.elementAt(i).toString());
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            {
                int i;
                i = 0;
                boolean varE26371E0754DD53AFAE71888CB51D840_674964551 = (i < components.size());
                {
                    {
                        first = false;
                    } //End block
                    {
                        buf.append(',');
                    } //End block
                    buf.append(components.elementAt(i).toString());
                } //End block
            } //End collapsed parenthetic
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_522529946 = buf.toString();
        addTaint(reverse);
        addTaint(oidSymbols.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_522529946.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_522529946;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.695 -0400", hash_original_method = "B6C7D564A6D3D0BE9A656CE0C6CFB554", hash_generated_method = "0C4A80A4529D8C4570B838901536D1CE")
    private String bytesToString(
        byte[] data) {
        String varB4EAC82CA7396A68D541C85D26508E83_1014937542 = null; //Variable for return #1
        char[] cs;
        cs = new char[data.length];
        {
            int i;
            i = 0;
            {
                cs[i] = (char)(data[i] & 0xff);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1014937542 = new String(cs);
        addTaint(data[0]);
        varB4EAC82CA7396A68D541C85D26508E83_1014937542.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1014937542;
        // ---------- Original Method ----------
        //char[]  cs = new char[data.length];
        //for (int i = 0; i != cs.length; i++)
        //{
            //cs[i] = (char)(data[i] & 0xff);
        //}
        //return new String(cs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_method = "E860E9E8B8CF997531DC86A289D376AE", hash_generated_method = "1194236789C4F1ABD24E7EE4CC8CA37D")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2077722736 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2077722736 = toString(DefaultReverse, DefaultSymbols);
        varB4EAC82CA7396A68D541C85D26508E83_2077722736.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2077722736;
        // ---------- Original Method ----------
        //return toString(DefaultReverse, DefaultSymbols);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "E177AA3BCF90C6371FF59014C82D88D2", hash_generated_field = "82D687239E3C86279A9A387C3E8AE15F")

    public static final DERObjectIdentifier C = new DERObjectIdentifier("2.5.4.6");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "7015CC2DE8BD3D7E95B89FA0CD2F2666", hash_generated_field = "9A0BCC4B2444A7BF0405630803C2F2D0")

    public static final DERObjectIdentifier O = new DERObjectIdentifier("2.5.4.10");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "9A5D4B7E4ECE2A9BB425C3345B998E46", hash_generated_field = "6326280D591C30719B3DB5C13338F0A3")

    public static final DERObjectIdentifier OU = new DERObjectIdentifier("2.5.4.11");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "A4A00A65CC8B84CBAB3B3F883DE3FF99", hash_generated_field = "E8B45184A7115EE6111EDB1B37A68019")

    public static final DERObjectIdentifier T = new DERObjectIdentifier("2.5.4.12");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "BFA71FD8EC8226C6E62235868202C6A4", hash_generated_field = "CF9435847FFC6C3C7927992F9EE3FAFF")

    public static final DERObjectIdentifier CN = new DERObjectIdentifier("2.5.4.3");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "9F650D1C8A874B962150648810632848", hash_generated_field = "1C5FE81E2DBFFB02A7D19673EC4A90E2")

    public static final DERObjectIdentifier SN = new DERObjectIdentifier("2.5.4.5");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "50FA3A65F1BF8421A7EB643D999BA6AA", hash_generated_field = "2F85801FBF51C8EE5695ECB3E05715B4")

    public static final DERObjectIdentifier STREET = new DERObjectIdentifier("2.5.4.9");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "5AC9323E3AB7013AFF904A3D9E7AE793", hash_generated_field = "BDDAF789362E72D2FF3111AE8E110F7A")

    public static final DERObjectIdentifier SERIALNUMBER = SN;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "83E634BE0BD02D990AFD5FE5C22B868F", hash_generated_field = "CBB2A0091E475910A1B9F56755855304")

    public static final DERObjectIdentifier L = new DERObjectIdentifier("2.5.4.7");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "CE43E33A8A444765C4CC410459950723", hash_generated_field = "FA86D310F2857FB8F860635B33CDE85B")

    public static final DERObjectIdentifier ST = new DERObjectIdentifier("2.5.4.8");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "900C53B4AA95A8DF8A53C6824593741F", hash_generated_field = "59FFCD55B0D0B45F483BC2293E395377")

    public static final DERObjectIdentifier SURNAME = new DERObjectIdentifier("2.5.4.4");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "1A941C6061399864B810187E9795E1A8", hash_generated_field = "E97C7C5B7041A426BC30CC1454C5DBF7")

    public static final DERObjectIdentifier GIVENNAME = new DERObjectIdentifier("2.5.4.42");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "3B788DA4453226CBD0BE4B7A432EF6E0", hash_generated_field = "A5FD4B35D111D951F8765946D5A83284")

    public static final DERObjectIdentifier INITIALS = new DERObjectIdentifier("2.5.4.43");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "A2557D3D54AF5E3AE31A9E53F6CB85F0", hash_generated_field = "533BDABA5EA8217D595157FA1EE80ABF")

    public static final DERObjectIdentifier GENERATION = new DERObjectIdentifier("2.5.4.44");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "6554E8B92D20941B0A52552C31DD327C", hash_generated_field = "4F43AC9282AD9798244BC73AEDAA5A8D")

    public static final DERObjectIdentifier UNIQUE_IDENTIFIER = new DERObjectIdentifier("2.5.4.45");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "5EC2CC421BAEE892929844AF98CC386D", hash_generated_field = "B855455F4EDB294C798C9D3C9026BF51")

    public static final DERObjectIdentifier BUSINESS_CATEGORY = new DERObjectIdentifier(
                    "2.5.4.15");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "5FA3FC0B0C13B35F0314B3478EACE2F1", hash_generated_field = "AFCF615F7F4AD23472ADBFCF9493AE20")

    public static final DERObjectIdentifier POSTAL_CODE = new DERObjectIdentifier(
                    "2.5.4.17");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "D1AC0C308E6330692C598894228A894D", hash_generated_field = "3BEB0664EEAAC66C4E6B3507A541A961")

    public static final DERObjectIdentifier DN_QUALIFIER = new DERObjectIdentifier(
                    "2.5.4.46");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "680CF654F71DAF4F8D2E34F81109BE8B", hash_generated_field = "8BDA30822F069D0EF535FB88FF8A1F36")

    public static final DERObjectIdentifier PSEUDONYM = new DERObjectIdentifier(
                    "2.5.4.65");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "7559D4BCC6B41CF1F1591E5313D3D96C", hash_generated_field = "9420DBC6483B34D87C2038353B444C41")

    public static final DERObjectIdentifier DATE_OF_BIRTH = new DERObjectIdentifier(
                    "1.3.6.1.5.5.7.9.1");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.696 -0400", hash_original_field = "BBF1794F0A17E2E42707F6ACE95AA8FF", hash_generated_field = "DD23A595DF652DF1A4A46D9CF34396D1")

    public static final DERObjectIdentifier PLACE_OF_BIRTH = new DERObjectIdentifier(
                    "1.3.6.1.5.5.7.9.2");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "D0E9FB33B291E4536A8FB1F8A2D73FEB", hash_generated_field = "653665F25666ED2418201CB7491A2E83")

    public static final DERObjectIdentifier GENDER = new DERObjectIdentifier(
                    "1.3.6.1.5.5.7.9.3");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "E14448FDD84DD8C7143C71E9CB988AEC", hash_generated_field = "60C31DC383F5B2CBA146E21EF7DBE62C")

    public static final DERObjectIdentifier COUNTRY_OF_CITIZENSHIP = new DERObjectIdentifier(
                    "1.3.6.1.5.5.7.9.4");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "23D0CB6366D0BCE573F5EE2192F2AA98", hash_generated_field = "298A701F0CC84796B2E4DA6C024B48DE")

    public static final DERObjectIdentifier COUNTRY_OF_RESIDENCE = new DERObjectIdentifier(
                    "1.3.6.1.5.5.7.9.5");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "D71309D586C2FA6034AFF2E0B1673E1B", hash_generated_field = "543131AACA3F47053FDEC53A1C384306")

    public static final DERObjectIdentifier NAME_AT_BIRTH =  new DERObjectIdentifier("1.3.36.8.3.14");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "D32E8904B3B1909A368EA22DEA55AEAE", hash_generated_field = "587BAD00A55BF518298D870F21FA8435")

    public static final DERObjectIdentifier POSTAL_ADDRESS = new DERObjectIdentifier("2.5.4.16");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "7393274E24112AE209E570068E2CB377", hash_generated_field = "EFCF83D1673ED3AA566EA2CBA7E1FCE8")

    public static final DERObjectIdentifier DMD_NAME = new DERObjectIdentifier("2.5.4.54");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "ABCD051D2584EDF4C7DAC45C2213D37A", hash_generated_field = "9E94AA66AACE8B4A0BE080CCD0FAC70F")

    public static final DERObjectIdentifier TELEPHONE_NUMBER = X509ObjectIdentifiers.id_at_telephoneNumber;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "E931C7B03A64786863967F0BC14890C6", hash_generated_field = "FFAD4425897D716BCD593C09C46AFD73")

    public static final DERObjectIdentifier NAME = X509ObjectIdentifiers.id_at_name;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "AB5376EA36F8610FEC8AE6621D7491D9", hash_generated_field = "584A7AECA4B0ACA0DBBC90E0BD7C9332")

    public static final DERObjectIdentifier EmailAddress = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "CCCA67DADCF824B36D120A0A0E7847F2", hash_generated_field = "CCAA56F97463C5118260AD6DD1DDC80F")

    public static final DERObjectIdentifier UnstructuredName = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "A1069D8572967482B49C98AED67A215B", hash_generated_field = "342508E8CA88924FDFDA1D381AFD3338")

    public static final DERObjectIdentifier UnstructuredAddress = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "05C9073B7E40A1D4E6C8466E0DDA9A6F", hash_generated_field = "021E5BC1569FD92F01DB6A01724523C2")

    public static final DERObjectIdentifier E = EmailAddress;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "FF41B5069397DB28084CF5A9EA58927A", hash_generated_field = "1334C446DFB8D545DC3107A020531330")

    public static final DERObjectIdentifier DC = new DERObjectIdentifier("0.9.2342.19200300.100.1.25");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "A5CF3CCCCD787F36C43EB5EB32ADB0BF", hash_generated_field = "E4CD602AF9770F8D3B9404D5F2532570")

    public static final DERObjectIdentifier UID = new DERObjectIdentifier("0.9.2342.19200300.100.1.1");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "93EAA62615B304AC8EF691777F01487C", hash_generated_field = "BB46BFBE07BCC7526C461E59C789AB8E")

    public static boolean DefaultReverse = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "F5684916D3BA1C14EACDDDD00DA1C309", hash_generated_field = "158D1B2B36F24863D1B8E7C3B9D7F7A2")

    public static final Hashtable DefaultSymbols = new Hashtable();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "B36EDAD4E06FB368958AF79EF01DB8F2", hash_generated_field = "C9354DE849CFE049572C4221C51E7309")

    public static final Hashtable RFC2253Symbols = new Hashtable();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "453F4DA5E0995DE0291DC6BE429E78D1", hash_generated_field = "10F89287F10A6638EB4EE375195390E2")

    public static final Hashtable RFC1779Symbols = new Hashtable();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "80F42D6B53063097AA147CC39ED38975", hash_generated_field = "9EEF14EBA4A5D75E5091872B5F8BAEFC")

    public static final Hashtable DefaultLookUp = new Hashtable();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "553A55526C7B5E0DCD086FBD4EDC9B90", hash_generated_field = "914593EB818CF28AF7D26BC6344231F7")

    public static final Hashtable OIDLookUp = DefaultSymbols;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "862868D7B55C07F13D3F93635BF0228A", hash_generated_field = "777E54E742DACB0C5BCAD8347B24CD80")

    public static final Hashtable SymbolLookUp = DefaultLookUp;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "F9CC458E79700B174BE3EEB0E2933EF6", hash_generated_field = "A157D57EB0D6376A9F91CD61DDA5F8DE")

    private static Boolean TRUE = Boolean.TRUE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.697 -0400", hash_original_field = "FAF750A21704D3B76419462A3FBB66E1", hash_generated_field = "86F425B8A51F303579660C3605FD2191")

    private static Boolean FALSE = Boolean.FALSE;
    static {
        DefaultSymbols.put(C, "C");
        DefaultSymbols.put(O, "O");
        DefaultSymbols.put(T, "T");
        DefaultSymbols.put(OU, "OU");
        DefaultSymbols.put(CN, "CN");
        DefaultSymbols.put(L, "L");
        DefaultSymbols.put(ST, "ST");
        DefaultSymbols.put(SN, "SERIALNUMBER");
        DefaultSymbols.put(EmailAddress, "E");
        DefaultSymbols.put(DC, "DC");
        DefaultSymbols.put(UID, "UID");
        DefaultSymbols.put(STREET, "STREET");
        DefaultSymbols.put(SURNAME, "SURNAME");
        DefaultSymbols.put(GIVENNAME, "GIVENNAME");
        DefaultSymbols.put(INITIALS, "INITIALS");
        DefaultSymbols.put(GENERATION, "GENERATION");
        DefaultSymbols.put(UnstructuredAddress, "unstructuredAddress");
        DefaultSymbols.put(UnstructuredName, "unstructuredName");
        DefaultSymbols.put(UNIQUE_IDENTIFIER, "UniqueIdentifier");
        DefaultSymbols.put(DN_QUALIFIER, "DN");
        DefaultSymbols.put(PSEUDONYM, "Pseudonym");
        DefaultSymbols.put(POSTAL_ADDRESS, "PostalAddress");
        DefaultSymbols.put(NAME_AT_BIRTH, "NameAtBirth");
        DefaultSymbols.put(COUNTRY_OF_CITIZENSHIP, "CountryOfCitizenship");
        DefaultSymbols.put(COUNTRY_OF_RESIDENCE, "CountryOfResidence");
        DefaultSymbols.put(GENDER, "Gender");
        DefaultSymbols.put(PLACE_OF_BIRTH, "PlaceOfBirth");
        DefaultSymbols.put(DATE_OF_BIRTH, "DateOfBirth");
        DefaultSymbols.put(POSTAL_CODE, "PostalCode");
        DefaultSymbols.put(BUSINESS_CATEGORY, "BusinessCategory");
        DefaultSymbols.put(TELEPHONE_NUMBER, "TelephoneNumber");
        DefaultSymbols.put(NAME, "Name");
        RFC2253Symbols.put(C, "C");
        RFC2253Symbols.put(O, "O");
        RFC2253Symbols.put(OU, "OU");
        RFC2253Symbols.put(CN, "CN");
        RFC2253Symbols.put(L, "L");
        RFC2253Symbols.put(ST, "ST");
        RFC2253Symbols.put(STREET, "STREET");
        RFC2253Symbols.put(DC, "DC");
        RFC2253Symbols.put(UID, "UID");
        RFC1779Symbols.put(C, "C");
        RFC1779Symbols.put(O, "O");
        RFC1779Symbols.put(OU, "OU");
        RFC1779Symbols.put(CN, "CN");
        RFC1779Symbols.put(L, "L");
        RFC1779Symbols.put(ST, "ST");
        RFC1779Symbols.put(STREET, "STREET");
        DefaultLookUp.put("c", C);
        DefaultLookUp.put("o", O);
        DefaultLookUp.put("t", T);
        DefaultLookUp.put("ou", OU);
        DefaultLookUp.put("cn", CN);
        DefaultLookUp.put("l", L);
        DefaultLookUp.put("st", ST);
        DefaultLookUp.put("sn", SN);
        DefaultLookUp.put("serialnumber", SN);
        DefaultLookUp.put("street", STREET);
        DefaultLookUp.put("emailaddress", E);
        DefaultLookUp.put("dc", DC);
        DefaultLookUp.put("e", E);
        DefaultLookUp.put("uid", UID);
        DefaultLookUp.put("surname", SURNAME);
        DefaultLookUp.put("givenname", GIVENNAME);
        DefaultLookUp.put("initials", INITIALS);
        DefaultLookUp.put("generation", GENERATION);
        DefaultLookUp.put("unstructuredaddress", UnstructuredAddress);
        DefaultLookUp.put("unstructuredname", UnstructuredName);
        DefaultLookUp.put("uniqueidentifier", UNIQUE_IDENTIFIER);
        DefaultLookUp.put("dn", DN_QUALIFIER);
        DefaultLookUp.put("pseudonym", PSEUDONYM);
        DefaultLookUp.put("postaladdress", POSTAL_ADDRESS);
        DefaultLookUp.put("nameofbirth", NAME_AT_BIRTH);
        DefaultLookUp.put("countryofcitizenship", COUNTRY_OF_CITIZENSHIP);
        DefaultLookUp.put("countryofresidence", COUNTRY_OF_RESIDENCE);
        DefaultLookUp.put("gender", GENDER);
        DefaultLookUp.put("placeofbirth", PLACE_OF_BIRTH);
        DefaultLookUp.put("dateofbirth", DATE_OF_BIRTH);
        DefaultLookUp.put("postalcode", POSTAL_CODE);
        DefaultLookUp.put("businesscategory", BUSINESS_CATEGORY);
        DefaultLookUp.put("telephonenumber", TELEPHONE_NUMBER);
        DefaultLookUp.put("name", NAME);
    }
    
}

