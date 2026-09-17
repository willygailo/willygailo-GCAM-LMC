package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class oey implements Runnable {
    final /* synthetic */ oez a;

    public oey(oez oezVar) {
        this.a = oezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            oep oepVar = this.a.b;
            oew oewVar = oepVar.a;
            ofi ofiVar = oepVar.b;
            synchronized (oewVar.d) {
                oewVar.c.remove(ofiVar);
            }
        }
    }
}
