package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pni extends ppd implements pqn {
    public static final pni e;
    private static volatile pqs f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        pni pniVar = new pni();
        e = pniVar;
        ppd.F(pni.class, pniVar);
    }

    private pni() {
        pqv pqvVar = pqv.b;
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
                return E(e, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\nဈ\u000b", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new pni();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = f;
                if (pozVar == null) {
                    synchronized (pni.class) {
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
