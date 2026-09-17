package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class quy implements qqj {
    private final qln a;

    public quy(qln qlnVar) {
        qlnVar.getClass();
        this.a = qlnVar;
    }

    @Override // defpackage.qqj
    public final qln hh() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
