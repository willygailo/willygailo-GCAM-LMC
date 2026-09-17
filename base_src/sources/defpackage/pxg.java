package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxg extends ppd implements pqn {
    public static final pxg d;
    private static volatile pqs e;
    public int a;
    public String b = "";
    public ozn c;

    static {
        pxg pxgVar = new pxg();
        d = pxgVar;
        ppd.F(pxg.class, pxgVar);
    }

    private pxg() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new pxg();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pxg.class) {
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
