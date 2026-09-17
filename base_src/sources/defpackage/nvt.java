package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvt extends ppd implements pqn {
    public static final nvt d;
    private static volatile pqs e;
    public int a;
    public ppk b = ppe.b;
    public int c = 1;

    static {
        nvt nvtVar = new nvt();
        d = nvtVar;
        ppd.F(nvt.class, nvtVar);
    }

    private nvt() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001e\u0004ဌ\u0002", new Object[]{"a", "b", mfw.j, "c", mfw.k});
            case 3:
                return new nvt();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nvt.class) {
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
