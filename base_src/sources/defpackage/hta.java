package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hta extends hto {
    public hta(hub hubVar, String str) {
        super(hubVar, str);
    }

    @Override // defpackage.hto
    protected final /* bridge */ /* synthetic */ Object c() {
        return Integer.valueOf(this.a.a(this.b));
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        Integer num = (Integer) obj;
        num.getClass();
        this.a.i(this.b, num.intValue());
    }
}
