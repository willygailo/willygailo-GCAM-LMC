package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mgy extends ppd implements pqn {
    public static final mgy c;
    private static volatile pqs e;
    public String a = "";
    public float b;
    private int d;

    static {
        mgy mgyVar = new mgy();
        c = mgyVar;
        ppd.F(mgy.class, mgyVar);
    }

    private mgy() {
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
                return E(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new mgy();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (mgy.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
