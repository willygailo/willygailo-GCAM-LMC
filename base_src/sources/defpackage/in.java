package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class in extends gq {
    final /* synthetic */ iy a;

    public in(iy iyVar) {
        this.a = iyVar;
    }

    @Override // defpackage.gq, defpackage.gp
    public final void b() {
        this.a.m.setAlpha(1.0f);
        this.a.p.d(null);
        this.a.p = null;
    }

    @Override // defpackage.gq, defpackage.gp
    public final void c() {
        this.a.m.setVisibility(0);
        this.a.m.sendAccessibilityEvent(32);
        if (this.a.m.getParent() instanceof View) {
            gl.D((View) this.a.m.getParent());
        }
    }
}
