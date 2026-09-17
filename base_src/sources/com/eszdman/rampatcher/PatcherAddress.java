package com.eszdman.rampatcher;

import android.app.Application;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class PatcherAddress {
    private static final String TAG = "PatcherAddress";
    long exportAddres;
    long libStartAddres;
    String libName = "libgcastartup.so";
    String exportName = "Java_com_google_googlex_gcam_GcamModuleJNI_delete_1PortraitRequest";

    PatcherAddress() {
    }

    private long ReadAddr(String str) {
        return ReadLong(this.properties.getProperty(str)) + this.libStartAddres;
    }

    private long ReadLong(String str) {
        return str.contains("0x") ? Long.parseLong(str.replace("0x", ""), 16) : Long.parseLong(str);
    }

    private long ReadUserAddr(String str) {
        return ReadLong(str) + this.libStartAddres;
    }

    private long ReadUserTestAddr(String str) {
        return ReadLong(str);
    }

    public static Application getApplicationUsingReflection() {
        try {
            return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, (Object[]) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(TAG, "Error at getting application context");
            e.printStackTrace();
            return null;
        }
    }

    public void InsertMemoryAddr(long j) {
        long jReadLong = ReadLong("0x11ED95C");
        this.exportAddres = jReadLong;
        this.libStartAddres = j - jReadLong;
    }
}
