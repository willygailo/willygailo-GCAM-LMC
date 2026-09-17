package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pne extends ppd implements pqn {
    public static final pne a;
    private static volatile pqs f;
    private int b;
    private pnc d;
    private byte e = 2;
    private poc c = poc.b;

    static {
        pne pneVar = new pne();
        a = pneVar;
        ppd.F(pne.class, pneVar);
    }

    private pne() {
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
                return E(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0004ᐉ\u0003", new Object[]{"b", "c", "d"});
            case 3:
                return new pne();
            case 4:
                return new poy(a);
            case 5:
                return a;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pne.class) {
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
