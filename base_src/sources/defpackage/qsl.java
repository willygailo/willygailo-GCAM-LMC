package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qsl extends qpi {
    private final qtf a;

    public qsl(qtf qtfVar) {
        this.a = qtfVar;
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
        return "RemoveReceiveOnCancel[" + this.a + ']';
    }
}
