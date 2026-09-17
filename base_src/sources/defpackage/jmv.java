package defpackage;

import android.view.WindowManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jmv extends jmt {
    private static final ouj a = ouj.h("com/google/android/apps/camera/ui/viewfinder/LowResViewfinderSizeSelector");
    private static final lig b = lig.h(480, 320);
    private static final lig c = lig.h(480, 320);
    private final lvq d;

    public jmv(WindowManager windowManager, ddf ddfVar, lvq lvqVar) {
        super(windowManager, ddfVar);
        this.d = lvqVar;
    }

    @Override // defpackage.jmt, defpackage.jni
    public final lig b(List list, double d, lwd lwdVar, jrl jrlVar, lvs lvsVar) {
        lig ligVar;
        if (jrlVar == jrl.PHOTO) {
            try {
                lig ligVar2 = gsf.a(this.d.a(lvsVar), a(list, d), 34).b;
                if (lhs.b.k(lhs.h(ligVar2))) {
                    ligVar = c;
                } else {
                    obr.aF(lhs.a.k(lhs.h(ligVar2)));
                    ligVar = b;
                }
                if (list.contains(ligVar)) {
                    return ligVar;
                }
            } catch (gse e) {
                ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3445)).r("selectViewfinderSize: cameraId=%s", lvsVar);
            }
        }
        return super.b(list, d, lwdVar, jrlVar, lvsVar);
    }
}
