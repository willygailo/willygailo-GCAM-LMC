package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.UploadQueryer$failPermanentlyInvalidUploads$2", c = "Queryer.kt", d = "invokeSuspend", e = {32})
public final class nor extends qmb implements qmu {
    int a;
    final /* synthetic */ nou b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nor(nou nouVar, qlh qlhVar) {
        super(1, qlhVar);
        this.b = nouVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new nor(this.b, (qlh) obj).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final qlh create(qlh qlhVar) {
        return new nor(this.b, qlhVar);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (this.a) {
            case 0:
                qmd.M(obj);
                nql nqlVar = this.b.a;
                this.a = 1;
                obj = nqlVar.a(this);
                return obj == qlpVar ? qlpVar : obj;
            default:
                qmd.M(obj);
        }
    }
}
