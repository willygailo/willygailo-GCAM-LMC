package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvj {
    private final ddf a;
    private final lda b;
    private final imt c;

    public hvj(ddf ddfVar, lda ldaVar, imt imtVar) {
        this.a = ddfVar;
        this.b = ldaVar;
        this.c = imtVar;
    }

    private final boolean d() {
        return ((Boolean) this.b.fA()).booleanValue() || this.a.k(ddl.aX);
    }

    public final boolean a() {
        return this.a.k(ddl.aW) && d() && !this.c.c().a(ims.HEAT_CRITICAL);
    }

    public final boolean b() {
        return this.a.k(ddl.aV) && d();
    }

    public final void c() {
        ddf ddfVar = this.a;
        ddi ddiVar = ddl.a;
        ddfVar.d();
    }
}
