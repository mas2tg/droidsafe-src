package gov.nist.javax.sip.message;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import gov.nist.core.InternalErrorHandler;
import gov.nist.javax.sip.SIPConstants;
import gov.nist.javax.sip.Utils;
import gov.nist.javax.sip.header.AlertInfo;
import gov.nist.javax.sip.header.Authorization;
import gov.nist.javax.sip.header.CSeq;
import gov.nist.javax.sip.header.CallID;
import gov.nist.javax.sip.header.Contact;
import gov.nist.javax.sip.header.ContactList;
import gov.nist.javax.sip.header.ContentLength;
import gov.nist.javax.sip.header.ContentType;
import gov.nist.javax.sip.header.ErrorInfo;
import gov.nist.javax.sip.header.ErrorInfoList;
import gov.nist.javax.sip.header.From;
import gov.nist.javax.sip.header.InReplyTo;
import gov.nist.javax.sip.header.MaxForwards;
import gov.nist.javax.sip.header.Priority;
import gov.nist.javax.sip.header.ProxyAuthenticate;
import gov.nist.javax.sip.header.ProxyAuthorization;
import gov.nist.javax.sip.header.ProxyRequire;
import gov.nist.javax.sip.header.ProxyRequireList;
import gov.nist.javax.sip.header.RSeq;
import gov.nist.javax.sip.header.RecordRouteList;
import gov.nist.javax.sip.header.RetryAfter;
import gov.nist.javax.sip.header.Route;
import gov.nist.javax.sip.header.RouteList;
import gov.nist.javax.sip.header.SIPETag;
import gov.nist.javax.sip.header.SIPHeader;
import gov.nist.javax.sip.header.SIPHeaderList;
import gov.nist.javax.sip.header.SIPHeaderNamesCache;
import gov.nist.javax.sip.header.SIPIfMatch;
import gov.nist.javax.sip.header.Server;
import gov.nist.javax.sip.header.Subject;
import gov.nist.javax.sip.header.To;
import gov.nist.javax.sip.header.Unsupported;
import gov.nist.javax.sip.header.UserAgent;
import gov.nist.javax.sip.header.Via;
import gov.nist.javax.sip.header.ViaList;
import gov.nist.javax.sip.header.WWWAuthenticate;
import gov.nist.javax.sip.header.Warning;
import gov.nist.javax.sip.parser.HeaderParser;
import gov.nist.javax.sip.parser.ParserFactory;
import gov.nist.javax.sip.parser.PipelinedMsgParser;
import gov.nist.javax.sip.parser.StringMsgParser;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.sip.InvalidArgumentException;
import javax.sip.SipException;
import javax.sip.header.AuthorizationHeader;
import javax.sip.header.CSeqHeader;
import javax.sip.header.CallIdHeader;
import javax.sip.header.ContactHeader;
import javax.sip.header.ContentDispositionHeader;
import javax.sip.header.ContentEncodingHeader;
import javax.sip.header.ContentLanguageHeader;
import javax.sip.header.ContentLengthHeader;
import javax.sip.header.ContentTypeHeader;
import javax.sip.header.ExpiresHeader;
import javax.sip.header.FromHeader;
import javax.sip.header.Header;
import javax.sip.header.MaxForwardsHeader;
import javax.sip.header.RecordRouteHeader;
import javax.sip.header.RouteHeader;
import javax.sip.header.ToHeader;
import javax.sip.header.ViaHeader;
import javax.sip.message.Request;

