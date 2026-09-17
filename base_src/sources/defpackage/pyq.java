package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyq implements pys {
    private qkg a;

    public static void a(qkg qkgVar, qkg qkgVar2) {
        pyq pyqVar = (pyq) qkgVar;
        if (pyqVar.a != null) {
            throw new IllegalStateException();
        }
        pyqVar.a = qkgVar2;
    }

    @Override // defpackage.qkg
    public final Object get() {
        qkg qkgVar = this.a;
        if (qkgVar != null) {
            return qkgVar.get();
        }
        throw new IllegalStateException();
    }
}
