package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwm {
    public final fvx a;
    public final fwh b;

    public fwm() {
    }

    public fwm(fvx fvxVar, fwh fwhVar) {
        if (fvxVar == null) {
            throw new NullPointerException("Null config");
        }
        this.a = fvxVar;
        this.b = fwhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fwm) {
            fwm fwmVar = (fwm) obj;
            if (this.a.equals(fwmVar.a) && this.b.equals(fwmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 38 + String.valueOf(strValueOf2).length());
        sb.append("CaptureOneCameraRequest{config=");
        sb.append(strValueOf);
        sb.append(", key=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
