package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pvc extends ppd implements pqn {
    public static final pvc d;
    private static volatile pqs e;
    public int a;
    public float b;
    public boolean c;

    static {
        pvc pvcVar = new pvc();
        d = pvcVar;
        ppd.F(pvc.class, pvcVar);
    }

    private pvc() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new pvc();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pvc.class) {
                        pozVar = e;
                        if (pozVar == null) {
                            pozVar = new poz(d);
                            e = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
