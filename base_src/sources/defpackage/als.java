package defpackage;

import android.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class als extends gb {
    final /* synthetic */ ViewPager2 a;
    private final hj b = new alq(this, 1);
    private final hj c = new alq(this, 0);
    private gd d;

    public als(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.gb
    public final String f() {
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // defpackage.gb
    public final void g(pu puVar) {
        z();
        puVar.h(this.d);
    }

    @Override // defpackage.gb
    public final void h(pu puVar) {
        if (puVar != null) {
            puVar.i(this.d);
        }
    }

    @Override // defpackage.gb
    public final void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        hb hbVarA = hb.a(accessibilityNodeInfo);
        if (this.a.b() == null) {
            iA = 0;
            iA2 = 0;
        } else if (this.a.a() == 1) {
            iA = this.a.b().a();
            iA2 = 1;
        } else {
            iA2 = this.a.b().a();
            iA = 1;
        }
        hbVarA.f(kkm.d(iA, iA2, 0));
        pu puVarB = this.a.b();
        if (puVarB == null || (iA3 = puVarB.a()) == 0) {
            return;
        }
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h) {
            if (viewPager2.c > 0) {
                hbVarA.b(8192);
            }
            if (this.a.c < iA3 - 1) {
                hbVarA.b(4096);
            }
            hbVarA.i(true);
        }
    }

    @Override // defpackage.gb
    public final void k(View view, hb hbVar) {
        hbVar.g(kkm.c(this.a.a() == 1 ? LinearLayoutManager.be(view) : 0, 1, this.a.a() == 0 ? LinearLayoutManager.be(view) : 0, 1, false));
    }

    @Override // defpackage.gb
    public final void l() {
        z();
    }

    @Override // defpackage.gb
    public final void m(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.a);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // defpackage.gb
    public final void n() {
        z();
    }

    @Override // defpackage.gb
    public final void o() {
        z();
    }

    @Override // defpackage.gb
    public final void p() {
        z();
    }

    @Override // defpackage.gb
    public final void q() {
        z();
    }

    @Override // defpackage.gb
    public final boolean r() {
        return true;
    }

    @Override // defpackage.gb
    public final boolean u(int i) {
        return i == 8192 || i == 4096;
    }

    @Override // defpackage.gb
    public final void v(RecyclerView recyclerView) {
        gl.M(recyclerView, 2);
        this.d = new alr(this);
        if (gl.d(this.a) == 0) {
            gl.M(this.a, 1);
        }
    }

    @Override // defpackage.gb
    public final void x(int i) {
        if (!u(i)) {
            throw new IllegalStateException();
        }
        y(i == 8192 ? this.a.c - 1 : this.a.c + 1);
    }

    final void y(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h) {
            viewPager2.e(i, true);
        }
    }

    final void z() {
        int iA;
        ViewPager2 viewPager2 = this.a;
        int i = R.id.accessibilityActionPageLeft;
        gl.C(viewPager2, R.id.accessibilityActionPageLeft);
        gl.C(viewPager2, R.id.accessibilityActionPageRight);
        gl.C(viewPager2, R.id.accessibilityActionPageUp);
        gl.C(viewPager2, R.id.accessibilityActionPageDown);
        if (this.a.b() == null || (iA = this.a.b().a()) == 0) {
            return;
        }
        ViewPager2 viewPager3 = this.a;
        if (viewPager3.h) {
            if (viewPager3.a() != 0) {
                if (this.a.c < iA - 1) {
                    gl.ab(viewPager2, new ha(R.id.accessibilityActionPageDown), this.b);
                }
                if (this.a.c > 0) {
                    gl.ab(viewPager2, new ha(R.id.accessibilityActionPageUp), this.c);
                    return;
                }
                return;
            }
            boolean zG = this.a.g();
            int i2 = true != zG ? R.id.accessibilityActionPageRight : R.id.accessibilityActionPageLeft;
            if (true == zG) {
                i = R.id.accessibilityActionPageRight;
            }
            if (this.a.c < iA - 1) {
                gl.ab(viewPager2, new ha(i2), this.b);
            }
            if (this.a.c > 0) {
                gl.ab(viewPager2, new ha(i), this.c);
            }
        }
    }
}
