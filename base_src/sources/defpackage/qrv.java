package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrv extends qpi {
    private final qvh a;

    public qrv(qvh qvhVar) {
        this.a = qvhVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return qks.a;
    }

    @Override // defpackage.qpm
    public final void b(Throwable th) {
        this.a.hb();
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.a + ']';
    }
}
