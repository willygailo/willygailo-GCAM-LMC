package defpackage;

import java.io.Closeable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class ozg implements ozh {
    private final Method a;

    public ozg(Method method) {
        this.a = method;
    }

    @Override // defpackage.ozh
    public final void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            this.a.invoke(th, th2);
        } catch (Throwable th3) {
            ozf.a.a(closeable, th, th2);
        }
    }
}
