package defpackage;

import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: loaded from: classes.dex */
public final class ebk implements pys {
    private final qkg a;
    private final qkg b;

    public ebk(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static ebk a(qkg qkgVar, qkg qkgVar2) {
        return new ebk(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final BuildPayloadBurstSpecOptions get() {
        ddf ddfVar = (ddf) this.a.get();
        ecb ecbVar = (ecb) this.b.get();
        BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions = new BuildPayloadBurstSpecOptions(GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_0());
        buildPayloadBurstSpecOptions.b(ecbVar != ecb.LONG_EXPOSURE ? ((Float) ddfVar.g(ddm.N).e(Float.valueOf(-1.0f))).floatValue() : -1.0f);
        return buildPayloadBurstSpecOptions;
    }
}
