package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
final class io extends gq {
    final /* synthetic */ ip a;

    public io(ip ipVar) {
        this.a = ipVar;
    }

    @Override // defpackage.gq, defpackage.gp
    public final void b() {
        this.a.a.m.setVisibility(8);
        iy iyVar = this.a.a;
        PopupWindow popupWindow = iyVar.n;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (iyVar.m.getParent() instanceof View) {
            gl.D((View) this.a.a.m.getParent());
        }
        this.a.a.m.i();
        this.a.a.p.d(null);
        iy iyVar2 = this.a.a;
        iyVar2.p = null;
        gl.D(iyVar2.s);
    }
}
