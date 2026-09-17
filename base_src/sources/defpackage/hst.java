package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hst extends hto {
    public hst(hub hubVar, String str) {
        super(hubVar, str);
    }

    @Override // defpackage.hto
    protected final /* bridge */ /* synthetic */ Object c() {
        return Boolean.valueOf(this.a.m(this.b));
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        this.a.l(this.b, bool.booleanValue());
    }
}
