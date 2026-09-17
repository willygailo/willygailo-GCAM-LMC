package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcy extends ppd implements pqn {
    public static final pcy g;
    private static volatile pqs h;
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
        pcy pcyVar = new pcy();
        g = pcyVar;
        ppd.F(pcy.class, pcyVar);
    }

    private pcy() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", pcm.n, "c", pcm.n, "d", "e", "f", pcm.k});
            case 3:
                return new pcy();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pcy.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
