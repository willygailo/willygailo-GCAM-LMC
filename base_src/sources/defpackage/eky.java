package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class eky {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/video/VideoRecorder");
    public final eku b;
    public final ekr c;
    public final Looper d;
    public final ekx e;
    public boolean f = false;
    public final AtomicInteger g = new AtomicInteger(0);

    public eky(eku ekuVar, ekr ekrVar) {
        this.b = ekuVar;
        this.c = ekrVar;
        HandlerThread handlerThread = new HandlerThread("VideoRecorderThread");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.d = looper;
        this.e = new ekx(this, looper);
    }

    public final int a() {
        return this.g.get();
    }
}
