package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mha extends ppd implements pqn {
    public static final mha d;
    private static volatile pqs f;
    public int a = 0;
    public Object b;
    public mgz c;
    private int e;

    static {
        mha mhaVar = new mha();
        d = mhaVar;
        ppd.F(mha.class, mhaVar);
    }

    private mha() {
        pqv pqvVar = pqv.b;
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
                return E(d, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"b", "a", "e", "c", mih.class, min.class, mii.class, mil.class, mij.class, plz.class, mik.class});
            case 3:
                return new mha();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (mha.class) {
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
