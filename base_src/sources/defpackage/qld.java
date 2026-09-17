package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qld implements qll {
    private final qll a;
    private final qmu b;

    public qld() {
        throw null;
    }

    public qld(qll qllVar, qmu qmuVar) {
        this.b = qmuVar;
        this.a = qllVar instanceof qld ? ((qld) qllVar).a : qllVar;
    }

    public final qlk a(qlk qlkVar) {
        return (qlk) this.b.a(qlkVar);
    }

    public final boolean b(qll qllVar) {
        qllVar.getClass();
        return qllVar == this || this.a == qllVar;
    }
}
