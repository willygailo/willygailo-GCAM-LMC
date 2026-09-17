package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fpb implements iho {
    private static final ouj c = ouj.h("com/google/android/apps/camera/microvideo/SafeJpegSaving$ScanAndResumeFailedJpegsBehavior");
    final AtomicBoolean a = new AtomicBoolean(false);
    final hql b;

    public fpb(hql hqlVar) {
        this.b = hqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.getAndSet(true)) {
                return;
            }
            hql hqlVar = this.b;
            hqlVar.b(false);
            if (hqlVar.b.k(ddl.bp)) {
                hqlVar.b(true);
            }
        } catch (Throwable th) {
            ((oug) ((oug) ((oug) c.b()).h(th)).G((char) 1833)).o("Failed to restore JPEG files");
        }
    }
}
