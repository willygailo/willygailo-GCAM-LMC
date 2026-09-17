package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbs extends ppd implements pqn {
    public static final pbs f;
    private static volatile pqs g;
    public int a;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        pbs pbsVar = new pbs();
        f = pbsVar;
        ppd.F(pbs.class, pbsVar);
    }

    private pbs() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", pbp.d, "c", "d", "e"});
            case 3:
                return new pbs();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pbs.class) {
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
