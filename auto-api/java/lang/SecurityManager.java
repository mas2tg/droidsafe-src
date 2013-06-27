package java.lang;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

public class SecurityManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.162 -0400", hash_original_field = "F4FDA642396C90310EC38E0D5B8E09CF", hash_generated_field = "9E5AF9E744782F4ACD2178CD4DBD0985")

    @Deprecated protected boolean inCheck;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.163 -0400", hash_original_method = "7FD71E6D3FB4A8DD9BF04FA4D2AAA4D4", hash_generated_method = "10F82CBF8C065A15711155F7BC44F06C")
    public  SecurityManager() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.163 -0400", hash_original_method = "33353E03F38CCE3C205F21DCE963F727", hash_generated_method = "902E6665936150FB1075FCBFBB47585A")
    public void checkAccept(String host, int port) {
        addTaint(host.getTaint());
        addTaint(port);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.163 -0400", hash_original_method = "36F107888B3E77E3CF49B5177EDF7E9A", hash_generated_method = "72F10715B7EBCE4C227C6DB3FC159E42")
    public void checkAccess(Thread thread) {
        addTaint(thread.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.164 -0400", hash_original_method = "5AA7E51DAAAF233E2DDB8D1EE8363A8E", hash_generated_method = "99A309E9A2C5464D9B2CDB9DCCFF4A78")
    public void checkAccess(ThreadGroup group) {
        addTaint(group.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.164 -0400", hash_original_method = "3BD498F27EF913D40B889A93E2AA24F9", hash_generated_method = "0B37F5465274F7FCCB8F26D23091F705")
    public void checkConnect(String host, int port) {
        addTaint(host.getTaint());
        addTaint(port);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.164 -0400", hash_original_method = "2D5E761F7C6DB4BDDDC273A07ED405C0", hash_generated_method = "E5B771F960083FF1223E692A606CEF1E")
    public void checkConnect(String host, int port, Object context) {
        addTaint(host.getTaint());
        addTaint(port);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.164 -0400", hash_original_method = "8490F7E6ADD8012AF63244E1903E9866", hash_generated_method = "4206A8859EFB69212A75A66F61C96B51")
    public void checkCreateClassLoader() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.170 -0400", hash_original_method = "0B17A1C3AA9D11809AA604D4E5BD4994", hash_generated_method = "C0EEE7D1DCEACAFD7B7E8E98D1DF86E9")
    public void checkDelete(String file) {
        addTaint(file.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.171 -0400", hash_original_method = "7C003C59CAB570CD3B63381DBAA3AF4E", hash_generated_method = "CE6D4D345373C4499DFCDEF8C7D24F30")
    public void checkExec(String cmd) {
        addTaint(cmd.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.171 -0400", hash_original_method = "8A9ADA58552041193904C8083A11F7F6", hash_generated_method = "85A8F17F16315507E32ED111E4F8DC54")
    public void checkExit(int status) {
        addTaint(status);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.174 -0400", hash_original_method = "75433C5D6CF4249C0EE246BC57BF57E2", hash_generated_method = "A6308F1604D4F72B910F5E945C6AFD1A")
    public void checkLink(String libName) {
        addTaint(libName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.174 -0400", hash_original_method = "5412847302AF42E3061C6779693DB418", hash_generated_method = "42823686AFF9259B448D6BCA7F8D9E1F")
    public void checkListen(int port) {
        addTaint(port);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.174 -0400", hash_original_method = "8873C7B5DD5CF23CB18ABA2720E20660", hash_generated_method = "78E5AEB94A4195904BEF9E8D9F0CC758")
    public void checkMemberAccess(Class<?> cls, int type) {
        addTaint(cls.getTaint());
        addTaint(type);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.175 -0400", hash_original_method = "0D776561D024E069F4378E17ED49E5AF", hash_generated_method = "CD04AB806DD8004F3454B62D501B8A3E")
    public void checkMulticast(InetAddress maddr) {
        addTaint(maddr.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.177 -0400", hash_original_method = "B705963A40DC1EBCB270E0041777CD02", hash_generated_method = "ECED96526F7DD2BB0CA90F501E155615")
    @Deprecated
    public void checkMulticast(InetAddress maddr, byte ttl) {
        addTaint(maddr.getTaint());
        addTaint(ttl);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.177 -0400", hash_original_method = "1E8CF02717496E9B31EA8F152A6EAAD3", hash_generated_method = "E78009F77D21AD351B9F00709CE91252")
    public void checkPackageAccess(String packageName) {
        addTaint(packageName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.178 -0400", hash_original_method = "15FB53D386245A148D9A0D9EA27D53FA", hash_generated_method = "C15CFAC88208691568D6CB0DCC9CE5A4")
    public void checkPackageDefinition(String packageName) {
        addTaint(packageName.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.178 -0400", hash_original_method = "03937928889C65B1E71F0E79371D5926", hash_generated_method = "1777D1D5A96109E8F9520DDCD5330AEF")
    public void checkPropertiesAccess() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.178 -0400", hash_original_method = "2BC6BA97AA7103DE882EC8441211CBCF", hash_generated_method = "3F5D5D91225C3E7249BC053F3FB9687B")
    public void checkPropertyAccess(String key) {
        addTaint(key.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.179 -0400", hash_original_method = "3B0F34A9B39090E476EB90B81040C7D1", hash_generated_method = "4E4FF2488CB2AB16FC934A067F60D492")
    public void checkRead(FileDescriptor fd) {
        addTaint(fd.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.180 -0400", hash_original_method = "51BADDB31E600F7C9A9DCE17CAEE4ABD", hash_generated_method = "136086F9E0B3E6ED1A63EEA383102169")
    public void checkRead(String file) {
        addTaint(file.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.180 -0400", hash_original_method = "69F9067A125A221CFB426CF2266303C7", hash_generated_method = "2BC86088636D58378DAF302F8261BFE6")
    public void checkRead(String file, Object context) {
        addTaint(file.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.180 -0400", hash_original_method = "2231CD521BF6360DD9009A387DA65FE2", hash_generated_method = "9343873B55A4E26327F15A92615993B5")
    public void checkSecurityAccess(String target) {
        addTaint(target.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.180 -0400", hash_original_method = "F217CE0DC3EB310EAAAF9D4806D2E409", hash_generated_method = "8A03D75B144D71C0D274D98D79E3AE2A")
    public void checkSetFactory() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.188 -0400", hash_original_method = "E08658A8A8D2FA3A353C142735F36A84", hash_generated_method = "C8B0DF09E21EBE6674145F3CC16E592B")
    public boolean checkTopLevelWindow(Object window) {
        addTaint(window.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_314507779 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_314507779;
        // ---------- Original Method ----------
        //return true;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.189 -0400", hash_original_method = "8AB55486AE4ED05EAE2D015F13C35436", hash_generated_method = "0F61F5AD77B8F62ABFA4EC158605A22B")
    public void checkSystemClipboardAccess() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.189 -0400", hash_original_method = "CF92AB5D995750BFB7FF9F031A4246A8", hash_generated_method = "2397CF2F184F1284560FAE451934637C")
    public void checkAwtEventQueueAccess() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.189 -0400", hash_original_method = "58C1D3B2A93E82E28FD99A55EC6954F5", hash_generated_method = "C3B834D6C36A5606179169AB3721866E")
    public void checkPrintJobAccess() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.190 -0400", hash_original_method = "5C84ACAAF82CCDAC7FC44A08CB5F593D", hash_generated_method = "2C6B4C77968C6B13E9A0BE32764D4398")
    public void checkWrite(FileDescriptor fd) {
        addTaint(fd.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.190 -0400", hash_original_method = "2871DB4234901BDC284DA13B123CE1AB", hash_generated_method = "48731BDFFD8650FE95B39F47B3FCA190")
    public void checkWrite(String file) {
        addTaint(file.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.198 -0400", hash_original_method = "866416E1EAC2C07A5E7D767D9B266DDC", hash_generated_method = "E0772972C3DF529C834F8BFAF366FE0C")
    @Deprecated
    public boolean getInCheck() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1220844214 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1220844214;
        // ---------- Original Method ----------
        //return inCheck;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.199 -0400", hash_original_method = "A7EABFC12C747C29197C1D84213DA551", hash_generated_method = "312ECC932FF28B5B73A314A367809417")
    protected Class[] getClassContext() {
        Class[] varB4EAC82CA7396A68D541C85D26508E83_54371523 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_54371523 = null;
        varB4EAC82CA7396A68D541C85D26508E83_54371523.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_54371523;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.200 -0400", hash_original_method = "B5AF7ACC7C1515B2CC77D7C50B13C496", hash_generated_method = "F0521AEB301AA705B241BA13DFA40438")
    @Deprecated
    protected ClassLoader currentClassLoader() {
        ClassLoader varB4EAC82CA7396A68D541C85D26508E83_980090850 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_980090850 = null;
        varB4EAC82CA7396A68D541C85D26508E83_980090850.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_980090850;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.200 -0400", hash_original_method = "2F5894A33E5089040E95C5A71AB1D464", hash_generated_method = "D01BD9B1C4FB991B0E85482F6C35A095")
    @Deprecated
    protected int classLoaderDepth() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1849046992 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1849046992;
        // ---------- Original Method ----------
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.201 -0400", hash_original_method = "971A50644C25A1AA23F94C545B2EFE88", hash_generated_method = "C2DF8EE9D63B5CAA072A8F937500E689")
    @Deprecated
    protected Class<?> currentLoadedClass() {
        Class<?> varB4EAC82CA7396A68D541C85D26508E83_426285226 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_426285226 = null;
        varB4EAC82CA7396A68D541C85D26508E83_426285226.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_426285226;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.202 -0400", hash_original_method = "3141DB701376F59132D2E47A865226CE", hash_generated_method = "DF86BFD3D5C757969B99765D8558C6E2")
    @Deprecated
    protected int classDepth(String name) {
        addTaint(name.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_519017813 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_519017813;
        // ---------- Original Method ----------
        //return -1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.202 -0400", hash_original_method = "F03BE1FF5759480A79EF8F803256FC0D", hash_generated_method = "D41454E27A453143061EA02650DB168A")
    @Deprecated
    protected boolean inClass(String name) {
        addTaint(name.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_692288116 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_692288116;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.202 -0400", hash_original_method = "AD16BBA5AF716809FD60AB92F9D52E9A", hash_generated_method = "20B4741CE3819437863A59F7FA134C61")
    @Deprecated
    protected boolean inClassLoader() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1148784788 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1148784788;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.204 -0400", hash_original_method = "036AF7AD226EFB7B513484DD9E6E1DD6", hash_generated_method = "1F9997B043C026842B9F546E39EE90FE")
    public ThreadGroup getThreadGroup() {
        ThreadGroup varB4EAC82CA7396A68D541C85D26508E83_48125091 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_48125091 = Thread.currentThread().getThreadGroup();
        varB4EAC82CA7396A68D541C85D26508E83_48125091.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_48125091;
        // ---------- Original Method ----------
        //return Thread.currentThread().getThreadGroup();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.206 -0400", hash_original_method = "9105FFA72B51771391C0727CF897942D", hash_generated_method = "163D4EC4636BF0F31D116EE52EC315EA")
    public Object getSecurityContext() {
        Object varB4EAC82CA7396A68D541C85D26508E83_1523351776 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1523351776 = null;
        varB4EAC82CA7396A68D541C85D26508E83_1523351776.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1523351776;
        // ---------- Original Method ----------
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.216 -0400", hash_original_method = "F83ED49980C30C3CF74F8E7C00892337", hash_generated_method = "EFE73C5746AC3B5ACE7F01EE1BE54C73")
    public void checkPermission(Permission permission) {
        addTaint(permission.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:41.217 -0400", hash_original_method = "9F219EE7931C25AFA3551D0D45001223", hash_generated_method = "18A5D5DC89DAE9439BB98F5C47996330")
    public void checkPermission(Permission permission, Object context) {
        addTaint(permission.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
}

