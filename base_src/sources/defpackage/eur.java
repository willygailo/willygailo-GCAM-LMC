package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.constraint.ConstraintLayout;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eur implements btt, fik, fhy, fib, fii, fig, fie, fij, fgl, fgq, fgm, fgx, jfl, jfm {
    public static final ouj a = ouj.h("com/google/android/apps/camera/legacy/app/app/CameraActivityControllerImpl");
    public Parcelable A;
    public Serializable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public lie F;
    public final axg G;
    public final jfn H;
    public final lda I;
    public final lda J;
    public final lda K;
    public final lda L;
    public final qkg M;
    public final pyn N;
    public final kas O;
    public final ViewfinderCover P;
    public final pyn Q;
    public final pih R;
    public final ojc S;
    public final bqg T;
    private final brc U;
    private final hvb V;
    private final pht W;
    private final jcf X;
    private final ContentResolver Y;
    private final Context Z;
    private boolean aC;
    private boolean aD;
    private final hrx aF;
    private final cvo aG;
    private final jdk aH;
    private final lda aI;
    private final imf aJ;
    private final ojc aK;
    private final dqa aL;
    private final axf aQ;
    private final fxi aR;
    private final fch aS;
    private final jsc aT;
    private final lwf aU;
    private final emb aV;
    private final khx aW;
    private final lar aa;
    private final Executor ab;
    private final ijn ac;
    private final fix ad;
    private final gvb ae;
    private final hub af;
    private final hug ag;
    private final Window ah;
    private final fhv ai;
    private final hnx aj;
    private final qkg ak;
    private final boolean al;
    private final ddf am;
    private final pyn an;
    private dfg ao;
    private dfg ap;
    private ojc aq;
    private bue ar;
    private final ixj as;
    private final ixx at;
    private final jqo au;
    private final epj av;
    private final lco aw;
    private final lda ax;
    private final hvg ay;
    public final BottomBarController b;
    public final Context c;
    public final dlt d;
    public final Handler e;
    public final CameraActivityTiming f;
    public final lkd g;
    public final jng h;
    public final Resources i;
    public final huf j;
    public final ljf k;
    public final qkg l;
    public final jns m;
    public btv n;
    public buf o;
    public final ojc p;
    public final pyn q;
    public final fjs s;
    public final gtg t;
    public jrl v;
    public boolean y;
    public boolean z;
    public ijk r = new ijk(new mcu(), new ljd());
    public boolean u = false;
    private boolean az = false;
    public boolean w = false;
    public boolean x = false;
    private boolean aA = true;
    private boolean aB = false;
    private boolean aE = false;
    private final epi aM = new euh(this);
    private final idd aN = new eum(this);
    private final bub aO = new eun(this);
    private final hsb aP = new eup(this);

    public eur(Context context, Context context2, Resources resources, Window window, ContentResolver contentResolver, Handler handler, emb embVar, fhv fhvVar, ih ihVar, bqg bqgVar, brc brcVar, lar larVar, Executor executor, fxi fxiVar, boolean z, gvb gvbVar, lwf lwfVar, pht phtVar, lkd lkdVar, fix fixVar, hub hubVar, huf hufVar, hug hugVar, jcf jcfVar, jng jngVar, jns jnsVar, pyn pynVar, hvb hvbVar, dlt dltVar, hnx hnxVar, qkg qkgVar, khx khxVar, ljf ljfVar, ijn ijnVar, CameraActivityTiming cameraActivityTiming, qkg qkgVar2, ixj ixjVar, ixx ixxVar, fch fchVar, jqo jqoVar, Intent intent, BottomBarController bottomBarController, ddf ddfVar, epj epjVar, fjs fjsVar, jfn jfnVar, gtg gtgVar, lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, qkg qkgVar3, hrx hrxVar, pyn pynVar2, cvo cvoVar, kas kasVar, jdk jdkVar, lco lcoVar, lda ldaVar5, ojc ojcVar, pyn pynVar3, pyn pynVar4, hvg hvgVar, pih pihVar, lda ldaVar6, jsc jscVar, ojc ojcVar2, imf imfVar, ojc ojcVar3, dqa dqaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = 0;
        euq euqVar = new euq(this);
        this.aQ = euqVar;
        this.c = context;
        this.Z = context2;
        this.i = resources;
        this.ah = window;
        this.b = bottomBarController;
        this.Y = contentResolver;
        larVar.getClass();
        this.aa = larVar;
        executor.getClass();
        this.ab = executor;
        this.e = handler;
        handler.getLooper().getClass();
        this.aV = embVar;
        fxiVar.getClass();
        this.aR = fxiVar;
        this.T = bqgVar;
        this.ai = fhvVar;
        brcVar.getClass();
        this.U = brcVar;
        this.al = z;
        gvbVar.getClass();
        this.ae = gvbVar;
        lwfVar.getClass();
        this.aU = lwfVar;
        this.W = phtVar;
        lkdVar.getClass();
        this.g = lkdVar;
        fixVar.getClass();
        this.ad = fixVar;
        hubVar.getClass();
        this.af = hubVar;
        this.j = hufVar;
        this.ag = hugVar;
        jcfVar.getClass();
        this.X = jcfVar;
        jngVar.getClass();
        this.h = jngVar;
        hvbVar.getClass();
        this.V = hvbVar;
        dltVar.getClass();
        this.d = dltVar;
        this.m = jnsVar;
        this.an = pynVar;
        ixjVar.getClass();
        this.as = ixjVar;
        ixxVar.getClass();
        this.at = ixxVar;
        fchVar.getClass();
        this.aS = fchVar;
        this.au = jqoVar;
        hnxVar.getClass();
        this.aj = hnxVar;
        qkgVar.getClass();
        this.ak = qkgVar;
        ljfVar.getClass();
        this.k = ljfVar;
        this.ac = ijnVar;
        khxVar.getClass();
        this.aW = khxVar;
        this.f = cameraActivityTiming;
        qkgVar2.getClass();
        this.l = qkgVar2;
        this.am = ddfVar;
        epjVar.getClass();
        this.av = epjVar;
        this.s = fjsVar;
        this.H = jfnVar;
        this.t = gtgVar;
        this.I = ldaVar;
        this.K = ldaVar2;
        this.J = ldaVar3;
        this.L = ldaVar4;
        this.M = qkgVar3;
        this.N = pynVar2;
        this.aF = hrxVar;
        this.aG = cvoVar;
        this.O = kasVar;
        this.aH = jdkVar;
        this.P = jnsVar.e;
        this.aw = lcoVar;
        this.ax = ldaVar5;
        this.p = ojcVar;
        this.q = pynVar3;
        this.Q = pynVar4;
        this.ay = hvgVar;
        this.R = pihVar;
        this.aI = ldaVar6;
        this.aT = jscVar;
        this.S = ojcVar2;
        this.aJ = imfVar;
        this.aK = ojcVar3;
        this.aL = dqaVar;
        boolean zU = bqe.u(embVar);
        boolean z2 = (!intent.getBooleanExtra("open_socialshare", false) || z || zU) ? false : true;
        this.C = z2;
        if (z2) {
            Parcelable parcelableExtra = intent.getParcelableExtra("filmstrip_item_data");
            parcelableExtra.getClass();
            this.A = parcelableExtra;
            Serializable serializableExtra = intent.getSerializableExtra("filmstrip_item_type");
            serializableExtra.getClass();
            this.B = serializableExtra;
        }
        this.D = (!intent.getBooleanExtra("open_filmstrip", false) || z || zU) ? false : true;
        this.aC = (!intent.getBooleanExtra("open_empty_vault", false) || z || zU) ? false : true;
        this.aD = intent.getBooleanExtra("open_mars", false);
        ldaVar6.a(new eud(this, i), larVar);
        new WeakReference(ihVar);
        this.G = new axg(euqVar, handler);
        jfnVar.i(this);
        jfnVar.k(this);
    }

    private final int H() {
        return this.x ? 2 : 0;
    }

    private final void I(boolean z) {
        btp btpVar = (btp) mip.bY(this.W);
        if (btpVar == null) {
            return;
        }
        synchronized (btpVar) {
            lvs lvsVar = btpVar.e;
            if (lvsVar != null) {
                btpVar.g(lvsVar.a());
            }
        }
        btpVar.m(z);
        btpVar.d = null;
    }

    private final void J(final jrl jrlVar, Executor executor, Executor executor2) {
        if (this.az || this.v != jrlVar) {
            this.az = false;
            ljf ljfVar = this.k;
            String strValueOf = String.valueOf(jrlVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 13);
            sb.append("doSelectMode ");
            sb.append(strValueOf);
            ljfVar.e(sb.toString());
            if (!this.f.d()) {
                this.f.c();
            }
            ijk ijkVar = (ijk) this.ac.a();
            this.r = ijkVar;
            String strName = jrlVar.name();
            mip mipVar = ijkVar.o;
            String.valueOf(strName).length();
            buf bufVar = this.o;
            bufVar.gg();
            bufVar.p();
            bvk bvkVar = (bvk) this.n;
            FrameLayout frameLayout = bvkVar.g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            bvkVar.k(true);
            bvkVar.n = null;
            PreviewOverlay previewOverlay = bvkVar.m;
            previewOverlay.a = null;
            previewOverlay.b = null;
            final pih pihVarF = pih.f();
            if (R(this.v) || !R(jrlVar)) {
                pihVarF.o(null);
            } else {
                executor.execute(new Runnable() { // from class: ety
                    @Override // java.lang.Runnable
                    public final void run() {
                        eur eurVar = this.a;
                        jrl jrlVar2 = jrlVar;
                        pih pihVar = pihVarF;
                        ljf ljfVar2 = eurVar.k;
                        String strValueOf2 = String.valueOf(jrlVar2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 28);
                        sb2.append("doSelectMode ");
                        sb2.append(strValueOf2);
                        sb2.append(" disconnectSync");
                        ljfVar2.e(sb2.toString());
                        eurVar.g.b();
                        eurVar.k.f();
                        pihVar.o(null);
                    }
                });
            }
            plk.af(pihVarF, new eul(this, jrlVar), executor2);
            this.k.f();
        }
    }

    private final void K(int i, Intent intent) {
        emb embVar = this.aV;
        intent.getClass();
        embVar.a.setResult(i, intent);
        u("CameraActivityController: Intent completed with a valid result. Closing activity.");
    }

    private final void L() {
        this.k.e("resetSettingsOnModeChange");
        this.aJ.c();
        this.k.f();
    }

    private final void M() {
        this.k.e("resetStartupSettingsForAllModules");
        cvo cvoVar = this.aG;
        cvoVar.g(cvoVar.a);
        this.ax.fB(hti.e);
        if (this.am.k(dcu.r)) {
            gtg gtgVar = this.t;
            ((oug) ((oug) gtg.a.c()).G((char) 2127)).o("MicInput reset to Phone");
            gtgVar.u.fB(hth.PHONE);
            gtgVar.v.fB(false);
            gtgVar.x.fB("");
        }
        this.t.ay = false;
        this.aJ.c();
        dqa dqaVar = this.aL;
        if (dqaVar.a) {
            dqaVar.b().fB(Integer.valueOf(hls.f(1)));
        }
        if (this.S.g()) {
        }
        if (this.aK.g()) {
            ((ima) this.aK.c()).c();
        }
        if (((Boolean) this.j.c(htu.ab)).booleanValue()) {
            this.aH.g(false);
            ((ivj) this.l.get()).g();
        }
        this.k.f();
    }

    private final void N(jrl jrlVar) {
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar.ordinal()) {
            case 1:
                this.at.k();
                break;
            case 2:
                this.at.p();
                break;
            case 3:
                this.at.j();
                break;
            case 4:
                this.at.b();
                break;
            case 5:
                this.at.n();
                break;
            case 6:
                this.at.l();
                break;
            case 11:
                this.at.i();
                break;
            case 12:
                this.at.c();
                break;
            case 13:
                this.at.o();
                break;
            case 15:
                this.at.d();
                break;
            case 17:
                this.at.m();
                break;
        }
    }

    private final void O(int i) {
        if (i == 2) {
            ((bvk) this.n).c.setVisibility(4);
        } else {
            ((bvk) this.n).c.setVisibility(0);
        }
    }

    private final boolean P() {
        return bqe.u(this.aV);
    }

    private final boolean Q() {
        return ((buc) this.q.get()).i();
    }

    private final boolean R(jrl jrlVar) {
        return this.aR.a(jrlVar).b.a();
    }

    private final synchronized void S() {
        if (this.aq == null) {
            Context context = this.c;
            ojc ojcVarH = ojc.h(context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos"));
            if (!ojcVarH.g() || context.getPackageManager().queryIntentActivities((Intent) ojcVarH.c(), 65536).size() == 0) {
                ojcVarH = oih.a;
            }
            this.aq = ojcVarH;
        }
    }

    private final void T() {
        this.k.e("setupCameraFacingFromIntent");
        if (!bqe.i(this.aV.a())) {
            this.k.f();
            return;
        }
        lvs lvsVarE = bqe.m(this.aV.a()) ? this.aU.e(lwd.FRONT) : null;
        if (lvsVarE == null) {
            lvsVarE = this.aU.e(lwd.BACK);
        }
        if (lvsVarE == null) {
            lvsVarE = this.aU.b();
        }
        lvsVarE.getClass();
        this.aG.g(lvsVarE.a.equals("0") ? lwd.BACK : lwd.FRONT);
        this.k.f();
    }

    @Override // defpackage.hnw
    public final void A() {
        buf bufVar = this.o;
        if (bufVar == null) {
            return;
        }
        bufVar.n();
        this.o.l();
    }

    @Override // defpackage.hnw
    public final void B() {
        buf bufVar = this.o;
        if (bufVar == null) {
            return;
        }
        bufVar.gg();
        this.o.p();
        this.E = true;
        if (this.aR.a(this.v).b.a()) {
            I(true);
        } else {
            this.g.b();
        }
    }

    @Override // defpackage.fgx
    public final void C(boolean z) {
        buf bufVar = this.o;
        if (bufVar != null) {
            bufVar.gd(z);
        }
    }

    public final void D(jrl jrlVar) {
        ljf ljfVar = this.k;
        String strValueOf = String.valueOf(jrlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
        sb.append("setModuleFromMode ");
        sb.append(strValueOf);
        ljfVar.e(sb.toString());
        lar.a();
        if (!v()) {
            this.k.f();
            return;
        }
        fxj fxjVarA = this.aR.a(jrlVar);
        if (!R(jrlVar)) {
            I(true);
        }
        this.v = jrlVar;
        N(jrlVar);
        this.aI.fB(fxl.a);
        lap lapVarI = this.T.i();
        buf bufVar = (buf) fxjVarA.a.get();
        lapVarI.c(bufVar);
        this.o = bufVar;
        bufVar.ge();
        this.r.c();
        this.k.f();
        ((jxo) this.Q.get()).b();
        if (this.o.s()) {
            ((jxo) this.Q.get()).c(jrlVar.name());
        }
    }

    public final void E() {
        if (this.o == null) {
            return;
        }
        int iH = H();
        O(iH);
        this.o.gc(iH);
    }

    @Override // defpackage.fhy
    public final void F() {
    }

    public final int G() {
        int iF = jri.f(this.v);
        if (Q()) {
            return 3;
        }
        return iF;
    }

    @Override // defpackage.avw
    public final void a(int i) {
        ((oug) ((oug) a.c()).G(1518)).p("Camera disabled: %d", i);
        this.d.d();
    }

    @Override // defpackage.avw
    public final void b(awl awlVar) {
        if (this.z) {
            I(false);
            return;
        }
        if (!this.aR.a(this.v).b.a()) {
            I(false);
            ((oug) ((oug) a.c()).G(1522)).w("Camera opened but the module shouldn't be requesting. Close & return. mode=%s camera=%s", this.v, awlVar.a());
        } else if (this.o != null) {
            axh axhVarF = awlVar.f();
            axhVarF.q = 0;
            awlVar.m(axhVarF);
            try {
                this.o.d(awlVar);
            } catch (RuntimeException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1521)).o("Error connecting to camera");
                this.d.f(e);
            }
        }
    }

    @Override // defpackage.avw
    public final void c(int i, String str) {
        ((oug) ((oug) a.c()).G((char) 1524)).r("Camera open failure: %s", str);
        this.d.f(null);
    }

    @Override // defpackage.avw
    public final void d(int i, String str) {
        ((oug) ((oug) a.c()).G(1525)).t("Camera open already: %d,%s", i, str);
        this.d.h();
    }

    @Override // defpackage.fij
    public final void e() {
        this.k.e("CameraActivityController.onStop");
        this.aE = false;
        this.z = true;
        this.k.h();
        this.o.p();
        this.E = false;
        this.k.h();
        ((bvk) this.n).r();
        this.aj.a();
        if (this.w) {
            u("CameraActivityController: Fatal error during onPause!");
        } else {
            I(true);
            this.k.h();
        }
        ddf ddfVar = this.am;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        this.am.b();
        this.k.h();
        this.k.f();
    }

    @Override // defpackage.bts
    public final Context f() {
        return this.c;
    }

    @Override // defpackage.fib
    public final void fT() {
        this.Y.unregisterContentObserver(this.ao);
        this.Y.unregisterContentObserver(this.ap);
        this.aF.i(this.aP);
        bvk bvkVar = (bvk) this.n;
        bvkVar.v.unregisterDisplayListener(bvkVar.k);
        bvkVar.j.b(null);
    }

    @Override // defpackage.fie
    public final void fU() {
        this.k.e("CameraActivityController.onPause");
        this.y = true;
        if (!Q() && !this.X.c() && !this.al && !this.o.t()) {
            bvk bvkVar = (bvk) this.n;
            jfj jfjVar = bvkVar.e.i;
            int i = jfjVar.r;
            if (i != -1) {
                jfjVar.s.fB(Integer.valueOf(i));
                jfjVar.r = -1;
            }
            jfjVar.c.cancel();
            jfjVar.f.cancel();
            jfjVar.d.cancel();
            jfjVar.u = jrl.UNINITIALIZED;
            jfjVar.k = oih.a;
            jfjVar.F = 1;
            jfjVar.h();
            bvkVar.e.l();
            this.aE = true;
            this.k.h();
        }
        this.av.b(this.aM);
        dfg dfgVar = this.ao;
        dfgVar.b = null;
        dfgVar.a(true);
        this.ap.a(true);
        this.o.gg();
        if (((buc) this.q.get()).i()) {
            ((oug) ((oug) a.c()).G((char) 1530)).o("Disconnecting the camera device because filmstrip was launched.");
            this.g.a();
            this.E = true;
            this.o.p();
        }
        if (bqe.a(this.aV.a()) >= 0.0f) {
            this.aT.a();
        }
        this.k.f();
    }

    @Override // defpackage.fig
    public final void fV() {
        this.k.e("CameraActivityController.onResume");
        this.y = false;
        this.av.a(this.aM);
        this.as.b();
        if (!Q()) {
            if (this.E) {
                this.o.n();
            }
            this.o.l();
        }
        this.E = false;
        if (this.m.l.getVisibility() != 0) {
            this.f.c();
        }
        if (this.aE) {
            btv btvVar = this.n;
            boolean z = this.v == jrl.MORE_MODES || this.v == jrl.LENS;
            btvVar.h(z);
            this.aE = false;
        }
        this.aA = false;
        if ((this.ap.a || this.ao.a) && !this.T.g() && !this.al) {
            this.ar.g();
        }
        this.ao.a(false);
        this.ap.a(false);
        float fA = bqe.a(this.aV.a());
        if (fA >= 0.0f && fA <= 1.0f) {
            jsc jscVar = this.aT;
            if (fA >= 0.0f && fA <= 1.0f) {
                jscVar.d(fA);
                jscVar.a++;
            }
        }
        this.k.f();
    }

    @Override // defpackage.fii
    public final void fW() {
        this.k.e("CameraActivityController.onStart");
        this.z = false;
        if (v()) {
            if (this.aD && !this.al) {
                this.aH.g(true);
                this.aD = false;
            }
            if (this.u) {
                this.H.d(false);
                D(jrl.PHOTO);
                this.at.a();
                this.u = false;
                this.H.j(jrl.PHOTO, false);
            }
            if (this.aA || !Q()) {
                this.n.j();
            }
            ddf ddfVar = this.am;
            ddi ddiVar = ddl.a;
            ddfVar.b();
            this.am.b();
            this.am.e();
            this.k.e("CameraActivityController.start");
            S();
            this.k.h();
            this.as.b();
            this.o.n();
            this.s.W(G(), 2);
            this.k.h();
            if (!this.al) {
                this.ao.b = new fcy();
            }
            O(H());
            this.aj.c(this);
            this.k.f();
            this.k.f();
        }
    }

    @Override // defpackage.fgl
    public final boolean fX() {
        if (H() == 2) {
            return false;
        }
        if (this.n.fX()) {
            return true;
        }
        if (this.v == jrl.PHOTO) {
            return false;
        }
        if (this.H.a().contains(this.v)) {
            this.H.f(jrl.PHOTO);
        } else {
            this.n.d();
        }
        return true;
    }

    @Override // defpackage.bts
    public final btv g() {
        return this.n;
    }

    @Override // defpackage.bts
    public final buf h() {
        return this.o;
    }

    @Override // defpackage.bts
    public final fix i() {
        return this.ad;
    }

    @Override // defpackage.bts
    public final gvb j() {
        return this.ae;
    }

    @Override // defpackage.bts
    public final hub k() {
        return this.af;
    }

    @Override // defpackage.bts
    public final jrl l() {
        return this.v;
    }

    @Override // defpackage.bts
    public final void m() {
        K(0, new Intent());
    }

    @Override // defpackage.bts
    public final void n(Intent intent) {
        K(-1, intent);
    }

    @Override // defpackage.bts
    public final void o(Intent intent) {
        this.aA = false;
        intent.addFlags(524288);
        this.aj.g(intent);
    }

    @Override // defpackage.bts, defpackage.jfl
    public final void p(jrl jrlVar) {
        if (this.y) {
            return;
        }
        ljf ljfVar = this.k;
        String strValueOf = String.valueOf(jrlVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
        sb.append("onModeSelected ");
        sb.append(strValueOf);
        ljfVar.e(sb.toString());
        boolean zD = this.O.D(this.v);
        try {
            N(jrlVar);
            J(jrlVar, this.ab, this.aa);
        } finally {
            L();
            this.O.G(jrlVar, zD);
            this.k.f();
        }
    }

    @Override // defpackage.bts
    public final void q() {
        this.s.Y(6);
        Context context = this.c;
        ddf ddfVar = this.am;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        this.aj.g(new Intent(context, (Class<?>) CameraSettingsActivity.class));
    }

    @Override // defpackage.bts
    public final void r(jio jioVar, boolean z) {
        if (z && jioVar.d()) {
            this.n.p(2, jioVar);
        } else {
            this.n.p(3, jioVar);
        }
    }

    @Override // defpackage.btt
    public final Context s() {
        return this.Z;
    }

    @Override // defpackage.btt
    public final Window t() {
        return this.ah;
    }

    @Override // defpackage.btt
    public final void u(String str) {
        this.U.a(str);
    }

    @Override // defpackage.btt
    public final boolean v() throws Exception {
        this.k.e("initialize");
        lar.a();
        if (!this.aB && !this.T.g()) {
            final int i = 1;
            this.aB = true;
            this.k.e("CameraActivityController#init");
            this.k.e("CameraActivityUi#inflate");
            this.k.g("AppUpgrader#upgrade");
            this.V.d(this.af);
            this.ay.b(lwd.FRONT);
            this.ay.b(lwd.BACK);
            M();
            T();
            this.k.g("UiWirer#wire");
            jqo jqoVar = this.au;
            jqoVar.a.a();
            jqoVar.b.a();
            this.k.g("UiControllerInitializer#init");
            fch fchVar = this.aS;
            jrl jrlVar = jrl.UNINITIALIZED;
            switch (fchVar.d.ordinal()) {
                case 7:
                    ((izn) fchVar.b.get()).f();
                    break;
                case 8:
                    ((izz) fchVar.c.get()).f();
                    break;
                default:
                    ((iwn) fchVar.a.get()).f();
                    break;
            }
            final int i2 = 0;
            mip.ca(this.W, new lht(this) { // from class: eub
                public final /* synthetic */ eur a;

                {
                    this.a = this;
                }

                @Override // defpackage.lht
                public final void a(Object obj) {
                    switch (i2) {
                        case 0:
                            final eur eurVar = this.a;
                            final btp btpVar = (btp) obj;
                            btpVar.getClass();
                            obr.aQ(btpVar.c == null);
                            btpVar.c = eurVar;
                            btpVar.f.add(eurVar.G);
                            eurVar.T.i().c(new lie() { // from class: euc
                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    eur eurVar2 = eurVar;
                                    btp btpVar2 = btpVar;
                                    btpVar2.c = null;
                                    btpVar2.f.remove(eurVar2.G);
                                }
                            });
                            break;
                        default:
                            eur eurVar2 = this.a;
                            if (eurVar2.D) {
                                eurVar2.D = false;
                                Handler handler = eurVar2.e;
                                buc bucVar = (buc) eurVar2.q.get();
                                bucVar.getClass();
                                handler.post(new euf(bucVar, 1));
                            }
                            break;
                    }
                }
            }, pgr.INSTANCE);
            this.k.g("FilmstripData#init");
            this.ar = (bue) this.ak.get();
            buc bucVar = (buc) this.q.get();
            this.k.g("FilmstripUi#init");
            RoundedThumbnailView roundedThumbnailView = this.m.g;
            bucVar.j(this);
            enl.f(this.aa, this.ai, bucVar);
            this.k.g("Filmstrip#observers");
            this.ao = new dfg();
            this.ap = new dfg();
            this.Y.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.ao);
            this.Y.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.ap);
            this.k.g("CameraAppUI#init");
            this.m.c.j = ojc.i(new eua(this));
            ViewfinderCover viewfinderCover = this.P;
            viewfinderCover.i.q = this.aw;
            viewfinderCover.i.s = this.ag.b(htu.c);
            this.P.h = new Callable() { // from class: etz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eur eurVar = this.a;
                    buf bufVar = eurVar.o;
                    if (bufVar == null) {
                        return eurVar.n.a();
                    }
                    ojc ojcVarB = bufVar.b();
                    return (!ojcVarB.g() || ((jnm) ojcVarB.c()).d) ? ojcVarB.a(eurVar.n.a()) : oih.a;
                }
            };
            ViewfinderCover viewfinderCover2 = this.P;
            gvb gvbVar = this.ae;
            viewfinderCover2.i.A = ojc.i(gvbVar);
            this.P.i.B = new jfh() { // from class: etw
                @Override // defpackage.jfh
                public final boolean a() {
                    return ((Boolean) this.a.j.c(htu.q)).booleanValue();
                }
            };
            this.P.i.C = this.aG;
            this.h.f = ojc.i(new eua(this));
            this.n = ((btu) this.an.get()).a(P());
            this.aF.a(this.aP);
            if (this.p.g()) {
                ((idc) this.p.c()).a(this.aN);
            }
            this.T.i().c(bucVar.a(this.aO));
            this.k.g("CameraFacing#config");
            this.T.i().c(this.aG.a(new eud(this, i), pgr.INSTANCE));
            this.k.f();
            D(x());
            this.k.e("CameraUi#prepareModuleUi");
            bvk bvkVar = (bvk) this.n;
            ConstraintLayout constraintLayout = bvkVar.c;
            bvkVar.q.h(bvkVar.o);
            if (bvkVar.d.s(bvkVar.b.l())) {
                bvkVar.d.l(true);
            } else {
                bvkVar.d.l(false);
            }
            if (!bvkVar.d.s(bvkVar.b.l())) {
                bvkVar.q(bvkVar.b.l());
            }
            if (this.al || P() || this.T.g()) {
                this.ar.fN();
            } else {
                this.ar.i();
            }
            if (this.p.g()) {
                ((idc) this.p.c()).a(new euj(this));
            }
            mip.ca(((ivj) this.l.get()).c(), new lht(this) { // from class: eub
                public final /* synthetic */ eur a;

                {
                    this.a = this;
                }

                @Override // defpackage.lht
                public final void a(Object obj) {
                    switch (i) {
                        case 0:
                            final eur eurVar = this.a;
                            final btp btpVar = (btp) obj;
                            btpVar.getClass();
                            obr.aQ(btpVar.c == null);
                            btpVar.c = eurVar;
                            btpVar.f.add(eurVar.G);
                            eurVar.T.i().c(new lie() { // from class: euc
                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    eur eurVar2 = eurVar;
                                    btp btpVar2 = btpVar;
                                    btpVar2.c = null;
                                    btpVar2.f.remove(eurVar2.G);
                                }
                            });
                            break;
                        default:
                            eur eurVar2 = this.a;
                            if (eurVar2.D) {
                                eurVar2.D = false;
                                Handler handler = eurVar2.e;
                                buc bucVar2 = (buc) eurVar2.q.get();
                                bucVar2.getClass();
                                handler.post(new euf(bucVar2, 1));
                            }
                            break;
                    }
                }
            }, pgr.INSTANCE);
            if (this.aC) {
                this.aC = false;
                Handler handler = this.e;
                buc bucVar2 = (buc) this.q.get();
                bucVar2.getClass();
                handler.post(new euf(bucVar2, 0));
            }
            this.k.g("ActivityUi#initCallbacks");
            this.m.l.setOnDrawListener(new euk(this));
            this.k.g("ActivityLifecycle#observe");
            this.ai.e(this);
            this.k.f();
            this.k.f();
            this.f.j(ijf.ACTIVITY_INITIALIZED, CameraActivityTiming.a);
        }
        this.k.f();
        return this.aB;
    }

    @Override // defpackage.btt
    public final khx w() {
        return this.aW;
    }

    public final jrl x() {
        return bqe.d(this.aV.a());
    }

    @Override // defpackage.fgm
    public final void y(Configuration configuration) {
        this.o.e(configuration);
    }

    @Override // defpackage.fgq
    public final void z(Intent intent) {
        emb embVar = this.aV;
        intent.getClass();
        embVar.a.setIntent(intent);
        String action = intent.getAction();
        this.aA = true;
        this.as.g();
        mip.eP(this.as);
        this.as.f();
        if (this.aG.j() != bqe.m(intent)) {
            this.az = true;
        }
        if (bqe.l(intent)) {
            this.ag.e(htu.x, (Integer) this.am.a(ddl.s).c());
        }
        jrl jrlVarX = x();
        if (this.H.s(jrlVarX)) {
            this.H.l(true);
        }
        if (!jrlVarX.equals(jrl.PHOTO)) {
            jrlVarX.name();
            this.az = true;
            this.u = false;
        }
        M();
        T();
        J(jrlVarX, pgr.INSTANCE, pgr.INSTANCE);
        this.O.p(bqe.t(this.aV.a()));
        kas kasVar = this.O;
        if (((kbi) kasVar).L) {
            kasVar.h();
        } else {
            kasVar.g();
        }
        if (!this.z && this.aA) {
            this.n.j();
            this.aA = false;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.Z.getSystemService(ShortcutManager.class);
        if (bqe.m(this.aV.a())) {
            shortcutManager.reportShortcutUsed("selfie");
        }
        if (action == null || !action.equals("android.media.action.VIDEO_CAMERA")) {
            return;
        }
        shortcutManager.reportShortcutUsed("video");
    }
}
