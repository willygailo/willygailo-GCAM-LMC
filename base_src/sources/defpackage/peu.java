package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class peu extends ppd implements pqn {
    public static final peu a;
    private static volatile pqs g;
    private int b;
    private long c;
    private int d;
    private int e;
    private byte f = 2;

    static {
        peu peuVar = new peu();
        a = peuVar;
        ppd.F(peu.class, peuVar);
    }

    private peu() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
            default:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new peu();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (peu.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
