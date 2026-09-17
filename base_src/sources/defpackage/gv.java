package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
class gv extends gu {
    private el c;

    public gv(gy gyVar, WindowInsets windowInsets) {
        super(gyVar, windowInsets);
        this.c = null;
    }

    @Override // defpackage.gs, defpackage.gx
    public final gy b(int i, int i2, int i3, int i4) {
        return gy.l(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.gx
    public final el m() {
        if (this.c == null) {
            Insets mandatorySystemGestureInsets = this.a.getMandatorySystemGestureInsets();
            this.c = el.b(mandatorySystemGestureInsets.left, mandatorySystemGestureInsets.top, mandatorySystemGestureInsets.right, mandatorySystemGestureInsets.bottom);
        }
        return this.c;
    }
}
