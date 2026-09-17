package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class qit extends qbt {
    private static final qiw b = new qiw("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory a = b;

    @Override // defpackage.qbt
    public final qbs a() {
        return new qiu(this.a);
    }
}
