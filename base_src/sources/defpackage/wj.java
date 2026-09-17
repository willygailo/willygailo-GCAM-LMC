package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class wj implements ThreadFactory {
    final /* synthetic */ qpc a;
    private final /* synthetic */ int b;

    public wj(qpc qpcVar, int i) {
        this.b = i;
        this.a = qpcVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.b) {
            case 0:
                return new wi(this.a, runnable);
            default:
                return new wh(this.a, runnable);
        }
    }
}
