package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iag implements iat, cbm {
    private final ScheduledExecutorService a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public iay d;
    private ScheduledFuture e;
    private iax f;
    private int g;
    private int h;
    private int i;
    private int j;
    private jrl k;
    private float l;

    public iag(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.iat
    public final void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
        this.d = iayVar;
        iaf iafVarC = c();
        iaw iawVarB = iafVarC.c.b();
        iawVarB.g = new Runnable() { // from class: iad
            @Override // java.lang.Runnable
            public final void run() {
                iay iayVar2;
                iag iagVar = this.a;
                iagVar.b.set(true);
                if (!iagVar.c.compareAndSet(true, false) || (iayVar2 = iagVar.d) == null) {
                    return;
                }
                iayVar2.a();
            }
        };
        this.f = iawVarB.a();
        this.g = iafVarC.a;
        this.i = iafVarC.b;
        this.k = iafVarC.d;
        this.l = iafVarC.e;
    }

    protected abstract iaf c();

    @Override // defpackage.cbm
    public final void fP(jrl jrlVar, float f) {
        int iMin;
        iay iayVar;
        iay iayVar2;
        int i = this.h + 1;
        this.h = i;
        if (i < this.g) {
            return;
        }
        this.h = 0;
        if (this.b.get()) {
            return;
        }
        if (jrlVar != this.k || f < this.l) {
            this.j = 0;
            iMin = 0;
        } else {
            iMin = Math.min(this.j + 1, this.i);
            this.j = iMin;
        }
        if (iMin == this.i) {
            if (!this.c.compareAndSet(false, true) || (iayVar2 = this.d) == null) {
                return;
            }
            iayVar2.b(this.f);
            return;
        }
        if (!this.c.compareAndSet(true, false) || (iayVar = this.d) == null) {
            return;
        }
        if (this.f.a == 0) {
            this.e = this.a.schedule(new fkf(iayVar, 2), 1000L, TimeUnit.MILLISECONDS);
        } else {
            iayVar.a();
        }
    }

    @Override // defpackage.iat
    public final void u() {
        this.c.set(false);
    }

    @Override // defpackage.iat
    public final void v() {
    }
}
