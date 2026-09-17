package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ayl implements Runnable {
    final /* synthetic */ ayn a;

    public ayl(ayn aynVar) {
        this.a = aynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayn aynVar = this.a;
        aynVar.c.a(aynVar);
    }
}
