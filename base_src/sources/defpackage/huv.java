package defpackage;

import android.content.Context;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class huv implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public huv(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, float[][] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public huv(qkg qkgVar, qkg qkgVar2, int i, byte[][][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static huv a(qkg qkgVar, qkg qkgVar2) {
        return new huv(qkgVar, qkgVar2, 12, (short[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return !((ddf) this.a.get()).k(ddu.r) ? lcz.a(Boolean.FALSE) : ((huh) this.b).get().a("pref_camera_raw_output_option_available_key", false);
            case 1:
                htp htpVar = ((huh) this.b).get();
                return ((lzi) this.a.get()).h() ? htpVar.b("pref_micro_mode_default_off", 0) : htpVar.b("pref_micro_mode", 1);
            case 2:
                htp htpVar2 = ((huh) this.b).get();
                ((ddf) this.a.get()).k(ddl.aG);
                return htpVar2.a("pref_camera_selfie_mirror_key", true);
            case 3:
                Context contextA = ((emp) this.a).a();
                return new ema(new HashMap(), new fjn(new fjo(new elz(contextA), (fjs) this.b.get()), TimeUnit.MILLISECONDS));
            case 4:
                htp htpVar3 = ((huh) this.b).get();
                ddf ddfVar = (ddf) this.a.get();
                ddi ddiVar = dcu.a;
                ddfVar.d();
                return new hur(htpVar3.c("pref_video_resolution", htl.RES_1080P.name()));
            case 5:
                return ((ddf) this.a.get()).k(deh.a) ? ((huh) this.b).get().a("pref_chameleon_control_key", true) : lcz.a(Boolean.FALSE);
            case 6:
                return new bxb((lco) this.b.get(), (Executor) this.a.get());
            case 7:
                return ((ddf) this.a.get()).k(ddx.C) ? ojc.i((hal) this.b.get()) : oih.a;
            case 8:
                return ((ddf) this.a.get()).k(ddm.L) ? ojc.i((hal) this.b.get()) : oih.a;
            case 9:
                return new hwa(((emd) this.a).get(), (ddf) this.b.get());
            case 10:
                return new hwl(((emp) this.b).a(), ((dhi) this.a).get(), null, null, null);
            case 11:
                pht phtVar = (pht) this.b.get();
                ((djc) this.a).get().f();
                return ope.H(new hyv(phtVar));
            case 12:
                Object obj = this.b.get();
                ((djc) this.a).get().f();
                return ope.H(new hxm((hxj) obj));
            case 13:
                return new hzq((hxj) this.a.get(), (geq) this.b.get());
            case 14:
                return new ifr((ifn) this.a.get(), (ljf) this.b.get());
            case 15:
                bui buiVar = (bui) this.a.get();
                ifx ifxVar = ((ify) this.b).get();
                buiVar.b.c(ifxVar);
                return ifxVar;
            case 16:
                lar larVar = (lar) this.a.get();
                final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.b.get();
                iii iiiVar = new iii(larVar);
                mip.bZ(iiiVar.d, new lht() { // from class: iic
                    @Override // defpackage.lht
                    public final void a(Object obj2) {
                        cameraActivityTiming.j(ijf.ACTIVITY_STEADY, CameraActivityTiming.a);
                    }
                });
                return iiiVar;
            case 17:
                final Instrumentation instrumentation = (Instrumentation) this.b.get();
                return new ijn() { // from class: iif
                    @Override // defpackage.ijn
                    public final Object a() {
                        Instrumentation instrumentation2 = instrumentation;
                        ViewfinderJankSession viewfinderJankSession = new ViewfinderJankSession();
                        instrumentation2.f(viewfinderJankSession);
                        return viewfinderJankSession;
                    }
                };
            case 18:
                return new ija((Instrumentation) this.b.get(), (mcu) this.a.get(), 1);
            case 19:
                return new ija((Instrumentation) this.b.get(), (mcu) this.a.get(), 0);
            default:
                return new ija((Instrumentation) this.b.get(), (mcu) this.a.get(), 2);
        }
    }
}
