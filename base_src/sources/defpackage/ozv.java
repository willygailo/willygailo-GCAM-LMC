package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozv extends ppd implements pqn {
    public static final ozv g;
    private static volatile pqs h;
    public int a;
    public pci b;
    public ppm c;
    public float d;
    public ppm e;
    public pai f;

    static {
        ozv ozvVar = new ozv();
        g = ozvVar;
        ppd.F(ozv.class, ozvVar);
    }

    private ozv() {
        pqv pqvVar = pqv.b;
        this.c = pqv.b;
        this.e = pqv.b;
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
                return E(g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0002\u0000\u0002ဉ\u0001\u0004\u001b\u0005ခ\u0002\u0007\u001b\bဉ\u0003", new Object[]{"a", "b", "c", paz.class, "d", "e", pcd.class, "f"});
            case 3:
                return new ozv();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (ozv.class) {
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
