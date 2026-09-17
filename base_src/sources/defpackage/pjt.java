package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjt extends ppd implements pqn {
    public static final pjt b;
    private static volatile pqs d;
    private byte c = 2;
    public ppm a = pqv.b;

    static {
        pjt pjtVar = new pjt();
        b = pjtVar;
        ppd.F(pjt.class, pjtVar);
    }

    private pjt() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
            default:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", pjs.class});
            case 3:
                return new pjt();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (pjt.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
