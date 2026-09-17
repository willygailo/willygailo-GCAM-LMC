package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvs extends ppd implements pqn {
    public static final nvs d;
    private static volatile pqs f;
    public int a;
    public String b = "";
    public ppm c = pqv.b;
    private int e;

    static {
        nvs nvsVar = new nvs();
        d = nvsVar;
        ppd.F(nvs.class, nvsVar);
    }

    private nvs() {
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
                return E(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "a", mfw.j, "b", "c", nvr.class});
            case 3:
                return new nvs();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (nvs.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
