package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pck extends ppd implements pqn {
    public static final pck e;
    private static volatile pqs f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        pck pckVar = new pck();
        e = pckVar;
        ppd.F(pck.class, pckVar);
    }

    private pck() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", pbp.s, "c", pbp.r, "d", pbp.q});
            case 3:
                return new pck();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pck.class) {
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
