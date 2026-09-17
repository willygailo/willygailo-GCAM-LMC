package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcx extends ppd implements pqn {
    public static final pcx e;
    private static volatile pqs f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        pcx pcxVar = new pcx();
        e = pcxVar;
        ppd.F(pcx.class, pcxVar);
    }

    private pcx() {
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", pcm.j, "c", "d"});
            case 3:
                return new pcx();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pcx.class) {
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
