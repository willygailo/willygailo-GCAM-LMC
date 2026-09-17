package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class ecq {
    public final InterleavedImageU8 a;
    public final edo b;
    public final HardwareBuffer c;
    public final ShotMetadata d;
    public final lic e;
    public final lzv f;
    public final long g;
    public final dzu h;
    public final eck i;
    public final pht j;
    public final gog k;
    public final hlr l;

    public ecq() {
    }

    public ecq(InterleavedImageU8 interleavedImageU8, edo edoVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, lic licVar, lzv lzvVar, long j, dzu dzuVar, eck eckVar, pht phtVar, gog gogVar, hlr hlrVar) {
        this.a = interleavedImageU8;
        this.b = edoVar;
        this.c = hardwareBuffer;
        this.d = shotMetadata;
        this.e = licVar;
        this.f = lzvVar;
        this.g = j;
        this.h = dzuVar;
        this.i = eckVar;
        this.j = phtVar;
        this.k = gogVar;
        this.l = hlrVar;
    }

    public static ecp a() {
        return new ecp();
    }

    public final lig b() {
        InterleavedImageU8 interleavedImageU8 = this.a;
        if (interleavedImageU8 != null) {
            return lig.h(interleavedImageU8.b(), interleavedImageU8.a());
        }
        edo edoVar = this.b;
        if (edoVar != null) {
            return lig.h(edoVar.c(), edoVar.b());
        }
        HardwareBuffer hardwareBuffer = this.c;
        if (hardwareBuffer != null) {
            return lig.h(hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
        }
        throw new IllegalStateException("Format is none of the known ones.");
    }

    public final ecp c() {
        return new ecp(this);
    }

    public final boolean equals(Object obj) {
        eck eckVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ecq)) {
            return false;
        }
        ecq ecqVar = (ecq) obj;
        InterleavedImageU8 interleavedImageU8 = this.a;
        if (interleavedImageU8 != null ? interleavedImageU8.equals(ecqVar.a) : ecqVar.a == null) {
            edo edoVar = this.b;
            if (edoVar != null ? edoVar.equals(ecqVar.b) : ecqVar.b == null) {
                HardwareBuffer hardwareBuffer = this.c;
                if (hardwareBuffer != null ? hardwareBuffer.equals(ecqVar.c) : ecqVar.c == null) {
                    if (this.d.equals(ecqVar.d) && this.e.equals(ecqVar.e) && this.f.equals(ecqVar.f) && this.g == ecqVar.g && this.h.equals(ecqVar.h) && ((eckVar = this.i) != null ? eckVar.equals(ecqVar.i) : ecqVar.i == null) && this.j.equals(ecqVar.j) && this.k.equals(ecqVar.k)) {
                        hlr hlrVar = this.l;
                        hlr hlrVar2 = ecqVar.l;
                        if (hlrVar != null ? hlrVar.equals(hlrVar2) : hlrVar2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        InterleavedImageU8 interleavedImageU8 = this.a;
        int iHashCode = ((interleavedImageU8 == null ? 0 : interleavedImageU8.hashCode()) ^ 1000003) * 1000003;
        edo edoVar = this.b;
        int iHashCode2 = (iHashCode ^ (edoVar == null ? 0 : edoVar.hashCode())) * 1000003;
        HardwareBuffer hardwareBuffer = this.c;
        int iHashCode3 = hardwareBuffer == null ? 0 : hardwareBuffer.hashCode();
        int iHashCode4 = this.d.hashCode();
        int iHashCode5 = this.e.hashCode();
        int iHashCode6 = this.f.hashCode();
        long j = this.g;
        int iHashCode7 = (((((((((((iHashCode2 ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.h.hashCode()) * 1000003;
        eck eckVar = this.i;
        int iHashCode8 = (((((iHashCode7 ^ (eckVar == null ? 0 : eckVar.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 583896283;
        hlr hlrVar = this.l;
        return iHashCode8 ^ (hlrVar != null ? hlrVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        long j = this.g;
        String strValueOf7 = String.valueOf(this.h);
        String strValueOf8 = String.valueOf(this.i);
        String strValueOf9 = String.valueOf(this.j);
        String strValueOf10 = String.valueOf(this.k);
        String strValueOf11 = String.valueOf((Object) null);
        String strValueOf12 = String.valueOf((Object) null);
        String strValueOf13 = String.valueOf(this.l);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        int length7 = String.valueOf(strValueOf7).length();
        int length8 = String.valueOf(strValueOf8).length();
        int length9 = String.valueOf(strValueOf9).length();
        int length10 = String.valueOf(strValueOf10).length();
        int length11 = String.valueOf(strValueOf11).length();
        StringBuilder sb = new StringBuilder(length + 279 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + String.valueOf(strValueOf12).length() + String.valueOf(strValueOf13).length());
        sb.append("PostprocessingImage{rgbImage=");
        sb.append(strValueOf);
        sb.append(", yuvImage=");
        sb.append(strValueOf2);
        sb.append(", rgbHwBufferImage=");
        sb.append(strValueOf3);
        sb.append(", shotMetadata=");
        sb.append(strValueOf4);
        sb.append(", orientation=");
        sb.append(strValueOf5);
        sb.append(", metadata=");
        sb.append(strValueOf6);
        sb.append(", timestampNs=");
        sb.append(j);
        sb.append(", gcaShotSettings=");
        sb.append(strValueOf7);
        sb.append(", portraitShotParams=");
        sb.append(strValueOf8);
        sb.append(", mergedPdData=");
        sb.append(strValueOf9);
        sb.append(", pictureTakerParameters=");
        sb.append(strValueOf10);
        sb.append(", faceMetadata=");
        sb.append(strValueOf11);
        sb.append(", warpedSegmentationMaskImage=");
        sb.append(strValueOf12);
        sb.append(", rectifaceWarpfield=");
        sb.append(strValueOf13);
        sb.append("}");
        return sb.toString();
    }
}
