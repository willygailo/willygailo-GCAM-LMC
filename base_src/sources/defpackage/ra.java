package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ra implements Runnable {
    final /* synthetic */ StaggeredGridLayoutManager a;

    public ra(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.a = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.H();
    }
}
