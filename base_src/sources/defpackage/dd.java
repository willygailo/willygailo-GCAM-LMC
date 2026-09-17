package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class dd {
    int e;
    int f;
    int g;
    int h;
    int i;
    public boolean j;
    public String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    final ArrayList d = new ArrayList();
    public boolean k = true;
    boolean s = false;

    public abstract void b();

    public void c(int i, bu buVar, String str, int i2) {
        throw null;
    }

    public abstract void g();

    public abstract void h();

    public void j(bu buVar) {
        throw null;
    }

    final void k(dc dcVar) {
        this.d.add(dcVar);
        dcVar.d = this.e;
        dcVar.e = this.f;
        dcVar.f = this.g;
        dcVar.g = this.h;
    }

    public final void l(int i, bu buVar) {
        c(i, buVar, null, 1);
    }

    public final void m(int i, bu buVar, String str) {
        c(i, buVar, str, 1);
    }

    public final void n(bu buVar, String str) {
        c(0, buVar, str, 1);
    }

    public final void o() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void p(int i, bu buVar) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        c(i, buVar, null, 2);
    }
}
