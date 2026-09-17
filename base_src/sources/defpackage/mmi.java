package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class mmi implements mnf {
    final /* synthetic */ mtw a;

    public mmi(mtw mtwVar) {
        this.a = mtwVar;
    }

    @Override // defpackage.mnf
    public final /* bridge */ /* synthetic */ mnb a(Object obj, Executor executor) {
        return this.a.a().c(executor, mip.ah((mnc) obj), mip.aj());
    }
}
