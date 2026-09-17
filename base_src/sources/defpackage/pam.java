package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pam extends ppd implements pqn {
    public static final pam T;
    private static volatile pqs U;
    public boolean A;
    public int B;
    public peg C;
    public ozr D;
    public boolean E;
    public pba F;
    public boolean G;
    public boolean H;
    public pen I;
    public pbt J;
    public pet L;
    public ozu M;
    public ozs N;
    public boolean O;
    public pbj P;
    public pdb Q;
    public boolean R;
    public pcu S;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public float e;
    public float f;
    public pbe g;
    public boolean h;
    public float i;
    public int j;
    public boolean k;
    public pdh m;
    public pem n;
    public pbv o;
    public pdg p;
    public pas q;
    public pcs r;
    public int s;
    public int t;
    public pcw u;
    public pbh v;
    public pdn w;
    public pbx x;
    public pbg y;
    public int z;
    public ppm l = pqv.b;
    public int K = 4;

    static {
        pam pamVar = new pam();
        T = pamVar;
        ppd.F(pam.class, pamVar);
    }

    private pam() {
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
                return E(T, "\u0001+\u0000\u0002\u0003A+\u0000\u0001\u0000\u0003ဌ\u0001\u0006ဇ\u0002\u0007ခ\u0003\bခ\u0004\tဉ\u0005\nဇ\u0006\u000bခ\u0007\fဌ\b\rဇ\t\u000f\u001b\u0014ဉ\f\u0015ဉ\r\u0016ဉ\u000e\u0018ဉ\u0010\u001dဉ\u0013\u001fဉ\u0015#င\u0019$ဌ\u001a%ဉ\u001b&ဉ\u001c'ဉ\u001d(ဉ\u001e)ဉ\u001f*ဌ!,ဇ\"-ဌ#.ဉ$/ဉ%0ဇ&1ဉ'2ဇ(3ဇ)4ဉ*5ဉ+6ဌ,7ဉ-9ဉ/:ဉ0;ဇ1<ဉ2?ဉ5@ဇ6Aဉ7", new Object[]{"a", "b", "c", pcm.n, "d", "e", "f", "g", "h", "i", "j", paf.j, "k", "l", pbf.class, "m", "n", "o", "p", "q", "r", "s", "t", paf.h, "u", "v", "w", "x", "y", "z", paf.i, "A", "B", mfw.o, "C", "D", "E", "F", "G", "H", "I", "J", "K", pdq.o, "L", "M", "N", "O", "P", "Q", "R", "S"});
            case 3:
                return new pam();
            case 4:
                return new poy(T);
            case 5:
                return T;
            case 6:
                pqs pozVar = U;
                if (pozVar == null) {
                    synchronized (pam.class) {
                        pozVar = U;
                        if (pozVar == null) {
                            pozVar = new poz(T);
                            U = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
