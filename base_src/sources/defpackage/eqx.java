package defpackage;

import android.graphics.Rect;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eqx implements esl {
    public static final ouj a = ouj.h("com/google/android/apps/camera/lasagna/MotionBlurControllerImpl");
    private final hax A;
    public final pjl d;
    public final lce e;
    public final ddf f;
    public final lvq g;
    public final int h;
    public final ljf i;
    public final hgm j;
    public final ojc k;
    public final erk l;
    public final pko n;
    public final lco o;
    public final hoh p;
    esk q;
    public int r;
    public final jtx t;
    private final lie v;
    private final lda w;
    private final Executor x;
    private final Executor y;
    private lae z;
    public final Object b = new Object();
    public final Map m = new HashMap();
    public final LasagnaCallbacks s = new equ(this);
    public final epm c = new epm();

    public eqx(Executor executor, final lce lceVar, lda ldaVar, final erk erkVar, Executor executor2, pko pkoVar, pjl pjlVar, hax haxVar, ead eadVar, ddf ddfVar, lvq lvqVar, jtx jtxVar, huf hufVar, ljf ljfVar, ojc ojcVar, hgm hgmVar, hoh hohVar, bui buiVar, byte[] bArr) {
        this.x = executor;
        this.e = lceVar;
        this.l = erkVar;
        this.y = executor2;
        this.n = pkoVar;
        this.d = pjlVar;
        this.A = haxVar;
        this.f = ddfVar;
        this.g = lvqVar;
        this.t = jtxVar;
        this.o = lcv.j(hufVar.a(htu.Y), new imc(ddfVar, 1));
        this.i = ljfVar;
        this.k = ojcVar;
        this.j = hgmVar;
        this.w = ldaVar;
        this.p = hohVar;
        this.v = new lie() { // from class: eqp
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                final eqx eqxVar = this.a;
                erk erkVar2 = erkVar;
                final lce lceVar2 = lceVar;
                ovd ovdVar = ovl.a;
                erkVar2.c("close", new Runnable() { // from class: eql
                    @Override // java.lang.Runnable
                    public final void run() {
                        eqx eqxVar2 = eqxVar;
                        lce lceVar3 = lceVar2;
                        synchronized (eqxVar2.b) {
                            lceVar3.fB(false);
                            eqxVar2.c.b();
                        }
                    }
                });
            }
        };
        this.h = eadVar.b() ? 1 : 0;
        buiVar.b.c(ldaVar.a(new eqr(this, 2), pgr.INSTANCE));
        l();
    }

    public static final lig k(lig ligVar, lvp lvpVar) {
        Rect rectH = lvpVar.h();
        return new lig(Math.max(ligVar.a, rectH.width()), Math.max(ligVar.b, rectH.height()));
    }

    private final void l() {
        Integer num;
        ddf ddfVar = this.f;
        ddfVar.getClass();
        if (ddfVar.k(ddt.f)) {
            lda ldaVar = this.w;
            ldaVar.getClass();
            num = (Integer) ldaVar.fA();
        } else {
            ddf ddfVar2 = this.f;
            ddfVar2.getClass();
            num = (Integer) ddfVar2.a(ddt.d).e(2);
        }
        this.r = num.intValue();
    }

    @Override // defpackage.esl
    public final lie a() {
        lie lieVar;
        ovd ovdVar = ovl.a;
        l();
        synchronized (this.b) {
            lae laeVar = this.z;
            final lie lieVarA = laeVar == null ? null : laeVar.a();
            if (lieVarA == null) {
                this.l.c("init", new eqs(this, 0));
                lae laeVar2 = new lae(this.v);
                this.z = laeVar2;
                lieVarA = laeVar2.a();
            }
            final lie lieVarA2 = this.o.a(new eqr(this, 1), this.x);
            final lie lieVarA3 = this.p.c().a(new eqr(this, 0), this.x);
            lieVarA.getClass();
            lieVar = new lie() { // from class: eqq
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    lie lieVar2 = lieVarA2;
                    lie lieVar3 = lieVarA3;
                    lie lieVar4 = lieVarA;
                    ouj oujVar = eqx.a;
                    ovd ovdVar2 = ovl.a;
                    lieVar2.close();
                    lieVar3.close();
                    lieVar4.close();
                }
            };
        }
        return lieVar;
    }

    @Override // defpackage.esl
    public final lie b(gog gogVar, final pih pihVar) {
        esk eskVar;
        l();
        int i = gogVar.b.h().a;
        synchronized (this) {
            esk eskVar2 = this.q;
            if (eskVar2 != null) {
                eskVar2.b(i).d(new eqo(pihVar, 0), this.y);
                eskVar = this.q;
            } else {
                eskVar = null;
            }
        }
        synchronized (this.b) {
            ovd ovdVar = ovl.a;
            lae laeVar = this.z;
            lie lieVarA = laeVar == null ? null : laeVar.a();
            if (lieVarA == null) {
                pihVar.o(false);
                return null;
            }
            Map map = this.m;
            Integer numValueOf = Integer.valueOf(i);
            hax haxVar = this.A;
            epm epmVar = this.c;
            pih pihVarF = pih.f();
            pjl pjlVar = (pjl) haxVar.c.get();
            pjlVar.getClass();
            erk erkVar = (erk) haxVar.b.get();
            erkVar.getClass();
            Executor executor = (Executor) haxVar.d.get();
            executor.getClass();
            ljf ljfVar = (ljf) haxVar.a.get();
            ljfVar.getClass();
            epmVar.getClass();
            final lie lieVar = lieVarA;
            map.put(numValueOf, new erp(pjlVar, erkVar, executor, ljfVar, gogVar, epmVar, eskVar, pihVarF, pihVar));
            this.y.execute(new eqt(this, i, 0));
            return new lie() { // from class: eqj
                @Override // defpackage.lie, java.lang.AutoCloseable
                public final void close() {
                    lie lieVar2 = lieVar;
                    pih pihVar2 = pihVar;
                    ouj oujVar = eqx.a;
                    ovd ovdVar2 = ovl.a;
                    lieVar2.close();
                    pihVar2.o(true);
                }
            };
        }
    }

    @Override // defpackage.esl
    public final pht c(edd eddVar, esn esnVar, pll pllVar, Runnable runnable, esh eshVar) {
        int i;
        ovd ovdVar = ovl.a;
        esnVar.name();
        synchronized (this.b) {
            lae laeVar = this.z;
            if (laeVar != null) {
                synchronized (laeVar.d) {
                    i = laeVar.b;
                }
                if (i > 0) {
                    pih pihVarF = pih.f();
                    eddVar.a();
                    eddVar.c.d.a(u, 0.0f);
                    int i2 = eddVar.c.b.h().a;
                    int iE = this.l.e(i2, "processZsl", new eqw(this, i2, eddVar, esnVar, pihVarF, runnable, eshVar, pllVar));
                    if (iE != 1) {
                        ((oug) ((oug) a.c().g(ovl.a, "LasagnaController")).G(1401)).o("Couldn't post processZSL");
                        runnable.run();
                        StringBuilder sb = new StringBuilder(47);
                        sb.append("Error enqueuing shot processing for ");
                        sb.append(i2);
                        Throwable illegalStateException = new IllegalStateException(sb.toString());
                        if (iE == 3) {
                            illegalStateException = new dma(illegalStateException);
                        }
                        pihVarF.a(illegalStateException);
                    }
                    return pihVarF;
                }
            }
            return plk.U(new llv("CAM_MotionBlurController not initialized, but processShot was called."));
        }
    }

    @Override // defpackage.esl
    public final void d(edd eddVar) {
        ouj oujVar = a;
        ((oug) ((oug) oujVar.c().g(ovl.a, "LasagnaController")).G(1402)).p("Aborting shot %s", eddVar.a());
        this.x.execute(new eqs(this, 1));
        erp erpVar = (erp) this.m.get(Integer.valueOf(eddVar.a()));
        if (erpVar != null) {
            erpVar.c();
            erpVar.d(true);
            fjx fjxVar = erpVar.p;
            poy poyVar = fjxVar.a;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pdb pdbVar = (pdb) poyVar.b;
            pdb pdbVar2 = pdb.v;
            pdbVar.a |= 2;
            pdbVar.c = false;
            poy poyVar2 = fjxVar.a;
            if (poyVar2.c) {
                poyVar2.m();
                poyVar2.c = false;
            }
            pdb pdbVar3 = (pdb) poyVar2.b;
            pdbVar3.a |= 16384;
            pdbVar3.o = true;
            ((iik) erpVar.i.k()).t = erpVar.p.k();
        } else {
            ((oug) ((oug) oujVar.c().g(ovl.a, "LasagnaController")).G((char) 1403)).r("Couldn't find a session for shot %s", eddVar);
        }
        this.l.a(eddVar.a(), true);
    }

    @Override // defpackage.esl
    public final void e(final mad madVar, final FrameMetadata frameMetadata) {
        if (madVar == null) {
            ((oug) ((oug) a.c().g(ovl.a, "LasagnaController")).G((char) 1417)).o("Viewfinder image not found.");
        } else if (!((Boolean) this.e.d).booleanValue() || this.r == 2) {
            madVar.close();
        } else {
            this.y.execute(new Runnable() { // from class: eqm
                @Override // java.lang.Runnable
                public final void run() {
                    eqx eqxVar = this.a;
                    mad madVar2 = madVar;
                    FrameMetadata frameMetadata2 = frameMetadata;
                    YuvWriteView yuvWriteViewC = eqxVar.n.c(madVar2);
                    eqn eqnVar = new eqn(madVar2, 0);
                    epm epmVar = eqxVar.c;
                    synchronized (epmVar.b) {
                        long j = epmVar.d;
                        if (j != 0) {
                            epmVar.c.addViewfinderFrame(j, YuvWriteView.e(yuvWriteViewC), FrameMetadata.b(frameMetadata2), eqnVar);
                        } else {
                            eqnVar.run();
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.esl
    public final synchronized void f(esk eskVar) {
        if (this.q == eskVar) {
            ovd ovdVar = ovl.a;
            this.q = null;
        }
    }

    public final void g(int i) {
        ((oug) ((oug) a.c().g(ovl.a, "LasagnaController")).G(1419)).p("Shot didn't start, removing %s.", i);
        this.e.fB(true);
        this.m.remove(Integer.valueOf(i));
    }

    @Override // defpackage.esl
    public final void h(int i, long j) {
        erp erpVar = (erp) this.m.get(Integer.valueOf(i));
        if (erpVar != null) {
            erpVar.g.o(Long.valueOf(j));
        } else {
            ((oug) ((oug) a.c().g(ovl.a, "LasagnaController")).G(1420)).p("Can't set the base frame timestamp, shot %s already aborted", i);
        }
    }

    public final void i(final int i, final boolean z) {
        this.l.c("setOptions", new Runnable() { // from class: eqk
            @Override // java.lang.Runnable
            public final void run() {
                ljf ljfVar;
                eqx eqxVar = this.a;
                int i2 = i;
                boolean z2 = z;
                if (!((Boolean) eqxVar.e.d).booleanValue()) {
                    ((oug) ((oug) eqx.a.b().g(ovl.a, "LasagnaController")).G((char) 1411)).o("Proccesor not available to set options!");
                    return;
                }
                try {
                    try {
                        eqxVar.e.fB(false);
                        eqxVar.i.e("Lasagna#setOptions");
                        float fIntValue = ((Integer) eqxVar.f.a(ddt.b).e(7)).intValue();
                        int iIntValue = ((Integer) eqxVar.f.a(ddt.c).e(16)).intValue();
                        epm epmVar = eqxVar.c;
                        eqxVar.t.g();
                        if (!epmVar.h(i2, fIntValue, iIntValue, z2)) {
                            throw new IllegalStateException("Processor not initialized!");
                        }
                        ovd ovdVar = ovl.a;
                        ljfVar = eqxVar.i;
                        ljfVar.f();
                        eqxVar.e.fB(true);
                    } catch (IllegalStateException e) {
                        ((oug) ((oug) ((oug) eqx.a.b().g(ovl.a, "LasagnaController")).h(e)).G(1410)).o("Error setting options.");
                        ljfVar = eqxVar.i;
                    }
                } catch (Throwable th) {
                    eqxVar.i.f();
                    eqxVar.e.fB(true);
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.esl
    public final synchronized void j(esk eskVar) {
        ovd ovdVar = ovl.a;
        this.q = eskVar;
    }
}
