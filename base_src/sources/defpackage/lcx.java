package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lcx extends ldn {
    final /* synthetic */ oiu a;
    final /* synthetic */ oiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcx(lda ldaVar, oiu oiuVar, oiu oiuVar2) {
        super(ldaVar);
        this.a = oiuVar;
        this.b = oiuVar2;
    }

    @Override // defpackage.ldn
    protected final Object b(Object obj) {
        return this.a.a(obj);
    }

    @Override // defpackage.ldn
    protected final Object c(Object obj) {
        return this.b.a(obj);
    }
}
