package com.google.android.apps.camera.optionsbar.view;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.Fix.Pref;
import com.Helper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import defpackage.bpx;
import defpackage.dcw;
import defpackage.dcy;
import defpackage.ddf;
import defpackage.ddl;
import defpackage.ddv;
import defpackage.elw;
import defpackage.gtu;
import defpackage.gtz;
import defpackage.gug;
import defpackage.guh;
import defpackage.guj;
import defpackage.guk;
import defpackage.gum;
import defpackage.gun;
import defpackage.guq;
import defpackage.htf;
import defpackage.huj;
import defpackage.iem;
import defpackage.jgu;
import defpackage.jrl;
import defpackage.jru;
import defpackage.jrz;
import defpackage.jsh;
import defpackage.mip;
import defpackage.obr;
import defpackage.ouj;
import defpackage.pht;
import defpackage.pih;
import defpackage.plk;
import j$.util.Collection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class OptionsMenuContainer extends RelativeLayout {
    public static final ouj a = ouj.h("com/google/android/apps/camera/optionsbar/view/OptionsMenuContainer");
    private int A;
    private Animator B;
    private final DisplayMetrics C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    public jrz b;
    public final jsh c;
    public final ImageButton d;
    public ImageButton e;
    public boolean f;
    public final boolean g;
    public final boolean h;
    public final GestureDetector i;
    public final GestureDetector j;
    public final Context k;
    public final ArrayList l;
    public AlertDialog m;
    public final Animator n;
    public final Animator o;
    public ImageButton p;
    public AnimatedVectorDrawable q;
    public VectorDrawable r;
    public boolean s;
    public huj t;
    public boolean u;
    public jgu v;
    public jgu w;
    public elw x;
    public boolean y;
    public int z;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsMenuContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = 0;
        this.b = jrz.PORTRAIT;
        this.m = null;
        this.s = false;
        this.u = false;
        this.y = false;
        this.c = new jsh(this);
        this.i = new GestureDetector(context, new gum(this));
        this.j = new GestureDetector(context, new gun(this));
        this.l = new ArrayList();
        this.n = AnimatorInflater.loadAnimator(context, R.animator.ic_red_circle_fade_in_animator);
        this.o = AnimatorInflater.loadAnimator(context, R.animator.ic_red_circle_fade_out_animator);
        this.d = new ImageButton(context, null, 0, R.style.options_bar_rightside_option);
        this.k = context;
        if (context instanceof bpx) {
            ddf ddfVarA = ((bpx) context).a();
            this.g = ddfVarA.k(ddv.e);
            this.h = ddfVarA.k(ddl.ay);
        } else {
            this.g = false;
            this.h = false;
        }
        this.C = context.getResources().getDisplayMetrics();
    }

    private final View B() {
        return findViewById(R.id.options_menu_top_bar);
    }

    private final void C(elw elwVar, jrz jrzVar) {
        if (elwVar == null || this.y) {
            return;
        }
        htf htfVar = htf.OFF;
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (jrzVar.ordinal()) {
            case 1:
                this.v.s(this.k.getResources().getString(R.string.external_mic_right));
                break;
            case 2:
                this.v.s(this.k.getResources().getString(R.string.external_mic_left));
                break;
            default:
                this.v.s(this.k.getResources().getString(R.string.external_mic_portrait));
                break;
        }
    }

    private final void D(int i) {
        ddf ddfVarA = ((bpx) this.k).a();
        dcw dcwVarA = dcy.a(ddfVarA, ((Integer) ddfVarA.a(dcy.a).c()).intValue());
        boolean z = false;
        if (dcwVarA.d != 0.0f) {
            float f = i;
            if (Math.abs(dcwVarA.a - (f / 2.0f)) < f / 5.0f) {
                z = true;
            }
        }
        View viewB = this.g ? b() : f();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewB.getLayoutParams();
        int i2 = layoutParams.gravity;
        if (z) {
            layoutParams.gravity = 19;
        } else {
            layoutParams.gravity = 19;
        }
        if (i2 != layoutParams.gravity) {
            viewB.setLayoutParams(layoutParams);
        }
    }

    public final boolean A() {
        return d().getVisibility() == 0;
    }

    public final View a() {
        return findViewById(R.id.minibar);
    }

    public final View b() {
        return findViewById(R.id.minibar_container);
    }

    public final View c() {
        return findViewById(R.id.options_menu_separate_line);
    }

    public final View d() {
        return findViewById(R.id.options_menu_view);
    }

    public final View e() {
        return findViewById(R.id.options_menu_standalone_settings);
    }

    public final FrameLayout f() {
        return (FrameLayout) findViewById(R.id.options_menu_closed);
    }

    public final ImageButton g() {
        return (ImageButton) findViewById(R.id.motion_photo_animator);
    }

    public final FrameLayout getFrameLayout(int i) {
        return (FrameLayout) findViewById(i);
    }

    public final void getVisibityButtons() {
        switch (Pref.MenuValue("pref_aux_layout")) {
            case 0:
            default:
                if (Helper.sModeTo != jrl.MORE_MODES) {
                    getFrameLayout(R.id.aux_butt_horizontal).setVisibility(8);
                    getFrameLayout(R.id.aux_butt_vertical).setVisibility(0);
                } else {
                    getFrameLayout(R.id.aux_butt_horizontal).setVisibility(8);
                    getFrameLayout(R.id.aux_butt_vertical).setVisibility(8);
                }
                break;
            case 1:
                if (Helper.sModeTo != jrl.MORE_MODES) {
                    getFrameLayout(R.id.aux_butt_horizontal).setVisibility(0);
                    getFrameLayout(R.id.aux_butt_vertical).setVisibility(8);
                } else {
                    getFrameLayout(R.id.aux_butt_horizontal).setVisibility(8);
                    getFrameLayout(R.id.aux_butt_vertical).setVisibility(8);
                }
                break;
        }
        if (Helper.sModeTo == jrl.LONG_EXPOSURE) {
        }
    }

    public final ImageButton h() {
        return (ImageButton) findViewById(R.id.options_menu_closed_icon);
    }

    public final ImageButton i() {
        return (ImageButton) findViewById(R.id.retouching_indicator);
    }

    public final ImageView j() {
        return (ImageView) findViewById(R.id.options_menu_capturing_background);
    }

    public final ImageView k() {
        return (ImageView) findViewById(R.id.options_menu_closed_background);
    }

    public final RelativeLayout l() {
        return (RelativeLayout) findViewById(R.id.options_menu_middle_bar);
    }

    public final RelativeLayout m() {
        return (RelativeLayout) findViewById(R.id.options_menu_setting_bar);
    }

    public final OptionsMenuView n() {
        return (OptionsMenuView) findViewById(R.id.options_menu_view_internal);
    }

    public final pht o() {
        if (this.p == null || !this.s) {
            return plk.V(true);
        }
        pih pihVarF = pih.f();
        this.o.addListener(new guk(this, pihVarF));
        this.n.cancel();
        this.o.setTarget(this.r);
        this.o.start();
        this.s = false;
        return pihVarF;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenuContainer:inflate");
        super.onFinishInflate();
        this.D = getResources().getDimensionPixelSize(R.dimen.standalone_settings_height);
        this.z = getResources().getDimensionPixelSize(R.dimen.options_menu_top_bar_size);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.options_menu_internal_vertical_padding);
        this.E = dimensionPixelOffset + dimensionPixelOffset;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.options_side_padding);
        this.F = dimensionPixelOffset2 + dimensionPixelOffset2;
        this.G = getResources().getDimensionPixelOffset(R.dimen.standalone_settings_top_margin);
        this.H = getResources().getDimensionPixelSize(R.dimen.options_row_height);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.options_menu_container, this);
        final int i = 1;
        setLayerType(1, null);
        this.n.addListener(new guh(this));
        f().setOnTouchListener(new View.OnTouchListener(this) { // from class: gue
            public final /* synthetic */ OptionsMenuContainer a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i) {
                    case 0:
                        return this.a.j.onTouchEvent(motionEvent);
                    default:
                        OptionsMenuContainer optionsMenuContainer = this.a;
                        if (motionEvent.getAction() == 0) {
                            view.animate().scaleX(1.1f).scaleY(1.1f).alpha(1.0f).start();
                        } else if (motionEvent.getAction() == 1) {
                            view.animate().scaleX(1.0f).scaleY(1.0f).alpha(0.72f).start();
                        }
                        return optionsMenuContainer.i.onTouchEvent(motionEvent);
                }
            }
        });
        f().setOnClickListener(new View.OnClickListener() { // from class: gud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w();
            }
        });
        final int i2 = 0;
        setOnTouchListener(new View.OnTouchListener(this) { // from class: gue
            public final /* synthetic */ OptionsMenuContainer a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (i2) {
                    case 0:
                        return this.a.j.onTouchEvent(motionEvent);
                    default:
                        OptionsMenuContainer optionsMenuContainer = this.a;
                        if (motionEvent.getAction() == 0) {
                            view.animate().scaleX(1.1f).scaleY(1.1f).alpha(1.0f).start();
                        } else if (motionEvent.getAction() == 1) {
                            view.animate().scaleX(1.0f).scaleY(1.0f).alpha(0.72f).start();
                        }
                        return optionsMenuContainer.i.onTouchEvent(motionEvent);
                }
            }
        });
        f().setAlpha(0.72f);
        n().m = new gug(this);
        f().setClickable(true);
        if (this.g) {
            FrameLayout frameLayoutF = f();
            frameLayoutF.setVisibility(8);
            frameLayoutF.setOnTouchListener(null);
            frameLayoutF.setOnClickListener(null);
            frameLayoutF.setClickable(false);
            frameLayoutF.setAlpha(0.0f);
        } else if (this.h) {
            k().setBackgroundResource(R.drawable.options_icon_background);
            h().getDrawable().setTint(mip.dO(this));
        }
        Trace.endSection();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            q(this.b, this.A);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        if (this.f) {
            int i3 = 0;
            if (View.MeasureSpec.getMode(i2) == 0) {
                n().h = 0;
            } else {
                int size = jrz.b(this.b) ? View.MeasureSpec.getSize(i2) - B().getLayoutParams().height : View.MeasureSpec.getSize(i2);
                if (n().a() > 0 && (childAt = ((ViewGroup) n().getChildAt(0)).getChildAt(0)) != null && childAt.getMeasuredHeight() > 0) {
                    this.H = childAt.getMeasuredHeight();
                    if (n().a() > 1) {
                        View childAt2 = ((ViewGroup) n().getChildAt(0)).getChildAt(1);
                        if (childAt2.getMeasuredHeight() > 0 && childAt2.getMeasuredHeight() < this.H) {
                            this.H = childAt2.getMeasuredHeight();
                        }
                    }
                }
                int iA = n().a();
                int i4 = this.H;
                int i5 = this.E;
                int i6 = this.G;
                int i7 = this.D;
                int i8 = this.F;
                if (size < (iA * i4) + i5 + i6 + i7 + i8) {
                    float f = i4;
                    i3 = ((int) ((((int) ((((((size - i7) - i8) - i6) - i5) / f) - 0.5f)) + 0.5f) * f)) + i5;
                }
                n().h = i3;
            }
        } else {
            int i9 = this.C.heightPixels;
            int i10 = this.C.widthPixels;
            if (jrz.b(this.b)) {
                OptionsMenuView optionsMenuViewN = n();
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.options_side_padding);
                optionsMenuViewN.h = i10 - (dimensionPixelSize + dimensionPixelSize);
            } else {
                n().h = i9;
            }
        }
        if (jrz.b(this.b)) {
            super.onMeasure(i, i2);
            D(getMeasuredWidth());
        } else {
            super.onMeasure(i2, i);
            D(getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void p(gtu gtuVar) {
        if (this.l.contains(gtuVar)) {
            return;
        }
        this.l.add(gtuVar);
    }

    public final void q(jrz jrzVar, int i) {
        guq guqVar;
        Trace.beginSection("optionsMenuContainer:applyOrientation");
        this.b = jrzVar;
        this.A = i;
        View viewB = B();
        ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
        int i2 = layoutParams.height;
        int i3 = this.A;
        if (i3 > 0) {
            layoutParams.height = i3;
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(R.dimen.options_menu_top_bar_size);
        }
        if (layoutParams.height != i2) {
            viewB.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = B().getLayoutParams();
        int iMax = Math.max(i, this.z);
        if (layoutParams2.height != iMax) {
            layoutParams2.height = iMax;
            B().setLayoutParams(layoutParams2);
        }
        mip.es(this, jrzVar);
        OptionsMenuView optionsMenuViewN = n();
        Trace.beginSection("OptionsMenuView:applyOrientation");
        optionsMenuViewN.i = jrzVar;
        if (optionsMenuViewN.l != null && (guqVar = optionsMenuViewN.j) != null) {
            Trace.beginSection("OptionsMenuRow:applyOrientation");
            Collection.EL.forEach(guqVar.d, new iem(jrzVar, 1));
            Trace.endSection();
        }
        Trace.endSection();
        View viewD = d();
        ValueAnimator valueAnimatorEr = mip.er(viewD, jrzVar);
        valueAnimatorEr.addListener(new jru(viewD));
        valueAnimatorEr.start();
        C(this.x, jrzVar);
        Trace.endSection();
    }

    public final void r() {
        if (this.r != null && this.q != null) {
            o();
        }
        this.p = null;
        this.q = null;
        this.r = null;
    }

    public final void s() {
        Animator animator = this.B;
        if (animator == null || !animator.isRunning()) {
            Animator animatorA = new gtz(this, false, this.f, this.g, this.g ? a() : f()).a();
            this.B = animatorA;
            animatorA.start();
            n().fullScroll(33);
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gtu) arrayList.get(i)).a();
            }
        }
    }

    public final void t() {
        setEnabled(false);
        this.d.setEnabled(false);
        if (!this.g) {
            z();
        }
        getVisibityButtons();
        zz();
    }

    public final void u() {
        setEnabled(true);
        this.d.setEnabled(true);
        if (!this.g) {
            z();
        }
        getVisibityButtons();
        zz();
    }

    public final void v(elw elwVar) {
        if (elwVar == null) {
            return;
        }
        elwVar.g(this.v);
        jgu jguVar = this.w;
        if (jguVar != null) {
            elwVar.g(jguVar);
        }
    }

    public final void w() {
        if (!isEnabled() || f() == null || d() == null) {
            return;
        }
        Animator animatorA = new gtz(this, true, this.f, this.g, this.g ? a() : f()).a();
        animatorA.addListener(new guj(this));
        animatorA.start();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gtu) arrayList.get(i)).d();
        }
    }

    public final void x(ImageButton imageButton) {
        this.p = imageButton;
        this.q = (AnimatedVectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(0);
        VectorDrawable vectorDrawable = (VectorDrawable) ((LayerDrawable) imageButton.getDrawable()).getDrawable(1);
        this.r = vectorDrawable;
        if (this.s || vectorDrawable == null) {
            return;
        }
        vectorDrawable.setAlpha(0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x002f A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:4:0x0003, B:6:0x0005, B:8:0x0009, B:9:0x000b, B:30:0x0071, B:15:0x0017, B:17:0x001b, B:20:0x0025, B:22:0x0027, B:26:0x002f, B:27:0x0042, B:28:0x0055, B:29:0x0067), top: B:35:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0042 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:4:0x0003, B:6:0x0005, B:8:0x0009, B:9:0x000b, B:30:0x0071, B:15:0x0017, B:17:0x001b, B:20:0x0025, B:22:0x0027, B:26:0x002f, B:27:0x0042, B:28:0x0055, B:29:0x0067), top: B:35:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:4:0x0003, B:6:0x0005, B:8:0x0009, B:9:0x000b, B:30:0x0071, B:15:0x0017, B:17:0x001b, B:20:0x0025, B:22:0x0027, B:26:0x002f, B:27:0x0042, B:28:0x0055, B:29:0x0067), top: B:35:0x0001 }] */
    public final void y(elw elwVar, boolean z, boolean z2) {
        huj hujVar;
        synchronized (this) {
            try {
                if (elwVar == null) {
                    return;
                }
                if (this.x == null) {
                    this.x = elwVar;
                }
                v(elwVar);
                if (z) {
                    if (z2 && !z && (hujVar = this.t) != null && hujVar.b("pref_ext_mic_bluetooth_chip_display_count") > 3) {
                        return;
                    }
                    if (this.y) {
                        if (z) {
                            this.v.s(this.k.getResources().getString(R.string.external_bluetooth_mic_connected));
                        } else if (z2) {
                            this.v.s(this.k.getResources().getString(R.string.external_mic_connected));
                        } else {
                            this.v.s(this.k.getResources().getString(R.string.external_wired_mic_connected));
                        }
                    }
                    C(elwVar, this.b);
                    elwVar.d(this.v);
                } else if (z2) {
                    z2 = true;
                    if (z2) {
                        return;
                    }
                    if (this.y) {
                        if (z) {
                            this.v.s(this.k.getResources().getString(R.string.external_bluetooth_mic_connected));
                        } else if (z2) {
                            this.v.s(this.k.getResources().getString(R.string.external_mic_connected));
                        } else {
                            this.v.s(this.k.getResources().getString(R.string.external_wired_mic_connected));
                        }
                    }
                    C(elwVar, this.b);
                    elwVar.d(this.v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z() {
        obr.aQ(!this.g);
        int iA = n().a();
        FrameLayout frameLayoutF = f();
        int i = 4;
        if (iA > 0 && !A()) {
            i = 0;
        }
        frameLayoutF.setVisibility(i);
        frameLayoutF.setEnabled(isEnabled() && iA > 0);
    }

    public final void zz() {
        int i = (Helper.sFront != 0 || Helper.sModeNS == 0) ? 8 : 0;
        getFrameLayout(R.id.toggle_astro).setVisibility(i);
        getFrameLayout(R.id.toggle_oneshot).setVisibility(i);
        if (Helper.sModeMORE_MODES == 0 && Helper.sModeMORE_MODES == 0 && Helper.sModeVideo == 0 && Helper.sModeTIME_LAPSE == 0 && Helper.sModeSlowMotion == 0) {
        }
    }
}
