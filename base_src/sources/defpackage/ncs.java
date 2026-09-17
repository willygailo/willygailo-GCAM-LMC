package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
final class ncs extends ncu {
    private final Random a;
    private final mdf b;
    private final long c;
    private final ncd d;

    public ncs(qyj qyjVar, Random random, ncd ncdVar, mdf mdfVar) {
        super(qyjVar);
        this.a = random;
        this.c = qyjVar.b;
        this.d = ncdVar;
        this.b = mdfVar;
    }

    @Override // defpackage.ncu
    public final long a(String str) {
        long j;
        if (oje.d(str)) {
            j = this.c;
        } else {
            ncd ncdVar = this.d;
            long jB = this.b.b() - ncdVar.d;
            if (jB >= 14400000) {
                long j2 = jB / 14400000;
                long jMax = Math.max(j2, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = ncdVar.a;
                    int i2 = (int) jMax;
                    int i3 = sArr[i] >> i2;
                    sArr[i] = (short) i3;
                    ncdVar.b[i] = (short) (i3 >> i2);
                }
                ncdVar.d += j2 * 14400000;
            }
            int iHashCode = str.hashCode() * ncdVar.c;
            int iCharAt = ((iHashCode >>> 24) + (str.isEmpty() ? (char) 0 : str.charAt(0))) & 255;
            int length = ((iHashCode >>> 16) + str.length()) & 255;
            int iMin = Math.min((int) ncdVar.a[iCharAt], (int) ncdVar.b[length]);
            int i4 = iMin + 1;
            short sMin = (short) Math.min(32767, i4);
            short[] sArr2 = ncdVar.a;
            if (sArr2[iCharAt] == iMin) {
                sArr2[iCharAt] = sMin;
            }
            short[] sArr3 = ncdVar.b;
            if (sArr3[length] == iMin) {
                sArr3[length] = sMin;
            }
            double dSqrt = i4 < 50 ? Math.sqrt(i4) : i4;
            double d = this.c;
            Double.isNaN(d);
            j = (int) (d / dSqrt);
        }
        if (this.a.nextDouble() * 1000.0d < j) {
            return j;
        }
        return -1L;
    }

    @Override // defpackage.ncu
    public final qyj b(Long l) {
        return c() ? e(l) : d();
    }

    @Override // defpackage.ncu
    public final boolean c() {
        return this.c > 0;
    }
}
