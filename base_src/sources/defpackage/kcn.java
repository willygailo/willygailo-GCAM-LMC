package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcn extends ppd implements pqn {
    public static final kcn a;
    private static volatile pqs b;

    static {
        kcn kcnVar = new kcn();
        a = kcnVar;
        ppd.F(kcn.class, kcnVar);
    }

    private kcn() {
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
                return new kcn();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = b;
                if (pozVar == null) {
                    synchronized (kcn.class) {
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
