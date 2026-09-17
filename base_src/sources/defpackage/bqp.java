package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bqp implements bvv {
    public final cwl a;
    public final CameraActivityTiming b;
    public final dlt c;
    public final Executor d;
    public final jtx e;
    private final bqm f;

    public bqp(bqm bqmVar, cwl cwlVar, CameraActivityTiming cameraActivityTiming, jtx jtxVar, dlt dltVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = bqmVar;
        this.a = cwlVar;
        this.b = cameraActivityTiming;
        this.e = jtxVar;
        this.c = dltVar;
        this.d = executor;
    }

    public static lju a(dkk dkkVar) {
        lju ljuVar = dkkVar.b;
        if (ljuVar == null) {
            ljuVar = lju.CAMERA_ERROR_CODE_UNKNOWN;
        }
        ljuVar.getClass();
        return ljuVar;
    }

    @Override // defpackage.bvv
    public final /* synthetic */ String c() {
        return aas.g(this);
    }

    @Override // defpackage.bvv
    public final pht fz() {
        CameraActivityTiming cameraActivityTiming = this.b;
        cameraActivityTiming.j(ijf.WAIT_FOR_CAMERA_DEVICES_TASK_START, CameraActivityTiming.b);
        cameraActivityTiming.i = cameraActivityTiming.e.a("waitForCameraDevice");
        return pfj.i(pgb.h(this.f.a(), new oiu() { // from class: bqn
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                final bqp bqpVar = this.a;
                final dkk dkkVar = (dkk) obj;
                bqpVar.d.execute(new Runnable() { // from class: bqo
                    @Override // java.lang.Runnable
                    public final void run() {
                        bqp bqpVar2 = bqpVar;
                        dkk dkkVar2 = dkkVar;
                        if (!bqpVar2.e.s()) {
                            if (dkkVar2.a) {
                                return;
                            }
                            bqpVar2.c.e(new dlr("Unable to enumerate any cameras", bqp.a(dkkVar2), lwd.BACK, lwd.FRONT));
                        } else if (dkkVar2.a) {
                            bqpVar2.a.a();
                        } else if (lju.d(bqp.a(dkkVar2))) {
                            bqpVar2.a.b();
                        } else {
                            bqpVar2.c.e(new dlr("Unable to enumerate any cameras", bqp.a(dkkVar2), lwd.BACK, lwd.FRONT));
                        }
                    }
                });
                CameraActivityTiming cameraActivityTiming2 = bqpVar.b;
                cameraActivityTiming2.j(ijf.WAIT_FOR_CAMERA_DEVICES_TASK_END, CameraActivityTiming.b);
                cameraActivityTiming2.i.a();
                cameraActivityTiming2.i = lji.b;
                return Boolean.valueOf(dkkVar.a);
            }
        }, pgr.INSTANCE), Throwable.class, ewp.b, pgr.INSTANCE);
    }
}
