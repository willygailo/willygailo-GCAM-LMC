package defpackage;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* JADX INFO: loaded from: classes.dex */
public final class esd {
    private final pyn a;
    private final hcg b;
    private final pko c;
    private final pkr d;
    private final ljf e;

    public esd(pyn pynVar, hcg hcgVar, pko pkoVar, pkr pkrVar, ljf ljfVar) {
        this.a = pynVar;
        this.b = hcgVar;
        this.c = pkoVar;
        this.d = pkrVar;
        this.e = ljfVar;
    }

    public final plj a(lmr lmrVar) {
        this.e.e("createHdrPlusFrame");
        lzv lzvVarC = lmrVar.c();
        FrameMetadata frameMetadata = new FrameMetadata();
        SpatialGainMap spatialGainMap = new SpatialGainMap();
        if (lzvVarC != null) {
            frameMetadata = ((ebe) this.a.get()).k(lzvVarC, ((ebe) this.a.get()).l(lzvVarC));
            spatialGainMap = this.d.p(lzvVarC);
        }
        mad madVarE = this.b.a(lmrVar).e();
        RawWriteView rawWriteViewB = madVarE != null ? this.c.b(madVarE) : new RawWriteView();
        lmrVar.close();
        this.e.f();
        return new plj(rawWriteViewB, frameMetadata, spatialGainMap, new eqn(madVarE, 2));
    }
}
