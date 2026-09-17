package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hkn implements Comparable, lie {
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final ojc p;
    public final ojc q;
    public final ojc r;

    public hkn(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, boolean z2, ojc ojcVar, ojc ojcVar2, ojc ojcVar3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = z;
        this.o = z2;
        this.p = ojcVar;
        this.q = ojcVar2;
        this.r = ojcVar3;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.a > ((hkn) obj).a ? 1 : (this.a == ((hkn) obj).a ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkn)) {
            return false;
        }
        hkn hknVar = (hkn) obj;
        return this.a == hknVar.a && Float.compare(hknVar.b, this.b) == 0 && Float.compare(hknVar.c, this.c) == 0 && Float.compare(hknVar.d, this.d) == 0 && Float.compare(hknVar.e, this.e) == 0 && Float.compare(hknVar.f, this.f) == 0 && Float.compare(hknVar.g, this.g) == 0 && Float.compare(hknVar.h, this.h) == 0 && Float.compare(hknVar.i, this.i) == 0 && Float.compare(hknVar.j, this.j) == 0 && Float.compare(hknVar.k, this.k) == 0 && Float.compare(hknVar.l, this.l) == 0 && Float.compare(hknVar.m, this.m) == 0 && fcy.o(hknVar.n, this.n) == 0 && fcy.o(hknVar.o, this.o) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Float.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o));
    }

    public final String toString() {
        long j = this.a;
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        float f5 = this.f;
        float f6 = this.g;
        float f7 = this.h;
        float f8 = this.i;
        float f9 = this.j;
        float f10 = this.k;
        float f11 = this.l;
        float f12 = this.m;
        boolean z = this.n;
        boolean z2 = this.o;
        String string = this.p.g() ? this.p.toString() : "unavailable";
        String string2 = this.q.g() ? this.q.toString() : "unavailable";
        String string3 = this.r.g() ? this.r.toString() : "unavailable";
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 583 + String.valueOf(string2).length() + String.valueOf(string3).length());
        sb.append("FrameQualityScore{timestampNs=");
        sb.append(j);
        sb.append(", topShotScore=");
        sb.append(f);
        sb.append(", autoExposureStability=");
        sb.append(f2);
        sb.append(", autoFocusStability=");
        sb.append(f3);
        sb.append(", autoWhiteBalanceStability=");
        sb.append(f4);
        sb.append(", faceCount=");
        sb.append(f5);
        sb.append(", facePosition=");
        sb.append(f6);
        sb.append(", faceQuality=");
        sb.append(f7);
        sb.append(", globalMotionSharpness=");
        sb.append(f8);
        sb.append(", lensStability=");
        sb.append(f9);
        sb.append(", subjectMotion=");
        sb.append(f10);
        sb.append(", straightness=");
        sb.append(f11);
        sb.append(", aesthetic=");
        sb.append(f12);
        sb.append(", shouldSkipUnscoredFaceFrame=");
        sb.append(z);
        sb.append(", shouldSkipUnscoredNonfaceFrame=");
        sb.append(z2);
        sb.append(", smartCaptureFrameQualityScore=");
        sb.append(string);
        sb.append(", cameraPose=");
        sb.append(string2);
        sb.append(", aestheticEmbeddings=");
        sb.append(string3);
        sb.append('}');
        return sb.toString();
    }
}
