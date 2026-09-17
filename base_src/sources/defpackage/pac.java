package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pac extends ppd implements pqn {
    public static final pac aq;
    private static volatile pqs as;
    public pds A;
    public pch B;
    public ozp D;
    public pdr E;
    public pee F;
    public pdm G;
    public pcx H;
    public pbl I;
    public pbm J;
    public pdx K;
    public int L;
    public pak M;
    public pep N;
    public pcy O;
    public pbz P;
    public pdf Q;
    public long R;
    public pco S;
    public pdp T;
    public pbu U;
    public pax V;
    public ozo W;
    public pay X;
    public pek Y;
    public pej Z;
    public int a;
    public pae aa;
    public pec ab;
    public pag ac;
    public pbs ad;
    public pbr ae;
    public pau af;
    public pbc ag;
    public peb ah;
    public pby ai;
    public pes aj;
    public ozy ak;
    public pbw al;
    public pdt am;
    public long an;
    public pbb ao;
    public pcj ap;
    public int b;
    public int c;
    public int d;
    public pdc f;
    public pam g;
    public pcv h;
    public pbn i;
    public pad j;
    public paw k;
    public pal l;
    public ozv m;
    public par n;
    public pao o;
    public pan p;
    public paj q;
    public pdd r;
    public pav s;
    public ozw t;
    public pap u;
    public paq v;
    public int w;
    public long x;
    public int y;
    public boolean z;
    private byte ar = 2;
    public String e = "";
    public String C = "";

    static {
        pac pacVar = new pac();
        aq = pacVar;
        ppd.F(pac.class, pacVar);
    }

    private pac() {
    }

    @Override // defpackage.ppd
    protected final Object a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.ar);
            case 1:
            default:
                this.ar = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return E(aq, "\u0001A\u0000\u0003\u0001TA\u0000\u0000\u0001\u0001ဌ\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\fဉ\b\rဉ\t\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0014\u0019ဉ\u0015\u001aဉ\u0016 င\u001a!စ\u001b\"ဌ\u001c#ဇ\u001d$ဉ\u001e&ဉ (ဈ\")ဉ#*ဉ$.ဉ(/ဉ)0ဉ*1ဉ+2ဉ,3ဉ-4ဌ.5ဉ/6ᐉ07ဉ18ဉ29ဉ3:စ4<ဉ6=ဉ7>ဉ8?ဉ9@ဉ:Aဉ;Bဉ<Cဉ=Dဉ>Eဉ?Fဉ@GဉAHဉBIဉCJဉDKဉEMဉGNဉHOဉIPဉJQဉKRဂLSဉMTဉN", new Object[]{"a", "b", "c", "d", pab.c(), "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", mfw.t, "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", pcm.n, "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap"});
            case 3:
                return new pac();
            case 4:
                return new poy(aq);
            case 5:
                return aq;
            case 6:
                pqs pozVar = as;
                if (pozVar == null) {
                    synchronized (pac.class) {
                        pozVar = as;
                        if (pozVar == null) {
                            pozVar = new poz(aq);
                            as = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
