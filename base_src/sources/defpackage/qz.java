package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
final class qz extends gg {
    boolean a = false;
    final /* synthetic */ qe b;

    public qz(qe qeVar) {
        this.b = qeVar;
    }

    @Override // defpackage.gg
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.gg
    public final void d(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }
}
