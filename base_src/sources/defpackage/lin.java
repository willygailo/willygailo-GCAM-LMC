package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class lin implements lis, lir {
    private final String a;
    private final lim b;

    public lin(String str, lim limVar) {
        this.a = str;
        this.b = limVar;
    }

    @Override // defpackage.lis, defpackage.lir
    public final lis a(String str) {
        lim limVar = this.b;
        String str2 = limVar.a;
        String strValueOf = String.valueOf(str);
        String strConcat = strValueOf.length() != 0 ? str2.concat(strValueOf) : new String(str2);
        int length = str.length();
        int i = limVar.b;
        if (length <= i) {
            return limVar.a(strConcat);
        }
        lin linVarA = limVar.a(strConcat.substring(0, i + limVar.a.length()));
        int length2 = str.length();
        int i2 = limVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
        sb.append("Tag ");
        sb.append(str);
        sb.append(" is ");
        sb.append(length2 - i2);
        sb.append(" chars longer than limit.");
        linVarA.h(sb.toString());
        return linVarA;
    }

    @Override // defpackage.lis
    public final void b(String str) {
        this.b.b(this.a, 3);
    }

    @Override // defpackage.lis
    public final void c(String str, Throwable th) {
        this.b.b(this.a, 3);
    }

    @Override // defpackage.lis
    public final void d(String str) {
        if (this.b.b(this.a, 6)) {
            Log.e(this.a, str);
        }
    }

    @Override // defpackage.lis
    public final void e(String str, Throwable th) {
        if (this.b.b(this.a, 6)) {
            Log.e(this.a, str, th);
        }
    }

    @Override // defpackage.lis
    public final void f(String str) {
        this.b.b(this.a, 4);
    }

    @Override // defpackage.lis
    public final void g(String str) {
        this.b.b(this.a, 2);
    }

    @Override // defpackage.lis
    public final void h(String str) {
        if (this.b.b(this.a, 5)) {
            Log.w(this.a, str);
        }
    }

    @Override // defpackage.lis
    public final void i(String str, Throwable th) {
        if (this.b.b(this.a, 5)) {
            Log.w(this.a, str, th);
        }
    }
}
