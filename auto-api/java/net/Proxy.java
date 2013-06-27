package java.net;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class Proxy {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.680 -0400", hash_original_field = "599DCCE2998A6B40B1E38E8C6006CB0A", hash_generated_field = "0493BBFB1288023B7B163197BF9857A6")

    private Proxy.Type type;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.680 -0400", hash_original_field = "884D9804999FC47A3C2694E49AD2536A", hash_generated_field = "E0A43CBF82D512E62F9819C96F9107F8")

    private SocketAddress address;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.681 -0400", hash_original_method = "16752A487C0930093F66EAD9AA8B14F8", hash_generated_method = "FDF58E2224DDF08DBCA6DF9A12000661")
    public  Proxy(Proxy.Type type, SocketAddress sa) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Illegal Proxy.Type or SocketAddress argument");
        } //End block
        this.type = type;
        address = sa;
        // ---------- Original Method ----------
        //if (type == Type.DIRECT || sa == null) {
            //throw new IllegalArgumentException("Illegal Proxy.Type or SocketAddress argument");
        //}
        //this.type = type;
        //address = sa;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.682 -0400", hash_original_method = "D66A32319FBF400033B05D10E8B8C304", hash_generated_method = "3B8506530C1D1E82DA5460F730015C73")
    private  Proxy() {
        type = Type.DIRECT;
        address = null;
        // ---------- Original Method ----------
        //type = Type.DIRECT;
        //address = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.682 -0400", hash_original_method = "78A2D2ADD0266F75C3E71E2673988A41", hash_generated_method = "4A7B69B5FE50DFE8EDB569CBE6AAFF22")
    public Proxy.Type type() {
        Proxy.Type varB4EAC82CA7396A68D541C85D26508E83_1558923265 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1558923265 = type;
        varB4EAC82CA7396A68D541C85D26508E83_1558923265.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1558923265;
        // ---------- Original Method ----------
        //return type;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.683 -0400", hash_original_method = "9D457D33A5E2F2EF090CABC1273126C2", hash_generated_method = "0D9704CE006D8995E701216ACFE67011")
    public SocketAddress address() {
        SocketAddress varB4EAC82CA7396A68D541C85D26508E83_1010110939 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1010110939 = address;
        varB4EAC82CA7396A68D541C85D26508E83_1010110939.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1010110939;
        // ---------- Original Method ----------
        //return address;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.698 -0400", hash_original_method = "15D85DA96A49804E7A6DD9EB58950877", hash_generated_method = "D25A6544BDDB540B492AAB44318A2864")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1963654958 = null; //Variable for return #1
        StringBuilder builder;
        builder = new StringBuilder();
        {
            builder.append(type.toString());
        } //End block
        builder.append("@");
        {
            builder.append(address.toString());
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1963654958 = builder.toString();
        varB4EAC82CA7396A68D541C85D26508E83_1963654958.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1963654958;
        // ---------- Original Method ----------
        //StringBuilder builder = new StringBuilder();
        //if (type != null) {
            //builder.append(type.toString());
        //}
        //builder.append("@");
        //if (type != Proxy.Type.DIRECT && address != null) {
            //builder.append(address.toString());
        //}
        //return builder.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.699 -0400", hash_original_method = "0AADE3011667515449A8CD7BE7CB43B7", hash_generated_method = "B0ABF31DF98EE5FC117AB10A3E4267FF")
    @Override
    public final boolean equals(Object obj) {
        Proxy another;
        another = (Proxy) obj;
        boolean varEAB7084851FAECD7616BC770C9D68717_2113953779 = ((type == another.type) && address.equals(another.address));
        addTaint(obj.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_846073636 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_846073636;
        // ---------- Original Method ----------
        //if (this == obj) {
            //return true;
        //}
        //if (!(obj instanceof Proxy)) {
            //return false;
        //}
        //Proxy another = (Proxy) obj;
        //return (type == another.type) && address.equals(another.address);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.699 -0400", hash_original_method = "AFEB3E9B74402AACB68FC4AD63CE261F", hash_generated_method = "C272A174888EA579938CF5C29F7AA80D")
    @Override
    public final int hashCode() {
        int ret;
        ret = 0;
        ret += type.hashCode();
        {
            ret += address.hashCode();
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1334066246 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1334066246;
        // ---------- Original Method ----------
        //int ret = 0;
        //ret += type.hashCode();
        //if (address != null) {
            //ret += address.hashCode();
        //}
        //return ret;
    }

    
    public enum Type {
        DIRECT,
        HTTP,
        SOCKS
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:43.699 -0400", hash_original_field = "00F7D85B1963E3DD128AB25CE9CD2640", hash_generated_field = "CFAF9C7805E2D3759922DBF914F8A204")

    public static final Proxy NO_PROXY = new Proxy();
}

