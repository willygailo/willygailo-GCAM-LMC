package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fyf implements lht {
    final /* synthetic */ String a;
    final /* synthetic */ fdy b;
    final /* synthetic */ fyg c;

    public fyf(fyg fygVar, String str, fdy fdyVar) {
        this.c = fygVar;
        this.a = str;
        this.b = fdyVar;
    }

    @Override // defpackage.lht
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        synchronized (this.c.b.E) {
            this.c.b.E.remove(this.a);
        }
        this.b.e(this);
    }
}
