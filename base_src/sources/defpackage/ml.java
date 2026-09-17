package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class ml implements ku {
    final /* synthetic */ ActionMenuView a;

    public ml(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.ku
    public final void C(kw kwVar) {
        ku kuVar = this.a.d;
        if (kuVar != null) {
            kuVar.C(kwVar);
        }
    }

    @Override // defpackage.ku
    public final boolean E(kw kwVar, MenuItem menuItem) {
        jd jdVar;
        ro roVar = this.a.e;
        return (roVar == null || (jdVar = roVar.a.z) == null || !jdVar.a.c.onMenuItemSelected(0, menuItem)) ? false : true;
    }
}
