package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mcz implements ojf {
    private final /* synthetic */ int h;
    public static final /* synthetic */ mcz g = new mcz(6);
    public static final /* synthetic */ mcz f = new mcz(5);
    public static final /* synthetic */ mcz e = new mcz(4);
    public static final /* synthetic */ mcz d = new mcz(3);
    public static final /* synthetic */ mcz c = new mcz(2);
    public static final /* synthetic */ mcz b = new mcz(1);
    public static final /* synthetic */ mcz a = new mcz(0);

    private /* synthetic */ mcz(int i) {
        this.h = i;
    }

    @Override // defpackage.ojf
    public final boolean a(Object obj) {
        switch (this.h) {
            case 0:
                return mde.g((mdc) obj, "http://ns.adobe.com/xmp/extension/\u0000");
            case 1:
                return ((lrr) obj).e();
            case 2:
                return (((pnj) obj).a & 1) != 0;
            case 3:
                pnj pnjVar = (pnj) obj;
                pnc pncVar = pnjVar.c;
                if (pncVar == null) {
                    pncVar = pnc.g;
                }
                if ((pncVar.a & 16) != 0) {
                    pnc pncVar2 = pnjVar.c;
                    if (pncVar2 == null) {
                        pncVar2 = pnc.g;
                    }
                    if (Float.isNaN(pncVar2.f)) {
                        return false;
                    }
                }
                return true;
            case 4:
                return ((Float) obj).floatValue() < 20.0f;
            case 5:
                return (((pnc) obj).a & 16) != 0;
            default:
                ngz ngzVar = (ngz) obj;
                nhd nhdVar = nly.a;
                return ngzVar != null && ngzVar.b.c;
        }
    }
}
