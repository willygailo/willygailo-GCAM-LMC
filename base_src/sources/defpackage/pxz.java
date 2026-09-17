package defpackage;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pxz implements Runnable {
    public final /* synthetic */ ControllerServiceBridge a;
    public final /* synthetic */ int b;
    public final /* synthetic */ pxx c;
    private final /* synthetic */ int d;

    public /* synthetic */ pxz(ControllerServiceBridge controllerServiceBridge, int i, pxx pxxVar, int i2) {
        this.d = i2;
        this.a = controllerServiceBridge;
        this.b = i;
        this.c = pxxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.a.c(this.b, this.c);
                break;
            default:
                this.a.c(this.b, this.c);
                break;
        }
    }
}
