package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class qal implements qak {
    public static final ngi a;
    public static final ngi b;
    public static final ngi c;

    static {
        ngn ngnVarE = new ngn("com.google.android.libraries.performance.primes").d().e();
        a = ngnVarE.b("45359218", true);
        b = ngnVarE.b("45359255", false);
        c = ngnVarE.b("36", true);
    }

    @Override // defpackage.qak
    public final boolean a(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.qak
    public final boolean b(Context context) {
        return ((Boolean) b.b(context)).booleanValue();
    }

    @Override // defpackage.qak
    public final boolean c(Context context) {
        return ((Boolean) c.b(context)).booleanValue();
    }
}
