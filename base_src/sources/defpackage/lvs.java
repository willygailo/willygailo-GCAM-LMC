package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class lvs {
    public final String a;
    public final int b;
    private final Integer c;

    private lvs(Integer num, String str) {
        this.c = num;
        this.a = str;
        this.b = Objects.hash(str, 0);
    }

    public static lvs b(String str) {
        Integer numValueOf;
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            numValueOf = null;
        }
        return new lvs(numValueOf, str);
    }

    public final int a() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        String strValueOf = String.valueOf(this.a);
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Attempted to access a camera id that is not supported on legacy camera API's: ".concat(strValueOf) : new String("Attempted to access a camera id that is not supported on legacy camera API's: "));
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((lvs) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
