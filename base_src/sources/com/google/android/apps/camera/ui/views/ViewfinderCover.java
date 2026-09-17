package com.google.android.apps.camera.ui.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import defpackage.bpx;
import defpackage.cwh;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.isd;
import defpackage.jbw;
import defpackage.jfa;
import defpackage.jfe;
import defpackage.jff;
import defpackage.jfg;
import defpackage.jfi;
import defpackage.jfj;
import defpackage.jnm;
import defpackage.jpa;
import defpackage.jpb;
import defpackage.jri;
import defpackage.jrl;
import defpackage.jrz;
import defpackage.lhs;
import defpackage.lwd;
import defpackage.oih;
import defpackage.ojc;
import defpackage.oug;
import defpackage.ouj;
import defpackage.pht;
import defpackage.pih;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class ViewfinderCover extends GcaLayout implements jfi, cwh {
    private static final ouj k = ouj.h("com/google/android/apps/camera/ui/views/ViewfinderCover");
    public ImageView e;
    public AnimatedVectorDrawable f;
    public boolean g;
    public Callable h;
    public final jfj i;
    public boolean j;
    private TextView l;
    private final ddf m;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewfinderCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = true;
        this.j = false;
        this.i = new jfj(this);
        this.m = ((bpx) context).a();
    }

    private final int p(Rect rect) {
        Object objA = this.d.a();
        if (objA != null && this.m.k(ddl.aU)) {
            if ((((jbw) objA).a.h == jrz.PORTRAIT ? lhs.i(rect.height(), rect.width()) : lhs.i(rect.width(), rect.height())).equals(lhs.b)) {
                return getResources().getDimensionPixelSize(R.dimen.viewfinder_rounded_corner_radius);
            }
        }
        return 0;
    }

    @Override // defpackage.cwh
    public final pht a(lwd lwdVar) {
        this.f = (AnimatedVectorDrawable) getResources().getDrawable(lwdVar == lwd.BACK ? R.drawable.camera_front_back_animation : R.drawable.camera_back_front_animation, null);
        final pih pihVarF = pih.f();
        this.i.n(jrl.UNINITIALIZED, isd.k, new jpa(this), new jfe() { // from class: joy
            @Override // defpackage.jfe
            public final void a(jrl jrlVar) {
                pihVarF.o(null);
            }
        }, false);
        return pihVarF;
    }

    @Override // defpackage.jfi
    public final ojc b() {
        Object objA = this.d.a();
        if (objA == null) {
            return oih.a;
        }
        Rect rect = ((jbw) objA).b.e;
        jff jffVarA = jfg.a();
        jffVarA.c(rect);
        jffVarA.b(p(rect));
        return ojc.i(jffVarA.a());
    }

    @Override // defpackage.jfi
    public final ojc c() {
        try {
            return (ojc) this.h.call();
        } catch (Exception e) {
            ((oug) ((oug) ((oug) k.b()).h(e)).G((char) 3472)).o("Failed to create snapshot");
            return oih.a;
        }
    }

    @Override // defpackage.jfi
    public final void d(boolean z) {
        jfj jfjVar = this.i;
        jfjVar.w.setAlpha(0.0f);
        jfjVar.m();
        jfjVar.w.animate().alpha(1.0f).setDuration(60L).start();
        if (z) {
            jfjVar.x.setAlpha(0.0f);
            jfjVar.x.setVisibility(0);
            jfjVar.x.animate().alpha(1.0f).setDuration(60L).start();
        }
    }

    @Override // defpackage.jfi
    public final void e() {
        this.i.f();
    }

    @Override // defpackage.jfi
    public final void f() {
        this.i.g();
    }

    @Override // defpackage.jfi
    public final void g(jrl jrlVar) {
        ImageView imageView = this.e;
        String strD = null;
        Drawable drawableA = (jrlVar == null || jrlVar == jrl.UNINITIALIZED) ? null : jri.b(jrlVar).a(getResources());
        imageView.setImageDrawable(drawableA);
        TextView textView = this.l;
        if (jrlVar != null && jrlVar != jrl.UNINITIALIZED) {
            strD = jri.b(jrlVar).d(getResources());
        }
        textView.setText(strD);
    }

    @Override // defpackage.jfi
    public final boolean h() {
        return this.g;
    }

    @Override // defpackage.jfi
    public final boolean i() {
        return true;
    }

    public final void j() {
        jfj jfjVar = this.i;
        jrl jrlVar = jrl.UNINITIALIZED;
        int i = jfjVar.F;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 3:
                jfjVar.d();
                return;
            default:
                return;
        }
    }

    public final void k() {
        this.i.e();
    }

    public final void l() {
        this.i.l();
    }

    public final void m(jrl jrlVar, final jpb jpbVar, Runnable runnable) {
        jfj jfjVar = this.i;
        jpbVar.getClass();
        jfjVar.n(jrlVar, runnable, this, new jfe() { // from class: jox
            @Override // defpackage.jfe
            public final void a(jrl jrlVar2) {
                jpbVar.a(jrlVar2);
            }
        }, false);
    }

    public final void n(jrl jrlVar, Runnable runnable) {
        o(jrlVar, runnable, false);
    }

    public final void o(jrl jrlVar, final Runnable runnable, boolean z) {
        this.i.n(jrlVar, isd.l, this, new jfe() { // from class: joz
            @Override // defpackage.jfe
            public final void a(jrl jrlVar2) {
                runnable.run();
            }
        }, z);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        jfj jfjVar = this.i;
        if (!jfjVar.k.g()) {
            canvas.drawColor(0);
            return;
        }
        if (jfjVar.z > 0) {
            canvas.saveLayer(null, null, 31);
            jfj.c(canvas, jfjVar.m.a, jfjVar.z, jfjVar.i);
        }
        canvas.drawBitmap(((jnm) jfjVar.k.c()).a, jfjVar.l, jfjVar.m.a, jfjVar.g);
        if (jfjVar.z > 0) {
            canvas.restore();
        }
        int i = jfjVar.n;
        if (i > 0) {
            jfjVar.h.setAlpha(i);
            jfj.c(canvas, jfjVar.m.a, jfjVar.z, jfjVar.h);
        }
        if (jfjVar.o.g()) {
            jfjVar.j.post((Runnable) jfjVar.o.c());
            jfjVar.o = oih.a;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (ImageView) findViewById(R.id.viewfinder_cover_icon);
        this.l = (TextView) findViewById(R.id.viewfinder_cover_title);
        jfj jfjVar = this.i;
        jfjVar.w = this.e;
        jfjVar.x = this.l;
        jfjVar.f();
        this.i.g();
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float fHeight;
        int iRound;
        int iRound2;
        super.onLayout(z, i, i2, i3, i4);
        Object objA = this.d.a();
        if (!this.j || objA == null) {
            return;
        }
        jbw jbwVar = (jbw) objA;
        if (jbwVar.b.o) {
            return;
        }
        this.j = false;
        jff jffVarA = jfg.a();
        jffVarA.c(jbwVar.b.e);
        jffVarA.b(p(jbwVar.b.e));
        jfg jfgVarA = jffVarA.a();
        jfj jfjVar = this.i;
        if (jfjVar.F != 3) {
            return;
        }
        if (!h()) {
            jfjVar.F = 4;
            return;
        }
        jfjVar.F = 4;
        if (jfjVar.k.g()) {
            float fFloatValue = jfjVar.D != jfjVar.C.d() ? jfjVar.p : ((Float) jfjVar.q.fA()).floatValue();
            if (jfjVar.p <= fFloatValue) {
                jfjVar.q.fA();
                if (jfgVarA.a.equals(jfjVar.m.a)) {
                    Rect rect = jfjVar.m.a;
                    if (jfjVar.y) {
                        float f2 = jfjVar.p;
                        if (f2 <= fFloatValue) {
                            Rect rect2 = jfjVar.l;
                            if (jfjVar.p()) {
                                fFloatValue /= 0.8f;
                            }
                            float f3 = f2 / fFloatValue;
                            int iRound3 = Math.round(rect2.width() * f3);
                            int iRound4 = Math.round(rect2.height() * f3);
                            int iCenterX = rect2.centerX();
                            int iCenterY = rect2.centerY();
                            int i5 = iRound3 / 2;
                            int i6 = iRound4 / 2;
                            Rect rect3 = new Rect(iCenterX - i5, iCenterY - i6, iCenterX + i5, iCenterY + i6);
                            if (rect3.left < 0 || rect3.top < 0) {
                                return;
                            }
                            jfjVar.f.cancel();
                            jfjVar.f = new AnimatorSet();
                            jfjVar.f.playTogether(jfj.b(jfjVar.l, rect3, jfjVar.e, new jfa(jfjVar, 0)));
                            jfjVar.f.setDuration(300L);
                            jfjVar.f.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                Rect rectA = ((jnm) jfjVar.k.c()).a();
                Rect rect4 = jfjVar.l;
                if (!rect4.equals(rectA)) {
                    if (rect4.height() > rect4.width()) {
                        iRound = rectA.height();
                        iRound2 = Math.round(iRound * jfj.a(rect4));
                    } else {
                        int iWidth = rectA.width();
                        iRound = Math.round(iWidth / jfj.a(rect4));
                        iRound2 = iWidth;
                    }
                    int iCenterX2 = rectA.centerX();
                    int iCenterY2 = rectA.centerY();
                    int i7 = iRound2 / 2;
                    int i8 = iRound / 2;
                    rect4 = new Rect(iCenterX2 - i7, iCenterY2 - i8, iCenterX2 + i7, iCenterY2 + i8);
                }
                jnm jnmVar = (jnm) jfjVar.k.c();
                Rect rect5 = jfgVarA.a;
                int iWidth2 = rect5.width();
                int i9 = jnmVar.b;
                int i10 = iWidth2 / (i9 + i9);
                int iHeight = rect5.height();
                int i11 = jnmVar.b;
                int i12 = iHeight / (i11 + i11);
                int iCenterX3 = rect5.centerX() / jnmVar.b;
                int iCenterY3 = rect5.centerY() / jnmVar.b;
                Rect rect6 = new Rect(iCenterX3 - i10, iCenterY3 - i12, iCenterX3 + i10, iCenterY3 + i12);
                float f4 = true != jfjVar.p() ? 1.0f : 0.8f;
                float fA = jfj.a(rect4);
                float fA2 = jfj.a(rect6);
                if (fA2 == 0.0f) {
                    ((oug) ((oug) jfj.a.c()).G((char) 3285)).r("Invalid aspect ratio in fitToRect: %s", rect6);
                } else {
                    if (fA2 < fA) {
                        fHeight = rect4.height();
                        f = fA2 * fHeight;
                    } else {
                        float fWidth = rect4.width();
                        float f5 = fWidth / fA2;
                        f = fWidth;
                        fHeight = f5;
                    }
                    int iCenterX4 = rect4.centerX();
                    int iCenterY4 = rect4.centerY();
                    int iRound5 = Math.round((f / 2.0f) * f4);
                    int iRound6 = Math.round((fHeight / 2.0f) * f4);
                    rect4 = new Rect(iCenterX4 - iRound5, iCenterY4 - iRound6, iCenterX4 + iRound5, iCenterY4 + iRound6);
                }
                jfjVar.f.cancel();
                jfjVar.f = new AnimatorSet();
                AnimatorSet animatorSet = jfjVar.f;
                int i13 = jfjVar.m.b;
                int i14 = jfgVarA.b;
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                jfa jfaVar = new jfa(jfjVar, 4);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i13, i14);
                valueAnimatorOfInt.setInterpolator(decelerateInterpolator);
                valueAnimatorOfInt.addUpdateListener(jfaVar);
                animatorSet.playTogether(jfj.b(jfjVar.m.a, jfgVarA.a, jfjVar.e, new jfa(jfjVar, 2)), jfj.b(jfjVar.l, rect4, jfjVar.e, new jfa(jfjVar, 3)), valueAnimatorOfInt);
                jfjVar.f.setDuration(120L);
                jfjVar.f.start();
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
