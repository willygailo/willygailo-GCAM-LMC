package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbw extends ppd implements pqn {
    public static final pbw l;
    private static volatile pqs m;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        pbw pbwVar = new pbw();
        l = pbwVar;
        ppd.F(pbw.class, pbwVar);
    }

    private pbw() {
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
                return E(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဌ\u0007\tင\b\nဋ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", pbp.f, "j", "k"});
            case 3:
                return new pbw();
            case 4:
                return new poy(l);
            case 5:
                return l;
            case 6:
                pqs pozVar = m;
                if (pozVar == null) {
                    synchronized (pbw.class) {
                        pozVar = m;
                        if (pozVar == null) {
                            pozVar = new poz(l);
                            m = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
