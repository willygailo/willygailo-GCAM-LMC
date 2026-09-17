package defpackage;

import j$.util.Optional;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ohy {
    public final ByteBuffer a;
    public final int b;
    public final int c;
    public final ohl d;
    public final int e;
    public final Optional f;
    private final Optional g;

    public ohy() {
    }

    public ohy(ByteBuffer byteBuffer, int i, int i2, ohl ohlVar, int i3, Optional optional, Optional optional2) {
        this.a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = ohlVar;
        this.e = i3;
        this.g = optional;
        this.f = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohy) {
            ohy ohyVar = (ohy) obj;
            if (this.a.equals(ohyVar.a) && this.b == ohyVar.b && this.c == ohyVar.c && this.d.equals(ohyVar.d) && this.e == ohyVar.e && this.g.equals(ohyVar.g) && this.f.equals(ohyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        String strValueOf2 = String.valueOf(this.d);
        int i3 = this.e;
        String strValueOf3 = String.valueOf(this.g);
        String strValueOf4 = String.valueOf(this.f);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 150 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("VideoFrame{imageBuffer=");
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
