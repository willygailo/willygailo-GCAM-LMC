package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
public final class ejm {
    public final lvp a;
    public final ejx b;
    public final ddf c;
    private final lvs d;

    public ejm(lvq lvqVar, ddf ddfVar) {
        this.c = ddfVar;
        lvs lvsVarE = lvqVar.e(lwd.BACK);
        obr.ao(lvsVarE);
        this.d = lvsVarE;
        lvp lvpVarA = lvqVar.a(lvsVarE);
        this.a = lvpVarA;
        ejx ejxVar = new ejx();
        lig ligVarC = leb.RES_1080P.c();
        ejxVar.a = ligVarC.a;
        ejxVar.b = ligVarC.b;
        ejxVar.e = false;
        ejxVar.c = lvpVarA.f();
        SizeF sizeF = (SizeF) lvpVarA.l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        obr.ao(sizeF);
        ejxVar.d = (((float[]) obr.ao((float[]) lvpVarA.l(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)))[0] * 36.0f) / sizeF.getWidth();
        this.b = ejxVar;
    }

    public final double a() {
        float f = this.b.d;
        double dAtan = Math.atan(36.0f / (f + f));
        return Math.toDegrees(dAtan + dAtan);
    }
}
