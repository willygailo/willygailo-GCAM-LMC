package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rx implements oa {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    private View f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private mh m;
    private int n;
    private Drawable o;

    public rx(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.s;
        this.k = toolbar.t;
        this.j = this.c != null;
        this.i = toolbar.e();
        rn rnVarQ = rn.q(toolbar.getContext(), null, jq.a, R.attr.actionBarStyle);
        int i = 15;
        this.o = rnVarQ.h(15);
        if (z) {
            CharSequence charSequenceL = rnVarQ.l(27);
            if (!TextUtils.isEmpty(charSequenceL)) {
                m(charSequenceL);
            }
            CharSequence charSequenceL2 = rnVarQ.l(25);
            if (!TextUtils.isEmpty(charSequenceL2)) {
                this.k = charSequenceL2;
                if ((this.b & 8) != 0) {
                    toolbar.q(charSequenceL2);
                }
            }
            Drawable drawableH = rnVarQ.h(20);
            if (drawableH != null) {
                j(drawableH);
            }
            Drawable drawableH2 = rnVarQ.h(17);
            if (drawableH2 != null) {
                this.g = drawableH2;
                D();
            }
            if (this.i == null && (drawable = this.o) != null) {
                this.i = drawable;
                C();
            }
            i(rnVarQ.c(10, 0));
            int iF = rnVarQ.f(9, 0);
            if (iF != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iF, (ViewGroup) toolbar, false);
                View view = this.f;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                i(this.b | 16);
            }
            int iE = rnVarQ.e(13, 0);
            if (iE > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iE;
                toolbar.setLayoutParams(layoutParams);
            }
            int iA = rnVarQ.a(7, -1);
            int iA2 = rnVarQ.a(3, -1);
            if (iA >= 0 || iA2 >= 0) {
                int iMax = Math.max(iA, 0);
                int iMax2 = Math.max(iA2, 0);
                toolbar.j();
                toolbar.r.a(iMax, iMax2);
            }
            int iF2 = rnVarQ.f(28, 0);
            if (iF2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = iF2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, iF2);
                }
            }
            int iF3 = rnVarQ.f(26, 0);
            if (iF3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = iF3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iF3);
                }
            }
            int iF4 = rnVarQ.f(22, 0);
            if (iF4 != 0) {
                toolbar.p(iF4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        rnVarQ.n();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.l = i2 != 0 ? b().getString(i2) : null;
                B();
            }
        }
        this.l = toolbar.h();
        rv rvVar = new rv(this);
        toolbar.l();
        toolbar.d.setOnClickListener(rvVar);
    }

    private final void A(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            this.a.r(charSequence);
        }
    }

    private final void B() {
        if ((this.b & 4) != 0) {
            if (!TextUtils.isEmpty(this.l)) {
                this.a.n(this.l);
                return;
            }
            Toolbar toolbar = this.a;
            int i = this.n;
            toolbar.n(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    private final void C() {
        if ((this.b & 4) == 0) {
            this.a.o(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.o(drawable);
    }

    private final void D() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.m(drawable);
    }

    @Override // defpackage.oa
    public final int a() {
        return this.b;
    }

    @Override // defpackage.oa
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.oa
    public final go c(int i, long j) {
        go goVarP = gl.p(this.a);
        goVarP.b(i == 0 ? 1.0f : 0.0f);
        goVarP.c(j);
        goVarP.d(new rw(this, i));
        return goVarP;
    }

    @Override // defpackage.oa
    public final ViewGroup d() {
        return this.a;
    }

    @Override // defpackage.oa
    public final void e() {
        this.a.i();
    }

    @Override // defpackage.oa
    public final void f() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    @Override // defpackage.oa
    public final void g() {
    }

    @Override // defpackage.oa
    public final void h() {
    }

    @Override // defpackage.oa
    public final void i(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    B();
                }
                C();
            }
            if ((i2 & 3) != 0) {
                D();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.r(this.c);
                    this.a.q(this.k);
                } else {
                    this.a.r(null);
                    this.a.q(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.oa
    public final void j(Drawable drawable) {
        this.h = drawable;
        D();
    }

    @Override // defpackage.oa
    public final void k(Menu menu, lj ljVar) {
        if (this.m == null) {
            this.m = new mh(this.a.getContext());
        }
        mh mhVar = this.m;
        mhVar.e = ljVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.k();
        kw kwVar = toolbar.a.a;
        if (kwVar == menu) {
            return;
        }
        if (kwVar != null) {
            kwVar.m(toolbar.v);
            kwVar.m(toolbar.w);
        }
        if (toolbar.w == null) {
            toolbar.w = new rr(toolbar);
        }
        mhVar.o();
        if (menu != null) {
            kw kwVar2 = (kw) menu;
            kwVar2.h(mhVar, toolbar.i);
            kwVar2.h(toolbar.w, toolbar.i);
        } else {
            mhVar.b(toolbar.i, null);
            toolbar.w.b(toolbar.i, null);
            mhVar.i();
            toolbar.w.i();
        }
        toolbar.a.j(toolbar.j);
        toolbar.a.k(mhVar);
        toolbar.v = mhVar;
    }

    @Override // defpackage.oa
    public final void l() {
        this.e = true;
    }

    @Override // defpackage.oa
    public final void m(CharSequence charSequence) {
        this.j = true;
        A(charSequence);
    }

    @Override // defpackage.oa
    public final void n(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.oa
    public final void o(Window.Callback callback) {
        this.d = callback;
    }

    @Override // defpackage.oa
    public final void p(CharSequence charSequence) {
        if (this.j) {
            return;
        }
        A(charSequence);
    }

    @Override // defpackage.oa
    public final boolean q() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.oa
    public final boolean r() {
        rr rrVar = this.a.w;
        return (rrVar == null || rrVar.b == null) ? false : true;
    }

    @Override // defpackage.oa
    public final boolean s() {
        mh mhVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (mhVar = actionMenuView.c) == null || !mhVar.k()) ? false : true;
    }

    @Override // defpackage.oa
    public final boolean t() {
        mh mhVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (mhVar = actionMenuView.c) == null) {
            return false;
        }
        return mhVar.k != null || mhVar.l();
    }

    @Override // defpackage.oa
    public final boolean u() {
        return this.a.s();
    }

    @Override // defpackage.oa
    public final boolean v() {
        return this.a.t();
    }

    @Override // defpackage.oa
    public final void w() {
    }

    @Override // defpackage.oa
    public final void x() {
    }

    @Override // defpackage.oa
    public final void y() {
    }

    @Override // defpackage.oa
    public final void z() {
        this.a.requestLayout();
    }
}
