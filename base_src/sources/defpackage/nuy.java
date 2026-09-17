package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuy extends ppd implements pqn {
    public static final nuy e;
    private static volatile pqs g;
    public int a;
    public long d;
    private String f = "";
    public ppm b = pqv.b;
    public ppm c = pqv.b;

    static {
        nuy nuyVar = new nuy();
        e = nuyVar;
        ppd.F(nuy.class, nuyVar);
    }

    private nuy() {
    }

    public static /* synthetic */ void b(nuy nuyVar) {
        nuyVar.a |= 1;
        nuyVar.f = "camera_vkp";
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
                return E(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဂ\u0001", new Object[]{"a", "f", "b", "c", nuz.class, "d"});
            case 3:
                return new nuy();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (nuy.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
