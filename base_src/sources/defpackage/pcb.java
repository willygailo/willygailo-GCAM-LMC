package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcb extends ppd implements pqn {
    public static final pcb g;
    private static volatile pqs h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        pcb pcbVar = new pcb();
        g = pcbVar;
        ppd.F(pcb.class, pcbVar);
    }

    private pcb() {
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
                return E(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new pcb();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = h;
                if (pozVar == null) {
                    synchronized (pcb.class) {
                        pozVar = h;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            h = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
