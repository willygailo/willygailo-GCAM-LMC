package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdr extends ppd implements pqn {
    public static final pdr h;
    private static volatile pqs i;
    public int a;
    public int b;
    public boolean d;
    public boolean e;
    public String c = "";
    public String f = "";
    public String g = "";

    static {
        pdr pdrVar = new pdr();
        h = pdrVar;
        ppd.F(pdr.class, pdrVar);
    }

    private pdr() {
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
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", pdq.a, "c", "d", "e", "f", "g"});
            case 3:
                return new pdr();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pdr.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
