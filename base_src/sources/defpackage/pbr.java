package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbr extends ppd implements pqn {
    public static final pbr j;
    private static volatile pqs k;
    public int a;
    public int b;
    public long c;
    public long d;
    public pah f;
    public long g;
    public int h;
    public ppl e = pqb.b;
    public ppk i = ppe.b;

    static {
        pbr pbrVar = new pbr();
        j = pbrVar;
        ppd.F(pbr.class, pbrVar);
    }

    private pbr() {
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
                return E(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u0014\u0005ဉ\u0003\u0006ဂ\u0004\u0007ဌ\u0005\b\u001e", new Object[]{"a", "b", pbp.d, "c", "d", "e", "f", "g", "h", pbp.a, "i", pbq.c()});
            case 3:
                return new pbr();
            case 4:
                return new poy(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = k;
                if (pozVar == null) {
                    synchronized (pbr.class) {
                        pozVar = k;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            k = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
