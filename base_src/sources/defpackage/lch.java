package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class lch implements lij {
    Object a = null;
    final /* synthetic */ Executor b;
    final /* synthetic */ lij c;

    public lch(Executor executor, lij lijVar) {
        this.b = executor;
        this.c = lijVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        if (obr.bc(this.a, obj)) {
            return;
        }
        this.a = obj;
        this.b.execute(new lcs(this.c, obj, 1));
    }
}
