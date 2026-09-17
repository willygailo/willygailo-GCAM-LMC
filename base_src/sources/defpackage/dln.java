package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dln implements pys {
    private final /* synthetic */ int a;

    public dln(int i) {
        this.a = i;
    }

    public static gjw a() {
        return new gjw(2);
    }

    public static gjw b() {
        return new gjw(2);
    }

    public static dql c() {
        return new dql();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return new dll();
            case 1:
                dkr.a();
                return dkr.class;
            case 2:
                return new lce(dme.SINGLE);
            case 3:
                return new lax(mip.bJ("FaceBeau"));
            case 4:
                return a();
            case 5:
                return new lax(mip.bM("GpuFaceBeau"));
            case 6:
                ExecutorService executorServiceBM = mip.bM("VsprAtvClbck");
                qmd.ae(executorServiceBM);
                return executorServiceBM;
            case 7:
                return b();
            case 8:
                return new lax(mip.bM("GpuFaceObfus"));
            case 9:
                return c();
            case 10:
                return dqw.b("feature.acmi.camera.ae-stability");
            case 11:
                return dqw.b("feature.acmi.camera.af-stability");
            case 12:
                return dqw.b("feature.acmi.camera.awb-stability");
            case 13:
                return dqw.b("feature.acmi.camera.face-count");
            case 14:
                return dqw.b("feature.acmi.camera.lens-stability");
            case 15:
                return dqw.b("feature.acmi.imu.frame-gyro");
            case 16:
                return dqw.b("feature.acmi.imu.sensor-accelerometer");
            case 17:
                return dqw.b("feature.acmi.image.aesthetic");
            case 18:
                return dqw.b("feature.acmi.image.face-familiarity");
            case 19:
                return dqw.b("feature.acmi.camera.face-position-quality");
            default:
                return dqw.b("feature.acmi.image.face-quality");
        }
    }
}
