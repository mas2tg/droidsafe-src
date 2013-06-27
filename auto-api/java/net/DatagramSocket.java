package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.channels.DatagramChannel;
import libcore.io.ErrnoException;
import libcore.io.Libcore;
import static libcore.io.OsConstants.*;

public class DatagramSocket {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.043 -0400", hash_original_field = "86CCEC3D9FF0E9C0514506E982CDC08B", hash_generated_field = "0E47AFFF5CC1F2155F99BECA6A70C2D2")

    DatagramSocketImpl impl;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.046 -0400", hash_original_field = "884D9804999FC47A3C2694E49AD2536A", hash_generated_field = "FDCE7272CFC91A6374FBF7F54D5CC8E4")

    InetAddress address;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_field = "CAB9CCA4AFFBFB7ECB540E3002763641", hash_generated_field = "BAF684EECB20D799A434AFCF1B13F01D")

    int port = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_field = "1EA05BED8F3F3741889B40C4407A936D", hash_generated_field = "F9AB7682F64A4F93F6F4A7A435A5AA53")

    boolean isBound = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_field = "F0F0EDCF28D811EA172AA0A0A89A5056", hash_generated_field = "058DE1E699A3B3D187FC9E15DB7EC3B5")

    private boolean isConnected = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_field = "07C7CAC105556325A010A5AA708B362E", hash_generated_field = "BBB4D111812AF32431191097BEE30ACB")

    private SocketException pendingConnectException;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_field = "7624DFAF468575D3B7DCE21DA2796711", hash_generated_field = "2CBEAC942D14DA48C324142BCB214C18")

    private boolean isClosed = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_field = "DD465B0839A70592931A97D99A9DB042", hash_generated_field = "B291AA80E80AF2EADD13F4FAD6374324")

    private Object lock = new Object();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.047 -0400", hash_original_method = "600D2DC769AA1337C3E52515B77C9BA6", hash_generated_method = "834126E5D9F38C7E6D68D7A94139CCD5")
    public  DatagramSocket() throws SocketException {
        this(0);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.056 -0400", hash_original_method = "5C9F869A9F8E783507AEDF83BF8CB0B7", hash_generated_method = "788C09794FDAB9E55E836748E5A680E8")
    public  DatagramSocket(int aPort) throws SocketException {
        checkPort(aPort);
        createSocket(aPort, Inet4Address.ANY);
        addTaint(aPort);
        // ---------- Original Method ----------
        //checkPort(aPort);
        //createSocket(aPort, Inet4Address.ANY);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.056 -0400", hash_original_method = "CB0AFEB195CAFC978B9076AC8691C2BF", hash_generated_method = "6856810D7F9A9C74E0F6510A2C81A953")
    public  DatagramSocket(int aPort, InetAddress addr) throws SocketException {
        checkPort(aPort);
        createSocket(aPort, (addr == null) ? Inet4Address.ANY : addr);
        addTaint(aPort);
        addTaint(addr.getTaint());
        // ---------- Original Method ----------
        //checkPort(aPort);
        //createSocket(aPort, (addr == null) ? Inet4Address.ANY : addr);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.057 -0400", hash_original_method = "8791E60C190AA1CE5F0CD19BC0C9D10B", hash_generated_method = "134B4F01DF9AD12FA03C559D3EAA2F74")
    protected  DatagramSocket(DatagramSocketImpl socketImpl) {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        impl = socketImpl;
        // ---------- Original Method ----------
        //if (socketImpl == null) {
            //throw new NullPointerException();
        //}
        //impl = socketImpl;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.057 -0400", hash_original_method = "F9D705BC16951CA970DD006A85C9F283", hash_generated_method = "C638960D97D55F3264A1081DEDC28D75")
    public  DatagramSocket(SocketAddress localAddr) throws SocketException {
        {
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Local address not an InetSocketAddress: " +
                        localAddr.getClass());
            } //End block
            checkPort(((InetSocketAddress) localAddr).getPort());
        } //End block
        impl = factory != null ? factory.createDatagramSocketImpl()
                : new PlainDatagramSocketImpl();
        impl.create();
        {
            try 
            {
                bind(localAddr);
            } //End block
            catch (SocketException e)
            {
                close();
                if (DroidSafeAndroidRuntime.control) throw e;
            } //End block
        } //End block
        setBroadcast(true);
        addTaint(localAddr.getTaint());
        // ---------- Original Method ----------
        //if (localAddr != null) {
            //if (!(localAddr instanceof InetSocketAddress)) {
                //throw new IllegalArgumentException("Local address not an InetSocketAddress: " +
                        //localAddr.getClass());
            //}
            //checkPort(((InetSocketAddress) localAddr).getPort());
        //}
        //impl = factory != null ? factory.createDatagramSocketImpl()
                //: new PlainDatagramSocketImpl();
        //impl.create();
        //if (localAddr != null) {
            //try {
                //bind(localAddr);
            //} catch (SocketException e) {
                //close();
                //throw e;
            //}
        //}
        //setBroadcast(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.058 -0400", hash_original_method = "70ACB9C2984CE075C85AFFAB4CC3F2C3", hash_generated_method = "90B78CBDB34B18A4414864713B5DA474")
    private void checkPort(int aPort) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Port out of range: " + aPort);
        } //End block
        addTaint(aPort);
        // ---------- Original Method ----------
        //if (aPort < 0 || aPort > 65535) {
            //throw new IllegalArgumentException("Port out of range: " + aPort);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.058 -0400", hash_original_method = "613628CBB35065AE6B36DA8B5C0D3152", hash_generated_method = "CEB5A5E4301107E97D1EEC22C66FA42C")
    public void close() {
        isClosed = true;
        impl.close();
        // ---------- Original Method ----------
        //isClosed = true;
        //impl.close();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.058 -0400", hash_original_method = "53DC6FE247829A3F8E1E61F886EC8A69", hash_generated_method = "BC1C6D929AEF13847A501FFDD3FE796D")
    public void disconnect() {
        {
            boolean var7A0895E165322EB228A34E837EE13B5D_1430681002 = (isClosed() || !isConnected());
        } //End collapsed parenthetic
        impl.disconnect();
        address = null;
        port = -1;
        isConnected = false;
        // ---------- Original Method ----------
        //if (isClosed() || !isConnected()) {
            //return;
        //}
        //impl.disconnect();
        //address = null;
        //port = -1;
        //isConnected = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.062 -0400", hash_original_method = "CDBEDFAF0027896E1E3D56B522D080D1", hash_generated_method = "784F24AD771BC2278D405321C1A28EBB")
    synchronized void createSocket(int aPort, InetAddress addr) throws SocketException {
        impl = factory != null ? factory.createDatagramSocketImpl()
                : new PlainDatagramSocketImpl();
        impl.create();
        try 
        {
            impl.bind(aPort, addr);
            isBound = true;
        } //End block
        catch (SocketException e)
        {
            close();
            if (DroidSafeAndroidRuntime.control) throw e;
        } //End block
        addTaint(aPort);
        addTaint(addr.getTaint());
        // ---------- Original Method ----------
        //impl = factory != null ? factory.createDatagramSocketImpl()
                //: new PlainDatagramSocketImpl();
        //impl.create();
        //try {
            //impl.bind(aPort, addr);
            //isBound = true;
        //} catch (SocketException e) {
            //close();
            //throw e;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.062 -0400", hash_original_method = "9059089CB1C35AC3C53D636B58746A1E", hash_generated_method = "CF6BCDF66CF921CE536F745CB9BCFFA4")
    public InetAddress getInetAddress() {
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_913776979 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_913776979 = address;
        varB4EAC82CA7396A68D541C85D26508E83_913776979.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_913776979;
        // ---------- Original Method ----------
        //return address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.075 -0400", hash_original_method = "120EDBD12BFFA2CD78689E1CCCEFC0A6", hash_generated_method = "C6AF3B2A56640037A18CB1FEBE9086BD")
    public InetAddress getLocalAddress() {
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_528913260 = null; //Variable for return #1
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_611225696 = null; //Variable for return #2
        InetAddress varB4EAC82CA7396A68D541C85D26508E83_837241963 = null; //Variable for return #3
        {
            boolean varF463C9E3EC09CF3DDC0E11AE27E5A7FD_803868346 = (isClosed());
            {
                varB4EAC82CA7396A68D541C85D26508E83_528913260 = null;
            } //End block
        } //End collapsed parenthetic
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_467211633 = (!isBound());
            {
                varB4EAC82CA7396A68D541C85D26508E83_611225696 = Inet4Address.ANY;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_837241963 = impl.getLocalAddress();
        InetAddress varA7E53CE21691AB073D9660D615818899_170939608; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_170939608 = varB4EAC82CA7396A68D541C85D26508E83_528913260;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_170939608 = varB4EAC82CA7396A68D541C85D26508E83_611225696;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_170939608 = varB4EAC82CA7396A68D541C85D26508E83_837241963;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_170939608.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_170939608;
        // ---------- Original Method ----------
        //if (isClosed()) {
            //return null;
        //}
        //if (!isBound()) {
            //return Inet4Address.ANY;
        //}
        //return impl.getLocalAddress();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.079 -0400", hash_original_method = "C20A7438B6018D8C8B6C316459831E1B", hash_generated_method = "A09EAA56BF0BCE0FE1EFF999A595CA9E")
    public int getLocalPort() {
        {
            boolean varF463C9E3EC09CF3DDC0E11AE27E5A7FD_1815207446 = (isClosed());
        } //End collapsed parenthetic
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_1903380790 = (!isBound());
        } //End collapsed parenthetic
        int var5201144B0B742B3A152781D672D1AA30_2053736556 = (impl.getLocalPort());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1912733702 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1912733702;
        // ---------- Original Method ----------
        //if (isClosed()) {
            //return -1;
        //}
        //if (!isBound()) {
            //return 0;
        //}
        //return impl.getLocalPort();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.079 -0400", hash_original_method = "A5F7344FAECBE0D6DB15D1F6E7BEBC6E", hash_generated_method = "8A71B4B4196AAA1926B3AA2EF7C04256")
    public int getPort() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_543597263 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_543597263;
        // ---------- Original Method ----------
        //return port;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.080 -0400", hash_original_method = "4991C56903C24C085B034589D2617CA7", hash_generated_method = "F7FA1814C2C9C2E9A6449790FC5FE5FF")
     boolean isMulticastSocket() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_969349660 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_969349660;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.080 -0400", hash_original_method = "1025A74ACDCA065D38BE1D18813D43DB", hash_generated_method = "84EE29679978ED461DA873E3A087B1B1")
    public synchronized int getReceiveBufferSize() throws SocketException {
        checkOpen();
        int var879D57EDA18A262547327AC0C51A7315_886075888 = (((Integer) impl.getOption(SocketOptions.SO_RCVBUF)).intValue());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_404787271 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_404787271;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Integer) impl.getOption(SocketOptions.SO_RCVBUF)).intValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.080 -0400", hash_original_method = "D220B9D2C157A98A9F2FC338F369BDAA", hash_generated_method = "3A592E57F69A289C32952D61925DF376")
    public synchronized int getSendBufferSize() throws SocketException {
        checkOpen();
        int var3BBCE4DA0E6FB31CEB590594F23B0AFE_888372360 = (((Integer) impl.getOption(SocketOptions.SO_SNDBUF)).intValue());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2000167834 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2000167834;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Integer) impl.getOption(SocketOptions.SO_SNDBUF)).intValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.083 -0400", hash_original_method = "E87267C7B03A68795BE159270DE33B7D", hash_generated_method = "7837C88EBE1AB0E0456F2FF687712C83")
    public synchronized int getSoTimeout() throws SocketException {
        checkOpen();
        int var97D6E04E407212E66322CDB8618B167A_792398709 = (((Integer) impl.getOption(SocketOptions.SO_TIMEOUT)).intValue());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1798934250 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1798934250;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Integer) impl.getOption(SocketOptions.SO_TIMEOUT)).intValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.083 -0400", hash_original_method = "C2244B28A3A8977EAD72461E3F35998B", hash_generated_method = "294549854FCCEF4D943874B79EB0E9F7")
    public synchronized void receive(DatagramPacket pack) throws IOException {
        checkOpen();
        ensureBound();
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException();
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new SocketException("Pending connect failure", pendingConnectException);
        } //End block
        pack.setLength(pack.getCapacity());
        impl.receive(pack);
        addTaint(pack.getTaint());
        // ---------- Original Method ----------
        //checkOpen();
        //ensureBound();
        //if (pack == null) {
            //throw new NullPointerException();
        //}
        //if (pendingConnectException != null) {
            //throw new SocketException("Pending connect failure", pendingConnectException);
        //}
        //pack.setLength(pack.getCapacity());
        //impl.receive(pack);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.095 -0400", hash_original_method = "F0676E3BCA654DF56D2BFA1EDDBDFD76", hash_generated_method = "AE289050520804C6E2EAD1F469E039AD")
    public void send(DatagramPacket pack) throws IOException {
        checkOpen();
        ensureBound();
        InetAddress packAddr;
        packAddr = pack.getAddress();
        {
            {
                {
                    boolean varEDA02A2B6453C8934EEF171F4AFFA587_415866562 = (!address.equals(packAddr) || port != pack.getPort());
                    {
                        if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Packet address mismatch with connected address");
                    } //End block
                } //End collapsed parenthetic
            } //End block
            {
                pack.setAddress(address);
                pack.setPort(port);
            } //End block
        } //End block
        {
            {
                if (DroidSafeAndroidRuntime.control) throw new NullPointerException("Destination address is null");
            } //End block
        } //End block
        impl.send(pack);
        addTaint(pack.getTaint());
        // ---------- Original Method ----------
        //checkOpen();
        //ensureBound();
        //InetAddress packAddr = pack.getAddress();
        //if (address != null) { 
            //if (packAddr != null) {
                //if (!address.equals(packAddr) || port != pack.getPort()) {
                    //throw new IllegalArgumentException("Packet address mismatch with connected address");
                //}
            //} else {
                //pack.setAddress(address);
                //pack.setPort(port);
            //}
        //} else {
            //if (packAddr == null) {
                //throw new NullPointerException("Destination address is null");
            //}
        //}
        //impl.send(pack);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.096 -0400", hash_original_method = "3874DFBADA775207309D591B6CC4D492", hash_generated_method = "0862A67D7029789FA95C2D46CE5973B5")
    public void setNetworkInterface(NetworkInterface netInterface) throws SocketException {
        {
            if (DroidSafeAndroidRuntime.control) throw new NullPointerException("networkInterface == null");
        } //End block
        try 
        {
            Libcore.os.setsockoptIfreq(impl.fd, SOL_SOCKET, SO_BINDTODEVICE, netInterface.getName());
        } //End block
        catch (ErrnoException errnoException)
        {
            if (DroidSafeAndroidRuntime.control) throw errnoException.rethrowAsSocketException();
        } //End block
        addTaint(netInterface.getTaint());
        // ---------- Original Method ----------
        //if (netInterface == null) {
            //throw new NullPointerException("networkInterface == null");
        //}
        //try {
            //Libcore.os.setsockoptIfreq(impl.fd, SOL_SOCKET, SO_BINDTODEVICE, netInterface.getName());
        //} catch (ErrnoException errnoException) {
            //throw errnoException.rethrowAsSocketException();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.096 -0400", hash_original_method = "6C822EF02E72BD5A5151B1066B41A106", hash_generated_method = "5FE67F7C8208D693EA57EFC59B76B37B")
    public synchronized void setSendBufferSize(int size) throws SocketException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("size < 1");
        } //End block
        checkOpen();
        impl.setOption(SocketOptions.SO_SNDBUF, Integer.valueOf(size));
        addTaint(size);
        // ---------- Original Method ----------
        //if (size < 1) {
            //throw new IllegalArgumentException("size < 1");
        //}
        //checkOpen();
        //impl.setOption(SocketOptions.SO_SNDBUF, Integer.valueOf(size));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.112 -0400", hash_original_method = "568C48DC36A6A663E7303E35F30B9F65", hash_generated_method = "9900591CC9CEC4006B8310239A68DDF1")
    public synchronized void setReceiveBufferSize(int size) throws SocketException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("size < 1");
        } //End block
        checkOpen();
        impl.setOption(SocketOptions.SO_RCVBUF, Integer.valueOf(size));
        addTaint(size);
        // ---------- Original Method ----------
        //if (size < 1) {
            //throw new IllegalArgumentException("size < 1");
        //}
        //checkOpen();
        //impl.setOption(SocketOptions.SO_RCVBUF, Integer.valueOf(size));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.113 -0400", hash_original_method = "FEB39AD74968ADEBB5E7B7804953C3DE", hash_generated_method = "AC1045341F4D6EB4AD69331C48861D97")
    public synchronized void setSoTimeout(int timeout) throws SocketException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("timeout < 0");
        } //End block
        checkOpen();
        impl.setOption(SocketOptions.SO_TIMEOUT, Integer.valueOf(timeout));
        addTaint(timeout);
        // ---------- Original Method ----------
        //if (timeout < 0) {
            //throw new IllegalArgumentException("timeout < 0");
        //}
        //checkOpen();
        //impl.setOption(SocketOptions.SO_TIMEOUT, Integer.valueOf(timeout));
    }

    
        public static synchronized void setDatagramSocketImplFactory(DatagramSocketImplFactory fac) throws IOException {
        if (factory != null) {
            throw new SocketException("Factory already set");
        }
        factory = fac;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.113 -0400", hash_original_method = "8DC54C39C6445BAF3181407C830C5887", hash_generated_method = "A65C5F20D979C9F6EE0AB5D4D39E60F1")
     void checkOpen() throws SocketException {
        {
            boolean varF463C9E3EC09CF3DDC0E11AE27E5A7FD_1052037655 = (isClosed());
            {
                if (DroidSafeAndroidRuntime.control) throw new SocketException("Socket is closed");
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (isClosed()) {
            //throw new SocketException("Socket is closed");
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.113 -0400", hash_original_method = "1B212BFD5D3AE863EDBC7C1325928232", hash_generated_method = "9997F5CAB160A3F71A17A20806A1ECEB")
    private void ensureBound() throws SocketException {
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_214025760 = (!isBound());
            {
                impl.bind(0, Inet4Address.ANY);
                isBound = true;
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (!isBound()) {
            //impl.bind(0, Inet4Address.ANY);
            //isBound = true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.114 -0400", hash_original_method = "3D56D66452A7B2D7ED073824CEA46ED8", hash_generated_method = "DE030F109F1156935D2DFD5FC6262196")
    public void bind(SocketAddress localAddr) throws SocketException {
        checkOpen();
        int localPort;
        localPort = 0;
        InetAddress addr;
        addr = Inet4Address.ANY;
        {
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Local address not an InetSocketAddress: " +
                        localAddr.getClass());
            } //End block
            InetSocketAddress inetAddr;
            inetAddr = (InetSocketAddress) localAddr;
            addr = inetAddr.getAddress();
            {
                if (DroidSafeAndroidRuntime.control) throw new SocketException("Host is unresolved: " + inetAddr.getHostName());
            } //End block
            localPort = inetAddr.getPort();
            checkPort(localPort);
        } //End block
        impl.bind(localPort, addr);
        isBound = true;
        addTaint(localAddr.getTaint());
        // ---------- Original Method ----------
        //checkOpen();
        //int localPort = 0;
        //InetAddress addr = Inet4Address.ANY;
        //if (localAddr != null) {
            //if (!(localAddr instanceof InetSocketAddress)) {
                //throw new IllegalArgumentException("Local address not an InetSocketAddress: " +
                        //localAddr.getClass());
            //}
            //InetSocketAddress inetAddr = (InetSocketAddress) localAddr;
            //addr = inetAddr.getAddress();
            //if (addr == null) {
                //throw new SocketException("Host is unresolved: " + inetAddr.getHostName());
            //}
            //localPort = inetAddr.getPort();
            //checkPort(localPort);
        //}
        //impl.bind(localPort, addr);
        //isBound = true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.115 -0400", hash_original_method = "3DB10BF2A6A48B73F2119F41843D9D33", hash_generated_method = "165C470CA9379502AF91172B0DD28856")
    public void connect(SocketAddress peer) throws SocketException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("peer == null");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("peer not an InetSocketAddress: " + peer.getClass());
        } //End block
        InetSocketAddress isa;
        isa = (InetSocketAddress) peer;
        {
            boolean var94908F4406976F47F480E81F35A6256E_1590041690 = (isa.getAddress() == null);
            {
                if (DroidSafeAndroidRuntime.control) throw new SocketException("Host is unresolved: " + isa.getHostName());
            } //End block
        } //End collapsed parenthetic
        {
            checkOpen();
            ensureBound();
            this.address = isa.getAddress();
            this.port = isa.getPort();
            this.isConnected = true;
            impl.connect(address, port);
        } //End block
        addTaint(peer.getTaint());
        // ---------- Original Method ----------
        //if (peer == null) {
            //throw new IllegalArgumentException("peer == null");
        //}
        //if (!(peer instanceof InetSocketAddress)) {
            //throw new IllegalArgumentException("peer not an InetSocketAddress: " + peer.getClass());
        //}
        //InetSocketAddress isa = (InetSocketAddress) peer;
        //if (isa.getAddress() == null) {
            //throw new SocketException("Host is unresolved: " + isa.getHostName());
        //}
        //synchronized (lock) {
            //checkOpen();
            //ensureBound();
            //this.address = isa.getAddress();
            //this.port = isa.getPort();
            //this.isConnected = true;
            //impl.connect(address, port);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.128 -0400", hash_original_method = "9E27C6FD502F0359DB781EB2FF7E2BA4", hash_generated_method = "362FB567212D2CAF036DCCD9867C06A7")
    public void connect(InetAddress address, int port) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("address == null");
        } //End block
        try 
        {
            connect(new InetSocketAddress(address, port));
        } //End block
        catch (SocketException connectException)
        {
            pendingConnectException = connectException;
        } //End block
        addTaint(address.getTaint());
        addTaint(port);
        // ---------- Original Method ----------
        //if (address == null) {
            //throw new IllegalArgumentException("address == null");
        //}
        //try {
            //connect(new InetSocketAddress(address, port));
        //} catch (SocketException connectException) {
            //pendingConnectException = connectException;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.128 -0400", hash_original_method = "589AFDD4CA6BF38ABB5F59E26BB3DC6D", hash_generated_method = "0A57A7CA1CC28164829978616FB483CB")
    public boolean isBound() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_654078324 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_654078324;
        // ---------- Original Method ----------
        //return isBound;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.128 -0400", hash_original_method = "B1255CDE181FFAAB8CB434FB98B99FFF", hash_generated_method = "7A84779CD3FC9338E39CDCA4C46A9CF2")
    public boolean isConnected() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_727707398 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_727707398;
        // ---------- Original Method ----------
        //return isConnected;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.129 -0400", hash_original_method = "7C698472BF26D61A7917F4B5238C5FF7", hash_generated_method = "E3BC4403F807CFBD0A289930DE77A84F")
    public SocketAddress getRemoteSocketAddress() {
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_1661629801 = null; //Variable for return #1
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_1422259251 = null; //Variable for return #2
        {
            boolean var341AB6969DFD2927CA563855F9EEB77E_2047190495 = (!isConnected());
            {
                varB4EAC82CA7396A68D541C85D26508E83_1661629801 = null;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1422259251 = new InetSocketAddress(getInetAddress(), getPort());
        SocketAddress varA7E53CE21691AB073D9660D615818899_327927981; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_327927981 = varB4EAC82CA7396A68D541C85D26508E83_1661629801;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_327927981 = varB4EAC82CA7396A68D541C85D26508E83_1422259251;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_327927981.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_327927981;
        // ---------- Original Method ----------
        //if (!isConnected()) {
            //return null;
        //}
        //return new InetSocketAddress(getInetAddress(), getPort());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.129 -0400", hash_original_method = "AE126A441E32CF7358FEDD7A95BAD391", hash_generated_method = "7FCCBBDDDCD8684F8219DC8DF7019340")
    public SocketAddress getLocalSocketAddress() {
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_894858040 = null; //Variable for return #1
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_527290658 = null; //Variable for return #2
        {
            boolean var13C5778A8A7AC802C9965161944F9D76_325825981 = (!isBound());
            {
                varB4EAC82CA7396A68D541C85D26508E83_894858040 = null;
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_527290658 = new InetSocketAddress(getLocalAddress(), getLocalPort());
        SocketAddress varA7E53CE21691AB073D9660D615818899_1596011619; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1596011619 = varB4EAC82CA7396A68D541C85D26508E83_894858040;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1596011619 = varB4EAC82CA7396A68D541C85D26508E83_527290658;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1596011619.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1596011619;
        // ---------- Original Method ----------
        //if (!isBound()) {
            //return null;
        //}
        //return new InetSocketAddress(getLocalAddress(), getLocalPort());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.130 -0400", hash_original_method = "D6CD69E67882E49578E557811A0FC457", hash_generated_method = "FC3E7A197DB1A0060F368E39CFC6FAA6")
    public void setReuseAddress(boolean reuse) throws SocketException {
        checkOpen();
        impl.setOption(SocketOptions.SO_REUSEADDR, Boolean.valueOf(reuse));
        addTaint(reuse);
        // ---------- Original Method ----------
        //checkOpen();
        //impl.setOption(SocketOptions.SO_REUSEADDR, Boolean.valueOf(reuse));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.130 -0400", hash_original_method = "8920D58954E3583481E89192EF874E86", hash_generated_method = "7A7E3B5AF9532F9629A48766E2413432")
    public boolean getReuseAddress() throws SocketException {
        checkOpen();
        boolean var92F4A5EAF76459C680E3D19F2BDB3A81_1775575758 = (((Boolean) impl.getOption(SocketOptions.SO_REUSEADDR)).booleanValue());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_184535573 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_184535573;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Boolean) impl.getOption(SocketOptions.SO_REUSEADDR)).booleanValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.136 -0400", hash_original_method = "16BACAE92585B22CC8D47D482CFB74B4", hash_generated_method = "DE15DC4331E8FC145CA658D95B0AEE0C")
    public void setBroadcast(boolean broadcast) throws SocketException {
        checkOpen();
        impl.setOption(SocketOptions.SO_BROADCAST, Boolean.valueOf(broadcast));
        addTaint(broadcast);
        // ---------- Original Method ----------
        //checkOpen();
        //impl.setOption(SocketOptions.SO_BROADCAST, Boolean.valueOf(broadcast));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.137 -0400", hash_original_method = "2CF01D838FE277D7A2E75EEBFE7DA27F", hash_generated_method = "A54636F0C48196BA24938F079B849E8C")
    public boolean getBroadcast() throws SocketException {
        checkOpen();
        boolean var9ED914C1E7DCBED1C7993433295C6E96_37562861 = (((Boolean) impl.getOption(SocketOptions.SO_BROADCAST)).booleanValue());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1531189575 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1531189575;
        // ---------- Original Method ----------
        //checkOpen();
        //return ((Boolean) impl.getOption(SocketOptions.SO_BROADCAST)).booleanValue();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.137 -0400", hash_original_method = "2EC80086B0B75FB75EFBAAF12E210751", hash_generated_method = "A6CFFAADE55D1BEE691332236D1AB510")
    public void setTrafficClass(int value) throws SocketException {
        checkOpen();
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException();
        } //End block
        impl.setOption(SocketOptions.IP_TOS, Integer.valueOf(value));
        addTaint(value);
        // ---------- Original Method ----------
        //checkOpen();
        //if (value < 0 || value > 255) {
            //throw new IllegalArgumentException();
        //}
        //impl.setOption(SocketOptions.IP_TOS, Integer.valueOf(value));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.149 -0400", hash_original_method = "2A65749565A2F95D7C49F3E7C9DCBDEC", hash_generated_method = "2E2AF72B524CE7128D489FDEA6F19CE9")
    public int getTrafficClass() throws SocketException {
        checkOpen();
        int var9C2568077066805EC4361C5C54BBCF61_1896587532 = ((Integer) impl.getOption(SocketOptions.IP_TOS));
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1865967600 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1865967600;
        // ---------- Original Method ----------
        //checkOpen();
        //return (Integer) impl.getOption(SocketOptions.IP_TOS);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.150 -0400", hash_original_method = "2EEDDDEB8BA1CD500E3647BC397BF54F", hash_generated_method = "EA3005A260B78E90CA1EFE6C52665C91")
    public boolean isClosed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_981502074 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_981502074;
        // ---------- Original Method ----------
        //return isClosed;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.150 -0400", hash_original_method = "4DA7A00C8A23C7197F09A02190FE9E45", hash_generated_method = "294F1B3A01BB52B39D34E23FFBDE1CD2")
    public DatagramChannel getChannel() {
        DatagramChannel varB4EAC82CA7396A68D541C85D26508E83_860273655 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_860273655 = null;
        varB4EAC82CA7396A68D541C85D26508E83_860273655.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_860273655;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.151 -0400", hash_original_method = "90C19CEBA6BBC20B430C1F399D6443A6", hash_generated_method = "66FBC3A2222D2C2E3C90DD206D50CC82")
    public final FileDescriptor getFileDescriptor$() {
        FileDescriptor varB4EAC82CA7396A68D541C85D26508E83_399762464 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_399762464 = impl.fd;
        varB4EAC82CA7396A68D541C85D26508E83_399762464.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_399762464;
        // ---------- Original Method ----------
        //return impl.fd;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.151 -0400", hash_original_field = "9549DD6065D019211460C59A86DD6536", hash_generated_field = "E43EB19BC3390384071AA64E51712EB7")

    static DatagramSocketImplFactory factory;
}

