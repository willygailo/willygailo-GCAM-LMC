package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;

/* JADX INFO: loaded from: classes.dex */
final class era implements jem {
    final /* synthetic */ erb a;

    public era(erb erbVar) {
        this.a = erbVar;
    }

    @Override // defpackage.jem
    public final void a(View view, int i, boolean z) {
        if (z) {
            jty.e(view);
        }
    }

    @Override // defpackage.jem
    public final void b(View view, boolean z) {
        ModeSlider modeSlider = (ModeSlider) view;
        esn esnVar = (esn) modeSlider.f(modeSlider.a()).a;
        lda ldaVar = this.a.a;
        esnVar.getClass();
        ldaVar.fB(Integer.valueOf(esnVar.ordinal()));
    }

    @Override // defpackage.jem
    public final void c(boolean z) {
    }
}
