package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class iii implements iho {
    public static final ouj a = ouj.h("com/google/android/apps/camera/stats/CameraActivitySettlementDetector");
    public static final long b = TimeUnit.MILLISECONDS.toNanos(30);
    public final List c = new ArrayList();
    public final pih d = pih.f();
    private final lar e;

    public iii(lar larVar) {
        this.e = larVar;
    }

    public final void a() {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: iig
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                iii iiiVar = this.a;
                iiiVar.c.add(Long.valueOf(j));
                if (iiiVar.c.size() > 100) {
                    ((oug) ((oug) iii.a.c()).G((char) 2936)).o("Never reached the steady state.");
                    iiiVar.d.a(new TimeoutException("Never reached the steady state."));
                    return;
                }
                int i = 0;
                int i2 = 0;
                while (i < iiiVar.c.size() - 1) {
                    int i3 = i + 1;
                    i2 = ((Long) iiiVar.c.get(i3)).longValue() - ((Long) iiiVar.c.get(i)).longValue() < iii.b ? i2 + 1 : 0;
                    i = i3;
                }
                if (i2 >= 10) {
                    iiiVar.d.o(null);
                } else {
                    iiiVar.a();
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.execute(new Runnable() { // from class: iih
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
    }
}
