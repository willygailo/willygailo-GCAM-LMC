package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nwi extends ppd implements pqn {
    public static final nwi b;
    private static volatile pqs c;
    public ppj a = pow.b;

    static {
        nwi nwiVar = new nwi();
        b = nwiVar;
        ppd.F(nwi.class, nwiVar);
    }

    private nwi() {
        poc pocVar = poc.b;
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
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new nwi();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (nwi.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
