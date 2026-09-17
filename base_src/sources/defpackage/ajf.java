package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ajf {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    private final int g;

    public ajf(String str, String str2, boolean z, int i, String str3, int i2) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.c = i3;
        this.f = str3;
        this.g = i2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public static boolean a(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (i != 0) {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i == str.length() - 1) {
                    }
                    i++;
                } else if (cCharAt == '(') {
                    i = 0;
                    cCharAt = '(';
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt != ')') {
                        continue;
                    }
                    i++;
                }
            }
            if (i2 == 0) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajf)) {
            return false;
        }
        ajf ajfVar = (ajf) obj;
        if (this.e != ajfVar.e || !this.a.equals(ajfVar.a) || this.d != ajfVar.d) {
            return false;
        }
        if (this.g == 1 && ajfVar.g == 2 && (str3 = this.f) != null && !a(str3, ajfVar.f)) {
            return false;
        }
        if (this.g != 2 || ajfVar.g != 1 || (str2 = ajfVar.f) == null || a(str2, this.f)) {
            return (this.g != ajfVar.g || ((str = this.f) == null ? ajfVar.f == null : a(str, ajfVar.f))) && this.c == ajfVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "Column{name='" + this.a + "', type='" + this.b + "', affinity='" + this.c + "', notNull=" + this.d + ", primaryKeyPosition=" + this.e + ", defaultValue='" + this.f + "'}";
    }
}
