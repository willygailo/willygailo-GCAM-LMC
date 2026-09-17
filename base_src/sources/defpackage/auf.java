package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class auf implements Runnable {
    final /* synthetic */ auq a;

    public auf(auq auqVar) {
        this.a = auqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aui auiVar = this.a.c;
        if (auiVar.b) {
            auiVar.c.f.play(0);
        }
        this.a.d.a();
    }
}
