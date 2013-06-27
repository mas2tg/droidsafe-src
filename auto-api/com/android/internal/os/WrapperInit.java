package com.android.internal.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.os.Process;
import android.util.Slog;
import java.io.DataOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import libcore.io.IoUtils;
import libcore.io.Libcore;
import dalvik.system.Zygote;

public class WrapperInit {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:12.594 -0400", hash_original_method = "14AE6538EB86DCD6EBFC0019A87B65D0", hash_generated_method = "F137D9F0016E8D63FEB9D79F37359A64")
    private  WrapperInit() {
        // ---------- Original Method ----------
    }

    
        public static void main(String[] args) {
        try {
            int fdNum = Integer.parseInt(args[0], 10);
            int targetSdkVersion = Integer.parseInt(args[1], 10);
            if (fdNum != 0) {
                try {
                    FileDescriptor fd = ZygoteInit.createFileDescriptor(fdNum);
                    DataOutputStream os = new DataOutputStream(new FileOutputStream(fd));
                    os.writeInt(Process.myPid());
                    os.close();
                    IoUtils.closeQuietly(fd);
                } catch (IOException ex) {
                    Slog.d(TAG, "Could not write pid of wrapped process to Zygote pipe.", ex);
                }
            }
            ZygoteInit.preload();
            String[] runtimeArgs = new String[args.length - 2];
            System.arraycopy(args, 2, runtimeArgs, 0, runtimeArgs.length);
            RuntimeInit.wrapperInit(targetSdkVersion, runtimeArgs);
        } catch (ZygoteInit.MethodAndArgsCaller caller) {
            caller.run();
        }
    }

    
        public static void execApplication(String invokeWith, String niceName,
            int targetSdkVersion, FileDescriptor pipeFd, String[] args) {
        StringBuilder command = new StringBuilder(invokeWith);
        command.append(" /system/bin/app_process /system/bin --application");
        if (niceName != null) {
            command.append(" '--nice-name=").append(niceName).append("'");
        }
        command.append(" com.android.internal.os.WrapperInit ");
        command.append(pipeFd != null ? pipeFd.getInt$() : 0);
        command.append(' ');
        command.append(targetSdkVersion);
        Zygote.appendQuotedShellArgs(command, args);
        Zygote.execShell(command.toString());
    }

    
        public static void execStandalone(String invokeWith, String classPath, String className,
            String[] args) {
        StringBuilder command = new StringBuilder(invokeWith);
        command.append(" /system/bin/dalvikvm -classpath '").append(classPath);
        command.append("' ").append(className);
        Zygote.appendQuotedShellArgs(command, args);
        Zygote.execShell(command.toString());
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:13:12.595 -0400", hash_original_field = "F88265C21754A18C5BC383814994D78A", hash_generated_field = "5EE5B1AF8151F27122B430818DCB5757")

    private static String TAG = "AndroidRuntime";
}

