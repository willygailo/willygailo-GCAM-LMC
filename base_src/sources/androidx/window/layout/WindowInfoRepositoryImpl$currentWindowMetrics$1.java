package androidx.window.layout;

import defpackage.qmj;
import defpackage.qnp;

/* JADX INFO: loaded from: classes2.dex */
final class WindowInfoRepositoryImpl$currentWindowMetrics$1 extends qnp implements qmj {
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$currentWindowMetrics$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl) {
        super(0);
        this.this$0 = windowInfoRepositoryImpl;
    }

    @Override // defpackage.qmj
    public final WindowMetrics invoke() {
        return this.this$0.windowMetricsCalculator.computeCurrentWindowMetrics(this.this$0.activity);
    }
}