public abstract class SIPMessage extends MessageObject implements javax.sip.message.Message, MessageExt {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "1E0E36F4EE56089C28BCB9B0F9B200D4", hash_generated_field = "4BA5E6BB1036D79534D4BE3D73466535")

    private String contentEncodingCharset = MessageFactoryImpl.getDefaultContentEncodingCharset();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "56B43B060CEE73356D58D497BA1C84EF", hash_generated_field = "3D632899724829D8B5950E7FD03861B1")

    protected boolean nullRequest;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "8068711CC630B2B1E236623A9F225BDE", hash_generated_field = "E835C2C2C7A6613C6BF5AAA84C167353")

    protected LinkedList<String> unrecognizedHeaders;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "4340FD73E75DF7A9D9E45902A59BA3A4", hash_generated_field = "247E0138E51DEE8295CE7FD03B5C7C7F")

    protected ConcurrentLinkedQueue<SIPHeader> headers;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "AC7113BAC9CAF3E84139BDAB33B013CD", hash_generated_field = "41941E45293112AC36DC5E7BE4DFF5AE")

    protected From fromHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "B779FC79043D8E24F2CB866B1B31BF4F", hash_generated_field = "386FEF496B2D00FF2AEEA4F647EAA2EC")

    protected To toHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "1124446E2524DA4D31B54C124ED3B1EA", hash_generated_field = "9243D81B8C37269C34D9BD3D6292835A")

    protected CSeq cSeqHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "F4E470CD8970EBBE1902E50EB09F4952", hash_generated_field = "471E372FA6B60996CC5D5DA482544660")

    protected CallID callIdHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "D7AC18F96FF3D69F56F179B05471A942", hash_generated_field = "BD2FD117E706370D42DF61B188BF8940")

    protected ContentLength contentLengthHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "237F1BDE377EF84E632D622E7809F04B", hash_generated_field = "19F23DC4282A0EF2D6622C8B0C1149E7")

    protected MaxForwards maxForwardsHeader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.697 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "BEC7808019D8AD57BF06A5469459FF0A")

    protected int size;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.698 -0400", hash_original_field = "2ECFA4ADA27CE6869BB8F49F338F1D05", hash_generated_field = "BDA818F16CAD309D41556EC35AB6E563")

    private String messageContent;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.698 -0400", hash_original_field = "F39EF8B0045FE162F4D1F6DFC1649F07", hash_generated_field = "3E3D2657E47D4DE2C783823CF246BBAB")

    private byte[] messageContentBytes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.698 -0400", hash_original_field = "BDA0AA4A25131E44F152C2811CF23974", hash_generated_field = "1560325BE0E32978EBE2ECDE71A6C345")

    private Object messageContentObject;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.698 -0400", hash_original_field = "4BEA1CEB6A7BE38EA2C72D63BB1811A8", hash_generated_field = "1C03D389CB46F0B01812A6FDFBD5DD7D")

    private Hashtable<String, SIPHeader> nameTable;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.698 -0400", hash_original_field = "756C73A51ADF7F04942C8BE97A032000", hash_generated_field = "89FDF1CBFFC083F61390A7888D3F82DE")

    protected Object applicationData;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.699 -0400", hash_original_method = "7EF8FE4247F4A54A74550FF503F5DF85", hash_generated_method = "9DF4127C06DEBDC679265FCD9AB742DC")
    public  SIPMessage() {
        this.unrecognizedHeaders = new LinkedList<String>();
        this.headers = new ConcurrentLinkedQueue<SIPHeader>();
        nameTable = new Hashtable<String, SIPHeader>();
        try 
        {
            this.attachHeader(new ContentLength(0), false);
        } //End block
        catch (Exception ex)
        { }
        // ---------- Original Method ----------
        //this.unrecognizedHeaders = new LinkedList<String>();
        //this.headers = new ConcurrentLinkedQueue<SIPHeader>();
        //nameTable = new Hashtable<String, SIPHeader>();
        //try {
            //this.attachHeader(new ContentLength(0), false);
        //} catch (Exception ex) {
        //}
    }

    
        public static boolean isRequestHeader(SIPHeader sipHeader) {
        return sipHeader instanceof AlertInfo || sipHeader instanceof InReplyTo
                || sipHeader instanceof Authorization || sipHeader instanceof MaxForwards
                || sipHeader instanceof UserAgent || sipHeader instanceof Priority
                || sipHeader instanceof ProxyAuthorization || sipHeader instanceof ProxyRequire
                || sipHeader instanceof ProxyRequireList || sipHeader instanceof Route
                || sipHeader instanceof RouteList || sipHeader instanceof Subject
                || sipHeader instanceof SIPIfMatch;
    }

    
        public static boolean isResponseHeader(SIPHeader sipHeader) {
        return sipHeader instanceof ErrorInfo || sipHeader instanceof ProxyAuthenticate
                || sipHeader instanceof Server || sipHeader instanceof Unsupported
                || sipHeader instanceof RetryAfter || sipHeader instanceof Warning
                || sipHeader instanceof WWWAuthenticate || sipHeader instanceof SIPETag
                || sipHeader instanceof RSeq;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.710 -0400", hash_original_method = "4E875487FBA3E9E3C25B636513844812", hash_generated_method = "67EA91B7C4F39B93E2A41242AF3434BF")
    public LinkedList<String> getMessageAsEncodedStrings() {
        LinkedList<String> varB4EAC82CA7396A68D541C85D26508E83_1186160900 = null; //Variable for return #1
        LinkedList<String> retval;
        retval = new LinkedList<String>();
        Iterator<SIPHeader> li;
        li = headers.iterator();
        {
            boolean varBC3D864DE8830EFC1098D2C2F456529D_631593865 = (li.hasNext());
            {
                SIPHeader sipHeader;
                sipHeader = (SIPHeader) li.next();
                {
                    SIPHeaderList< ? > shl;
                    shl = (SIPHeaderList< ? >) sipHeader;
                    retval.addAll(shl.getHeadersAsEncodedStrings());
                } //End block
                {
                    retval.add(sipHeader.encode());
                } //End block
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1186160900 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_1186160900.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1186160900;
        // ---------- Original Method ----------
        //LinkedList<String> retval = new LinkedList<String>();
        //Iterator<SIPHeader> li = headers.iterator();
        //while (li.hasNext()) {
            //SIPHeader sipHeader = (SIPHeader) li.next();
            //if (sipHeader instanceof SIPHeaderList) {
                //SIPHeaderList< ? > shl = (SIPHeaderList< ? >) sipHeader;
                //retval.addAll(shl.getHeadersAsEncodedStrings());
            //} else {
                //retval.add(sipHeader.encode());
            //}
        //}
        //return retval;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.711 -0400", hash_original_method = "A27900405272FB61F2D6362A05DA41D6", hash_generated_method = "9BA14D731AF75DF5AC95A895A02A4456")
    protected String encodeSIPHeaders() {
        String varB4EAC82CA7396A68D541C85D26508E83_180993558 = null; //Variable for return #1
        StringBuffer encoding;
        encoding = new StringBuffer();
        Iterator<SIPHeader> it;
        it = this.headers.iterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_1332030034 = (it.hasNext());
            {
                SIPHeader siphdr;
                siphdr = (SIPHeader) it.next();
                siphdr.encode(encoding);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_180993558 = contentLengthHeader.encode(encoding).append(NEWLINE).toString();
        varB4EAC82CA7396A68D541C85D26508E83_180993558.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_180993558;
        // ---------- Original Method ----------
        //StringBuffer encoding = new StringBuffer();
        //Iterator<SIPHeader> it = this.headers.iterator();
        //while (it.hasNext()) {
            //SIPHeader siphdr = (SIPHeader) it.next();
            //if (!(siphdr instanceof ContentLength))
                //siphdr.encode(encoding);
        //}
        //return contentLengthHeader.encode(encoding).append(NEWLINE).toString();
    }

    
    public abstract String encodeMessage();

    
    public abstract String getDialogId(boolean isServerTransaction);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.712 -0400", hash_original_method = "AC5B2D97481875B2502EE3A7FDAB3C5D", hash_generated_method = "4448F288B9453ED5F779F48E9A76D3B6")
    public boolean match(Object other) {
        {
            boolean varAC16F771BB29A32F2C455E410359AF13_684280824 = (!other.getClass().equals(this.getClass()));
        } //End collapsed parenthetic
        SIPMessage matchObj;
        matchObj = (SIPMessage) other;
        Iterator<SIPHeader> li;
        li = matchObj.getHeaders();
        {
            boolean varBC3D864DE8830EFC1098D2C2F456529D_1549388708 = (li.hasNext());
            {
                SIPHeader hisHeaders;
                hisHeaders = (SIPHeader) li.next();
                List<SIPHeader> myHeaders;
                myHeaders = this.getHeaderList(hisHeaders.getHeaderName());
                {
                    boolean var1A87CEBFEDCDEA34F4CA0D4A3EFEF656_92304313 = (myHeaders == null || myHeaders.size() == 0);
                } //End collapsed parenthetic
                {
                    ListIterator< ? > outerIterator;
                    outerIterator = ((SIPHeaderList< ? >) hisHeaders)
                        .listIterator();
                    {
                        boolean var4B5292B8CB3E98B12515573A3508C4DF_136867583 = (outerIterator.hasNext());
                        {
                            SIPHeader hisHeader;
                            hisHeader = (SIPHeader) outerIterator.next();
                            ListIterator< ? > innerIterator;
                            innerIterator = myHeaders.listIterator();
                            boolean found;
                            found = false;
                            {
                                boolean varB2E7926CCD2DEA34339CB3F15E1E57D6_1541383429 = (innerIterator.hasNext());
                                {
                                    SIPHeader myHeader;
                                    myHeader = (SIPHeader) innerIterator.next();
                                    {
                                        boolean varB96E7D72BCDF0CE20043B09547ED5B50_1954210394 = (myHeader.match(hisHeader));
                                        {
                                            found = true;
                                        } //End block
                                    } //End collapsed parenthetic
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                } //End block
                {
                    SIPHeader hisHeader;
                    hisHeader = hisHeaders;
                    ListIterator<SIPHeader> innerIterator;
                    innerIterator = myHeaders.listIterator();
                    boolean found;
                    found = false;
                    {
                        boolean varB3D6059B83D121ABA5AE6C0435970C24_678123966 = (innerIterator.hasNext());
                        {
                            SIPHeader myHeader;
                            myHeader = (SIPHeader) innerIterator.next();
                            {
                                boolean var6566F8FAB9C32C1FD403D502EB8A4D9C_1047250905 = (myHeader.match(hisHeader));
                                {
                                    found = true;
                                } //End block
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_690996700 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_690996700;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.726 -0400", hash_original_method = "789EABA7F64EF1819B9EE91356F4E918", hash_generated_method = "466F4EF935938899CD0912DF1E46932C")
    public void merge(Object template) {
        {
            boolean var283342AFB2702617040FEF7CDFDA21F1_1737754668 = (!template.getClass().equals(this.getClass()));
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Bad class " + template.getClass());
        } //End collapsed parenthetic
        SIPMessage templateMessage;
        templateMessage = (SIPMessage) template;
        Object[] templateHeaders;
        templateHeaders = templateMessage.headers.toArray();
        {
            int i;
            i = 0;
            {
                SIPHeader hdr;
                hdr = (SIPHeader) templateHeaders[i];
                String hdrName;
                hdrName = hdr.getHeaderName();
                List<SIPHeader> myHdrs;
                myHdrs = this.getHeaderList(hdrName);
                {
                    this.attachHeader(hdr);
                } //End block
                {
                    ListIterator<SIPHeader> it;
                    it = myHdrs.listIterator();
                    {
                        boolean var4CA2EDBF7D27138D75E73CCD01CCB025_457975373 = (it.hasNext());
                        {
                            SIPHeader sipHdr;
                            sipHdr = (SIPHeader) it.next();
                            sipHdr.merge(hdr);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End block
        } //End collapsed parenthetic
        addTaint(template.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.802 -0400", hash_original_method = "79C45AA8D92059F002F56259D7022AFE", hash_generated_method = "1221A49B0F8F7E3655F37EC179258F98")
    public String encode() {
        String varB4EAC82CA7396A68D541C85D26508E83_1413495062 = null; //Variable for return #1
        StringBuffer encoding;
        encoding = new StringBuffer();
        Iterator<SIPHeader> it;
        it = this.headers.iterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_1617013305 = (it.hasNext());
            {
                SIPHeader siphdr;
                siphdr = (SIPHeader) it.next();
                encoding.append(siphdr.encode());
            } //End block
        } //End collapsed parenthetic
        {
            Iterator<String> varFA17E7EA4EAE757CB30CF87AB56BCB8E_628986924 = (this.unrecognizedHeaders).iterator();
            varFA17E7EA4EAE757CB30CF87AB56BCB8E_628986924.hasNext();
            String unrecognized = varFA17E7EA4EAE757CB30CF87AB56BCB8E_628986924.next();
            {
                encoding.append(unrecognized).append(NEWLINE);
            } //End block
        } //End collapsed parenthetic
        encoding.append(contentLengthHeader.encode()).append(NEWLINE);
        {
            String mbody;
            mbody = this.getContent().toString();
            encoding.append(mbody);
        } //End block
        {
            String content;
            content = null;
            try 
            {
                content = messageContent;
                {
                    content = new String(messageContentBytes, getCharset() );
                } //End block
            } //End block
            catch (UnsupportedEncodingException ex)
            {
                InternalErrorHandler.handleException(ex);
            } //End block
            encoding.append(content);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1413495062 = encoding.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1413495062.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1413495062;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.807 -0400", hash_original_method = "716A084604DD8483BAA5EE270A2C01EC", hash_generated_method = "10638D2E3A15D5A8996BBB1EA0BF7DF8")
    public byte[] encodeAsBytes(String transport) {
        {
            boolean varA83D0D387E30A4710F38765D733091FF_1894486868 = (this instanceof SIPRequest && ((SIPRequest) this).isNullRequest());
            {
                byte[] varEEF83FE8F2414029AB57C6129B64128C_486308788 = ("\r\n\r\n".getBytes());
            } //End block
        } //End collapsed parenthetic
        ViaHeader topVia;
        topVia = (ViaHeader) this.getHeader(ViaHeader.NAME);
        try 
        {
            topVia.setTransport(transport);
        } //End block
        catch (ParseException e)
        {
            InternalErrorHandler.handleException(e);
        } //End block
        StringBuffer encoding;
        encoding = new StringBuffer();
        {
            Iterator<SIPHeader> it;
            it = this.headers.iterator();
            {
                boolean varB2FF4435B274CC4BE01D264DEA08F957_1651017076 = (it.hasNext());
                {
                    SIPHeader siphdr;
                    siphdr = (SIPHeader) it.next();
                    siphdr.encode(encoding);
                } //End block
            } //End collapsed parenthetic
        } //End block
        contentLengthHeader.encode(encoding);
        encoding.append(NEWLINE);
        byte[] retval;
        retval = null;
        byte[] content;
        content = this.getRawContent();
        {
            byte[] msgarray;
            msgarray = null;
            try 
            {
                msgarray = encoding.toString().getBytes( getCharset() );
            } //End block
            catch (UnsupportedEncodingException ex)
            {
                InternalErrorHandler.handleException(ex);
            } //End block
            retval = new byte[msgarray.length + content.length];
            System.arraycopy(msgarray, 0, retval, 0, msgarray.length);
            System.arraycopy(content, 0, retval, msgarray.length, content.length);
        } //End block
        {
            try 
            {
                retval = encoding.toString().getBytes( getCharset() );
            } //End block
            catch (UnsupportedEncodingException ex)
            {
                InternalErrorHandler.handleException(ex);
            } //End block
        } //End block
        addTaint(transport.getTaint());
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_761850376 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_761850376;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.813 -0400", hash_original_method = "CAA2D0A800A8BA91CFE25E08D1466992", hash_generated_method = "79E734AE2014980D793B6B6A25A120F6")
    public Object clone() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1547345799 = null; //Variable for return #1
        SIPMessage retval;
        retval = (SIPMessage) super.clone();
        retval.nameTable = new Hashtable<String, SIPHeader>();
        retval.fromHeader = null;
        retval.toHeader = null;
        retval.cSeqHeader = null;
        retval.callIdHeader = null;
        retval.contentLengthHeader = null;
        retval.maxForwardsHeader = null;
        {
            retval.headers = new ConcurrentLinkedQueue<SIPHeader>();
            {
                Iterator<SIPHeader> iter;
                iter = headers.iterator();
                boolean var8492AE2C695A56B730381A28B8BA3F6D_571024771 = (iter.hasNext());
                {
                    SIPHeader hdr;
                    hdr = (SIPHeader) iter.next();
                    retval.attachHeader((SIPHeader) hdr.clone());
                } //End block
            } //End collapsed parenthetic
        } //End block
        retval.messageContentBytes = (byte[]) this.messageContentBytes.clone();
        retval.messageContentObject = makeClone(messageContentObject);
        retval.unrecognizedHeaders = this.unrecognizedHeaders;
        varB4EAC82CA7396A68D541C85D26508E83_1547345799 = retval;
        varB4EAC82CA7396A68D541C85D26508E83_1547345799.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1547345799;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.822 -0400", hash_original_method = "CE435A19EF4C3C8ADC65C5BBD44452BB", hash_generated_method = "59A5D4F55BCA97A26D4525647150072E")
    public String debugDump() {
        String varB4EAC82CA7396A68D541C85D26508E83_1443572578 = null; //Variable for return #1
        stringRepresentation = "";
        sprint("SIPMessage:");
        sprint("{");
        try 
        {
            Field[] fields;
            fields = this.getClass().getDeclaredFields();
            {
                int i;
                i = 0;
                {
                    Field f;
                    f = fields[i];
                    Class< ? > fieldType;
                    fieldType = f.getType();
                    String fieldName;
                    fieldName = f.getName();
                    {
                        boolean var23F939341918CCB039A47328F0B892FA_1161618582 = (f.get(this) != null && SIPHeader.class.isAssignableFrom(fieldType)
                        && fieldName.compareTo("headers") != 0);
                        {
                            sprint(fieldName + "=");
                            sprint(((SIPHeader) f.get(this)).debugDump());
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        catch (Exception ex)
        {
            InternalErrorHandler.handleException(ex);
        } //End block
        sprint("List of headers : ");
        sprint(headers.toString());
        sprint("messageContent = ");
        sprint("{");
        sprint(messageContent);
        sprint("}");
        {
            boolean var4C7E5D19EA905354F5CD428885C482C2_1155452358 = (this.getContent() != null);
            {
                sprint(this.getContent().toString());
            } //End block
        } //End collapsed parenthetic
        sprint("}");
        varB4EAC82CA7396A68D541C85D26508E83_1443572578 = stringRepresentation;
        varB4EAC82CA7396A68D541C85D26508E83_1443572578.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1443572578;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.830 -0400", hash_original_method = "D9E90811A837F48EC447FF925318738A", hash_generated_method = "9CE4386FDF6C9B4F8424C994C2380479")
    private void attachHeader(SIPHeader h) {
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("null header!");
        try 
        {
            {
                SIPHeaderList< ? > hl;
                hl = (SIPHeaderList< ? >) h;
                {
                    boolean var394E2F20856295BBEFBFAE80A46F780D_1816242687 = (hl.isEmpty());
                } //End collapsed parenthetic
            } //End block
            attachHeader(h, false, false);
        } //End block
        catch (SIPDuplicateHeaderException ex)
        { }
        addTaint(h.getTaint());
        // ---------- Original Method ----------
        //if (h == null)
            //throw new IllegalArgumentException("null header!");
        //try {
            //if (h instanceof SIPHeaderList) {
                //SIPHeaderList< ? > hl = (SIPHeaderList< ? >) h;
                //if (hl.isEmpty()) {
                    //return;
                //}
            //}
            //attachHeader(h, false, false);
        //} catch (SIPDuplicateHeaderException ex) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.834 -0400", hash_original_method = "230B17E5A17A83111BEC4A023E8D6F14", hash_generated_method = "3973F43BDF57E22E347591EAEFFE7937")
    public void setHeader(Header sipHeader) {
        SIPHeader header;
        header = (SIPHeader) sipHeader;
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("null header!");
        try 
        {
            {
                SIPHeaderList< ? > hl;
                hl = (SIPHeaderList< ? >) header;
                {
                    boolean var394E2F20856295BBEFBFAE80A46F780D_1999412496 = (hl.isEmpty());
                } //End collapsed parenthetic
            } //End block
            this.removeHeader(header.getHeaderName());
            attachHeader(header, true, false);
        } //End block
        catch (SIPDuplicateHeaderException ex)
        {
            InternalErrorHandler.handleException(ex);
        } //End block
        addTaint(sipHeader.getTaint());
        // ---------- Original Method ----------
        //SIPHeader header = (SIPHeader) sipHeader;
        //if (header == null)
            //throw new IllegalArgumentException("null header!");
        //try {
            //if (header instanceof SIPHeaderList) {
                //SIPHeaderList< ? > hl = (SIPHeaderList< ? >) header;
                //if (hl.isEmpty())
                    //return;
            //}
            //this.removeHeader(header.getHeaderName());
            //attachHeader(header, true, false);
        //} catch (SIPDuplicateHeaderException ex) {
            //InternalErrorHandler.handleException(ex);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.835 -0400", hash_original_method = "DC88726E428D89A7A7082B0D5F94DA0F", hash_generated_method = "883BEA3AD234C50611F05C9CDD9C1082")
    public void setHeaders(java.util.List<SIPHeader> headers) {
        ListIterator<SIPHeader> listIterator;
        listIterator = headers.listIterator();
        {
            boolean var64B293ABD2B064B3F6A70551787AFBD5_2045652037 = (listIterator.hasNext());
            {
                SIPHeader sipHeader;
                sipHeader = (SIPHeader) listIterator.next();
                try 
                {
                    this.attachHeader(sipHeader, false);
                } //End block
                catch (SIPDuplicateHeaderException ex)
                { }
            } //End block
        } //End collapsed parenthetic
        addTaint(headers.getTaint());
        // ---------- Original Method ----------
        //ListIterator<SIPHeader> listIterator = headers.listIterator();
        //while (listIterator.hasNext()) {
            //SIPHeader sipHeader = (SIPHeader) listIterator.next();
            //try {
                //this.attachHeader(sipHeader, false);
            //} catch (SIPDuplicateHeaderException ex) {
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.835 -0400", hash_original_method = "9B17545BC9FC78AB24684381D78F3E60", hash_generated_method = "E410CC311470FEC5545821CB8000708C")
    public void attachHeader(SIPHeader h, boolean replaceflag) throws SIPDuplicateHeaderException {
        this.attachHeader(h, replaceflag, false);
        addTaint(h.getTaint());
        addTaint(replaceflag);
        // ---------- Original Method ----------
        //this.attachHeader(h, replaceflag, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.845 -0400", hash_original_method = "7BE2AED7224623BF9774680F8F08FE9F", hash_generated_method = "9EC3FC33771375EE6DF0C14604D22670")
    public void attachHeader(SIPHeader header, boolean replaceFlag, boolean top) throws SIPDuplicateHeaderException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("null header");
        } //End block
        SIPHeader h;
        {
            boolean varFDBDF2C7B3EA303E85FC4F475643B632_1101669612 = (ListMap.hasList(header) && !SIPHeaderList.class.isAssignableFrom(header.getClass()));
            {
                SIPHeaderList<SIPHeader> hdrList;
                hdrList = ListMap.getList(header);
                hdrList.add(header);
                h = hdrList;
            } //End block
            {
                h = header;
            } //End block
        } //End collapsed parenthetic
        String headerNameLowerCase;
        headerNameLowerCase = SIPHeaderNamesCache.toLowerCase(h.getName());
        {
            nameTable.remove(headerNameLowerCase);
        } //End block
        {
            boolean varFD544112D28585F2EA3523A14E11B4D2_1194701114 = (nameTable.containsKey(headerNameLowerCase) && !(h instanceof SIPHeaderList));
            {
                {
                    try 
                    {
                        ContentLength cl;
                        cl = (ContentLength) h;
                        contentLengthHeader.setContentLength(cl.getContentLength());
                    } //End block
                    catch (InvalidArgumentException e)
                    { }
                } //End block
            } //End block
        } //End collapsed parenthetic
        SIPHeader originalHeader;
        originalHeader = (SIPHeader) getHeader(header.getName());
        {
            Iterator<SIPHeader> li;
            li = headers.iterator();
            {
                boolean varD1722E42EA3CA8952F93B6521D875E61_119848356 = (li.hasNext());
                {
                    SIPHeader next;
                    next = (SIPHeader) li.next();
                    {
                        boolean varF7DF1CC74D70E774011938D4CD0C0F10_471768369 = (next.equals(originalHeader));
                        {
                            li.remove();
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            boolean varE6233AB522C882584164D87B1A152DBC_587140142 = (!nameTable.containsKey(headerNameLowerCase));
            {
                nameTable.put(headerNameLowerCase, h);
                headers.add(h);
            } //End block
            {
                {
                    SIPHeaderList< ? > hdrlist;
                    hdrlist = (SIPHeaderList< ? >) nameTable
                        .get(headerNameLowerCase);
                    hdrlist.concatenate((SIPHeaderList) h, top);
                    nameTable.put(headerNameLowerCase, h);
                } //End block
                {
                    nameTable.put(headerNameLowerCase, h);
                } //End block
            } //End block
        } //End collapsed parenthetic
        {
            this.fromHeader = (From) h;
        } //End block
        {
            this.contentLengthHeader = (ContentLength) h;
        } //End block
        {
            this.toHeader = (To) h;
        } //End block
        {
            this.cSeqHeader = (CSeq) h;
        } //End block
        {
            this.callIdHeader = (CallID) h;
        } //End block
        {
            this.maxForwardsHeader = (MaxForwards) h;
        } //End block
        addTaint(header.getTaint());
        addTaint(replaceFlag);
        addTaint(top);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.859 -0400", hash_original_method = "870FE8D30093D63C50FAB8B7342DE2BD", hash_generated_method = "7A73FD539F795A9A3B688B717B0DBB3E")
    public void removeHeader(String headerName, boolean top) {
        String headerNameLowerCase;
        headerNameLowerCase = SIPHeaderNamesCache.toLowerCase(headerName);
        SIPHeader toRemove;
        toRemove = (SIPHeader) nameTable.get(headerNameLowerCase);
        {
            SIPHeaderList< ? > hdrList;
            hdrList = (SIPHeaderList< ? >) toRemove;
            hdrList.removeFirst();
            hdrList.removeLast();
            {
                boolean var07A70300EBEAD4C7EF18232220E71612_1439934951 = (hdrList.isEmpty());
                {
                    Iterator<SIPHeader> li;
                    li = this.headers.iterator();
                    {
                        boolean var3B4C388F9F77D89F36DAE45711DE06F7_1288538390 = (li.hasNext());
                        {
                            SIPHeader sipHeader;
                            sipHeader = (SIPHeader) li.next();
                            {
                                boolean var009E1FF0FE664B4BBC785303E466D8DE_624229945 = (sipHeader.getName().equalsIgnoreCase(headerNameLowerCase));
                                li.remove();
                            } //End collapsed parenthetic
                        } //End block
                    } //End collapsed parenthetic
                    nameTable.remove(headerNameLowerCase);
                } //End block
            } //End collapsed parenthetic
        } //End block
        {
            this.nameTable.remove(headerNameLowerCase);
            {
                this.fromHeader = null;
            } //End block
            {
                this.toHeader = null;
            } //End block
            {
                this.cSeqHeader = null;
            } //End block
            {
                this.callIdHeader = null;
            } //End block
            {
                this.maxForwardsHeader = null;
            } //End block
            {
                this.contentLengthHeader = null;
            } //End block
            Iterator<SIPHeader> li;
            li = this.headers.iterator();
            {
                boolean varD1722E42EA3CA8952F93B6521D875E61_1598224087 = (li.hasNext());
                {
                    SIPHeader sipHeader;
                    sipHeader = (SIPHeader) li.next();
                    {
                        boolean var330E19EEBCC4008A3544282ED6FC5397_1301171818 = (sipHeader.getName().equalsIgnoreCase(headerName));
                        li.remove();
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(headerName.getTaint());
        addTaint(top);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.866 -0400", hash_original_method = "A43C3FE911C5904FA81F0CAD0EBF40FE", hash_generated_method = "A816CCF24846A759D2415A5D00C2815B")
    public void removeHeader(String headerName) {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("null arg");
        String headerNameLowerCase;
        headerNameLowerCase = SIPHeaderNamesCache.toLowerCase(headerName);
        SIPHeader removed;
        removed = (SIPHeader) nameTable.remove(headerNameLowerCase);
        {
            this.fromHeader = null;
        } //End block
        {
            this.toHeader = null;
        } //End block
        {
            this.cSeqHeader = null;
        } //End block
        {
            this.callIdHeader = null;
        } //End block
        {
            this.maxForwardsHeader = null;
        } //End block
        {
            this.contentLengthHeader = null;
        } //End block
        Iterator<SIPHeader> li;
        li = this.headers.iterator();
        {
            boolean varBC3D864DE8830EFC1098D2C2F456529D_807583466 = (li.hasNext());
            {
                SIPHeader sipHeader;
                sipHeader = (SIPHeader) li.next();
                {
                    boolean varFFF8027342880D91B8946C60AFFB1639_1987315446 = (sipHeader.getName().equalsIgnoreCase(headerNameLowerCase));
                    li.remove();
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(headerName.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.874 -0400", hash_original_method = "04B79D458A896A4F330B98FD27925CCB", hash_generated_method = "EA66820B14C23A6625AD86F4550A4991")
    public String getTransactionId() {
        String varB4EAC82CA7396A68D541C85D26508E83_158225067 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_562863385 = null; //Variable for return #2
        String varB4EAC82CA7396A68D541C85D26508E83_1319545598 = null; //Variable for return #3
        Via topVia;
        topVia = null;
        {
            boolean var45427AD504224B42EAB753EE244922DA_1116943324 = (!this.getViaHeaders().isEmpty());
            {
                topVia = (Via) this.getViaHeaders().getFirst();
            } //End block
        } //End collapsed parenthetic
        {
            boolean var056F2938B12C580EE182B380BF3D72E4_559641269 = (topVia != null
                && topVia.getBranch() != null
                && topVia.getBranch().toUpperCase().startsWith(
                        SIPConstants.BRANCH_MAGIC_COOKIE_UPPER_CASE));
            {
                {
                    boolean varC5B42D35EFD1E3730754821E02818371_1271107467 = (this.getCSeq().getMethod().equals(Request.CANCEL));
                    varB4EAC82CA7396A68D541C85D26508E83_158225067 = (topVia.getBranch() + ":" + this.getCSeq().getMethod()).toLowerCase();
                    varB4EAC82CA7396A68D541C85D26508E83_562863385 = topVia.getBranch().toLowerCase();
                } //End collapsed parenthetic
            } //End block
            {
                StringBuffer retval;
                retval = new StringBuffer();
                From from;
                from = (From) this.getFrom();
                To to;
                to = (To) this.getTo();
                {
                    boolean var6A7392F4B3488A548307196F7AD78D4D_2084150888 = (from.hasTag());
                    retval.append(from.getTag()).append("-");
                } //End collapsed parenthetic
                String cid;
                cid = this.callIdHeader.getCallId();
                retval.append(cid).append("-");
                retval.append(this.cSeqHeader.getSequenceNumber()).append("-").append(
                    this.cSeqHeader.getMethod());
                {
                    retval.append("-").append(topVia.getSentBy().encode());
                    {
                        boolean var739F416062AF6DDEEFA862BDC661C203_1998085562 = (!topVia.getSentBy().hasPort());
                        {
                            retval.append("-").append(5060);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
                {
                    boolean varC5B42D35EFD1E3730754821E02818371_922654844 = (this.getCSeq().getMethod().equals(Request.CANCEL));
                    {
                        retval.append(Request.CANCEL);
                    } //End block
                } //End collapsed parenthetic
                varB4EAC82CA7396A68D541C85D26508E83_1319545598 = retval.toString().toLowerCase().replace(":", "-").replace("@", "-")
                    + Utils.getSignature();
            } //End block
        } //End collapsed parenthetic
        String varA7E53CE21691AB073D9660D615818899_979069223; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_979069223 = varB4EAC82CA7396A68D541C85D26508E83_158225067;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_979069223 = varB4EAC82CA7396A68D541C85D26508E83_562863385;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_979069223 = varB4EAC82CA7396A68D541C85D26508E83_1319545598;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_979069223.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_979069223;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.875 -0400", hash_original_method = "2D96B4A52CFB118A97F95400511B110F", hash_generated_method = "B19C1FECAFAE1DE36D1CF427A1B673F1")
    public int hashCode() {
        if (DroidSafeAndroidRuntime.control) throw new RuntimeException(
                    "Invalid message! Cannot compute hashcode! call-id header is missing !");
        int var16C3388685D263B76B89DE8120886CF4_1219876577 = (this.callIdHeader.getCallId().hashCode());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1222122473 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1222122473;
        // ---------- Original Method ----------
        //if (this.callIdHeader == null)
            //throw new RuntimeException(
                    //"Invalid message! Cannot compute hashcode! call-id header is missing !");
        //else
            //return this.callIdHeader.getCallId().hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.883 -0400", hash_original_method = "0B4068F7FDD81C59C44EF10BE948C047", hash_generated_method = "160FD7CE520D080E5DE49667D8145011")
    public boolean hasContent() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_713149922 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_713149922;
        // ---------- Original Method ----------
        //return messageContent != null || messageContentBytes != null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.885 -0400", hash_original_method = "16CF6C29A1D923EBFDFB9DE65000093A", hash_generated_method = "DC16D218D88A49227A5549C236A21491")
    public Iterator<SIPHeader> getHeaders() {
        Iterator<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_1364235477 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1364235477 = headers.iterator();
        varB4EAC82CA7396A68D541C85D26508E83_1364235477.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1364235477;
        // ---------- Original Method ----------
        //return headers.iterator();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.891 -0400", hash_original_method = "1ADD77F2239C280F0A32414969B68312", hash_generated_method = "FA3DAA17E6C0B63055DC85BFC2EED8D0")
    public Header getHeader(String headerName) {
        Header varB4EAC82CA7396A68D541C85D26508E83_627785713 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_627785713 = getHeaderLowerCase(SIPHeaderNamesCache.toLowerCase(headerName));
        addTaint(headerName.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_627785713.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_627785713;
        // ---------- Original Method ----------
        //return getHeaderLowerCase(SIPHeaderNamesCache.toLowerCase(headerName));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.903 -0400", hash_original_method = "32A79E235DDCC6E80E2B12189B346373", hash_generated_method = "C85B2FA7B65DEFC71AE2C74A872EA0A1")
    private Header getHeaderLowerCase(String lowerCaseHeaderName) {
        Header varB4EAC82CA7396A68D541C85D26508E83_245209283 = null; //Variable for return #1
        Header varB4EAC82CA7396A68D541C85D26508E83_202820467 = null; //Variable for return #2
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("bad name");
        SIPHeader sipHeader;
        sipHeader = (SIPHeader) nameTable.get(lowerCaseHeaderName);
        varB4EAC82CA7396A68D541C85D26508E83_245209283 = (Header) ((SIPHeaderList) sipHeader).getFirst();
        varB4EAC82CA7396A68D541C85D26508E83_202820467 = (Header) sipHeader;
        addTaint(lowerCaseHeaderName.getTaint());
        Header varA7E53CE21691AB073D9660D615818899_1677350336; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1677350336 = varB4EAC82CA7396A68D541C85D26508E83_245209283;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1677350336 = varB4EAC82CA7396A68D541C85D26508E83_202820467;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1677350336.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1677350336;
        // ---------- Original Method ----------
        //if (lowerCaseHeaderName == null)
            //throw new NullPointerException("bad name");
        //SIPHeader sipHeader = (SIPHeader) nameTable.get(lowerCaseHeaderName);
        //if (sipHeader instanceof SIPHeaderList)
            //return (Header) ((SIPHeaderList) sipHeader).getFirst();
        //else
            //return (Header) sipHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.905 -0400", hash_original_method = "094433154D44236D0991BBCF366E0E6A", hash_generated_method = "A1D02F9FCB6B3211BF8DD0D8C5804BFB")
    public ContentType getContentTypeHeader() {
        ContentType varB4EAC82CA7396A68D541C85D26508E83_342636425 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_342636425 = (ContentType) getHeaderLowerCase(CONTENT_TYPE_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_342636425.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_342636425;
        // ---------- Original Method ----------
        //return (ContentType) getHeaderLowerCase(CONTENT_TYPE_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.910 -0400", hash_original_method = "F29DC29143C65AC3E05B010248583D2F", hash_generated_method = "5B52BCAF447C1D3D66A376A3CE711AA3")
    public ContentLengthHeader getContentLengthHeader() {
        ContentLengthHeader varB4EAC82CA7396A68D541C85D26508E83_870084854 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_870084854 = this.getContentLength();
        varB4EAC82CA7396A68D541C85D26508E83_870084854.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_870084854;
        // ---------- Original Method ----------
        //return this.getContentLength();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.911 -0400", hash_original_method = "E10DCB9A2200DABE5E8DE063DD5342F3", hash_generated_method = "C6A3F05F8581ACFD91C77EB2285A92FC")
    public FromHeader getFrom() {
        FromHeader varB4EAC82CA7396A68D541C85D26508E83_57397301 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_57397301 = (FromHeader) fromHeader;
        varB4EAC82CA7396A68D541C85D26508E83_57397301.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_57397301;
        // ---------- Original Method ----------
        //return (FromHeader) fromHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.912 -0400", hash_original_method = "10D7F219ADDA2D1F9DA30C2C2F401D03", hash_generated_method = "3198E372457FDBBB84FF73A50C2EBDF3")
    public ErrorInfoList getErrorInfoHeaders() {
        ErrorInfoList varB4EAC82CA7396A68D541C85D26508E83_710345796 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_710345796 = (ErrorInfoList) getSIPHeaderListLowerCase(ERROR_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_710345796.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_710345796;
        // ---------- Original Method ----------
        //return (ErrorInfoList) getSIPHeaderListLowerCase(ERROR_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.912 -0400", hash_original_method = "6BBB646E6D7D64808CC70B68BEB17C86", hash_generated_method = "842571ECAA17B2594C11FEC32FABC5B2")
    public ContactList getContactHeaders() {
        ContactList varB4EAC82CA7396A68D541C85D26508E83_1836696914 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1836696914 = (ContactList) this.getSIPHeaderListLowerCase(CONTACT_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_1836696914.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1836696914;
        // ---------- Original Method ----------
        //return (ContactList) this.getSIPHeaderListLowerCase(CONTACT_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.913 -0400", hash_original_method = "7930A8382B37585900D6B0ADAEF5E908", hash_generated_method = "53F989CC1B220DEB0D054A1215F190B1")
    public Contact getContactHeader() {
        Contact varB4EAC82CA7396A68D541C85D26508E83_512678366 = null; //Variable for return #1
        Contact varB4EAC82CA7396A68D541C85D26508E83_1257142313 = null; //Variable for return #2
        ContactList clist;
        clist = this.getContactHeaders();
        {
            varB4EAC82CA7396A68D541C85D26508E83_512678366 = (Contact) clist.getFirst();
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1257142313 = null;
        } //End block
        Contact varA7E53CE21691AB073D9660D615818899_983073055; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_983073055 = varB4EAC82CA7396A68D541C85D26508E83_512678366;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_983073055 = varB4EAC82CA7396A68D541C85D26508E83_1257142313;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_983073055.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_983073055;
        // ---------- Original Method ----------
        //ContactList clist = this.getContactHeaders();
        //if (clist != null) {
            //return (Contact) clist.getFirst();
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.926 -0400", hash_original_method = "F913627528E03E7BE96F6FC26EC1EAB5", hash_generated_method = "82C55A77DBF3A94BC6C8C28661BE71F2")
    public ViaList getViaHeaders() {
        ViaList varB4EAC82CA7396A68D541C85D26508E83_1720970470 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1720970470 = (ViaList) getSIPHeaderListLowerCase(VIA_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_1720970470.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1720970470;
        // ---------- Original Method ----------
        //return (ViaList) getSIPHeaderListLowerCase(VIA_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.932 -0400", hash_original_method = "4714C62FF03EE4A312864AB7EDBC16A3", hash_generated_method = "F3F662333D3AE8C0FAA5489ACA2336E5")
    public void setVia(java.util.List viaList) {
        ViaList vList;
        vList = new ViaList();
        ListIterator it;
        it = viaList.listIterator();
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_421291900 = (it.hasNext());
            {
                Via via;
                via = (Via) it.next();
                vList.add(via);
            } //End block
        } //End collapsed parenthetic
        this.setHeader(vList);
        addTaint(viaList.getTaint());
        // ---------- Original Method ----------
        //ViaList vList = new ViaList();
        //ListIterator it = viaList.listIterator();
        //while (it.hasNext()) {
            //Via via = (Via) it.next();
            //vList.add(via);
        //}
        //this.setHeader(vList);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.936 -0400", hash_original_method = "458FFC69EFF172F74B60E661629859D7", hash_generated_method = "67EDF1CD86F2C25AE371B91BD0C09BC3")
    public void setHeader(SIPHeaderList<Via> sipHeaderList) {
        this.setHeader((Header) sipHeaderList);
        addTaint(sipHeaderList.getTaint());
        // ---------- Original Method ----------
        //this.setHeader((Header) sipHeaderList);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.949 -0400", hash_original_method = "D8225C1F89A591B431137F8AC67C8011", hash_generated_method = "A897C8BD00E6970EB309C1B8B3FCACDC")
    public Via getTopmostVia() {
        Via varB4EAC82CA7396A68D541C85D26508E83_1094146813 = null; //Variable for return #1
        Via varB4EAC82CA7396A68D541C85D26508E83_788479891 = null; //Variable for return #2
        {
            boolean var7008E835C5FBF6766081DAE39E1151D8_400651631 = (this.getViaHeaders() == null);
            varB4EAC82CA7396A68D541C85D26508E83_1094146813 = null;
            varB4EAC82CA7396A68D541C85D26508E83_788479891 = (Via) (getViaHeaders().getFirst());
        } //End collapsed parenthetic
        Via varA7E53CE21691AB073D9660D615818899_1860820906; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1860820906 = varB4EAC82CA7396A68D541C85D26508E83_1094146813;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1860820906 = varB4EAC82CA7396A68D541C85D26508E83_788479891;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1860820906.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1860820906;
        // ---------- Original Method ----------
        //if (this.getViaHeaders() == null)
            //return null;
        //else
            //return (Via) (getViaHeaders().getFirst());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.949 -0400", hash_original_method = "734B287C3C9508BBD63962A2764D9C01", hash_generated_method = "3A700A58C081F81106B4108818638ED1")
    public CSeqHeader getCSeq() {
        CSeqHeader varB4EAC82CA7396A68D541C85D26508E83_1565644316 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1565644316 = (CSeqHeader) cSeqHeader;
        varB4EAC82CA7396A68D541C85D26508E83_1565644316.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1565644316;
        // ---------- Original Method ----------
        //return (CSeqHeader) cSeqHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.950 -0400", hash_original_method = "6A92E6492A4EA537FE7E1089912E5A2E", hash_generated_method = "9DBB878EDA3823F0FD1183ACD357A113")
    public Authorization getAuthorization() {
        Authorization varB4EAC82CA7396A68D541C85D26508E83_845644679 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_845644679 = (Authorization) getHeaderLowerCase(AUTHORIZATION_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_845644679.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_845644679;
        // ---------- Original Method ----------
        //return (Authorization) getHeaderLowerCase(AUTHORIZATION_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.954 -0400", hash_original_method = "1941B7A53D19F77542CA45C05AFF9884", hash_generated_method = "77440F2305C5496F59306D845875B91E")
    public MaxForwardsHeader getMaxForwards() {
        MaxForwardsHeader varB4EAC82CA7396A68D541C85D26508E83_1760801018 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1760801018 = maxForwardsHeader;
        varB4EAC82CA7396A68D541C85D26508E83_1760801018.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1760801018;
        // ---------- Original Method ----------
        //return maxForwardsHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.955 -0400", hash_original_method = "08224707CDDBB2C37148D3B618E2B6B7", hash_generated_method = "C7782781DD6A03E28DECD79DAD99D8FE")
    public void setMaxForwards(MaxForwardsHeader maxForwards) {
        this.setHeader(maxForwards);
        addTaint(maxForwards.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(maxForwards);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.955 -0400", hash_original_method = "7800F88C4B689BC7D7C78CBE850678CA", hash_generated_method = "5915D1809537101B9DEB29C144C5E718")
    public RouteList getRouteHeaders() {
        RouteList varB4EAC82CA7396A68D541C85D26508E83_731511272 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_731511272 = (RouteList) getSIPHeaderListLowerCase(ROUTE_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_731511272.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_731511272;
        // ---------- Original Method ----------
        //return (RouteList) getSIPHeaderListLowerCase(ROUTE_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.956 -0400", hash_original_method = "9DA69A74904D39D3267E3E1010C409F3", hash_generated_method = "BE752353C9E6B8E268D230378100A734")
    public CallIdHeader getCallId() {
        CallIdHeader varB4EAC82CA7396A68D541C85D26508E83_2138176633 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2138176633 = callIdHeader;
        varB4EAC82CA7396A68D541C85D26508E83_2138176633.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2138176633;
        // ---------- Original Method ----------
        //return callIdHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.956 -0400", hash_original_method = "5127E494FA29164B5CB6A74D7F3B176F", hash_generated_method = "93D4EC778359912FC3F69DC75D69A78A")
    public void setCallId(CallIdHeader callId) {
        this.setHeader(callId);
        addTaint(callId.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(callId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.956 -0400", hash_original_method = "16037BFD4917B839A558D81FBF251209", hash_generated_method = "F3D09F4F11A0A28101BC189451A23614")
    public void setCallId(String callId) throws java.text.ParseException {
        {
            this.setHeader(new CallID());
        } //End block
        callIdHeader.setCallId(callId);
        addTaint(callId.getTaint());
        // ---------- Original Method ----------
        //if (callIdHeader == null) {
            //this.setHeader(new CallID());
        //}
        //callIdHeader.setCallId(callId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.967 -0400", hash_original_method = "6FCB806D3659BA1DF59CA318834E3C35", hash_generated_method = "89210B1DD1EA71DDF2D65E6B65FEDE20")
    public RecordRouteList getRecordRouteHeaders() {
        RecordRouteList varB4EAC82CA7396A68D541C85D26508E83_2087857008 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2087857008 = (RecordRouteList) this.getSIPHeaderListLowerCase(RECORDROUTE_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_2087857008.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2087857008;
        // ---------- Original Method ----------
        //return (RecordRouteList) this.getSIPHeaderListLowerCase(RECORDROUTE_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.968 -0400", hash_original_method = "D2F3523F315E42C3CDB78FE4D7DBD860", hash_generated_method = "2921285F761A4686362489F160CB8F72")
    public ToHeader getTo() {
        ToHeader varB4EAC82CA7396A68D541C85D26508E83_405428072 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_405428072 = (ToHeader) toHeader;
        varB4EAC82CA7396A68D541C85D26508E83_405428072.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_405428072;
        // ---------- Original Method ----------
        //return (ToHeader) toHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.968 -0400", hash_original_method = "AA146219F068967CE3F55E3F637E86D7", hash_generated_method = "2054F00F6867314407CF3FA28F4FDE51")
    public void setTo(ToHeader to) {
        this.setHeader(to);
        addTaint(to.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(to);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.968 -0400", hash_original_method = "61E9A0C02A79622F4076A17D3E8275D9", hash_generated_method = "E26DF63DDF37B39138EA3D063BD4E1F4")
    public void setFrom(FromHeader from) {
        this.setHeader(from);
        addTaint(from.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(from);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.969 -0400", hash_original_method = "BF14C97BBADF5B6B3DD1A606FFB97154", hash_generated_method = "F946CEAF9361D6D2B1A1BDE53ECD2163")
    public ContentLengthHeader getContentLength() {
        ContentLengthHeader varB4EAC82CA7396A68D541C85D26508E83_138746963 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_138746963 = this.contentLengthHeader;
        varB4EAC82CA7396A68D541C85D26508E83_138746963.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_138746963;
        // ---------- Original Method ----------
        //return this.contentLengthHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.981 -0400", hash_original_method = "40D47E0A8FD809ED2EC3170259DB7692", hash_generated_method = "FFC513E2F670049C7D3BF0F7354327BA")
    public String getMessageContent() throws UnsupportedEncodingException {
        String varB4EAC82CA7396A68D541C85D26508E83_458921601 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1836454462 = null; //Variable for return #2
        varB4EAC82CA7396A68D541C85D26508E83_458921601 = null;
        {
            this.messageContent = new String(messageContentBytes, getCharset() );
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1836454462 = this.messageContent;
        String varA7E53CE21691AB073D9660D615818899_1151890039; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1151890039 = varB4EAC82CA7396A68D541C85D26508E83_458921601;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1151890039 = varB4EAC82CA7396A68D541C85D26508E83_1836454462;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1151890039.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1151890039;
        // ---------- Original Method ----------
        //if (this.messageContent == null && this.messageContentBytes == null)
            //return null;
        //else if (this.messageContent == null) {
            //this.messageContent = new String(messageContentBytes, getCharset() );
        //}
        //return this.messageContent;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.982 -0400", hash_original_method = "0A8A11F2CA57642B3F77F3FF48221ABE", hash_generated_method = "8B0AA58E4F5DD9B025C92AC2000B41A9")
    public byte[] getRawContent() {
        try 
        {
            {
                String messageContent;
                messageContent = this.messageContentObject.toString();
                this.messageContentBytes = messageContent.getBytes( getCharset() );
            } //End block
            {
                this.messageContentBytes = messageContent.getBytes( getCharset() );
            } //End block
        } //End block
        catch (UnsupportedEncodingException ex)
        {
            InternalErrorHandler.handleException(ex);
        } //End block
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_662300611 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_662300611;
        // ---------- Original Method ----------
        //try {
            //if ( this.messageContentBytes != null ) {
            //} else if (this.messageContentObject != null) {
                //String messageContent = this.messageContentObject.toString();
                //this.messageContentBytes = messageContent.getBytes( getCharset() );
            //} else if (this.messageContent != null) {
            	//this.messageContentBytes = messageContent.getBytes( getCharset() );                
            //}
            //return this.messageContentBytes;
        //} catch (UnsupportedEncodingException ex) {
            //InternalErrorHandler.handleException(ex);
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.983 -0400", hash_original_method = "AF476AB0E969B944040525792C5BC52E", hash_generated_method = "21B618C6C7A31C64E1158733A6D4B327")
    public void setMessageContent(String type, String subType, String messageContent) {
        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("messgeContent is null");
        ContentType ct;
        ct = new ContentType(type, subType);
        this.setHeader(ct);
        this.messageContent = messageContent;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        computeContentLength(messageContent);
        addTaint(type.getTaint());
        addTaint(subType.getTaint());
        // ---------- Original Method ----------
        //if (messageContent == null)
            //throw new IllegalArgumentException("messgeContent is null");
        //ContentType ct = new ContentType(type, subType);
        //this.setHeader(ct);
        //this.messageContent = messageContent;
        //this.messageContentBytes = null;
        //this.messageContentObject = null;
        //computeContentLength(messageContent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.983 -0400", hash_original_method = "F6727728B1118BFFD3FCC04534FCE621", hash_generated_method = "ABCBE7C0F118C12CBAD6D5858BBBB712")
    public void setContent(Object content, ContentTypeHeader contentTypeHeader) throws ParseException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("null content");
        this.setHeader(contentTypeHeader);
        this.messageContent = null;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        {
            this.messageContent = (String) content;
        } //End block
        {
            this.messageContentBytes = (byte[]) content;
        } //End block
        this.messageContentObject = content;
        computeContentLength(content);
        addTaint(contentTypeHeader.getTaint());
        // ---------- Original Method ----------
        //if (content == null)
            //throw new NullPointerException("null content");
        //this.setHeader(contentTypeHeader);
        //this.messageContent = null;
        //this.messageContentBytes = null;
        //this.messageContentObject = null;
        //if (content instanceof String) {
            //this.messageContent = (String) content;
        //} else if (content instanceof byte[]) {
            //this.messageContentBytes = (byte[]) content;
        //} else
            //this.messageContentObject = content;
        //computeContentLength(content);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.984 -0400", hash_original_method = "54FC52177A1CB92C02565C30A4F8CE94", hash_generated_method = "B27E0DFE47F35BE629F1839B56E1AE35")
    public Object getContent() {
        Object varB4EAC82CA7396A68D541C85D26508E83_710158210 = null; //Variable for return #1
        Object varB4EAC82CA7396A68D541C85D26508E83_1337125375 = null; //Variable for return #2
        Object varB4EAC82CA7396A68D541C85D26508E83_1032512171 = null; //Variable for return #3
        Object varB4EAC82CA7396A68D541C85D26508E83_1759413390 = null; //Variable for return #4
        varB4EAC82CA7396A68D541C85D26508E83_710158210 = messageContentObject;
        varB4EAC82CA7396A68D541C85D26508E83_1337125375 = this.messageContent;
        varB4EAC82CA7396A68D541C85D26508E83_1032512171 = this.messageContentBytes;
        varB4EAC82CA7396A68D541C85D26508E83_1759413390 = null;
        Object varA7E53CE21691AB073D9660D615818899_185852563; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_185852563 = varB4EAC82CA7396A68D541C85D26508E83_710158210;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_185852563 = varB4EAC82CA7396A68D541C85D26508E83_1337125375;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_185852563 = varB4EAC82CA7396A68D541C85D26508E83_1032512171;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_185852563 = varB4EAC82CA7396A68D541C85D26508E83_1759413390;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_185852563.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_185852563;
        // ---------- Original Method ----------
        //if (this.messageContentObject != null)
            //return messageContentObject;
        //else if (this.messageContent != null)
            //return this.messageContent;
        //else if (this.messageContentBytes != null)
            //return this.messageContentBytes;
        //else
            //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.992 -0400", hash_original_method = "567464035ABE474ACDCFF614F9D534B5", hash_generated_method = "192CE7C31B0E17C2398FDD2D0C5BD23E")
    public void setMessageContent(String type, String subType, byte[] messageContent) {
        ContentType ct;
        ct = new ContentType(type, subType);
        this.setHeader(ct);
        this.setMessageContent(messageContent);
        computeContentLength(messageContent);
        addTaint(type.getTaint());
        addTaint(subType.getTaint());
        addTaint(messageContent[0]);
        // ---------- Original Method ----------
        //ContentType ct = new ContentType(type, subType);
        //this.setHeader(ct);
        //this.setMessageContent(messageContent);
        //computeContentLength(messageContent);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.993 -0400", hash_original_method = "39F2BE1EDB04320A3B64ACD0EA831DED", hash_generated_method = "0AFC8C9588F019835ABD9AC6FD201DF3")
    public void setMessageContent(String content, boolean strict, boolean computeContentLength, int givenLength) throws ParseException {
        computeContentLength(content);
        {
            {
                boolean var7F2E7916F611D748ECF2BCAD4DD266ED_1406299072 = ((!strict && this.contentLengthHeader.getContentLength() != givenLength) 
                    || this.contentLengthHeader.getContentLength() < givenLength);
                {
                    if (DroidSafeAndroidRuntime.control) throw new ParseException("Invalid content length "
                        + this.contentLengthHeader.getContentLength() + " / " + givenLength, 0);
                } //End block
            } //End collapsed parenthetic
        } //End block
        messageContent = content;
        messageContentBytes = null;
        messageContentObject = null;
        addTaint(strict);
        addTaint(computeContentLength);
        addTaint(givenLength);
        // ---------- Original Method ----------
        //computeContentLength(content);
        //if ((!computeContentLength)) {
            //if ( (!strict && this.contentLengthHeader.getContentLength() != givenLength) 
                    //|| this.contentLengthHeader.getContentLength() < givenLength) {
                //throw new ParseException("Invalid content length "
                        //+ this.contentLengthHeader.getContentLength() + " / " + givenLength, 0);
            //}
        //}
        //messageContent = content;
        //messageContentBytes = null;
        //messageContentObject = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.993 -0400", hash_original_method = "19C7E154661732280AD152F3E186944D", hash_generated_method = "FE4B2F2B2435BA47A415DC55253399E0")
    public void setMessageContent(byte[] content) {
        computeContentLength(content);
        messageContentBytes = content;
        messageContent = null;
        messageContentObject = null;
        // ---------- Original Method ----------
        //computeContentLength(content);
        //messageContentBytes = content;
        //messageContent = null;
        //messageContentObject = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:34.994 -0400", hash_original_method = "677A53CE4E6B4035F9B12FCECD3E865E", hash_generated_method = "865FF9968E58D71478C5268658985B60")
    public void setMessageContent(byte[] content, boolean computeContentLength, int givenLength) throws ParseException {
        computeContentLength(content);
        {
            boolean var53E9258046341087EA338AE330779B8F_1597085389 = ((!computeContentLength) && this.contentLengthHeader.getContentLength() < givenLength);
            {
                if (DroidSafeAndroidRuntime.control) throw new ParseException("Invalid content length "
                    + this.contentLengthHeader.getContentLength() + " / " + givenLength, 0);
            } //End block
        } //End collapsed parenthetic
        messageContentBytes = content;
        messageContent = null;
        messageContentObject = null;
        addTaint(computeContentLength);
        addTaint(givenLength);
        // ---------- Original Method ----------
        //computeContentLength(content);
        //if ((!computeContentLength) && this.contentLengthHeader.getContentLength() < givenLength) {
            //throw new ParseException("Invalid content length "
                    //+ this.contentLengthHeader.getContentLength() + " / " + givenLength, 0);
        //}
        //messageContentBytes = content;
        //messageContent = null;
        //messageContentObject = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.005 -0400", hash_original_method = "D3327D918F93ECC2995A4C67A415A1A5", hash_generated_method = "2B5D747060AF0F624BCF432147E14A0A")
    private void computeContentLength(Object content) {
        int length;
        length = 0;
        {
            {
                try 
                {
                    length = ((String) content).getBytes( getCharset() ).length;
                } //End block
                catch (UnsupportedEncodingException ex)
                {
                    InternalErrorHandler.handleException(ex);
                } //End block
            } //End block
            {
                length = ((byte[]) content).length;
            } //End block
            {
                length = content.toString().length();
            } //End block
        } //End block
        try 
        {
            contentLengthHeader.setContentLength(length);
        } //End block
        catch (InvalidArgumentException e)
        { }
        addTaint(content.getTaint());
        // ---------- Original Method ----------
        //int length = 0;
        //if (content != null) {
            //if (content instanceof String) {
                //try {
                    //length = ((String) content).getBytes( getCharset() ).length;
                //} catch (UnsupportedEncodingException ex) {
                    //InternalErrorHandler.handleException(ex);
                //}
            //} else if (content instanceof byte[]) {
                //length = ((byte[]) content).length;
            //} else {
                //length = content.toString().length();
            //}
        //}
        //try {
            //contentLengthHeader.setContentLength(length);
        //} catch (InvalidArgumentException e) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.006 -0400", hash_original_method = "B09AA5FB20D2965ADCD41D53860CDBE3", hash_generated_method = "EC9C60094C43878E3E0EBD84910DA36F")
    public void removeContent() {
        messageContent = null;
        messageContentBytes = null;
        messageContentObject = null;
        try 
        {
            this.contentLengthHeader.setContentLength(0);
        } //End block
        catch (InvalidArgumentException ex)
        { }
        // ---------- Original Method ----------
        //messageContent = null;
        //messageContentBytes = null;
        //messageContentObject = null;
        //try {
            //this.contentLengthHeader.setContentLength(0);
        //} catch (InvalidArgumentException ex) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.007 -0400", hash_original_method = "B51D33B6E886062DB169564C9DA9DCD8", hash_generated_method = "4A111F3352210B0CB9CE876F351CB32A")
    @SuppressWarnings("unchecked")
    public ListIterator<SIPHeader> getHeaders(String headerName) {
        ListIterator<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_995497527 = null; //Variable for return #1
        ListIterator<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_732954373 = null; //Variable for return #2
        ListIterator<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_1643043099 = null; //Variable for return #3
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("null headerName");
        SIPHeader sipHeader;
        sipHeader = (SIPHeader) nameTable.get(SIPHeaderNamesCache
                .toLowerCase(headerName));
        varB4EAC82CA7396A68D541C85D26508E83_995497527 = new LinkedList<SIPHeader>().listIterator();
        {
            varB4EAC82CA7396A68D541C85D26508E83_732954373 = ((SIPHeaderList<SIPHeader>) sipHeader).listIterator();
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1643043099 = new HeaderIterator(this, sipHeader);
        } //End block
        addTaint(headerName.getTaint());
        ListIterator<SIPHeader> varA7E53CE21691AB073D9660D615818899_2125849575; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_2125849575 = varB4EAC82CA7396A68D541C85D26508E83_995497527;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_2125849575 = varB4EAC82CA7396A68D541C85D26508E83_732954373;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2125849575 = varB4EAC82CA7396A68D541C85D26508E83_1643043099;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2125849575.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_2125849575;
        // ---------- Original Method ----------
        //if (headerName == null)
            //throw new NullPointerException("null headerName");
        //SIPHeader sipHeader = (SIPHeader) nameTable.get(SIPHeaderNamesCache
                //.toLowerCase(headerName));
        //if (sipHeader == null)
            //return new LinkedList<SIPHeader>().listIterator();
        //if (sipHeader instanceof SIPHeaderList) {
            //return ((SIPHeaderList<SIPHeader>) sipHeader).listIterator();
        //} else {
            //return new HeaderIterator(this, sipHeader);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.015 -0400", hash_original_method = "6CE50AA271DA9876F1700D8E280EAFD1", hash_generated_method = "A76544936561C117BE95BFFAB7E7C9F6")
    public String getHeaderAsFormattedString(String name) {
        String varB4EAC82CA7396A68D541C85D26508E83_669575579 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_94381357 = null; //Variable for return #2
        String lowerCaseName;
        lowerCaseName = name.toLowerCase();
        {
            boolean varC2A08EC06B69AD4EEFB5CF0E06463703_1563008435 = (this.nameTable.containsKey(lowerCaseName));
            {
                varB4EAC82CA7396A68D541C85D26508E83_669575579 = this.nameTable.get(lowerCaseName).toString();
            } //End block
            {
                varB4EAC82CA7396A68D541C85D26508E83_94381357 = this.getHeader(name).toString();
            } //End block
        } //End collapsed parenthetic
        addTaint(name.getTaint());
        String varA7E53CE21691AB073D9660D615818899_785784790; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_785784790 = varB4EAC82CA7396A68D541C85D26508E83_669575579;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_785784790 = varB4EAC82CA7396A68D541C85D26508E83_94381357;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_785784790.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_785784790;
        // ---------- Original Method ----------
        //String lowerCaseName = name.toLowerCase();
        //if (this.nameTable.containsKey(lowerCaseName)) {
            //return this.nameTable.get(lowerCaseName).toString();
        //} else {
            //return this.getHeader(name).toString();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.015 -0400", hash_original_method = "2723C6F27F309BF6F386C5DF25AB6032", hash_generated_method = "A11DF5142F13DE4AD11A80C3AE7830CD")
    private SIPHeader getSIPHeaderListLowerCase(String lowerCaseHeaderName) {
        SIPHeader varB4EAC82CA7396A68D541C85D26508E83_1839380797 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1839380797 = nameTable.get(lowerCaseHeaderName);
        addTaint(lowerCaseHeaderName.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1839380797.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1839380797;
        // ---------- Original Method ----------
        //return nameTable.get(lowerCaseHeaderName);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.016 -0400", hash_original_method = "9F4B7A8AFA1B725FEEE6FA6CFA2755DF", hash_generated_method = "13C67F2CEC3E5DF5AD0735D57F0A13A5")
    @SuppressWarnings("unchecked")
    private List<SIPHeader> getHeaderList(String headerName) {
        List<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_1909424795 = null; //Variable for return #1
        List<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_1099156283 = null; //Variable for return #2
        List<SIPHeader> varB4EAC82CA7396A68D541C85D26508E83_965427927 = null; //Variable for return #3
        SIPHeader sipHeader;
        sipHeader = (SIPHeader) nameTable.get(SIPHeaderNamesCache
                .toLowerCase(headerName));
        varB4EAC82CA7396A68D541C85D26508E83_1909424795 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1099156283 = (List<SIPHeader>) (((SIPHeaderList< ? >) sipHeader).getHeaderList());
        {
            LinkedList<SIPHeader> ll;
            ll = new LinkedList<SIPHeader>();
            ll.add(sipHeader);
            varB4EAC82CA7396A68D541C85D26508E83_965427927 = ll;
        } //End block
        addTaint(headerName.getTaint());
        List<SIPHeader> varA7E53CE21691AB073D9660D615818899_1294183036; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1294183036 = varB4EAC82CA7396A68D541C85D26508E83_1909424795;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1294183036 = varB4EAC82CA7396A68D541C85D26508E83_1099156283;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1294183036 = varB4EAC82CA7396A68D541C85D26508E83_965427927;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1294183036.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1294183036;
        // ---------- Original Method ----------
        //SIPHeader sipHeader = (SIPHeader) nameTable.get(SIPHeaderNamesCache
                //.toLowerCase(headerName));
        //if (sipHeader == null)
            //return null;
        //else if (sipHeader instanceof SIPHeaderList)
            //return (List<SIPHeader>) (((SIPHeaderList< ? >) sipHeader).getHeaderList());
        //else {
            //LinkedList<SIPHeader> ll = new LinkedList<SIPHeader>();
            //ll.add(sipHeader);
            //return ll;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.016 -0400", hash_original_method = "6DBF8105DE4FD1DC6BA28CCFFFEEC680", hash_generated_method = "D31983BB471BB8AE9EDD92ECF7EFFA47")
    public boolean hasHeader(String headerName) {
        boolean var8F92FAB8130AFDAD062FD4FCF8454941_1281369372 = (nameTable.containsKey(SIPHeaderNamesCache.toLowerCase(headerName)));
        addTaint(headerName.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_790886855 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_790886855;
        // ---------- Original Method ----------
        //return nameTable.containsKey(SIPHeaderNamesCache.toLowerCase(headerName));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.017 -0400", hash_original_method = "4231E4F79F4F1EB89656879CE689B66E", hash_generated_method = "293C4F5EB47B137622E0FBF25282432F")
    public boolean hasFromTag() {
        boolean var0911B64052451985C6CF9283DDE5ABCA_2145046111 = (fromHeader != null && fromHeader.getTag() != null);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_176191663 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_176191663;
        // ---------- Original Method ----------
        //return fromHeader != null && fromHeader.getTag() != null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.017 -0400", hash_original_method = "62BEDD072F48BB9AA18DBB87956D8F3D", hash_generated_method = "2637F5AC05843A3B03B6ECFDCE3D1023")
    public boolean hasToTag() {
        boolean varD9AA5806DF483D6615D6AF7918F3DCC2_1925926814 = (toHeader != null && toHeader.getTag() != null);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_460599512 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_460599512;
        // ---------- Original Method ----------
        //return toHeader != null && toHeader.getTag() != null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.021 -0400", hash_original_method = "5C72A9C802C6EC574622DB27171F7A2E", hash_generated_method = "999874E3974EA0A4D64A74A70A39B7AE")
    public String getFromTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_1181136142 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1181136142 = fromHeader == null ? null : fromHeader.getTag();
        varB4EAC82CA7396A68D541C85D26508E83_1181136142.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1181136142;
        // ---------- Original Method ----------
        //return fromHeader == null ? null : fromHeader.getTag();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.022 -0400", hash_original_method = "2974ECBC3FF627B3CB2268B4D90C9E07", hash_generated_method = "382BC4877621725C2DA497EEB1546B6B")
    public void setFromTag(String tag) {
        try 
        {
            fromHeader.setTag(tag);
        } //End block
        catch (ParseException e)
        { }
        addTaint(tag.getTaint());
        // ---------- Original Method ----------
        //try {
            //fromHeader.setTag(tag);
        //} catch (ParseException e) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.022 -0400", hash_original_method = "7DFC8A6205B3CBC36E5183721A30EB01", hash_generated_method = "4417ED4E158BB7A1C22A138733D5DA53")
    public void setToTag(String tag) {
        try 
        {
            toHeader.setTag(tag);
        } //End block
        catch (ParseException e)
        { }
        addTaint(tag.getTaint());
        // ---------- Original Method ----------
        //try {
            //toHeader.setTag(tag);
        //} catch (ParseException e) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.038 -0400", hash_original_method = "5B9C84C201385B92B0E684584F1ECF7E", hash_generated_method = "55400D3BB1C1AC516DEE67577DE9411A")
    public String getToTag() {
        String varB4EAC82CA7396A68D541C85D26508E83_1763492858 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1763492858 = toHeader == null ? null : toHeader.getTag();
        varB4EAC82CA7396A68D541C85D26508E83_1763492858.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1763492858;
        // ---------- Original Method ----------
        //return toHeader == null ? null : toHeader.getTag();
    }

    
    public abstract String getFirstLine();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.039 -0400", hash_original_method = "34A83ACBA422BB4E8AD74511B9BCE335", hash_generated_method = "36EBECAA2F71F186AE0CA22C9536C921")
    public void addHeader(Header sipHeader) {
        SIPHeader sh;
        sh = (SIPHeader) sipHeader;
        try 
        {
            {
                attachHeader(sh, false, true);
            } //End block
            {
                attachHeader(sh, false, false);
            } //End block
        } //End block
        catch (SIPDuplicateHeaderException ex)
        {
            try 
            {
                {
                    ContentLength cl;
                    cl = (ContentLength) sipHeader;
                    contentLengthHeader.setContentLength(cl.getContentLength());
                } //End block
            } //End block
            catch (InvalidArgumentException e)
            { }
        } //End block
        addTaint(sipHeader.getTaint());
        // ---------- Original Method ----------
        //SIPHeader sh = (SIPHeader) sipHeader;
        //try {
            //if ((sipHeader instanceof ViaHeader) || (sipHeader instanceof RecordRouteHeader)) {
                //attachHeader(sh, false, true);
            //} else {
                //attachHeader(sh, false, false);
            //}
        //} catch (SIPDuplicateHeaderException ex) {
            //try {
                //if (sipHeader instanceof ContentLength) {
                    //ContentLength cl = (ContentLength) sipHeader;
                    //contentLengthHeader.setContentLength(cl.getContentLength());
                //}
            //} catch (InvalidArgumentException e) {
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.039 -0400", hash_original_method = "8AEC9EB78EF51FE3B48C263748A725D0", hash_generated_method = "DEA0E19CDDDD5158D2B32F93CBF87B4A")
    public void addUnparsed(String unparsed) {
        this.unrecognizedHeaders.add(unparsed);
        addTaint(unparsed.getTaint());
        // ---------- Original Method ----------
        //this.unrecognizedHeaders.add(unparsed);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.039 -0400", hash_original_method = "8ACC7204C4B122EB788CE6764EA1EA77", hash_generated_method = "B98160B2126575919C2266D27C5A3BBB")
    public void addHeader(String sipHeader) {
        String hdrString;
        hdrString = sipHeader.trim() + "\n";
        try 
        {
            HeaderParser parser;
            parser = ParserFactory.createParser(sipHeader);
            SIPHeader sh;
            sh = parser.parse();
            this.attachHeader(sh, false);
        } //End block
        catch (ParseException ex)
        {
            this.unrecognizedHeaders.add(hdrString);
        } //End block
        addTaint(sipHeader.getTaint());
        // ---------- Original Method ----------
        //String hdrString = sipHeader.trim() + "\n";
        //try {
            //HeaderParser parser = ParserFactory.createParser(sipHeader);
            //SIPHeader sh = parser.parse();
            //this.attachHeader(sh, false);
        //} catch (ParseException ex) {
            //this.unrecognizedHeaders.add(hdrString);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.042 -0400", hash_original_method = "F4B3A65BCC1C141571353972EC488146", hash_generated_method = "CD3CA92364D1E41905A950362795473C")
    public ListIterator<String> getUnrecognizedHeaders() {
        ListIterator<String> varB4EAC82CA7396A68D541C85D26508E83_1955024578 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1955024578 = this.unrecognizedHeaders.listIterator();
        varB4EAC82CA7396A68D541C85D26508E83_1955024578.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1955024578;
        // ---------- Original Method ----------
        //return this.unrecognizedHeaders.listIterator();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.044 -0400", hash_original_method = "C08D5FBD41C305191A05DA7EC6E8BA34", hash_generated_method = "824CF90743CF394E4DA44641E3C7AAAD")
    public ListIterator<String> getHeaderNames() {
        ListIterator<String> varB4EAC82CA7396A68D541C85D26508E83_615293644 = null; //Variable for return #1
        Iterator<SIPHeader> li;
        li = this.headers.iterator();
        LinkedList<String> retval;
        retval = new LinkedList<String>();
        {
            boolean varBC3D864DE8830EFC1098D2C2F456529D_356485135 = (li.hasNext());
            {
                SIPHeader sipHeader;
                sipHeader = (SIPHeader) li.next();
                String name;
                name = sipHeader.getName();
                retval.add(name);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_615293644 = retval.listIterator();
        varB4EAC82CA7396A68D541C85D26508E83_615293644.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_615293644;
        // ---------- Original Method ----------
        //Iterator<SIPHeader> li = this.headers.iterator();
        //LinkedList<String> retval = new LinkedList<String>();
        //while (li.hasNext()) {
            //SIPHeader sipHeader = (SIPHeader) li.next();
            //String name = sipHeader.getName();
            //retval.add(name);
        //}
        //return retval.listIterator();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.060 -0400", hash_original_method = "19862554CF2CF162312B89332E1831C0", hash_generated_method = "AE8D1F650834C824DB57183BDFB5CE2C")
    public boolean equals(Object other) {
        {
            boolean varAC16F771BB29A32F2C455E410359AF13_934658924 = (!other.getClass().equals(this.getClass()));
        } //End collapsed parenthetic
        SIPMessage otherMessage;
        otherMessage = (SIPMessage) other;
        Collection<SIPHeader> values;
        values = this.nameTable.values();
        Iterator<SIPHeader> it;
        it = values.iterator();
        {
            boolean varEA188AE5A9018452EA1222E9093CB12B_58710818 = (nameTable.size() != otherMessage.nameTable.size());
        } //End collapsed parenthetic
        {
            boolean var03729FD53960D8DCA3A41A13A0229637_735867579 = (it.hasNext());
            {
                SIPHeader mine;
                mine = (SIPHeader) it.next();
                SIPHeader his;
                his = (SIPHeader) (otherMessage.nameTable.get(SIPHeaderNamesCache
                    .toLowerCase(mine.getName())));
                {
                    boolean var3911B8F0C4C9004033662F49D485738C_240679601 = (!his.equals(mine));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_723361928 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_723361928;
        // ---------- Original Method ----------
        //if (!other.getClass().equals(this.getClass())) {
            //return false;
        //}
        //SIPMessage otherMessage = (SIPMessage) other;
        //Collection<SIPHeader> values = this.nameTable.values();
        //Iterator<SIPHeader> it = values.iterator();
        //if (nameTable.size() != otherMessage.nameTable.size()) {
            //return false;
        //}
        //while (it.hasNext()) {
            //SIPHeader mine = (SIPHeader) it.next();
            //SIPHeader his = (SIPHeader) (otherMessage.nameTable.get(SIPHeaderNamesCache
                    //.toLowerCase(mine.getName())));
            //if (his == null) {
                //return false;
            //} else if (!his.equals(mine)) {
                //return false;
            //}
        //}
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.061 -0400", hash_original_method = "3C4825ADE695C84AAF8B57CDEA1CF4CB", hash_generated_method = "59C48827652AE04C39496ACAA3FDBE6B")
    public javax.sip.header.ContentDispositionHeader getContentDisposition() {
        javax.sip.header.ContentDispositionHeader varB4EAC82CA7396A68D541C85D26508E83_1097596316 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1097596316 = (ContentDispositionHeader) getHeaderLowerCase(CONTENT_DISPOSITION_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_1097596316.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1097596316;
        // ---------- Original Method ----------
        //return (ContentDispositionHeader) getHeaderLowerCase(CONTENT_DISPOSITION_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.061 -0400", hash_original_method = "46C03ED253FA9F93BF664C06918E9287", hash_generated_method = "0E1D769DD3DF3B2E9DA255D3C6BE1454")
    public javax.sip.header.ContentEncodingHeader getContentEncoding() {
        javax.sip.header.ContentEncodingHeader varB4EAC82CA7396A68D541C85D26508E83_92347655 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_92347655 = (ContentEncodingHeader) getHeaderLowerCase(CONTENT_ENCODING_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_92347655.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_92347655;
        // ---------- Original Method ----------
        //return (ContentEncodingHeader) getHeaderLowerCase(CONTENT_ENCODING_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.067 -0400", hash_original_method = "7F8FF7046ECB01AA1B56D3558C9342AE", hash_generated_method = "FA3D3984EF582C50FB5B063529F19CDE")
    public javax.sip.header.ContentLanguageHeader getContentLanguage() {
        javax.sip.header.ContentLanguageHeader varB4EAC82CA7396A68D541C85D26508E83_302839563 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_302839563 = (ContentLanguageHeader) getHeaderLowerCase(CONTENT_LANGUAGE_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_302839563.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_302839563;
        // ---------- Original Method ----------
        //return (ContentLanguageHeader) getHeaderLowerCase(CONTENT_LANGUAGE_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.075 -0400", hash_original_method = "9AC8AD6CCC74995A67CEDA1778D18415", hash_generated_method = "0DA7CA2A02F598C91B9ABAE798CE98F0")
    public javax.sip.header.ExpiresHeader getExpires() {
        javax.sip.header.ExpiresHeader varB4EAC82CA7396A68D541C85D26508E83_76873895 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_76873895 = (ExpiresHeader) getHeaderLowerCase(EXPIRES_LOWERCASE);
        varB4EAC82CA7396A68D541C85D26508E83_76873895.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_76873895;
        // ---------- Original Method ----------
        //return (ExpiresHeader) getHeaderLowerCase(EXPIRES_LOWERCASE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.075 -0400", hash_original_method = "729B7ABDA713D8DD91F71F3C7E5D92DE", hash_generated_method = "94E069E2EB0360CBF333D21DF7ABFFDA")
    public void setExpires(ExpiresHeader expiresHeader) {
        this.setHeader(expiresHeader);
        addTaint(expiresHeader.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(expiresHeader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.075 -0400", hash_original_method = "9820BC2E150668B0FD803FA9E719FCCB", hash_generated_method = "B2E7602D273568777C5927D56E478925")
    public void setContentDisposition(ContentDispositionHeader contentDispositionHeader) {
        this.setHeader(contentDispositionHeader);
        addTaint(contentDispositionHeader.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(contentDispositionHeader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.076 -0400", hash_original_method = "664B5D910990D19402FB830D30BD43E8", hash_generated_method = "905EE132837454DB2AD93EF4693EF1CD")
    public void setContentEncoding(ContentEncodingHeader contentEncodingHeader) {
        this.setHeader(contentEncodingHeader);
        addTaint(contentEncodingHeader.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(contentEncodingHeader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.080 -0400", hash_original_method = "F5B59DEA81E2E529FE4037C765469E44", hash_generated_method = "E555A9AF374818536A532DA9B3FA2107")
    public void setContentLanguage(ContentLanguageHeader contentLanguageHeader) {
        this.setHeader(contentLanguageHeader);
        addTaint(contentLanguageHeader.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(contentLanguageHeader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.127 -0400", hash_original_method = "5BC3E664403E9FC36E24FA33AD51CF36", hash_generated_method = "CE391EFE0A7DDF04A48FCCC05B6FB971")
    public void setContentLength(ContentLengthHeader contentLength) {
        try 
        {
            this.contentLengthHeader.setContentLength(contentLength.getContentLength());
        } //End block
        catch (InvalidArgumentException ex)
        { }
        addTaint(contentLength.getTaint());
        // ---------- Original Method ----------
        //try {
            //this.contentLengthHeader.setContentLength(contentLength.getContentLength());
        //} catch (InvalidArgumentException ex) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.127 -0400", hash_original_method = "B722E58F0DD8E1CBC622964AAF1F9B26", hash_generated_method = "2BDE89A0FF22729ECAFC892EB96A087D")
    public void setSize(int size) {
        this.size = size;
        // ---------- Original Method ----------
        //this.size = size;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.127 -0400", hash_original_method = "54E84843E0EEE275508F3EB8305B3F4F", hash_generated_method = "2DF800ECE523A38094C2A33395C829BB")
    public int getSize() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1962116990 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1962116990;
        // ---------- Original Method ----------
        //return this.size;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.128 -0400", hash_original_method = "51B72F61F828A2C6A4124D3A8929AD68", hash_generated_method = "65D6A0B55D71F54F626FFB0F1225ACBF")
    public void addLast(Header header) throws SipException, NullPointerException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("null arg!");
        try 
        {
            this.attachHeader((SIPHeader) header, false, false);
        } //End block
        catch (SIPDuplicateHeaderException ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new SipException("Cannot add header - header already exists");
        } //End block
        addTaint(header.getTaint());
        // ---------- Original Method ----------
        //if (header == null)
            //throw new NullPointerException("null arg!");
        //try {
            //this.attachHeader((SIPHeader) header, false, false);
        //} catch (SIPDuplicateHeaderException ex) {
            //throw new SipException("Cannot add header - header already exists");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.128 -0400", hash_original_method = "FB58DD3E1F3A0D99159750C09E15B568", hash_generated_method = "7CEBCA8C6BD42BA5CC640DABD0B4D334")
    public void addFirst(Header header) throws SipException, NullPointerException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("null arg!");
        try 
        {
            this.attachHeader((SIPHeader) header, false, true);
        } //End block
        catch (SIPDuplicateHeaderException ex)
        {
            if (DroidSafeAndroidRuntime.control) throw new SipException("Cannot add header - header already exists");
        } //End block
        addTaint(header.getTaint());
        // ---------- Original Method ----------
        //if (header == null)
            //throw new NullPointerException("null arg!");
        //try {
            //this.attachHeader((SIPHeader) header, false, true);
        //} catch (SIPDuplicateHeaderException ex) {
            //throw new SipException("Cannot add header - header already exists");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.128 -0400", hash_original_method = "F7D2F7162E4B2A1EDD2D78AF07F98ED3", hash_generated_method = "6798C97874DC7872F91387272829C9D6")
    public void removeFirst(String headerName) throws NullPointerException {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("Null argument Provided!");
        this.removeHeader(headerName, true);
        addTaint(headerName.getTaint());
        // ---------- Original Method ----------
        //if (headerName == null)
            //throw new NullPointerException("Null argument Provided!");
        //this.removeHeader(headerName, true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.128 -0400", hash_original_method = "B1A0AEB4CA388E0A9ED7E42FB6DA96D3", hash_generated_method = "BBD5B9CBE93C6962DBAB77BA763F4862")
    public void removeLast(String headerName) {
        if (DroidSafeAndroidRuntime.control) throw new NullPointerException("Null argument Provided!");
        this.removeHeader(headerName, false);
        addTaint(headerName.getTaint());
        // ---------- Original Method ----------
        //if (headerName == null)
            //throw new NullPointerException("Null argument Provided!");
        //this.removeHeader(headerName, false);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.134 -0400", hash_original_method = "1B0E35DCABA77A6424B3D6172B19A4B7", hash_generated_method = "FE547DB1F0CA5E958E466C839E26E083")
    public void setCSeq(CSeqHeader cseqHeader) {
        this.setHeader(cseqHeader);
        addTaint(cseqHeader.getTaint());
        // ---------- Original Method ----------
        //this.setHeader(cseqHeader);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.134 -0400", hash_original_method = "552E0456C33D24CD63C8EBCDAC1D019B", hash_generated_method = "E17DD994BC845C3BDBBD70ECC432242E")
    public void setApplicationData(Object applicationData) {
        this.applicationData = applicationData;
        // ---------- Original Method ----------
        //this.applicationData = applicationData;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.134 -0400", hash_original_method = "5F924FC61375970A4DC758380BEBFF0F", hash_generated_method = "3A98689C3B7B0341D3E979593379C246")
    public Object getApplicationData() {
        Object varB4EAC82CA7396A68D541C85D26508E83_847918210 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_847918210 = this.applicationData;
        varB4EAC82CA7396A68D541C85D26508E83_847918210.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_847918210;
        // ---------- Original Method ----------
        //return this.applicationData;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.135 -0400", hash_original_method = "3FB4581572217B4D34EC8E3A9F62CA88", hash_generated_method = "110AF2A4D36ADAF774D5ED9E8928D6AE")
    public MultipartMimeContent getMultipartMimeContent() throws ParseException {
        MultipartMimeContent varB4EAC82CA7396A68D541C85D26508E83_1046725990 = null; //Variable for return #1
        MultipartMimeContent varB4EAC82CA7396A68D541C85D26508E83_1804478818 = null; //Variable for return #2
        MultipartMimeContent varB4EAC82CA7396A68D541C85D26508E83_489636241 = null; //Variable for return #3
        {
            boolean var2CC093753E0ADFD0794491E557D23CC9_906829073 = (this.contentLengthHeader.getContentLength() == 0);
            {
                varB4EAC82CA7396A68D541C85D26508E83_1046725990 = null;
            } //End block
        } //End collapsed parenthetic
        MultipartMimeContentImpl retval;
        retval = new MultipartMimeContentImpl(this
                .getContentTypeHeader());
        byte[] rawContent;
        rawContent = getRawContent();
        try 
        {
            String body;
            body = new String( rawContent, getCharset() );
            retval.createContentList(body);
            varB4EAC82CA7396A68D541C85D26508E83_1804478818 = retval;
        } //End block
        catch (UnsupportedEncodingException e)
        {
            InternalErrorHandler.handleException(e);
            varB4EAC82CA7396A68D541C85D26508E83_489636241 = null;
        } //End block
        MultipartMimeContent varA7E53CE21691AB073D9660D615818899_1891518150; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1891518150 = varB4EAC82CA7396A68D541C85D26508E83_1046725990;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_1891518150 = varB4EAC82CA7396A68D541C85D26508E83_1804478818;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1891518150 = varB4EAC82CA7396A68D541C85D26508E83_489636241;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1891518150.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1891518150;
        // ---------- Original Method ----------
        //if (this.contentLengthHeader.getContentLength() == 0) {
            //return null;
        //}
        //MultipartMimeContentImpl retval = new MultipartMimeContentImpl(this
                //.getContentTypeHeader());
        //byte[] rawContent = getRawContent();
        //try {
			//String body = new String( rawContent, getCharset() );
	        //retval.createContentList(body);
	        //return retval;
		//} catch (UnsupportedEncodingException e) {
			//InternalErrorHandler.handleException(e);
			//return null;
		//}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.136 -0400", hash_original_method = "6A8980AC46BDEC47E118DEA889F580E2", hash_generated_method = "F029F9AC60E66149F5F39DEF794868FF")
    public CallIdHeader getCallIdHeader() {
        CallIdHeader varB4EAC82CA7396A68D541C85D26508E83_2020168395 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2020168395 = this.callIdHeader;
        varB4EAC82CA7396A68D541C85D26508E83_2020168395.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2020168395;
        // ---------- Original Method ----------
        //return this.callIdHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.136 -0400", hash_original_method = "616E19996CDDFB660618161B80D5BB27", hash_generated_method = "BC213BA394F6250DBA6261A8286377A3")
    public FromHeader getFromHeader() {
        FromHeader varB4EAC82CA7396A68D541C85D26508E83_390577173 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_390577173 = this.fromHeader;
        varB4EAC82CA7396A68D541C85D26508E83_390577173.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_390577173;
        // ---------- Original Method ----------
        //return this.fromHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.148 -0400", hash_original_method = "9C43D5663CBD78C15545690BFB01C4BF", hash_generated_method = "C69F052DBC97084D872C3BD584FDD252")
    public ToHeader getToHeader() {
        ToHeader varB4EAC82CA7396A68D541C85D26508E83_1325053867 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1325053867 = this.toHeader;
        varB4EAC82CA7396A68D541C85D26508E83_1325053867.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1325053867;
        // ---------- Original Method ----------
        //return this.toHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.149 -0400", hash_original_method = "FE98900B9C779953579B6764E7283FC2", hash_generated_method = "6AC63136A0C2E4E22F7E7813C0EAA334")
    public ViaHeader getTopmostViaHeader() {
        ViaHeader varB4EAC82CA7396A68D541C85D26508E83_325693500 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_325693500 = this.getTopmostVia();
        varB4EAC82CA7396A68D541C85D26508E83_325693500.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_325693500;
        // ---------- Original Method ----------
        //return this.getTopmostVia();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.153 -0400", hash_original_method = "2CE1B7EDE28DB048E923E7FFD28A72BE", hash_generated_method = "547A6D031002C3CEBE05E03FCDA1FE66")
    public CSeqHeader getCSeqHeader() {
        CSeqHeader varB4EAC82CA7396A68D541C85D26508E83_1646053704 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1646053704 = this.cSeqHeader;
        varB4EAC82CA7396A68D541C85D26508E83_1646053704.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1646053704;
        // ---------- Original Method ----------
        //return this.cSeqHeader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.154 -0400", hash_original_method = "5D0D1F0E94EB86910B32FB17BCD97869", hash_generated_method = "830DB4AC1C1C92C15599A64B2DA68C5B")
    protected final String getCharset() {
        String varB4EAC82CA7396A68D541C85D26508E83_1376273158 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_308129889 = null; //Variable for return #2
        ContentType ct;
        ct = getContentTypeHeader();
        {
            String c;
            c = ct.getCharset();
            varB4EAC82CA7396A68D541C85D26508E83_1376273158 = c!=null ? c : contentEncodingCharset;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_308129889 = contentEncodingCharset;
        String varA7E53CE21691AB073D9660D615818899_580846246; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_580846246 = varB4EAC82CA7396A68D541C85D26508E83_1376273158;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_580846246 = varB4EAC82CA7396A68D541C85D26508E83_308129889;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_580846246.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_580846246;
        // ---------- Original Method ----------
        //ContentType ct = getContentTypeHeader();
        //if (ct!=null) {
    		//String c = ct.getCharset();
    		//return c!=null ? c : contentEncodingCharset;
    	//} else return contentEncodingCharset;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.158 -0400", hash_original_method = "F8575631397F30A77B6575B01C9E50F5", hash_generated_method = "D7358F26D093A4E32E0C3A02F7311221")
    public boolean isNullRequest() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1990514043 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1990514043;
        // ---------- Original Method ----------
        //return  this.nullRequest;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.163 -0400", hash_original_method = "76987385F34084CF4A8C6AA1CD858E63", hash_generated_method = "9270889C04904F8C78507597689FCBFB")
    public void setNullRequest() {
        this.nullRequest = true;
        // ---------- Original Method ----------
        //this.nullRequest = true;
    }

    
    public abstract void setSIPVersion(String sipVersion) throws ParseException;

    
    public abstract String getSIPVersion();

    
    public abstract String toString();

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "75E2CD6B096F7C9EA9F441F09C141816", hash_generated_field = "068D223E1748F06573357D6E0C93718F")

    private static String CONTENT_TYPE_LOWERCASE = SIPHeaderNamesCache
    .toLowerCase(ContentTypeHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "29DF28A4B352F1941ADD2F1574849F4C", hash_generated_field = "CB3AF27778792F966750AACA6A38F463")

    private static String ERROR_LOWERCASE = SIPHeaderNamesCache.toLowerCase(ErrorInfo.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "1BA2C1C4DCDE1F624162F4131AAE2119", hash_generated_field = "590BE103DF5E29902DC51A34B94DF180")

    private static String CONTACT_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(ContactHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "48FC9BF18DDD312165B5D66B273DFFB9", hash_generated_field = "4BC3CDA715084CA31B0ADE6B2173B634")

    private static String VIA_LOWERCASE = SIPHeaderNamesCache.toLowerCase(ViaHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "7412D18F37312CBCB0F4A06C575DDCDC", hash_generated_field = "1B421A7E66A645377F0CDBFA175E598E")

    private static String AUTHORIZATION_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(AuthorizationHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "189EC181787A87BAA9A37498164BF033", hash_generated_field = "7DBB14FF48CF74D0DE3A5CA709382258")

    private static String ROUTE_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(RouteHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "9C1ABF37105D0FE67D77A0E330DBA041", hash_generated_field = "5CBC5FBDD576A95665BBB5154509E377")

    private static String RECORDROUTE_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(RecordRouteHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "684B374F6D97A99BC68D07DD28F9F302", hash_generated_field = "A671CFA4DAEEF27CB28B29359EB48594")

    private static String CONTENT_DISPOSITION_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(ContentDispositionHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "E2D2A30A5E5BCE2B69AEF1546064737F", hash_generated_field = "3E50C78FA482AC0229816B5CCAA59214")

    private static String CONTENT_ENCODING_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(ContentEncodingHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "2871455B28BED5523B66335711F93B13", hash_generated_field = "5AD8BE2469CBED0F46AB241AF331532B")

    private static String CONTENT_LANGUAGE_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(ContentLanguageHeader.NAME);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:35.169 -0400", hash_original_field = "DC12CEF71CECD7CA0E5991B99573EE4A", hash_generated_field = "085B7037647C056863DFFBADB79EF703")

    private static String EXPIRES_LOWERCASE = SIPHeaderNamesCache
            .toLowerCase(ExpiresHeader.NAME);
}

