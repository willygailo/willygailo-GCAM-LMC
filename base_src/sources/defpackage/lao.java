package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class lao implements lie {
    private final HandlerThread a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public lao(HandlerThread handlerThread) {
        this.a = handlerThread;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        Looper looper;
        if (this.b.getAndSet(true) || (looper = this.a.getLooper()) == null) {
            return;
        }
        Handler handlerBV = mip.bV(looper);
        final HandlerThread handlerThread = this.a;
        handlerBV.postDelayed(new Runnable() { // from class: lan
            @Override // java.lang.Runnable
            public final void run() {
                handlerThread.quitSafely();
            }
        }, 5000L);
    }
}
