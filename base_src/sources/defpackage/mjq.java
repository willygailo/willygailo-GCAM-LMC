package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mjq implements Executor {
    final /* synthetic */ mjr a;
    private final Executor b;

    public mjq(mjr mjrVar, Executor executor) {
        this.a = mjrVar;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.b.execute(new Runnable() { // from class: mjp
            @Override // java.lang.Runnable
            public final void run() {
                mjq mjqVar = this.a;
                try {
                    runnable.run();
                } catch (Throwable th) {
                    synchronized (mjqVar.a.c) {
                        if (mjqVar.a.d != null) {
                            ((oug) ((oug) ((oug) mjr.a.b()).h(mjqVar.a.d)).G(3582)).o("Muxer: due to new exception discarding the following throwable");
                        }
                        mjqVar.a.d = th;
                    }
                }
            }
        });
    }
}
