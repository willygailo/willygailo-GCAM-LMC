package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mus implements Executor, mvw {
    private final mwe a;
    private Runnable b;
    private boolean c;
    private boolean d;

    public mus(mwe mweVar) {
        this.a = mweVar;
    }

    private final void b(Runnable runnable) {
        if (this.d) {
            return;
        }
        this.d = true;
        runnable.run();
    }

    @Override // defpackage.mvw
    public final void a(Activity activity) {
        this.a.b(this);
        synchronized (this) {
            Runnable runnable = this.b;
            if (runnable != null) {
                b(runnable);
                this.b = null;
            } else {
                this.c = true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this) {
            if (this.c) {
                b(runnable);
            } else {
                mwf mwfVar = this.a.a.a;
                int i = mwf.c;
                if (mwfVar.b.get() > 0) {
                    b(runnable);
                } else {
                    this.b = runnable;
                }
            }
        }
    }
}
