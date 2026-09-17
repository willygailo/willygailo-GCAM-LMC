package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gpo implements gig {
    public static final /* synthetic */ gpo a = new gpo(0);
    private final /* synthetic */ int b;

    public /* synthetic */ gpo(int i) {
        this.b = i;
    }

    @Override // defpackage.gig
    public final boolean a(lzv lzvVar) {
        switch (this.b) {
            case 0:
                return (lzvVar == null || lzvVar.g().isEmpty()) ? false : true;
            default:
                if (lzvVar != null) {
                    Integer num = (Integer) lzvVar.d(CaptureResult.CONTROL_AE_STATE);
                    Integer num2 = (Integer) lzvVar.d(CaptureResult.CONTROL_AF_STATE);
                    if (num != null && num2 != null && !Objects.equals(0, num) && !Objects.equals(5, num) && !Objects.equals(3, num2)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
