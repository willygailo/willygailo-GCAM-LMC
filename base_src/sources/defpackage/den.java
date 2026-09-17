package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class den {
    public static final ouj a = ouj.h("com/google/android/apps/camera/configuration/impl/GcaConfigHelper");
    public final SharedPreferences b;
    public final nvb c;
    private final lzk d;
    private final ojc e;

    public den(lzk lzkVar, SharedPreferences sharedPreferences, nvb nvbVar, dei deiVar, byte[] bArr, byte[] bArr2) {
        this.c = nvbVar;
        this.d = lzkVar;
        this.b = sharedPreferences;
        this.e = deiVar.b(dei.FISHFOOD) ? ojc.i(deq.b()) : oih.a;
    }

    static ner a(ddg ddgVar, Float f) {
        if (ddgVar.b == null) {
            return null;
        }
        f.getClass();
        Double dValueOf = Double.valueOf(f.floatValue());
        String str = ddgVar.b;
        str.getClass();
        String str2 = ddgVar.a;
        nep nepVar = del.a;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("__");
        sb.append(str2);
        return new nem(nepVar, sb.toString(), Double.valueOf(dValueOf.doubleValue()));
    }

    static ner b(ddg ddgVar, Integer num) {
        String str = ddgVar.b;
        if (str == null) {
            return null;
        }
        String str2 = ddgVar.a;
        num.getClass();
        nep nepVar = del.a;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("__");
        sb.append(str2);
        return new nek(nepVar, sb.toString(), Integer.valueOf(num.intValue()));
    }

    static ner c(ddg ddgVar, boolean z) {
        String str = ddgVar.b;
        if (str == null) {
            return null;
        }
        String str2 = ddgVar.a;
        nep nepVar = del.a;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("__");
        sb.append(str2);
        return nepVar.c(sb.toString(), z);
    }

    static boolean e(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    final String d(String str) {
        if (str == null) {
            return null;
        }
        String strA = this.d.a(str);
        if (strA != null) {
            return strA;
        }
        if (this.e.g() && ((ghb) this.e.c()).a && ((ghb) this.e.c()).b) {
            return null;
        }
        return this.d.a(str.length() != 0 ? "persist.".concat(str) : new String("persist."));
    }
}
