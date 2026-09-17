package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hhw implements Runnable {
    final /* synthetic */ mad a;
    final /* synthetic */ hia b;

    public hhw(hia hiaVar, mad madVar) {
        this.b = hiaVar;
        this.a = madVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.close();
        this.b.j++;
    }
}
