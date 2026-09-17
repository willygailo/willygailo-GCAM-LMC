package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
final class le implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ lf a;
    private final MenuItem.OnMenuItemClickListener b;

    public le(lf lfVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = lfVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
