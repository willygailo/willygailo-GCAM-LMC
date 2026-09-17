package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.Helper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gfp implements pys {
    private final /* synthetic */ int a;

    public gfp(int i) {
        this.a = i;
    }

    public static gfl a() {
        return new gfl();
    }

    public static ExecutorService b() {
        ExecutorService executorServiceBJ = mip.bJ("CameraEx");
        qmd.ae(executorServiceBJ);
        return executorServiceBJ;
    }

    public static final glf c() {
        return new glf();
    }

    public static gfp d(qkg qkgVar) {
        return new gfp(18);
    }

    public static enl e() {
        return new enl();
    }

    public static fcy f() {
        return new fcy();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return new gfn();
            case 1:
                return a();
            case 2:
                return new lce(gfq.IDLE);
            case 3:
                return new gfy();
            case 4:
                return new gge();
            case 5:
                return new imy((byte[]) null);
            case 6:
                return new lce(ggw.c());
            case 7:
                return new ggt();
            case 8:
                return new ghb();
            case 9:
                return f();
            case 10:
                return b();
            case 11:
                return lcv.g(1);
            case 12:
                return fcy.i(CaptureRequest.JPEG_QUALITY, (byte) 95);
            case 13:
                return fcy.i(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(Helper.getVFDenoise));
            case 14:
                return fcy.i(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            case 15:
                return new giq();
            case 16:
                return new gji();
            case 17:
                throw null;
            case 18:
                return c();
            case 19:
                return new fcy();
            default:
                return new lap();
        }
    }
}
