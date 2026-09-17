package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jfj {
    private final ViewGroup I;
    public final ObjectAnimator c;
    public final ValueAnimator d;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Handler j;
    public Rect l;
    public jfg m;
    public lco q;
    public View w;
    public View x;
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/modeswitch/animation/ViewfinderCoverAnimator");
    private static final int G = Math.round(102.0f);
    private static final int H = Math.round(178.5f);
    static final int b = jbp.OFF.e;
    public ojc k = oih.a;
    public int n = 0;
    public ojc o = oih.a;
    public float p = 1.0f;
    public int r = -1;
    public lda s = lcz.a(Integer.valueOf(b));
    public ojc t = oih.a;
    public int F = 1;
    public jrl u = jrl.UNINITIALIZED;
    public int v = 0;
    public boolean y = true;
    public int z = 0;
    public ojc A = oih.a;
    public jfh B = new jfh() { // from class: jfc
        @Override // defpackage.jfh
        public final boolean a() {
            ouj oujVar = jfj.a;
            return false;
        }
    };
    private boolean J = false;
    public cwj C = new cwj() { // from class: jfb
        @Override // defpackage.cwj
        public final lwd d() {
            ouj oujVar = jfj.a;
            return lwd.BACK;
        }
    };
    public lwd D = lwd.BACK;
    public final List E = new ArrayList();
    private boolean K = false;
    public AnimatorSet f = new AnimatorSet();
    public final BaseInterpolator e = new AccelerateDecelerateInterpolator();

    public jfj(ViewGroup viewGroup) {
        this.I = viewGroup;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        this.c = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(60L);
        objectAnimatorOfFloat.addListener(new jfd(this));
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        Paint paint = new Paint();
        this.g = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.h = paint3;
        paint3.setAlpha(0);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, G);
        this.d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new jfa(this, 1));
        valueAnimatorOfInt.setDuration(60L);
        this.l = new Rect(0, 0, 1, 1);
        jff jffVarA = jfg.a();
        jffVarA.c(new Rect(0, 0, 1, 1));
        jffVarA.b(0);
        this.m = jffVarA.a();
        this.j = mip.bV(Looper.getMainLooper());
        viewGroup.setWillNotDraw(false);
    }

    public static float a(Rect rect) {
        if (rect.height() == 0.0f) {
            return 0.0f;
        }
        return rect.width() / rect.height();
    }

    public static ValueAnimator b(Rect rect, Rect rect2, TimeInterpolator timeInterpolator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(new Rect()), rect, rect2);
        valueAnimatorOfObject.setInterpolator(timeInterpolator);
        valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfObject;
    }

    public static void c(Canvas canvas, Rect rect, int i, Paint paint) {
        if (i <= 0) {
            canvas.drawRect(rect, paint);
        } else {
            float f = i;
            canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, f, f, paint);
        }
    }

    private final int q() {
        int i = this.v + 1;
        this.v = i;
        return i;
    }

    public final void d() {
        int i = this.r;
        if (i != -1) {
            this.s.fB(Integer.valueOf(i));
            this.r = -1;
        }
        this.F = 5;
        this.c.start();
    }

    public final void e() {
        this.I.setVisibility(8);
        this.F = 1;
        q();
        this.k = oih.a;
        this.I.setLayerType(0, null);
        if (this.K && this.A.g()) {
            ((gvb) this.A.c()).b(jfj.class);
            this.K = false;
        }
    }

    public final void f() {
        this.w.setVisibility(8);
    }

    public final void g() {
        this.x.setVisibility(8);
    }

    public final void h() {
        this.I.invalidate();
    }

    public final void i() {
        this.I.postInvalidateOnAnimation();
    }

    public final void j(Rect rect) {
        this.l.set(rect);
        i();
    }

    final void k(Runnable runnable) {
        this.t = ojc.i(runnable);
    }

    public final void l() {
        if (this.I.getVisibility() != 0) {
            this.c.cancel();
            this.I.setVisibility(0);
        }
        this.I.setAlpha(1.0f);
    }

    public final void m() {
        this.w.setVisibility(0);
    }

    public final void n(final jrl jrlVar, final Runnable runnable, final jfi jfiVar, final jfe jfeVar, final boolean z) {
        final Runnable runnable2 = new Runnable() { // from class: jey
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(jrlVar, runnable, jfiVar, jfeVar, z);
            }
        };
        if (this.F == 5) {
            final ojc ojcVar = this.t;
            k(new Runnable() { // from class: jez
                @Override // java.lang.Runnable
                public final void run() {
                    ojc ojcVar2 = ojcVar;
                    Runnable runnable3 = runnable2;
                    ouj oujVar = jfj.a;
                    if (ojcVar2.g()) {
                        ((Runnable) ojcVar2.c()).run();
                    }
                    runnable3.run();
                }
            });
            return;
        }
        final int iQ = q();
        k(runnable);
        if (this.A.g()) {
            ((gvb) this.A.c()).a(jfj.class);
            this.K = true;
        }
        this.I.setLayerType(2, null);
        this.y = jfiVar.i();
        this.J = o();
        this.D = this.C.d();
        if (this.r == -1) {
            this.r = ((Integer) this.s.fA()).intValue();
            this.s.fB(Integer.valueOf(b));
        }
        ojc ojcVarC = jfiVar.c();
        ojc ojcVarB = jfiVar.b();
        jrl jrlVar2 = this.u;
        this.d.removeAllListeners();
        this.u = jrlVar;
        this.p = ((Float) this.q.fA()).floatValue();
        int i = this.F;
        if (i == 5) {
            ((oug) ((oug) a.b()).G((char) 3310)).o("Somehow trying to go from FADING to WAITING_FOR_BITMAP: Illegal!");
            throw new IllegalStateException("Going from FADING to WAITING_FOR_BITMAP");
        }
        if (i == 1) {
            this.c.cancel();
            this.f.cancel();
            this.d.cancel();
            this.k = ojcVarC;
            if (ojcVarC.g()) {
                ((jnm) ojcVarC.c()).a.prepareToDraw();
                this.l = ((jnm) ojcVarC.c()).a();
                ojc ojcVarB2 = ojcVarB.b(imd.e);
                jnm jnmVar = (jnm) ojcVarC.c();
                Rect rect = (Rect) ojcVarB2.e(new Rect(0, 0, jnmVar.a.getWidth() * jnmVar.b, jnmVar.a.getHeight() * jnmVar.b));
                ojc ojcVar2 = ((jnm) ojcVarC.c()).c;
                if (ojcVar2.g()) {
                    Rect rect2 = new Rect((Rect) ojcVar2.c());
                    rect2.offset(rect.left, rect.top);
                    if (rect.contains(rect2)) {
                        rect = rect2;
                    } else {
                        ((oug) ((oug) a.c()).G(3306)).y("Source %s is not contained in preview box %s", rect2, rect);
                    }
                }
                jff jffVarA = jfg.a();
                jffVarA.c(rect);
                jffVarA.b(((Integer) ojcVarB.b(imd.d).e(0)).intValue());
                jfg jfgVarA = jffVarA.a();
                this.m = jfgVarA;
                this.z = jfgVarA.b;
                jrl jrlVar3 = jrl.MORE_MODES;
                int i2 = jrlVar2 == jrlVar3 ? H : 0;
                this.d.setIntValues(i2, jrlVar == jrlVar3 ? H : G);
                this.n = i2;
                this.F = 2;
                h();
            } else {
                this.F = 1;
            }
        } else if (ojcVarC.g()) {
            this.F = 2;
            h();
        } else {
            this.F = 1;
        }
        jfiVar.e();
        jfiVar.f();
        jfiVar.g(jrlVar);
        l();
        this.j.postDelayed(new Runnable() { // from class: jew
            @Override // java.lang.Runnable
            public final void run() {
                jfj jfjVar = this.a;
                if (iQ != jfjVar.v) {
                    return;
                }
                jfjVar.d();
            }
        }, 4000L);
        Runnable runnable3 = new Runnable() { // from class: jex
            @Override // java.lang.Runnable
            public final void run() {
                jfj jfjVar = this.a;
                int i3 = iQ;
                jfi jfiVar2 = jfiVar;
                boolean z2 = z;
                jrl jrlVar4 = jrlVar;
                jfe jfeVar2 = jfeVar;
                if (i3 != jfjVar.v) {
                    return;
                }
                jfjVar.d.start();
                jfiVar2.d(z2);
                int i4 = jfjVar.F;
                if (i4 == 1 || i4 != 2) {
                    jfeVar2.a(jrlVar4);
                } else {
                    jfjVar.F = 3;
                    jfeVar2.a(jrlVar4);
                }
            }
        };
        if (ojcVarC.g()) {
            this.o = ojc.i(runnable3);
        } else {
            runnable3.run();
        }
    }

    final boolean o() {
        jrl jrlVar = jrl.UNINITIALIZED;
        switch (this.u.ordinal()) {
            case 2:
                return this.B.a();
            default:
                return false;
        }
    }

    public final boolean p() {
        return o() && !this.J;
    }
}
