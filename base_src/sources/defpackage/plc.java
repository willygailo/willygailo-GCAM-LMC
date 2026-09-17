package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plc extends ppd implements pqn {
    public static final plc f;
    private static volatile pqs h;
    public boolean a;
    public int b = -1;
    public int c = -1;
    public float d = -1.0f;
    public float e = -1.0f;
    private int g;

    static {
        plc plcVar = new plc();
        f = plcVar;
        ppd.F(plc.class, plcVar);
    }

    private plc() {
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
                return E(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            case 3:
                return new plc();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (plc.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
