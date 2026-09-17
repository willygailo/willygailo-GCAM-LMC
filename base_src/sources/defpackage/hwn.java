package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class hwn {
    public final mcu a;
    public long b = -1;
    public long c = -1;
    public long d;
    public long e;
    public long f;
    private final fjs g;
    private final huf h;
    private final jtx i;

    public hwn(fjs fjsVar, mcu mcuVar, jtx jtxVar, huf hufVar, byte[] bArr, byte[] bArr2) {
        this.g = fjsVar;
        this.a = mcuVar;
        this.i = jtxVar;
        this.h = hufVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final void a(boolean z, int i, int i2) {
        int iMax;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.d;
        int iMax2 = j != 0 ? (int) Math.max(jElapsedRealtime - j, 0L) : 0;
        long j2 = this.e;
        if (j2 != 0) {
            long j3 = this.d;
            if (j3 != 0) {
                iMax = (int) Math.max(j2 - j3, 0L);
            } else {
                iMax = 0;
            }
        } else {
            iMax = 0;
        }
        long j4 = this.e;
        int iMax3 = j4 != 0 ? (int) Math.max(jElapsedRealtime - j4, 0L) : 0;
        long j5 = this.f;
        this.g.ah(this.b, this.c, z, iMax2, iMax, iMax3, j5 != 0 ? (int) Math.max(jElapsedRealtime - j5, 0L) : 0, i, i2, ((Integer) this.h.c(htu.U)).intValue());
        if (iMax2 >= 30000) {
            this.i.k();
        }
        this.b = -1L;
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
    }

    final void b(int i, int i2) {
        a(false, i2, i);
    }
}
