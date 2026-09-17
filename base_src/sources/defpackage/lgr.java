package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lgr implements Runnable {
    public final /* synthetic */ lgt a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgr(lgt lgtVar, int i) {
        this.b = i;
        this.a = lgtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                try {
                    this.a.c.stop();
                } catch (RuntimeException e) {
                    Log.w("VideoEncoder", "MediaCodec could not stop.", e);
                    return;
                }
                break;
            case 1:
                this.a.i.quitSafely();
                break;
            default:
                this.a.h.o(null);
                break;
        }
    }
}
