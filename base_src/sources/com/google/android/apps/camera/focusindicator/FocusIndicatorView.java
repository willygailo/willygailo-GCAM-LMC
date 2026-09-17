package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.Fix.Pref;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.bnl;
import defpackage.duh;
import defpackage.dui;
import defpackage.duj;
import defpackage.dul;
import defpackage.dun;
import defpackage.duo;
import defpackage.dup;
import defpackage.dur;
import defpackage.duu;
import defpackage.duv;
import defpackage.ggm;
import defpackage.ggn;
import defpackage.ggp;
import defpackage.jrz;
import defpackage.jsj;
import defpackage.jsk;
import defpackage.ojc;
import defpackage.qmd;

/* JADX INFO: loaded from: classes.dex */
public class FocusIndicatorView extends RelativeLayout implements bnl {
    FocusIndicatorRingView a;
    duj b;
    dul c;
    TextView d;
    jsk e;
    jsk f;
    jsk g;
    jsk h;
    jsk i;
    jsk j;
    jsk k;
    jsk l;
    public Animator m;
    private final duo n;
    private final PointF o;
    private final int[] p;
    private volatile jrz q;
    private final Animator.AnimatorListener r;

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new PointF(0.0f, 0.0f);
        this.p = new int[2];
        this.r = new dun(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.focus_indicator_view_contents, this);
        duo duoVarS = s(context);
        this.n = duoVarS;
        dui duiVar = (dui) duoVarS;
        this.a = dur.b(duiVar.a);
        this.b = duu.b(duiVar.a);
        this.c = duv.b(duiVar.a);
        TextView textView = duiVar.a.d;
        qmd.ae(textView);
        this.d = textView;
        this.e = (jsk) duiVar.b.get();
        this.f = (jsk) duiVar.c.get();
        this.g = (jsk) duiVar.d.get();
        this.h = (jsk) duiVar.e.get();
        this.i = (jsk) duiVar.f.get();
        this.j = (jsk) duiVar.g.get();
        this.k = (jsk) duiVar.h.get();
        this.l = (jsk) duiVar.i.get();
        w(this.e);
        w(this.f);
        w(this.g);
        w(this.h);
        w(this.i);
        w(this.j);
    }

    FocusIndicatorView(Context context, FocusIndicatorRingView focusIndicatorRingView, duj dujVar, dul dulVar, TextView textView, jsk jskVar, jsk jskVar2, jsk jskVar3, jsk jskVar4, jsk jskVar5, jsk jskVar6) {
        super(context);
        this.o = new PointF(0.0f, 0.0f);
        this.p = new int[2];
        this.r = new dun(this);
        this.n = s(context);
        this.a = focusIndicatorRingView;
        this.b = dujVar;
        this.c = dulVar;
        this.d = textView;
        w(jskVar);
        this.e = jskVar;
        w(jskVar2);
        this.f = jskVar2;
        w(jskVar3);
        this.g = jskVar3;
        w(jskVar4);
        this.h = jskVar4;
        w(jskVar5);
        this.i = jskVar5;
        w(jskVar6);
        this.j = jskVar6;
    }

    private final PointF q(PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        int i = this.q.e;
        Matrix matrix = new Matrix();
        matrix.setRotate(i, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        return new PointF(fArr[0] * getWidth(), fArr[1] * getHeight());
    }

    private final PointF r(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(-this.o.x, -this.o.y);
        return pointF2;
    }

    private final duo s(Context context) {
        dup dupVar = new dup(context, this);
        duh duhVar = new duh();
        duhVar.a = dupVar;
        qmd.ad(duhVar.a, dup.class);
        return new dui(duhVar.a);
    }

    private final void t() {
        Animator animator = this.m;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.m.cancel();
        this.m = null;
    }

    private final void u() {
        this.c.d(0.0f);
        this.b.e(0.0f);
        this.a.invalidate();
    }

    private final void v(ojc ojcVar, int i) {
        if (!ojcVar.g()) {
            this.a.b(new PointF(getWidth() / 2, getHeight() / 2));
            return;
        }
        this.a.b(q((PointF) ojcVar.c()));
        double d = ((PointF) ojcVar.c()).x;
        Double.isNaN(d);
        if (Math.abs(d - 0.5d) < 0.001d) {
            double d2 = ((PointF) ojcVar.c()).y;
            Double.isNaN(d2);
            Math.abs(d2 - 0.5d);
        }
        x(i);
    }

    private final void w(jsk jskVar) {
        if (jskVar != null) {
            jskVar.b(this.r);
        }
    }

    private final void x(float f) {
        float f2;
        Resources resources = getContext().getResources();
        float f3 = resources.getDisplayMetrics().widthPixels;
        float f4 = resources.getDisplayMetrics().heightPixels;
        if (f > 1350.0f) {
            f = 1350.0f;
        } else if (f < 360.0f) {
            f = 360.0f;
        }
        float fMax = Math.max(f4, f3);
        float fMin = Math.min(f4, f3);
        float f5 = fMax / fMin;
        if (this.q.e == 0) {
            f2 = (f * fMin) / 1080.0f;
        } else {
            f2 = (f * fMax) / (f5 > 2.1f ? 2280 : 2060);
        }
        float fApplyDimension = TypedValue.applyDimension(0, f2 / 2.0f, resources.getDisplayMetrics());
        this.b.d(fApplyDimension);
        this.b.c(fApplyDimension / 2.0f);
    }

    @Override // defpackage.bnl
    public final jsj b() {
        Animator animator = this.m;
        return (animator == null || !animator.isRunning()) ? this.f.a() : jsk.a;
    }

    @Override // defpackage.bnl
    public final jsj c(PointF pointF) {
        t();
        u();
        this.a.b(r(pointF));
        return this.e.a();
    }

    @Override // defpackage.bnl
    public final jsj d() {
        Animator animator = this.m;
        return (animator == null || !animator.isRunning()) ? this.h.a() : jsk.a;
    }

    @Override // defpackage.bnl
    public final jsj e(ojc ojcVar, int i) {
        Animator animator = this.m;
        if (animator != null && animator.isRunning()) {
            return jsk.a;
        }
        u();
        v(ojcVar, i);
        return this.g.a();
    }

    @Override // defpackage.bnl
    public final jsj f() {
        Animator animator = this.m;
        return (animator == null || !animator.isRunning()) ? this.l.a() : jsk.a;
    }

    @Override // defpackage.lij
    public final /* synthetic */ void fB(Object obj) {
        ggp ggpVar = (ggp) obj;
        if (this.d.getVisibility() == 0) {
            TextView textView = this.d;
            ggn ggnVar = ggpVar.b;
            String strValueOf = String.valueOf(ggnVar.a);
            String strValueOf2 = String.valueOf(ggnVar.b);
            String string = ggnVar.e.g() ? ((ggm) ggnVar.e.c()).a.toString() : "?";
            String str = String.format("%.2f", Float.valueOf(ggnVar.c));
            boolean z = ggnVar.d;
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36 + String.valueOf(strValueOf2).length() + String.valueOf(string).length() + String.valueOf(str).length());
            sb.append("AF mode:");
            sb.append(strValueOf);
            sb.append(" state:");
            sb.append(strValueOf2);
            sb.append("\n roi:");
            sb.append(string);
            sb.append(" lens:");
            sb.append(str);
            sb.append(" sc:");
            sb.append(z);
            textView.setText(sb.toString());
        }
    }

    @Override // defpackage.bnl
    public final jsj g(PointF pointF) {
        t();
        u();
        this.a.b(r(pointF));
        return this.k.a();
    }

    @Override // defpackage.bnl
    public final void h() {
        t();
        u();
    }

    @Override // defpackage.bnl
    public final void i() {
        this.a.b(new PointF(getWidth() / 2, getHeight() / 2));
    }

    @Override // defpackage.bnl
    public final void j(boolean z) {
        setVisibility(true != z ? 4 : 0);
    }

    @Override // defpackage.bnl
    public final void k(ojc ojcVar, int i) {
        v(ojcVar, i);
        this.b.f(getContext().getResources().getDimension(R.dimen.active_focus_outer_ring_thickness));
        this.b.e(1.0f);
        this.a.invalidate();
    }

    @Override // defpackage.bnl
    public final void l(PointF pointF) {
        this.a.b(q(pointF));
    }

    @Override // defpackage.bnl
    public final void m(PointF pointF, float f) {
        PointF pointFQ = q(pointF);
        x(f);
        this.a.animate().translationXBy((pointFQ.x - this.a.getX()) - (this.a.getWidth() / 2)).translationYBy((pointFQ.y - this.a.getY()) - (this.a.getHeight() / 2)).setDuration(20L).start();
        this.a.invalidate();
    }

    @Override // defpackage.bnl
    public final boolean n(PointF pointF) {
        FocusIndicatorRingView focusIndicatorRingView = this.a;
        PointF pointFR = r(pointF);
        float f = pointFR.x - focusIndicatorRingView.c.x;
        float f2 = pointFR.y - focusIndicatorRingView.c.y;
        float f3 = focusIndicatorRingView.d;
        return (f * f) + (f2 * f2) <= f3 * f3;
    }

    @Override // defpackage.bnl
    public final void o() {
        this.d.setVisibility(Pref.MenuValue("pref_af_data_show_key") == 0 ? 8 : 0);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.p);
        PointF pointF = this.o;
        int[] iArr = this.p;
        pointF.set(iArr[0], iArr[1]);
        this.q = jrz.a(getDisplay(), getContext());
    }

    @Override // defpackage.bnl
    public final jsj p() {
        Animator animator = this.m;
        if (animator != null && animator.isRunning()) {
            return jsk.a;
        }
        u();
        this.a.b(new PointF(getWidth() / 2, getHeight() / 2));
        return this.g.a();
    }
}
