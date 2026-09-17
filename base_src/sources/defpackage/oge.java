package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oge implements Runnable {
    private final /* synthetic */ int g;
    public static final oge f = new oge(8);
    public static final /* synthetic */ oge e = new oge(6);
    public static final /* synthetic */ oge d = new oge(5);
    public static final /* synthetic */ oge c = new oge(4);
    public static final /* synthetic */ oge b = new oge(1);
    public static final /* synthetic */ oge a = new oge(0);

    public /* synthetic */ oge(int i) {
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.g) {
            case 0:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 1:
                GLES20.glFlush();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                ArrayList arrayList = new ArrayList(qja.d.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i);
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        qja.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            default:
                return;
        }
    }
}
