package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcf extends ppd implements pqn {
    public static final pcf d;
    private static volatile pqs e;
    public int a;
    public String b = "";
    public ppm c = pqv.b;

    static {
        pcf pcfVar = new pcf();
        d = pcfVar;
        ppd.F(pcf.class, pcfVar);
    }

    private pcf() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", pcg.class});
            case 3:
                return new pcf();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pcf.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
