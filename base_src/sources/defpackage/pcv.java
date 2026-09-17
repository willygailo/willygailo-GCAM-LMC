package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcv extends ppd implements pqn {
    public static final pcv f;
    private static volatile pqs g;
    public int a;
    public int b;
    public String c = "";
    public float d;
    public float e;

    static {
        pcv pcvVar = new pcv();
        f = pcvVar;
        ppd.F(pcv.class, pcvVar);
    }

    private pcv() {
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
                return E(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဈ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", pcm.f, "c", "d", "e"});
            case 3:
                return new pcv();
            case 4:
                return new poy(f);
            case 5:
                return f;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (pcv.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(f);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
