package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class brr implements oiu {
    private final /* synthetic */ int a;

    public brr(int i) {
        this.a = i;
    }

    @Override // defpackage.oiu
    public final /* synthetic */ Object a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (list == null || list.size() == 0) {
                    return 0;
                }
                return Integer.valueOf(Math.max(((Integer) ore.a.f(list)).intValue(), 0));
            case 1:
                return Integer.valueOf(((hkc) obj).h);
            case 2:
                ggp ggpVar = (ggp) obj;
                return Boolean.valueOf((ggpVar.b.a != hkc.CONTINUOUS_PICTURE || ggpVar.b.b == hkd.FOCUSED_LOCKED || ggpVar.b.b == hkd.NOT_FOCUSED_LOCKED) ? false : true);
            case 3:
                return ((Boolean) obj).booleanValue() ? fcy.i(CaptureRequest.CONTROL_AF_TRIGGER, 1) : fcy.l();
            case 4:
                ArrayList arrayList = new ArrayList();
                for (lzv lzvVar : (List) obj) {
                    ojb ojbVarBa = obr.ba("Metadata");
                    ojbVarBa.b("timestamp", lzvVar.d(CaptureResult.SENSOR_TIMESTAMP));
                    ojbVarBa.b("NR", lzvVar.d(CaptureResult.NOISE_REDUCTION_MODE));
                    ojbVarBa.b("EDGE", lzvVar.d(CaptureResult.EDGE_MODE));
                    ojbVarBa.b("REEF", lzvVar.d(CaptureResult.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR));
                    ojbVarBa.b("Jpeg Qual", lzvVar.d(CaptureResult.JPEG_QUALITY));
                    arrayList.add(ojbVarBa.toString());
                }
                return arrayList.toString();
            case 5:
                return ((goy) obj).a();
            case 6:
                return ((goy) obj).b();
            case 7:
                return Short.valueOf(((lmb) obj).i);
            case 8:
                return mlt.a;
            case 9:
                return ((Iterable) obj).iterator();
            default:
                CharSequence charSequence = (CharSequence) obj;
                pfb pfbVarC = pfc.c(charSequence.length());
                for (int i = 0; i < charSequence.length(); i++) {
                    pfbVarC.b(Character.toLowerCase(charSequence.charAt(i)));
                }
                return pfbVarC.a();
        }
    }
}
