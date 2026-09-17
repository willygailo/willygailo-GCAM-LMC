package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptc extends ppd implements pqn {
    public static final ptc e;
    private static volatile pqs f;
    public int a;
    public float b;
    public float c;
    public int d = 15000;

    static {
        ptc ptcVar = new ptc();
        e = ptcVar;
        ppd.F(ptc.class, ptcVar);
    }

    private ptc() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", per.m});
            case 3:
                return new ptc();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (ptc.class) {
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
