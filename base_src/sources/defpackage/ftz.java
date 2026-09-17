package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ftz {
    public final dyx a;
    public final AtomicInteger b = new AtomicInteger(0);
    private final lig c;

    public ftz(dyx dyxVar, lig ligVar) {
        this.a = dyxVar;
        this.c = ligVar;
    }

    public final synchronized fty a() {
        if (this.b.getAndIncrement() == 0) {
            lig ligVar = this.c;
            this.a.f(new lig(ligVar.a, ligVar.b), "mv-gyro-session");
        }
        return new fty(this);
    }
}
