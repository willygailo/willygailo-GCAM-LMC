package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lkn implements lhx {
    final /* synthetic */ lks a;

    public lkn(lks lksVar) {
        this.a = lksVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lhx
    public final /* synthetic */ Object a(Object obj) {
        boolean z = false;
        if (obj.L()) {
            lks lksVar = this.a;
            Iterator it = ((lvo) obj).b.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) ((lvo) lksVar.a.a((lvs) it.next())).n(CameraCharacteristics.SENSOR_INFO_COLOR_FILTER_ARRANGEMENT);
                if (num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 3 || num.intValue() == 4) {
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
