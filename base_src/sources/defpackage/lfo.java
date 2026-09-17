package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lfo implements Runnable {
    public final /* synthetic */ lfy a;
    private final /* synthetic */ int b;

    public /* synthetic */ lfo(lfy lfyVar, int i) {
        this.b = i;
        this.a = lfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                lfy lfyVar = this.a;
                lfyVar.c.shutdown();
                lfyVar.b.shutdown();
                lfyVar.a.shutdown();
                lfyVar.d.shutdown();
                try {
                    lfyVar.c.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    lfyVar.b.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    lfyVar.a.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                    lfyVar.d.awaitTermination(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Log.e("AudioEncoder", "Interrupted while waiting for executors to terminate.", e);
                }
                try {
                    lfyVar.i.stop();
                } catch (RuntimeException e2) {
                    Log.w("AudioEncoder", "MediaCodec could not stop.", e2);
                    return;
                }
                break;
            default:
                this.a.M.quitSafely();
                break;
        }
    }
}
