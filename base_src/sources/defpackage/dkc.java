package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dkc {
    public final Object a = new Object();
    public lvs b;

    public final void a(lvs lvsVar) {
        synchronized (this.a) {
            lvs lvsVar2 = this.b;
            if (lvsVar2 != null) {
                lvsVar2.equals(lvsVar);
            }
            this.b = lvsVar;
        }
    }
}
