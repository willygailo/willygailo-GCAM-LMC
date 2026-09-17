package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fun {
    public final lis a;
    private final lap b = new lap();

    public fun(lis lisVar) {
        this.a = lisVar.a("EndOnShutdown");
    }

    public final fuw a(fuw fuwVar) {
        fum fumVar = new fum(this, fuwVar);
        this.b.c(fumVar.a);
        return fumVar;
    }

    public final synchronized void b() {
        this.b.close();
    }
}
