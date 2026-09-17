package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ped extends ppd implements pqn {
    public static final ped d;
    private static volatile pqs e;
    public int a;
    public peh b;
    public boolean c;

    static {
        ped pedVar = new ped();
        d = pedVar;
        ppd.F(ped.class, pedVar);
    }

    private ped() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဇ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new ped();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (ped.class) {
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
