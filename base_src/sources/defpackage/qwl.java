package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwl extends qpl {
    private final int a;
    private final qux b;

    public qwl(qux quxVar, int i) {
        this.b = quxVar;
        this.a = i;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return qks.a;
    }

    @Override // defpackage.qpm
    public final void b(Throwable th) {
        qux quxVar = this.b;
        int i = this.a;
        qvr qvrVar = qwp.e;
        qpe qpeVarA = quxVar.d.a(i);
        int i2 = qpf.a;
        qpeVarA.a = qvrVar;
        if (quxVar.c.c() != qwp.f || quxVar.d()) {
            return;
        }
        quxVar.c();
    }

    public final String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.b + ", " + this.a + ']';
    }
}
