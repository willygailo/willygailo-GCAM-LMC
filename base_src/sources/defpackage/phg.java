package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class phg extends phe implements pht {
    protected phg() {
    }

    @Override // defpackage.phe
    protected /* bridge */ /* synthetic */ Future b() {
        throw null;
    }

    protected abstract pht c();

    @Override // defpackage.pht
    public final void d(Runnable runnable, Executor executor) {
        c().d(runnable, executor);
    }
}
