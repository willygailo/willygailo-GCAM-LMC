package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aog implements Runnable {
    final /* synthetic */ pht a;
    final /* synthetic */ aoj b;
    final /* synthetic */ asl c;

    public aog(aoj aojVar, pht phtVar, asl aslVar) {
        this.b = aojVar;
        this.a = phtVar;
        this.c = aslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.get();
            kus kusVarL = kus.l();
            int i = aoj.j;
            String.format("Starting work for %s", this.b.c.b);
            kusVarL.h(new Throwable[0]);
            aoj aojVar = this.b;
            aojVar.e = aojVar.d.a();
            this.c.g(this.b.e);
        } catch (Throwable th) {
            this.c.f(th);
        }
    }
}
