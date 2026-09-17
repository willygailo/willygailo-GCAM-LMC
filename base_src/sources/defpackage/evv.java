package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class evv implements qkg {
    private final qkg a;
    private final /* synthetic */ int b;

    private evv(qkg qkgVar, int i) {
        this.b = i;
        qkgVar.getClass();
        this.a = qkgVar;
    }

    private evv(qkg qkgVar, int i, byte[] bArr) {
        this.b = i;
        qkgVar.getClass();
        this.a = qkgVar;
    }

    public static qkg b(qkg qkgVar) {
        return new evv(qkgVar, 0);
    }

    public static qkg c(qkg qkgVar) {
        return new evv(qkgVar, 1, null);
    }

    public final ojc a() {
        switch (this.b) {
            case 0:
                return ojc.i(this.a);
            default:
                return ojc.i(this.a.get());
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
        }
        return a();
    }
}
