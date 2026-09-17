package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nuz extends ppd implements pqn {
    public static final nuz e;
    private static volatile pqs g;
    public int a;
    public long b;
    public long c;
    public long d;
    private float f;

    static {
        nuz nuzVar = new nuz();
        e = nuzVar;
        ppd.F(nuz.class, nuzVar);
    }

    private nuz() {
    }

    public static /* synthetic */ void b(nuz nuzVar) {
        nuzVar.a |= 1;
        nuzVar.f = 1.0f;
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
                return E(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "f", "b", "c", "d"});
            case 3:
                return new nuz();
            case 4:
                return new poy(e);
            case 5:
                return e;
            case 6:
                pqs pozVar = g;
                if (pozVar == null) {
                    synchronized (nuz.class) {
                        pozVar = g;
                        if (pozVar == null) {
                            pozVar = new poz(e);
                            g = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
