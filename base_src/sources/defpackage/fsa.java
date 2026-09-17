package defpackage;

import android.media.MediaCodec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fsa implements lie {
    private static final ouj b = ouj.h("com/google/android/apps/camera/microvideo/gyro/IncompleteMotionDataFrame");
    public final fsb a;

    private fsa(fsb fsbVar) {
        this.a = fsbVar;
    }

    public static fsa d(lig ligVar, long j, int i) {
        return new fsa(new fsb(ligVar, j, i));
    }

    public final long a() {
        return TimeUnit.MICROSECONDS.convert(this.a.b, TimeUnit.NANOSECONDS);
    }

    public final void b() {
        this.a.c.cancel(false);
        this.a.e.cancel(false);
        this.a.d.cancel(false);
    }

    public final boolean c() {
        return this.a.c.isDone() && this.a.d.isDone() && this.a.g;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    public final boolean e(fsa fsaVar) {
        boolean z;
        if (fsaVar.a() <= TimeUnit.MICROSECONDS.convert(this.a.b, TimeUnit.NANOSECONDS)) {
            return false;
        }
        fsb fsbVar = fsaVar.a;
        try {
            z = (this.a.d.isDone() || !fsaVar.a.d.isDone() || (((MediaCodec.BufferInfo) plk.ad(fsaVar.a.d)).flags & 1) == 0) ? false : true;
        } catch (ExecutionException e) {
            ((oug) ((oug) ((oug) b.b()).h(e)).G((char) 1941)).o("Unexpected exception thrown while fetching values.");
            z = false;
        }
        if (z) {
            ((oug) ((oug) b.c()).G((char) 1940)).o("Stale encoder frame detected");
        }
        return (fsbVar.c.isDone() && !this.a.c.isDone()) || this.a.e.isCancelled() || z;
    }
}
