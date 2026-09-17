package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pba extends ppd implements pqn {
    public static final pba h;
    private static volatile pqs i;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    static {
        pba pbaVar = new pba();
        h = pbaVar;
        ppd.F(pba.class, pbaVar);
    }

    private pba() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0003\u0004ခ\u0004\u0005ခ\u0002\u0006ခ\u0005", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
            case 3:
                return new pba();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pba.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
