package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaCodec;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ink {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/FrameSelector");
    public final SensorManager A;
    public final SensorEventListener B;
    public final cpj C;
    public final cpp D;
    public final Sensor E;
    public iqq F;
    public iql G;
    public iqo H;
    public pih J;
    public iqn K;
    public Timer L;
    public ios M;
    public ldv N;
    public final enl O;
    private final long P;
    public final cvo u;
    public final lzi v;
    public final ddf w;
    public final qkg y;
    public final lda z;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final pgl f = new pgl(null);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicLong i = new AtomicLong(0);
    public final AtomicLong j = new AtomicLong(0);
    public final AtomicLong k = new AtomicLong(0);
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicLong m = new AtomicLong(0);
    public final AtomicLong n = new AtomicLong(0);
    public final AtomicLong o = new AtomicLong(0);
    public final AtomicLong p = new AtomicLong(0);
    public final AtomicLong q = new AtomicLong(0);
    public final AtomicLong r = new AtomicLong(0);
    public final AtomicLong s = new AtomicLong(0);
    public final AtomicLong t = new AtomicLong(0);
    public final Object x = new Object();
    public ojc I = oih.a;

    public ink(khx khxVar, cvo cvoVar, lzi lziVar, qkg qkgVar, ddf ddfVar, cpj cpjVar, cpp cppVar, enl enlVar, lda ldaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (ddfVar.k(deg.b)) {
            this.P = 33000L;
        } else {
            this.P = 10000L;
        }
        this.u = cvoVar;
        this.v = lziVar;
        this.y = qkgVar;
        this.w = ddfVar;
        this.E = khxVar.l().getDefaultSensor(4);
        this.A = khxVar.l();
        this.C = cpjVar;
        this.D = cppVar;
        this.O = enlVar;
        this.z = ldaVar;
        this.B = new ini(this, cvoVar);
        this.K = iqn.MANUAL_FPS_30_1X;
        this.J = pih.f();
    }

    private static final void h(lmr lmrVar, mad madVar) {
        madVar.close();
        lmrVar.close();
    }

    public final long a() {
        return this.i.get();
    }

    public final long b() {
        return this.j.get() - this.i.get();
    }

    public final long c() {
        return TimeUnit.SECONDS.toMillis(this.j.get()) / ((long) this.K.f);
    }

    public final long d() {
        return this.k.get();
    }

    final void e() {
        if (this.C.c()) {
            Sensor sensor = this.E;
            if (sensor != null) {
                this.A.unregisterListener(this.B, sensor);
            }
            iqq iqqVar = this.F;
            iqqVar.getClass();
            iqqVar.c();
        }
    }

    public final void f(long j, lmr lmrVar, mad madVar, ojc ojcVar, ojc ojcVar2) throws Throwable {
        boolean z;
        boolean z2;
        iql iqlVar;
        long micros;
        long micros2;
        if (!this.b.get()) {
            if (!this.c.get()) {
                h(lmrVar, madVar);
                return;
            } else if (ojcVar.g() && !((Boolean) ojcVar.c()).booleanValue()) {
                h(lmrVar, madVar);
                return;
            }
        }
        if (ojcVar.g() && this.h.incrementAndGet() <= 1 && ((Boolean) ojcVar.c()).booleanValue()) {
            this.h.get();
            h(lmrVar, madVar);
            return;
        }
        ldv ldvVar = this.N;
        ldvVar.getClass();
        lfj lfjVar = ldvVar.a;
        lfjVar.getClass();
        MediaCodec mediaCodecB = lfjVar.b();
        mediaCodecB.getClass();
        if (!this.b.get()) {
            z = false;
        } else if (this.q.get() > 0) {
            this.b.set(false);
            z = true;
        } else {
            ((oug) ((oug) a.c()).G((char) 3026)).o("onImageAvailable() - Wait for at least one frame to stop recording.");
            z = false;
        }
        synchronized (this.x) {
            try {
                try {
                    ios iosVar = this.M;
                    iosVar.getClass();
                    iqn iqnVar = this.K;
                    iqo iqoVar = this.H;
                    iqoVar.getClass();
                    iql iqlVar2 = this.G;
                    iqlVar2.getClass();
                    double dA = this.f.a();
                    iqm iqmVarC = iqnVar.c(dA);
                    if (!this.I.g()) {
                        iqlVar2.f(iqmVarC);
                        iqlVar2.d(iqmVarC);
                    } else if (this.I.c() != iqmVarC) {
                        iqlVar2.d(iqmVarC);
                    }
                    this.I = ojc.i(iqmVarC);
                    if (ojcVar2.g()) {
                        iqq iqqVar = this.F;
                        iqqVar.getClass();
                        if (iqqVar.d()) {
                            synchronized (iqlVar2.a) {
                                iqlVar2.i = true;
                            }
                        }
                    }
                    if (!g(j, iqnVar.e, dA, z, ojcVar2)) {
                        z = z;
                    } else if (z) {
                        this.d.set(true);
                        this.l.incrementAndGet();
                        z = z;
                    } else {
                        int iDequeueInputBuffer = mediaCodecB.dequeueInputBuffer(10000L);
                        if (iDequeueInputBuffer >= 0) {
                            ByteBuffer inputBuffer = mediaCodecB.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer != null) {
                                inputBuffer.put(((mac) madVar.g().get(0)).getBuffer());
                                inputBuffer.put(((mac) madVar.g().get(2)).getBuffer());
                                long j2 = this.q.get();
                                int i = iqnVar.f;
                                if (this.n.get() == 0) {
                                    this.n.set(TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis()));
                                    micros2 = this.n.get();
                                } else {
                                    micros2 = this.n.get() + (TimeUnit.SECONDS.toMicros(j2) / ((long) i));
                                }
                                mediaCodecB.queueInputBuffer(iDequeueInputBuffer, 0, inputBuffer.capacity(), micros2, 0);
                                this.l.incrementAndGet();
                            }
                            h(lmrVar, madVar);
                        }
                        z = z;
                    }
                    if (this.l.get() > 0 || this.d.get()) {
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        int iDequeueOutputBuffer = mediaCodecB.dequeueOutputBuffer(bufferInfo, this.P);
                        if (iDequeueOutputBuffer == -1) {
                            iqlVar = iqlVar2;
                        } else if (iDequeueOutputBuffer == -2) {
                            lfjVar.l(mediaCodecB.getOutputFormat());
                            iqlVar = iqlVar2;
                        } else if (iDequeueOutputBuffer < 0) {
                            ((oug) ((oug) a.b()).G(3034)).p("selectAndDropFrames() - Unexpected result during dequeueOutputBuffer: %d", iDequeueOutputBuffer);
                            iqlVar = iqlVar2;
                        } else {
                            if ((bufferInfo.flags & 2) != 0) {
                                bufferInfo.size = 0;
                            }
                            if (bufferInfo.size != 0) {
                                long j3 = this.q.get();
                                int i2 = iqnVar.f;
                                if (this.m.get() == 0) {
                                    this.m.set(TimeUnit.MILLISECONDS.toMicros(SystemClock.uptimeMillis()));
                                    micros = this.m.get();
                                } else {
                                    micros = (TimeUnit.SECONDS.toMicros(j3) / ((long) i2)) + this.m.get();
                                }
                                bufferInfo.presentationTimeUs = micros;
                                lfjVar.n(iDequeueOutputBuffer, bufferInfo);
                                this.k.set(TimeUnit.SECONDS.toMillis(this.i.incrementAndGet()) / ((long) iqnVar.f));
                                this.t.set(TimeUnit.SECONDS.toMillis(this.q.incrementAndGet()) / ((long) iqnVar.f));
                                z2 = true;
                            } else {
                                mediaCodecB.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                z2 = false;
                            }
                            AtomicLong atomicLong = this.l;
                            atomicLong.set(atomicLong.get() - 1);
                            if (z2) {
                                iqlVar = iqlVar2;
                                iqlVar.c(iqmVarC);
                            } else {
                                iqlVar = iqlVar2;
                            }
                        }
                        if (z) {
                            ((oug) ((oug) a.c()).G((char) 3031)).o("Received Eos frame. Stop recording.");
                            this.c.set(false);
                            this.d.set(false);
                            iqoVar.h(d());
                            iqoVar.i(c());
                            iqoVar.c(a());
                            iqoVar.d(b());
                            iqlVar.e(TimeUnit.SECONDS.toMillis(this.r.get()) / ((long) this.K.f));
                            iqlVar.g(this.t.get());
                            this.q.get();
                            iqlVar.h();
                            this.r.get();
                            this.q.get();
                            iqlVar.i();
                            pih pihVar = this.J;
                            pihVar.getClass();
                            pihVar.o(null);
                        }
                    } else {
                        iqlVar = iqlVar2;
                    }
                    if (!z) {
                        iosVar.a(this.q.get(), iqnVar.f);
                        this.j.incrementAndGet();
                        iqlVar.b(iqmVarC);
                    }
                    h(lmrVar, madVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    final boolean g(long j, int i, double d, boolean z, ojc ojcVar) {
        double d2 = i;
        Double.isNaN(d2);
        boolean zBooleanValue = j % ((long) ((int) (d2 / d))) == 0;
        if (ojcVar.g()) {
            if (!((Boolean) ojcVar.c()).booleanValue() && zBooleanValue) {
                ((oug) ((oug) a.b()).G((char) 3035)).o("The frame is not warped. Ignore");
            }
            zBooleanValue &= ((Boolean) ojcVar.c()).booleanValue();
        }
        return zBooleanValue || z || this.b.get();
    }
}
