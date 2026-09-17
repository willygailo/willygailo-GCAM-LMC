package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eqv implements Runnable {
    public final /* synthetic */ eqw a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ eqv(eqw eqwVar, Runnable runnable) {
        this.a = eqwVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eqw eqwVar = this.a;
        this.b.run();
        ouj oujVar = eqx.a;
        ovd ovdVar = ovl.a;
        eqwVar.h.e.fB(true);
    }
}
