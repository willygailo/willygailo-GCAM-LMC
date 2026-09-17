package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class pgn extends pgp {
    final /* synthetic */ pgq a;
    private final pgj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgn(pgq pgqVar, pgj pgjVar, Executor executor) {
        super(pgqVar, executor);
        this.a = pgqVar;
        pgjVar.getClass();
        this.c = pgjVar;
    }

    @Override // defpackage.phs
    public final /* bridge */ /* synthetic */ Object a() {
        pht phtVarA = this.c.a();
        phtVarA.getClass();
        return phtVarA;
    }

    @Override // defpackage.phs
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.pgp
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.e((pht) obj);
    }
}
