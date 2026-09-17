package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdm extends ppd implements pqn {
    public static final pdm h;
    private static volatile pqs i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public int f;
    public long g;

    static {
        pdm pdmVar = new pdm();
        h = pdmVar;
        ppd.F(pdm.class, pdmVar);
    }

    private pdm() {
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
                return E(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", pcm.u, "e", "f", "g"});
            case 3:
                return new pdm();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pdm.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(h);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
