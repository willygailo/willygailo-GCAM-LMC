package defpackage;

import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.ui.views.ToggleUi;

/* JADX INFO: loaded from: classes.dex */
public final class ezg extends buf implements ezk {
    public static final ouj b = ouj.h("com/google/android/apps/camera/legacy/app/module/motionblur/MotionBlurMode");
    public boolean A;
    public lap B;
    public ijp C;
    public boolean D;
    public fwc E;
    private final ljf F;
    private final ghg G;
    private final ghu H;
    private final jli I;
    private final ijn J;
    private final esl K;
    private final ojc L;
    private final eym M;
    private final lda N;
    private final ddf O;
    private final ojc P;
    private final elw Q;
    private fwb S;
    private final jbq T;
    public final cvo c;
    public final bts d;
    public final lar e;
    public final iwt f;
    public final fwl g;
    public final jlb h;
    public final ifn i;
    public final fxh j;
    public final fxf k;
    public final ojc l;
    public final BottomBarController m;
    public final kas n;
    public final epj o;
    public final bne p;
    public final eyp q;
    public final dba r;
    public final fks s;
    public final eta t;
    public final huj u;
    public final lda v;
    public final fle w;
    public final hlv x;
    public final BottomBarListener y = new eyw(this);
    private final gft R = new eza(this);
    public final epi z = new ezb(this);

    public ezg(ljf ljfVar, cvo cvoVar, ghg ghgVar, fxh fxhVar, btt bttVar, ghu ghuVar, lar larVar, iwt iwtVar, ifn ifnVar, fxf fxfVar, ijn ijnVar, fwl fwlVar, jlb jlbVar, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, BottomBarController bottomBarController, kas kasVar, epj epjVar, bne bneVar, eyp eypVar, eym eymVar, dba dbaVar, fks fksVar, eta etaVar, huj hujVar, lda ldaVar, lda ldaVar2, ddf ddfVar, fle fleVar, hlv hlvVar, jbq jbqVar, elw elwVar, ojc ojcVar4) {
        this.F = ljfVar;
        this.c = cvoVar;
        this.G = ghgVar;
        this.j = fxhVar;
        this.d = bttVar;
        this.H = ghuVar;
        this.e = larVar;
        this.f = iwtVar;
        this.i = ifnVar;
        this.k = fxfVar;
        this.J = ijnVar;
        this.g = fwlVar;
        this.h = jlbVar;
        this.C = (ijp) ijnVar.a();
        this.m = bottomBarController;
        this.n = kasVar;
        this.o = epjVar;
        this.L = ojcVar3;
        this.p = bneVar;
        this.q = eypVar;
        this.M = eymVar;
        this.r = dbaVar;
        this.s = fksVar;
        this.t = etaVar;
        this.u = hujVar;
        this.v = ldaVar;
        this.N = ldaVar2;
        this.w = fleVar;
        this.x = hlvVar;
        this.T = jbqVar;
        this.Q = elwVar;
        this.P = ojcVar4;
        this.I = new ezc(this, eypVar);
        obr.aF(ojcVar.g());
        this.K = (esl) ojcVar.c();
        this.l = ojcVar2;
        this.O = ddfVar;
    }

    private final void y() {
        this.E = null;
        this.S = this.G.a(this.c, this.H, jrl.MOTION_BLUR);
        this.n.m();
        this.n.j();
        plk.af(this.S, new ezf(this), this.e);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        v(false);
    }

    @Override // defpackage.buf
    public final ojc fQ() {
        return ojc.h(this.E);
    }

    @Override // defpackage.buf
    public final void ge() {
        ovd ovdVar = ovl.a;
    }

    @Override // defpackage.buf
    public final void gf() {
        ovd ovdVar = ovl.a;
    }

    @Override // defpackage.buf
    public final void k() {
        ovd ovdVar = ovl.a;
    }

