package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mif extends ppd implements pqn {
    public static final mif d;
    private static volatile pqs e;
    public int a;
    public String b = "";
    public float c;

    static {
        mif mifVar = new mif();
        d = mifVar;
        ppd.F(mif.class, mifVar);
    }

    private mif() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new mif();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (mif.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
