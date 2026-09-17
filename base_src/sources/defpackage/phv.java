package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public interface phv extends ExecutorService {
    pht a(Runnable runnable);

    pht b(Callable callable);

    pht c(Runnable runnable, Object obj);
}
