package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxe extends ppd implements pqn {
    public static final pxe e;
    private static volatile pqs f;
    public int a;
    public float b;
    public float c;
    public float d;

    static {
        pxe pxeVar = new pxe();
        e = pxeVar;
        ppd.F(pxe.class, pxeVar);
    }

    private pxe() {
        pow powVar = pow.b;
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new pxe();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pxe.class) {
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
