package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class lki implements lkc {
    private final pih a = pih.f();
    private final ljf b;

    public lki(ljf ljfVar) {
        this.b = ljfVar;
    }

    @Override // defpackage.lkc
    public final void a() {
        this.a.o(new lkh(2, lju.CAMERA_CLOSED_ERROR_CODE, lju.CAMERA_CLOSED_ERROR_CODE.c()));
    }

    @Override // defpackage.lkc
    public final void b() {
        this.a.o(new lkh(2, lju.CAMERA_DISCONNECTED_ERROR_CODE, lju.CAMERA_DISCONNECTED_ERROR_CODE.c()));
    }

    @Override // defpackage.lkc
    public final void c(lju ljuVar) {
        if (ljuVar == lju.CAMERA_DEVICE_ERROR_CAMERA_DISABLED) {
            this.a.o(new lkh(3, ljuVar, lju.CAMERA_DEVICE_ERROR_CAMERA_DISABLED.c()));
        }
        this.a.o(new lkh(2, ljuVar, ljuVar.c()));
    }

    @Override // defpackage.lkc
    public final void d(lzp lzpVar) {
        this.a.o(new lkh(1));
    }

    public final lkh e(long j) {
        lkh lkhVar;
        ljf ljfVar;
        this.b.e("awaitResult");
        try {
            try {
                lkhVar = (lkh) this.a.get(j, TimeUnit.MILLISECONDS);
                ljfVar = this.b;
            } catch (Throwable th) {
                this.b.f();
                throw th;
            }
        } catch (ExecutionException | TimeoutException e) {
            lkhVar = new lkh(5);
            ljfVar = this.b;
        }
        ljfVar.f();
        return lkhVar;
    }
}
