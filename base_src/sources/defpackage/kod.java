package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class kod {
    private static final Method a;
    private static final Method b;

    static {
        Method method;
        Process.myUid();
        Method method2 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception e) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception e2) {
        }
        b = method2;
        try {
            WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e3) {
        }
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception e5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", new Class[0]);
        } catch (Exception e6) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e6);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e7) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e7);
        }
        try {
            WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
        } catch (Exception e8) {
        }
    }

    public static WorkSource a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfoF = koe.b(context).f(str, 0);
            if (applicationInfoF == null) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                return null;
            }
            int i = applicationInfoF.uid;
            WorkSource workSource = new WorkSource();
            Method method = b;
            if (method != null) {
                try {
                    method.invoke(workSource, Integer.valueOf(i), str);
                } catch (Exception e) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                }
            } else {
                Method method2 = a;
                if (method2 != null) {
                    try {
                        method2.invoke(workSource, Integer.valueOf(i));
                    } catch (Exception e2) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                    }
                }
            }
            return workSource;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            return null;
        }
    }

    public static boolean b(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        return koe.b(context).a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }
}
