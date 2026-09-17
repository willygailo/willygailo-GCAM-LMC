package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class htm implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ htn b;

    public htm(htn htnVar, Object obj) {
        this.b = htnVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lij lijVar = this.b.a;
        Object obj = this.a;
        obr.ao(obj);
        lijVar.fB(obj);
    }
}
