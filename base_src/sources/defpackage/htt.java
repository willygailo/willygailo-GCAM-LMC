package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class htt implements htr {
    private final /* synthetic */ int f;
    public static final /* synthetic */ htt e = new htt(4);
    public static final /* synthetic */ htt d = new htt(3);
    public static final /* synthetic */ htt c = new htt(2);
    public static final /* synthetic */ htt b = new htt(1);
    public static final /* synthetic */ htt a = new htt(0);

    private /* synthetic */ htt(int i) {
        this.f = i;
    }

    @Override // defpackage.htr
    public final Object a(ddf ddfVar) {
        switch (this.f) {
            case 0:
                huk hukVar = htu.a;
                return ddfVar.k(ddv.a) ? 0 : 1;
            case 1:
                huk hukVar2 = htu.a;
                return Boolean.valueOf(ddfVar.k(ddl.aN));
            case 2:
                huk hukVar3 = htu.a;
                return true != ddfVar.k(ddm.aa) ? "off" : "ns";
            case 3:
                huk hukVar4 = htu.a;
                return true != ddfVar.k(ddm.aa) ? "off" : "ns";
            default:
                return true;
        }
    }
}
