package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcw extends ppd implements pqn {
    public static final pcw m;
    private static volatile pqs n;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public ppm i = pqv.b;
    public boolean j;
    public int k;
    public int l;

    static {
        pcw pcwVar = new pcw();
        m = pcwVar;
        ppd.F(pcw.class, pcwVar);
    }

    private pcw() {
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
                return E(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဌ\u0006\b\u001b\tဇ\u0007\nဌ\b\u000bဌ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", pcm.h, "i", pcz.class, "j", "k", pcm.i, "l", pcm.g});
            case 3:
                return new pcw();
            case 4:
                return new poy(m);
            case 5:
                return m;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (pcw.class) {
                        pozVar = n;
                        if (pozVar == null) {
                            pozVar = new poz(m);
                            n = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
