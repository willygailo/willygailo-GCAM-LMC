package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class qqp implements Executor {
    public final qqf a;

    public qqp(qqf qqfVar) {
        this.a = qqfVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.a.d(qlo.a, runnable);
    }

    public final String toString() {
        return this.a.toString();
    }
}
