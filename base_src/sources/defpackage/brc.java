package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class brc {
    private static final ouj a = ouj.h("com/google/android/apps/camera/activity/util/ActivityFinishWithReason");
    private final WeakReference b;
    private final lar c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public brc(WeakReference weakReference, lar larVar) {
        this.b = weakReference;
        this.c = larVar;
    }

    public final void a(String str) {
        lar.a();
        obr.aF(!oje.d(str));
        Activity activity = (Activity) this.b.get();
        if (activity == null || this.d.getAndSet(true)) {
            return;
        }
        ((oug) ((oug) a.c()).G('4')).r("WARNING: Activity was artificially finished: %s", str);
        this.c.execute(new dwb(activity, 1));
    }
}
