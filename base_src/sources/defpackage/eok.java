package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class eok implements phh {
    final /* synthetic */ eol a;

    public eok(eol eolVar) {
        this.a = eolVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) eon.a.b().g(ovl.a, "KeplerController")).h(th)).G((char) 1290)).o("Encoder writing failed");
        synchronized (this.a.c) {
            this.a.a.e.a(th);
            eol eolVar = this.a;
            eolVar.c.i.remove(eolVar.a.a);
        }
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        ovd ovdVar = ovl.a;
        synchronized (this.a.c) {
            this.a.a.e.o(true);
            eol eolVar = this.a;
            eolVar.c.i.remove(eolVar.a.a);
        }
    }
}
