package defpackage;

import android.opengl.Matrix;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public final class fdr extends fcp {
    public final fdp f;
    private fej m;
    private final float[] h = new float[16];
    private final float[] i = new float[16];
    private final float[] j = new float[16];
    private final float[] k = new float[16];
    private final jua l = new jua();
    private double n = -1.0d;
    public final Vector g = new Vector();

    public fdr(fdp fdpVar) {
        this.f = fdpVar;
        try {
            this.m = new fej();
            fcq.a("photo collection");
        } catch (fcq e) {
            e.printStackTrace();
        }
        Matrix.setIdentityM(this.j, 0);
        Matrix.rotateM(this.j, 0, 180.0f, 1.0f, 0.0f, 0.0f);
    }

    public final int b(float[] fArr) {
        fdq fdqVar = new fdq();
        fdqVar.b = (float[]) fArr.clone();
        float[] fArr2 = fdqVar.b;
        float[] fArr3 = fdqVar.a;
        float[] fArr4 = this.i;
        fArr4[0] = fArr2[0];
        fArr4[1] = fArr2[1];
        fArr4[2] = fArr2[2];
        fArr4[3] = 0.0f;
        fArr4[4] = fArr2[3];
        fArr4[5] = fArr2[4];
        fArr4[6] = fArr2[5];
        fArr4[7] = 0.0f;
        fArr4[8] = fArr2[6];
        fArr4[9] = fArr2[7];
        fArr4[10] = fArr2[8];
        fArr4[14] = 0.0f;
        fArr4[13] = 0.0f;
        fArr4[12] = 0.0f;
        fArr4[11] = 0.0f;
        fArr4[15] = 1.0f;
        Matrix.multiplyMM(this.h, 0, this.j, 0, fArr4, 0);
        Matrix.transposeM(fArr3, 0, this.h, 0);
        fdqVar.e = 0.1f;
        fdqVar.i = new kus(null, null);
        fcz.h(fdqVar.i.a);
        fdqVar.j = new kus(null, null);
        this.g.add(fdqVar);
        return fdqVar.j.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:54:0x01a8, B:23:0x0091, B:29:0x00b3, B:34:0x00c2, B:36:0x00cf, B:38:0x011d, B:40:0x013b, B:42:0x015c, B:48:0x018c, B:49:0x018f, B:52:0x01a0, B:43:0x0170, B:37:0x00d5, B:61:0x01d1, B:56:0x01c0), top: B:65:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:54:0x01a8, B:23:0x0091, B:29:0x00b3, B:34:0x00c2, B:36:0x00cf, B:38:0x011d, B:40:0x013b, B:42:0x015c, B:48:0x018c, B:49:0x018f, B:52:0x01a0, B:43:0x0170, B:37:0x00d5, B:61:0x01d1, B:56:0x01c0), top: B:65:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    @Override // defpackage.fcp
    public final void c(float[] fArr) throws Throwable {
        boolean z;
        double d;
        double d2;
        long j;
        float[] fArr2;
        double d3;
        double dAcos;
        fdp fdpVar = this.f;
        fcr fcrVar = fdpVar.e;
        boolean z2 = fdpVar.l;
        boolean z3 = fdpVar.m;
        int i = 0;
        fdpVar.l = false;
        fdpVar.m = true;
        fdpVar.e = this.m;
        double d4 = this.n;
        double d5 = -1.0d;
        double d6 = 0.0d;
        long j2 = 4607182418800017408L;
        if (d4 >= 0.0d) {
            double d7 = d4 + ((1.0d - d4) * 0.05d);
            this.n = d7;
            if (d7 >= 0.95d) {
                this.n = -1.0d;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Vector vector = this.g;
        synchronized (vector) {
            while (i < this.g.size()) {
                try {
                    fdq fdqVar = (fdq) this.g.get(i);
                    if (fdqVar.g) {
                        float f = fdqVar.e;
                        int i2 = fdqVar.h;
                        if (fdqVar.i.a != -1 && z) {
                            boolean z4 = fdqVar.f;
                        }
                        float[] fArr3 = fdqVar.a;
                        double d8 = this.n;
                        if (d8 >= d6) {
                            jua juaVar = fdqVar.c;
                            jua juaVar2 = fdqVar.d;
                            jua juaVar3 = this.l;
                            double d9 = (juaVar.a * juaVar2.a) + (juaVar.b * juaVar2.b) + (juaVar.c * juaVar2.c) + (juaVar.d * juaVar2.d);
                            if (d9 <= 1.0d) {
                                d2 = -1.0d;
                                if (d9 < -1.0d) {
                                }
                                d = 0.0d;
                                if (d9 < 0.0d) {
                                    d9 = -d9;
                                    d3 = d2;
                                } else {
                                    d3 = 1.0d;
                                }
                                dAcos = Math.acos(d9);
                                if (dAcos <= 1.0E-6d) {
                                    juaVar3.a(juaVar2);
                                    j = 4607182418800017408L;
                                } else {
                                    j = 4607182418800017408L;
                                    double dSin = 1.0d / Math.sin(dAcos);
                                    double dSin2 = Math.sin((1.0d - d8) * dAcos) * dSin;
                                    double dSin3 = d3 * Math.sin(d8 * dAcos) * dSin;
                                    juaVar3.a = (juaVar.a * dSin2) + (juaVar2.a * dSin3);
                                    juaVar3.b = (juaVar.b * dSin2) + (juaVar2.b * dSin3);
                                    juaVar3.c = (juaVar.c * dSin2) + (juaVar2.c * dSin3);
                                    juaVar3.d = (juaVar.d * dSin2) + (juaVar2.d * dSin3);
                                }
                                this.l.b(this.i);
                                fArr2 = this.i;
                            } else {
                                d2 = -1.0d;
                            }
                            juaVar3.a(juaVar2);
                            d = 0.0d;
                            if (d9 < 0.0d) {
                                d9 = -d9;
                                d3 = d2;
                            } else {
                                d3 = 1.0d;
                            }
                            dAcos = Math.acos(d9);
                            if (dAcos <= 1.0E-6d) {
                                juaVar3.a(juaVar2);
                                j = 4607182418800017408L;
                            } else {
                                j = 4607182418800017408L;
                                double dSin4 = 1.0d / Math.sin(dAcos);
                                double dSin5 = Math.sin((1.0d - d8) * dAcos) * dSin4;
                                double dSin6 = d3 * Math.sin(d8 * dAcos) * dSin4;
                                juaVar3.a = (juaVar.a * dSin5) + (juaVar2.a * dSin6);
                                juaVar3.b = (juaVar.b * dSin5) + (juaVar2.b * dSin6);
                                juaVar3.c = (juaVar.c * dSin5) + (juaVar2.c * dSin6);
                                juaVar3.d = (juaVar.d * dSin5) + (juaVar2.d * dSin6);
                            }
                            this.l.b(this.i);
                            fArr2 = this.i;
                        } else {
                            d = d6;
                            d2 = -1.0d;
                            j = 4607182418800017408L;
                            fArr2 = fArr3;
                        }
                        Matrix.multiplyMM(this.k, 0, fArr, 0, fArr2, 0);
                        this.m.c();
                        int i3 = fdqVar.i.a;
                        int i4 = fdqVar.j.a;
                        if (i3 != -1) {
                            boolean z5 = fdqVar.f;
                            this.f.e(i3);
                            this.m.j(f);
                            this.f.a(this.k);
                        } else {
                            this.f.e(i4);
                            this.m.j(1.0f);
                            this.f.a(this.k);
                        }
                        if (f < 1.0f) {
                            if (f > 0.99f) {
                                fdqVar.e = 1.0f;
                            } else {
                                fdqVar.e += (1.0f - f) * 0.05f;
                            }
                        }
                        if (i2 < 500) {
                            fdqVar.h++;
                        }
                    } else {
                        z2 = z2;
                        z3 = z3;
                        i = i;
                        vector = vector;
                        d2 = d5;
                        d = d6;
                        j = j2;
                        fcrVar = fcrVar;
                    }
                    try {
                        d5 = d2;
                        j2 = j;
                        z2 = z2;
                        z3 = z3;
                        i++;
                        fcrVar = fcrVar;
                        d6 = d;
                        vector = vector;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    vector = vector;
                }
            }
            fcr fcrVar2 = fcrVar;
            boolean z6 = z2;
            boolean z7 = z3;
            fdp fdpVar2 = this.f;
            fdpVar2.l = z6;
            fdpVar2.m = z7;
            fdpVar2.e = fcrVar2;
        }
    }

    public final int e() {
        return this.g.size();
    }

    public final void f(int i, boolean z) {
        if (i < this.g.size()) {
            ((fdq) this.g.get(i)).g = z;
        }
    }
}
