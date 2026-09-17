package defpackage;

import android.os.Build;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class edw implements Runnable {
    public final /* synthetic */ DeblurFusionControllerImpl a;
    private final /* synthetic */ int b;

    public /* synthetic */ edw(DeblurFusionControllerImpl deblurFusionControllerImpl, int i) {
        this.b = i;
        this.a = deblurFusionControllerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.c();
                return;
            default:
                DeblurFusionControllerImpl deblurFusionControllerImpl = this.a;
                synchronized (deblurFusionControllerImpl.e) {
                    if (deblurFusionControllerImpl.f.get()) {
                        ovd ovdVar = ovl.a;
                        return;
                    }
                    if (deblurFusionControllerImpl.b.a() == 0) {
                        deblurFusionControllerImpl.c.e("PortraitSegmenter#init");
                        deblurFusionControllerImpl.b.b();
                        deblurFusionControllerImpl.c.f();
                    }
                    deblurFusionControllerImpl.c.e("DeblurFusionController#init");
                    deblurFusionControllerImpl.f.set(DeblurFusionControllerImpl.initialize(Build.DEVICE, deblurFusionControllerImpl.a()));
                    deblurFusionControllerImpl.c.f();
                    if (deblurFusionControllerImpl.f.get()) {
                        ovd ovdVar2 = ovl.a;
                        deblurFusionControllerImpl.g.fB(true);
                    } else {
                        ((oug) ((oug) DeblurFusionControllerImpl.a.c().g(ovl.a, "FalconController")).G(1086)).o("Failed to initialize DeblurFusionController.");
                    }
                    return;
                }
        }
    }
}
