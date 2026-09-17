package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dyx {
    private static final ouj a = ouj.h("com/google/android/apps/camera/gyro/motionestimator/GyroBasedMotionEstimator");
    private final lxb b;
    private final dzb c;
    private final dyz d;
    private final int e;
    private final boolean f;
    private lxa g;
    private boolean h;
    private volatile dza i = null;
    private final int j;

    public dyx(lxb lxbVar, dzb dzbVar, dyz dyzVar, int i, int i2, int i3) {
        this.b = lxbVar;
        this.c = dzbVar;
        this.d = dyzVar;
        this.e = i;
        this.j = i3;
        i2 = i2 != 1 ? 2 : i2;
        obr.aF(true);
        this.f = i2 == 1 && !dyzVar.c;
        this.h = false;
    }

    public final synchronized float a(hjz hjzVar, hjz hjzVar2) {
        dza dzaVar = this.i;
        if (!this.h || dzaVar == null) {
            return -1.0f;
        }
        long j = hjzVar.c;
        float f = hjzVar.g;
        float f2 = hjzVar.h;
        float[] fArrF = dzaVar.f(hjzVar.n);
        long j2 = hjzVar.b;
        long j3 = hjzVar.d;
        long j4 = hjzVar.m;
        long j5 = hjzVar2.c;
        float f3 = hjzVar2.g;
        float f4 = hjzVar2.h;
        float[] fArrF2 = dzaVar.f(hjzVar2.n);
        long j6 = hjzVar2.b;
        long j7 = hjzVar2.d;
        long j8 = hjzVar2.m;
        long jC = dzaVar.c(j2, j3, fArrF);
        long jC2 = dzaVar.c(j4, j3, fArrF);
        long jB = dzaVar.b(j3, fArrF);
        long jC3 = dzaVar.c(j6, j7, fArrF2);
        long jC4 = dzaVar.c(j8, j7, fArrF2);
        long jB2 = dzaVar.b(j7, fArrF2);
        float fA = dzaVar.a(f, f2, fArrF);
        float fA2 = dzaVar.a(f3, f4, fArrF2);
        float[] fArrE = dzaVar.e(hjzVar.a, jC2, jB, j, dzaVar.d, fArrF, false);
        float[] fArrE2 = dzaVar.e(hjzVar2.a, jC4, jB2, j5, dzaVar.d, fArrF2, false);
        mou mouVarA = mou.a(dzaVar.b.d(dza.d(jC, jB, j), fA, fArrE[0], fArrE[1], dza.d(jC3, jB2, j5), fA2, fArrE2[0], fArrE2[1]));
        ArrayList arrayList = new ArrayList();
        float fMax = 0.0f;
        arrayList.add(new float[]{0.0f, 0.0f});
        arrayList.add(new float[]{dzaVar.d.a, 0.0f});
        arrayList.add(new float[]{0.0f, dzaVar.d.b});
        lig ligVar = dzaVar.d;
        arrayList.add(new float[]{ligVar.a, ligVar.b});
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            float[] fArr = (float[]) arrayList.get(i);
            float[] fArrE3 = mouVarA.e(fArr);
            fMax = (float) Math.max(fMax, Math.hypot(fArrE3[0] - fArr[0], fArrE3[1] - fArr[1]));
        }
        return fMax;
    }

    public final List b(long j, hjz hjzVar) throws Throwable {
        mou mouVarA;
        ArrayList arrayList;
        Object obj;
        dza dzaVar = this.i;
        if (hjzVar == null || dzaVar == null) {
            if (hjzVar == null) {
                ((oug) ((oug) a.b()).G(1005)).q("Camera metadata not valid at : %d", j);
            } else {
                ((oug) ((oug) a.b()).G(1004)).q("Gyro transform calculator not valid at : %d", j);
            }
            ArrayList arrayList2 = new ArrayList();
            dza dzaVar2 = this.i;
            if (dzaVar2 != null) {
                int i = dzaVar2.c;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add(mou.b());
                }
            } else {
                ((oug) ((oug) a.b()).G((char) 1003)).o("Gyro transform calculator not valid.");
            }
            return arrayList2;
        }
        d();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long j2 = hjzVar.c;
        float f = hjzVar.g;
        float f2 = hjzVar.h;
        float[] fArrF = dzaVar.f(hjzVar.n);
        float fA = dzaVar.a(f, f2, fArrF);
        long j3 = hjzVar.b;
        long j4 = hjzVar.d;
        ArrayList arrayList5 = arrayList3;
        long j5 = hjzVar.m;
        long jC = dzaVar.c(j3, j4, fArrF);
        long jC2 = dzaVar.c(j5, j4, fArrF);
        long jB = dzaVar.b(j4, fArrF);
        Object obj2 = null;
        float[] fArr = null;
        int i3 = 0;
        while (true) {
            int i4 = dzaVar.c;
            if (i3 >= i4) {
                break;
            }
            long j6 = ((long) i3) * jB;
            long j7 = i4;
            long j8 = j6 / j7;
            long j9 = jB / j7;
            String str = hjzVar.a;
            float[] fArr2 = fArrF;
            long j10 = dzaVar.c;
            int i5 = i3;
            long j11 = j2;
            long j12 = jC2;
            ArrayList arrayList6 = arrayList4;
            float[] fArrE = dzaVar.e(str, (j6 / j10) + jC2, jB / j10, j2, dzaVar.d, fArr2, true);
            float[] fArr3 = new float[9];
            if (true != dzaVar.b.c(dza.d(jC + j8, j9, j11), fA, fArrE[0], fArrE[1], fArr3)) {
                fArr3 = fArr;
            }
            if (fArr3 != null) {
                arrayList = arrayList5;
                arrayList.add(mou.a(fArr3));
                fArr = fArr3;
                obj = null;
            } else {
                arrayList = arrayList5;
                obj = null;
                arrayList.add(null);
            }
            i3 = i5 + 1;
            arrayList5 = arrayList;
            obj2 = obj;
            arrayList4 = arrayList6;
            fArrF = fArr2;
            j2 = j11;
            jC2 = j12;
        }
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = arrayList4;
        int i6 = 9;
        Object obj3 = dzaVar.e;
        synchronized (obj3) {
            try {
                List list = (List) dzaVar.f.get();
                int i7 = 0;
                while (i7 < dzaVar.c) {
                    mou mouVar = (mou) list.get(i7);
                    mou mouVar2 = (mou) arrayList7.get(i7);
                    if (mouVar == null || mouVar2 == null) {
                        try {
                            ((oug) ((oug) dza.a.c()).G(1011)).o("Previous or current projection matrix cannot be computed. Defaulting to identity");
                            arrayList8.add(mou.b());
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        float[] fArr4 = mouVar.c;
                        float f3 = fArr4[0];
                        float f4 = fArr4[4];
                        float f5 = fArr4[8];
                        float f6 = f4 * f5;
                        float f7 = fArr4[5];
                        float f8 = fArr4[7];
                        float f9 = f6 - (f7 * f8);
                        obj3 = obj3;
                        double d = f3 * f9;
                        Double.isNaN(d);
                        double d2 = d + 0.0d;
                        float f10 = fArr4[1];
                        float f11 = fArr4[3];
                        float f12 = f5 * f11;
                        float f13 = fArr4[6];
                        double d3 = f10 * (f12 - (f7 * f13));
                        Double.isNaN(d3);
                        double d4 = d2 - d3;
                        double d5 = fArr4[2] * ((f11 * f8) - (f4 * f13));
                        Double.isNaN(d5);
                        double d6 = d4 + d5;
                        if (d6 == 0.0d) {
                            mouVarA = null;
                        } else {
                            float f14 = (float) (1.0d / d6);
                            float[] fArr5 = new float[i6];
                            fArr5[0] = f9 * f14;
                            fArr5[1] = (-((fArr4[1] * fArr4[8]) - (fArr4[2] * fArr4[7]))) * f14;
                            fArr5[2] = ((fArr4[1] * fArr4[5]) - (fArr4[2] * fArr4[4])) * f14;
                            fArr5[3] = (-((fArr4[3] * fArr4[8]) - (fArr4[5] * fArr4[6]))) * f14;
                            fArr5[4] = ((fArr4[0] * fArr4[8]) - (fArr4[2] * fArr4[6])) * f14;
                            fArr5[5] = (-((fArr4[0] * fArr4[5]) - (fArr4[2] * fArr4[3]))) * f14;
                            fArr5[6] = ((fArr4[3] * fArr4[7]) - (fArr4[4] * fArr4[6])) * f14;
                            fArr5[7] = (-((fArr4[0] * fArr4[7]) - (fArr4[1] * fArr4[6]))) * f14;
                            fArr5[8] = ((fArr4[0] * fArr4[4]) - (fArr4[1] * fArr4[3])) * f14;
                            mouVarA = mou.a(fArr5);
                        }
                        if (mouVarA == null) {
                            ((oug) ((oug) dza.a.c()).G(1012)).o("Inverse cannot be computed. Defaulting to identity");
                            arrayList8.add(mou.b());
                        } else {
                            float[] fArrD = mouVarA.d();
                            float[] fArr6 = new float[i6];
                            for (int i8 = 0; i8 < 3; i8++) {
                                for (int i9 = 0; i9 < 3; i9++) {
                                    for (int i10 = 0; i10 < 3; i10++) {
                                        int i11 = i8 * 3;
                                        int i12 = i11 + i9;
                                        fArr6[i12] = fArr6[i12] + (mouVar2.c[i11 + i10] * fArrD[(i10 * 3) + i9]);
                                    }
                                }
                            }
                            arrayList8.add(mou.a(fArr6));
                        }
                    }
                    i7++;
                    obj3 = obj3;
                    i6 = 9;
                }
                Object obj4 = obj3;
                dzaVar.f.set(arrayList7);
                return arrayList8;
            } catch (Throwable th2) {
                th = th2;
                obj3 = obj3;
            }
        }
    }

    public final synchronized void c() {
        this.h = false;
        final lxa lxaVar = this.g;
        if (lxaVar != null) {
            oxh.g(new ouk() { // from class: dyw
                @Override // defpackage.ouk
                public final Object a() {
                    return lxaVar.a();
                }
            });
        }
        lxa lxaVar2 = this.g;
        if (lxaVar2 != null) {
            lxaVar2.close();
        }
        this.i = null;
    }

    public final synchronized void d() {
        lxa lxaVar = this.g;
        if (this.h && lxaVar != null) {
            this.d.a(lxaVar);
        }
    }

    public final synchronized boolean e() {
        return this.h;
    }

    public final synchronized void f(lig ligVar, String str) {
        if (this.f) {
            return;
        }
        dzb dzbVar = this.c;
        int i = this.e;
        int i2 = this.j;
        SizeF sizeF = (SizeF) dzbVar.a.l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        sizeF.getClass();
        if (i2 != 1) {
            i2 = 2;
        }
        obr.aF(true);
        this.i = new dza(sizeF, ligVar, dzbVar.d.b(), i, dzbVar.b, i2 == 1 ? (enr) dzbVar.c.get() : new enp(), dzbVar.e.g() ? ope.H(((lvs) dzbVar.e.c()).a) : orx.a);
        lxa lxaVarA = this.b.a(str);
        this.g = lxaVarA;
        if (lxaVarA != null) {
            this.h = true;
        }
    }
}
