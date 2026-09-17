package defpackage;

import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fbb extends buf implements jad {
    public static final ouj b = ouj.h("com/google/android/apps/camera/legacy/app/module/portrait/PortraitModule");
    public final elw A;
    public final ojc B;
    public final fle C;
    public final eam D;
    public final fks E;
    public final fku F;
    public final ojc G;
    public final hbq H;
    public boolean J;
    public lap K;
    public final hgf L;
    public fws M;
    public lco N;
    public int O;
    public ijp P;
    public int Q;
    public final List R;
    public fwc V;
    private final ljf W;
    private final ghg X;
    private final fxh Y;
    private final hgi Z;
    private final lda aa;
    private final iyb ab;
    private final dkm ac;
    private final bqc ad;
    private final ijn ae;
    private final imt af;
    private final imx ag;
    private final huf ah;
    private final lij ai;
    private fwb aj;
    private final hll ak;
    private final jbe am;
    private final lwf an;
    private final emb ao;
    public final cvo c;
    public final bts d;
    public final lar e;
    public final ghu f;
    public final jli g;
    public final ifn h;
    public final bne i;
    public final fxf j;
    public final epj k;
    public final jhd l;
    public final iwt m;
    public final gvb n;
    public final AccessibilityManager o;
    public final dnj p;
    public final hgc q;
    public final kas r;
    public final ddf s;
    public final fwl u;
    public final BottomBarController v;
    public final jlb w;
    public final jac x;
    public final lda y;
    public final jfn z;
    public final jtj t = new jtj(5);
    public final lce I = new lce(false);
    public final BottomBarListener S = new fat(this);
    private final gft al = new fav(this);
    public final lij T = new fap(this, 1);
    public final epi U = new faw(this);

    public fbb(ljf ljfVar, cvo cvoVar, ghg ghgVar, btt bttVar, ghu ghuVar, lar larVar, fxh fxhVar, ifn ifnVar, ojc ojcVar, hgf hgfVar, bne bneVar, epj epjVar, jhd jhdVar, iwt iwtVar, gvb gvbVar, AccessibilityManager accessibilityManager, dnj dnjVar, hgc hgcVar, kas kasVar, jfn jfnVar, lda ldaVar, lda ldaVar2, final jns jnsVar, fwl fwlVar, jac jacVar, iyb iybVar, fxf fxfVar, lwf lwfVar, ddf ddfVar, emb embVar, dkm dkmVar, BottomBarController bottomBarController, jlb jlbVar, bqc bqcVar, ijn ijnVar, imt imtVar, imx imxVar, elw elwVar, ojc ojcVar2, eam eamVar, fle fleVar, fks fksVar, fku fkuVar, huf hufVar, jbe jbeVar, hll hllVar, ojc ojcVar3, hbq hbqVar, byte[] bArr, byte[] bArr2) {
        this.W = ljfVar;
        this.X = ghgVar;
        this.c = cvoVar;
        this.d = bttVar;
        this.f = ghuVar;
        this.e = larVar;
        this.Y = fxhVar;
        this.h = ifnVar;
        this.L = hgfVar;
        this.i = bneVar;
        this.k = epjVar;
        this.l = jhdVar;
        this.m = iwtVar;
        this.n = gvbVar;
        this.o = accessibilityManager;
        this.p = dnjVar;
        this.q = hgcVar;
        this.r = kasVar;
        this.z = jfnVar;
        this.aa = ldaVar;
        this.y = ldaVar2;
        this.u = fwlVar;
        this.x = jacVar;
        this.ab = iybVar;
        this.an = lwfVar;
        this.s = ddfVar;
        this.ao = embVar;
        this.ac = dkmVar;
        this.v = bottomBarController;
        this.w = jlbVar;
        this.j = fxfVar;
        this.ad = bqcVar;
        this.ae = ijnVar;
        this.P = (ijp) ijnVar.a();
        this.af = imtVar;
        this.ag = imxVar;
        this.A = elwVar;
        this.B = ojcVar2;
        this.D = eamVar;
        this.C = fleVar;
        this.ah = hufVar;
        this.E = fksVar;
        this.F = fkuVar;
        this.G = ojcVar3;
        this.ak = hllVar;
        this.am = jbeVar;
        this.H = hbqVar;
        obr.aF(ojcVar.g());
        this.Z = (hgi) ojcVar.c();
        this.Q = ((Integer) hufVar.c(htu.d)).intValue();
        this.ai = new lij() { // from class: faq
            @Override // defpackage.lij
            public final void fB(Object obj) {
                fbb fbbVar = this.a;
                jns jnsVar2 = jnsVar;
                Integer num = (Integer) obj;
                if (fbbVar.a && num.intValue() != fbbVar.Q) {
                    fbbVar.Q = num.intValue();
                    jnsVar2.e.n(jrl.PORTRAIT, new far(fbbVar, 1));
                }
            }
        };
        this.g = new fax(this, eamVar);
        this.R = new ArrayList();
    }

    public final void A() {
        this.W.e("PortraitModule#takePictureNow");
        fwc fwcVar = this.V;
        if (fwcVar == null) {
            ((oug) ((oug) b.c()).G((char) 1611)).o("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) fwcVar.b().fA()).booleanValue()) {
            ((oug) ((oug) b.c()).G((char) 1610)).o("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        v(false);
        this.u.b();
        this.C.d();
        this.z.l(false);
        this.d.g().e();
        this.r.g();
        if (this.B.g()) {
            ((bys) this.B.c()).b();
        }
        this.D.j(true);
        if (((Boolean) this.D.a().fA()).booleanValue()) {
            this.h.b(R.raw.longexposure_start);
            this.r.v(false);
            this.w.X();
            this.C.e();
        }
        this.am.a();
        final pht phtVarC = this.Y.c(fwcVar, this.al, this.J, this.P);
        synchronized (this.R) {
            this.R.add(phtVarC);
        }
        phtVarC.d(new Runnable() { // from class: fan
            @Override // java.lang.Runnable
            public final void run() {
                fbb fbbVar = this.a;
                pht phtVar = phtVarC;
                synchronized (fbbVar.R) {
                    fbbVar.R.remove(phtVar);
                }
                fwc fwcVar2 = fbbVar.V;
                if (fwcVar2 != null) {
                    fbbVar.v(((Boolean) fwcVar2.b().fA()).booleanValue());
                }
                fbbVar.j.a();
                fbbVar.u.c();
                fbbVar.C.c();
                fbbVar.r.v(true);
                fbbVar.r.h();
                fbbVar.D.j(false);
                fbbVar.z.l(true);
                fbbVar.d.g().f();
                if (fbbVar.B.g()) {
                    ((bys) fbbVar.B.c()).h();
                }
                if (fbbVar.G.g()) {
                    ily ilyVar = (ily) fbbVar.G.c();
                    fbbVar.d.l();
                    fbbVar.H.l();
                    ilyVar.a();
                }
            }
        }, this.e);
        this.P = (ijp) this.ae.a();
        this.W.f();
    }

    @Override // defpackage.jad
    public final void C(int i) {
        if (i == 1) {
            this.h.c(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.h.c(R.raw.timer_increment);
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        v(false);
    }

    @Override // defpackage.buf
    public final void e(Configuration configuration) {
        this.Z.d();
    }

    @Override // defpackage.buf
    public final ojc fQ() {
        return ojc.h(this.V);
    }

    @Override // defpackage.buf
    public final void ge() {
        this.Z.c();
    }

    @Override // defpackage.buf
    public final void gf() {
        u();
    }

    @Override // defpackage.buf
    public final void k() {
    }

    @Override // defpackage.buf
    public final void m() {
        final int i = 1;
        this.aa.fB(true);
        lap lapVar = new lap();
        this.K = lapVar;
        lapVar.c(this.af.d(this.ag));
        this.K.c(this.ag.a.a(new fap(this, 2), this.e));
        this.K.c(this.af.d(this.ak));
        this.W.e("PortraitModule#start");
        w();
        final int i2 = 0;
        this.D.i(this.s.k(ddm.ab) && this.s.k(ddm.aa));
        v(true);
        this.v.addListener(this.S);
        this.K.c(new lie(this) { // from class: fao
            public final /* synthetic */ fbb a;

            {
                this.a = this;
            }

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                switch (i) {
                    case 0:
                        fbb fbbVar = this.a;
                        fbbVar.k.b(fbbVar.U);
                        break;
                    default:
                        fbb fbbVar2 = this.a;
                        fbbVar2.v.removeListener(fbbVar2.S);
                        break;
                }
            }
        });
        this.K.c(this.w.d(this.g));
        this.K.c(this.y.a(new fap(this, i2), this.e));
        this.K.c(this.ah.a(htu.d).a(this.ai, this.e));
        enl enlVar = ((bvk) this.d.g()).B;
        this.u.d();
        this.K.c(this.L);
        this.k.a(this.U);
        this.K.c(new lie(this) { // from class: fao
            public final /* synthetic */ fbb a;

            {
                this.a = this;
            }

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                switch (i2) {
                    case 0:
                        fbb fbbVar = this.a;
                        fbbVar.k.b(fbbVar.U);
                        break;
                    default:
                        fbb fbbVar2 = this.a;
                        fbbVar2.v.removeListener(fbbVar2.S);
                        break;
                }
            }
        });
        this.C.b();
        if (this.s.k(ddm.ab)) {
            this.E.e(this.A);
            this.K.c(this.E);
            this.K.c(this.D.a().a(new fap(this, 3), this.e));
        }
        if (bqe.v(this.ao)) {
            this.ad.a();
            x(bqe.b(this.ao.a()));
            bqe.f(this.ao.a());
        }
        this.j.b();
        this.j.a();
        this.W.f();
    }

    @Override // defpackage.buf
    public final void o() {
        if (this.aj.isDone()) {
            fwc fwcVar = this.V;
            if (fwcVar != null) {
                fwcVar.close();
                this.V = null;
            }
        } else {
            this.aj.cancel(true);
        }
        this.f.d();
        this.l.a();
        this.C.a();
        enl enlVar = ((bvk) this.d.g()).B;
        this.O = 0;
        this.r.o();
        this.K.close();
        this.D.i(false);
    }

    @Override // defpackage.buf
    public final boolean q() {
        lar.a();
        if (!this.x.e()) {
            return false;
        }
        this.ab.b();
        this.x.a();
        return true;
    }

    @Override // defpackage.buf
    public final boolean r() {
        return true;
    }

    @Override // defpackage.buf
    public final boolean s() {
        return true;
    }

    public final void u() {
        if (this.x.e()) {
            this.ab.b();
            this.x.a();
        }
    }

    public final void v(boolean z) {
        if (this.a) {
            this.d.g().i(z);
            this.d.g().k(z);
        }
    }

    public final void w() {
        lvs lvsVarB = this.ac.b(this.an, this.s, this.c.d());
        lvsVarB.getClass();
        ghx ghxVarF = this.an.f(lvsVarB);
        if (this.s.k(ddl.V) || (this.c.j() && ghxVarF.C())) {
            this.r.h();
        }
        this.r.m();
        this.r.u();
        hgf hgfVar = this.L;
        if (hgfVar != null) {
            hgfVar.a();
        }
        this.l.a();
        this.V = null;
        fwb fwbVar = this.aj;
        if (fwbVar != null && !fwbVar.isDone()) {
            this.aj.cancel(true);
        }
        fwb fwbVarA = this.X.a(this.c, this.f, jrl.PORTRAIT);
        this.aj = fwbVarA;
        plk.af(fwbVarA, new fba(this), this.e);
    }

    public final void x(int i) {
        jac jacVar = this.x;
        jacVar.h = this;
        jacVar.d(i);
    }

    @Override // defpackage.jad
    public final void y() {
        if (this.a) {
            this.ab.b();
            A();
        }
    }

    @Override // defpackage.jad
    public final void z() {
        if (this.a) {
            this.ab.a();
            this.h.c(R.raw.timer_start);
        }
    }
}
