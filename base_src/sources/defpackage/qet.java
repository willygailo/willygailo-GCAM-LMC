package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qet extends qbh implements qdj {
    private final Object b;

    public qet(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.qdj, java.util.concurrent.Callable
    public final Object call() {
        return this.b;
    }

    @Override // defpackage.qbh
    protected final void h(qym qymVar) {
        qymVar.a(new qjl(qymVar, this.b));
    }
}
