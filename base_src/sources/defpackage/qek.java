package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
final class qek extends qej {
    private static final long serialVersionUID = 7898995095634264146L;
    final qym m;
    final AtomicInteger n;

    public qek(qym qymVar, qco qcoVar) {
        super(qcoVar);
        this.m = qymVar;
        this.n = new AtomicInteger();
    }

    @Override // defpackage.qej
    public final void b() {
        if (this.n.getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.h;
                    try {
                        Object objGS = this.g.gS();
                        if (z) {
                            if (objGS == null) {
                                this.m.gO();
                                return;
                            }
                        } else if (objGS != null) {
                        }
                        try {
                            qyl qylVar = (qyl) this.b.a(objGS);
                            qmd.W(qylVar, "The mapper returned a null Publisher");
                            if (this.l != 1) {
                                int i = this.f + 1;
                                if (i == this.d) {
                                    this.f = 0;
                                    this.e.gP(i);
                                } else {
                                    this.f = i;
                                }
                            }
                            if (qylVar instanceof Callable) {
                                try {
                                    Object objCall = ((Callable) qylVar).call();
                                    if (objCall == null) {
                                        continue;
                                    } else if (!this.a.i) {
                                        this.k = true;
                                        qel qelVar = this.a;
                                        qelVar.h(new qen(objCall, qelVar));
                                    } else if (get() == 0 && compareAndSet(0, 1)) {
                                        this.m.e(objCall);
                                        if (!compareAndSet(1, 0)) {
                                            this.m.j(qjq.b(this.j));
                                            return;
                                        }
                                    }
                                } catch (Throwable th) {
                                    qmd.Y(th);
                                    this.e.g();
                                    qjq.c(this.j, th);
                                    this.m.j(qjq.b(this.j));
                                    return;
                                }
                            } else {
                                this.k = true;
                                qylVar.g(this.a);
                            }
                        } catch (Throwable th2) {
                            qmd.Y(th2);
                            this.e.g();
                            qjq.c(this.j, th2);
                            this.m.j(qjq.b(this.j));
                            return;
                        }
                    } catch (Throwable th3) {
                        qmd.Y(th3);
                        this.e.g();
                        qjq.c(this.j, th3);
                        this.m.j(qjq.b(this.j));
                        return;
                    }
                }
                if (this.n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.qej
    public final void f() {
        this.m.a(this);
    }

    @Override // defpackage.qyn
    public final void g() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.g();
        this.e.g();
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        this.a.gP(j);
    }

    @Override // defpackage.qem
    public final void h(Throwable th) {
        if (!qjq.c(this.j, th)) {
            qmd.R(th);
            return;
        }
        this.e.g();
        if (getAndIncrement() == 0) {
            this.m.j(qjq.b(this.j));
        }
    }

    @Override // defpackage.qem
    public final void i(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            this.m.e(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            this.m.j(qjq.b(this.j));
        }
    }

    @Override // defpackage.qym
    public final void j(Throwable th) {
        if (!qjq.c(this.j, th)) {
            qmd.R(th);
            return;
        }
        this.a.g();
        if (getAndIncrement() == 0) {
            this.m.j(qjq.b(this.j));
        }
    }
}
