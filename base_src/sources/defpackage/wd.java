package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
final class wd implements qkg {
    private final we a;
    private final int b;

    public wd(we weVar, int i) {
        this.a = weVar;
        this.b = i;
    }

    @Override // defpackage.qkg
    public final Object get() {
        switch (this.b) {
            case 0:
                we weVar = this.a;
                return new vm((vq) weVar.c.get(), (vr) weVar.e.get());
            case 1:
                we weVar2 = this.a;
                return new vq(weVar2.a, (wn) weVar2.b.get());
            case 2:
                Object systemService = this.a.a().getSystemService("camera");
                if (systemService != null) {
                    return (CameraManager) systemService;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            case 3:
                qpc qpcVarG = qnt.g(0);
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new wj(qpcVarG, 1));
                executorServiceNewFixedThreadPool.getClass();
                qqf qqfVarC = qno.C(executorServiceNewFixedThreadPool);
                ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(8, new wj(qpcVarG, 0));
                executorServiceNewFixedThreadPool2.getClass();
                return new wn(qnm.j(qqfVarC.plus(new qqi("CXCP-Pipe"))), qno.C(executorServiceNewFixedThreadPool2), new wg(0), new wg(1));
            case 4:
                we weVar3 = this.a;
                return new vr(weVar3.a(), (wn) weVar3.b.get(), (wl) weVar3.d.get());
            case 5:
                return new wl(this.a.a());
            default:
                we weVar4 = this.a;
                return new wa(weVar4.a, (vr) weVar4.e.get(), (wl) weVar4.d.get(), (wn) weVar4.b.get());
        }
    }
}
