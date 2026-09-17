package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qws extends ppd implements pqn {
    public static final qws b;
    private static volatile pqs c;
    public ppk a = ppe.b;

    static {
        qws qwsVar = new qws();
        b = qwsVar;
        ppd.F(qws.class, qwsVar);
    }

    private qws() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", per.s});
            case 3:
                return new qws();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (qws.class) {
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
