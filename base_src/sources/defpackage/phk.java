package defpackage;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class phk implements Runnable {
    pht a;
    Future b;

    public phk(pht phtVar, Future future) {
        this.a = phtVar;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        plk.ag(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
