package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class wg extends qnp implements qmj {
    public static final wg a = new wg(2);
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(int i) {
        super(0);
        this.b = i;
    }

    @Override // defpackage.qmj
    public final /* synthetic */ Object invoke() {
        switch (this.b) {
            case 0:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera2-H");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 1:
                return Executors.newFixedThreadPool(1, new abp(1));
            default:
                return qks.a;
        }
    }
}
