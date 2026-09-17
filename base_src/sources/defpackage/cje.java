package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cje extends ldl {
    public final lda a;
    public final lda b;
    private final cvo c;
    private final ddf d;

    public cje(cvo cvoVar, ddf ddfVar, lda ldaVar, lda ldaVar2) {
        super(lcv.b(ldaVar, ldaVar2));
        this.c = cvoVar;
        this.d = ddfVar;
        this.a = ldaVar;
        this.b = ldaVar2;
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        List list = (List) obj;
        cik cikVar = (cik) list.get(0);
        cik cikVar2 = (cik) list.get(1);
        ddf ddfVar = this.d;
        ddi ddiVar = dcu.a;
        ddfVar.d();
        if (this.c.i()) {
            return cikVar;
        }
        return this.c.j() ? cikVar2 : cik.OFF;
    }
}
