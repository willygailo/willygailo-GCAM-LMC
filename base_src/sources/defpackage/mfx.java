package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mfx extends ppd implements pqn {
    public static final mfx f;
    private static volatile pqs g;
    public int a;
    public String b = "";
    public String c = "";
    public int d = -1;
    public int e = -1;

    static {
        mfx mfxVar = new mfx();
        f = mfxVar;
        ppd.F(mfx.class, mfxVar);
    }

    private mfx() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", mfw.a, "e", mfw.a});
            case 3:
                return new mfx();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (mfx.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
