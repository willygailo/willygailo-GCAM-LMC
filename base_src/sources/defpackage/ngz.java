package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ngz {
    public final int a;
    public final nhi b;
    private final String c;

    public ngz(int i, String str, nhi nhiVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (str == null) {
            throw null;
        }
        this.a = i;
        this.c = str;
        this.b = nhiVar;
    }

    public final int a() {
        return this.a + this.c.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ngz)) {
            return false;
        }
        ngz ngzVar = (ngz) obj;
        return this.c.equals(ngzVar.c) && this.a == ngzVar.a && this.b.equals(ngzVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.b});
    }

    public final String toString() {
        return "PhoneNumberMatch [" + this.a + "," + a() + ") " + this.c;
    }
}
