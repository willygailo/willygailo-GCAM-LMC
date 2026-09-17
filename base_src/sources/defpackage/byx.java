package defpackage;

import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class byx implements Runnable {
    public final /* synthetic */ byz a;
    private final /* synthetic */ int b;

    public /* synthetic */ byx(byz byzVar, int i) {
        this.b = i;
        this.a = byzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                final byz byzVar = this.a;
                obr.aR(byzVar.o == null, "Already started");
                obr.aR(!byzVar.q, "Cannot be started when closed");
                if (byzVar.n == null) {
                    byzVar.n = (BaseCurator) byzVar.e.get();
                }
                byzVar.p = byzVar.h.a(new lij() { // from class: byt
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        Boolean bool = (Boolean) obj;
                        BaseCurator baseCurator = byzVar.n;
                        if (baseCurator != null) {
                            baseCurator.b(bool.booleanValue());
                        }
                    }
                }, byzVar.f);
                byzVar.o = byzVar.g.r(byzVar.g.s(byzVar.l), 1);
                byzVar.o.k(new lmu() { // from class: byu
                    @Override // defpackage.lmu
                    public final void a(lrr lrrVar) {
                        final byz byzVar2 = byzVar;
                        mip.bj(lrrVar, new lnn() { // from class: byv
                            @Override // defpackage.lnn
                            public final void a(final lmr lmrVar) {
                                final byz byzVar3 = byzVar2;
                                byzVar3.f.execute(new Runnable() { // from class: byy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BaseCurator baseCurator;
                                        oom oomVarJ;
                                        long j;
                                        boolean z;
                                        long j2;
                                        float f;
                                        byz byzVar4 = byzVar3;
                                        lmr lmrVar2 = lmrVar;
                                        byzVar4.m.e("AutoTimerAnalysis#processFrame");
                                        if (byzVar4.b.d != bzp.CAPTURING || (baseCurator = byzVar4.n) == null) {
                                            byzVar4 = byzVar4;
                                        } else {
                                            mad madVarD = lmrVar2.d(byzVar4.l);
                                            try {
                                                lzv lzvVarC = lmrVar2.c();
                                                lmw lmwVarB = lmrVar2.b();
                                                if (madVarD != null && lzvVarC != null && lmwVarB != null) {
                                                    bzv bzvVar = byzVar4.j;
                                                    lig ligVarB = byzVar4.l.b();
                                                    final ArrayList arrayList = new ArrayList();
                                                    ojc ojcVar = (ojc) byzVar4.k.get();
                                                    if (ojcVar.g()) {
                                                        lxa lxaVar = (lxa) ojcVar.c();
                                                        Long l = (Long) lzvVarC.d(CaptureResult.SENSOR_TIMESTAMP);
                                                        l.getClass();
                                                        long jLongValue = l.longValue();
                                                        Long l2 = (Long) lzvVarC.d(CaptureResult.SENSOR_EXPOSURE_TIME);
                                                        l2.getClass();
                                                        long jLongValue2 = l2.longValue() + jLongValue + byzVar4.i.f(lzvVarC);
                                                        long nanos = TimeUnit.SECONDS.toNanos(1L) / 200;
                                                        lxaVar.b(jLongValue - nanos, jLongValue2 + nanos, new lwz() { // from class: byw
                                                            @Override // defpackage.lwz
                                                            public final void a(List list) {
                                                                arrayList.addAll(list);
                                                            }
                                                        });
                                                        oomVarJ = oom.j(arrayList);
                                                    } else {
                                                        oomVarJ = oom.l();
                                                    }
                                                    hjz hjzVarA = hjz.a(lzvVarC, bzvVar.c, bzvVar.a.b().e);
                                                    poy poyVarM = pue.b.m();
                                                    List listAm = obr.am(oomVarJ, bxe.f);
                                                    if (poyVarM.c) {
                                                        poyVarM.m();
                                                        poyVarM.c = false;
                                                    }
                                                    pue pueVar = (pue) poyVarM.b;
                                                    ppm ppmVar = pueVar.a;
                                                    if (!ppmVar.c()) {
                                                        pueVar.a = ppd.B(ppmVar);
                                                    }
                                                    pnl.e(listAm, pueVar.a);
                                                    pue pueVar2 = (pue) poyVarM.j();
                                                    pte pteVarL = enl.L(hjzVarA, ligVarB.a / hjzVarA.s.width(), ligVarB.b / hjzVarA.s.height());
                                                    poy poyVarM2 = ptx.k.m();
                                                    int i = true != bzvVar.b ? 3 : 2;
                                                    if (poyVarM2.c) {
                                                        poyVarM2.m();
                                                        poyVarM2.c = false;
                                                    }
                                                    ptx ptxVar = (ptx) poyVarM2.b;
                                                    ptxVar.b = i - 1;
                                                    int i2 = ptxVar.a | 1;
                                                    ptxVar.a = i2;
                                                    int i3 = hjzVarA.r;
                                                    if (i3 == 90) {
                                                        i3 = 270;
                                                    } else if (i3 == 270) {
                                                        i3 = 90;
                                                    }
                                                    int i4 = i2 | 4;
                                                    ptxVar.a = i4;
                                                    ptxVar.c = i3;
                                                    long j3 = hjzVarA.c;
                                                    int i5 = i4 | 16;
                                                    ptxVar.a = i5;
                                                    ptxVar.d = j3;
                                                    long j4 = hjzVarA.d;
                                                    int i6 = i5 | 32;
                                                    ptxVar.a = i6;
                                                    ptxVar.e = j4;
                                                    long j5 = hjzVarA.j;
                                                    int i7 = i6 | 64;
                                                    ptxVar.a = i7;
                                                    ptxVar.f = j5;
                                                    long j6 = hjzVarA.k;
                                                    int i8 = i7 | 128;
                                                    ptxVar.a = i8;
                                                    ptxVar.g = j6;
                                                    long j7 = hjzVarA.i;
                                                    int i9 = i8 | 256;
                                                    ptxVar.a = i9;
                                                    ptxVar.h = j7;
                                                    long j8 = hjzVarA.l;
                                                    int i10 = i9 | 512;
                                                    ptxVar.a = i10;
                                                    ptxVar.i = j8;
                                                    long j9 = hjzVarA.e;
                                                    ptxVar.a = i10 | 1024;
                                                    ptxVar.j = j9;
                                                    ptx ptxVar2 = (ptx) poyVarM2.j();
                                                    poy poyVarM3 = puc.i.m();
                                                    float f2 = hjzVarA.o;
                                                    if (poyVarM3.c) {
                                                        poyVarM3.m();
                                                        poyVarM3.c = false;
                                                    }
                                                    puc pucVar = (puc) poyVarM3.b;
                                                    pucVar.a |= 4;
                                                    pucVar.b = f2;
                                                    puc pucVar2 = (puc) poyVarM3.j();
                                                    poy poyVarM4 = pud.l.m();
                                                    long j10 = lmwVarB.c;
                                                    if (poyVarM4.c) {
                                                        poyVarM4.m();
                                                        poyVarM4.c = false;
                                                    }
                                                    pud pudVar = (pud) poyVarM4.b;
                                                    int i11 = pudVar.a | 1;
                                                    pudVar.a = i11;
                                                    pudVar.b = j10;
                                                    long j11 = lmwVarB.b;
                                                    int i12 = i11 | 2;
                                                    pudVar.a = i12;
                                                    pudVar.c = j11;
                                                    ptxVar2.getClass();
                                                    pudVar.d = ptxVar2;
                                                    int i13 = i12 | 32;
                                                    pudVar.a = i13;
                                                    pteVarL.getClass();
                                                    pudVar.e = pteVarL;
                                                    int i14 = i13 | 64;
                                                    pudVar.a = i14;
                                                    boolean z2 = hjzVarA.q;
                                                    int i15 = i14 | 512;
                                                    pudVar.a = i15;
                                                    pudVar.f = z2;
                                                    pueVar2.getClass();
                                                    pudVar.h = pueVar2;
                                                    int i16 = i15 | 16384;
                                                    pudVar.a = i16;
                                                    pucVar2.getClass();
                                                    pudVar.i = pucVar2;
                                                    pudVar.a = i16 | 32768;
                                                    try {
                                                        pvb pvbVarA = baseCurator.a(madVarD, (pud) poyVarM4.j());
                                                        byzVar4 = byzVar4;
                                                        bzu bzuVar = byzVar4.d;
                                                        long j12 = lmwVarB.c;
                                                        HashSet hashSet = new HashSet(bzuVar.c.keySet());
                                                        bzuVar.d = j12;
                                                        if (bzuVar.e == 0) {
                                                            bzuVar.e = j12;
                                                        }
                                                        ptt pttVar = pvbVarA.a;
                                                        if (pttVar == null) {
                                                            pttVar = ptt.d;
                                                        }
                                                        if ((pttVar.a & 1) != 0) {
                                                            ptv ptvVar = pttVar.b;
                                                            if (ptvVar == null) {
                                                                ptvVar = ptv.b;
                                                            }
                                                            Iterator it = ptvVar.a.iterator();
                                                            while (it.hasNext()) {
                                                                Long lValueOf = Long.valueOf(((Long) it.next()).longValue());
                                                                hashSet.remove(lValueOf);
                                                                float f3 = pvbVarA.b;
                                                                bzt bztVar = new bzt();
                                                                ojt ojtVar = new ojt(bzuVar.b);
                                                                ojtVar.d();
                                                                bztVar.a = ojtVar;
                                                                bztVar.b = f3;
                                                                bzuVar.c.put(lValueOf, bztVar);
                                                            }
                                                        }
                                                        if ((pttVar.a & 2) != 0) {
                                                            ptu ptuVar = pttVar.c;
                                                            if (ptuVar == null) {
                                                                ptuVar = ptu.b;
                                                            }
                                                            j = ptuVar.a;
                                                            hashSet.remove(Long.valueOf(j));
                                                        } else {
                                                            j = 0;
                                                        }
                                                        Iterator it2 = hashSet.iterator();
                                                        while (it2.hasNext()) {
                                                            if (bzuVar.c.remove(Long.valueOf(((Long) it2.next()).longValue())) != null) {
                                                                bzuVar.f++;
                                                            }
                                                        }
                                                        if (j != 0) {
                                                            pud pudVar2 = pvbVarA.d;
                                                            if (pudVar2 == null) {
                                                                pudVar2 = pud.l;
                                                            }
                                                            pud pudVar3 = pudVar2;
                                                            bzt bztVar2 = (bzt) bzuVar.c.remove(Long.valueOf(j));
                                                            if (bztVar2 != null) {
                                                                bztVar2.a.e();
                                                                long jA = bztVar2.a.a(TimeUnit.MILLISECONDS);
                                                                f = bztVar2.b;
                                                                j2 = jA;
                                                            } else {
                                                                j2 = 0;
                                                                f = 0.0f;
                                                            }
                                                            ojt ojtVar2 = bzuVar.a;
                                                            if (ojtVar2.a) {
                                                                ojtVar2.e();
                                                            }
                                                            long jA2 = bzuVar.a.a(TimeUnit.MILLISECONDS);
                                                            long j13 = bzuVar.d;
                                                            int i17 = (int) (j13 - j);
                                                            int i18 = (int) (j - bzuVar.e);
                                                            bzuVar.e = j13;
                                                            bzuVar.a.c();
                                                            bzuVar.a.d();
                                                            int i19 = bzuVar.f;
                                                            bzuVar.f = 0;
                                                            bzs bzsVar = new bzs(jA2, j2, i19, i18, i17, f, pudVar3);
                                                            jdy jdyVar = bzuVar.g;
                                                            synchronized (jdyVar.h) {
                                                                Iterator it3 = jdyVar.h.iterator();
                                                                while (it3.hasNext()) {
                                                                    ((bzd) it3.next()).a(j, bzsVar);
                                                                }
                                                            }
                                                        }
                                                        pvc pvcVar = pvbVarA.c;
                                                        if (pvcVar == null) {
                                                            pvcVar = pvc.d;
                                                        }
                                                        if ((pvcVar.a & 1) != 0) {
                                                            byzVar4.c.fB(Float.valueOf(pvcVar.b));
                                                            z = pvcVar.c;
                                                        } else {
                                                            ((oug) ((oug) byz.a.c()).G(162)).o("No feedback score");
                                                            z = false;
                                                        }
                                                        madVarD.close();
                                                        if (z) {
                                                            jdy jdyVar2 = byzVar4.r;
                                                            synchronized (jdyVar2.h) {
                                                                Iterator it4 = jdyVar2.h.iterator();
                                                                while (it4.hasNext()) {
                                                                    exi exiVar = ((ewl) it4.next()).a;
                                                                    exiVar.d.execute(new ewq(exiVar, 4));
                                                                }
                                                            }
                                                        }
                                                    } catch (IOException e) {
                                                        byzVar4 = byzVar4;
                                                        ((oug) ((oug) ((oug) byz.a.c()).h(e)).G(164)).o("Could not parse curation result, ignoring frame.");
                                                        madVarD.close();
                                                    }
                                                } else if (madVarD != null) {
                                                    madVarD.close();
                                                }
                                            } catch (Throwable th) {
                                                if (madVarD == null) {
                                                    throw th;
                                                }
                                                try {
                                                    madVarD.close();
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        byzVar4.m.f();
                                        lmrVar2.close();
                                    }
                                });
                            }
                        });
                    }
                });
                break;
            default:
                byz byzVar2 = this.a;
                if (!byzVar2.q) {
                    byzVar2.q = true;
                    lmv lmvVar = byzVar2.o;
                    if (lmvVar != null) {
                        lmvVar.close();
                        byzVar2.o = null;
                    }
                    BaseCurator baseCurator = byzVar2.n;
                    if (baseCurator != null) {
                        baseCurator.close();
                        byzVar2.n = null;
                    }
                    lie lieVar = byzVar2.p;
                    if (lieVar != null) {
                        lieVar.close();
                    }
                    break;
                }
                break;
        }
    }
}
