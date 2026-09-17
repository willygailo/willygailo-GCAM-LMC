package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pmf extends ppd implements pqn {
    public static final pmf a;
    private static volatile pqs b;

    static {
        pmf pmfVar = new pmf();
        a = pmfVar;
        ppd.F(pmf.class, pmfVar);
    }

    private pmf() {
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
                return E(a, "\u0001\u0000", null);
            case 3:
                return new pmf();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = b;
                if (pozVar == null) {
                    synchronized (pmf.class) {
                        pozVar = b;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            b = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
