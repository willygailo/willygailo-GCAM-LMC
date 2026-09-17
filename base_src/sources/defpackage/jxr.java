package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jxr extends ppd implements pqn {
    public static final jxr c;
    private static volatile pqs d;
    public poc a = poc.b;
    public long b;

    static {
        jxr jxrVar = new jxr();
        c = jxrVar;
        ppd.F(jxr.class, jxrVar);
    }

    private jxr() {
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
                return E(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new jxr();
            case 4:
                return new poy(c);
            case 5:
                return c;
            case 6:
                pqs pozVar = d;
                if (pozVar == null) {
                    synchronized (jxr.class) {
                        pozVar = d;
                        if (pozVar == null) {
                            pozVar = new poz(c);
                            d = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
