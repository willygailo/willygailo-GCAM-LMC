package defpackage;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class fzn extends buf {
    private static final ouj m = ouj.h("com/google/android/apps/camera/modules/video/OneVideoModule");
    public final Object b = new Object();
    public final qkg c;
    public final qkg d;
    public final qkg e;
    public final lar f;
    public final ixx g;
    public final ojc h;
    public final qkg i;
    public final cka j;
    public final kas k;
    public jrl l;
    private final lap n;
    private buf o;

    public fzn(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, ixx ixxVar, lar larVar, ojc ojcVar, qkg qkgVar4, cqq cqqVar, cka ckaVar, lda ldaVar, kas kasVar) {
        this.c = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.f = larVar;
        this.g = ixxVar;
        this.h = ojcVar;
        this.i = qkgVar4;
        this.j = ckaVar;
        this.k = kasVar;
        lap lapVar = new lap();
        this.n = lapVar;
        this.l = (jrl) ldaVar.fA();
        jrl jrlVar = jrl.UNINITIALIZED;
        switch (this.l.ordinal()) {
            case 2:
                this.o = (buf) qkgVar.get();
                break;
            case 5:
                this.o = (buf) qkgVar2.get();
                break;
            case 13:
                this.o = (buf) qkgVar3.get();
                break;
            default:
                ((oug) ((oug) m.c()).G((char) 2008)).r("Fall back to default mode since the initial mode is unsupported: %s", ldaVar.fA());
                this.o = (buf) qkgVar.get();
                this.l = jrl.VIDEO;
                break;
        }
        if (ojcVar.g()) {
            lapVar.c(((ctm) ojcVar.c()).m(new fzk(this)));
        }
        lapVar.c(cqqVar.b(new cqp() { // from class: fzj
            @Override // defpackage.cqp
            public final void a(cqj cqjVar, cqj cqjVar2, boolean z) {
                fzn fznVar = this.a;
                if (!fznVar.h.g() || ((cjr) ((lce) fznVar.j.a().f).d).equals(cjr.RECORDING_SESSION_ACTIVE)) {
                    return;
                }
                if (cqjVar2.equals(cqj.DEFAULT)) {
                    ((ctm) fznVar.h.c()).h(true);
                    fznVar.k.f(true);
                } else {
                    ((ctm) fznVar.h.c()).d(true);
                    fznVar.k.F();
                }
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    private final boolean v() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.l.equals(jrl.VIDEO) && (this.o instanceof fzx)) {
                z = true;
            } else if ((this.l.equals(jrl.TIME_LAPSE) && (this.o instanceof ioa)) || (this.l.equals(jrl.SLOW_MOTION) && (this.o instanceof fzh))) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.buf
    public final String c() {
        String strC;
        synchronized (this.b) {
            strC = this.o.c();
        }
        return strC;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            this.o.close();
        }
        this.n.close();
    }

    @Override // defpackage.buf
    public final void d(awl awlVar) {
        synchronized (this.b) {
            this.o.d(awlVar);
        }
    }

    @Override // defpackage.buf
    public final void e(Configuration configuration) {
        synchronized (this.b) {
            this.o.e(configuration);
        }
    }

    @Override // defpackage.buf
    public final void gc(int i) {
        synchronized (this.b) {
            this.o.gc(i);
        }
    }

    @Override // defpackage.buf
    public final void gd(boolean z) {
        synchronized (this.b) {
            this.o.gd(z);
        }
    }

    @Override // defpackage.buf
    public final void ge() {
        synchronized (this.b) {
            if (v()) {
                this.o.ge();
            }
        }
    }

    @Override // defpackage.buf
    public final void gf() {
        synchronized (this.b) {
            this.o.gg();
        }
    }

    @Override // defpackage.buf
    public final void k() {
        synchronized (this.b) {
            if (v()) {
                this.o.l();
            }
        }
    }

    @Override // defpackage.buf
    public final void m() {
        synchronized (this.b) {
            if (v()) {
                this.o.n();
            }
        }
    }

    @Override // defpackage.buf
    public final void o() {
        synchronized (this.b) {
            this.o.p();
        }
    }

    @Override // defpackage.buf
    public final boolean q() {
        boolean zQ;
        synchronized (this.b) {
            zQ = this.o.q();
        }
        return zQ;
    }

    @Override // defpackage.buf
    public final boolean s() {
        boolean zS;
        synchronized (this.b) {
            zS = this.o.s();
        }
        return zS;
    }

    public final void u(buf bufVar, jrl jrlVar) {
        synchronized (this.b) {
            gf();
            o();
            this.o = bufVar;
            this.l = jrlVar;
            ge();
            m();
            k();
        }
    }
}
