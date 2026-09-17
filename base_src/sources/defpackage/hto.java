package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class hto implements lda {
    protected final hub a;
    protected final String b;

    public hto(hub hubVar, String str) {
        this.a = hubVar;
        this.b = str;
    }

    @Override // defpackage.lco
    public final lie a(lij lijVar, Executor executor) {
        lijVar.getClass();
        executor.getClass();
        htn htnVar = new htn(this, lijVar, executor);
        this.a.f(htnVar);
        htnVar.a(this.b);
        return htnVar;
    }

    protected abstract Object c();

    @Override // defpackage.lco
    public final Object fA() {
        Object objC = c();
        if (objC != null) {
            return objC;
        }
        String strValueOf = String.valueOf(this.b);
        throw new NullPointerException(strValueOf.length() != 0 ? "Null value for setting: ".concat(strValueOf) : new String("Null value for setting: "));
    }
}
