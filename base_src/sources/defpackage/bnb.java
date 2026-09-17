package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class bnb implements bnw, lij {
    public final bnl a;
    public jsj b;
    public jsj c;
    final bpu d;
    public pih e;
    public boolean f;
    public boolean g;
    public final jtj h;
    public final nle i;
    private final lar j;
    private final lap k;
    private final cvo l;
    private final ghb m;
    private final ddf n;
    private final ojc o;
    private final lco p;
    private lie q;
    private int r;
    private final lak s;

    public bnb(lar larVar, bnl bnlVar, cvo cvoVar, ddf ddfVar, ghb ghbVar, ojc ojcVar, lco lcoVar, lco lcoVar2, lvp lvpVar) {
        lap lapVar = new lap();
        this.k = lapVar;
        this.b = null;
        this.c = null;
        this.d = new bpu();
        this.f = true;
        this.s = new bna(this);
        this.j = larVar;
        this.a = bnlVar;
        this.l = cvoVar;
        this.n = ddfVar;
        this.o = ojcVar;
        this.p = lcoVar;
        this.i = new nle(lvpVar.f());
        this.h = new jtj(2);
        this.q = new jmf(3);
        this.g = false;
        this.m = ghbVar;
        lapVar.c(lcoVar2.a(this, larVar));
        this.r = 0;
    }

    private final synchronized boolean f(hkd hkdVar) {
        if (hkdVar.b()) {
            int i = this.r + 1;
            this.r = i;
            if (i > 17) {
                return true;
            }
        } else {
            this.r = 0;
        }
        return false;
    }

    @Override // defpackage.bnw
    public final synchronized void b() {
        this.f = true;
        this.m.b(true);
    }

    @Override // defpackage.bnw
    public final synchronized void c() {
        this.f = false;
        this.m.b(false);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f = false;
            this.q.close();
        }
        this.k.close();
    }

    @Override // defpackage.lij
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized void fB(ggp ggpVar) {
        boolean z;
        if (this.f) {
            ggn ggnVar = ggpVar.b;
            final int i = 1;
            final int i2 = 0;
            if (!this.o.g()) {
                boolean zB = this.d.b(ggnVar.b);
                if (ggpVar.b.e.g()) {
                    PointF pointF = ((ggm) ggpVar.b.e.c()).a;
                    if (this.l.d() == lwd.FRONT) {
                        ddf ddfVar = this.n;
                        ddg ddgVar = dde.a;
                        ddfVar.d();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ggpVar.a.b != hkd.PASSIVE_SCAN && ggpVar.b.b == hkd.PASSIVE_SCAN && this.e == null) {
                        jsj jsjVar = this.b;
                        if (jsjVar != null) {
                            jsjVar.c();
                        }
                        jsj jsjVar2 = this.c;
                        if (jsjVar2 != null) {
                            jsjVar2.c();
                        }
                        if (z) {
                            this.b = this.a.e(oih.a, 0);
                        } else {
                            this.b = this.a.e(ojc.i(pointF), (int) (ggpVar.b.f * ((Float) this.p.fA()).floatValue()));
                        }
                        this.b.b(new jsi(this) { // from class: bmx
                            public final /* synthetic */ bnb a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.jsi
                            public final void a() {
                                switch (i2) {
                                    case 0:
                                        this.a.b = null;
                                        break;
                                    default:
                                        this.a.c = null;
                                        break;
                                }
                            }
                        });
                        if (this.b != null) {
                            this.e = pih.f();
                            mip.cb(this.b.a(), this.e, this.s, this.j);
                        }
                    }
                    if (zB) {
                        pih pihVar = this.e;
                        if (pihVar != null) {
                            pihVar.o(true);
                            return;
                        }
                    } else if (this.e != null && !z) {
                        this.a.m(pointF, (int) (ggpVar.b.f * ((Float) this.p.fA()).floatValue()));
                        return;
                    }
                }
                return;
            }
            if (this.l.d() == lwd.FRONT) {
                ddf ddfVar2 = this.n;
                ddg ddgVar2 = dde.a;
                ddfVar2.d();
                return;
            }
            int iFloatValue = (ggnVar.e.g() && ((ggm) ggnVar.e.c()).b) ? (int) (ggnVar.f * ((Float) this.p.fA()).floatValue()) : ggnVar.f;
            float f = iFloatValue;
            this.h.a(f);
            boolean zF = f(ggnVar.b);
            if (ggnVar.e.g() && !zF) {
                if (this.g) {
                    return;
                }
                ggm ggmVar = (ggm) ggnVar.e.c();
                boolean z2 = ggmVar.b;
                if (ggnVar.b == hkd.PASSIVE_SCAN || z2) {
                    if (!e(ojc.i(ggmVar.a), iFloatValue)) {
                        return;
                    }
                    this.g = true;
                    if (ggmVar.b) {
                        this.h.b();
                        this.h.a(f);
                        lco lcoVarB = ((itw) this.o.c()).b(this.i.j(ggmVar.a));
                        this.q.close();
                        this.q = lcoVarB.a(new lij() { // from class: bmy
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                bnb bnbVar = this.a;
                                itz itzVar = (itz) obj;
                                synchronized (bnbVar) {
                                    if (itzVar.c() && bnbVar.g && bnbVar.f) {
                                        bnbVar.e(ojc.i(bnbVar.i.k(new PointF(itzVar.b.centerX(), itzVar.b.centerY()))), (int) bnbVar.h.a);
                                    }
                                }
                            }
                        }, lar.a);
                    }
                }
                return;
            }
            if (this.g) {
                this.q.close();
                ((itw) this.o.c()).h();
                synchronized (this) {
                    if (this.g) {
                        jsj jsjVar3 = this.b;
                        if (jsjVar3 != null) {
                            jsjVar3.c();
                        }
                        if (this.c == null) {
                            jsj jsjVarD = this.a.d();
                            this.c = jsjVarD;
                            jsjVarD.b(new jsi(this) { // from class: bmx
                                public final /* synthetic */ bnb a;

                                {
                                    this.a = this;
                                }

                                @Override // defpackage.jsi
                                public final void a() {
                                    switch (i) {
                                        case 0:
                                            this.a.b = null;
                                            break;
                                        default:
                                            this.a.c = null;
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    this.g = false;
                    this.h.b();
                }
            }
        }
    }

    public final boolean e(ojc ojcVar, int i) {
        if (this.c != null) {
            return false;
        }
        this.a.k(ojcVar, i);
        return true;
    }
}
