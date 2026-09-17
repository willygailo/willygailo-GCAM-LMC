package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ihm {
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final ohl d;
    public final int e;
    public final ojc f;
    public final ojc g;

    public ihm() {
    }

    public ihm(ByteBuffer byteBuffer, int i, int i2, ohl ohlVar, int i3, ojc ojcVar, ojc ojcVar2) {
        this.a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = ohlVar;
        this.e = i3;
        this.f = ojcVar;
        this.g = ojcVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ihm) {
            ihm ihmVar = (ihm) obj;
            if (this.a.equals(ihmVar.a) && this.b == ihmVar.b && this.c == ihmVar.c && this.d.equals(ihmVar.d) && this.e == ihmVar.e && this.f.equals(ihmVar.f) && this.g.equals(ihmVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        String strValueOf2 = String.valueOf(this.d);
        int i3 = this.e;
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.g);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 154 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("VideoFrameInfo{imageBuffer=");
        sb.append(strValueOf);
        sb.append(", widthPixels=");
        sb.append(i);
        sb.append(", heightPixels=");
        sb.append(i2);
        sb.append(", colorspace=");
        sb.append(strValueOf2);
        sb.append(", rotationDegrees=");
        sb.append(i3);
        sb.append(", syncedAudioSampleNumber=");
        sb.append(strValueOf3);
        sb.append(", face=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
