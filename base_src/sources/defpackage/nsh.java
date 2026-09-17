package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$uploadAllValidResources$$inlined$map$1$2", c = "F250Worker.kt", d = "emit", e = {137})
public final class nsh extends qlu {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ nsl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsh(nsl nslVar, qlh qlhVar, byte[] bArr) {
        super(qlhVar);
        this.c = nslVar;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
