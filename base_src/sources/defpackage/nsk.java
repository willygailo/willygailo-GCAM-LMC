package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$uploadAllValidResources$lambda-5$$inlined$map$1$2", c = "F250Worker.kt", d = "emit", e = {137, 137})
public final class nsk extends qlu {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ nsl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsk(nsl nslVar, qlh qlhVar) {
        super(qlhVar);
        this.d = nslVar;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
