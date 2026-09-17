package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rr implements lk {
    kw a;
    public kz b;
    final /* synthetic */ Toolbar c;

    public rr(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.lk
    public final void b(Context context, kw kwVar) {
        kz kzVar;
        kw kwVar2 = this.a;
        if (kwVar2 != null && (kzVar = this.b) != null) {
            kwVar2.t(kzVar);
        }
        this.a = kwVar;
    }

    @Override // defpackage.lk
    public final void c(kw kwVar, boolean z) {
    }

    @Override // defpackage.lk
    public final void d(lj ljVar) {
        throw null;
    }

    @Override // defpackage.lk
    public final boolean e() {
        return false;
    }

    @Override // defpackage.lk
    public final boolean f(ls lsVar) {
        return false;
    }

    @Override // defpackage.lk
    public final boolean g(kz kzVar) {
        View view = this.c.h;
        if (view instanceof lc) {
            ((lc) view).a.onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        for (int size = toolbar3.u.size() - 1; size >= 0; size--) {
            toolbar3.addView((View) toolbar3.u.get(size));
        }
        toolbar3.u.clear();
        this.b = null;
        this.c.requestLayout();
        kzVar.h(false);
        return true;
    }

    @Override // defpackage.lk
    public final boolean h(kz kzVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new mw(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            rs rsVarU = Toolbar.u();
            rsVarU.a = (toolbar.m & 112) | 8388611;
            rsVarU.b = 2;
            toolbar.g.setLayoutParams(rsVarU);
            toolbar.g.setOnClickListener(new rq(toolbar));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = kzVar.getActionView();
        this.b = kzVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            rs rsVarU2 = Toolbar.u();
            Toolbar toolbar5 = this.c;
            rsVarU2.a = 8388611 | (toolbar5.m & 112);
            rsVarU2.b = 2;
            toolbar5.h.setLayoutParams(rsVarU2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        for (int childCount = toolbar7.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar7.getChildAt(childCount);
            if (((rs) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.u.add(childAt);
            }
        }
        this.c.requestLayout();
        kzVar.h(true);
        View view = this.c.h;
        if (view instanceof lc) {
            ((lc) view).a.onActionViewExpanded();
        }
        return true;
    }

    @Override // defpackage.lk
    public final void i() {
        if (this.b != null) {
            kw kwVar = this.a;
            if (kwVar != null) {
                int size = kwVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }
}
