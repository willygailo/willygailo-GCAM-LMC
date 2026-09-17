package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class axp {
    public static final axo a = new axo("Log");

    public static void a(axo axoVar, String str) {
        if (h(axoVar, 6)) {
            Log.e(axoVar.a, str);
        }
    }

    public static void b(axo axoVar, String str, Throwable th) {
        if (h(axoVar, 6)) {
            Log.e(axoVar.a, str, th);
        }
    }

    public static void c(axo axoVar, String str) {
        if (h(axoVar, 5)) {
            Log.w(axoVar.a, str);
        }
    }

    public static void d(axo axoVar, String str, Throwable th) {
        if (h(axoVar, 5)) {
            Log.w(axoVar.a, str, th);
        }
    }

    public static void e(axo axoVar) {
        if (h(axoVar, 3)) {
            String str = axoVar.a;
        }
    }

    public static void f(axo axoVar) {
        if (h(axoVar, 4)) {
            String str = axoVar.a;
        }
    }

    public static void g(axo axoVar) {
        if (h(axoVar, 2)) {
            String str = axoVar.a;
        }
    }

    private static boolean h(axo axoVar, int i) {
        try {
            return Log.isLoggable("CAM2PORT_", i) || Log.isLoggable(axoVar.a, i);
        } catch (IllegalArgumentException e) {
            a(a, "Tag too long:" + axoVar);
            return false;
        }
    }
}
