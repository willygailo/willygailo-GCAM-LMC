package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iav {
    public final String a;
    public final ope b;
    public final ope c;
    public final boolean d;
    public final boolean e;
    public final lda f;
    public final ojc g;
    public final ojc h;
    public final int i;

    public iav() {
    }

    public iav(String str, ope opeVar, ope opeVar2, boolean z, boolean z2, lda ldaVar, int i, ojc ojcVar, ojc ojcVar2) {
        this.a = str;
        this.b = opeVar;
        this.c = opeVar2;
        this.d = z;
        this.e = z2;
        this.f = ldaVar;
        this.i = i;
        this.g = ojcVar;
        this.h = ojcVar2;
    }

    public static iau a() {
        iau iauVar = new iau(null);
        iauVar.a = "UnknownSmartsProcessor";
        iauVar.e(true);
        iauVar.f(true);
        iauVar.d(lcz.a(true));
        iauVar.d = 4;
        iauVar.b = oih.a;
        iauVar.c = oih.a;
        return iauVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iav)) {
            return false;
        }
        iav iavVar = (iav) obj;
        if (this.a.equals(iavVar.a) && this.b.equals(iavVar.b) && this.c.equals(iavVar.c) && this.d == iavVar.d && this.e == iavVar.e && this.f.equals(iavVar.f)) {
            int i = this.i;
            int i2 = iavVar.i;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.g.equals(iavVar.g) && this.h.equals(iavVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        int i = this.i;
        if (i != 0) {
            return ((((iHashCode ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
        }
        throw null;
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        String strValueOf3 = String.valueOf(this.f);
        switch (this.i) {
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "STATUS_UPDATE_STICKY";
                break;
            case 3:
                str = "FRAMING_HINT";
                break;
            case 4:
                str = "SUGGESTION";
                break;
            default:
                str = "null";
                break;
        }
        String strValueOf4 = String.valueOf(this.g);
        String strValueOf5 = String.valueOf(this.h);
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = str.length();
        StringBuilder sb = new StringBuilder(length + 215 + length2 + length3 + length4 + length5 + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length());
        sb.append("SmartsProcessorOptions{name=");
        sb.append(str2);
        sb.append(", activeModes=");
        sb.append(strValueOf);
        sb.append(", activeCameraFacing=");
        sb.append(strValueOf2);
        sb.append(", shouldPauseDuringCapture=");
        sb.append(z);
        sb.append(", shouldPauseWhenTimerActive=");
        sb.append(z2);
        sb.append(", externalToggle=");
        sb.append(strValueOf3);
        sb.append(", notificationPriority=");
        sb.append(str);
        sb.append(", smartsCaptureListener=");
        sb.append(strValueOf4);
        sb.append(", registrationThread=");
        sb.append(strValueOf5);
        sb.append("}");
        return sb.toString();
    }
}
