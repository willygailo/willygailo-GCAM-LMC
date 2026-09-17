package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class sa {
    final rz a;
    final ry b = new ry();

    public sa(rz rzVar) {
        this.a = rzVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        int iD = this.a.d();
        int iC = this.a.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewE = this.a.e(i);
            this.b.c(iD, iC, this.a.b(viewE), this.a.a(viewE));
            this.b.b();
            this.b.a(i3);
            if (this.b.d()) {
                return viewE;
            }
            this.b.b();
            this.b.a(i4);
            if (true == this.b.d()) {
                view = viewE;
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        this.b.c(this.a.d(), this.a.c(), this.a.b(view), this.a.a(view));
        this.b.b();
        this.b.a(24579);
        return this.b.d();
    }
}
