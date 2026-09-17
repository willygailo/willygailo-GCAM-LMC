package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pdg extends ppd implements pqn {
    public static final pdg d;
    private static volatile pqs e;
    public int a;
    public int b;
    public float c;

    static {
        pdg pdgVar = new pdg();
        d = pdgVar;
        ppd.F(pdg.class, pdgVar);
    }

    private pdg() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"a", "b", pcm.r, "c"});
            case 3:
                return new pdg();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (pdg.class) {
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
