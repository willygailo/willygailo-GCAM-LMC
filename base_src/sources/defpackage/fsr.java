package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fsr implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public fsr(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static fsr a(qkg qkgVar) {
        return new fsr(qkgVar, 0);
    }

    public static fsr c(qkg qkgVar) {
        return new fsr(qkgVar, 1);
    }

    public static fsr d(qkg qkgVar) {
        return new fsr(qkgVar, 3);
    }

    public final ojc b() {
        switch (this.b) {
            case 0:
                return (ojc) ((ojj) ((evv) this.a).a()).a;
            case 1:
                return (ojc) ((ojj) ((evv) this.a).a()).a;
            case 2:
                ddf ddfVar = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar.e();
                return oih.a;
            case 3:
                return ((ddf) this.a.get()).k(ddm.ar) ? ojc.i(259L) : oih.a;
            case 4:
                return ojc.h(((emp) this.a).a().getExternalCacheDir());
            case 5:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar2 = dee.a;
                ddfVar2.d();
                return oih.a;
            case 6:
                return ((ddf) this.a.get()).a(dec.a);
            default:
                ojc ojcVar = (ojc) ((pyt) this.a).a;
                return ojcVar.g() ? ojc.h((mxe) ((qkg) ojcVar.c()).get()) : oih.a;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return b();
    }
}
