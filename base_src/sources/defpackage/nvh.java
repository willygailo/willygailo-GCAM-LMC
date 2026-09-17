package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nvh extends ppd implements pqn {
    public static final nvh g;
    private static volatile pqs i;
    public int a;
    public Object c;
    public nvl d;
    public boolean e;
    public int f;
    public int b = 0;
    private byte h = 2;

    static {
        nvh nvhVar = new nvh();
        g = nvhVar;
        ppd.F(nvh.class, nvhVar);
    }

    private nvh() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i2, Object obj) {
        switch (i2 - 1) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
            default:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(g, "\u0001\u0005\u0001\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0005်\u0000\u0006်\u0000\bင\u0007", new Object[]{"c", "b", "a", "d", "e", "f"});
            case 3:
                return new nvh();
            case 4:
                return new poy(g);
            case 5:
                return g;
            case 6:
                pqs pozVar = i;
                if (pozVar == null) {
                    synchronized (nvh.class) {
                        pozVar = i;
                        if (pozVar == null) {
                            pozVar = new poz(g);
                            i = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
