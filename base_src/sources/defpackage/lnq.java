package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lnq {
    public final CaptureRequest.Key a;
    public final Object b;

    public lnq(CaptureRequest.Key key, Object obj) {
        key.getClass();
        this.a = key;
        obj.getClass();
        this.b = obj;
    }

    public final String a() {
        return this.a.getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lnq)) {
            return false;
        }
        lnq lnqVar = (lnq) obj;
        return obr.bc(this.a.getName(), lnqVar.a.getName()) && obr.bc(this.b, lnqVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getName(), this.b});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s: %s", this.a.getName(), this.b);
    }
}
