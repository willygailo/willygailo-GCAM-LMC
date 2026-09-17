package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class cmm implements lie {
    public Handler a;
    private HandlerThread b;
    private lam c;
    private boolean d = false;
    private final Object e = new Object();
    private final nvb f;

    public cmm(nvb nvbVar, byte[] bArr, byte[] bArr2) {
        this.f = nvbVar;
    }

    public final lam a() {
        b();
        lam lamVar = this.c;
        lamVar.getClass();
        return lamVar;
    }

    public final void b() {
        synchronized (this.e) {
            if (this.d) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("CamcorderCameraHandler");
            this.b = handlerThread;
            handlerThread.start();
            this.a = mip.bV(this.b.getLooper());
            this.c = new lam(this.a);
            this.f.k(cms.CAPTURE_SESSION).c(this);
            this.d = true;
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.d) {
                HandlerThread handlerThread = this.b;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.b = null;
                this.a = null;
                this.c = null;
                this.d = false;
            }
        }
    }
}
