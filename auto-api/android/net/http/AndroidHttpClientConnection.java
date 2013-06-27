package android.net.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.HttpConnectionMetricsImpl;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.HttpRequestWriter;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.impl.io.SocketInputBuffer;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class AndroidHttpClientConnection implements HttpInetConnection, HttpConnection {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.808 -0400", hash_original_field = "DC681AA2DD2A0BE47CBDD78540D5A8BD", hash_generated_field = "B0D6D00F71FC030A17C26A2601F3BE87")

    private SessionInputBuffer inbuffer = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.808 -0400", hash_original_field = "2CF5A5642A030530FB530CE6AD73F644", hash_generated_field = "10B58CBE3BBA8B7201F396357A83D45E")

    private SessionOutputBuffer outbuffer = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "9E79D1C5118BFD93F2EA3354BE3B7BB3", hash_generated_field = "51B3B1D6F029892B5D1B485F1E8449D4")

    private int maxHeaderCount;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "4C632171BE04EE204137B2D22962BCCE", hash_generated_field = "C2CDDB4530FA37C525863212B278B681")

    private int maxLineLength;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "34C401953BC184959C583775D7C02C06", hash_generated_field = "AB3FDC91331A5753EE17C338AC9D0381")

    private EntitySerializer entityserializer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "715711ECB9730DA286C315F4B203F1D7", hash_generated_field = "F323E9D16DC81146FC2969062D7F8C7E")

    private HttpMessageWriter requestWriter = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "E6899A7B60D3CD0F0F3E11DDE4844FF7", hash_generated_field = "EE4B08A08CEE9A462065794CA86E6F61")

    private HttpConnectionMetricsImpl metrics = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "7CEF8A734855777C2A9D0CAF42666E69", hash_generated_field = "F8642D5396CC441E503E603D20259781")

    private volatile boolean open;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.809 -0400", hash_original_field = "E728D69D332AE7988C6FE7869D66573E", hash_generated_field = "9FD10C539AD3B0FAAA147E92379F8AC8")

    private Socket socket = null;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.810 -0400", hash_original_method = "34D8A32964859B1FAAC1AC49D9EAB8C7", hash_generated_method = "5D5370FE957D216B92C117496F770B7E")
    public  AndroidHttpClientConnection() {
        this.entityserializer =  new EntitySerializer(
                new StrictContentLengthStrategy());
        // ---------- Original Method ----------
        //this.entityserializer =  new EntitySerializer(
                //new StrictContentLengthStrategy());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.832 -0400", hash_original_method = "B7940401E9D410C3E0007DD81BDA911F", hash_generated_method = "E16F4DE99C01463D03E030E06B7C1F3B")
    public void bind(
            final Socket socket,
            final HttpParams params) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Socket may not be null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP parameters may not be null");
        } //End block
        assertNotOpen();
        socket.setTcpNoDelay(HttpConnectionParams.getTcpNoDelay(params));
        socket.setSoTimeout(HttpConnectionParams.getSoTimeout(params));
        int linger;
        linger = HttpConnectionParams.getLinger(params);
        {
            socket.setSoLinger(linger > 0, linger);
        } //End block
        this.socket = socket;
        int buffersize;
        buffersize = HttpConnectionParams.getSocketBufferSize(params);
        this.inbuffer = new SocketInputBuffer(socket, buffersize, params);
        this.outbuffer = new SocketOutputBuffer(socket, buffersize, params);
        maxHeaderCount = params.getIntParameter(
                CoreConnectionPNames.MAX_HEADER_COUNT, -1);
        maxLineLength = params.getIntParameter(
                CoreConnectionPNames.MAX_LINE_LENGTH, -1);
        this.requestWriter = new HttpRequestWriter(outbuffer, null, params);
        this.metrics = new HttpConnectionMetricsImpl(
                inbuffer.getMetrics(),
                outbuffer.getMetrics());
        this.open = true;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.834 -0400", hash_original_method = "EF7CB084264EC0FC42FD48CA086E7FEB", hash_generated_method = "06B261283BE8555C1747F65E48ED3052")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1658717486 = null; //Variable for return #1
        StringBuilder buffer;
        buffer = new StringBuilder();
        buffer.append(getClass().getSimpleName()).append("[");
        {
            boolean varF14FAC85BD81325B95F4F52AC5545E52_726642966 = (isOpen());
            {
                buffer.append(getRemotePort());
            } //End block
            {
                buffer.append("closed");
            } //End block
        } //End collapsed parenthetic
        buffer.append("]");
        varB4EAC82CA7396A68D541C85D26508E83_1658717486 = buffer.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1658717486.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1658717486;
        // ---------- Original Method ----------
        //StringBuilder buffer = new StringBuilder();
        //buffer.append(getClass().getSimpleName()).append("[");
        //if (isOpen()) {
            //buffer.append(getRemotePort());
        //} else {
            //buffer.append("closed");
        //}
        //buffer.append("]");
        //return buffer.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.834 -0400", hash_original_method = "BD86A908767A86776B5DCBFC714C696F", hash_generated_method = "FE158C35B4090D4A7DD5DCF2E51C96D7")
    private void assertNotOpen() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Connection is already open");
        } //End block
        // ---------- Original Method ----------
        //if (this.open) {
            //throw new IllegalStateException("Connection is already open");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.850 -0400", hash_original_method = "ACED44A56037ABE0B09ED18FFAC2A6E6", hash_generated_method = "6C19649848B3A1DD2E6212993C13534D")
    private void assertOpen() {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Connection is not open");
        } //End block
        // ---------- Original Method ----------
        //if (!this.open) {
            //throw new IllegalStateException("Connection is not open");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.850 -0400", hash_original_method = "8E8BDB37899E8F9E80D937FD54AF461B", hash_generated_method = "57C1CD2F3C7CB2C31B2140F05DD4D7A1")
    public boolean isOpen() {
        boolean var0E903911466EEC573F7184688086164A_722444211 = ((this.open && this.socket != null && this.socket.isConnected()));
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1463345236 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1463345236;
        // ---------- Original Method ----------
        //return (this.open && this.socket != null && this.socket.isConnected());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.851 -0400", hash_original_method = "37A4CCD5FC4FE8478033812CF6081247", hash_generated_method = "5B127974250E25C51C865CFAEEF85D89")
    public InetAddress getLocalAddress() {
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_1896579698 = null; //Variable for return #1
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_1024931023 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1896579698 = this.socket.getLocalAddress();
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1024931023 = null;
        } //End block
        InetAddress varA7E53CE21691AB073D9660D615818899_302568549; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_302568549 = varB4EAC82CA7396A68D541C85D26508E83_1896579698;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_302568549 = varB4EAC82CA7396A68D541C85D26508E83_1024931023;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_302568549.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_302568549;
        // ---------- Original Method ----------
        //if (this.socket != null) {
            //return this.socket.getLocalAddress();
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.852 -0400", hash_original_method = "CB3D09E80AD036DA49A9727AFFCF9E16", hash_generated_method = "66AF2DFED420649AECD81A6A249A7A5F")
    public int getLocalPort() {
        {
            int varCCD0594420CD0D8D452225AADE7A07D2_842394754 = (this.socket.getLocalPort());
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1658336472 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1658336472;
        // ---------- Original Method ----------
        //if (this.socket != null) {
            //return this.socket.getLocalPort();
        //} else {
            //return -1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.866 -0400", hash_original_method = "738E936ADE4702B2396BC3DC05386FBD", hash_generated_method = "5055F57C0585C8DB4E52A3A6BB180861")
    public InetAddress getRemoteAddress() {
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_1200997186 = null; //Variable for return #1
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_1424184281 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_1200997186 = this.socket.getInetAddress();
        } //End block
        {
            varB4EAC82CA7396A68D541C85D26508E83_1424184281 = null;
        } //End block
        InetAddress varA7E53CE21691AB073D9660D615818899_1835960205; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1835960205 = varB4EAC82CA7396A68D541C85D26508E83_1200997186;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1835960205 = varB4EAC82CA7396A68D541C85D26508E83_1424184281;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1835960205.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1835960205;
        // ---------- Original Method ----------
        //if (this.socket != null) {
            //return this.socket.getInetAddress();
        //} else {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.867 -0400", hash_original_method = "D939EFD523917F0149002711980337D5", hash_generated_method = "FF6A25533D3E69B1E691599E1F8400F5")
    public int getRemotePort() {
        {
            int var3EE29869B1F636B5DAA1F70FA7C6400E_502003668 = (this.socket.getPort());
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2129073131 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2129073131;
        // ---------- Original Method ----------
        //if (this.socket != null) {
            //return this.socket.getPort();
        //} else {
            //return -1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.867 -0400", hash_original_method = "1060FB10CE7965802AECEE442A1DB6DF", hash_generated_method = "676D254DEDC8A8C19857A94AF50E3C3B")
    public void setSocketTimeout(int timeout) {
        assertOpen();
        {
            try 
            {
                this.socket.setSoTimeout(timeout);
            } //End block
            catch (SocketException ignore)
            { }
        } //End block
        addTaint(timeout);
        // ---------- Original Method ----------
        //assertOpen();
        //if (this.socket != null) {
            //try {
                //this.socket.setSoTimeout(timeout);
            //} catch (SocketException ignore) {
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.868 -0400", hash_original_method = "65027FF3AE16248E56640778A6A4578D", hash_generated_method = "14D7206C9830D9261742A6E7FD92469A")
    public int getSocketTimeout() {
        {
            try 
            {
                int var1CFD970C58DCF71C94F6332F13F0CD73_307491756 = (this.socket.getSoTimeout());
            } //End block
            catch (SocketException ignore)
            { }
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_981107222 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_981107222;
        // ---------- Original Method ----------
        //if (this.socket != null) {
            //try {
                //return this.socket.getSoTimeout();
            //} catch (SocketException ignore) {
                //return -1;
            //}
        //} else {
            //return -1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.887 -0400", hash_original_method = "CEF80ABEDD17E9F414E04B4979CC6A82", hash_generated_method = "CF620A7315D3C1C1AD4D9BAC734BF982")
    public void shutdown() throws IOException {
        this.open = false;
        Socket tmpsocket;
        tmpsocket = this.socket;
        {
            tmpsocket.close();
        } //End block
        // ---------- Original Method ----------
        //this.open = false;
        //Socket tmpsocket = this.socket;
        //if (tmpsocket != null) {
            //tmpsocket.close();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.888 -0400", hash_original_method = "E2A0230BE95C4B74092464470E281A24", hash_generated_method = "C67C9038C6A0874A962E604367169DAC")
    public void close() throws IOException {
        this.open = false;
        doFlush();
        try 
        {
            try 
            {
                this.socket.shutdownOutput();
            } //End block
            catch (IOException ignore)
            { }
            try 
            {
                this.socket.shutdownInput();
            } //End block
            catch (IOException ignore)
            { }
        } //End block
        catch (UnsupportedOperationException ignore)
        { }
        this.socket.close();
        // ---------- Original Method ----------
        //if (!this.open) {
            //return;
        //}
        //this.open = false;
        //doFlush();
        //try {
            //try {
                //this.socket.shutdownOutput();
            //} catch (IOException ignore) {
            //}
            //try {
                //this.socket.shutdownInput();
            //} catch (IOException ignore) {
            //}
        //} catch (UnsupportedOperationException ignore) {
        //}
        //this.socket.close();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.890 -0400", hash_original_method = "9CF9D3D7B73D0AA22EE5EB3E861EF60E", hash_generated_method = "CC0A22F18D01871DE3703B67106DA60F")
    public void sendRequestHeader(final HttpRequest request) throws HttpException, IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP request may not be null");
        } //End block
        assertOpen();
        this.requestWriter.write(request);
        this.metrics.incrementRequestCount();
        addTaint(request.getTaint());
        // ---------- Original Method ----------
        //if (request == null) {
            //throw new IllegalArgumentException("HTTP request may not be null");
        //}
        //assertOpen();
        //this.requestWriter.write(request);
        //this.metrics.incrementRequestCount();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.901 -0400", hash_original_method = "73C1557906EF5C67B1A62D382FCB88AB", hash_generated_method = "4BA1E056AC18589F8925C807871F654E")
    public void sendRequestEntity(final HttpEntityEnclosingRequest request) throws HttpException, IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("HTTP request may not be null");
        } //End block
        assertOpen();
        {
            boolean varD49B899B4DAE647F6EFF10130B7BC7C1_427183170 = (request.getEntity() == null);
        } //End collapsed parenthetic
        this.entityserializer.serialize(
                this.outbuffer,
                request,
                request.getEntity());
        addTaint(request.getTaint());
        // ---------- Original Method ----------
        //if (request == null) {
            //throw new IllegalArgumentException("HTTP request may not be null");
        //}
        //assertOpen();
        //if (request.getEntity() == null) {
            //return;
        //}
        //this.entityserializer.serialize(
                //this.outbuffer,
                //request,
                //request.getEntity());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.902 -0400", hash_original_method = "DE0B8B580EE6D4219521C9A2503EB8AB", hash_generated_method = "4D1A2508A821B55E0B18D024D4D93DA1")
    protected void doFlush() throws IOException {
        this.outbuffer.flush();
        // ---------- Original Method ----------
        //this.outbuffer.flush();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.903 -0400", hash_original_method = "166CB1CAE087E4752127F8680D07EE90", hash_generated_method = "C32057FFD327A27B41D17512113B46BE")
    public void flush() throws IOException {
        assertOpen();
        doFlush();
        // ---------- Original Method ----------
        //assertOpen();
        //doFlush();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.930 -0400", hash_original_method = "5382496E6517DB13491696C30DF0839D", hash_generated_method = "959E7FC1990CE6A3E8D995A9A4CBBC20")
    public StatusLine parseResponseHeader(Headers headers) throws IOException, ParseException {
        StatusLine varB4EAC82CA7396A68D541C85D26508E83_1661939715 = null; //Variable for return #1
        assertOpen();
        CharArrayBuffer current;
        current = new CharArrayBuffer(64);
        {
            boolean var21CDE1F401E7BB0361226862DF86163A_1939587879 = (inbuffer.readLine(current) == -1);
            {
                if (DroidSafeAndroidRuntime.control) throw new NoHttpResponseException("The target server failed to respond");
            } //End block
        } //End collapsed parenthetic
        StatusLine statusline;
        statusline = BasicLineParser.DEFAULT.parseStatusLine(
                current, new ParserCursor(0, current.length()));
        HttpLog.v("read: " + statusline);
        int statusCode;
        statusCode = statusline.getStatusCode();
        CharArrayBuffer previous;
        previous = null;
        int headerNumber;
        headerNumber = 0;
        {
            {
                current = new CharArrayBuffer(64);
            } //End block
            {
                current.clear();
            } //End block
            int l;
            l = inbuffer.readLine(current);
            {
                boolean varF37487E45CF922EB7BEA02A88464E0BA_1118351820 = (l == -1 || current.length() < 1);
            } //End collapsed parenthetic
            char first;
            first = current.charAt(0);
            {
                int start;
                start = 0;
                int length;
                length = current.length();
                {
                    char ch;
                    ch = current.charAt(start);
                } //End block
                {
                    boolean var3DB5EDFC20803D4A5CABA530FEF460F1_187921397 = (maxLineLength > 0 &&
                        previous.length() + 1 + current.length() - start >
                            maxLineLength);
                    {
                        if (DroidSafeAndroidRuntime.control) throw new IOException("Maximum line length limit exceeded");
                    } //End block
                } //End collapsed parenthetic
                previous.append(' ');
                previous.append(current, start, current.length() - start);
            } //End block
            {
                {
                    headers.parseHeader(previous);
                } //End block
                previous = current;
                current = null;
            } //End block
            {
                if (DroidSafeAndroidRuntime.control) throw new IOException("Maximum header count exceeded");
            } //End block
        } //End block
        {
            headers.parseHeader(previous);
        } //End block
        {
            this.metrics.incrementResponseCount();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1661939715 = statusline;
        addTaint(headers.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1661939715.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1661939715;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.957 -0400", hash_original_method = "1E84D06F522FAB67F7B7209EA462145E", hash_generated_method = "284546E27E90395FF9349E76A7F214CA")
    public HttpEntity receiveResponseEntity(final Headers headers) {
        HttpEntity varB4EAC82CA7396A68D541C85D26508E83_1707699617 = null; //Variable for return #1
        assertOpen();
        BasicHttpEntity entity;
        entity = new BasicHttpEntity();
        long len;
        len = determineLength(headers);
        {
            entity.setChunked(true);
            entity.setContentLength(-1);
            entity.setContent(new ChunkedInputStream(inbuffer));
        } //End block
        {
            entity.setChunked(false);
            entity.setContentLength(-1);
            entity.setContent(new IdentityInputStream(inbuffer));
        } //End block
        {
            entity.setChunked(false);
            entity.setContentLength(len);
            entity.setContent(new ContentLengthInputStream(inbuffer, len));
        } //End block
        String contentTypeHeader;
        contentTypeHeader = headers.getContentType();
        {
            entity.setContentType(contentTypeHeader);
        } //End block
        String contentEncodingHeader;
        contentEncodingHeader = headers.getContentEncoding();
        {
            entity.setContentEncoding(contentEncodingHeader);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1707699617 = entity;
        addTaint(headers.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1707699617.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1707699617;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.971 -0400", hash_original_method = "DFC24C3199FB5D6CC47411FD6E7FCAFF", hash_generated_method = "7C16858692406F53057A01D29512AE05")
    private long determineLength(final Headers headers) {
        long transferEncoding;
        transferEncoding = headers.getTransferEncoding();
        {
            long contentlen;
            contentlen = headers.getContentLength();
        } //End block
        addTaint(headers.getTaint());
        long var0F5264038205EDFB1AC05FBB0E8C5E94_849542279 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_849542279;
        // ---------- Original Method ----------
        //long transferEncoding = headers.getTransferEncoding();
        //if (transferEncoding < Headers.NO_TRANSFER_ENCODING) {
            //return transferEncoding;
        //} else {
            //long contentlen = headers.getContentLength();
            //if (contentlen > Headers.NO_CONTENT_LENGTH) {
                //return contentlen;
            //} else {
                //return ContentLengthStrategy.IDENTITY;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.989 -0400", hash_original_method = "3BE812D13F4292433A7C6B8D5ADAC2E8", hash_generated_method = "665FC7C92084414958939358CA350735")
    public boolean isStale() {
        assertOpen();
        try 
        {
            this.inbuffer.isDataAvailable(1);
        } //End block
        catch (IOException ex)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_676954383 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_676954383;
        // ---------- Original Method ----------
        //assertOpen();
        //try {
            //this.inbuffer.isDataAvailable(1);
            //return false;
        //} catch (IOException ex) {
            //return true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:12:20.989 -0400", hash_original_method = "B4ACF96912B4372C3DFCBFF37024F952", hash_generated_method = "7A3783E04ED44E87D343D2947C9F412E")
    public HttpConnectionMetrics getMetrics() {
        HttpConnectionMetrics varB4EAC82CA7396A68D541C85D26508E83_657060892 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_657060892 = this.metrics;
        varB4EAC82CA7396A68D541C85D26508E83_657060892.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_657060892;
        // ---------- Original Method ----------
        //return this.metrics;
    }

    
}

