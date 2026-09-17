package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dyd {
    public static final ouj a = ouj.h("com/google/android/apps/camera/gl/GLGuardFactory");
    public static Executor b;
    public final mpi c;
    public final Executor d;

    public dyd(mpi mpiVar, Executor executor) {
        this.c = mpiVar;
        this.d = executor;
    }

    public final dyc a(AutoCloseable autoCloseable) {
        return new dyc(this, autoCloseable);
    }
}
