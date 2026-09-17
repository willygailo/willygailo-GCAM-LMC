package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nfb extends ppd implements pqn {
    public static final nfb d;
    private static volatile pqs e;
    public int a;
    public ppm b = pqv.b;
    public String c = "";

    static {
        nfb nfbVar = new nfb();
        d = nfbVar;
        ppd.F(nfb.class, nfbVar);
    }

    private nfb() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new nfb();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nfb.class) {
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
