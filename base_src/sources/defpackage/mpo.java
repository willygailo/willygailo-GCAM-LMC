package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class mpo implements mpm {
    private final mnb a;
    public final mpi b;

    protected mpo(mpi mpiVar, mnb mnbVar) {
        this.b = mpiVar;
        this.a = mnbVar;
        if (mpiVar.f() && mip.ab(mnbVar) == null) {
            Log.e("GLContextObject", "Creating non-ready GL object on GL thread. This will likely cause a deadlock.");
        }
        boolean z = mot.a;
    }

    public static mnb d(mpi mpiVar, Callable callable) {
        if (!mpiVar.f()) {
            return mip.X(mpiVar, callable);
        }
        try {
            return mip.Y(callable.call());
        } catch (Exception e) {
            return mip.W(plk.U(mnc.a(e)));
        }
    }

    @Override // defpackage.mls
    public mne a() {
        boolean z = mot.a;
        return mne.i(e(gdr.d, new mlv()));
    }

    @Override // defpackage.mpm
    public final mqw c() {
        if (this.b.f()) {
            return f();
        }
        throw new IllegalStateException("raw should only be called from the GLContext thread");
    }

    @Override // defpackage.mls, defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mip.ac(a());
    }

    public final mnb e(mqj mqjVar, mlu mluVar) {
        return d(this.b, new mpn(this, mluVar, mqjVar));
    }

    public final mqw f() {
        if (!this.b.f()) {
            return (mqw) mip.ac(this.a);
        }
        mqw mqwVar = (mqw) mip.ab(this.a);
        if (mqwVar != null) {
            return mqwVar;
        }
        throw new RuntimeException("Waiting for incomplete GL object while on GL thread. This deadlocks the process.");
    }
}
