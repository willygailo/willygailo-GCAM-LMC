package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oic extends ppd implements pqn {
    public static final oic k;
    private static volatile pqs l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        oic oicVar = new oic();
        k = oicVar;
        ppd.F(oic.class, oicVar);
    }

    private oic() {
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
                return E(k, "\u0000\n\u0000\u0000\u0002\r\n\u0000\u0000\u0000\u0002\u000b\u0004\u000b\u0005\u000b\u0006\u000f\b\u000f\t\u000f\n\u000b\u000b\u000b\f\u000b\r\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new oic();
            case 4:
                return new poy(k);
            case 5:
                return k;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (oic.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(k);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
