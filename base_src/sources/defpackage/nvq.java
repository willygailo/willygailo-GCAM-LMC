package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvq extends ppd implements pqn {
    public static final nvq b;
    private static volatile pqs c;
    public ppm a = pqv.b;

    static {
        nvq nvqVar = new nvq();
        b = nvqVar;
        ppd.F(nvq.class, nvqVar);
    }

    private nvq() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", nvp.class});
            case 3:
                return new nvq();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (nvq.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
