package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gio extends ldl {
    private final ghx a;

    public gio(ghx ghxVar, gqs gqsVar, lco lcoVar) {
        super(lcv.b(gqsVar, lcoVar));
        this.a = ghxVar;
        ((int[]) ghxVar.l(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)).getClass();
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        gqt gqtVar = (gqt) ((List) obj).get(0);
        if (gqtVar != gqt.ON) {
            return (gqtVar == gqt.AUTO && this.a.I()) ? 2 : 1;
        }
        if (this.a.I()) {
            return 3;
        }
        int[] iArr = (int[]) this.a.m(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, ghx.c);
        int length = iArr.length;
        for (int i = 0; i < length && iArr[i] != 5; i++) {
        }
        return 1;
    }
}
