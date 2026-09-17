package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjc implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public cjc(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public cjc(qkg qkgVar, qkg qkgVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static ojc b(qkg qkgVar, ddf ddfVar) {
        return ddfVar.k(ddm.ak) ? ((evv) qkgVar).a() : oih.a;
    }

    public static cjc c(qkg qkgVar, qkg qkgVar2) {
        return new cjc(qkgVar, qkgVar2, 5, (int[]) null);
    }

    public static cjc d(qkg qkgVar, qkg qkgVar2) {
        return new cjc(qkgVar, qkgVar2, 6, (boolean[]) null);
    }

    public static cjc e(qkg qkgVar, qkg qkgVar2) {
        return new cjc(qkgVar, qkgVar2, 17, (int[][]) null);
    }

    public static cjc f(qkg qkgVar, qkg qkgVar2) {
        return new cjc(qkgVar, qkgVar2, 18);
    }

    public static cjc g(qkg qkgVar, qkg qkgVar2) {
        return new cjc(qkgVar, qkgVar2, 19, (boolean[][]) null);
    }

    public final ojc a() {
        switch (this.c) {
            case 0:
                return ((ddf) this.b.get()).k(dcu.ab) ? ((evv) this.a).a() : oih.a;
            case 1:
                return ((ddf) this.b.get()).k(dcu.ab) ? ((evv) this.a).a() : oih.a;
            case 2:
                return ((ddf) this.a.get()).k(dcu.J) ? ((evv) this.b).a() : oih.a;
            case 3:
                return ((ddf) this.a.get()).k(dcu.J) ? ((evv) this.b).a() : oih.a;
            case 4:
                return ((ddf) this.a.get()).k(dcu.L) ? ((evv) this.b).a() : oih.a;
            case 5:
                return ((gqf) this.a).b().booleanValue() ? ((evv) this.b).a() : oih.a;
            case 6:
                return ((gqf) this.a).b().booleanValue() ? ((evv) this.b).a() : oih.a;
            case 7:
                enl.C((lda) this.a.get(), (ddf) this.b.get());
                return oih.a;
            case 8:
                enl.C((lda) this.a.get(), (ddf) this.b.get());
                return oih.a;
            case 9:
                qkg qkgVar = this.a;
                ddf ddfVar = (ddf) this.b.get();
                ddg ddgVar = ddn.a;
                ddfVar.c();
                return ((evv) qkgVar).a();
            case 10:
                return b(this.a, (ddf) this.b.get());
            case 11:
                return ((ddf) this.a.get()).k(ddt.g) ? ((evv) this.b).a() : oih.a;
            case 12:
                return ((ddf) this.a.get()).k(ddt.e) ? ((evv) this.b).a() : oih.a;
            case 13:
                qkg qkgVar2 = this.b;
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar2.c();
                return (ojc) ((pyt) qkgVar2).a;
            case 14:
                return ((ddf) this.a.get()).k(ddq.g) ? ((evv) this.b).a() : oih.a;
            case 15:
                return !((djc) this.b).get().c() ? oih.a : ((evv) this.a).a();
            case 16:
                return !((djc) this.b).get().c() ? oih.a : ((evv) this.a).a();
            case 17:
                ojc ojcVar = ((djc) this.a).get().c() ? (ojc) this.b.get() : oih.a;
                qmd.ae(ojcVar);
                return ojcVar;
            case 18:
                ojc ojcVar2 = (ojc) this.a.get();
                ojc ojcVar3 = (ojc) this.b.get();
                return (ojcVar3.g() && ((Boolean) ojcVar3.c()).booleanValue() && ojcVar2.g()) ? ojc.i((gff) ((qkg) ojcVar2.c()).get()) : oih.a;
            case 19:
                gxm gxmVarA = ((djc) this.b).get();
                ojc ojcVar4 = (ojc) this.a.get();
                if (gxmVarA.d() && ojcVar4.g()) {
                    return ojc.i((gez) ((qkg) ojcVar4.c()).get());
                }
                return oih.a;
            default:
                return ((ddf) this.b.get()).k(deh.a) ? ((evv) this.a).a() : oih.a;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return a();
    }
}
