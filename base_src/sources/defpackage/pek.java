package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pek extends ppd implements pqn {
    public static final pek h;
    private static volatile pqs i;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    static {
        pek pekVar = new pek();
        h = pekVar;
        ppd.F(pek.class, pekVar);
    }

    private pek() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဌ\u0004\u0007ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", pdq.s, "g", pdq.r});
            case 3:
                return new pek();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pek.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
