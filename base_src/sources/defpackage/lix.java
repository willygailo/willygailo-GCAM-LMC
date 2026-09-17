package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lix implements lis {
    private final lis a;
    private final String b;

    private lix(lis lisVar, String str) {
        this.a = lisVar;
        this.b = str;
    }

    public static lix j(String str, lis lisVar) {
        return new lix(lisVar, str);
    }

    @Override // defpackage.lis, defpackage.lir
    public final lis a(String str) {
        return new lix(this.a.a(str), this.b);
    }

    @Override // defpackage.lis
    public final void b(String str) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.b(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    @Override // defpackage.lis
    public final void c(String str, Throwable th) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.c(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
    }

    @Override // defpackage.lis
    public final void d(String str) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.d(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    @Override // defpackage.lis
    public final void e(String str, Throwable th) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.e(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
    }

    @Override // defpackage.lis
    public final void f(String str) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.f(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    @Override // defpackage.lis
    public final void g(String str) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.g(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    @Override // defpackage.lis
    public final void h(String str) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.h(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    @Override // defpackage.lis
    public final void i(String str, Throwable th) {
        lis lisVar = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(str);
        lisVar.i(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), th);
    }
}
