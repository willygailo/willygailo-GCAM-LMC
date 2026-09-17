package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "androidx.camera.camera2.pipe.compat.VirtualCameraManager$requestLoop$2$2", c = "VirtualCameraManager.kt", d = "invokeSuspend", e = {})
final class vy extends qmb implements qmy {
    final /* synthetic */ hr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(hr hrVar, qlh qlhVar, byte[] bArr) {
        super(2, qlhVar);
        this.a = hrVar;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new vy(this.a, qlhVar, null);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((vy) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        qmd.M(obj);
        throw null;
    }
}
