package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nwd extends ppd implements pqn {
    public static final nwd d;
    private static volatile pqs e;
    public int a;
    public nvx b;
    public nvx c;

    static {
        nwd nwdVar = new nwd();
        d = nwdVar;
        ppd.F(nwd.class, nwdVar);
    }

    private nwd() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nwd();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nwd.class) {
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
