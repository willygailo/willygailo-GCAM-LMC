package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* JADX INFO: loaded from: classes2.dex */
public final class lbd {
    private static final lbb e = lbb.a;
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    private final lbb f;

    public lbd() {
    }

    public lbd(int i, String str, int i2, boolean z, lbb lbbVar) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.f = lbbVar;
    }

    public static lbc a() {
        lbc lbcVar = new lbc();
        lbcVar.c = e;
        lbcVar.b(0);
        lbcVar.b = true;
        return lbcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbd) {
            lbd lbdVar = (lbd) obj;
            if (this.a == lbdVar.a && this.b.equals(lbdVar.b) && this.c == lbdVar.c && this.d == lbdVar.d && this.f.equals(lbdVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.c;
        boolean z = this.d;
        String strValueOf = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + ScriptIntrinsicBLAS.UNIT + String.valueOf(strValueOf).length());
        sb.append("NamedExecutorOptions{threadCount=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", androidThreadPriority=");
        sb.append(i2);
        sb.append(", propagateErrors=");
        sb.append(z);
        sb.append(", threadBodyDecorator=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
