package org.bouncycastle.asn1.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.util.StringTokenizer;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.IPAddress;

public class GeneralName extends ASN1Encodable implements ASN1Choice {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.047 -0400", hash_original_field = "BE8F80182E0C983916DA7338C2C1C040", hash_generated_field = "C14035F3386E46275A7D663AC38D8A14")

    DEREncodable obj;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.047 -0400", hash_original_field = "E4D23E841D8E8804190027BCE3180FA5", hash_generated_field = "0870A130AAC33D99955FFBF59B769627")

    int tag;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.048 -0400", hash_original_method = "ADE0DAE6BE5F1175688F81D676806619", hash_generated_method = "E0B97A054FF02C188587E94A8DFD80D7")
    public  GeneralName(
        X509Name  dirName) {
        this.obj = dirName;
        this.tag = 4;
        // ---------- Original Method ----------
        //this.obj = dirName;
        //this.tag = 4;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.048 -0400", hash_original_method = "C9285F8047F7E752E9E16F56DB946619", hash_generated_method = "5849A1FB12E98D0EE9ECAC7307462461")
    public  GeneralName(
        X500Name dirName) {
        this.obj = dirName;
        this.tag = 4;
        // ---------- Original Method ----------
        //this.obj = dirName;
        //this.tag = 4;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.049 -0400", hash_original_method = "D162BA12EC49621407922055320A05EF", hash_generated_method = "DD9CC29BA2DB0B242690EBD36A22DA6F")
    public  GeneralName(
        DERObject name, int tag) {
        this.obj = name;
        this.tag = tag;
        // ---------- Original Method ----------
        //this.obj = name;
        //this.tag = tag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.049 -0400", hash_original_method = "665CD76EA1DF7ECA95D5C037ABED8C02", hash_generated_method = "DA021E28FCFC1CD04E4328E4BEAD69B3")
    public  GeneralName(
        int           tag,
        ASN1Encodable name) {
        this.obj = name;
        this.tag = tag;
        // ---------- Original Method ----------
        //this.obj = name;
        //this.tag = tag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.061 -0400", hash_original_method = "4C7C4EFE2EC806CECAFA053C455D2BA2", hash_generated_method = "9DF2765D4876E8D02EBB4852F83053A2")
    public  GeneralName(
        int       tag,
        String    name) {
        this.tag = tag;
        {
            this.obj = new DERIA5String(name);
        } //End block
        {
            this.obj = new DERObjectIdentifier(name);
        } //End block
        {
            this.obj = new X509Name(name);
        } //End block
        {
            byte[] enc;
            enc = toGeneralNameEncoding(name);
            {
                this.obj = new DEROctetString(enc);
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("IP Address is invalid");
            } //End block
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("can't process String for tag: " + tag);
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        public static GeneralName getInstance(
        Object obj) {
        if (obj == null || obj instanceof GeneralName)
        {
            return (GeneralName)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            ASN1TaggedObject    tagObj = (ASN1TaggedObject)obj;
            int                 tag = tagObj.getTagNo();
            switch (tag)
            {
            case otherName:
                return new GeneralName(tag, ASN1Sequence.getInstance(tagObj, false));
            case rfc822Name:
                return new GeneralName(tag, DERIA5String.getInstance(tagObj, false));
            case dNSName:
                return new GeneralName(tag, DERIA5String.getInstance(tagObj, false));
            case x400Address:
                throw new IllegalArgumentException("unknown tag: " + tag);
            case directoryName:
                return new GeneralName(tag, X509Name.getInstance(tagObj, true));
            case ediPartyName:
                return new GeneralName(tag, ASN1Sequence.getInstance(tagObj, false));
            case uniformResourceIdentifier:
                return new GeneralName(tag, DERIA5String.getInstance(tagObj, false));
            case iPAddress:
                return new GeneralName(tag, ASN1OctetString.getInstance(tagObj, false));
            case registeredID:
                return new GeneralName(tag, DERObjectIdentifier.getInstance(tagObj, false));
            }
        }
        if (obj instanceof byte[])
        {
            try
            {
                return getInstance(ASN1Object.fromByteArray((byte[])obj));
            }
            catch (IOException e)
            {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    
        public static GeneralName getInstance(
        ASN1TaggedObject tagObj,
        boolean          explicit) {
        return GeneralName.getInstance(ASN1TaggedObject.getInstance(tagObj, true));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.062 -0400", hash_original_method = "50B74CB2E4EBFF1B331EE5025ECA03E2", hash_generated_method = "348811704AFE3D3B72D6D322C72DB7C1")
    public int getTagNo() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_66212192 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_66212192;
        // ---------- Original Method ----------
        //return tag;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.062 -0400", hash_original_method = "2A79ACAAF65B843006F5215944D07A13", hash_generated_method = "DC919BBD72141D46D092C2A6D9106DDC")
    public DEREncodable getName() {
        DEREncodable varB4EAC82CA7396A68D541C85D26508E83_1108015287 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1108015287 = obj;
        varB4EAC82CA7396A68D541C85D26508E83_1108015287.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1108015287;
        // ---------- Original Method ----------
        //return obj;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.067 -0400", hash_original_method = "6AFE1DDEFB420AC1C3733113CDF77755", hash_generated_method = "C05AFE22E1868487EBFE3540A5C95BE5")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1267991544 = null; //Variable for return #1
        StringBuffer buf;
        buf = new StringBuffer();
        buf.append(tag);
        buf.append(": ");
        //Begin case rfc822Name dNSName uniformResourceIdentifier 
        buf.append(DERIA5String.getInstance(obj).getString());
        //End case rfc822Name dNSName uniformResourceIdentifier 
        //Begin case directoryName 
        buf.append(X509Name.getInstance(obj).toString());
        //End case directoryName 
        //Begin case default 
        buf.append(obj.toString());
        //End case default 
        varB4EAC82CA7396A68D541C85D26508E83_1267991544 = buf.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1267991544.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1267991544;
        // ---------- Original Method ----------
        //StringBuffer buf = new StringBuffer();
        //buf.append(tag);
        //buf.append(": ");
        //switch (tag)
        //{
        //case rfc822Name:
        //case dNSName:
        //case uniformResourceIdentifier:
            //buf.append(DERIA5String.getInstance(obj).getString());
            //break;
        //case directoryName:
            //buf.append(X509Name.getInstance(obj).toString());
            //break;
        //default:
            //buf.append(obj.toString());
        //}
        //return buf.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.083 -0400", hash_original_method = "F02018A790F280370B2CB39B10862FEC", hash_generated_method = "A9880A13B373BA946E0432317F3BE018")
    private byte[] toGeneralNameEncoding(String ip) {
        {
            boolean var1109E9D9B1D21A81C08F4AC03CD8879A_1091325491 = (IPAddress.isValidIPv6WithNetmask(ip) || IPAddress.isValidIPv6(ip));
            {
                int slashIndex;
                slashIndex = ip.indexOf('/');
                {
                    byte[] addr;
                    addr = new byte[16];
                    int[] parsedIp;
                    parsedIp = parseIPv6(ip);
                    copyInts(parsedIp, addr, 0);
                } //End block
                {
                    byte[] addr;
                    addr = new byte[32];
                    int[] parsedIp;
                    parsedIp = parseIPv6(ip.substring(0, slashIndex));
                    copyInts(parsedIp, addr, 0);
                    String mask;
                    mask = ip.substring(slashIndex + 1);
                    {
                        boolean varCD5038F37B399E649D3619D0C0926E01_728472332 = (mask.indexOf(':') > 0);
                        {
                            parsedIp = parseIPv6(mask);
                        } //End block
                        {
                            parsedIp = parseMask(mask);
                        } //End block
                    } //End collapsed parenthetic
                    copyInts(parsedIp, addr, 16);
                } //End block
            } //End block
            {
                boolean varD5B601DE6AF85665A8FAF07579E32B42_696869874 = (IPAddress.isValidIPv4WithNetmask(ip) || IPAddress.isValidIPv4(ip));
                {
                    int slashIndex;
                    slashIndex = ip.indexOf('/');
                    {
                        byte[] addr;
                        addr = new byte[4];
                        parseIPv4(ip, addr, 0);
                    } //End block
                    {
                        byte[] addr;
                        addr = new byte[8];
                        parseIPv4(ip.substring(0, slashIndex), addr, 0);
                        String mask;
                        mask = ip.substring(slashIndex + 1);
                        {
                            boolean var4C15B2AE6CB1E676E704DD915BA2619A_1901726466 = (mask.indexOf('.') > 0);
                            {
                                parseIPv4(mask, addr, 4);
                            } //End block
                            {
                                parseIPv4Mask(mask, addr, 4);
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        addTaint(ip.getTaint());
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1568786200 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1568786200;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.086 -0400", hash_original_method = "B54AB1000C04EF98C8414C613F178EE6", hash_generated_method = "C0F88FB59144726A375042E4E12CD28E")
    private void parseIPv4Mask(String mask, byte[] addr, int offset) {
        int maskVal;
        maskVal = Integer.parseInt(mask);
        {
            int i;
            i = 0;
            {
                addr[(i / 8) + offset] |= 1 << (i % 8);
            } //End block
        } //End collapsed parenthetic
        addTaint(mask.getTaint());
        addTaint(addr[0]);
        addTaint(offset);
        // ---------- Original Method ----------
        //int   maskVal = Integer.parseInt(mask);
        //for (int i = 0; i != maskVal; i++)
        //{
            //addr[(i / 8) + offset] |= 1 << (i % 8);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.086 -0400", hash_original_method = "D3256FE340A5AB891180F872DE9312FE", hash_generated_method = "B680BFCFF2A3B8D15F9F33E9D53BFD76")
    private void parseIPv4(String ip, byte[] addr, int offset) {
        StringTokenizer sTok;
        sTok = new StringTokenizer(ip, "./");
        int index;
        index = 0;
        {
            boolean var33552EFC0BCF12983E7C1D7D9C26C57D_392711338 = (sTok.hasMoreTokens());
            {
                addr[offset + index++] = (byte)Integer.parseInt(sTok.nextToken());
            } //End block
        } //End collapsed parenthetic
        addTaint(ip.getTaint());
        addTaint(addr[0]);
        addTaint(offset);
        // ---------- Original Method ----------
        //StringTokenizer sTok = new StringTokenizer(ip, "./");
        //int    index = 0;
        //while (sTok.hasMoreTokens())
        //{
            //addr[offset + index++] = (byte)Integer.parseInt(sTok.nextToken());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.088 -0400", hash_original_method = "AAEA46BCEA791BA55D0418C441E919BF", hash_generated_method = "230EBC6D63BF06D04725B1E1D3BE5943")
    private int[] parseMask(String mask) {
        int[] res;
        res = new int[8];
        int maskVal;
        maskVal = Integer.parseInt(mask);
        {
            int i;
            i = 0;
            {
                res[i / 16] |= 1 << (i % 16);
            } //End block
        } //End collapsed parenthetic
        addTaint(mask.getTaint());
        int[] varB4CCCA26F9DB9189C32F33E82D425CFB_1754263621 = {getTaintInt()};
        return varB4CCCA26F9DB9189C32F33E82D425CFB_1754263621;
        // ---------- Original Method ----------
        //int[] res = new int[8];
        //int   maskVal = Integer.parseInt(mask);
        //for (int i = 0; i != maskVal; i++)
        //{
            //res[i / 16] |= 1 << (i % 16);
        //}
        //return res;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.091 -0400", hash_original_method = "C5093ABFF769462F7C38A897D6D20C09", hash_generated_method = "94D30A3EBE2474870F542ED7F6405001")
    private void copyInts(int[] parsedIp, byte[] addr, int offSet) {
        {
            int i;
            i = 0;
            {
                addr[(i * 2) + offSet] = (byte)(parsedIp[i] >> 8);
                addr[(i * 2 + 1) + offSet] = (byte)parsedIp[i];
            } //End block
        } //End collapsed parenthetic
        addTaint(parsedIp[0]);
        addTaint(addr[0]);
        addTaint(offSet);
        // ---------- Original Method ----------
        //for (int i = 0; i != parsedIp.length; i++)
        //{
            //addr[(i * 2) + offSet] = (byte)(parsedIp[i] >> 8);
            //addr[(i * 2 + 1) + offSet] = (byte)parsedIp[i];
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.094 -0400", hash_original_method = "9628A2DF5EA66A9EC56C6B58E58FBD48", hash_generated_method = "558AA04D1A2A8F419919F66AC3B4AA77")
    private int[] parseIPv6(String ip) {
        StringTokenizer sTok;
        sTok = new StringTokenizer(ip, ":", true);
        int index;
        index = 0;
        int[] val;
        val = new int[8];
        {
            boolean var7700DBF599C2D7F18B8CE11CBB745182_937938313 = (ip.charAt(0) == ':' && ip.charAt(1) == ':');
            {
                sTok.nextToken();
            } //End block
        } //End collapsed parenthetic
        int doubleColon;
        doubleColon = -1;
        {
            boolean var33552EFC0BCF12983E7C1D7D9C26C57D_1041282944 = (sTok.hasMoreTokens());
            {
                String e;
                e = sTok.nextToken();
                {
                    boolean var070CF654C35E448AD498FB574FFA57CE_985446711 = (e.equals(":"));
                    {
                        doubleColon = index;
                        val[index++] = 0;
                    } //End block
                    {
                        {
                            boolean var200FB43FCE28F68371DB8907E59BFEC0_1215163114 = (e.indexOf('.') < 0);
                            {
                                val[index++] = Integer.parseInt(e, 16);
                                {
                                    boolean varBB14443C65DF60BC330422BEC61525CB_1650885 = (sTok.hasMoreTokens());
                                    {
                                        sTok.nextToken();
                                    } //End block
                                } //End collapsed parenthetic
                            } //End block
                            {
                                StringTokenizer eTok;
                                eTok = new StringTokenizer(e, ".");
                                val[index++] = (Integer.parseInt(eTok.nextToken()) << 8) | Integer.parseInt(eTok.nextToken());
                                val[index++] = (Integer.parseInt(eTok.nextToken()) << 8) | Integer.parseInt(eTok.nextToken());
                            } //End block
                        } //End collapsed parenthetic
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        {
            System.arraycopy(val, doubleColon, val, val.length - (index - doubleColon), index - doubleColon);
            {
                int i;
                i = doubleColon;
                {
                    val[i] = 0;
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(ip.getTaint());
        int[] varB4CCCA26F9DB9189C32F33E82D425CFB_316233784 = {getTaintInt()};
        return varB4CCCA26F9DB9189C32F33E82D425CFB_316233784;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_method = "D622C616E457C40B929532BF47722854", hash_generated_method = "A4546686AD7389C8C321344D78922395")
    public DERObject toASN1Object() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_1720547490 = null; //Variable for return #1
        DERObject varB4EAC82CA7396A68D541C85D26508E83_997540465 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1720547490 = new DERTaggedObject(true, tag, obj);
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_997540465 = new DERTaggedObject(false, tag, obj);
        } //End block
        DERObject varA7E53CE21691AB073D9660D615818899_739159682; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_739159682 = varB4EAC82CA7396A68D541C85D26508E83_1720547490;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_739159682 = varB4EAC82CA7396A68D541C85D26508E83_997540465;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_739159682.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_739159682;
        // ---------- Original Method ----------
        //if (tag == directoryName)       
        //{
            //return new DERTaggedObject(true, tag, obj);
        //}
        //else
        //{
            //return new DERTaggedObject(false, tag, obj);
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "C4EEAEC33BD21A3FD38F227A03AE4C87", hash_generated_field = "2C60CF820709947727993EEE876A89E1")

    public static final int otherName                     = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "D9708D90C36E0FE617FB8C727BC83660", hash_generated_field = "D9BB2562526C1C2803346041FE9A9479")

    public static final int rfc822Name                    = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "25CBC7428D533DBED7E4B1CE12E2B7CC", hash_generated_field = "23A7DFE231C60FEBF0B4AFFCA7C9D797")

    public static final int dNSName                       = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "FD1B5E14181A43B524B1C9EBC492E2B5", hash_generated_field = "22B173553BEDFE31A7EA23714B44E922")

    public static final int x400Address                   = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "3455C762936B742EBCA759D015969534", hash_generated_field = "6771712D3DAA106B0694ED750691B023")

    public static final int directoryName                 = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "FCA9CDFACE1EE026FD0F5B834981B021", hash_generated_field = "74CB4F34E97D116A425947C2F109D7AD")

    public static final int ediPartyName                  = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.096 -0400", hash_original_field = "CA924DBDC28208088DBEA851EF9125D5", hash_generated_field = "8995C085497DE0EAEF0DC2A248EAD3AD")

    public static final int uniformResourceIdentifier     = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.097 -0400", hash_original_field = "C8848C5506E3277C4C949CB15EBDCBAD", hash_generated_field = "14B98AF4049CB1ED7AAA7C8B6A2D7956")

    public static final int iPAddress                     = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:14:19.097 -0400", hash_original_field = "F9011CB3234F21E8F20DB8B97C0C13EC", hash_generated_field = "751FE59FD146DD9B6987948A4960C030")

    public static final int registeredID                  = 8;
}

