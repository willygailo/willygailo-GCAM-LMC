package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pla extends ppd implements pqn {
    public static final pla l;
    private static volatile pqs n;
    public float a = -1.0f;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -999.0f;
    public float j;
    public float k;
    private int m;

    static {
        pla plaVar = new pla();
        l = plaVar;
        ppd.F(pla.class, plaVar);
    }

    private pla() {
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
                return E(l, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b", new Object[]{"m", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new pla();
            case 4:
                return new poy(l);
            case 5:
                return l;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (pla.class) {
                        pozVar = n;
                        if (pozVar == null) {
                            pozVar = new poz(l);
                            n = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
