package defpackage;

import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pmq implements mfh {
    private final LensApi.LensAvailabilityCallback a;
    private final int b;

    public pmq(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.a = lensAvailabilityCallback;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[PHI: r3
      0x0018: PHI (r3v4 int) = (r3v2 int), (r3v6 int) binds: [B:8:0x0015, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mfh
    public final void a(mfx mfxVar) {
        int iE;
        int i = 1;
        switch (this.b) {
            case 0:
                iE = mip.E(mfxVar.d);
                if (iE != 0) {
                    i = iE;
                }
                break;
            default:
                iE = mip.E(mfxVar.e);
                if (iE != 0) {
                    i = iE;
                }
                break;
        }
        this.a.onAvailabilityStatusFetched(i - 2);
    }
}
