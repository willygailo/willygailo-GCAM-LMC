package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class bi extends bj {
    private final boolean c;
    private boolean d;
    private bz e;

    public bi(dp dpVar, aax aaxVar, boolean z) {
        super(dpVar, aaxVar);
        this.d = false;
        this.c = z;
    }

    final bz a(Context context) {
        if (this.d) {
            return this.e;
        }
        dp dpVar = this.a;
        bz bzVarE = d.e(context, dpVar.a, dpVar.e == 2, this.c);
        this.e = bzVarE;
        this.d = true;
        return bzVarE;
    }
}
