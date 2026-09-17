package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cfg implements lhc {
    private static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/CamcorderDeviceCallbackImpl");
    private final dlt b;

    public cfg(dlt dltVar) {
        this.b = dltVar;
    }

    @Override // defpackage.lhc
    public final void a() {
        ((oug) ((oug) a.b()).G((char) 332)).o("onMediaRecorderError");
        this.b.i();
    }
}
