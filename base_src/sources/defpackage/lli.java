package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lli implements Runnable {
    public final /* synthetic */ lkc a;
    private final /* synthetic */ int b;

    public /* synthetic */ lli(lkc lkcVar, int i) {
        this.b = i;
        this.a = lkcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            default:
                this.a.c(lju.CAMERA_NO_WAKELOCK_ERROR_CODE);
                break;
        }
    }
}
