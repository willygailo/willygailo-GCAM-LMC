package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hoq implements Choreographer.FrameCallback {
    public final /* synthetic */ pih a;
    private final /* synthetic */ int b;

    public /* synthetic */ hoq(pih pihVar, int i) {
        this.b = i;
        this.a = pihVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.b) {
            case 0:
                pih pihVar = this.a;
                kfm kfmVar = new kfm();
                SystemClock.uptimeMillis();
                kfmVar.a = SystemClock.elapsedRealtimeNanos();
                pihVar.o(kfmVar);
                break;
            default:
                this.a.o(bxg.b);
                break;
        }
    }
}
