package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hbr extends mip {
    private final lvq a;
    private final lvp b;
    private final jth c;
    private final hbq d;

    public hbr(lvq lvqVar, lvp lvpVar, jth jthVar, hbq hbqVar) {
        this.a = lvqVar;
        this.b = lvpVar;
        this.c = jthVar;
        this.d = hbqVar;
    }

    @Override // defpackage.mip
    public final synchronized void b(lzv lzvVar) {
        int length;
        float f;
        lvs lvsVarD;
        if (kdb.b == null) {
            return;
        }
        float[] fArr = (float[]) lzvVar.d(kdb.b);
        if (fArr != null && (length = fArr.length) >= 13) {
            float f2 = fArr[11];
            float f3 = fArr[12];
            if (length > 16) {
                f = fArr[16];
            } else {
                f = length > 15 ? fArr[15] : 0.0f;
            }
            lvp lvpVarA = this.b;
            Map mapG = lzvVar.g();
            if (((orw) mapG).c == 1) {
                String strE = ((lzr) Collection.EL.stream(((oor) mapG).values()).findFirst().get()).e();
                if (strE != null && (lvsVarD = this.a.d(strE)) != null) {
                    lvpVarA = this.a.a(lvsVarD);
                }
            } else {
                lvpVarA = this.c.a((String) lzvVar.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID));
            }
            this.d.i(lvpVarA, f2, f3, f);
        }
    }
}
