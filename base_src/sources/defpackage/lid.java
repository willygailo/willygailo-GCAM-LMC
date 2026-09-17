package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lid {
    public final long a;
    public final long b;

    public lid(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public lid(lid lidVar) {
        this.a = lidVar.a;
        this.b = lidVar.b;
    }

    public static String b(lid[] lidVarArr) {
        if (lidVarArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = lidVarArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(lidVarArr[i].a);
            sb.append("/");
            sb.append(lidVarArr[i].b);
            if (i != length - 1) {
                sb.append(",");
            }
            i++;
        }
    }

    public final double a() {
        double d = this.a;
        double d2 = this.b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof lid) {
            lid lidVar = (lid) obj;
            if (this.a == lidVar.a && this.b == lidVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(41);
        sb.append(j);
        sb.append("/");
        sb.append(j2);
        return sb.toString();
    }
}
