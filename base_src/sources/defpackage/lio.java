package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lio implements Executor {
    public static final /* synthetic */ lio a = new lio(0);
    private final /* synthetic */ int b;

    public /* synthetic */ lio(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                Logger logger = lip.a;
                break;
            default:
                ((uv) ut.f().b).b.execute(runnable);
                break;
        }
    }
}
