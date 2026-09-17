package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxa {
    public final iap a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public hxa() {
    }

    public hxa(iap iapVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = iapVar;
        this.f = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    static hwz a(iap iapVar) {
        hwz hwzVar = new hwz();
        hwzVar.a = iapVar;
        hwzVar.f(1);
        hwzVar.b(false);
        hwzVar.d(false);
        hwzVar.c(false);
        hwzVar.e(false);
        return hwzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hxa)) {
            return false;
        }
        hxa hxaVar = (hxa) obj;
        if (this.a.equals(hxaVar.a)) {
            int i = this.f;
            int i2 = hxaVar.f;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.b == hxaVar.b && this.c == hxaVar.c && this.d == hxaVar.d && this.e == hxaVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.f;
        if (i != 0) {
            return ((((((((iHashCode ^ i) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
        }
        throw null;
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.a);
        switch (this.f) {
            case 1:
                str = "HIDE";
                break;
            case 2:
                str = "ZOOMING";
                break;
            case 3:
                str = "RESTING";
                break;
            case 4:
                str = "SLIDING";
                break;
            case 5:
                str = "CONTINUOUS_ZOOM";
                break;
            case 6:
                str = "DOUBLE_TAP_ZOOM";
                break;
            default:
                str = "null";
                break;
        }
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 151 + str.length());
        sb.append("SmartChipCharacteristics{entry=");
        sb.append(strValueOf);
        sb.append(", zoomUiMode=");
        sb.append(str);
        sb.append(", isLayoutUpdate=");
        sb.append(z);
        sb.append(", isZoomInViewfinder=");
        sb.append(z2);
        sb.append(", isVideoControlUiVisible=");
        sb.append(z3);
        sb.append(", isZoomToggleEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
