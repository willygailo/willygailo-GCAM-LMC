package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class psz extends ppd implements pqn {
    public static final psz i;
    private static volatile pqs j;
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public poc h = poc.b;

    static {
        psz pszVar = new psz();
        i = pszVar;
        ppd.F(psz.class, pszVar);
    }

    private psz() {
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
                return E(i, "\u0000\b\u0000\u0000\u0002\t\b\u0000\u0000\u0000\u0002\u0007\u0003\u0004\u0004\u0004\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new psz();
            case 4:
                return new poy(i);
            case 5:
                return i;
            case 6:
                pqs pozVar = j;
                if (pozVar == null) {
                    synchronized (psz.class) {
                        pozVar = j;
                        if (pozVar == null) {
                            pozVar = new poz(i);
                            j = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
