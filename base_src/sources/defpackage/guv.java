package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class guv implements lyy {
    final /* synthetic */ Executor a;
    final /* synthetic */ lij b;

    public guv(Executor executor, lij lijVar) {
        this.a = executor;
        this.b = lijVar;
    }

    @Override // defpackage.lyy
    public final void h(lic licVar) {
        this.a.execute(new guu(this, licVar));
    }
}
