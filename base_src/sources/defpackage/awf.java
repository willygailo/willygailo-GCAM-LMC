package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class awf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ axh b;
    final /* synthetic */ awl c;

    public awf(awl awlVar, int i, axh axhVar) {
        this.c = awlVar;
        this.a = i;
        this.b = axhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        axi axiVarG = this.c.g();
        if (axiVarG.d()) {
            return;
        }
        axiVarG.e(this.a);
        this.c.c().obtainMessage(204, this.b).sendToTarget();
    }
}
