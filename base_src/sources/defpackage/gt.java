package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
class gt extends gs {
    private el c;

    public gt(gy gyVar, WindowInsets windowInsets) {
        super(gyVar, windowInsets);
        this.c = null;
    }

    @Override // defpackage.gx
    public final el g() {
        if (this.c == null) {
            this.c = el.b(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.gx
    public final gy h() {
        return gy.l(this.a.consumeStableInsets());
    }

    @Override // defpackage.gx
    public final gy i() {
        return gy.l(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.gx
    public final boolean j() {
        return this.a.isConsumed();
    }
}
