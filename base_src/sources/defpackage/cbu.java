package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cbu implements phh {
    final /* synthetic */ cbv a;
    final /* synthetic */ krd b;

    public cbu(cbv cbvVar, krd krdVar) {
        this.a = cbvVar;
        this.b = krdVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) cbv.a.b()).h(th)).G((char) 211)).o("Failed to get results");
        this.b.a(okd.b(th));
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        synchronized (this.a.b) {
            if (this.a.b.isEmpty()) {
                this.b.b(null, null);
                return;
            }
            ojd ojdVar = (ojd) this.a.b.removeFirst();
            this.b.b((byte[]) ojdVar.b, ((ccs) ojdVar.a).g());
        }
    }
}
