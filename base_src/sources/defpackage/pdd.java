package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdd extends ppd implements pqn {
    public static final pdd f;
    private static volatile pqs g;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        pdd pddVar = new pdd();
        f = pddVar;
        ppd.F(pdd.class, pddVar);
    }

    private pdd() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", pcm.o, "c", "d", "e", pcm.p});
            case 3:
                return new pdd();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pdd.class) {
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
