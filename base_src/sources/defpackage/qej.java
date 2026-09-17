package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
abstract class qej extends AtomicInteger implements qbi, qem, qyn {
    private static final long serialVersionUID = -3511336836796789179L;
    final qco b;
    qyn e;
    int f;
    qdl g;
    volatile boolean h;
    volatile boolean i;
    volatile boolean k;
    int l;
    final int c = 2;
    final int d = 2;
    final qel a = new qel(this);
    final qjo j = new qjo();

    public qej(qco qcoVar) {
        this.b = qcoVar;
    }

    @Override // defpackage.qbi, defpackage.qym
    public final void a(qyn qynVar) {
        if (qjn.e(this.e, qynVar)) {
            this.e = qynVar;
            if (qynVar instanceof qdi) {
                qdi qdiVar = (qdi) qynVar;
                int iK = qdiVar.k();
                if (iK == 1) {
                    this.l = 1;
                    this.g = qdiVar;
                    this.h = true;
                    f();
                    b();
                    return;
                }
                if (iK == 2) {
                    this.l = 2;
                    this.g = qdiVar;
                    f();
                    qynVar.gP(this.c);
                    return;
                }
            }
            this.g = new qic(this.c);
            f();
            qynVar.gP(this.c);
        }
    }

    public abstract void b();

    @Override // defpackage.qem
    public final void c() {
        this.k = false;
        b();
    }

    @Override // defpackage.qym
    public final void e(Object obj) {
        if (this.l == 2 || this.g.gU(obj)) {
            b();
        } else {
            this.e.g();
            j(new IllegalStateException("Queue full?!"));
        }
    }

    public abstract void f();

    @Override // defpackage.qym
    public final void gO() {
        this.h = true;
        b();
    }
}
