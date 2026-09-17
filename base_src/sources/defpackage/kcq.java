package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcq extends ppd implements pqn {
    public static final kcq c;
    private static volatile pqs f;
    public int a;
    public kcp b;
    private kcn d;
    private kco e;

    static {
        kcq kcqVar = new kcq();
        c = kcqVar;
        ppd.F(kcq.class, kcqVar);
    }

    private kcq() {
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
                return E(c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "d", "b", "e"});
            case 3:
                return new kcq();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (kcq.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
