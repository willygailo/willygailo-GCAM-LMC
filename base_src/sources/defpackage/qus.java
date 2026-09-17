package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class qus {
    public static final qrq a;

    static {
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        handlerCreateAsync.getClass();
        a = qsh.a(handlerCreateAsync);
    }
}
