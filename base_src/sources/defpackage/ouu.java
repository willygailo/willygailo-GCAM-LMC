package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ouu implements Runnable {
    final /* synthetic */ out a;
    final /* synthetic */ ouv b;

    public ouu(ouv ouvVar, out outVar) {
        this.b = ouvVar;
        this.a = outVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.remove(this.a);
    }
}
