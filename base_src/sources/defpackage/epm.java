package defpackage;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import com.google.googlex.gcam.lasagna.LasagnaNativeProcessorJni;

/* JADX INFO: loaded from: classes.dex */
public final class epm {
    public static final ouj a = ouj.h("com/google/android/apps/camera/lasagna/LasagnaNativeProcessor");
    public final Object b = new Object();
    public final LasagnaNativeProcessorJni c = new LasagnaNativeProcessorJni();
    public long d = 0;

    public final synchronized void a(int i) {
        long j = this.d;
        if (j != 0) {
            this.c.abortShot(j, i);
        } else {
            ((oug) ((oug) a.c()).G((char) 1345)).o("abortShot(): processor hasn't been initialized.");
        }
    }

    public final synchronized void b() {
        synchronized (this.b) {
            long j = this.d;
            if (j != 0) {
                this.c.delete(j);
                this.d = 0L;
            } else {
                ((oug) ((oug) a.c()).G(1347)).o("Calling close() on an already closed processor.");
            }
        }
    }

    public final synchronized void c(int i) {
        long j = this.d;
        if (j != 0) {
            this.c.endShot(j, i);
        } else {
            ((oug) ((oug) a.c()).G((char) 1349)).o("endShot(): processor hasn't been initialized.");
        }
    }

    public final synchronized void d(int i, int i2, int i3, String str, long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator, LasagnaCallbacks lasagnaCallbacks) {
        synchronized (this.b) {
            long jCreate = this.c.create(i, i2, i3, str, j, interleavedU8ClientAllocator, lasagnaCallbacks);
            this.d = jCreate;
            obr.aQ(jCreate != 0);
        }
    }

    public final synchronized void e() {
        long j = this.d;
        if (j != 0) {
            this.c.printDiagnosticsToLog(j);
        } else {
            ((oug) ((oug) a.c()).G((char) 1350)).o("printDiagnostics(): processor hasn't been initialized.");
        }
    }

    public final synchronized boolean f(int i) {
        long j = this.d;
        if (j != 0) {
            this.c.beginShot(j, i);
            return true;
        }
        ((oug) ((oug) a.c()).G((char) 1352)).o("beginShot(): processor hasn't been initialized.");
        return false;
    }

    public final synchronized void g(int i, plj pljVar) {
        long j = this.d;
        if (j != 0) {
            this.c.processPslFrame(j, i, RawWriteView.c(pljVar.a), FrameMetadata.b(pljVar.b), pljVar.c.a, pljVar.d);
        } else {
            ((oug) ((oug) a.c()).G((char) 1353)).o("processZslBurst(): processor hasn't been initialized.");
        }
    }

    public final synchronized boolean h(int i, float f, int i2, boolean z) {
        long j = this.d;
        if (j != 0) {
            this.c.setOptions(j, i, false, f, i2, false, z);
            return true;
        }
        ((oug) ((oug) a.c()).G((char) 1355)).o("setOptions(): processor hasn't been initialized.");
        return false;
    }

    public final synchronized boolean i(int i, pll pllVar) {
        long j = this.d;
        if (j != 0) {
            this.c.processZslBurst(j, i, pllVar.a(), 0L);
            return true;
        }
        ((oug) ((oug) a.c()).G((char) 1354)).o("processZslBurst(): processor hasn't been initialized.");
        return false;
    }
}
