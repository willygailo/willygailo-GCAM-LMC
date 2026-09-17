package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ndm extends ppd implements pqn {
    public static final ndm h;
    public static final poq i;
    private static volatile pqs j;
    public int a;
    public boolean d;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public ppk g = ppe.b;

    static {
        ndm ndmVar = new ndm();
        h = ndmVar;
        ppd.F(ndm.class, ndmVar);
        i = ppd.I(ndf.c, ndmVar, ndmVar, 334728578, pry.MESSAGE);
    }

    private ndm() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006'", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new ndm();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (ndm.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
