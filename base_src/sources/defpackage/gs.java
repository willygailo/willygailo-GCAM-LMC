package defpackage;

import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class gs extends gx {
    final WindowInsets a;
    el b;
    private el c;

    public gs(gy gyVar, WindowInsets windowInsets) {
        super(gyVar);
        this.c = null;
        this.a = windowInsets;
    }

    @Override // defpackage.gx
    public final el a() {
        if (this.c == null) {
            this.c = el.b(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.gx
    public gy b(int i, int i2, int i3, int i4) {
        gr grVar = new gr(gy.l(this.a));
        fx.m(gy.f(a(), i, i2, i3, i4), grVar);
        grVar.a.setStableInsets(gy.f(g(), i, i2, i3, i4).a());
        return fx.l(grVar);
    }

    @Override // defpackage.gx
    public final boolean c() {
        return this.a.isRound();
    }

    @Override // defpackage.gx
    public void d() {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // defpackage.gx
    public final void e() {
    }

    @Override // defpackage.gx
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        el elVar = ((gs) obj).b;
        return Objects.equals(null, null);
    }

    @Override // defpackage.gx
    public final void f() {
    }
}
