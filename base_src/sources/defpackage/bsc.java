package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class bsc extends mip {
    private final qkg a;
    private final pht b;
    private final gib c;
    private long d = 0;

    public bsc(pht phtVar, gib gibVar, qkg qkgVar) {
        this.c = gibVar;
        this.b = phtVar;
        this.a = qkgVar;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        Integer num;
        bro broVar = (bro) mip.bY(this.b);
        if (broVar == null || !broVar.i()) {
            return;
        }
        long jB = lzvVar.b();
        long j = this.d;
        int iA = broVar.a();
        if (iA == 0 || jB <= j + ((long) iA) || (num = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_MODE)) == null) {
            return;
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE);
        num2.getClass();
        int iIntValue2 = num2.intValue();
        if (iIntValue == 0 || iIntValue2 == 2 || iIntValue2 == 4) {
            this.d = lzvVar.b();
            this.c.b((ghz) this.a.get());
        }
    }
}
