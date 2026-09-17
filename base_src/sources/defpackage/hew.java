package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class hew implements lie {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/util/FrameRateFrameFilter");
    private static final long b = TimeUnit.SECONDS.toNanos(1);
    private static final long c = TimeUnit.MILLISECONDS.toNanos(5);
    private final long d;
    private final long e;
    private long f;
    private final epz g;

    public hew(long j, float f, float f2, epz epzVar) {
        long j2 = b;
        long j3 = (long) (j2 / f2);
        this.e = j3;
        this.d = f > -1.0f ? ((long) (f * j2)) + j + (j3 / 2) : -1L;
        this.f = j > -1 ? j + j3 : -1L;
        this.g = epzVar;
    }

    public final synchronized void a(lmr lmrVar) {
        lmr lmrVarA;
        if (lmrVar != null) {
            if (lmrVar.b() != null) {
                try {
                    lmw lmwVarB = lmrVar.b();
                    lmwVarB.getClass();
                    long j = lmwVarB.b;
                    long j2 = this.d;
                    if (j2 > -1 && j > j2) {
                        this.g.a();
                    } else if (j > this.f - c && (lmrVarA = lmrVar.a()) != null) {
                        lmrVar.b();
                        epz epzVar = this.g;
                        synchronized (epzVar.b) {
                            try {
                                plj pljVarA = epzVar.b.e.a(lmrVarA);
                                if (epzVar.a != null) {
                                    ovd ovdVar = ovl.a;
                                    pljVarA.b.c();
                                    esj esjVar = epzVar.a;
                                    esjVar.getClass();
                                    esjVar.e(pljVarA);
                                } else {
                                    eqa eqaVar = epzVar.b;
                                    List list = (List) eqaVar.g.get(Integer.valueOf(eqaVar.i));
                                    if (list != null) {
                                        ovd ovdVar2 = ovl.a;
                                        eqa eqaVar2 = epzVar.b;
                                        pljVarA.b.c();
                                        list.add(pljVarA);
                                    } else {
                                        ((oug) ((oug) eqa.a.c().g(ovl.a, "LasagnaBufferLstnr")).G(1364)).p("Can't find cache for shot %s", epzVar.b.i);
                                        pljVarA.d.run();
                                    }
                                }
                                lmrVarA.close();
                            } catch (Throwable th) {
                                lmrVarA.close();
                                throw th;
                            }
                        }
                        lmw lmwVarB2 = lmrVar.b();
                        lmwVarB2.getClass();
                        this.f = lmwVarB2.b + this.e;
                    }
                    lmrVar.close();
                    return;
                } catch (Throwable th2) {
                    lmrVar.close();
                    throw th2;
                }
            }
        }
        ((oug) ((oug) a.c()).G((char) 2415)).o("BufferFilter: Received invalid frame.");
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
    }
}
