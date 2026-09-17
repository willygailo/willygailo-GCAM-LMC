package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class nxg {
    public int a;
    public int b;
    private final View c;
    private int d;

    public nxg(View view) {
        this.c = view;
    }

    public final void a() {
        View view = this.c;
        gl.y(view, this.b - (view.getTop() - this.a));
        View view2 = this.c;
        gl.x(view2, -(view2.getLeft() - this.d));
    }

    public final void b() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
    }

    public final boolean c(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        a();
        return true;
    }
}
