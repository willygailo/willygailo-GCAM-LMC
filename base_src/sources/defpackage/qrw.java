package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrw extends qrk {
    private final qlh a;

    public qrw(qlh qlhVar) {
        this.a = qlhVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return qks.a;
    }

    @Override // defpackage.qqa
    public final void b(Throwable th) {
        this.a.resumeWith(qks.a);
    }
}
