package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nff extends ppd implements pqn {
    public static final nff b;
    private static volatile pqs c;
    public pqh a = pqh.a;

    static {
        nff nffVar = new nff();
        b = nffVar;
        ppd.F(nff.class, nffVar);
    }

    private nff() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", nfe.a});
            case 3:
                return new nff();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (nff.class) {
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

    public final pqh b() {
        pqh pqhVar = this.a;
        if (!pqhVar.b) {
            this.a = pqhVar.a();
        }
        return this.a;
    }
}
