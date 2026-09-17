package defpackage;

import android.graphics.PointF;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class chq implements lij {
    final /* synthetic */ chv a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    public chq(chv chvVar) {
        this.a = chvVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        PointF pointF = (PointF) obj;
        if (this.b.compareAndSet(true, false)) {
            return;
        }
        this.a.g(pointF, false);
    }
}
