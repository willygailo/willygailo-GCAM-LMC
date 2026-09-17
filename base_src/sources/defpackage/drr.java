package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
public final class drr implements dqs {
    public Rect a;
    public brg b;
    public final dsg c;

    public drr(dsg dsgVar) {
        this.c = dsgVar;
    }

    public final synchronized void a(lvp lvpVar, brg brgVar) {
        Rect rect = (Rect) lvpVar.l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        this.a = rect;
        this.b = brgVar;
    }

    @Override // defpackage.dqs
    public final void b(lmr lmrVar, lnx lnxVar) {
        lmr lmrVarA = lmrVar.a();
        if (lmrVarA != null) {
            lmrVarA.j(new drq(this, lmrVarA, lnxVar));
        }
    }
}
