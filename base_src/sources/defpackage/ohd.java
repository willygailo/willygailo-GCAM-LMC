package defpackage;

import j$.util.Optional;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class ohd {
    public final Optional a;
    public final Optional b;
    public final phv c;
    public final Path d;
    public final int e;
    public final float f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    private final int k;

    public ohd() {
    }

    public ohd(int i, int i2, Optional optional, Optional optional2, phv phvVar, Path path, int i3, float f, boolean z, int i4) {
        this.h = i;
        this.i = i2;
        this.j = 1;
        this.a = optional;
        this.b = optional2;
        this.c = phvVar;
        this.d = path;
        this.e = i3;
        this.f = f;
        this.g = z;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ohd)) {
            return false;
        }
        ohd ohdVar = (ohd) obj;
        int i = this.h;
        int i2 = ohdVar.h;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.i;
            int i4 = ohdVar.i;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4) {
                int i5 = this.j;
                int i6 = ohdVar.j;
                if (i5 == 0) {
                    throw null;
                }
                if (i6 == 1 && this.a.equals(ohdVar.a) && this.b.equals(ohdVar.b) && this.c.equals(ohdVar.c) && this.d.equals(ohdVar.d) && this.e == ohdVar.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(ohdVar.f) && this.g == ohdVar.g) {
                    int i7 = this.k;
                    int i8 = ohdVar.k;
                    if (i7 == 0) {
                        throw null;
                    }
                    if (i8 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        int i2 = (i ^ 1000003) * 1000003;
        int i3 = this.i;
        if (i3 == 0) {
            throw null;
        }
        int i4 = (i2 ^ i3) * 1000003;
        if (this.j == 0) {
            throw null;
        }
        int iHashCode = (((((((((((((((i4 ^ 1) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (this.k != 0) {
            return iHashCode ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4 = "null";
        switch (this.h) {
            case 1:
                str = "REALTIME";
                break;
            case 2:
                str = "BATCH";
                break;
            default:
                str = "null";
                break;
        }
        switch (this.i) {
            case 1:
                str2 = "INPUT_STREAM";
                break;
            case 2:
                str2 = "DIRECT";
                break;
            default:
                str2 = "null";
                break;
        }
        switch (this.j) {
            case 1:
                str3 = "CALLBACK";
                break;
            default:
                str3 = "null";
                break;
        }
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        int i = this.e;
        float f = this.f;
        boolean z = this.g;
        switch (this.k) {
            case 1:
                str4 = "ANDROID";
                break;
        }
        int length = str.length();
        int length2 = str2.length();
        int length3 = str3.length();
        int length4 = String.valueOf(strValueOf).length();
        int length5 = String.valueOf(strValueOf2).length();
        int length6 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + 270 + length2 + length3 + length4 + length5 + length6 + String.valueOf(strValueOf4).length() + str4.length());
        sb.append("SpeechEnhancerParams{speechEnhancerMode=");
        sb.append(str);
        sb.append(", rawAudioInterfaceType=");
        sb.append(str2);
        sb.append(", processedAudioInterfaceType=");
        sb.append(str3);
        sb.append(", callback=");
        sb.append(strValueOf);
        sb.append(", rawAudioInputStream=");
        sb.append(strValueOf2);
        sb.append(", listeningExecutorService=");
        sb.append(strValueOf3);
        sb.append(", modelDirectory=");
        sb.append(strValueOf4);
        sb.append(", numberOfChannels=");
        sb.append(i);
        sb.append(", sampleRate=");
        sb.append(f);
        sb.append(", skipInitGoogle=");
        sb.append(z);
        sb.append(", environmentType=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
