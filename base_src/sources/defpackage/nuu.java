package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuu extends ppd implements pqn {
    public static final nuu e;
    private static volatile pqs f;
    public int a;
    public int b = 0;
    public Object c;
    public long d;

    static {
        nuu nuuVar = new nuu();
        e = nuuVar;
        ppd.F(nuu.class, nuuVar);
    }

    private nuu() {
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
                return E(e, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဴ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nဴ\u0000\u000bဴ\u0000\fဴ\u0000\rဴ\u0000", new Object[]{"c", "b", "a", "d", nuv.class, nuv.class, nuv.class, nuv.class, nuv.class, nut.class, nut.class});
            case 3:
                return new nuu();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (nuu.class) {
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
