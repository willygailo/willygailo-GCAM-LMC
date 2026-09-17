package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class nzf {
    static final TimeInterpolator a = nwj.c;
    static final int[] b = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] d = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] e = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] f = {R.attr.state_enabled};
    static final int[] g = new int[0];
    private final nzt A;
    public obz h;
    public obu i;
    public Drawable j;
    public nyp k;
    public Drawable l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public int q;
    public Animator r;
    public nwm s;
    public nwm t;
    public int v;
    public final FloatingActionButton x;
    public ViewTreeObserver.OnPreDrawListener y;
    final nyv z;
    public float u = 1.0f;
    public int w = 0;
    private final Rect B = new Rect();
    private final RectF C = new RectF();
    private final RectF D = new RectF();
    private final Matrix E = new Matrix();

    public nzf(FloatingActionButton floatingActionButton, nyv nyvVar) {
        this.x = floatingActionButton;
        this.z = nyvVar;
        nzt nztVar = new nzt();
        this.A = nztVar;
        nztVar.a(o(new nzc(this)));
        nztVar.a(o(new nzb(this)));
        nztVar.a(o(new nzb(this)));
        nztVar.a(o(new nzb(this)));
        nztVar.a(o(new nzd(this)));
        nztVar.a(o(new nza(this)));
        floatingActionButton.getRotation();
    }

    private static final ValueAnimator o(nze nzeVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(60L);
        valueAnimator.addListener(nzeVar);
        valueAnimator.addUpdateListener(nzeVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float a() {
        return this.n;
    }

    public final AnimatorSet b(nwm nwmVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        nwmVar.b("opacity").b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        nwmVar.b("scale").b(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        nwmVar.b("scale").b(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        d(f4, this.E);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.x, new nwk(), new nyy(this), new Matrix(this.E));
        nwmVar.b("iconScale").b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        ohh.aa(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new nyz(this, this.x.getAlpha(), f2, this.x.getScaleX(), f3, this.x.getScaleY(), this.u, f4, new Matrix(this.E)));
        arrayList.add(valueAnimatorOfFloat);
        ohh.aa(animatorSet, arrayList);
        Context context = this.x.getContext();
        int integer = this.x.getContext().getResources().getInteger(com.google.android.GoogleCameraEngR18F1.R.integer.material_motion_duration_long_1);
        TypedValue typedValueG = obr.g(context, com.google.android.GoogleCameraEngR18F1.R.attr.motionDurationLong1);
        if (typedValueG != null && typedValueG.type == 16) {
            integer = typedValueG.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.x.getContext();
        TimeInterpolator pathInterpolator = nwj.b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(com.google.android.GoogleCameraEngR18F1.R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String strValueOf = String.valueOf(typedValue.string);
            if (obr.u(strValueOf, "cubic-bezier")) {
                String[] strArrSplit = obr.t(strValueOf, "cubic-bezier").split(",");
                int length = strArrSplit.length;
                if (length != 4) {
                    StringBuilder sb = new StringBuilder(111);
                    sb.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    sb.append(length);
                    throw new IllegalArgumentException(sb.toString());
                }
                pathInterpolator = new PathInterpolator(obr.s(strArrSplit, 0), obr.s(strArrSplit, 1), obr.s(strArrSplit, 2), obr.s(strArrSplit, 3));
            } else {
                if (!obr.u(strValueOf, "path")) {
                    String strValueOf2 = String.valueOf(strValueOf);
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Invalid motion easing type: ".concat(strValueOf2) : new String("Invalid motion easing type: "));
                }
                String strT = obr.t(strValueOf, "path");
                Path path = new Path();
                em[] emVarArrQ = et.q(strT);
                if (emVarArrQ != null) {
                    try {
                        em.a(emVarArrQ, path);
                    } catch (RuntimeException e2) {
                        throw new RuntimeException("Error in parsing " + strT, e2);
                    }
                } else {
                    path = null;
                }
                pathInterpolator = new PathInterpolator(path);
            }
        }
        animatorSet.setInterpolator(pathInterpolator);
        return animatorSet;
    }

    public final void d(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.x.getDrawable();
        if (drawable == null || this.v == 0) {
            return;
        }
        RectF rectF = this.C;
        RectF rectF2 = this.D;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f3 = this.v;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.v / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public void e(Rect rect) {
        int iC = this.m ? (this.q - this.x.c()) / 2 : 0;
        float fA = a() + this.p;
        int iMax = Math.max(iC, (int) Math.ceil(fA));
        int iMax2 = Math.max(iC, (int) Math.ceil(fA * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public void f(float f2, float f3, float f4) {
        throw null;
    }

    public final void g(float f2) {
        this.u = f2;
        Matrix matrix = this.E;
        d(f2, matrix);
        this.x.setImageMatrix(matrix);
    }

    public final void h(obz obzVar) {
        this.h = obzVar;
        obu obuVar = this.i;
        if (obuVar != null) {
            obuVar.b(obzVar);
        }
        nyp nypVar = this.k;
        if (nypVar != null) {
            nypVar.h = obzVar;
            nypVar.invalidateSelf();
        }
    }

    public final void i() {
        g(this.u);
    }

    public final void j() {
        Rect rect = this.B;
        e(rect);
        ew.d(this.l, "Didn't initialize content background");
        if (l()) {
            this.z.a(new InsetDrawable(this.l, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.z.a(this.l);
        }
        nyv nyvVar = this.z;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        nyvVar.a.c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = nyvVar.a;
        int i5 = floatingActionButton.a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public final void k(float f2) {
        obu obuVar = this.i;
        if (obuVar != null) {
            obuVar.g(f2);
        }
    }

    public boolean l() {
        return true;
    }

    public final boolean m() {
        return gl.V(this.x) && !this.x.isInEditMode();
    }

    final boolean n() {
        return !this.m || this.x.c() >= this.q;
    }
}
