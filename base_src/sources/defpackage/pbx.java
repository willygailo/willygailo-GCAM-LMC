package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbx extends ppd implements pqn {
    public static final pbx h;
    private static volatile pqs i;
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public long f;
    public long g;

    static {
        pbx pbxVar = new pbx();
        h = pbxVar;
        ppd.F(pbx.class, pbxVar);
    }

    private pbx() {
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
                return E(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0006ခ\u0005\u0007ဇ\u0006\bဌ\u0007\tဂ\b\nဂ\t", new Object[]{"a", "b", pbp.g, "c", "d", "e", pbp.h, "f", "g"});
            case 3:
                return new pbx();
            case 4:
                return new poy(h);
            case 5:
                return h;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (pbx.class) {
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
