package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mmp implements Runnable {
    final /* synthetic */ mnc a;
    final /* synthetic */ mmq b;

    public mmp(mmq mmqVar, mnc mncVar) {
        this.b = mmqVar;
        this.a = mncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mmq mmqVar = this.b;
            mmqVar.d.a(this.a, mmqVar.e, mmqVar.a);
        } catch (Throwable th) {
            th = th;
            if (th != this.a) {
                th = mnc.a(th);
            }
            this.b.a(th);
        }
    }

    public final String toString() {
        return this.b.d.toString();
    }
}
