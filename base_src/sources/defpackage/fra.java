package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class fra implements mlk {
    public static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/encoder/SanitizerMuxer");
    public final mlk b;
    public final Set c = new HashSet();
    public final AtomicInteger d = new AtomicInteger(0);
    public final Object e = new Object();
    public boolean f = false;

    public fra(mlk mlkVar) {
        this.b = mlkVar;
    }

    @Override // defpackage.mlk
    public final mln a() {
        fqz fqzVar;
        obr.aQ(!this.f);
        synchronized (this.e) {
            fqzVar = new fqz(this, this.b.a());
            this.c.add(fqzVar);
            this.d.getAndIncrement();
        }
        return fqzVar;
    }

    @Override // defpackage.mlk
    public final pht b() {
        return this.b.b();
    }

    @Override // defpackage.mlk
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.mlk
    public final void d() {
        this.b.d();
        this.f = true;
    }
}
