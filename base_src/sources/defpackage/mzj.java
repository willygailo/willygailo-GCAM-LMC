package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mzj extends ppd implements pqn {
    public static final mzj c;
    private static volatile pqs e;
    public int a;
    public String b = "";
    private int d;

    static {
        mzj mzjVar = new mzj();
        c = mzjVar;
        ppd.F(mzj.class, mzjVar);
    }

    private mzj() {
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
                return E(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", mfw.g, "b"});
            case 3:
                return new mzj();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (mzj.class) {
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
