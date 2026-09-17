package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gqy extends ldn {
    private final gqx a;

    public gqy(lda ldaVar, gqx gqxVar) {
        super(ldaVar);
        this.a = gqxVar;
    }

    @Override // defpackage.ldn
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        String str = (String) obj;
        gqx gqxVar = this.a;
        if (gqx.AUTO.d.equals(str)) {
            return gqx.AUTO;
        }
        if (gqx.OFF.d.equals(str)) {
            return gqx.OFF;
        }
        return gqx.ON.d.equals(str) ? gqx.ON : gqxVar;
    }

    @Override // defpackage.ldn
    protected final /* synthetic */ Object c(Object obj) {
        return ((gqx) obj).d;
    }
}
