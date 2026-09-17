package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mmm implements mmn {
    private final mnf a;

    public mmm(mnf mnfVar) {
        this.a = mnfVar;
    }

    @Override // defpackage.mmn
    public final void a(Object obj, Executor executor, moa moaVar) {
        plk.af(this.a.a(obj, executor).d(), new mml(moaVar), pgr.INSTANCE);
    }

    public final String toString() {
        return this.a.toString();
    }
}
