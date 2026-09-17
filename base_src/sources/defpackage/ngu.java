package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ngu extends ppd implements pqn {
    public static final ngu h;
    private static volatile pqs i;
    public int a;
    public long e;
    public long f;
    public String b = "";
    public poc c = poc.b;
    public String d = "";
    public ppm g = pqv.b;

    static {
        ngu nguVar = new ngu();
        h = nguVar;
        ppd.F(ngu.class, nguVar);
    }

    private ngu() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", ngv.class, "f"});
            case 3:
                return new ngu();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (ngu.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
