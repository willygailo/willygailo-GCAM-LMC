package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozt extends ppd implements pqn {
    public static final ozt g;
    private static volatile pqs h;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public int f;

    static {
        ozt oztVar = new ozt();
        g = oztVar;
        ppd.F(ozt.class, oztVar);
    }

    private ozt() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", mfw.o, "c", mfw.o, "d", "e", "f", ozz.c()});
            case 3:
                return new ozt();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (ozt.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
