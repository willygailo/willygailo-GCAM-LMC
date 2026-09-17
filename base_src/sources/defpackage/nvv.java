package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvv extends ppd implements pqn {
    public static final nvv d;
    private static volatile pqs e;
    public int a;
    public float b;
    public String c = "";

    static {
        nvv nvvVar = new nvv();
        d = nvvVar;
        ppd.F(nvv.class, nvvVar);
    }

    private nvv() {
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
                return E(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ခ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new nvv();
            case 4:
                return new poy(d);
            case 5:
                return d;
            case 6:
                pqs pozVar = e;
                if (pozVar == null) {
                    synchronized (nvv.class) {
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
