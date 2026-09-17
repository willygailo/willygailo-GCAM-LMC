package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hbw extends mip {
    public final lce a;
    private final Executor b;
    private final Map c = obr.ab(2);

    public hbw(lce lceVar, Executor executor) {
        this.a = lceVar;
        this.b = executor;
    }

    @Override // defpackage.mip
    public final synchronized void b(lzv lzvVar) {
        final String str = (String) lzvVar.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str != null) {
            this.c.put(str, lzvVar);
            if (!str.equals(this.a.d)) {
                this.b.execute(new Runnable() { // from class: hbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        hbw hbwVar = this.a;
                        hbwVar.a.fB(str);
                    }
                });
            }
        }
    }
}
