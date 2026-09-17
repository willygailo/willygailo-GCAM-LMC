package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class plg extends ppd implements pqn {
    public static final plg i;
    private static volatile pqs k;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    private int j;
    public int a = 1;
    public float g = -1.0f;
    public float h = -1.0f;

    static {
        plg plgVar = new plg();
        i = plgVar;
        ppd.F(plg.class, plgVar);
    }

    private plg() {
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
                return E(i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new plg();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = k;
                if (pozVar == null) {
                    synchronized (plg.class) {
                        pozVar = k;
                        if (pozVar == null) {
                            pozVar = new poz(i);
                            k = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
