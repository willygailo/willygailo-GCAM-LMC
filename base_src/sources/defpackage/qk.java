package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class qk extends gd {
    final /* synthetic */ RecyclerView a;

    public qk(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.gd
    public final void l() {
        this.a.p(null);
        RecyclerView recyclerView = this.a;
        recyclerView.L.f = true;
        recyclerView.O(true);
        if (this.a.e.l()) {
            return;
        }
        this.a.requestLayout();
    }

    @Override // defpackage.gd
    public final void m(int i, Object obj) {
        this.a.p(null);
        mn mnVar = this.a.e;
        mnVar.a.add(mnVar.c(4, i, 1, obj));
        mnVar.c |= 4;
        if (mnVar.a.size() == 1) {
            RecyclerView recyclerView = this.a;
            if (recyclerView.s && recyclerView.r) {
                gl.A(recyclerView, recyclerView.i);
            } else {
                recyclerView.w = true;
                recyclerView.requestLayout();
            }
        }
    }
}
