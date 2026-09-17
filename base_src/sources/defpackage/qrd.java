package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qrd extends qpl {
    private final qmu a;

    public qrd(qmu qmuVar) {
        this.a = qmuVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return qks.a;
    }

    @Override // defpackage.qpm
    public final void b(Throwable th) {
        this.a.a(th);
    }

    public final String toString() {
        return "InvokeOnCancel[" + qnm.f(this.a) + '@' + qnm.g(this) + ']';
    }
}