    @Override // defpackage.buf
    public final void m() {
        ovd ovdVar = ovl.a;
        this.F.e("Lasagna-ModuleStart");
        lap lapVar = new lap();
        this.B = lapVar;
        esl eslVar = this.K;
        eslVar.getClass();
        lapVar.c(eslVar.a());
        this.g.d();
        final int i = 1;
        this.N.fB(true);
        lap lapVar2 = this.B;
        final eyp eypVar = this.q;
        eypVar.e = this;
        lda ldaVar = eypVar.b;
        jlb jlbVar = eypVar.c;
        jlbVar.getClass();
        lapVar2.c(ldaVar.a(new ezv(jlbVar, 1), eypVar.d));
        lapVar2.c(new lie() { // from class: eyo
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                eypVar.e = null;
            }
        });
        y();
        v(true);
        this.m.addListener(this.y);
        this.B.c(new lie(this) { // from class: eys
            public final /* synthetic */ ezg a;

            {
                this.a = this;
            }

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                switch (i) {
                    case 0:
                        ezg ezgVar = this.a;
                        ezgVar.o.b(ezgVar.z);
                        break;
                    default:
                        ezg ezgVar2 = this.a;
                        ezgVar2.m.removeListener(ezgVar2.y);
                        break;
                }
            }
        });
        this.B.c(this.h.d(this.I));
        this.o.a(this.z);
        final int i2 = 0;
        this.B.c(new lie(this) { // from class: eys
            public final /* synthetic */ ezg a;

            {
                this.a = this;
            }

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                switch (i2) {
                    case 0:
                        ezg ezgVar = this.a;
                        ezgVar.o.b(ezgVar.z);
                        break;
                    default:
                        ezg ezgVar2 = this.a;
                        ezgVar2.m.removeListener(ezgVar2.y);
                        break;
                }
            }
        });
        this.s.e(this.Q);
        this.B.c(this.s);
        if (this.P.g()) {
            ((eqy) this.P.c()).e(this.Q);
            this.B.c((eqy) this.P.c());
        }
        final eym eymVar = this.M;
        this.B.c(eymVar.b.a(htu.d).a(new lij() { // from class: eyk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lij
            public final void fB(Object obj) {
                eym eymVar2 = eymVar;
                final ezk ezkVar = this;
                Integer num = (Integer) obj;
                if (((buf) ezkVar).a && num.intValue() != eymVar2.d) {
                    eymVar2.d = num.intValue();
                    eymVar2.a.e.n(jrl.MOTION_BLUR, new Runnable() { // from class: eyl
                        @Override // java.lang.Runnable
                        public final void run() {
                            ezkVar.u();
                        }
                    });
                }
            }
        }, eymVar.c));
        if (this.L.g()) {
            ((eso) this.L.c()).a(true);
            ((eso) this.L.c()).e();
        }
        this.w.b();
        jbq jbqVar = this.T;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: eyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ezg ezgVar = this.a;
                int iIntValue = ((Integer) ezgVar.v.fA()).intValue();
                if (ezgVar.l.g()) {
                    ((esi) ezgVar.l.c()).d(esn.a(iIntValue), 3);
                }
            }
        };
        ToggleUi toggleUi = jbqVar.b;
        if (toggleUi != null) {
            toggleUi.c.setOnClickListener(onClickListener);
            jbqVar.b.e(R.string.motion_mode_help_button_accessibility);
        }
        this.T.b();
        this.B.c(this.v.a(new lij() { // from class: eyt
            @Override // defpackage.lij
            public final void fB(Object obj) {
                ezg ezgVar = this.a;
                int iIntValue = ((Integer) obj).intValue();
                if (!ezgVar.l.g() || ezgVar.x.a) {
                    return;
                }
                esn esnVarA = esn.a(iIntValue);
                switch (esnVarA.ordinal()) {
                    case 1:
                        if (ezgVar.u.a("lasagna_edu_landscape") == 0) {
                            ((esi) ezgVar.l.c()).d(esnVarA, 2);
                            ezgVar.u.b("lasagna_edu_landscape");
                        }
                        break;
                    case 2:
                        if (ezgVar.u.a("lasagna_edu_action") == 0) {
                            ((esi) ezgVar.l.c()).d(esnVarA, 2);
                            ezgVar.u.b("lasagna_edu_action");
                        }
                        break;
                    default:
                        ((oug) ((oug) ezg.b.c().g(ovl.a, "LasagnaMode")).G((char) 1590)).r("No education for option %s", esnVarA);
                        break;
                }
            }
        }, this.e));
        this.F.f();
    }

    @Override // defpackage.buf
    public final void o() {
        ovd ovdVar = ovl.a;
        this.F.e("Lasagna-StopModule");
        if (this.S.isDone()) {
            fwc fwcVar = this.E;
            if (fwcVar != null) {
                fwcVar.close();
                this.E = null;
            }
        } else {
            this.S.cancel(true);
        }
        if (this.L.g()) {
            ((eso) this.L.c()).a(false);
            ((eso) this.L.c()).d();
        }
        this.w.a();
        this.T.a();
        this.H.d();
        this.A = false;
        this.B.close();
        this.F.f();
    }

    @Override // defpackage.buf
    public final boolean q() {
        lar.a();
        return this.q.b();
    }

    @Override // defpackage.buf
    public final boolean r() {
        return true;
    }

    @Override // defpackage.ezk
    public final void u() {
        if (this.a) {
            ovd ovdVar = ovl.a;
            y();
            if (this.O.k(ddl.X)) {
                this.n.p(false);
            }
        }
    }

    public final void v(boolean z) {
        if (this.a && !this.q.a.e()) {
            if (z) {
                this.t.b();
            } else {
                this.t.d();
            }
            this.d.g().i(z);
        }
    }

    @Override // defpackage.ezk
    public final void w() {
        ovd ovdVar = ovl.a;
        this.F.e("LasagnaModule#takePictureNow");
        fwc fwcVar = this.E;
        if (fwcVar == null) {
            ((oug) ((oug) b.c().g(ovl.a, "LasagnaMode")).G((char) 1595)).o("Not taking picture since Camera is closed.");
            return;
        }
        if (!((Boolean) fwcVar.b().fA()).booleanValue()) {
            ((oug) ((oug) b.c().g(ovl.a, "LasagnaMode")).G((char) 1594)).o("Not taking picture since the Camera is not ready to take a picture.");
            return;
        }
        v(false);
        this.g.b();
        this.t.c();
        this.w.d();
        if (esn.a(((Integer) this.v.fA()).intValue()).equals(esn.LANDSCAPE)) {
            this.w.f(127);
        }
        this.j.c(fwcVar, this.R, this.A, this.C).d(new eyu(this, 0), this.e);
        this.A = false;
        this.C = (ijp) this.J.a();
        this.F.f();
    }

    public final boolean x() {
        fwc fwcVar = this.E;
        return fwcVar != null && ((Boolean) fwcVar.b().fA()).booleanValue();
    }
}
