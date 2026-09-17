package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyw extends ppd implements pqn {
    public static final qyw e;
    private static volatile pqs f;
    public int a;
    public int b;
    public pqh c = pqh.a;
    public ppk d;

    static {
        qyw qywVar = new qyw();
        e = qywVar;
        ppd.F(qyw.class, qywVar);
    }

    private qyw() {
        pqv pqvVar = pqv.b;
        this.d = ppe.b;
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
                return E(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0001\u0000\u0002င\u0001\u00032\u0005'", new Object[]{"a", "b", "c", qyv.a, "d"});
            case 3:
                return new qyw();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (qyw.class) {
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
