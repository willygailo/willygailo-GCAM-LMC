package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozw extends ppd implements pqn {
    public static final ozw e;
    private static volatile pqs f;
    public int a;
    public long b;
    public long c;
    public int d;

    static {
        ozw ozwVar = new ozw();
        e = ozwVar;
        ppd.F(ozw.class, ozwVar);
    }

    private ozw() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", pcm.n});
            case 3:
                return new ozw();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (ozw.class) {
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
