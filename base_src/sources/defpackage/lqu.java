package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqu implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final /* synthetic */ int g;

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[] bArr) {
        this.g = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[] cArr) {
        this.g = i;
        this.d = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
        this.e = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[] fArr) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[] iArr) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[] sArr) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public lqu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][] bArr) {
        this.g = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.f = qkgVar4;
        this.d = qkgVar5;
        this.c = qkgVar6;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.g) {
            case 0:
                return new lqt((lot) this.a.get(), (lqg) this.b.get(), ((lqi) this.c).get(), (lap) this.d.get(), ((liq) this.e).get(), (ljf) this.f.get(), null, null);
            case 1:
                return new lqg((luk) this.a.get(), (lxv) this.d.get(), (lqp) this.e.get(), ((liq) this.c).get(), (ljf) this.f.get());
            case 2:
                return new mxm(this.d, this.f, this.c, this.a, this.b, this.e, null, null);
            case 3:
                return new lrz(((lpl) this.a).get(), ((lpn) this.b).get(), (luk) this.d.get(), (ltv) this.e.get(), ((liq) this.c).get(), (ljf) this.f.get());
            case 4:
                return new lsd(((lpl) this.a).get(), ((lpn) this.b).get(), (luk) this.d.get(), (ltv) this.e.get(), ((liq) this.c).get(), (ljf) this.f.get());
            case 5:
                return new lse(((lpl) this.a).get(), ((lpn) this.b).get(), (luk) this.d.get(), (ltv) this.e.get(), ((liq) this.c).get(), (ljf) this.f.get());
            case 6:
                return new lsf(((lpl) this.a).get(), ((lpn) this.b).get(), (luk) this.d.get(), (ltv) this.e.get(), ((liq) this.c).get(), (ljf) this.f.get());
            default:
                mxm mxmVar = ((mxn) this.b).get();
                phw phwVar = (phw) this.a.get();
                pyr.a(this.e);
                return new nbz(mxmVar, phwVar, pyr.a(this.f), this.d, ((nch) this.c).get(), null);
        }
    }
}
