package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdi extends ppd implements pqn {
    public static final pdi f;
    private static volatile pqs g;
    public int a;
    public int b;
    public int c;
    public float d;
    public int e;

    static {
        pdi pdiVar = new pdi();
        f = pdiVar;
        ppd.F(pdi.class, pdiVar);
    }

    private pdi() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", pcm.s});
            case 3:
                return new pdi();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pdi.class) {
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
