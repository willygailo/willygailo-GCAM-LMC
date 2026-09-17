package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqs extends qpl {
    private final qqr a;

    public qqs(qqr qqrVar) {
        this.a = qqrVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return qks.a;
    }

    @Override // defpackage.qpm
    public final void b(Throwable th) {
        this.a.e();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}
