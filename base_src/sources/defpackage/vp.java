package defpackage;

import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameras$2", c = "Camera2DeviceCache.kt", d = "invokeSuspend", e = {})
final class vp extends qmb implements qmy {
    final /* synthetic */ vq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(vq vqVar, qlh qlhVar) {
        super(2, qlhVar);
        this.a = vqVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new vp(this.a, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((vp) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        qmd.M(obj);
        vq vqVar = this.a;
        try {
            Trace.beginSection("readCameraIds");
            List listA = vqVar.a();
            if (listA.isEmpty()) {
                listA = qkx.a;
            } else {
                synchronized (vqVar.b) {
                    vqVar.c = listA;
                }
            }
            Trace.endSection();
            return listA;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
