package defpackage;

import android.os.Build;
import com.Helper;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class lzi {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;

    private lzi(long j) {
        this.a = j == -8977428044353436645L;
        this.b = j == -5238078545268050332L;
        this.o = j == 2353878190013225779L;
        this.n = j == 5177423953723387160L;
        this.p = j == 1998349393618216766L;
        this.q = j == -3048193804805810922L;
        this.c = j == -1134170917312626182L;
        this.r = j == 7819589124620182093L;
        this.d = j == 1863053326329578117L;
        this.s = j == -6540513541338685385L;
        this.t = j == 8020350475331722164L;
        this.u = j == 4736388726057620427L;
        this.e = j == 1128693008105137506L;
        this.f = j == 8617630140713188829L;
        this.g = j == -2165063365505996463L;
        this.h = j == -6176613516764112573L;
        this.v = j == 8476275058780644385L;
        this.i = j == -5619725207126906835L;
        this.w = j == -1152407906810979636L;
        this.j = j == 4003097551557419468L;
        this.k = j == -3704938238089310216L;
        this.l = j == -1280572264377593363L;
        this.x = j == -381037733589485599L;
        this.m = j == -1047407971738119953L;
    }

    public static lzi a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String strSetInterface = Helper.SetInterface();
        String str3 = Build.FINGERPRINT;
        String strJ = j("Google");
        String strJ2 = j(strSetInterface);
        String strJ3 = j(str3);
        if (strJ2.startsWith("GENERIC") || strJ3.startsWith("GENERIC") || strJ3.contains("SDK_") || strJ3.contains("_SDK")) {
            return new lzi(-8977428044353436645L);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strJ2).length() + 34 + String.valueOf(strJ).length());
        sb.append("G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|");
        sb.append(strJ2);
        sb.append("|");
        sb.append(strJ);
        String string = sb.toString();
        oyk oykVarA = oym.a();
        String upperCase = string.toUpperCase(Locale.ROOT);
        int length = upperCase.length();
        int i = length + length;
        obr.aI(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        oxh oxhVarA = ((oyh) oykVarA).a();
        int length2 = upperCase.length();
        for (int i2 = 0; i2 < length2; i2++) {
            oyg oygVar = (oyg) oxhVarA;
            oygVar.a.putChar(upperCase.charAt(i2));
            try {
                ((oyg) oxhVarA).ae(((oyg) oxhVarA).a.array());
                oygVar.a.clear();
            } catch (Throwable th) {
                oygVar.a.clear();
                throw th;
            }
        }
        oyn oynVar = (oyn) oxhVarA;
        oynVar.af();
        oynVar.d = true;
        oyi oyiVar = (oyi) (oynVar.c == oynVar.b.getDigestLength() ? oyj.e(oynVar.b.digest()) : oyj.e(Arrays.copyOf(oynVar.b.digest(), oynVar.c)));
        int length3 = oyiVar.a.length;
        obr.aS(length3 >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length3);
        long j = oyiVar.a[0] & 255;
        for (int i3 = 1; i3 < Math.min(oyiVar.a.length, 8); i3++) {
            j |= (((long) oyiVar.a[i3]) & 255) << (i3 * 8);
        }
        return new lzi(j);
    }

    private static String j(String str) {
        return str == null ? "unknown" : str.toUpperCase(Locale.ROOT);
    }

    public final boolean b() {
        return this.o || this.n;
    }

    public final boolean c() {
        return this.p || this.q;
    }

    public final boolean d() {
        return this.r || this.c;
    }

    public final boolean e() {
        return this.t || this.u || this.e;
    }

    public final boolean f() {
        return this.d || this.s;
    }

    public final boolean g() {
        return this.g || this.h;
    }

    public final boolean h() {
        return this.v || this.w || this.j || this.k;
    }

    public final boolean i() {
        return this.l || this.x;
    }
}
