package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psn extends ppd implements pqn {
    public static final psn r;
    private static volatile pqs s;
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
    public ppm m = pqv.b;
    public ppj n = pow.b;
    public float o;
    public float p;
    public float q;

    static {
        psn psnVar = new psn();
        r = psnVar;
        ppd.F(psn.class, psnVar);
    }

    private psn() {
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
                return E(r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\f\u001b\r$\u000eခ\u000b\u000fခ\f\u0010ခ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", psu.class, "n", "o", "p", "q"});
            case 3:
                return new psn();
            case 4:
                return new poy(r);
            case 5:
                return r;
            case 6:
                pqs pozVar = s;
                if (pozVar == null) {
                    synchronized (psn.class) {
                        pozVar = s;
                        if (pozVar == null) {
                            pozVar = new poz(r);
                            s = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
