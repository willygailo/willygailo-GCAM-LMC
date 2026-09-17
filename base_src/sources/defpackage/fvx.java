package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fvx {
    public final lvs a;
    public final lwd b;
    public final lig c;
    public final jnl d;
    private final lhs e;

    public fvx() {
    }

    public fvx(lvs lvsVar, lwd lwdVar, lhs lhsVar, lig ligVar, jnl jnlVar) {
        this.a = lvsVar;
        this.b = lwdVar;
        this.e = lhsVar;
        this.c = ligVar;
        this.d = jnlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fvx) {
            fvx fvxVar = (fvx) obj;
            if (this.a.equals(fvxVar.a) && this.b.equals(fvxVar.b) && this.e.equals(fvxVar.e) && this.c.equals(fvxVar.c) && this.d.equals(fvxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.b ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.c);
        String strValueOf5 = String.valueOf(this.d);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + 92 + length2 + length3 + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length());
        sb.append("OneModeConfig{cameraId=");
        sb.append(strValueOf);
        sb.append(", cameraFacing=");
        sb.append(strValueOf2);
        sb.append(", aspectRatio=");
        sb.append(strValueOf3);
        sb.append(", captureResolution=");
        sb.append(strValueOf4);
        sb.append(", viewfinderConfig=");
        sb.append(strValueOf5);
        sb.append("}");
        return sb.toString();
    }
}
