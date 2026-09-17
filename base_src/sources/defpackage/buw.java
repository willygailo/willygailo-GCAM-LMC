package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class buw {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final Executor b;
    private final Executor c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public buw(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, Executor executor, Executor executor2, ljf ljfVar) {
        this.b = new ljl(executor, ljfVar, "ActivityStartup");
        this.c = new ljl(executor2, ljfVar, "ActivityStartup");
        this.d = qkgVar;
        this.e = qkgVar2;
        this.f = qkgVar3;
    }

    public final void a(int i) {
        if (this.a.compareAndSet(false, true)) {
            switch (i - 1) {
                case 1:
                    mip.eS(this.d, this.b);
                    mip.eS(this.e, this.b);
                    mip.eS(this.f, this.b);
                    break;
                default:
                    mip.eS(this.e, this.b);
                    mip.eS(this.f, this.c);
                    break;
            }
        }
    }
}
