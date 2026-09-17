package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class peb extends ppd implements pqn {
    public static final peb e;
    private static volatile pqs f;
    public int a;
    public int b;
    public int c;
    public pea d;

    static {
        peb pebVar = new peb();
        e = pebVar;
        ppd.F(peb.class, pebVar);
    }

    private peb() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", pdq.k, "c", pdq.l, "d"});
            case 3:
                return new peb();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (peb.class) {
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
