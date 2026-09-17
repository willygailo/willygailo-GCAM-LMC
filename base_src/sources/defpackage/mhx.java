package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mhx extends ppd implements pqn {
    public static final mhx c;
    private static volatile pqs d;
    public int a;
    public String b = "";

    static {
        mhx mhxVar = new mhx();
        c = mhxVar;
        ppd.F(mhx.class, mhxVar);
    }

    private mhx() {
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
                return E(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new mhx();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (mhx.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
