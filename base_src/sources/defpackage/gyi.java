package defpackage;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class gyi {
    public final lnc a;
    public final lqd b;
    private final lnx c;
    private final gmu d;
    private final gwi e;
    private final ljf f;
    private final gzf g;
    private final gyg h;

    public gyi(lnc lncVar, lqd lqdVar, lnx lnxVar, gmu gmuVar, gwi gwiVar, ljf ljfVar, gzf gzfVar, gyg gygVar) {
        this.a = lncVar;
        this.b = lqdVar;
        this.c = lnxVar;
        this.d = gmuVar;
        this.e = gwiVar;
        this.f = ljfVar;
        this.g = gzfVar;
        this.h = gygVar;
    }

    public final goy a(int i) {
        lnc lncVar = this.a;
        lnx lnxVar = this.c;
        lqd lqdVar = this.b;
        gmu gmuVar = this.d;
        gxq gxqVar = new gxq();
        gwi gwiVar = this.e;
        lnu lnuVarA = lnv.a();
        lnuVarA.c(1);
        lnuVarA.b(4);
        lnuVarA.e(4);
        lnuVarA.d(true);
        return new gov(new gym(lncVar, lnxVar, lqdVar, gmuVar, i, gxqVar, gwiVar, lnuVarA.a(), this.f), 3, false);
    }

    public final goy b(lmv lmvVar, goy goyVar) {
        return new gov(new hav(this.g.a(1000000000L, lmvVar, obr.av(Integer.valueOf(lmvVar.a())), 1), new gyh(goyVar, lmvVar), kcy.a != null ? ope.K(mip.be(CaptureRequest.EDGE_MODE, 1), mip.be(CaptureRequest.NOISE_REDUCTION_MODE, 1), mip.be(CaptureRequest.FLASH_MODE, 0), mip.be(kcy.a, 0)) : ope.J(mip.be(CaptureRequest.EDGE_MODE, 1), mip.be(CaptureRequest.NOISE_REDUCTION_MODE, 1), mip.be(CaptureRequest.FLASH_MODE, 0)), this.d, this.c.a(), this.f, this.h), 4, false);
    }
}
