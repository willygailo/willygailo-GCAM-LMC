package defpackage;

import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* JADX INFO: loaded from: classes.dex */
final class ecc {
    public final RawWriteView a;
    public final FrameMetadata b;
    public final SpatialGainMap c;
    public final AeShotParams d;
    public final float e;

    public ecc() {
    }

    public ecc(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, AeShotParams aeShotParams, float f) {
        this.a = rawWriteView;
        this.b = frameMetadata;
        this.c = spatialGainMap;
        this.d = aeShotParams;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecc) {
            ecc eccVar = (ecc) obj;
            if (this.a.equals(eccVar.a) && this.b.equals(eccVar.b) && this.c.equals(eccVar.c) && this.d.equals(eccVar.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(eccVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ Float.floatToIntBits(this.e);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        float f = this.e;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 111 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("HdrPlusViewfinderFrame{rawWriteView=");
        sb.append(strValueOf);
        sb.append(", metadata=");
        sb.append(strValueOf2);
        sb.append(", spatialGainMap=");
        sb.append(strValueOf3);
        sb.append(", aeShotParams=");
        sb.append(strValueOf4);
        sb.append(", viewfinderTet=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
