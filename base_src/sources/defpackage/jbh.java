package defpackage;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoRepository;
import androidx.window.layout.WindowLayoutInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class jbh implements fik, fii, fij {
    public final lda a = new lce(mip.eE());
    private final lar b;
    private final WindowInfoRepositoryCallbackAdapter c;
    private fb d;

    public jbh(Activity activity, lar larVar) {
        this.b = larVar;
        this.c = new WindowInfoRepositoryCallbackAdapter(WindowInfoRepository.CC.getOrCreate(activity));
    }

    @Override // defpackage.fij
    public final void e() {
        fb fbVar = this.d;
        if (fbVar != null) {
            this.c.removeWindowLayoutInfoListener(fbVar);
        }
    }

    @Override // defpackage.fii
    public final void fW() {
        fb fbVar = new fb() { // from class: jbg
            /* JADX WARN: Code duplicated, block: B:16:0x0062  */
            @Override // defpackage.fb
            public final void accept(Object obj) {
                jbf jbfVarEE;
                jbh jbhVar = this.a;
                ooh oohVarE = oom.e();
                for (DisplayFeature displayFeature : ((WindowLayoutInfo) obj).getDisplayFeatures()) {
                    if (displayFeature instanceof FoldingFeature) {
                        oohVarE.g((FoldingFeature) displayFeature);
                    }
                }
                oom oomVarF = oohVarE.f();
                if (((orr) oomVarF).c == 1) {
                    FoldingFeature foldingFeature = (FoldingFeature) oomVarF.get(0);
                    if (FoldingFeature.State.FLAT == foldingFeature.getState()) {
                        jbfVarEE = new jbf(3, oih.a);
                    } else if (FoldingFeature.State.HALF_OPENED == foldingFeature.getState()) {
                        jbfVarEE = new jbf(2, ojc.i(foldingFeature.getBounds()));
                    } else {
                        jbfVarEE = mip.eE();
                    }
                } else {
                    jbfVarEE = mip.eE();
                }
                jbhVar.a.fB(jbfVarEE);
            }
        };
        this.d = fbVar;
        this.c.addWindowLayoutInfoListener(this.b, fbVar);
    }
}
