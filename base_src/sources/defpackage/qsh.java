package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final class qsh {
    private static volatile Choreographer choreographer;

    static {
        Object objL;
        try {
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
            objL = new qsf((Handler) objInvoke, null);
        } catch (Throwable th) {
            objL = qmd.L(th);
        }
    }

    public static final qsg a(Handler handler) {
        return new qsf(handler, "main");
    }
}
