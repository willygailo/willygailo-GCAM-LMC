package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.zoomui.ZoomKnob;
import com.google.android.apps.camera.zoomui.ZoomUi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class kbx extends kbk {
    private final AnimatorSet A;
    private final ViewGroup B;
    private final kad C;
    private final boolean D;
    private int E;
    private int F;
    private final AnimatorListenerAdapter a;
    private final AnimatorListenerAdapter b;
    private final AnimatorListenerAdapter c;
    private final ValueAnimator.AnimatorUpdateListener d;
    private final Runnable e;
    private final Runnable f;
    private final cwj g;
    public final lda h;
    public final ZoomKnob i;
    public final SeekBar j;
    public final ValueAnimator k;
    public final ValueAnimator l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public final lco o;
    public final ZoomUi p;
    public final jty q;
    public boolean r;
    public float s;
    public float t;
    public final lco u;
    public final ddf v;
    public boolean w;
    public boolean x;
    private final Set y;
    private final fjs z;

    public kbx(ZoomUi zoomUi, Set set, lda ldaVar, fjs fjsVar, cwj cwjVar, lco lcoVar, ddf ddfVar, lco lcoVar2, kad kadVar, jty jtyVar) {
        kbn kbnVar = new kbn(this);
        this.a = kbnVar;
        kbo kboVar = new kbo(this);
        this.b = kboVar;
        kbp kbpVar = new kbp(this);
        this.c = kbpVar;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: kbl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.h.fB(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        };
        this.d = animatorUpdateListener;
        this.e = new kbm(this, 2);
        this.f = new kbm(this, 1);
        this.t = 1.0f;
        this.E = 0;
        this.F = 3;
        this.x = false;
        lar.a();
        this.y = set;
        this.h = ldaVar;
        this.g = cwjVar;
        this.z = fjsVar;
        this.u = lcoVar;
        this.v = ddfVar;
        this.o = lcoVar2;
        this.p = zoomUi;
        this.C = kadVar;
        this.q = jtyVar;
        this.D = ddfVar.k(ddl.W);
        ViewGroup viewGroup = (ViewGroup) zoomUi.findViewById(R.id.zoom_ui_full);
        this.B = viewGroup;
        this.i = zoomUi.n();
        this.j = zoomUi.g();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.m = valueAnimator;
        valueAnimator.addUpdateListener(animatorUpdateListener);
        valueAnimator.addListener(kbnVar);
        valueAnimator.setDuration(250L);
        valueAnimator.setInterpolator(new adt());
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.l = valueAnimator2;
        valueAnimator2.addUpdateListener(animatorUpdateListener);
        valueAnimator2.setInterpolator(new LinearInterpolator());
        ValueAnimator valueAnimator3 = new ValueAnimator();
        this.k = valueAnimator3;
        valueAnimator3.addUpdateListener(animatorUpdateListener);
        valueAnimator3.setDuration(250L);
        valueAnimator3.setInterpolator(new adt());
        valueAnimator3.addListener(kboVar);
        ValueAnimator valueAnimator4 = new ValueAnimator();
        this.n = valueAnimator4;
        valueAnimator4.addUpdateListener(animatorUpdateListener);
        valueAnimator4.setDuration(250L);
        valueAnimator4.setInterpolator(new adt());
        valueAnimator4.addListener(kbpVar);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new adt());
        objectAnimatorOfFloat.addListener(new kbq(viewGroup));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ValueAnimator.ofInt(0, 1).setDuration(60L), objectAnimatorOfFloat);
        this.A = animatorSet;
        this.w = ddfVar.k(ddl.V);
    }

    public static int y(int i) {
        if (i == 9 || i == 6) {
            return i;
        }
        return 1;
    }

    public final void A(int i) {
        if (this.E == i) {
            return;
        }
        this.E = i;
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((kaq) it.next()).p(i);
        }
    }

    public final void B(int i) {
        int dimensionPixelSize;
        long currentPlayTime;
        int iOrdinal;
        int i2 = i;
        if (!this.x && this.B.getVisibility() == 8) {
            this.A.start();
        }
        ZoomUi zoomUi = this.p;
        synchronized (ZoomUi.a) {
            if (zoomUi.l != i2) {
                zoomUi.l = i2;
                SeekBar seekBarG = zoomUi.g();
                kae kaeVar = kae.ULTRAWIDE;
                jrz jrzVar = jrz.PORTRAIT;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                switch (i3) {
                    case 2:
                        dimensionPixelSize = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_width);
                        break;
                    case 3:
                        dimensionPixelSize = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_four_btn_width);
                        break;
                    default:
                        dimensionPixelSize = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_two_btn_width);
                        break;
                }
                int dimensionPixelSize2 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_two_btn_width);
                int dimensionPixelSize3 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_togglebar_touch_area_width);
                int dimensionPixelSize4 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_seekbar_touch_area_height);
                int dimensionPixelSize5 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_height);
                int dimensionPixelSize6 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_extend_touch_area);
                int i4 = (dimensionPixelSize3 - dimensionPixelSize) / 2;
                int i5 = (dimensionPixelSize4 - dimensionPixelSize5) / 2;
                if (i2 == 2) {
                    zoomUi.u(false, 2);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zoomUi.b().getLayoutParams();
                    layoutParams.width = dimensionPixelSize2;
                    zoomUi.b().setLayoutParams(layoutParams);
                    if (seekBarG.getMax() != 1) {
                        seekBarG.setMax(1);
                    }
                } else {
                    zoomUi.u(true, i2);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zoomUi.b().getLayoutParams();
                    layoutParams2.width = dimensionPixelSize;
                    zoomUi.b().setLayoutParams(layoutParams2);
                    if (i2 != 3) {
                        seekBarG.setMax(3);
                    } else if (seekBarG.getMax() != 2) {
                        seekBarG.setMax(2);
                        i2 = 3;
                    } else {
                        i2 = 3;
                        seekBarG.setMax(3);
                    }
                }
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) seekBarG.getLayoutParams();
                layoutParams3.width = dimensionPixelSize6 + dimensionPixelSize;
                layoutParams3.height = dimensionPixelSize4;
                seekBarG.setLayoutParams(layoutParams3);
                if (seekBarG.getProgressDrawable() == null) {
                    seekBarG.setPaddingRelative(i4, i5, i4, i5);
                }
                int height = zoomUi.e().getHeight();
                if (height == 0 || height == dimensionPixelSize5) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(zoomUi.e().getWidth(), dimensionPixelSize);
                    valueAnimatorOfInt.addUpdateListener(new kai(zoomUi, 2));
                    valueAnimatorOfInt.addListener(new kam(zoomUi));
                    valueAnimatorOfInt.setDuration(200L);
                    if (zoomUi.e().getVisibility() == 8) {
                        valueAnimatorOfInt.end();
                    } else {
                        AnimatorSet animatorSet = zoomUi.j;
                        if (animatorSet != null && animatorSet.isRunning()) {
                            zoomUi.j.cancel();
                        }
                        valueAnimatorOfInt.start();
                    }
                    ZoomKnob zoomKnobN = zoomUi.n();
                    zoomKnobN.setVisibility(4);
                    zoomKnobN.b(false);
                    if (zoomUi.e().getVisibility() != 8) {
                        zoomUi.b().setVisibility(0);
                        zoomUi.f().setVisibility(0);
                    }
                } else {
                    ObjectAnimator objectAnimatorA = ZoomUi.a(zoomUi.b(), true);
                    ObjectAnimator objectAnimatorA2 = ZoomUi.a(zoomUi.f(), true);
                    objectAnimatorA.addListener(new kak(zoomUi));
                    AnimatorSet animatorSetT = zoomUi.t(i2, true);
                    animatorSetT.setInterpolator(new aby(3));
                    animatorSetT.addListener(new kal(zoomUi));
                    AnimatorSet animatorSet2 = zoomUi.k;
                    if (animatorSet2 == null || !animatorSet2.isRunning()) {
                        currentPlayTime = 0;
                    } else {
                        currentPlayTime = zoomUi.k.getCurrentPlayTime();
                        zoomUi.k.cancel();
                    }
                    zoomUi.k = new AnimatorSet();
                    zoomUi.k.play(objectAnimatorA).after(animatorSetT);
                    zoomUi.k.play(objectAnimatorA2).with(objectAnimatorA);
                    AnimatorSet animatorSet3 = zoomUi.j;
                    if (animatorSet3 != null && animatorSet3.isRunning()) {
                        zoomUi.j.cancel();
                    }
                    zoomUi.k.start();
                    if (currentPlayTime <= 0 || zoomUi.k.getStartDelay() + currentPlayTime >= zoomUi.k.getTotalDuration()) {
                        ((oug) ((oug) ZoomUi.b.c()).G(3555)).u("Unsupported current playtime = %s, total duration = %s", currentPlayTime, zoomUi.k.getTotalDuration());
                    } else {
                        zoomUi.k.setCurrentPlayTime(currentPlayTime);
                    }
                    zoomUi.e().setBackground(zoomUi.getResources().getDrawable(R.drawable.bg_zoom_toggle, null));
                }
                zoomUi.invalidate();
            }
        }
        ZoomUi zoomUi2 = this.p;
        float fFloatValue = ((Float) this.h.fA()).floatValue();
        int iOrdinal2 = kae.WIDE.ordinal();
        float fC = this.C.c(fFloatValue, this.t);
        int i6 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i6) {
            case 1:
                kad kadVar = this.C;
                iOrdinal = fC >= kadVar.c(kadVar.a(1), this.t) ? 1 : 0;
                break;
            case 2:
                if (fC >= this.C.a(kae.TELE.ordinal())) {
                    iOrdinal = kae.TELE.ordinal();
                } else if (fC < this.C.a(kae.WIDE.ordinal())) {
                    iOrdinal = kae.ULTRAWIDE.ordinal();
                } else {
                    iOrdinal = iOrdinal2;
                }
                break;
            case 3:
                if (fC >= Math.min(this.C.b(), this.C.a(kae.ULTRATELE.ordinal()))) {
                    iOrdinal = kae.ULTRATELE.ordinal();
                } else if (fC < this.C.a(kae.ULTRATELE.ordinal()) && fC >= this.C.a(kae.TELE.ordinal())) {
                    iOrdinal = kae.TELE.ordinal();
                } else if (fC < this.C.a(kae.WIDE.ordinal())) {
                    iOrdinal = kae.ULTRAWIDE.ordinal();
                } else {
                    iOrdinal = iOrdinal2;
                }
                break;
            default:
                iOrdinal = iOrdinal2;
                break;
        }
        zoomUi2.r(iOrdinal, null);
        kad kadVar2 = this.C;
        kadVar2.g(this.p, kadVar2.d(((Float) this.h.fA()).floatValue()));
        if (!this.C.i(((Float) this.h.fA()).floatValue()) || this.F != i2) {
            kad kadVar3 = this.C;
            ZoomUi zoomUi3 = this.p;
            float fFloatValue2 = ((Float) this.h.fA()).floatValue();
            Map mapF = kadVar3.f((jrl) kadVar3.a.fA());
            if (!kadVar3.i(fFloatValue2)) {
                boolean z = zoomUi3.getResources().getConfiguration().getLayoutDirection() == 1;
                float fC2 = kadVar3.c(fFloatValue2, ((Float) ((lce) kadVar3.c).d).floatValue());
                for (Map.Entry entry : ((oor) mapF).entrySet()) {
                    jrl jrlVar = jrl.UNINITIALIZED;
                    kag kagVar = kag.OFF;
                    switch ((kae) entry.getKey()) {
                        case ULTRAWIDE:
                            if (kadVar3.m(kae.WIDE, fC2)) {
                                kadVar3.g(zoomUi3, (kae) entry.getKey());
                                zoomUi3.l().setText(kadVar3.e(z, fFloatValue2, true));
                            }
                            break;
                        case WIDE:
                            if (kadVar3.j(kae.WIDE, fC2) && kadVar3.m(kae.TELE, fC2)) {
                                kadVar3.g(zoomUi3, (kae) entry.getKey());
                                zoomUi3.m().setText(kadVar3.e(z, fFloatValue2, true));
                            }
                            break;
                        case TELE:
                            if (kadVar3.j(kae.TELE, fC2) && kadVar3.l(fFloatValue2)) {
                                kadVar3.g(zoomUi3, (kae) entry.getKey());
                                zoomUi3.j().setText(kadVar3.e(z, fFloatValue2, true));
                            }
                            break;
                        case ULTRATELE:
                            if (kadVar3.j(kae.ULTRATELE, fC2) || kadVar3.k(fC2)) {
                                kadVar3.g(zoomUi3, (kae) entry.getKey());
                                zoomUi3.k().setText(kadVar3.e(z, fFloatValue2, true));
                            }
                            break;
                    }
                }
            } else {
                kadVar3.g(zoomUi3, kadVar3.d(fFloatValue2));
            }
        }
        this.F = i2;
    }

    final void r() {
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            if (this.w) {
                viewGroup.removeCallbacks(this.e);
            } else {
                viewGroup.removeCallbacks(this.f);
            }
        }
    }

    public final void s(boolean z) {
        if (!this.w || this.x) {
            if (z) {
                this.A.reverse();
            } else {
                this.B.setVisibility(8);
            }
        }
    }

    public final void t() {
        B(this.F);
    }

    public final void u() {
        if (!this.w || this.x) {
            return;
        }
        ZoomUi zoomUi = this.p;
        synchronized (ZoomUi.a) {
            int i = zoomUi.l;
            zoomUi.l = 1;
            SeekBar seekBarG = zoomUi.g();
            int dimensionPixelSize = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_seekbar_height);
            int dimensionPixelSize2 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_toggle_bar_margin_top);
            int dimensionPixelSize3 = (int) (zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_touch_area_expand) * zoomUi.f);
            int dimensionPixelSize4 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_seekbar_touch_area_width);
            int dimensionPixelSize5 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_seekbar_touch_area_height);
            int dimensionPixelSize6 = zoomUi.getResources().getDimensionPixelSize(R.dimen.zoom_seekbar_stroke_width);
            int i2 = ((dimensionPixelSize5 - dimensionPixelSize) / 2) + dimensionPixelSize6 + dimensionPixelSize6;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) seekBarG.getLayoutParams();
            layoutParams.width = (int) (dimensionPixelSize4 * zoomUi.f);
            layoutParams.height = dimensionPixelSize5;
            seekBarG.setLayoutParams(layoutParams);
            seekBarG.setMax(100000);
            seekBarG.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize2 + i2, dimensionPixelSize3, i2 - dimensionPixelSize2);
            if (zoomUi.e().getHeight() != dimensionPixelSize || zoomUi.e().getBackground() == null) {
                AnimatorSet animatorSetT = zoomUi.t(i, false);
                animatorSetT.addListener(new kan(zoomUi));
                ObjectAnimator objectAnimatorA = ZoomUi.a(zoomUi.b(), false);
                ObjectAnimator objectAnimatorA2 = ZoomUi.a(zoomUi.f(), false);
                objectAnimatorA2.addListener(new kao(zoomUi));
                ObjectAnimator objectAnimatorA3 = ZoomUi.a(zoomUi.n(), true);
                objectAnimatorA3.addListener(new kap(zoomUi));
                zoomUi.j = new AnimatorSet();
                zoomUi.j.play(objectAnimatorA).with(objectAnimatorA2);
                zoomUi.j.play(animatorSetT).after(objectAnimatorA);
                zoomUi.j.play(objectAnimatorA3).after(animatorSetT);
                AnimatorSet animatorSet = zoomUi.k;
                if (animatorSet != null && animatorSet.isRunning()) {
                    zoomUi.k.cancel();
                }
                zoomUi.j.start();
            }
        }
        r();
        w();
    }

    public final void v() {
        if (this.x) {
            return;
        }
        u();
        if (this.B.getVisibility() == 8) {
            this.A.start();
        }
    }

    public final void w() {
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            int integer = (!this.w || this.D) ? viewGroup.getResources().getInteger(R.integer.zoom_seekbar_timeout_ms) : viewGroup.getResources().getInteger(R.integer.zoom_togglebar_timeout_ms);
            if (this.v.k(ddl.aM)) {
                integer *= 10;
            }
            if (this.w) {
                this.B.postDelayed(this.e, integer);
            } else {
                this.B.postDelayed(this.f, integer);
            }
        }
    }

    public final void x() {
        if (this.i.getAccessibilityLiveRegion() != 0) {
            this.i.postDelayed(new kbm(this, 0), this.B.getResources().getInteger(R.integer.zoom_knob_talkback_assertiveness_off_delay_ms));
        }
    }

    public final void z(int i, float f, float f2) {
        this.z.M(i, f, f2, this.g.d());
    }
}
