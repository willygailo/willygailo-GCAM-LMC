package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class grq implements Runnable {
    final /* synthetic */ grr a;

    public grq(grr grrVar) {
        this.a = grrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.S(1, "api2_lost_images", null, -1, -1, 0, oom.l(), oom.l(), lju.CAMERA_ERROR_CODE_UNKNOWN, false);
    }
}
