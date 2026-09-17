package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ls extends kw implements SubMenu {
    public final kw j;
    public final kz k;

    public ls(Context context, kw kwVar, kz kzVar) {
        super(context);
        this.j = kwVar;
        this.k = kzVar;
    }

    @Override // defpackage.kw
    public final kw a() {
        return this.j.a();
    }

    @Override // defpackage.kw
    public final String d() {
        int i = this.k.a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.k;
    }

    @Override // defpackage.kw
    public final void p(ku kuVar) {
        this.j.p(kuVar);
    }

    @Override // defpackage.kw, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.j.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.k.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.k.setIcon(drawable);
        return this;
    }

    @Override // defpackage.kw, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.j.setQwertyMode(z);
    }

    @Override // defpackage.kw
    public final boolean t(kz kzVar) {
        return this.j.t(kzVar);
    }

    @Override // defpackage.kw
    public final boolean u(kw kwVar, MenuItem menuItem) {
        return super.u(kwVar, menuItem) || this.j.u(kwVar, menuItem);
    }

    @Override // defpackage.kw
    public final boolean v(kz kzVar) {
        return this.j.v(kzVar);
    }

    @Override // defpackage.kw
    public final boolean w() {
        return this.j.w();
    }

    @Override // defpackage.kw
    public final boolean x() {
        return this.j.x();
    }

    @Override // defpackage.kw
    public final boolean y() {
        return this.j.y();
    }
}
