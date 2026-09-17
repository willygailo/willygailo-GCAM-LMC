package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pwm {
    String a;
    String b;
    String c;
    String d;
    Float e;
    Float f;
    Float g;

    public pwm(String str, String str2, String str3, String str4, float f, float f2) {
        this(str, str2, str3, str4, Float.valueOf(f), Float.valueOf(f2), null);
    }

    public pwm(String str, String str2, String str3, String str4, Float f, Float f2, Float f3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    final boolean a(String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        String str8 = this.a;
        return (str8 == null || str8.equals(str)) && ((str5 = this.b) == null || str5.equals(str2)) && (((str6 = this.c) == null || str6.equals(str3)) && ((str7 = this.d) == null || str7.equals(str4)));
    }
}
