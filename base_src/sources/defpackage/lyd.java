package defpackage;

import j$.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class lyd {
    private static final Pattern c = Pattern.compile("^[A-Za-z_][A-Za-z0-9_]*$");
    public final String a;
    public final Class b;

    public lyd(String str, Class cls) {
        obr.aF(c.matcher(str).matches());
        this.a = str;
        this.b = cls;
    }

    public static lyd a(String str) {
        return new lyd(str, Integer.class);
    }

    public static lyd b(String str) {
        return new lyd(str, String.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyd) {
            lyd lydVar = (lyd) obj;
            if (this.b == lydVar.b && this.a.equals(lydVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
