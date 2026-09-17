package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyx implements qkg {
    private static final Object a = new Object();
    private volatile qkg b;
    private volatile Object c = a;

    private pyx(qkg qkgVar) {
        this.b = qkgVar;
    }

    public static qkg a(qkg qkgVar) {
        if ((qkgVar instanceof pyx) || (qkgVar instanceof pyr)) {
            return qkgVar;
        }
        qkgVar.getClass();
        return new pyx(qkgVar);
    }

    @Override // defpackage.qkg
    public final Object get() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        qkg qkgVar = this.b;
        if (qkgVar == null) {
            return this.c;
        }
        Object obj2 = qkgVar.get();
        this.c = obj2;
        this.b = null;
        return obj2;
    }
}
