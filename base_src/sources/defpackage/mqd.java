package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mqd implements mpi {
    private final mpi c;
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final Throwable d = new Throwable("Context stacktrace");

    public mqd(mpi mpiVar) {
        this.c = mpiVar;
    }

    @Override // defpackage.mls
    public final mne a() {
        return this.c.a();
    }

    @Override // defpackage.mls, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.set(true);
        this.c.close();
    }

    @Override // defpackage.mpi
    public final mrh d() {
        return this.c.d();
    }

    @Override // defpackage.mpi
    public final void e(mqj mqjVar, Runnable runnable) {
        this.c.e(mqjVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(new mqc(this, runnable, this.d));
    }

    @Override // defpackage.mpi
    public final boolean f() {
        return this.c.f();
    }

    @Override // defpackage.mpi
    public final mua g(Object obj, ojz ojzVar) {
        return this.c.g(obj, ojzVar);
    }

    @Override // defpackage.mpi
    public final mrd h() {
        return this.c.h();
    }
}
