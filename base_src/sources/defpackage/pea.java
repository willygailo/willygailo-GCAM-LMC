package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pea extends ppd implements pqn {
    public static final pea ad;
    private static volatile pqs ae;
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public float F;
    public float G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public int M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public int V;
    public float W;
    public float X;
    public int Y;
    public int Z;
    public int a;
    public int aa;
    public int ab;
    public int ac;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    static {
        pea peaVar = new pea();
        ad = peaVar;
        ppd.F(pea.class, peaVar);
    }

    private pea() {
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
                return E(ad, "\u00015\u0000\u0002\u000165\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ခ\u0015\u0017ခ\u0016\u0018ခ\u0017\u0019ခ\u0018\u001aခ\u0019\u001bခ\u001a\u001cခ\u001b\u001dခ\u001c\u001eင\u001d\u001fခ\u001e ခ\u001f!င \"ခ!#ခ\"$ခ#%ခ$&င%'ခ&(ခ')ခ(*ခ)+ခ*,ဌ+-င,.င-/ဌ.0ခ/1ခ02င13င24င35င46င5", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", pdq.j, "T", "U", "V", pdq.i, "W", "X", "Y", "Z", "aa", "ab", "ac"});
            case 3:
                return new pea();
            case 4:
                return new poy(ad);
            case 5:
                return ad;
            case 6:
                pqs pozVar = ae;
                if (pozVar == null) {
                    synchronized (pea.class) {
                        pozVar = ae;
                        if (pozVar == null) {
                            pozVar = new poz(ad);
                            ae = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
