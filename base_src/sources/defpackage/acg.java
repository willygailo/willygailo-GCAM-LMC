package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
final class acg {
    private final Choreographer b = Choreographer.getInstance();
    public final Looper a = Looper.myLooper();

    public final void a(final Runnable runnable) {
        this.b.postFrameCallback(new Choreographer.FrameCallback() { // from class: acf
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
