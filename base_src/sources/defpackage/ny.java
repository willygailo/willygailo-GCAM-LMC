package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ny {
    public final nx a = new nx();
    public final List b = new ArrayList();
    public final pz c;

    public ny(pz pzVar, byte[] bArr) {
        this.c = pzVar;
    }

    public final int a() {
        return this.c.f() - this.b.size();
    }

    public final int b(int i) {
        if (i < 0) {
            return -1;
        }
        int iF = this.c.f();
        int i2 = i;
        while (i2 < iF) {
            int iA = i - (i2 - this.a.a(i2));
            if (iA == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int c() {
        return this.c.f();
    }

    final int d(View view) {
        int iG = this.c.g(view);
        if (iG == -1 || this.a.f(iG)) {
            return -1;
        }
        return iG - this.a.a(iG);
    }

    public final View e(int i) {
        return this.c.h(b(i));
    }

    public final View f(int i) {
        return this.c.h(i);
    }

    public final void g(View view, int i, boolean z) {
        int iF = i < 0 ? this.c.f() : b(0);
        this.a.c(iF, z);
        if (z) {
            j(view);
        }
        pz pzVar = this.c;
        pzVar.a.addView(view, iF);
        RecyclerView recyclerView = pzVar.a;
        qs qsVarH = RecyclerView.h(view);
        pu puVar = recyclerView.l;
        if (puVar != null && qsVarH != null) {
            puVar.o(qsVarH);
        }
        List list = recyclerView.x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                qd qdVar = (qd) view.getLayoutParams();
                if (qdVar.width != -1 || qdVar.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public final void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iF = i < 0 ? this.c.f() : b(i);
        this.a.c(iF, z);
        if (z) {
            j(view);
        }
        pz pzVar = this.c;
        qs qsVarH = RecyclerView.h(view);
        if (qsVarH != null) {
            if (!qsVarH.w() && !qsVarH.z()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + qsVarH + pzVar.a.k());
            }
            qsVarH.i();
        }
        pzVar.a.attachViewToParent(view, iF, layoutParams);
    }

    final void i(int i) {
        qs qsVarH;
        int iB = b(i);
        this.a.g(iB);
        pz pzVar = this.c;
        View viewH = pzVar.h(iB);
        if (viewH != null && (qsVarH = RecyclerView.h(viewH)) != null) {
            if (qsVarH.w() && !qsVarH.z()) {
                throw new IllegalArgumentException("called detach on an already detached child " + qsVarH + pzVar.a.k());
            }
            qsVarH.e(256);
        }
        pzVar.a.detachViewFromParent(iB);
    }

    public final void j(View view) {
        this.b.add(view);
        pz pzVar = this.c;
        qs qsVarH = RecyclerView.h(view);
        if (qsVarH != null) {
            RecyclerView recyclerView = pzVar.a;
            int i = qsVarH.p;
            if (i != -1) {
                qsVarH.o = i;
            } else {
                qsVarH.o = gl.d(qsVarH.a);
            }
            recyclerView.aj(qsVarH, 4);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.c.i(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
