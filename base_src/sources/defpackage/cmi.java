package defpackage;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class cmi extends mip {
    private final cpb a;

    public cmi(lfj lfjVar) {
        this.a = new cpb(lfjVar);
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        cpb cpbVar = this.a;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null) {
            if (cpa.FPS_30.a(l.longValue()) && cpbVar.b != cpa.FPS_30) {
                cpbVar.b = cpa.FPS_30;
                cpbVar.a.q(cpbVar.b.c);
            } else {
                if (!cpa.FPS_60.a(l.longValue()) || cpbVar.b == cpa.FPS_60) {
                    return;
                }
                cpbVar.b = cpa.FPS_60;
                cpbVar.a.q(cpbVar.b.c);
            }
        }
    }
}
