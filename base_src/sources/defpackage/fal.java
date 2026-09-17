package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fal implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public fal(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public final fxh a() {
        switch (this.b) {
            case 0:
                return ((fww) this.a).get().a("PortraitCaptureSess", hsr.PORTRAIT);
            default:
                return ((fww) this.a).get().a("LasagnaCaptureSess", hsr.LASAGNA);
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
