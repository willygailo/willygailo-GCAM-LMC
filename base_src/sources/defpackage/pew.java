package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pew extends ppd implements pqn {
    public static final pew f;
    private static volatile pqs h;
    public int a;
    public int e;
    private byte g = 2;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        pew pewVar = new pew();
        f = pewVar;
        ppd.F(pew.class, pewVar);
    }

    private pew() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
            default:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pew();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pew.class) {
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
