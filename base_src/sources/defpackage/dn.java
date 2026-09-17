package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class dn extends dp {
    private final da g;

    public dn(int i, int i2, da daVar, aax aaxVar) {
        super(i, i2, daVar.c, aaxVar);
        this.g = daVar;
    }

    @Override // defpackage.dp
    public final void a() {
        super.a();
        this.g.d();
    }

    @Override // defpackage.dp
    public final void b() {
        if (this.f == 2) {
            bu buVar = this.g.c;
            View viewFindFocus = buVar.M.findFocus();
            if (viewFindFocus != null) {
                buVar.R(viewFindFocus);
                if (cu.Q(2)) {
                    String str = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + buVar;
                }
            }
            View viewB = this.a.B();
            if (viewB.getParent() == null) {
                this.g.a();
                viewB.setAlpha(0.0f);
            }
            if (viewB.getAlpha() == 0.0f && viewB.getVisibility() == 0) {
                viewB.setVisibility(4);
            }
            br brVar = buVar.P;
            viewB.setAlpha(brVar == null ? 1.0f : brVar.l);
        }
    }
}
