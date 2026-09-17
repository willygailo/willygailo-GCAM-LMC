package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwh {
    private final lvs a;
    private final lig b;

    public fwh() {
    }

    public fwh(lvs lvsVar, lig ligVar) {
        if (lvsVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.a = lvsVar;
        if (ligVar == null) {
            throw new NullPointerException("Null viewfinderSize");
        }
        this.b = ligVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fwh) {
            fwh fwhVar = (fwh) obj;
            if (this.a.equals(fwhVar.a) && this.b.equals(fwhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.b ^ 1000003) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf((Object) null);
        String strValueOf3 = String.valueOf(this.b);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("CaptureModuleCameraKey{cameraId=");
        sb.append(strValueOf);
        sb.append(", hdrPlusMode=");
        sb.append(strValueOf2);
        sb.append(", viewfinderSize=");
        sb.append(strValueOf3);
        sb.append("}");
        return sb.toString();
    }
}
