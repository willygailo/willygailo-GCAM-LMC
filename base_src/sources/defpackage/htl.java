package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum htl {
    RES_1080P,
    RES_2160P;

    static {
        leb lebVar = leb.RES_UNKNOWN;
    }

    public static ojc b(leb lebVar) {
        hte hteVar = hte.ON;
        leb lebVar2 = leb.RES_UNKNOWN;
        switch (lebVar.ordinal()) {
            case 7:
                return ojc.i(RES_1080P);
            case 8:
            default:
                return oih.a;
            case 9:
                return ojc.i(RES_2160P);
        }
    }
}
