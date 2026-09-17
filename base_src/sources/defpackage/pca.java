package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pca extends ppd implements pqn {
    public static final pca d;
    private static volatile pqs e;
    public int a;
    public float b;
    public float c;

    static {
        pca pcaVar = new pca();
        d = pcaVar;
        ppd.F(pca.class, pcaVar);
    }

    private pca() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new pca();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pca.class) {
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
