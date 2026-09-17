package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptq extends ppd implements pqn {
    public static final ptq a;
    private static volatile pqs f;
    private int b;
    private double c;
    private double d;
    private byte e = 2;

    static {
        ptq ptqVar = new ptq();
        a = ptqVar;
        ppd.F(ptq.class, ptqVar);
    }

    private ptq() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
            default:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ptq();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (ptq.class) {
                        pozVar = f;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            f = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
