package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;

/* JADX INFO: loaded from: classes.dex */
final class cti implements jem {
    final /* synthetic */ ctl a;

    public cti(ctl ctlVar) {
        this.a = ctlVar;
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
        jrl jrlVar = (jrl) modeSlider.f(modeSlider.a()).a;
        ctl ctlVar = this.a;
        jrlVar.getClass();
        if (ctlVar.l(jrlVar)) {
            this.a.i(jrlVar);
        } else if (z) {
            this.a.a();
        }
    }

    @Override // defpackage.jem
    public final void c(boolean z) {
        if (z) {
            ctl ctlVar = this.a;
            ctlVar.b.setClickable(false);
            ctlVar.g.l(false);
            ctlVar.h.F(false);
            ctlVar.d.g(2);
        }
    }
}
