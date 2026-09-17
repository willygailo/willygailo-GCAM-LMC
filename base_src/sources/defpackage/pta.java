package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pta extends ppd implements pqn {
    public static final pta e;
    private static volatile pqs f;
    public int a;
    public String b = "";
    public float c;
    public float d;

    static {
        pta ptaVar = new pta();
        e = ptaVar;
        ppd.F(pta.class, ptaVar);
    }

    private pta() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new pta();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pta.class) {
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
