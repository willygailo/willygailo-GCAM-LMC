package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class kkd {
    public final kjg a;
    public final khk b;

    public kkd(kjg kjgVar, khk khkVar) {
        this.a = kjgVar;
        this.b = khkVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof kkd)) {
            kkd kkdVar = (kkd) obj;
            if (mip.dx(this.a, kkdVar.a) && mip.dx(this.b, kkdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mip.dz("key", this.a, arrayList);
        mip.dz("feature", this.b, arrayList);
        return mip.dy(arrayList, this);
    }
}
