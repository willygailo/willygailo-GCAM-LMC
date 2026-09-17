package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ple extends ppd implements pqn {
    public static final ple h;
    private static volatile pqs j;
    public boolean a;
    public boolean b;
    public int c = -1;
    public float d = -1.0f;
    public float e = -1.0f;
    public float f = -1.0f;
    public float g = -1.0f;
    private int i;

    static {
        ple pleVar = new ple();
        h = pleVar;
        ppd.F(ple.class, pleVar);
    }

    private ple() {
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
                return E(h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new ple();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (ple.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
