package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
final class ld implements MenuItem.OnActionExpandListener {
    final /* synthetic */ lf a;
    private final MenuItem.OnActionExpandListener b;

    public ld(lf lfVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = lfVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
