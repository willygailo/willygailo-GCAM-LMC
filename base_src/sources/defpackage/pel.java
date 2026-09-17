package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pel extends ppd implements pqn {
    public static final pel k;
    private static volatile pqs l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        pel pelVar = new pel();
        k = pelVar;
        ppd.F(pel.class, pelVar);
    }

    private pel() {
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
                return E(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new pel();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (pel.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
