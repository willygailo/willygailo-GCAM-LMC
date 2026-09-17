package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bww {
    public static final ouj a = ouj.h("com/google/android/apps/camera/async/OptionalFuture");
    public final pht b;
    public final long c;

    public bww(pht phtVar, long j) {
        this.b = phtVar;
        this.c = j;
    }

    public static bww a() {
        return new bww(plk.V(null), 0L);
    }

    public final ojc b() {
        try {
            return ojc.h(this.b.get(this.c, TimeUnit.MILLISECONDS));
        } catch (Exception e) {
            ((oug) ((oug) a.c()).G(144)).r("Failed to resolve %s, returning absent instead.", this.b);
            return oih.a;
        }
    }
}
