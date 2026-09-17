package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lln extends lzt {
    final /* synthetic */ lzp a;
    final /* synthetic */ llo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lln(llo lloVar, lzp lzpVar, lzp lzpVar2) {
        super(lzpVar);
        this.b = lloVar;
        this.a = lzpVar2;
    }

    @Override // defpackage.lzt, defpackage.lzp, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.b.a();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a.b());
        return strValueOf.length() != 0 ? "Virtual Camera ".concat(strValueOf) : new String("Virtual Camera ");
    }
}
