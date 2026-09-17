package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pso extends ppd implements pqn {
    public static final pso m;
    private static volatile pqs n;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;

    static {
        pso psoVar = new pso();
        m = psoVar;
        ppd.F(pso.class, psoVar);
    }

    private pso() {
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
                return E(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new pso();
            case 4:
                return new poy(m);
            case 5:
                return m;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (pso.class) {
                        pozVar = n;
                        if (pozVar == null) {
                            pozVar = new poz(m);
                            n = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
