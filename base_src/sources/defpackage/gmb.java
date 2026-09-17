package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gmb {
    public final gmf a;
    private final gls b;
    private final ghx c;

    public gmb(ghx ghxVar, gmf gmfVar, gls glsVar) {
        this.c = ghxVar;
        this.a = gmfVar;
        this.b = glsVar;
    }

    public final boolean a() {
        return e(Integer.class, CaptureResult.EDGE_MODE, 0, ope.J(1, 2, 3), ope.H(2));
    }

    public final boolean b() {
        return !this.a.a().c(CaptureResult.FLASH_STATE, 3, 4);
    }

    public final boolean c() {
        return this.b.b.size() == 1;
    }

    public final boolean d() {
        return e(Integer.class, CaptureResult.NOISE_REDUCTION_MODE, 0, ope.J(2, 1, 4), ope.H(2));
    }

    public final boolean e(Class cls, CaptureResult.Key key, Object obj, Set set, Set set2) {
        gmf gmfVar = this.a;
        boolean z = !(gmfVar.b().h.size() == 0);
        return (!z && gmfVar.a().c(key, ohh.y(set, cls))) || (z && gmfVar.a().b(key, obj) && gmfVar.b().c(key, ohh.y(set2, cls))) || (z && gmfVar.a().c(key, ohh.y(set, cls)) && gmfVar.b().b(key, obj));
    }

    public final boolean f(glw... glwVarArr) {
        return Arrays.asList(glwVarArr).contains(this.b.a);
    }

    public final boolean g(Integer... numArr) {
        return Arrays.asList(numArr).contains(this.c.l(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL));
    }
}
