package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mmo implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ mmq b;

    public mmo(mmq mmqVar, Object obj) {
        this.b = mmqVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mmq mmqVar = this.b;
            mmqVar.c.a(this.a, mmqVar.e, mmqVar.a);
        } catch (Throwable th) {
            this.b.a(th);
        }
    }
}
