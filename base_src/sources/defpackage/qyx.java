package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyx extends ppd implements pqn {
    public static final qyx d;
    private static volatile pqs e;
    public int a;
    public ppk b = ppe.b;
    public int c;

    static {
        qyx qyxVar = new qyx();
        d = qyxVar;
        ppd.F(qyx.class, qyxVar);
    }

    private qyx() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003င\u0001", new Object[]{"a", "b", per.i, "c"});
            case 3:
                return new qyx();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (qyx.class) {
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
