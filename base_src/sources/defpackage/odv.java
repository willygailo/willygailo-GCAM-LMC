package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class odv implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public odv(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                odt odtVar = (odt) this.a.get();
                qmd.ae(odtVar);
                return odtVar;
            case 1:
                return new oem(((odw) this.a).get());
            default:
                return new odu(((odw) this.a).get());
        }
    }
}
