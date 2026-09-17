package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ecs {
    static final jti a = new jti(40.0f);
    public static final /* synthetic */ int k = 0;
    public final lis b;
    public final pyn c;
    public final pyn d;
    public final pko e;
    public final ecb f;
    public final ddf g;
    public final ojc h;
    public final gsf i;
    public final dxp j;
    private final pyn l;
    private final hkr m;

    public ecs(lis lisVar, pyn pynVar, pyn pynVar2, pyn pynVar3, pko pkoVar, ecb ecbVar, ddf ddfVar, ojc ojcVar, gsf gsfVar, hkr hkrVar, dxp dxpVar) {
        this.b = lisVar.a("PostprocOps");
        this.l = pynVar;
        this.c = pynVar2;
        this.d = pynVar3;
        this.e = pkoVar;
        this.f = ecbVar;
        this.g = ddfVar;
        this.h = ojcVar;
        this.i = gsfVar;
        this.m = hkrVar;
        this.j = dxpVar;
    }

    public static final ecq c(ecq ecqVar) {
        InterleavedImageU8 interleavedImageU8 = ecqVar.a;
        interleavedImageU8.getClass();
        YuvImage yuvImage = new YuvImage(interleavedImageU8.b(), interleavedImageU8.a(), 1);
        long j = interleavedImageU8.c().a;
        long jE = YuvWriteView.e(yuvImage);
        obr.aG(j != 0, "src view is null");
        obr.aG(jE != 0, "dst view is null");
        YuvUtils.rgbToYuvImpl(j, jE);
        edo edoVar = new edo(yuvImage, ecqVar.g);
        interleavedImageU8.e();
        ecp ecpVarC = ecqVar.c();
        ecpVarC.b();
        ecpVarC.b = edoVar;
        return ecpVarC.a();
    }

    public final ecq a(ecq ecqVar) {
        InterleavedImageU8 interleavedImageU8 = ecqVar.a;
        interleavedImageU8.getClass();
        boolean z = this.f == ecb.LONG_EXPOSURE;
        hli hliVar = (hli) ((ojc) this.d.get()).c();
        hlr hlrVarA = hliVar.a();
        ddf ddfVar = this.g;
        int i = ddb.a;
        ddfVar.d();
        hliVar.h(interleavedImageU8.d(), ecqVar.d, z, ecqVar.k.b.s(), hlrVarA, ecqVar.k.b.k(), new ecr(ecqVar, 1));
        ecp ecpVarC = ecqVar.c();
        ecpVarC.h = hlrVarA;
        return ecpVarC.a();
    }

    public final void b(ecq ecqVar) {
        edo edoVar = ecqVar.b;
        edoVar.getClass();
        try {
            dor dorVar = (dor) ((dot) this.l.get()).a(new dos(edoVar, ((dzt) ecqVar.h).a, ecqVar.f, ojc.h(this.m.d(ecqVar.g)))).get();
            dorVar.b(ecqVar.k.b.k());
            if (dorVar.c()) {
                ShotMetadata shotMetadata = ecqVar.d;
                shotMetadata.n(String.valueOf(shotMetadata.i()).concat("b"));
            }
        } catch (InterruptedException | ExecutionException e) {
            this.b.i("Can't apply post-processing", e);
        }
    }
}
