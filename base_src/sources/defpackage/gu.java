package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class gu extends gt {
    public gu(gy gyVar, WindowInsets windowInsets) {
        super(gyVar, windowInsets);
    }

    @Override // defpackage.gs, defpackage.gx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        if (Objects.equals(this.a, guVar.a)) {
            el elVar = guVar.b;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gx
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.gx
    public final fl k() {
        DisplayCutout displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new fl(displayCutout);
    }

    @Override // defpackage.gx
    public final gy l() {
        return gy.l(this.a.consumeDisplayCutout());
    }
}
