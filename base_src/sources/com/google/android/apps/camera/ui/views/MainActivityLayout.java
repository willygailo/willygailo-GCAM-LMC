package com.google.android.apps.camera.ui.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.evcomp.EvCompView;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.ui.layout.GcaLayout;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import com.google.android.apps.camera.zoomui.ZoomUi;
import defpackage.bys;
import defpackage.ctm;
import defpackage.cuj;
import defpackage.cwj;
import defpackage.dcu;
import defpackage.ddf;
import defpackage.ddv;
import defpackage.end;
import defpackage.eso;
import defpackage.eua;
import defpackage.fhv;
import defpackage.fie;
import defpackage.fik;
import defpackage.hnj;
import defpackage.idc;
import defpackage.img;
import defpackage.jbq;
import defpackage.jbr;
import defpackage.jbt;
import defpackage.jbu;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jcd;
import defpackage.jce;
import defpackage.jot;
import defpackage.jrl;
import defpackage.jrt;
import defpackage.jrz;
import defpackage.jsa;
import defpackage.jtw;
import defpackage.jzr;
import defpackage.lar;
import defpackage.lda;
import defpackage.lwd;
import defpackage.lzi;
import defpackage.mip;
import defpackage.nle;
import defpackage.obr;
import defpackage.oih;
import defpackage.ojc;
import defpackage.ojz;
import defpackage.pyn;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class MainActivityLayout extends GcaLayout implements fik, fie {
    private BreadcrumbsView A;
    private FrontLensIndicatorOverlay B;
    private CutoutBar C;
    private MoreModesGrid D;
    private BottomBar E;
    private OptionsMenuContainer F;
    private GradientBar G;
    private boolean H;
    private jrz I;
    private View J;
    public final Set e;
    public ZoomUi f;
    public MarsSwitch g;
    public EvCompView h;
    public ojc i;
    public ojc j;
    public ojc k;
    public ojc l;
    public ojc m;
    public ojc n;
    public ojc o;
    public ojc p;
    public ojc q;
    public AtomicReference r;
    public lda s;
    public img t;
    public ddf u;
    public pyn v;
    public lzi w;
    public fhv x;
    private final Set y;
    private ModeSwitcher z;

    /* JADX WARN: Multi-variable type inference failed */
    public MainActivityLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new HashSet();
        this.y = new HashSet();
        this.i = oih.a;
        this.j = oih.a;
        this.k = oih.a;
        this.l = oih.a;
        this.m = oih.a;
        this.n = oih.a;
        this.o = oih.a;
        this.p = oih.a;
        this.q = oih.a;
        this.J = null;
        ((jot) ((end) context).b(jot.class)).b(this);
        this.x.e(this);
    }

    private final jrz v(Context context, jce jceVar, int i, int i2) {
        if (jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
            return jrz.PORTRAIT;
        }
        boolean z = true;
        if ((context.getResources().getDisplayMetrics().heightPixels <= context.getResources().getDisplayMetrics().widthPixels || i2 <= i) && (context.getResources().getDisplayMetrics().heightPixels >= context.getResources().getDisplayMetrics().widthPixels || i2 >= i)) {
            z = false;
        }
        jrz jrzVarA = jrz.a(getDisplay(), context);
        if (this.I == null) {
            this.I = jrzVarA;
        }
        if (!z) {
            return this.I;
        }
        this.I = jrzVarA;
        return jrzVarA;
    }

    private final void w(Size size) {
        jbv jbvVarD = d();
        Size size2 = jbvVarD.b;
        jrz jrzVarV = size2 != null ? v(getContext(), jbvVarD.j, size2.getWidth(), size2.getHeight()) : jbvVarD.h;
        jbu jbuVarB = jbvVarD.b();
        jbuVarB.f(jrzVarV);
        jbuVarB.b = size;
        jce jceVar = d().j;
        int i = 0;
        if (((cwj) this.v.get()).d().equals(lwd.BACK)) {
            i = 90;
        } else if (!this.w.l || (!jceVar.equals(jce.TABLET_LAYOUT) && (!((Activity) getContext()).isInMultiWindowMode() || !jceVar.equals(jce.PHONE_LAYOUT)))) {
            i = 270;
        }
        jbuVarB.c = Integer.valueOf(i);
        jbuVarB.d();
        if (y(jbuVarB.a())) {
            requestLayout();
            invalidate();
        }
        if (this.j.g()) {
            ViewfinderCover viewfinderCover = ((eua) this.j.c()).a.P;
            if (viewfinderCover.j) {
                return;
            }
            viewfinderCover.j = true;
            viewfinderCover.requestLayout();
        }
    }

    private final void x() {
        this.H = true;
        post(new Runnable() { // from class: jos
            @Override // java.lang.Runnable
            public final void run() {
                MainActivityLayout mainActivityLayout = this.a;
                mainActivityLayout.invalidate();
                mainActivityLayout.requestLayout();
            }
        });
    }

    private final boolean y(jbv jbvVar) {
        if (this.r.get() != null && ((jbw) this.r.get()).a.equals(jbvVar) && !this.H) {
            return false;
        }
        this.H = false;
        jcd jcdVarA = null;
        if (!jbvVar.a()) {
            this.r.set(jbw.a(jbvVar, this.r.get() == null ? jbt.a : ((jbw) this.r.get()).b, null));
            x();
            return false;
        }
        Trace.beginSection("updateLayoutBoxes");
        boolean zK = this.u.k(dcu.J);
        this.u.k(ddv.e);
        jbt jbtVarC = jbr.c(jbvVar, jbvVar.j.equals(jce.SIMPLIFIED_LAYOUT), getContext(), this.t, new ojz() { // from class: jor
            @Override // defpackage.ojz
            public final Object a() {
                return this.a.getRootWindowInsets();
            }
        }, zK);
        if (jbtVarC.o) {
            x();
        }
        if (this.J != null) {
            jcdVarA = jbvVar.j.equals(jce.SIMPLIFIED_LAYOUT) ? jcd.a(new Size(jbtVarC.e.width(), jbtVarC.e.height()), new Rect(), new Rect(), 17) : jcd.a(new Size(jbtVarC.e.width(), jbtVarC.e.height()), new Rect(), new Rect(jbtVarC.e.left, jbtVarC.e.top, jbtVarC.b.getWidth() - jbtVarC.e.right, jbtVarC.b.getHeight() - jbtVarC.e.bottom), 51);
        }
        if (this.r.get() != null && jbtVarC.equals(((jbw) this.r.get()).b)) {
            jbtVarC = ((jbw) this.r.get()).b;
        }
        if (this.r.get() != null && Objects.equals(jcdVarA, ((jbw) this.r.get()).c)) {
            jcdVarA = ((jbw) this.r.get()).c;
        }
        this.r.set(jbw.a(jbvVar, jbtVarC, jcdVarA));
        Trace.endSection();
        return true;
    }

    public final jbv d() {
        return this.r.get() == null ? jbv.a : ((jbw) this.r.get()).a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            Trace.beginSection("MAL.dispatchApplyWindowInsets");
            return super.dispatchApplyWindowInsets(windowInsets);
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        Trace.beginSection("MAL.dispatchConfigurationChanged");
        nle.h(getContext());
        super.dispatchConfigurationChanged(configuration);
        nle.i();
        Trace.endSection();
    }

    public final void e(jrt jrtVar) {
        this.y.add(jrtVar);
    }

    public final void f() {
        View view = this.J;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
            this.J = null;
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        requestLayout();
    }

    public final void g(View view) {
        this.J = view;
        if (this.r.get() != null) {
            this.r.set(jbw.a(jbv.a, ((jbw) this.r.get()).b, null));
        }
        requestLayout();
        invalidate();
    }

    public final void h(int i, int i2) {
        w(new Size(i, i2));
    }

    public final void i() {
        Size size = d().b;
        if (size == null) {
            w(null);
        } else {
            w(new Size(Math.max(size.getWidth(), size.getHeight()), Math.min(size.getWidth(), size.getHeight())));
        }
    }

    public final void j() {
        jbv jbvVarD = d();
        if (!this.l.g() || jbvVarD.h == null) {
            return;
        }
        ((bys) this.l.c()).i(jbvVarD.h);
    }

    public final void k(jrz jrzVar) {
        EvCompView evCompView = this.h;
        if (evCompView == null || jrzVar == null) {
            return;
        }
        evCompView.j = jrzVar;
        evCompView.f(jrzVar);
    }

    public final void l() {
        jbv jbvVarD = d();
        if (!this.m.g() || jbvVarD.h == null) {
            return;
        }
        jbq jbqVar = (jbq) this.m.c();
        jrz jrzVar = jbvVarD.h;
        ToggleUi toggleUi = jbqVar.b;
        if (toggleUi != null) {
            toggleUi.a(jrzVar);
        }
    }

    public final void m(jrz jrzVar) {
        if (!this.p.g() || jrzVar == null) {
            return;
        }
        ((jzr) this.p.c()).g(jrzVar);
    }

    public final void n(jrz jrzVar) {
        MarsSwitch marsSwitch = this.g;
        if (marsSwitch == null || jrzVar == null) {
            return;
        }
        marsSwitch.a(jrzVar);
    }

    public final void o(jrz jrzVar) {
        if (!this.n.g() || jrzVar == null) {
            return;
        }
        ((ctm) this.n.c()).g(jrzVar);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.G = (GradientBar) findViewById(R.id.gradient_bar);
        this.C = (CutoutBar) findViewById(R.id.cutout_bar);
        this.B = (FrontLensIndicatorOverlay) findViewById(R.id.front_lens_indicator_overlay);
        this.z = (ModeSwitcher) findViewById(R.id.mode_switcher);
        this.A = (BreadcrumbsView) findViewById(R.id.breadcrumbs_ui);
        this.D = (MoreModesGrid) findViewById(R.id.more_modes_grid);
        this.E = (BottomBar) findViewById(R.id.bottom_bar);
        this.F = (OptionsMenuContainer) findViewById(R.id.options_menu_container);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        for (mip mipVar : this.e) {
            if (mipVar.gj(motionEvent) && mipVar.p(new jtw(motionEvent, getRootView()))) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.r.get() == null) {
                    z = false;
                } else {
                    Rect rect = ((jbw) this.r.get()).b.i;
                    z = x > ((float) rect.left) && x < ((float) rect.right) && y > ((float) rect.top) && y < ((float) rect.bottom);
                }
                z2 |= !z;
            }
        }
        return z2 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        nle.i();
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, android.support.constraint.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int width;
        int width2;
        Trace.beginSection("MAL.onMeasurePrologue");
        Context context = getContext();
        nle.h(context);
        Size size = new Size(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        jce jceVarEC = mip.eC(getContext(), getDisplay());
        jrz jrzVarV = v(context, jceVarEC, size.getWidth(), size.getHeight());
        jbv jbvVarD = d();
        Size size2 = jbvVarD.c;
        Integer num = jbvVarD.e;
        jbu jbuVarB = jbvVarD.b();
        jbuVarB.f(jrzVarV);
        jbuVarB.a = size;
        jbuVarB.e((jrl) this.s.fA());
        boolean z = false;
        if (!this.w.c && jsa.d(this)) {
            z = true;
        }
        jbuVarB.c(z);
        if (size2 != null) {
            size = size2;
        }
        jbuVarB.b = size;
        jbuVarB.b(jceVarEC);
        jbuVarB.c = Integer.valueOf(num != null ? num.intValue() : 90);
        jbv jbvVarA = jbuVarB.a();
        obr.ap(jbvVarA.a());
        if (y(jbvVarA)) {
            this.E.setUiOrientation(jbvVarA.h, jceVarEC);
            ModeSwitcher modeSwitcher = this.z;
            jrz jrzVar = jbvVarA.h;
            if (modeSwitcher.g != jrzVar) {
                modeSwitcher.g = jrzVar;
                modeSwitcher.d();
            }
            MoreModesGrid moreModesGrid = this.D;
            jrz jrzVar2 = jbvVarA.h;
            if (!moreModesGrid.c.g()) {
                moreModesGrid.c = ojc.i(jrzVar2 == jrz.PORTRAIT ? jrz.LANDSCAPE : jrz.PORTRAIT);
            }
            moreModesGrid.d = jrzVar2;
            BreadcrumbsView breadcrumbsView = this.A;
            jrz jrzVar3 = jbvVarA.h;
            if (breadcrumbsView.d != jrzVar3) {
                breadcrumbsView.d = jrzVar3;
                breadcrumbsView.d();
            }
            if (jrz.b(jrzVarV)) {
                width = ((jbw) this.r.get()).b.e.top;
                width2 = ((jbw) this.r.get()).b.d.top;
            } else if (jrzVarV == jrz.LANDSCAPE) {
                width = ((jbw) this.r.get()).b.e.left;
                width2 = ((jbw) this.r.get()).b.d.left;
            } else {
                width = ((jbw) this.r.get()).b.b.getWidth() - ((jbw) this.r.get()).b.e.right;
                width2 = ((jbw) this.r.get()).b.b.getWidth() - ((jbw) this.r.get()).b.d.right;
            }
            this.F.q(jbvVarA.h, width - width2);
            o(jbvVarA.h);
            s(jbvVarA.h);
            p(jbvVarA.h);
            n(jbvVarA.h);
            k(jbvVarA.h);
            m(jbvVarA.h);
            GradientBar gradientBar = this.G;
            jrz jrzVar4 = jbvVarA.h;
            if (gradientBar.a != jrzVar4) {
                gradientBar.a = jrzVar4;
                gradientBar.a();
            }
            CutoutBar cutoutBar = this.C;
            jrz jrzVar5 = jbvVarA.h;
            if (cutoutBar.f != jrzVar5) {
                cutoutBar.f = jrzVar5;
                cutoutBar.a();
            }
            FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.B;
            jrz jrzVar6 = jbvVarA.h;
            if (frontLensIndicatorOverlay.o != jrzVar6) {
                frontLensIndicatorOverlay.o = jrzVar6;
                frontLensIndicatorOverlay.a();
            }
            t(jceVarEC);
            q();
            r();
            j();
            l();
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                ((jrt) it.next()).k(jbvVarA.h);
            }
        }
        Trace.endSection();
        super.onMeasure(i, i2);
    }

    public final void p(jrz jrzVar) {
        if (!this.q.g() || jrzVar == null) {
            return;
        }
        ((eso) this.q.c()).b(jrzVar);
    }

    public final void q() {
        jbv jbvVarD = d();
        if (!this.i.g() || jbvVarD.h == null) {
            return;
        }
        ((hnj) this.i.c()).y(jbvVarD.h);
    }

    public final void r() {
        jbv jbvVarD = d();
        if (!this.k.g() || jbvVarD.h == null) {
            return;
        }
        ((idc) this.k.c()).g(jbvVarD.h);
    }

    public final void s(jrz jrzVar) {
        if (!this.o.g() || jrzVar == null) {
            return;
        }
        ((cuj) this.o.c()).j(jrzVar);
    }

    public final void t(jce jceVar) {
        jbv jbvVarD = d();
        if (this.f == null || jbvVarD.h == null) {
            return;
        }
        if (jceVar.equals(jce.PHONE_LAYOUT) || jceVar.equals(jce.SIMPLIFIED_LAYOUT)) {
            this.f.q(jbvVarD.h);
            return;
        }
        ZoomUi zoomUi = this.f;
        jrz jrzVar = jbvVarD.h;
        zoomUi.q((jrzVar == jrz.PORTRAIT || jrzVar == jrz.REVERSE_PORTRAIT) ? jrz.LANDSCAPE : jrz.PORTRAIT);
    }

    public final void u(mip mipVar) {
        lar.a();
        this.e.add(mipVar);
    }
}
