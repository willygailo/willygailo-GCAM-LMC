package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qjg extends AtomicInteger implements qbi, qyn {
    private static final long serialVersionUID = -4945028590049415624L;
    final qym a;
    final qjo b = new qjo();
    final AtomicLong c = new AtomicLong();
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public qjg(qym qymVar) {
        this.a = qymVar;
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        if (this.e.compareAndSet(false, true)) {
            this.a.a(this);
            qjn.h(this.d, this.c, qynVar);
        } else {
            qynVar.g();
            g();
            j(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        qym qymVar = this.a;
        qjo qjoVar = this.b;
        if (get() == 0 && compareAndSet(0, 1)) {
            qymVar.e(obj);
            if (decrementAndGet() != 0) {
                Throwable thB = qjq.b(qjoVar);
                if (thB != null) {
                    qymVar.j(thB);
                } else {
                    qymVar.gO();
                }
            }
        }
    }

    @Override // defpackage.qyn
    public final void g() {
        if (this.f) {
            return;
        }
        qjn.f(this.d);
    }

    @Override // defpackage.qym
    public final void gO() {
        this.f = true;
        qym qymVar = this.a;
        qjo qjoVar = this.b;
        if (getAndIncrement() == 0) {
            Throwable thB = qjq.b(qjoVar);
            if (thB != null) {
                qymVar.j(thB);
            } else {
                qymVar.gO();
            }
        }
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (j > 0) {
            qjn.a(this.d, this.c, j);
            return;
        }
        g();
        StringBuilder sb = new StringBuilder(79);
        sb.append("§3.9 violated: positive request amount required but it was ");
        sb.append(j);
        j(new IllegalArgumentException(sb.toString()));
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        this.f = true;
        qym qymVar = this.a;
        qjo qjoVar = this.b;
        if (!qjq.c(qjoVar, th)) {
            qmd.R(th);
        } else if (getAndIncrement() == 0) {
            qymVar.j(qjq.b(qjoVar));
        }
    }
}
