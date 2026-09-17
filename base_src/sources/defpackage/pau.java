package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pau extends ppd implements pqn {
    public static final pau e;
    private static volatile pqs f;
    public int a;
    public boolean b;
    public float c;
    public int d;

    static {
        pau pauVar = new pau();
        e = pauVar;
        ppd.F(pau.class, pauVar);
    }

    private pau() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", pcm.n});
            case 3:
                return new pau();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pau.class) {
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
