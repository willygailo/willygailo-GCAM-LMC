package defpackage;

import com.Fix.IsoTime;

/* JADX INFO: loaded from: classes3.dex */
public final class leh {
    public final lea a;
    public final leb b;
    public final ldz c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    private final int h;

    public leh() {
    }

    public leh(lea leaVar, leb lebVar, int i, ldz ldzVar, int i2, int i3, int i4, int i5) {
        if (leaVar == null) {
            throw new NullPointerException("Null videoFileFormat");
        }
        this.a = leaVar;
        if (lebVar == null) {
            throw new NullPointerException("Null videoResolution");
        }
        this.b = lebVar;
        int bitrate = IsoTime.getBitrate();
        this.h = bitrate > 0 ? bitrate : i;
        if (ldzVar == null) {
            throw new NullPointerException("Null camcorderCaptureRate");
        }
        this.c = ldzVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final int a() {
        return this.c.i;
    }

    public final int b() {
        return this.c.g() ? this.h : this.h / this.c.a();
    }

    public final int c() {
        return this.c.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof leh) {
            leh lehVar = (leh) obj;
            if (this.a.equals(lehVar.a) && this.b.equals(lehVar.b) && this.h == lehVar.h && this.c.equals(lehVar.c) && this.d == lehVar.d && this.e == lehVar.e && this.f == lehVar.f && this.g == lehVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("camcorderVideoFileFormat", this.a);
        ojbVarAZ.b("camcorderVideoResolution", this.b);
        ojbVarAZ.e("videoCaptureBitRate", this.h);
        ojbVarAZ.e("videoCaptureFrameRate", a());
        ojbVarAZ.e("videoEncoder", this.d);
        ojbVarAZ.e("videoEncodingFrameRate", c());
        ojbVarAZ.e("videoKeyFrameInterval", this.g);
        return ojbVarAZ.toString();
    }
}
