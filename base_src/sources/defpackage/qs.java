package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qs {
    private static final List s = Collections.emptyList();
    public final View a;
    public WeakReference b;
    int j;
    RecyclerView q;
    pu r;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    int f = -1;
    int g = -1;
    public qs h = null;
    public qs i = null;
    List k = null;
    List l = null;
    private int t = 0;
    qi m = null;
    boolean n = false;
    public int o = 0;
    public int p = -1;

    public qs(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    final boolean A() {
        return (this.j & 32) != 0;
    }

    public final int a() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b(this);
    }

    public final int b() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List c() {
        if ((this.j & 1024) != 0) {
            return s;
        }
        List list = this.k;
        return (list == null || list.size() == 0) ? s : this.l;
    }

    public final void d(Object obj) {
        if (obj == null) {
            e(1024);
            return;
        }
        if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void e(int i) {
        this.j = i | this.j;
    }

    public final void f() {
        this.d = -1;
        this.g = -1;
    }

    final void g() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    final void h() {
        this.j &= -33;
    }

    public final void i() {
        this.j &= -257;
    }

    public final void j(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        if (this.a.getLayoutParams() != null) {
            ((qd) this.a.getLayoutParams()).e = true;
        }
    }

    final void k() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        g();
        this.o = 0;
        this.p = -1;
        RecyclerView.q(this);
    }

    public final void l(int i, int i2) {
        this.j = (i & i2) | (this.j & (i2 ^ (-1)));
    }

    public final void m(boolean z) {
        int i = this.t;
        int i2 = z ? i - 1 : i + 1;
        this.t = i2;
        if (i2 < 0) {
            this.t = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
    }

    final void n(qi qiVar, boolean z) {
        this.m = qiVar;
        this.n = z;
    }

    final void o() {
        this.m.l(this);
    }

    public final boolean p(int i) {
        return (i & this.j) != 0;
    }

    final boolean q() {
        return (this.a.getParent() == null || this.a.getParent() == this.q) ? false : true;
    }

    public final boolean r() {
        return (this.j & 1) != 0;
    }

    public final boolean s() {
        return (this.j & 4) != 0;
    }

    public final boolean t() {
        return (this.j & 16) == 0 && !gl.T(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (v()) {
            sb.append(" scrap ");
            sb.append(true != this.n ? "[attachedScrap]" : "[changeScrap]");
        }
        if (s()) {
            sb.append(" invalid");
        }
        if (!r()) {
            sb.append(" unbound");
        }
        if (y()) {
            sb.append(" update");
        }
        if (u()) {
            sb.append(" removed");
        }
        if (z()) {
            sb.append(" ignored");
        }
        if (w()) {
            sb.append(" tmpDetached");
        }
        if (!t()) {
            sb.append(" not recyclable(" + this.t + ")");
        }
        if ((this.j & 512) != 0 || s()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & 8) != 0;
    }

    final boolean v() {
        return this.m != null;
    }

    public final boolean w() {
        return (this.j & 256) != 0;
    }

    public final boolean x() {
        return (this.j & 2) != 0;
    }

    final boolean y() {
        return (this.j & 2) != 0;
    }

    public final boolean z() {
        return (this.j & 128) != 0;
    }
}
