package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwr extends ppd implements pqn {
    public static final qwr e;
    private static volatile pqs f;
    public int a;
    public ppm b = pqv.b;
    public qws c;
    public int d;

    static {
        qwr qwrVar = new qwr();
        e = qwrVar;
        ppd.F(qwr.class, qwrVar);
    }

    private qwr() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"a", "b", qwq.class, "c", "d"});
            case 3:
                return new qwr();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (qwr.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
