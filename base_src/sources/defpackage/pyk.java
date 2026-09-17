package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyk extends ppb implements pqn {
    public static final pyk j;
    private static volatile pqs l;
    public int a;
    public long b;
    public long c;
    public int d;
    public poc e;
    public long f;
    public boolean g;
    public String i;
    private byte k = 2;

    static {
        pyk pykVar = new pyk();
        j = pykVar;
        ppd.F(pyk.class, pykVar);
    }

    private pyk() {
        pqv pqvVar = pqv.b;
        poc pocVar = poc.b;
        this.e = poc.b;
        this.f = 180000L;
        ppe ppeVar = ppe.b;
        this.i = "";
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
            default:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(j, "\u0001\u0007\u0000\u0001\u0001\u001c\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\n\u000bင\u0004\u000fတ\u0010\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018", new Object[]{"a", "b", "e", "d", "f", "c", "g", "i"});
            case 3:
                return new pyk();
            case 4:
                return new ppa(j);
            case 5:
                return j;
            case 6:
                pqs pozVar = l;
                if (pozVar == null) {
                    synchronized (pyk.class) {
                        pozVar = l;
                        if (pozVar == null) {
                            pozVar = new poz(j);
                            l = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
