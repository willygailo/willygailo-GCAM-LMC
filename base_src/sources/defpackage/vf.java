package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class vf {
    public final Context a;
    private final vg b;

    public vf(Context context, vg vgVar) {
        this.a = context;
        this.b = vgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return qno.c(this.a, vfVar.a) && qno.c(this.b, vfVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ')';
    }
}
