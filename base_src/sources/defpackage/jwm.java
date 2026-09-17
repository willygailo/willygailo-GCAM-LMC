package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class jwm implements jww, lms {
    public static final ouj a = ouj.h("com/google/android/apps/camera/viewfindereffects/ViewfinderEffectsPipelineFrameServerImpl");
    public final Executor b;
    public final mpi c;
    public final ljf d;
    public lnx g;
    BufferFlinger i;
    private final lco l;
    private final ljk m;
    private final ljk n;
    private final boolean o;
    private lmv q;
    private Size s;
    public final pih e = pih.f();
    public lwd f = null;
    private long p = -1;
    public lmr h = null;
    private final AtomicBoolean r = new AtomicBoolean(true);
    volatile oom j = oom.l();
    public boolean k = false;
    private final Set t = obr.D();

    public jwm(Executor executor, mpi mpiVar, lco lcoVar, ljf ljfVar, boolean z) {
        this.b = executor;
        this.c = mpiVar;
        this.l = lcoVar;
        this.d = ljfVar;
        this.m = ljfVar.b("VFE.ImageCount");
        this.n = ljfVar.b("VFE.IntervalMs");
        this.o = z;
    }

    @Override // defpackage.lmu
    public final void a(lrr lrrVar) {
        final lmr lmrVarA = lrrVar.a();
        if (lmrVarA == null) {
            return;
        }
        this.b.execute(new Runnable() { // from class: jwk
            @Override // java.lang.Runnable
            public final void run() {
                jwm jwmVar = this.a;
                lmr lmrVar = lmrVarA;
                oom oomVar = jwmVar.j;
                int size = oomVar.size();
                boolean z = false;
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((jws) oomVar.get(i)).c()) {
                        z = true;
                        break;
                    }
                    i = i2;
                }
                lmrVar.j(new jwl(jwmVar, lmrVar, z));
            }
        });
    }

    @Override // defpackage.jww
    public final synchronized mpi b() {
        obr.aR(!this.k, "Tried to get GL context after ViewfinderEffectsPipeline is closed");
        return this.c;
    }

    @Override // defpackage.jwr
    public final ojc c(int i, int i2) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        ljf ljfVar;
        try {
            this.d.e("VFEPipeline#close");
            if (this.k) {
                ljfVar = this.d;
            } else {
                this.k = true;
                lmr lmrVar = this.h;
                if (lmrVar != null) {
                    lmrVar.close();
                }
                BufferFlinger bufferFlinger = this.i;
                if (bufferFlinger != null) {
                    bufferFlinger.close();
                    this.i = null;
                }
                g(oom.l());
                Iterator it = this.t.iterator();
                while (it.hasNext()) {
                    ((jws) it.next()).close();
                }
                this.t.clear();
                this.d.e("glContext");
                this.c.close();
                this.d.f();
                ljfVar = this.d;
            }
            ljfVar.f();
        } catch (Throwable th) {
            this.d.f();
            throw th;
        }
    }

    @Override // defpackage.jww
    public final synchronized void d(lmv lmvVar, lnx lnxVar) {
        lmv lmvVar2 = this.q;
        if (lmvVar2 != lmvVar) {
            if (lmvVar2 != null) {
                lmvVar2.l(this);
            }
            lmvVar.k(this);
        }
        this.g = lnxVar;
        this.q = lmvVar;
    }

    final synchronized void e(lmr lmrVar) {
        lmr lmrVar2 = this.h;
        if (lmrVar2 != null) {
            lmrVar2.close();
        }
        this.h = lmrVar;
        lje ljeVar = new lje(this.d, "VFE.process");
        try {
            BufferFlinger bufferFlinger = this.i;
            if (bufferFlinger == null) {
                ((oug) ((oug) a.c()).G(3532)).o("BufferFlinger is not available. Aborting display.");
            } else {
                Size size = this.s;
                if (size == null) {
                    ((oug) ((oug) a.c()).G(3531)).o("outputSize is not available. Aborting display.");
                } else {
                    final lap lapVar = new lap();
                    lmr lmrVarA = lmrVar.a();
                    if (lmrVarA == null) {
                        ((oug) ((oug) a.c()).G(3530)).o("failed to fork() frame. Aborting display.");
                        lapVar.close();
                    } else {
                        lapVar.c(lmrVarA);
                        if (this.o && this.r.getAndSet(false)) {
                            lapVar.close();
                        } else {
                            mad madVarD = lmrVarA.d(this.g);
                            if (madVarD == null) {
                                ((oug) ((oug) a.c()).G(3529)).o("can't display frame as frame has no associated YUV image");
                                lapVar.close();
                            } else {
                                lapVar.c(madVarD);
                                final HardwareBuffer hardwareBufferF = madVarD.f();
                                if (hardwareBufferF == null) {
                                    ((oug) ((oug) a.c()).G(3528)).o("can't display frame as YUV image has no associated HardwareBuffer");
                                    lapVar.close();
                                } else {
                                    lapVar.c(new lie() { // from class: jwh
                                        @Override // defpackage.lie, java.lang.AutoCloseable
                                        public final void close() {
                                            hardwareBufferF.close();
                                        }
                                    });
                                    oom oomVar = this.j;
                                    if (!oomVar.isEmpty()) {
                                        otj it = oomVar.iterator();
                                        while (it.hasNext()) {
                                            ((jws) it.next()).d(lmrVar, this.g, lmrVar);
                                        }
                                    }
                                    if (this.f == null) {
                                        this.f = ((cvo) this.l).fA().a();
                                    }
                                    int i = this.f == lwd.FRONT ? 13 : 12;
                                    final lji ljiVarA = this.d.a("VFE.Submit");
                                    ljiVarA.getClass();
                                    lapVar.c(new lie() { // from class: jwi
                                        @Override // defpackage.lie, java.lang.AutoCloseable
                                        public final void close() {
                                            ljiVarA.a();
                                        }
                                    });
                                    this.m.b();
                                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                    long j = this.p;
                                    if (j > 0) {
                                        this.n.c((int) Duration.ofNanos(j - jElapsedRealtimeNanos).toMillis());
                                    }
                                    this.p = jElapsedRealtimeNanos;
                                    bufferFlinger.displayBuffer(hardwareBufferF, new Rect(0, 0, madVarD.c(), madVarD.b()), new Rect(0, 0, size.getWidth(), size.getHeight()), i, new BufferFlinger.OnBufferReleasedListener() { // from class: jwj
                                        @Override // com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger.OnBufferReleasedListener
                                        public final void onBufferReleased() {
                                            lapVar.close();
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            }
            ljeVar.close();
        } catch (Throwable th) {
            try {
                ljeVar.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    @Override // defpackage.jww
    public final synchronized void f(Surface surface, Size size) {
        size.getWidth();
        size.getHeight();
        if (this.k) {
            surface.release();
            return;
        }
        BufferFlinger bufferFlinger = this.i;
        if (bufferFlinger != null) {
            bufferFlinger.close();
        }
        this.s = size;
        this.i = new BufferFlinger(surface);
    }

    @Override // defpackage.jww
    public final void g(List list) {
        this.t.addAll(list);
        this.j = oom.j(list);
        Collection.EL.stream(list).map(jlo.n).collect(Collectors.joining(","));
    }
}
