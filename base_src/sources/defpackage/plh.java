package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plh extends ppd implements pqn {
    public static final plh k;
    private static volatile pqs m;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    private int l;

    static {
        plh plhVar = new plh();
        k = plhVar;
        ppd.F(plh.class, plhVar);
    }

    private plh() {
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
                return E(k, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t", new Object[]{"l", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new plh();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (plh.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
