package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ViewfinderProcessingOptions;

/* JADX INFO: loaded from: classes.dex */
public final class ebm implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public ebm(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public static ebm a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new ebm(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ViewfinderProcessingOptions get() {
        ecb ecbVar = (ecb) this.b.get();
        ddf ddfVar = (ddf) this.c.get();
        dzy dzyVar = (dzy) this.d.get();
        int iIntValue = ((cbe) this.e).a().intValue();
        ViewfinderProcessingOptions viewfinderProcessingOptions = new ViewfinderProcessingOptions(GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_0());
        if (ecbVar == ecb.LONG_EXPOSURE) {
            viewfinderProcessingOptions.b(iIntValue);
            viewfinderProcessingOptions.c(true);
        }
        ddi ddiVar = ddm.a;
        ddfVar.b();
        GcamModuleJNI.ViewfinderProcessingOptions_verbose_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, false);
        viewfinderProcessingOptions.d(dzyVar.e());
        return viewfinderProcessingOptions;
    }
}
