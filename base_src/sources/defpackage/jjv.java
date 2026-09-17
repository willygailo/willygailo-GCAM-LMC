package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jjv implements jlb {
    private static final oom g = oom.o(jrl.REWIND, jrl.MORE_MODES, jrl.LENS);
    public final ShutterButton a;
    public final Object b;
    public final List c;
    boolean d;
    boolean e;
    public final jrh f;
    private final Handler h;
    private final ojc i;
    private final jkz j;
    private final jty k;
    private final ShutterButtonProgressOverlay l;
    private final kas m;
    private final boolean n;
    private jkc o;
    private final jli p;

    public jjv(ShutterButton shutterButton, Handler handler, ojc ojcVar, jty jtyVar, ShutterButtonProgressOverlay shutterButtonProgressOverlay, boolean z, boolean z2, jrh jrhVar, kas kasVar) {
        jjt jjtVar = new jjt(this);
        this.p = jjtVar;
        this.a = shutterButton;
        this.h = handler;
        this.i = ojcVar;
        this.o = shutterButton.getMode();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        Object obj = new Object();
        this.b = obj;
        this.j = new jkz(shutterButton);
        this.k = jtyVar;
        this.l = shutterButtonProgressOverlay;
        boolean z3 = true;
        this.n = true;
        this.f = jrhVar;
        this.m = kasVar;
        shutterButton.setP20NewUIEnabled(true);
        shutterButton.setZoomLockViewEnabled(z);
        shutterButton.setMaterialNextEnabled(z2);
        shutterButton.setListener(jjtVar);
        d(new jju(this));
        synchronized (obj) {
            this.d = shutterButton.isEnabled();
            this.e = shutterButton.isClickEnabled();
            if (arrayList.size() != 1) {
                z3 = false;
            }
            obr.aR(z3, "Expect only the pressedStateAnimation listener at this stage.");
        }
    }

    private final void ao(jkc jkcVar) {
        jkc jkcVar2 = jkc.PHOTO_IDLE;
        jrl jrlVar = jrl.UNINITIALIZED;
        switch (jkcVar.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 13:
            case 16:
            case 19:
            case 26:
                this.o = jkcVar;
                break;
        }
    }

    private final void ap(jkc jkcVar) {
        ao(jkcVar);
        this.a.setMode(jkcVar, this.j, this.n);
        ((jlr) ((ojj) this.i).a).b(jkcVar);
    }

    @Override // defpackage.jlb
    public final void A(boolean z) {
        this.a.runPressedStateAnimation(z, this.j);
    }

    @Override // defpackage.jlb
    public final void B(boolean z) {
        this.a.setEnableLongPressMotion(z);
    }

    @Override // defpackage.jlb
    public final void C(jka jkaVar) {
        this.a.setLongPressMotionListener(jkaVar);
    }

    @Override // defpackage.jlb
    public final void D(int i) {
        this.l.b(i, -1L, false);
    }

    @Override // defpackage.jlb
    public final void E(int i, long j, boolean z) {
        this.l.b(i, j, z);
    }

    @Override // defpackage.jlb
    public final void F(boolean z) {
        G(z, true);
    }

    public final void G(boolean z, boolean z2) {
        synchronized (this.b) {
            if (z2) {
                try {
                    this.e = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = false;
            if (z && an()) {
                z3 = true;
            }
            if (!lar.d()) {
                this.h.post(new jjs(this, z3, 1));
            } else if (this.a.isClickEnabled() != z3) {
                this.a.setClickEnabled(z3);
            }
        }
    }

    @Override // defpackage.jlb
    public final void H(boolean z) {
        I(z, true);
    }

    public final void I(boolean z, boolean z2) {
        synchronized (this.b) {
            if (z2) {
                try {
                    this.d = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = z && an();
            if (!lar.d()) {
                this.h.post(new jjs(this, z3, 0));
            } else if (this.a.isEnabled() != z3) {
                g(z3);
            }
        }
    }

    @Override // defpackage.jlb
    public final void J() {
        ap(jkc.NIGHT_CANCEL);
    }

    @Override // defpackage.jlb
    public final void K() {
        ap(jkc.AUTOTIMER_RUNNING);
    }

    @Override // defpackage.jlb
    public final void L() {
        ap(jkc.CANCEL);
    }

    @Override // defpackage.jlb
    public final void M() {
        ap(jkc.VIDEO_PRESSED);
    }

    @Override // defpackage.jlb
    public final void N() {
        g(true);
        ap(jkc.IMAX_RECORDING);
    }

    @Override // defpackage.jlb
    public final void O() {
        ap(jkc.NIGHT_STOP);
    }

    @Override // defpackage.jlb
    public final void P() {
        ap(jkc.NIGHT_CANCEL);
    }

    @Override // defpackage.jlb
    public final void Q() {
        ap(jkc.NIGHT_PROCESSING);
    }

    @Override // defpackage.jlb
    public final void R() {
        this.k.a();
        ap(jkc.PHOTO_LONGPRESS);
    }

    @Override // defpackage.jlb
    public final void S() {
        H(true);
        this.m.v(true);
        ap(jkc.PHOTO_LONGPRESS_LOCKED);
    }

    @Override // defpackage.jlb
    public final void T() {
        ap(jkc.LASAGNA_PROCESSING);
    }

    @Override // defpackage.jlb
    public final void U() {
        ap(jkc.CONFIRM_DISABLED);
    }

    @Override // defpackage.jlb
    public final void V() {
        ap(jkc.CONFIRM_ENABLED);
    }

    @Override // defpackage.jlb
    public final void W() {
        ap(jkc.CATSHARK_PHOTO_PROCESSING);
    }

    @Override // defpackage.jlb
    public final void X() {
        ap(jkc.CATSHARK_PORTRAIT_PROCESSING);
    }

    @Override // defpackage.jlb
    public final void Y() {
        ap(jkc.VIDEO_PRESSED);
    }

    @Override // defpackage.jlb
    public final void Z() {
        ap(jkc.TIMELAPSE_PRESSED);
        this.a.startTimelapseCircleAnimation();
    }

    @Override // defpackage.cwh
    public final pht a(lwd lwdVar) {
        F(false);
        return plk.V(null);
    }

    @Override // defpackage.jlb
    public final void aa() {
        ap(jkc.VIDEO_RECORDING);
    }

    @Override // defpackage.jlb
    public final void ab() {
        ap(jkc.AUTOTIMER_IDLE);
    }

    @Override // defpackage.jlb
    public final void ac() {
        ap(this.o);
    }

    @Override // defpackage.jlb
    public final void ad() {
        ap(jkc.VIDEO_IDLE);
    }

    @Override // defpackage.jlb
    public final void ae() {
        ap(jkc.PHOTO_IDLE);
    }

    @Override // defpackage.jlb
    public final void af() {
        ap(jkc.PHOTO_IDLE);
    }

    @Override // defpackage.jlb
    public final void ag() {
        ap(jkc.VIDEO_IDLE);
        e(1.0f);
    }

    @Override // defpackage.jlb
    public final void ah() {
        ap(jkc.TIMELAPSE_IDLE);
        this.a.stopTimelapseCircleAnimation();
    }

    @Override // defpackage.jlb
    public final void ai(jrl jrlVar) {
        this.a.setApplicationMode(jrlVar);
        jkc jkcVar = jkc.PHOTO_IDLE;
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar) {
            case UNINITIALIZED:
            case ORNAMENT:
            case SETTINGS:
            case MEASURE:
            case TIARA:
                String strValueOf = String.valueOf(jrlVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
                sb.append("Unsupported mode ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            case PHOTO:
                ap(this.a.getCurrentSpec().y == hti.AUTO ? jkc.AUTOTIMER_IDLE : jkc.PHOTO_IDLE);
                ((jlr) ((ojj) this.i).a).d();
                break;
            case VIDEO:
            case SLOW_MOTION:
            case VIDEO_INTENT:
                ap(jkc.VIDEO_IDLE);
                break;
            case IMAX:
                ap(jkc.IMAX_IDLE);
                break;
            case PHOTO_SPHERE:
                ap(jkc.PHOTOSPHERE_IDLE);
                break;
            case PORTRAIT:
                ap(jkc.PORTRAIT_IDLE);
                break;
            case IMAGE_INTENT:
                ap(jkc.PHOTO_IDLE);
                break;
            case MOTION_BLUR:
                ap(jkc.LASAGNA_IDLE);
                break;
            case LONG_EXPOSURE:
                ap(jkc.NIGHT_IDLE);
                break;
            case TIME_LAPSE:
                ap(jkc.TIMELAPSE_IDLE);
                break;
        }
        int i = true != g.contains(jrlVar) ? 0 : 4;
        if (i == this.a.getVisibility()) {
            return;
        }
        jur.a(i, this.a);
    }

    @Override // defpackage.jlb
    public final void aj() {
        g(true);
        ap(jkc.CONFIRM_ENABLED);
    }

    @Override // defpackage.jlb
    public final void ak(hti htiVar) {
        jkc jkcVar = this.a.getCurrentSpec().x;
        ao(jkcVar);
        jkc jkcVar2 = jkc.PHOTO_IDLE;
        jrl jrlVar = jrl.UNINITIALIZED;
        switch (jkcVar.ordinal()) {
            case 0:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                if (htiVar != hti.AUTO) {
                    this.a.setMode(jkc.PHOTO_IDLE, htiVar, this.j, this.n);
                } else {
                    this.a.setMode(jkc.AUTOTIMER_IDLE, htiVar, this.j, this.n);
                }
                break;
            case 2:
            case 13:
            case 16:
            case 19:
            case 24:
            case 26:
                this.a.setMode(jkcVar, htiVar, this.j, this.n);
                break;
        }
    }

    @Override // defpackage.jlb
    public final void al() {
        ap(jkc.CONFIRM_ENABLED);
    }

    @Override // defpackage.jlb
    public final void am() {
        this.a.updateTimelapseProgressState();
    }

    final boolean an() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.c.size() <= 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.jlb
    public final lie b() {
        I(false, false);
        return new lie() { // from class: jjq
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                this.a.I(true, false);
            }
        };
    }

    @Override // defpackage.jlb
    public final /* synthetic */ lie c() {
        return mip.eA(this);
    }

    @Override // defpackage.jlb
    public final lie d(final jli jliVar) {
        synchronized (this.b) {
            this.c.add(jliVar);
            if (an()) {
                I(this.d, false);
                G(this.e, false);
            }
        }
        return new lie() { // from class: jjr
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                jjv jjvVar = this.a;
                jli jliVar2 = jliVar;
                synchronized (jjvVar.b) {
                    jjvVar.c.remove(jliVar2);
                    if (!jjvVar.an()) {
                        jjvVar.I(false, false);
                        jjvVar.G(false, false);
                    }
                }
            }
        };
    }

    final void e(float f) {
        this.a.animateToScale(f);
    }

    @Override // defpackage.jlb
    public final void f() {
        ap(jkc.PHOTOSPHERE_IDLE);
    }

    final void g(boolean z) {
        this.a.setEnabled(z);
    }

    @Override // defpackage.jlb
    public final void h() {
        ap(jkc.ASTRO_IDLE);
    }

    @Override // defpackage.jlb
    public final void i() {
        ap(jkc.CATSHARK_PHOTO_IDLE);
    }

    @Override // defpackage.jlb
    public final void j() {
        ap(jkc.CATSHARK_PORTRAIT_IDLE);
    }

    @Override // defpackage.jlb
    public final void k() {
        ap(jkc.NIGHT_IDLE);
    }

    @Override // defpackage.jlb
    public final void l() {
        ap(jkc.IMAX_IDLE);
    }

    @Override // defpackage.jlb
    public final void m() {
        ap(jkc.NIGHT_IDLE);
    }

    @Override // defpackage.jlb
    public final void n() {
        ap(jkc.LASAGNA_IDLE);
    }

    @Override // defpackage.jlb
    public final void o() {
        ap(jkc.PHOTOSPHERE_IDLE);
    }

    @Override // defpackage.jlb
    public final void p() {
        ap(jkc.CATSHARK_PHOTO_IDLE);
    }

    @Override // defpackage.jlb
    public final void q() {
        ap(jkc.CATSHARK_PORTRAIT_IDLE);
    }

    @Override // defpackage.jlb
    public final void r() {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.l;
        AnimatorSet animatorSet = shutterButtonProgressOverlay.i;
        if (animatorSet != null && animatorSet.isRunning()) {
            shutterButtonProgressOverlay.i.cancel();
        }
        ValueAnimator valueAnimator = shutterButtonProgressOverlay.j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            shutterButtonProgressOverlay.j.cancel();
        }
        shutterButtonProgressOverlay.a();
        shutterButtonProgressOverlay.b = 0;
        shutterButtonProgressOverlay.c = 0.0f;
        shutterButtonProgressOverlay.h = false;
        shutterButtonProgressOverlay.g = true;
        shutterButtonProgressOverlay.k = 1;
        shutterButtonProgressOverlay.invalidate();
    }

    @Override // defpackage.jlb
    public final void s() {
        e(0.8f);
    }

    @Override // defpackage.jlb
    public final void t() {
        e(0.8f);
        this.a.pauseTimelapseAnimationState();
    }

    @Override // defpackage.jlb
    public final void u() {
        this.a.performClick();
    }

    @Override // defpackage.jlb
    public final void v() {
        this.a.performShutterButtonDown();
    }

    @Override // defpackage.jlb
    public final void w() {
        e(1.0f);
    }

    @Override // defpackage.jlb
    public final void x() {
        e(1.0f);
        this.a.resumeTimelapseAnimationState();
    }

    @Override // defpackage.jlb
    public final void y() {
        ap(jkc.PHOTO_IDLE);
    }

    @Override // defpackage.jlb
    public final void z() {
        ap(jkc.VIDEO_IDLE);
    }
}
