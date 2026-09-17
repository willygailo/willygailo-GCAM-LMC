package defpackage;

import android.os.Build;
import android.util.Log;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes2.dex */
public final class owz extends owp {
    private static final boolean a = owy.a();
    private static final boolean b;
    private static final owo c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        Log.class.getName();
        c = new owx();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return owy.class.getName().equals(q());
        } catch (Throwable th) {
            return false;
        }
    }

    @Override // defpackage.owp
    protected ovr e(String str) {
        if (oxc.a.get() != null) {
            return ((owu) oxc.a.get()).a(str);
        }
        oxc oxcVar = new oxc(str.replace('$', '.'));
        oxa.a.offer(oxcVar);
        if (oxc.a.get() == null) {
            return oxcVar;
        }
        oxc.e();
        return oxcVar;
    }

    @Override // defpackage.owp
    protected owo h() {
        return c;
    }

    @Override // defpackage.owp
    protected oxh j() {
        return oxd.a;
    }

    @Override // defpackage.owp
    protected String m() {
        return "platform: Android";
    }
}
