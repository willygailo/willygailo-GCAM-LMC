package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvy extends ppd implements pqn {
    public static final nvy e;
    private static volatile pqs f;
    public int a;
    public int b;
    public long c;
    public long d;

    static {
        nvy nvyVar = new nvy();
        e = nvyVar;
        ppd.F(nvy.class, nvyVar);
    }

    private nvy() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nvy();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (nvy.class) {
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
