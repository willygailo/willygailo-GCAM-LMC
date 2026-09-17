package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class alw implements Runnable {
    private final int a;
    private final RecyclerView b;

    public alw(int i, RecyclerView recyclerView) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.Y(this.a);
    }
}
