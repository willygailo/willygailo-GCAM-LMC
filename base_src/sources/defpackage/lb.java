package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class lb extends la implements ActionProvider.VisibilityListener {
    private ky c;

    public lb(ActionProvider actionProvider) {
        super(actionProvider);
    }

    @Override // defpackage.fh
    public final View b(MenuItem menuItem) {
        return this.b.onCreateActionView(menuItem);
    }

    @Override // defpackage.fh
    public final boolean e() {
        return this.b.isVisible();
    }

    @Override // defpackage.fh
    public final boolean g() {
        return this.b.overridesItemVisibility();
    }

    @Override // defpackage.fh
    public final void h(ky kyVar) {
        this.c = kyVar;
        this.b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ky kyVar = this.c;
        if (kyVar != null) {
            kyVar.a.j.C();
        }
    }
}
