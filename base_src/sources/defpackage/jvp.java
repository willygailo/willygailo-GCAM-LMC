package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jvp implements Runnable {
    final /* synthetic */ jvq a;

    public jvp(jvq jvqVar) {
        this.a = jvqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jvq jvqVar = this.a;
        if (jvqVar.d) {
            obr.ao(jvqVar.b);
            obr.ao(this.a.a);
            jvq jvqVar2 = this.a;
            jvqVar2.a.b(jvqVar2.b.getCurrentPosition());
            this.a.b.postDelayed(this, 10L);
        }
    }
}
