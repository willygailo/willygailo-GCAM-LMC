package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class la extends fh {
    final ActionProvider b;

    public la(ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // defpackage.fh
    public final View a() {
        return this.b.onCreateActionView();
    }

    @Override // defpackage.fh
    public final void c(SubMenu subMenu) {
        this.b.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.fh
    public final boolean d() {
        return this.b.hasSubMenu();
    }

    @Override // defpackage.fh
    public final boolean f() {
        return this.b.onPerformDefaultAction();
    }
}
