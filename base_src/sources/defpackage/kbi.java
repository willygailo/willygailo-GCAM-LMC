package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.apps.camera.zoomui.ZoomKnob;
import com.google.android.apps.camera.zoomui.ZoomUi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class kbi implements kas, lie {
    private static final ouj V = ouj.h("com/google/android/apps/camera/zoomui/ZoomUiControllerImpl");
    public lwd A;
    public ImageButton B;
    public ImageButton C;
    public ojc D;
    public Resources E;
    public ZoomKnob F;
    public SeekBar G;
    public ZoomUi H;
    public kad I;
    public PointF J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public int S;
    public final ojc T;
    public final AnimatorListenerAdapter U;
    private final dkm W;
    private final Set X;
    private final WindowManager Y;
    private ojc Z;
    public final AtomicInteger a = new AtomicInteger(0);
    private List aa;
    private boolean ab;
    private final boolean ac;
    private final lwf ad;
    public final cwj b;
    public final ddf c;
    public final lap d;
    public final lda e;
    public final lda f;
    public final lda g;
    public final Set h;
    public final elw i;
    public final huj j;
    public final fjs k;
    public final boolean l;
    public final lzi m;
    public final lco n;
    public final lco o;
    public final AtomicBoolean p;
    public final Runnable q;
    public final Runnable r;
    public final lda s;
    public final lda t;
    public final jty u;
    public final ojc v;
    public final Executor w;
    public final AtomicBoolean x;
    public kcb y;
    public kbx z;

    public kbi(lda ldaVar, Set set, iuf iufVar, fjs fjsVar, ddf ddfVar, elw elwVar, huj hujVar, lwf lwfVar, dkm dkmVar, cwj cwjVar, lzi lziVar, lda ldaVar2, lco lcoVar, jty jtyVar, Executor executor, WindowManager windowManager, ojc ojcVar) {
        Float fValueOf = Float.valueOf(1.0f);
        this.e = new lce(fValueOf);
        this.f = new lce(fValueOf);
        this.p = new AtomicBoolean(false);
        this.q = new kau(this, 0);
        this.r = new kau(this, 2);
        this.s = new lce(fValueOf);
        this.t = new lce(fValueOf);
        this.x = new AtomicBoolean(false);
        this.A = lwd.BACK;
        this.Z = oih.a;
        this.D = oih.a;
        this.U = new kbd(this);
        this.d = new lap();
        this.g = ldaVar;
        this.l = iufVar.a();
        this.k = fjsVar;
        this.c = ddfVar;
        HashSet hashSet = new HashSet(set);
        this.h = hashSet;
        hashSet.add(new kbh(this));
        this.X = new HashSet();
        this.i = elwVar;
        this.j = hujVar;
        this.ad = lwfVar;
        this.W = dkmVar;
        this.b = cwjVar;
        this.m = lziVar;
        this.n = ldaVar2;
        this.o = lcoVar;
        this.L = ddfVar.k(ddl.V);
        this.u = jtyVar;
        this.w = executor;
        this.v = ddfVar.a(ddl.a);
        this.ac = ddfVar.k(ddl.U);
        this.Y = windowManager;
        this.T = ojcVar;
    }

    private final void V(int i) {
        this.C.setVisibility(i);
        this.B.setVisibility(i);
    }

    private final void W() {
        float fMin = this.P;
        if (this.c.k(dcu.z) && this.Z.g()) {
            ldz ldzVar = ldz.FPS_AUTO;
            switch ((ldz) this.Z.c()) {
                case FPS_AUTO:
                case FPS_120_HFR_4X:
                case FPS_240_HFR_8X:
                    fMin = Math.min(fMin, ((Float) this.c.g(dcu.B).c()).floatValue());
                    break;
                case FPS_24:
                case FPS_30:
                    if (!this.m.k || !this.ab) {
                        fMin = Math.min(fMin, ((Float) this.c.g(dcu.A).c()).floatValue());
                    }
                    break;
                case FPS_60:
                case FPS_60C_24E:
                case FPS_60C_30E:
                    fMin = !this.ab ? Math.min(fMin, ((Float) this.c.g(dcu.B).c()).floatValue()) : Math.min(fMin, ((Float) this.c.g(dcu.A).c()).floatValue());
                    break;
                default:
                    throw new IllegalArgumentException("Unknown camcorder capture rate");
            }
        }
        if (this.c.k(ddx.I) && ((jrl) this.n.fA()).equals(jrl.PORTRAIT) && lwd.BACK == this.A) {
            fMin = Math.min(fMin, ((Float) this.c.g(ddx.G).c()).floatValue());
        }
        if (lwd.FRONT == this.A) {
            fMin = Math.min(fMin, 15000.0f);
        }
        Float fValueOf = Float.valueOf(fMin);
        if (((Float) this.g.fA()).floatValue() > fMin) {
            this.g.fB(fValueOf);
            this.s.fB(fValueOf);
        }
        this.z.s = fMin;
        this.e.fB(fValueOf);
        R();
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X() {
        return this.ac && this.b.d().equals(lwd.FRONT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        jrl jrlVar = (jrl) this.n.fA();
        return jrlVar == jrl.VIDEO || jrlVar == jrl.TIME_LAPSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ghx Z() {
        lwf lwfVar = this.ad;
        lwfVar.getClass();
        lvs lvsVarB = this.W.b(lwfVar, this.c, this.A);
        if (X() && this.b.d().equals(lwd.FRONT)) {
            lwf lwfVar2 = this.ad;
            lvsVarB.getClass();
            return fvq.B(lwfVar2.f(lvsVarB), this.ad);
        }
        lwf lwfVar3 = this.ad;
        lvsVarB.getClass();
        return lwfVar3.f(lvsVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean aa(ghx ghxVar) {
        return this.A == lwd.FRONT && ghxVar.C();
    }

    @Override // defpackage.kas
    public final void A() {
        this.z.m(U(false), 9);
    }

    @Override // defpackage.kas
    public final void B(float f) {
        this.z.m(f, 1);
        this.s.fB(Float.valueOf(f));
    }

    @Override // defpackage.kas
    public final boolean C() {
        return this.c.k(ddl.W);
    }

    @Override // defpackage.kas
    public final boolean D(jrl jrlVar) {
        this.F.setAccessibilityLiveRegion(0);
        return d() == a(false, jrlVar);
    }

    @Override // defpackage.kas
    public final boolean E() {
        if (!this.L) {
            return d() != a(false, (jrl) this.n.fA());
        }
        float fD = d();
        return (fD == 1.0f || fD == 2.0f || fD == 0.615f || fD == 1.5f) ? false : true;
    }

    @Override // defpackage.kas
    public final void F() {
        if (!this.c.k(dcu.J)) {
            ddf ddfVar = this.c;
            ddi ddiVar = ddt.a;
            ddfVar.b();
            return;
        }
        ZoomUi zoomUi = this.H;
        if (zoomUi.d) {
        }
        kae kaeVar = kae.ULTRAWIDE;
        jrz jrzVar = jrz.PORTRAIT;
        switch (zoomUi.c.ordinal()) {
            case 1:
                zoomUi.i.cancel();
                break;
            case 2:
                zoomUi.h.cancel();
                break;
            default:
                zoomUi.g.cancel();
                break;
        }
        zoomUi.d = true;
        switch (zoomUi.c.ordinal()) {
            case 1:
                zoomUi.i.start();
                break;
            case 2:
                zoomUi.h.start();
                break;
            default:
                zoomUi.g.start();
                break;
        }
    }

    @Override // defpackage.kas
    public final void G(jrl jrlVar, boolean z) {
        if (z || (this.m.c() && jrl.LONG_EXPOSURE == jrlVar)) {
            if (!this.c.k(ddl.V)) {
                g();
            }
            p(false);
        }
    }

    public final float H() {
        if (this.A == lwd.FRONT && this.L) {
            return this.I.a(1);
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float I() {
        ghx ghxVarZ = Z();
        float fA = this.W.a(ghxVarZ);
        if (this.A == lwd.BACK) {
            return ((Float) this.c.g(ddx.g).c()).floatValue() * fA;
        }
        if (!ghxVarZ.C() && !this.L) {
            return 1.2f * fA;
        }
        if (X()) {
            return c();
        }
        return 1.0f;
    }

    public final float J(MotionEvent motionEvent) {
        float rawY;
        float rawY2;
        ZoomUi zoomUi = this.H;
        jrz jrzVarA = zoomUi.getDisplay() == null ? jrz.PORTRAIT : jrz.a(zoomUi.getDisplay(), zoomUi.getContext());
        if (this.J == null) {
            return 0.0f;
        }
        if (jrz.b(jrzVarA)) {
            rawY = this.J.x;
            rawY2 = motionEvent.getRawX();
        } else if (jrzVarA.equals(jrz.REVERSE_LANDSCAPE)) {
            rawY = this.J.y;
            rawY2 = motionEvent.getRawY();
        } else {
            rawY = motionEvent.getRawY();
            rawY2 = this.J.y;
        }
        return rawY2 - rawY;
    }

    public final int K(float f) {
        int iRound = Math.round(((float) (Math.log(f / ((Float) ((lce) this.f).d).floatValue()) / Math.log(((Float) ((lce) this.e).d).floatValue() / ((Float) ((lce) this.f).d).floatValue()))) * 100000.0f);
        if (this.G.getProgress() != iRound && !this.H.s()) {
            this.G.setProgress(iRound);
        }
        return iRound;
    }

    final void L() {
        this.z.r();
    }

    public final void M() {
        int i;
        int i2;
        if (this.p.get()) {
            return;
        }
        this.M = true;
        this.N = true;
        int iK = K(((Float) ((lce) this.s).d).floatValue());
        this.F.c(iK, ((Float) ((lce) this.s).d).floatValue(), ((Float) ((lce) this.f).d).floatValue(), H());
        ZoomUi zoomUi = this.H;
        jrz jrzVarA = ((View) zoomUi.getParent()).getDisplay() == null ? jrz.PORTRAIT : jrz.a(((View) zoomUi.getParent()).getDisplay(), zoomUi.getContext());
        float f = 0.0f;
        if (this.J != null) {
            if (this.Y != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.Y.getDefaultDisplay().getRealMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            } else {
                i = this.E.getDisplayMetrics().widthPixels;
                i2 = this.E.getDisplayMetrics().heightPixels;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
            if (jrz.b(jrzVarA)) {
                f = (this.J.x - layoutParams.leftMargin) - (i / 2);
            } else if (jrzVarA.equals(jrz.REVERSE_LANDSCAPE)) {
                f = this.J.y < 0.0f ? (this.J.x - layoutParams.leftMargin) - (i2 / 2) : (this.J.y - layoutParams.leftMargin) - (i2 / 2);
            } else {
                f = this.J.x < 0.0f ? ((i2 + this.J.x) - layoutParams.leftMargin) - (i2 / 2) : ((i2 - this.J.y) - layoutParams.leftMargin) - (i2 / 2);
            }
        }
        this.Q = f;
        this.z.p();
        this.G.setProgress(iK);
    }

    public final void N() {
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((kar) it.next()).a();
        }
    }

    public final void O(ImageButton imageButton, final boolean z) {
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: kat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kbi kbiVar = this.a;
                boolean z2 = z;
                kbiVar.z.m(kbiVar.U(z2), 6);
                if (z2 || !kbiVar.T()) {
                    return;
                }
                if (kbiVar.j.a("wide_selfie_tooltip_display_count") <= 2) {
                    kbiVar.j.c("wide_selfie_tooltip_display_count", 3);
                }
                if (kbiVar.D.g()) {
                    ((lie) kbiVar.D.c()).close();
                    kbiVar.D = oih.a;
                }
            }
        });
        imageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: kax
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                kbi kbiVar = this.a;
                kbiVar.z.l(z);
                return true;
            }
        });
        imageButton.setOnTouchListener(new View.OnTouchListener() { // from class: kay
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                kbi kbiVar = this.a;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                kbiVar.z.b();
                return false;
            }
        });
    }

    public final void P() {
        L();
        this.z.w();
    }

    public final void Q(int i) {
        this.S = i;
        this.R = 0;
    }

    public final void R() {
        ArrayList arrayList = new ArrayList();
        float fFloatValue = ((Float) ((lce) this.f).d).floatValue();
        float fA = aa(Z()) ? this.W.a(Z()) : 2.0f;
        while (fFloatValue > 0.0f && fA > 1.0f && fFloatValue < ((Float) ((lce) this.e).d).floatValue()) {
            arrayList.add(Float.valueOf(fFloatValue));
            if (fFloatValue < 1.0f) {
                arrayList.add(Float.valueOf(1.0f));
                fFloatValue = 1.0f;
            }
            fFloatValue *= fA;
        }
        arrayList.add((Float) ((lce) this.e).d);
        this.aa = arrayList;
    }

    public final boolean S() {
        float fC = this.I.c(c(), c());
        if (this.m.k) {
            return fC >= 1.0f || c() >= 1.0f || ((jrl) this.n.fA()).equals(jrl.PORTRAIT) || ((jrl) this.n.fA()).equals(jrl.SLOW_MOTION) || (((jrl) this.n.fA()).equals(jrl.VIDEO) && this.ab && (this.Z.c() == ldz.FPS_60 || this.Z.c() == ldz.FPS_60C_24E || this.Z.c() == ldz.FPS_60C_30E)) || this.b.d().equals(lwd.FRONT);
        }
        return fC >= 1.0f || c() >= 1.0f || ((jrl) this.n.fA()).equals(jrl.PORTRAIT) || this.b.d().equals(lwd.FRONT);
    }

    public final boolean T() {
        return this.K && lwd.FRONT == this.A;
    }

    public final float U(boolean z) {
        float fFloatValue;
        if (z) {
            final int i = 1;
            Float f = (Float) ohh.s(ohh.P(this.aa, new ojf(this) { // from class: kbc
                public final /* synthetic */ kbi a;

                {
                    this.a = this;
                }

                @Override // defpackage.ojf
                public final boolean a(Object obj) {
                    switch (i) {
                        case 0:
                            return ((Float) obj).floatValue() < ((Float) this.a.g.fA()).floatValue();
                        default:
                            return ((Float) obj).floatValue() > ((Float) this.a.g.fA()).floatValue();
                    }
                }
            }), (Float) ((lce) this.e).d);
            f.getClass();
            fFloatValue = f.floatValue();
        } else {
            final int i2 = 0;
            Float f2 = (Float) ohh.u(ohh.P(this.aa, new ojf(this) { // from class: kbc
                public final /* synthetic */ kbi a;

                {
                    this.a = this;
                }

                @Override // defpackage.ojf
                public final boolean a(Object obj) {
                    switch (i2) {
                        case 0:
                            return ((Float) obj).floatValue() < ((Float) this.a.g.fA()).floatValue();
                        default:
                            return ((Float) obj).floatValue() > ((Float) this.a.g.fA()).floatValue();
                    }
                }
            }), (Float) ((lce) this.f).d);
            f2.getClass();
            fFloatValue = f2.floatValue();
        }
        this.g.fA();
        return fFloatValue;
    }

    @Override // defpackage.kas
    public final float a(boolean z, jrl jrlVar) {
        if (jrlVar == jrl.PORTRAIT && this.A == lwd.FRONT) {
            ddf ddfVar = this.c;
            ddi ddiVar = ddx.a;
            ddfVar.b();
        }
        ghx ghxVarZ = Z();
        float fFloatValue = ((Float) this.o.fA()).floatValue();
        if (aa(ghxVarZ) && !z) {
            return this.W.a(ghxVarZ);
        }
        if (X()) {
            if (this.A == lwd.FRONT && this.L) {
                return Y() ? this.I.a(0) : this.I.a(1);
            }
            return jrlVar != jrl.PORTRAIT ? fFloatValue : I();
        }
        if (jrlVar != jrl.PORTRAIT) {
            return fFloatValue;
        }
        if (this.A == lwd.FRONT && this.L) {
            return this.I.a(!this.c.k(ddx.H) ? 1 : 0);
        }
        return I();
    }

    @Override // defpackage.kas
    public final float b() {
        return ((Float) ((lce) this.e).d).floatValue();
    }

    @Override // defpackage.kas
    public final float c() {
        return ((Float) ((lce) this.f).d).floatValue();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.kas
    public final float d() {
        return ((Float) this.g.fA()).floatValue();
    }

    @Override // defpackage.kas
    public final void e(kar karVar) {
        this.X.add(karVar);
    }

    @Override // defpackage.kas
    public final void f(boolean z) {
        if (!this.c.k(dcu.J)) {
            ddf ddfVar = this.c;
            ddi ddiVar = ddt.a;
            ddfVar.b();
            return;
        }
        ZoomUi zoomUi = this.H;
        if (zoomUi.d) {
            kae kaeVar = kae.ULTRAWIDE;
            jrz jrzVar = jrz.PORTRAIT;
            switch (zoomUi.c.ordinal()) {
                case 1:
                    zoomUi.i.cancel();
                    break;
                case 2:
                    zoomUi.h.cancel();
                    break;
                default:
                    zoomUi.g.cancel();
                    break;
            }
            if (z) {
                zoomUi.d = false;
                switch (zoomUi.c.ordinal()) {
                    case 1:
                        zoomUi.i.reverse();
                        break;
                    case 2:
                        zoomUi.h.reverse();
                        break;
                    default:
                        zoomUi.g.reverse();
                        break;
                }
            }
            switch (zoomUi.c.ordinal()) {
                case 1:
                    zoomUi.i.reverse();
                    zoomUi.i.end();
                    break;
                case 2:
                    zoomUi.h.reverse();
                    zoomUi.h.end();
                    break;
                default:
                    zoomUi.g.reverse();
                    zoomUi.g.end();
                    break;
            }
            zoomUi.d = false;
        }
    }

    @Override // defpackage.kas
    public final void g() {
        if (this.l) {
            return;
        }
        this.z.a();
        L();
    }

    @Override // defpackage.kas
    public final void h() {
        obr.aQ(lar.d());
        this.G.isEnabled();
        if (!this.L || this.l) {
            this.z.i();
            if (this.l || E()) {
                L();
                return;
            } else {
                P();
                return;
            }
        }
        int i = 3;
        if (c() < 1.0f && this.n.fA() != jrl.SLOW_MOTION && this.n.fA() != jrl.PORTRAIT && !S()) {
            jrl jrlVar = (jrl) this.n.fA();
            boolean z = false;
            if (c() < 1.0f && this.b.d().equals(lwd.BACK) && this.m.k) {
                z = true;
            }
            if ((jrlVar.equals(jrl.PHOTO) || jrlVar.equals(jrl.LONG_EXPOSURE) || jrlVar.equals(jrl.MOTION_BLUR) || jrlVar.equals(jrl.IMAGE_INTENT) || jrlVar.equals(jrl.VIDEO) || jrlVar.equals(jrl.TIME_LAPSE) || jrlVar.equals(jrl.VIDEO_INTENT)) && z) {
                i = 4;
            }
        } else if (S()) {
            i = 2;
        }
        this.z.j(i);
    }

    @Override // defpackage.kas
    public final void i(boolean z) {
        this.z.x = z;
    }

    @Override // defpackage.kas
    public final void j() {
        if (this.L) {
            if (this.m.d() || this.m.k) {
                if (!this.b.d().equals(lwd.FRONT)) {
                    q();
                } else if (X() && Y()) {
                    q();
                } else {
                    w(kag.FRONT_PORTRAIT);
                }
                h();
            }
        }
    }

    @Override // defpackage.kas
    public final void k(float f) {
        this.z.q(f);
    }

    @Override // defpackage.kas
    public final void l() {
        this.O = ((Float) this.g.fA()).floatValue();
        this.z.gu();
    }

    @Override // defpackage.kas
    public final void m() {
        n();
        if (X()) {
            o();
        }
    }

    @Override // defpackage.kas
    public final void n() {
        ghx ghxVarZ = Z();
        this.P = ghxVarZ.b();
        W();
        if (aa(ghxVarZ)) {
            float fA = this.W.a(ghxVarZ);
            if (fA > 1.0f) {
                s(fA * fA);
            } else {
                ((oug) ((oug) V.b()).G((char) 3562)).r("unable to set zoom max with zoomValue <= 1: %g", Float.valueOf(fA));
            }
        }
    }

    @Override // defpackage.kas
    public final void o() {
        t(Z().c());
    }

    @Override // defpackage.kas
    public final void p(boolean z) {
        this.F.setAccessibilityLiveRegion(0);
        float fA = a(z, (jrl) this.n.fA());
        lda ldaVar = this.g;
        Float fValueOf = Float.valueOf(fA);
        ldaVar.fB(fValueOf);
        if (this.c.k(ddl.V)) {
            this.s.fB(fValueOf);
        }
        if (this.x.get()) {
            n();
            this.x.set(false);
        }
    }

    @Override // defpackage.kas
    public final void q() {
        this.F.e.set(kag.MAIN_ONLY);
        this.I.e.set(kag.MAIN_ONLY);
    }

    @Override // defpackage.kas
    public final void r(float f) {
        lda ldaVar = this.g;
        Float fValueOf = Float.valueOf(f);
        ldaVar.fB(fValueOf);
        this.s.fB(fValueOf);
    }

    @Override // defpackage.kas
    public final void s(float f) {
        this.P = f;
        W();
    }

    @Override // defpackage.kas
    public final void t(float f) {
        Float fValueOf = Float.valueOf(f);
        this.z.t = f;
        this.f.fB(fValueOf);
        R();
        N();
    }

    @Override // defpackage.kas
    public final void u() {
        float fI = I();
        t(fI);
        if (((Float) this.g.fA()).floatValue() < fI) {
            r(fI);
        }
    }

    @Override // defpackage.kas
    public final void v(boolean z) {
        if (!z) {
            kcb kcbVar = this.y;
            if (kcbVar != null) {
                kcbVar.b();
                return;
            }
            return;
        }
        this.y.a();
        if (this.l) {
            if (!this.c.k(ddl.V)) {
                V(0);
            }
            h();
            return;
        }
        V(8);
        if (this.c.k(ddl.V)) {
            return;
        }
        if (((Float) this.g.fA()).floatValue() == ((Float) ((lce) this.f).d).floatValue()) {
            g();
        } else {
            h();
        }
    }

    @Override // defpackage.kas
    public final void w(kag kagVar) {
        this.F.e.set(kagVar);
        this.I.e.set(kagVar);
    }

    @Override // defpackage.kas
    public final void x() {
        if (this.L) {
            L();
            if (this.H.s()) {
                this.z.a();
            }
        }
        if (this.H.s()) {
            this.z.i();
        }
    }

    @Override // defpackage.kas
    public final void y(ojc ojcVar, boolean z) {
        this.Z = ojcVar;
        this.ab = z;
        kad kadVar = this.I;
        kadVar.f = z;
        if (ojcVar.g()) {
            kadVar.g = (ldz) ojcVar.c();
        }
        if (ojcVar.g()) {
            W();
        }
    }

    @Override // defpackage.kas
    public final void z() {
        this.z.m(U(true), 9);
    }
}
