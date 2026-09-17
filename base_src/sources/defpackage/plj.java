package defpackage;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;

/* JADX INFO: loaded from: classes2.dex */
public final class plj {
    public final RawWriteView a;
    public final FrameMetadata b;
    public final SpatialGainMap c;
    public final Runnable d;

    public plj() {
    }

    public plj(RawWriteView rawWriteView, FrameMetadata frameMetadata, SpatialGainMap spatialGainMap, Runnable runnable) {
        this.a = rawWriteView;
        this.b = frameMetadata;
        this.c = spatialGainMap;
        this.d = runnable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plj) {
            plj pljVar = (plj) obj;
            if (this.a.equals(pljVar.a) && this.b.equals(pljVar.b) && this.c.equals(pljVar.c) && this.d.equals(pljVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + String.valueOf(strValueOf3).length() + String.valueOf(strValueOf4).length());
        sb.append("HdrPlusFrame{rawWriteView=");
        sb.append(strValueOf);
        sb.append(", frameMetadata=");
        sb.append(strValueOf2);
        sb.append(", spatialGainMap=");
        sb.append(strValueOf3);
        sb.append(", closeCallback=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
