package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abh implements fb {
    final /* synthetic */ abd a;

    public abh(abd abdVar) {
        this.a = abdVar;
    }

    @Override // defpackage.fb
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        abk abkVar = (abk) obj;
        if (abkVar == null) {
            abkVar = new abk(-3);
        }
        this.a.a(abkVar);
    }
}
