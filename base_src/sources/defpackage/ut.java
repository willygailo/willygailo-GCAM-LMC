package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ut extends hn {
    public static final Executor a = new lio(1);
    private static volatile ut c;
    public final hn b;
    private final hn d;

    private ut() {
        uv uvVar = new uv();
        this.d = uvVar;
        this.b = uvVar;
    }

    public static ut f() {
        if (c != null) {
            return c;
        }
        synchronized (ut.class) {
            if (c == null) {
                c = new ut();
            }
        }
        return c;
    }

    public final boolean g() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
