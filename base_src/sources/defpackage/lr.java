package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class lr extends lg implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, lk {
    final pn a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final kw f;
    private final kt h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private lj o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new lp(this);
    private final View.OnAttachStateChangeListener l = new lq(this);
    private int s = 0;

    public lr(Context context, kw kwVar, View view, int i, boolean z) {
        this.e = context;
        this.f = kwVar;
        this.i = z;
        this.h = new kt(kwVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new pn(context, i);
        kwVar.h(this, context);
    }

    @Override // defpackage.lk
    public final void c(kw kwVar, boolean z) {
        if (kwVar != this.f) {
            return;
        }
        k();
        lj ljVar = this.o;
        if (ljVar != null) {
            ljVar.a(kwVar, z);
        }
    }

    @Override // defpackage.lk
    public final void d(lj ljVar) {
        this.o = ljVar;
    }

    @Override // defpackage.lk
    public final boolean e() {
        return false;
    }

    @Override // defpackage.lk
    public final boolean f(ls lsVar) {
        if (lsVar.hasVisibleItems()) {
            li liVar = new li(this.e, lsVar, this.c, this.i, this.k);
            liVar.e(this.o);
            liVar.d(lg.w(lsVar));
            liVar.c = this.m;
            this.m = null;
            this.f.i(false);
            pn pnVar = this.a;
            int width = pnVar.g;
            int iB = pnVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, gl.f(this.n)) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!liVar.g()) {
                if (liVar.a != null) {
                    liVar.f(width, iB, true, true);
                }
            }
            lj ljVar = this.o;
            if (ljVar != null) {
                ljVar.b(lsVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.lo
    public final ListView fn() {
        return this.a.e;
    }

    @Override // defpackage.lk
    public final void i() {
        this.q = false;
        kt ktVar = this.h;
        if (ktVar != null) {
            ktVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.lg
    public final void j(kw kwVar) {
    }

    @Override // defpackage.lo
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.lg
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.lg
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.lg
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.lg
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.lg
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.lg
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.lg
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.lo
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.v(this);
        pn pnVar = this.a;
        pnVar.m = this;
        pnVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        pn pnVar2 = this.a;
        pnVar2.l = view2;
        pnVar2.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.x();
        this.a.t(this.g);
        this.a.s();
        om omVar = this.a.e;
        omVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) omVar, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            omVar.addHeaderView(frameLayout, null, false);
        }
        this.a.e(this.h);
        this.a.s();
    }

    @Override // defpackage.lo
    public final boolean u() {
        return !this.p && this.a.u();
    }
}
