package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pad extends ppd implements pqn {
    public static final pad m;
    private static volatile pqs n;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    public int g;
    public pce h;
    public ppk i;
    public int j;
    public boolean k;
    public ppm l;

    static {
        pad padVar = new pad();
        m = padVar;
        ppd.F(pad.class, padVar);
    }

    private pad() {
        ppe ppeVar = ppe.b;
        this.i = ppe.b;
        this.l = pqv.b;
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
                return E(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0007င\u0006\bဉ\u0007\n\u001e\u000bင\b\fဇ\t\r\u001a", new Object[]{"a", "b", paf.b, "c", "d", "e", "f", "g", "h", "i", ozz.c(), "j", "k", "l"});
            case 3:
                return new pad();
            case 4:
                return new poy(m);
            case 5:
                return m;
            case 6:
                pqs pozVar = n;
                if (pozVar == null) {
                    synchronized (pad.class) {
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
