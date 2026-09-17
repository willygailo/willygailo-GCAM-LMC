package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gnk implements pys {
    private final /* synthetic */ int a;

    public gnk(int i) {
        this.a = i;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return pih.f();
            case 1:
                return pih.f();
            case 2:
                return new lce(pjt.b);
            case 3:
                return new lce(new gnq(new Face[0], new Rect(), 0L));
            case 4:
                Float fValueOf = Float.valueOf(0.0f);
                return new lce(gnt.a(fValueOf, new Pair(fValueOf, fValueOf)));
            case 5:
                return new lce(fcy.l());
            case 6:
                return pih.f();
            case 7:
                return new hfd(CaptureResult.STATISTICS_LENS_SHADING_CORRECTION_MAP);
            case 8:
                return lcv.g(false);
            case 9:
                ecb ecbVar = ecb.LONG_EXPOSURE;
                qmd.ae(ecbVar);
                return ecbVar;
            case 10:
                return new hey();
            case 11:
                return fcy.l();
            case 12:
                return oih.a;
            case 13:
                return new gpv();
            case 14:
                return lcv.g(gjk.HDR_PLUS_ZSL);
            case 15:
                ecb ecbVar2 = ecb.MOTION_BLUR;
                qmd.ae(ecbVar2);
                return ecbVar2;
            case 16:
                return oih.a;
            case 17:
                ecb ecbVar3 = ecb.REGULAR;
                qmd.ae(ecbVar3);
                return ecbVar3;
            case 18:
                ecb ecbVar4 = ecb.PORTRAIT;
                qmd.ae(ecbVar4);
                return ecbVar4;
            case 19:
                return gqh.a;
            default:
                return lcv.g(false);
        }
    }
}
