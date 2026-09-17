package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qys extends ppd implements pqn {
    public static final qys b;
    private static volatile pqs c;
    public pqh a = pqh.a;

    static {
        qys qysVar = new qys();
        b = qysVar;
        ppd.F(qys.class, qysVar);
    }

    private qys() {
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
                return E(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", qyr.a});
            case 3:
                return new qys();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (qys.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
