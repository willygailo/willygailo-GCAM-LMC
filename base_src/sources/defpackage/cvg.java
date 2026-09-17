package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cvg {
    public final int a;
    public final int b;
    public final int c;
    public final lwd d;
    public final int e;
    public final int f;

    public cvg() {
    }

    public cvg(int i, int i2, int i3, lwd lwdVar, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = lwdVar;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cvg)) {
            return false;
        }
        cvg cvgVar = (cvg) obj;
        if (this.a == cvgVar.a && this.b == cvgVar.b && this.c == cvgVar.c && this.d.equals(cvgVar.d)) {
            int i = this.e;
            int i2 = cvgVar.e;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.f;
                int i4 = cvgVar.f;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = this.e;
        if (i == 0) {
            throw null;
        }
        int i2 = (iHashCode ^ i) * 1000003;
        int i3 = this.f;
        if (i3 != 0) {
            return i2 ^ i3;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        String strValueOf = String.valueOf(this.d);
        String strC = agq.c(this.e);
        String strD = agq.d(this.f);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 168 + strC.length() + strD.length());
        sb.append("VideoCaptureSessionMetadata{creationLatencyMs=");
        sb.append(i);
        sb.append(", sessionDurationMs=");
        sb.append(i2);
        sb.append(", numRecordedSessions=");
        sb.append(i3);
        sb.append(", cameraFacing=");
        sb.append(strValueOf);
        sb.append(", sessionState=");
        sb.append(strC);
        sb.append(", sessionSource=");
        sb.append(strD);
        sb.append("}");
        return sb.toString();
    }
}
