package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class eru implements phh {
    final /* synthetic */ lji a;
    final /* synthetic */ erv b;
    final /* synthetic */ erw c;

    public eru(erw erwVar, lji ljiVar, erv ervVar) {
        this.c = erwVar;
        this.a = ljiVar;
        this.b = ervVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.a();
        this.c.n(this.b, "Error processing primary shot", th);
        if (th instanceof dma) {
            ovd ovdVar = ovl.a;
            this.b.e.arrive();
        }
        this.c.m(this.b.c, oih.a);
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        this.a.a();
        if (bool == null || !bool.booleanValue()) {
            this.c.n(this.b, "Error processing primary shot", new IllegalStateException("Processing success state was not valid."));
        }
        this.c.m(this.b.c, oih.a);
    }
}
