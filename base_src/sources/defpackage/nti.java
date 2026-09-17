package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nti implements qco {
    final /* synthetic */ String a;
    final /* synthetic */ nty b;
    final /* synthetic */ nrl c;
    final /* synthetic */ nqh d;
    final /* synthetic */ npe e;

    public nti(String str, nty ntyVar, nrl nrlVar, nqh nqhVar, npe npeVar) {
        this.a = str;
        this.b = ntyVar;
        this.c = nrlVar;
        this.d = nqhVar;
        this.e = npeVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((nqi) obj).getClass();
        IllegalStateException illegalStateException = new IllegalStateException(this.a);
        this.b.a.a(this.c.c(21, illegalStateException, this.d, this.e));
        return qbu.h(illegalStateException);
    }
}
