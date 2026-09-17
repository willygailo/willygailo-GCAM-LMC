package defpackage;

import android.media.CamcorderProfile;
import com.Helper;

/* JADX INFO: loaded from: classes3.dex */
public final class les {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public les() {
    }

    public les(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        if (Helper.sFront == 0 && 30 == i12) {
            i12 = 60;
        }
        this.l = i12;
        this.m = i13;
    }

    public static ler a(CamcorderProfile camcorderProfile) {
        ler lerVar = new ler();
        lerVar.b(camcorderProfile.audioBitRate);
        lerVar.c(camcorderProfile.audioChannels);
        lerVar.d(camcorderProfile.audioCodec);
        lerVar.e(camcorderProfile.audioSampleRate);
        lerVar.f(camcorderProfile.fileFormat);
        lerVar.g(camcorderProfile.quality);
        lerVar.h(camcorderProfile.videoBitRate);
        lerVar.i(camcorderProfile.videoCodec);
        lerVar.k(-1);
        lerVar.j(-1);
        lerVar.l(camcorderProfile.videoFrameHeight);
        lerVar.m(camcorderProfile.videoFrameRate);
        lerVar.n(camcorderProfile.videoFrameWidth);
        return lerVar;
    }

    public static ler b(les lesVar) {
        ler lerVar = new ler();
        lerVar.b(lesVar.a);
        lerVar.c(lesVar.b);
        lerVar.d(lesVar.c);
        lerVar.e(lesVar.d);
        lerVar.f(lesVar.e);
        lerVar.g(lesVar.f);
        lerVar.h(lesVar.g);
        lerVar.i(lesVar.h);
        lerVar.k(lesVar.i);
        lerVar.j(lesVar.j);
        lerVar.l(lesVar.k);
        lerVar.m(lesVar.l);
        lerVar.n(lesVar.m);
        return lerVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof les) {
            les lesVar = (les) obj;
            if (this.a == lesVar.a && this.b == lesVar.b && this.c == lesVar.c && this.d == lesVar.d && this.e == lesVar.e && this.f == lesVar.f && this.g == lesVar.g && this.h == lesVar.h && this.i == lesVar.i && this.j == lesVar.j && this.k == lesVar.k && this.l == lesVar.l && this.m == lesVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        int i11 = this.k;
        int i12 = this.l;
        int i13 = this.m;
        StringBuilder sb = new StringBuilder(375);
        sb.append("SimpleCamcorderProfileProxy{audioBitRate=");
        sb.append(i);
        sb.append(", audioChannels=");
        sb.append(i2);
        sb.append(", audioCodec=");
        sb.append(i3);
        sb.append(", audioSampleRate=");
        sb.append(i4);
        sb.append(", fileFormat=");
        sb.append(i5);
        sb.append(", quality=");
        sb.append(i6);
        sb.append(", videoBitRate=");
        sb.append(i7);
        sb.append(", videoCodec=");
        sb.append(i8);
        sb.append(", videoCodecProfile=");
        sb.append(i9);
        sb.append(", videoCodecLevel=");
        sb.append(i10);
        sb.append(", videoFrameHeight=");
        sb.append(i11);
        sb.append(", videoFrameRate=");
        sb.append(i12);
        sb.append(", videoFrameWidth=");
        sb.append(i13);
        sb.append("}");
        return sb.toString();
    }
}
