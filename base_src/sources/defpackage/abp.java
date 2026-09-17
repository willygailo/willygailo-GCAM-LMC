package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class abp implements ThreadFactory {
    private final /* synthetic */ int c;
    public static final /* synthetic */ abp b = new abp(3);
    public static final /* synthetic */ abp a = new abp(2);

    public abp(int i) {
        this.c = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.c) {
            case 0:
                return new abo(runnable);
            case 1:
                return new wf(runnable);
            case 2:
                return new Thread(runnable, "LensSvConn");
            default:
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
