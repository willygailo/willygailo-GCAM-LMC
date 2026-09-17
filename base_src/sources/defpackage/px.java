package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class px {
    public int a;
    public int b;

    public final void a(qs qsVar) {
        View view = qsVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public final int b() {
        return this.b | this.a;
    }

    public final void c(int i, int i2) {
        if (i2 == 1) {
            this.a = i;
        } else {
            this.b = i;
        }
    }

    public final void d(int i) {
        if (i == 1) {
            this.a = 0;
        } else {
            this.b = 0;
        }
    }
}
