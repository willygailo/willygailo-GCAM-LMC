package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptr extends ppd implements pqn {
    public static final ptr a;
    private static volatile pqs g;
    private int b;
    private long c;
    private ptq d;
    private pts e;
    private byte f = 2;

    static {
        ptr ptrVar = new ptr();
        a = ptrVar;
        ppd.F(ptr.class, ptrVar);
    }

    private ptr() {
        pqv pqvVar = pqv.b;
        poc pocVar = poc.b;
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
            default:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(a, "\u0001\u0003\u0000\u0001\u0001\u0018\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0017ᐉ\b\u0018ᐉ\u0006", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new ptr();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (ptr.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(a);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
