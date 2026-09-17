package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcr extends ppd implements pqn {
    public static final pcr g;
    private static volatile pqs h;
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public long f;

    static {
        pcr pcrVar = new pcr();
        g = pcrVar;
        ppd.F(pcr.class, pcrVar);
    }

    private pcr() {
        pqv pqvVar = pqv.b;
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new pcr();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pcr.class) {
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
