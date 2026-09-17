package defpackage;

import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;

/* JADX INFO: loaded from: classes.dex */
public final class edx implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ eev b;
    final /* synthetic */ eev c;
    final /* synthetic */ lig d;
    final /* synthetic */ eey e;
    final /* synthetic */ pih f;
    final /* synthetic */ DeblurFusionControllerImpl g;
    final /* synthetic */ ghx h;

    public edx(DeblurFusionControllerImpl deblurFusionControllerImpl, long j, eev eevVar, eev eevVar2, ghx ghxVar, lig ligVar, eey eeyVar, pih pihVar) {
        this.g = deblurFusionControllerImpl;
        this.a = j;
        this.b = eevVar;
        this.c = eevVar2;
        this.h = ghxVar;
        this.d = ligVar;
        this.e = eeyVar;
        this.f = pihVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        new Object[1][0] = this;
    }
}
