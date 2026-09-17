package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bjn implements bjm {
    final bjl a;
    private final Context b;

    public bjn(Context context, bjl bjlVar) {
        this.b = context.getApplicationContext();
        this.a = bjlVar;
    }

    @Override // defpackage.bjq
    public final void g() {
    }

    @Override // defpackage.bjq
    public final void h() {
        bkc.a(this.b).b(this.a);
    }

    @Override // defpackage.bjq
    public final void i() {
        bkc.a(this.b).c(this.a);
    }
}
