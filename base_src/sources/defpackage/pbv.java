package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pbv extends ppd implements pqn {
    public static final pbv aC;
    private static volatile pqs aH;
    public float A;
    public float B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public boolean G;
    public int H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public int a;
    public float aA;
    public float aB;
    public float aa;
    public ppj ab;
    public int ac;
    public float ad;
    public float ae;
    public boolean af;
    public int ag;
    public float ah;
    public float ai;
    public int aj;
    public int ak;
    public boolean al;
    public float am;
    public float an;
    public float ao;
    public boolean ap;
    public int aq;
    public int ar;
    public float as;
    public float at;
    public long au;
    public long av;
    public long aw;
    public float ax;
    public ppj ay;
    public ppj az;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public ppj s;
    public ppf t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    static {
        pbv pbvVar = new pbv();
        aC = pbvVar;
        ppd.F(pbv.class, pbvVar);
    }

    private pbv() {
        pow powVar = pow.b;
        ppe ppeVar = ppe.b;
        this.s = pow.b;
        this.t = pnu.b;
        this.ab = pow.b;
        this.ay = pow.b;
        this.az = pow.b;
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
                return E(aC, "\u0001M\u0000\u0003\u0002ZM\u0000\u0005\u0000\u0002ခ\u0001\u0003ခ\u0002\u0005ခ\u0004\u0006ခ\u0005\bခ\u0007\tခ\b\nခ\t\fင\n\rင\u000b\u0011င\f\u0012င\r\u0014ခ\u000f\u0015ခ\u0010\u0016ဇ\u0011\u0017ဇ\u0012\u0018\u0013\u0019\u0019\u001aခ\u0013\u001bခ\u0014\u001cခ\u0015\u001dခ\u0016\u001eခ\u0017\u001fခ\u0018 ခ\u0019!ခ\u001a#ဇ\u001c$ခ\u001d%ခ\u001e&ခ\u001f'ဇ *ဌ#+ခ$,ခ%-ခ&.ခ'/ခ(0ခ)1ခ*2င+3ခ,4ခ-5ခ.6င/7ခ08ခ19ခ2:ခ3;ခ4<ခ5=ခ6>\u0013?င7@ခ8Aခ9Bဇ:Cင;Dခ<Fခ>Hင@IငAJဇBKခCLခDMခENဇFOငGPငHQခIRခJSဂKTဂLUဂMVခNW$X$YခOZခP", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", pbp.e, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "ar", "as", "at", "au", "av", "aw", "ax", "ay", "az", "aA", "aB"});
            case 3:
                return new pbv();
            case 4:
                return new poy(aC);
            case 5:
                return aC;
            case 6:
                pqs pozVar = aH;
                if (pozVar == null) {
                    synchronized (pbv.class) {
                        pozVar = aH;
                        if (pozVar == null) {
                            pozVar = new poz(aC);
                            aH = pozVar;
                        }
                        break;
                    }
                }
                return pozVar;
        }
    }
}
