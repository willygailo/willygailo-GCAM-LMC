package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class exi extends buf implements jad, gft {
    public static final ouj b = ouj.h("com/google/android/apps/camera/legacy/app/module/capture/CaptureModule");
    public final fwl A;
    public final dnj B;
    public final AccessibilityManager C;
    public fvx D;
    public pht E;
    public gfu F;
    public fws G;
    public ijp H;
    public final pht I;
    public final lda J;
    public final lap M;
    public final bzg N;
    public final iwm O;
    public final fwg P;
    public lap Q;
    public final ojc R;
    public final iwt S;
    public final fjs T;
    public final gtg V;
    public final ddf W;
    public final fks X;
    public final lce Y;
    public int Z;
    private final iyb aA;
    private final ivj aD;
    private final jng aE;
    private final fku aF;
    private final epj aG;
    private final lij aI;
    private final jgu aJ;
    private final dah aK;
    private final dba aL;
    private final jbe aN;
    private final lwf aO;
    private final emb aP;
    private final jdy aR;
    public final eam aa;
    public final bne ab;
    public final elw ac;
    public final fle ad;
    public final ojc ae;
    public final hbq af;
    public final bqg ag;
    public final jrh ah;
    public ghx ai;
    public final hjn aj;
    public final cwc ak;
    public final gzf al;
    private final ghu am;
    private final Resources an;
    private final ijn ao;
    private final jje ap;
    private final BottomBarController aq;
    private final BottomBarListener ar;
    private final fxh as;
    private final dkm at;
    private final bqc au;
    private final ijn av;
    private final fwi aw;
    private final hpe ax;
    private fwm ay;
    private final huf az;
    public final gqy c;
    public final lar d;
    public final gvb e;
    public final ljf f;
    public final epl g;
    public final jlb h;
    public final jli i;
    public final kas j;
    public final dmh k;
    public final jak l;
    public final cvo m;
    public final jhd n;
    public final jhh o;
    public final fwk p;
    public final epk q;
    public final fxf r;
    public final jfn s;
    public final ojc t;
    public final ojc u;
    public final jac v;
    public final pyn w;
    public final ojc x;
    public final btt y;
    public final ifn z;
    private boolean aB = false;
    public boolean K = false;
    public boolean L = false;
    private lap aC = new lap();
    private final kfm aQ = new kfm((byte[]) null);
    public final lce U = new lce(true);
    private final epi aH = new ewz(this);
    private final jio aM = new jij();

    public exi(Context context, btt bttVar, bqg bqgVar, lar larVar, ljf ljfVar, ijn ijnVar, lwf lwfVar, gvb gvbVar, fwi fwiVar, ifn ifnVar, ghu ghuVar, lda ldaVar, gqy gqyVar, huf hufVar, ivj ivjVar, iwt iwtVar, epj epjVar, final jns jnsVar, jng jngVar, AccessibilityManager accessibilityManager, dnj dnjVar, iyb iybVar, fle fleVar, pht phtVar, final qkg qkgVar, emb embVar, jje jjeVar, BottomBarController bottomBarController, jlb jlbVar, kas kasVar, dmh dmhVar, gtg gtgVar, jak jakVar, hjn hjnVar, fjs fjsVar, bne bneVar, cvo cvoVar, jhd jhdVar, jhh jhhVar, fxh fxhVar, fwk fwkVar, fxf fxfVar, ddf ddfVar, fwl fwlVar, jac jacVar, jfn jfnVar, jrh jrhVar, ojc ojcVar, dkm dkmVar, hpe hpeVar, bqc bqcVar, iwm iwmVar, bzg bzgVar, jdy jdyVar, ijn ijnVar2, pyn pynVar, imt imtVar, efu efuVar, imx imxVar, ojc ojcVar2, elw elwVar, ojc ojcVar3, eam eamVar, fks fksVar, fku fkuVar, gzf gzfVar, cwc cwcVar, jbe jbeVar, hll hllVar, ojc ojcVar4, dah dahVar, hbq hbqVar, dba dbaVar, AtomicBoolean atomicBoolean, ojc ojcVar5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.y = bttVar;
        lwfVar.getClass();
        this.aO = lwfVar;
        this.aw = fwiVar;
        this.ag = bqgVar;
        this.d = larVar;
        Resources resources = context.getResources();
        this.an = resources;
        this.f = ljfVar;
        this.ao = ijnVar;
        this.e = gvbVar;
        this.z = ifnVar;
        this.ad = fleVar;
        this.am = ghuVar;
        this.J = ldaVar;
        this.az = hufVar;
        this.c = gqyVar;
        this.aD = ivjVar;
        this.S = iwtVar;
        this.aG = epjVar;
        this.aE = jngVar;
        this.C = accessibilityManager;
        this.B = dnjVar;
        this.aA = iybVar;
        this.I = phtVar;
        this.aP = embVar;
        this.ap = jjeVar;
        this.aq = bottomBarController;
        this.h = jlbVar;
        this.j = kasVar;
        this.k = dmhVar;
        this.l = jakVar;
        this.V = gtgVar;
        this.aj = hjnVar;
        this.T = fjsVar;
        this.ab = bneVar;
        this.m = cvoVar;
        this.n = jhdVar;
        this.o = jhhVar;
        this.as = fxhVar;
        this.p = fwkVar;
        this.r = fxfVar;
        this.ae = ojcVar4;
        this.af = hbqVar;
        this.Y = new lce(false);
        lap lapVar = new lap();
        this.M = lapVar;
        fwg fwgVar = new fwg();
        this.P = fwgVar;
        this.Q = new lap();
        this.W = ddfVar;
        this.A = fwlVar;
        this.v = jacVar;
        this.s = jfnVar;
        this.u = ojcVar;
        this.at = dkmVar;
        this.ax = hpeVar;
        this.au = bqcVar;
        this.O = iwmVar;
        this.N = bzgVar;
        this.aR = jdyVar;
        this.av = ijnVar2;
        this.H = (ijp) ijnVar2.a();
        this.w = pynVar;
        this.t = ojcVar2;
        this.ac = elwVar;
        this.x = ojcVar3;
        this.aa = eamVar;
        this.X = fksVar;
        this.aF = fkuVar;
        this.al = gzfVar;
        this.ak = cwcVar;
        this.aN = jbeVar;
        this.aK = dahVar;
        this.aL = dbaVar;
        this.R = ojcVar5;
        this.Z = ((Integer) hufVar.c(htu.d)).intValue();
        this.aI = new lij() { // from class: ewn
            @Override // defpackage.lij
            public final void fB(Object obj) {
                exi exiVar = this.a;
                jns jnsVar2 = jnsVar;
                Integer num = (Integer) obj;
                if (exiVar.a && num.intValue() != exiVar.Z) {
                    exiVar.Z = num.intValue();
                    jnsVar2.e.n(jrl.PHOTO, new ewq(exiVar, 1));
                }
            }
        };
        lapVar.c(fwgVar);
        lapVar.c(fwgVar.a(new ewm(this, 3), larVar));
        fwgVar.b.execute(new fwf(fwgVar, ((exm) fwkVar).b, 0));
        jgv jgvVar = new jgv();
        jgvVar.e = resources.getString(R.string.gcam_HDR_plus_enhanced_processing);
        jgvVar.f = context;
        jgvVar.a = true;
        jgvVar.i = 9;
        jgvVar.h = ddfVar.k(ddl.ay);
        this.aJ = jgvVar.a();
        this.ar = new exb(this, jrhVar, cvoVar);
        this.ah = jrhVar;
        exd exdVar = new exd(this, fjsVar, fwkVar, jrhVar, jlbVar, atomicBoolean);
        this.q = exdVar;
        this.i = new exf(this);
        this.g = new epl(exdVar);
        lapVar.c(imtVar.d(efuVar));
        lapVar.c(imtVar.d(imxVar));
        lapVar.c(imtVar.d(hllVar));
        mip.bZ(phtVar, new lht() { // from class: eww
            @Override // defpackage.lht
            public final void a(Object obj) {
                exi exiVar = this.a;
                qkg qkgVar2 = qkgVar;
                bro broVar = (bro) obj;
                if (exiVar.M.a()) {
                    return;
                }
                broVar.getClass();
                broVar.j((bsg) qkgVar2.get());
                exiVar.M.c(new ewy(broVar, 1));
            }
        });
    }

    private final void M(boolean z) {
        this.A.a();
        this.X.f();
        this.aK.a();
        if (!this.N.e()) {
            this.y.g().n();
        }
        O(false);
        this.h.r();
        if (z || !((Boolean) this.aa.a().fA()).booleanValue()) {
            return;
        }
        this.h.p();
    }

    private final void N() {
        this.d.execute(new ewq(this, 0));
    }

    private final void O(boolean z) {
        if (this.c.fA() == gqx.ON && z) {
            this.ac.g(this.aJ);
        } else {
            this.ac.g(this.aJ);
        }
    }

    private final void P() {
        gfu gfuVar;
        obr.aQ(this.a);
        ghu ghuVar = this.am;
        lvs lvsVarB = this.at.b(this.aO, this.W, this.m.d());
        lvsVarB.getClass();
        this.j.m();
        fwm fwmVarA = ghuVar.a(this.aw.a(lvsVarB, jrl.PHOTO));
        obr.aQ(this.a);
        fwm fwmVar = this.ay;
        if (fwmVar == null || !fwmVar.b.equals(fwmVarA.b) || this.E == null || this.Q.a() || ((gfuVar = this.F) != null && gfuVar.g())) {
            this.f.e("CaptureModule#startCamera");
            this.y.g().c();
            this.n.a();
            this.Q.close();
            this.Q = new lap();
            fvx fvxVar = fwmVarA.a;
            this.D = fvxVar;
            this.ai = this.aO.f(fvxVar.a);
            N();
            this.ai.getClass();
            this.y.g().getClass();
            lap lapVar = this.Q;
            bws bwsVar = new bws();
            lapVar.c(bwsVar);
            pht phtVarC = this.am.c(fwmVarA, plk.V(this.aE));
            plk.af(phtVarC, new exh(this, bwsVar, lapVar), this.d);
            this.E = phtVarC;
            this.ay = fwmVarA;
            this.f.f();
        } else {
            N();
            x();
        }
        this.j.j();
        if (bqe.t(this.aP.a())) {
            this.j.p(true);
            this.j.h();
        } else if (bqe.m(this.aP.a())) {
            this.j.p(false);
        }
    }

    @Override // defpackage.gft
    public final void A() {
        M(false);
    }

    @Override // defpackage.gft
    public final void B() {
        this.d.execute(new ewq(this, 3));
    }

    @Override // defpackage.jad
    public final void C(int i) {
        if (i == 1) {
            this.z.c(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.z.c(R.raw.timer_increment);
        }
    }

    @Override // defpackage.gft
    public final void D(float f) {
        F(f, -1L);
    }

    @Override // defpackage.gft
    public final void E(float f, int i) {
    }

    @Override // defpackage.gft
    public final void F(float f, long j) {
        if (((Boolean) this.aa.a().fA()).booleanValue()) {
            if (this.W.k(dcv.p)) {
                if (f == 0.0f) {
                    this.aL.f(new daz() { // from class: ewr
                        @Override // defpackage.daz
                        public final void a() {
                            this.a.X.b(0.0f);
                        }
                    });
                }
                if (this.aL.k()) {
                    this.X.b(f);
                }
            } else {
                this.X.b(f);
            }
            this.h.E((int) (100.0f * f), j, false);
            if (f == 1.0f) {
                this.aF.a(j);
                this.h.p();
                this.aL.e();
            }
        } else {
            this.A.f((int) (100.0f * f));
            if (f == 0.0f) {
                if (!this.N.e()) {
                    this.y.g().m();
                }
                O(true);
            } else if (f == 1.0f) {
                if (!this.N.e()) {
                    this.y.g().n();
                }
                O(false);
            }
        }
        if (f == 1.0f) {
            this.z.b(R.raw.camera_shutter);
        }
    }

    public final void G(boolean z) {
        if (z) {
            v();
        }
        if (this.a) {
            P();
        }
    }

    public final void H(boolean z) {
        if (this.a) {
            this.y.g().i(z);
            this.y.g().k(z);
        }
    }

    public final void I(int i) {
        jac jacVar = this.v;
        jacVar.h = this;
        jacVar.d(i);
    }

    public final void J() {
        K(false);
    }

    public final void K(final boolean z) {
        this.f.e("CaptureModule#takePictureNow");
        if (this.F == null) {
            ((oug) ((oug) b.c()).G((char) 1569)).o("Not taking picture since Camera is closed.");
            this.f.f();
            return;
        }
        this.f.e("screenOnController#onUserInteraction");
        this.ap.a();
        this.f.g("previewManager#onCaptureStarted");
        this.ad.d();
        gfu gfuVar = this.F;
        gfuVar.getClass();
        if (!((Boolean) gfuVar.h().a.fA()).booleanValue()) {
            ((oug) ((oug) b.c()).G((char) 1568)).o("Not taking picture since the Camera is not ready to take a picture.");
            this.f.f();
            this.f.f();
            return;
        }
        this.f.g("intervalLogger#onCapture");
        kfm kfmVar = this.aQ;
        if (kfmVar.a == 0) {
            kfmVar.a = SystemClock.elapsedRealtime();
        } else {
            SystemClock.elapsedRealtime();
            kfmVar.a = SystemClock.elapsedRealtime();
        }
        this.f.g("updateUi");
        H(false);
        this.U.fB(true);
        this.A.b();
        this.s.l(false);
        this.y.g().e();
        this.j.g();
        if (this.x.g()) {
            ((bys) this.x.c()).b();
        }
        this.f.g("lockExtendedSignal");
        this.aa.j(true);
        if (((Boolean) this.aa.a().fA()).booleanValue() && !z) {
            this.f.g("soundPlayer#play");
            this.z.b(R.raw.longexposure_start);
            this.f.g("previewManager#showPreview");
            this.ad.e();
            this.f.g("updateUi");
            this.j.v(false);
            this.h.W();
        }
        fwn fwnVar = new fwn(this);
        this.M.c(fwnVar);
        if (!z) {
            this.f.g("indicator#show");
            this.aN.a();
        }
        this.f.g("takePictureNow");
        fxh fxhVar = this.as;
        gfu gfuVar2 = this.F;
        gfuVar2.getClass();
        fvx fvxVar = this.D;
        fvxVar.getClass();
        pht phtVarD = fxhVar.d(gfuVar2, fvxVar, fwnVar, this.ai, this.K, z, this.H);
        this.f.f();
        phtVarD.d(new Runnable() { // from class: ews
            @Override // java.lang.Runnable
            public final void run() {
                exi exiVar = this.a;
                boolean z2 = z;
                exiVar.ad.c();
                exiVar.U.fB(false);
                exiVar.y.g().f();
                if (!z2) {
                    exiVar.H(exiVar.P.fA().booleanValue());
                    if (!exiVar.N.e()) {
                        exiVar.s.l(true);
                    }
                    if (exiVar.x.g()) {
                        ((bys) exiVar.x.c()).h();
                    }
                    exiVar.aa.j(false);
                    exiVar.A.c();
                    exiVar.j.v(true);
                    exiVar.j.h();
                    if (!exiVar.N.e()) {
                        exiVar.V.j();
                    }
                }
                exiVar.r.a();
                if (exiVar.ae.g()) {
                    ily ilyVar = (ily) exiVar.ae.c();
                    exiVar.y.l();
                    exiVar.af.l();
                    ilyVar.a();
                }
            }
        }, this.d);
        this.K = false;
        this.H = (ijp) this.av.a();
        this.f.f();
    }

    public final boolean L() {
        return this.P.fA().booleanValue() && !this.v.e();
    }

    @Override // defpackage.buf
    public final String c() {
        return this.an.getString(R.string.photo_accessibility_peek);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.M.close();
    }

    @Override // defpackage.buf
    public final void d(awl awlVar) {
    }

    @Override // defpackage.buf
    public final void e(Configuration configuration) {
    }

    @Override // defpackage.buf
    public final ojc fQ() {
        return ojc.h(this.F);
    }

    @Override // defpackage.buf
    public final void ge() {
        if (this.aB) {
            return;
        }
        this.aB = true;
        this.f.e("CaptureModule#initialize");
        this.M.c(this.aD.a(new ivi() { // from class: ewt
            @Override // defpackage.ivi
            public final void a() {
                this.a.v();
            }
        }));
        if (this.R.g()) {
            ((ima) this.R.c()).b();
        }
        this.f.f();
    }

    @Override // defpackage.buf
    public final void gf() {
        this.p.c();
        v();
        if (this.N.e()) {
            this.O.b();
        }
        this.o.c();
    }

    @Override // defpackage.buf
    public final void k() {
        this.U.fB(false);
        if (this.F != null && bqe.v(this.aP)) {
            if ((this.ai.k() == lwd.FRONT) != bqe.m(this.aP.a())) {
                G(true);
            } else {
                u();
            }
        }
        gfu gfuVar = this.F;
        if (gfuVar != null && gfuVar.g()) {
            G(true);
        }
        this.r.b();
        this.r.a();
        this.l.d(true);
        this.V.i();
        mip.bZ(this.I, new ewu(this, 1));
    }

    @Override // defpackage.buf
    public final void m() {
        lap lapVar = new lap();
        this.aC = lapVar;
        lapVar.c(this.h.d(this.i));
        this.aC.c(this.J.a(new ewm(this, 1), this.d));
        this.aC.c(this.az.a(htu.d).a(this.aI, this.d));
        this.aq.addListener(this.ar);
        H(true);
        lap lapVar2 = this.aC;
        final jdy jdyVar = this.aR;
        final ewl ewlVar = new ewl(this);
        synchronized (jdyVar.h) {
            jdyVar.h.add(ewlVar);
        }
        final byte[] bArr = null;
        lapVar2.c(new lie(ewlVar, bArr) { // from class: bzq
            public final /* synthetic */ ewl a;

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                jdy jdyVar2 = this.b;
                ewl ewlVar2 = this.a;
                synchronized (jdyVar2.h) {
                    jdyVar2.h.remove(ewlVar2);
                }
            }
        });
        if (this.W.k(ddm.aa)) {
            this.X.e(this.ac);
            this.aC.c(this.X);
            this.aC.c(this.aa.a().a(new ewm(this, 2), this.d));
        }
        this.f.e("CaptureModule#resume");
        P();
        this.f.e("CaptureModule#ui-resume");
        this.ad.b();
        this.aj.b();
        this.A.d();
        this.f.f();
        this.aa.i(this.W.k(ddm.aa));
        this.f.e("Setup CameraAppUI");
        enl enlVar = ((bvk) this.y.g()).B;
        this.f.f();
        this.y.r(this.aM, true);
        hpe hpeVar = this.ax;
        hpeVar.e.execute(new hpd(hpeVar, 1));
        this.aG.a(this.aH);
        this.z.e();
        this.f.f();
    }

    @Override // defpackage.buf
    public final void o() {
        this.f.e("CaptureModule#stop");
        this.aC.close();
        this.aa.i(false);
        this.aq.removeListener(this.ar);
        if (((Boolean) this.U.d).booleanValue()) {
            this.U.fB(false);
            M(true);
        }
        this.V.s(false);
        this.aj.a();
        this.ad.a();
        this.K = false;
        v();
        hpe hpeVar = this.ax;
        hpeVar.e.execute(new hpd(hpeVar, 0));
        this.f.e("CaptureModule#closeCamera");
        pht phtVar = this.E;
        if (phtVar != null) {
            phtVar.cancel(false);
            this.E = null;
        }
        this.F = null;
        this.am.d();
        this.P.d(lcv.g(false));
        this.f.e("CameraLifetime#close");
        this.Q.close();
        this.f.f();
        this.n.a();
        this.f.f();
        enl enlVar = ((bvk) this.y.g()).B;
        this.z.a();
        this.aG.b(this.aH);
        this.f.f();
    }

    @Override // defpackage.buf
    public final boolean q() {
        if (this.v.e()) {
            this.aA.b();
            this.v.a();
            return true;
        }
        if (!this.N.e()) {
            return false;
        }
        this.O.b();
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
        if (bqe.v(this.aP)) {
            this.au.a();
            I(bqe.b(this.aP.a()));
            bqe.f(this.aP.a());
        }
    }

    public final void v() {
        if (this.v.e()) {
            this.aA.b();
            this.v.a();
        }
    }

    public final void w(final boolean z) {
        if (this.a) {
            final boolean zI = this.m.i();
            final ijs ijsVar = (ijs) this.ao.a();
            final boolean zI2 = this.m.i();
            this.m.d();
            G(true);
            if (this.W.k(ddl.X)) {
                this.j.p(false);
            }
            obr.at(this.Q, "cameraLifetime", new Object[0]);
            obr.at(this.E, "openingCamera", new Object[0]);
            mip.ca(pgb.i(this.E, ewp.a, pgr.INSTANCE), new lht() { // from class: ewx
                @Override // defpackage.lht
                public final void a(Object obj) {
                    exi exiVar = this.a;
                    boolean z2 = z;
                    ijs ijsVar2 = ijsVar;
                    boolean z3 = zI;
                    boolean z4 = zI2;
                    if (z2) {
                        exiVar.ak.a(exiVar.m.d() == lwd.BACK ? lwd.FRONT : lwd.BACK, 2, 3);
                    }
                    ijsVar2.i(ijh.CAMERA_CHANGE_END);
                    exiVar.T.V(true != z3 ? 2 : 3, z4 ? 2 : 3, ijsVar2.m, ijsVar2.g(ijh.CAMERA_CHANGE_END));
                    ijsVar2.close();
                    if (z4) {
                        exiVar.o.a();
                        return;
                    }
                    final jhh jhhVar = exiVar.o;
                    lco lcoVar = jhhVar.a;
                    if (jhhVar.b == null || lcoVar.fA() == htf.OFF || jhhVar.b.o("face_retouching_hint")) {
                        return;
                    }
                    String str = jhhVar.a.fA() == htf.ON_LIGHT ? jhhVar.f : jhhVar.g;
                    jgv jgvVar = new jgv();
                    jgvVar.f = jhhVar.d;
                    jgvVar.i = 7;
                    jgvVar.e = str;
                    jgvVar.a = false;
                    jgvVar.h = jhhVar.h;
                    jgvVar.b = 6000;
                    jgvVar.d = new jgt() { // from class: jhf
                        @Override // defpackage.jgt
                        public final void a(long j) {
                            jhh jhhVar2 = jhhVar;
                            if (j >= 3000) {
                                jhhVar2.b.l("face_retouching_hint", true);
                            }
                        }
                    };
                    jhhVar.o = jgvVar.a();
                    jhhVar.c.d(jhhVar.o);
                    final htf htfVar = (htf) jhhVar.a.fA();
                    jhhVar.q.h().c(jhhVar.a.a(new lij() { // from class: jhg
                        @Override // defpackage.lij
                        public final void fB(Object obj2) {
                            jhh jhhVar2 = jhhVar;
                            if (((htf) obj2).f != htfVar.f) {
                                jhhVar2.a();
                            }
                        }
                    }, jhhVar.e));
                }
            }, this.d);
        }
    }

    public final void x() {
        this.y.g().o();
    }

    @Override // defpackage.jad
    public final void y() {
        if (this.a) {
            this.aA.b();
            J();
        }
    }

    @Override // defpackage.jad
    public final void z() {
        if (this.a) {
            this.aA.a();
            this.z.c(R.raw.timer_start);
        }
    }
}
