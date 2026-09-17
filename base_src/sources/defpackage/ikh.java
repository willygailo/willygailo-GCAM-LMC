package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ikh {
    public static final ouj a = ouj.h("com/google/android/apps/camera/storage/cache/SingleKeyCache");
    public final pht b;
    public final String c;
    public final Executor d;
    public Object e;
    public final Object f = new Object();

    public ikh(pht phtVar, Executor executor) {
        phtVar.getClass();
        this.b = phtVar;
        this.c = "indicatorThumbnail";
        this.d = executor;
    }

    public final pht a() {
        synchronized (this.f) {
            Object obj = this.e;
            if (obj == null) {
                return pgb.i(this.b, new ike(this), this.d);
            }
            return plk.V(obj);
        }
    }
}
