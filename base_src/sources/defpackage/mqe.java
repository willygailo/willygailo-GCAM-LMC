package defpackage;

import android.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class mqe implements mpi {
    private final mpi a;

    public mqe(mpi mpiVar) {
        this.a = mpiVar;
    }

    @Override // defpackage.mls
    public final mne a() {
        return this.a.a();
    }

    @Override // defpackage.mls, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.mpi
    public final mrh d() {
        return this.a.d();
    }

    @Override // defpackage.mpi
    public final void e(mqj mqjVar, Runnable runnable) {
        try {
            this.a.e(mqjVar, runnable);
        } catch (RejectedExecutionException e) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", e);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.e("GLContext", "Executing command on GL context was rejected! Command ignored.", e);
        }
    }

    @Override // defpackage.mpi
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.mpi
    public final mua g(Object obj, ojz ojzVar) {
        return this.a.g(obj, ojzVar);
    }

    @Override // defpackage.mpi
    public final mrd h() {
        return this.a.h();
    }
}
