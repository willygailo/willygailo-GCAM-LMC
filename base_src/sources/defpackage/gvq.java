package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
final class gvq extends mip {
    public boolean a = true;
    private volatile Long c = null;
    public volatile Long b = null;

    private final void w() {
        synchronized (this) {
            this.a = false;
            notifyAll();
        }
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        int iIntValue;
        Integer num = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE);
        if (num != null && ((iIntValue = num.intValue()) == 2 || iIntValue == 6 || iIntValue == 4 || iIntValue == 5)) {
            this.b = Long.valueOf(lzvVar.b());
            w();
            return;
        }
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            if (this.c == null) {
                this.c = l;
            }
            if (l.longValue() - this.c.longValue() > 1000000000) {
                w();
            }
        }
    }
}
