package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class qwd extends qqx {
    private final qwb b;

    public qwd(int i, int i2, long j) {
        this.b = new qwb(i, i2, j);
    }

    @Override // defpackage.qqx
    public final Executor c() {
        return this.b;
    }

    public void close() {
        this.b.close();
    }

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        try {
            qwb.e(this.b, runnable);
        } catch (RejectedExecutionException e) {
            qqm.b.d(qlnVar, runnable);
        }
    }

    public final void f(Runnable runnable, qwh qwhVar, boolean z) {
        runnable.getClass();
        try {
            this.b.a(runnable, qwhVar, z);
        } catch (RejectedExecutionException e) {
            qqm.b.o(qwb.g(runnable, qwhVar));
        }
    }

    @Override // defpackage.qqf
    public String toString() {
        return super.toString() + "[scheduler = " + this.b + ']';
    }
}
