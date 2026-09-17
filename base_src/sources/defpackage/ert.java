package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ert implements phh {
    final /* synthetic */ esg a;
    final /* synthetic */ erv b;
    final /* synthetic */ erw c;

    public ert(erw erwVar, esg esgVar, erv ervVar) {
        this.c = erwVar;
        this.a = esgVar;
        this.b = ervVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.close();
        this.c.n(this.b, "Error compressing primary jpg file", th);
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        gjx gjxVar = (gjx) obj;
        this.a.close();
        if (gjxVar == null) {
            ((oug) ((oug) erw.a.b().g(ovl.a, "LasagnaProcessor")).G(1451)).p("Error encoding the primary image %d", this.b.c.a());
        } else {
            this.b.d.set(true);
            this.b.c.c.b.k().e(gjxVar.b.length);
            ((iik) this.b.c.c.b.k()).g = gjxVar.d;
        }
        this.b.e.arrive();
    }
}
