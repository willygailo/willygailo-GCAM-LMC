package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class paw extends ppd implements pqn {
    public static final paw h;
    private static volatile pqs i;
    public int a;
    public int b;
    public int c;
    public ped d;
    public pdv e;
    public ozt f;
    public peq g;

    static {
        paw pawVar = new paw();
        h = pawVar;
        ppd.F(paw.class, pawVar);
    }

    private paw() {
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
                return E(h, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\nဉ\u0003\u000bဉ\u0004\fဉ\u0005\rဉ\u0006", new Object[]{"a", "b", paf.n, "c", pcm.n, "d", "e", "f", "g"});
            case 3:
                return new paw();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (paw.class) {
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
