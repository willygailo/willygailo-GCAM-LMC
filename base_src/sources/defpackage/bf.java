package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bf implements Runnable {
    final /* synthetic */ bg a;

    public bf(bg bgVar) {
        this.a = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg bgVar = this.a;
        bgVar.b.endViewTransition(bgVar.c);
        this.a.d.b();
    }
}
