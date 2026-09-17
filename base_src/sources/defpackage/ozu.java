package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozu extends ppd implements pqn {
    public static final ozu e;
    private static volatile pqs f;
    public int a;
    public boolean b;
    public boolean c;
    public float d;

    static {
        ozu ozuVar = new ozu();
        e = ozuVar;
        ppd.F(ozu.class, ozuVar);
    }

    private ozu() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ozu();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (ozu.class) {
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
