package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class bhu implements azv {
    private final bim a;
    private final bcv b;

    public bhu(bim bimVar, bcv bcvVar) {
        this.a = bimVar;
        this.b = bcvVar;
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        bcl bclVarC = this.a.c((Uri) obj);
        if (bclVarC == null) {
            return null;
        }
        return bhg.a(this.b, ((bik) bclVarC).c(), i, i2);
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ boolean b(Object obj, azt aztVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
