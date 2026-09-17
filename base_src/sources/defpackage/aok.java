package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aok implements Runnable {
    final /* synthetic */ aqt a;
    final /* synthetic */ aol b;

    public aok(aol aolVar, aqt aqtVar) {
        this.b = aolVar;
        this.a = aqtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kus kusVarL = kus.l();
        int i = aol.d;
        String.format("Scheduling work %s", this.a.a);
        kusVarL.h(new Throwable[0]);
        this.b.a.c(this.a);
    }
}
