package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mzk extends ppd implements pqn {
    public static final mzk d;
    private static volatile pqs f;
    public String a = "";
    public ppm b = pqv.b;
    public boolean c;
    private int e;

    static {
        mzk mzkVar = new mzk();
        d = mzkVar;
        ppd.F(mzk.class, mzkVar);
    }

    private mzk() {
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
                return E(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", mzj.class, "c"});
            case 3:
                return new mzk();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (mzk.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
