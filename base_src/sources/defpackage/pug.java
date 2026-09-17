package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pug extends ppd implements pqn {
    public static final pug b;
    private static volatile pqs c;
    public ppj a = pow.b;

    static {
        pug pugVar = new pug();
        b = pugVar;
        ppd.F(pug.class, pugVar);
    }

    private pug() {
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
                return E(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u0013", new Object[]{"a"});
            case 3:
                return new pug();
            case 4:
                return new poy(b);
            case 5:
                return b;
            case 6:
                pqs pozVar = c;
                if (pozVar == null) {
                    synchronized (pug.class) {
                        pozVar = c;
                        if (pozVar == null) {
                            pozVar = new poz(b);
                            c = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
