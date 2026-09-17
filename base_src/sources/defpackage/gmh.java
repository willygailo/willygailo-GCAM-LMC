package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gmh implements glr {
    final /* synthetic */ gmc a;
    private final /* synthetic */ int b;

    public gmh(gmc gmcVar, int i) {
        this.b = i;
        this.a = gmcVar;
    }

    public /* synthetic */ gmh(gmc gmcVar, int i, byte[] bArr) {
        this.b = i;
        this.a = gmcVar;
    }

    @Override // defpackage.glr
    public final gmi a(gls glsVar) {
        switch (this.b) {
            case 0:
                gmb gmbVarA = this.a.a(glsVar);
                ArrayList arrayList = new ArrayList();
                fcy.g("legacy", gmbVarA.g(2), arrayList);
                return fcy.f("legacy", arrayList);
            case 1:
                gmc gmcVar = this.a;
                gmb gmbVarA2 = gmcVar.a(glsVar);
                ArrayList arrayList2 = new ArrayList();
                fcy.g("single image", gmbVarA2.c(), arrayList2);
                fcy.g("limited or full", gmbVarA2.g(0, 1, 3), arrayList2);
                fcy.g("hw jpeg, sw jpeg, reprocessing", gmbVarA2.f(glw.HW_JPEG, glw.SW_JPEG, glw.REPROCESSING), arrayList2);
                fcy.g("flash fired", gmbVarA2.a.a().b(CaptureResult.FLASH_STATE, 3), arrayList2);
                fcy.g("edge", gmbVarA2.a(), arrayList2);
                fcy.g("noise reduction", gmbVarA2.d(), arrayList2);
                fcy.g("af converged", gmbVarA2.a.a().c(CaptureResult.CONTROL_AF_STATE, 2, 6, 0, 4, 5), arrayList2);
                int[] iArr = (int[]) gmcVar.a.l(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
                if (iArr != null && iArr.length > 1) {
                    fcy.g("aberration", gmbVarA2.e(Integer.class, CaptureResult.COLOR_CORRECTION_ABERRATION_MODE, 0, ope.I(1, 2), ope.I(1, 2)), arrayList2);
                }
                return fcy.f("flash", arrayList2);
            case 2:
                gmb gmbVarA3 = this.a.a(glsVar);
                ArrayList arrayList3 = new ArrayList();
                fcy.g("single image", gmbVarA3.c(), arrayList3);
                fcy.g("limited or full", gmbVarA3.g(0, 1, 3), arrayList3);
                fcy.g("hw_jpeg, sw_jpeg, reprocessing", gmbVarA3.f(glw.HW_JPEG, glw.SW_JPEG, glw.REPROCESSING), arrayList3);
                fcy.g("flash off", gmbVarA3.b(), arrayList3);
                fcy.g("edge", gmbVarA3.a(), arrayList3);
                fcy.g("noise reduction", gmbVarA3.d(), arrayList3);
                return fcy.f("regular", arrayList3);
            default:
                gmb gmbVarA4 = this.a.a(glsVar);
                ArrayList arrayList4 = new ArrayList();
                fcy.g("single image", gmbVarA4.c(), arrayList4);
                fcy.g("limited or full", gmbVarA4.g(0, 1), arrayList4);
                fcy.g("processing method", gmbVarA4.f(glw.NPF_REPROCESSING), arrayList4);
                fcy.g("flash off", gmbVarA4.b(), arrayList4);
                return fcy.f("npf reprocessing", arrayList4);
        }
    }
}
