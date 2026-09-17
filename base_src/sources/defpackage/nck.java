package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nck {
    private static final mdf f = new mdi();
    public final qkg b;
    public final mdf c;
    public final Object a = new Object();
    public int d = 0;
    public long e = 0;

    public nck(qkg qkgVar, mdf mdfVar) {
        this.b = qkgVar;
        this.c = mdfVar;
    }

    public static nck a(final int i) {
        return new nck(new qkg() { // from class: ncj
            @Override // defpackage.qkg
            public final Object get() {
                return Integer.valueOf(i);
            }
        }, f);
    }
}
