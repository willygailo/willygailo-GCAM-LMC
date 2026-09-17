package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dki implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dkl b;

    public dki(dkl dklVar, int i) {
        this.b = dklVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        pih pihVar;
        dkk dkkVarA = this.b.a(this.a);
        synchronized (this.b.a) {
            dkl dklVar = this.b;
            pihVar = dklVar.b;
            dklVar.b = null;
        }
        pihVar.getClass();
        pihVar.o(dkkVarA);
    }
}
