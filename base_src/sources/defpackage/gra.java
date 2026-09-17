package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gra implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public gra(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public gra(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public final lco a() {
        switch (this.c) {
            case 0:
                return ((ddf) this.a.get()).k(ddm.ao) ? ((hug) this.b.get()).b(htu.p) : lcv.g(false);
            case 1:
                return ((ddf) this.b.get()).k(ddu.i) ? lcv.g(lwc.EXTENDED) : lcv.g(((gjo) this.a).get().j());
            default:
                hug hugVar = (hug) this.b.get();
                return new gqw(hugVar.b(htu.i), hugVar.b(htu.j), ((gjo) this.a).get(), gqt.OFF);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
        }
        return a();
    }
}
