package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qzd extends ppd implements pqn {
    public static final qzd f;
    private static volatile pqs g;
    public pqh a = pqh.a;
    public pqh b = pqh.a;
    public ppm c = pqv.b;
    public ppk d = ppe.b;
    public ppm e = pqv.b;

    static {
        qzd qzdVar = new qzd();
        f = qzdVar;
        ppd.F(qzd.class, qzdVar);
    }

    private qzd() {
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
                return E(f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"a", qzb.a, "b", qzc.a, "c", qza.class, "d", "e", qyx.class});
            case 3:
                return new qzd();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (qzd.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
