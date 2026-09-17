package defpackage;

import java.util.UUID;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class erv {
    public final UUID a;
    public final hdv b;
    public final edd c;
    public final AtomicBoolean d;
    public final Phaser e;
    public final lie f;
    public final esn g;
    public final AtomicReference h;

    public erv() {
    }

    public erv(UUID uuid, hdv hdvVar, edd eddVar, AtomicBoolean atomicBoolean, Phaser phaser, lie lieVar, esn esnVar, AtomicReference atomicReference) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.a = uuid;
        this.b = hdvVar;
        if (eddVar == null) {
            throw new NullPointerException("Null gcamShot");
        }
        this.c = eddVar;
        this.d = atomicBoolean;
        this.e = phaser;
        this.f = lieVar;
        if (esnVar == null) {
            throw new NullPointerException("Null shotType");
        }
        this.g = esnVar;
        this.h = atomicReference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof erv) {
            erv ervVar = (erv) obj;
            if (this.a.equals(ervVar.a) && this.b.equals(ervVar.b) && this.c.equals(ervVar.c) && this.d.equals(ervVar.d) && this.e.equals(ervVar.e) && this.f.equals(ervVar.f) && this.g.equals(ervVar.g) && this.h.equals(ervVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        String strValueOf8 = String.valueOf(this.h);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        int length6 = String.valueOf(strValueOf6).length();
        StringBuilder sb = new StringBuilder(length + 145 + length2 + length3 + length4 + length5 + length6 + String.valueOf(strValueOf7).length() + String.valueOf(strValueOf8).length());
        sb.append("MotionBlurInflightShot{uuid=");
        sb.append(strValueOf);
        sb.append(", hdrPlusParallelInflightShot=");
        sb.append(strValueOf2);
        sb.append(", gcamShot=");
        sb.append(strValueOf3);
        sb.append(", atLeastOneImage=");
        sb.append(strValueOf4);
        sb.append(", imagesToArrive=");
        sb.append(strValueOf5);
        sb.append(", shotLock=");
        sb.append(strValueOf6);
        sb.append(", shotType=");
        sb.append(strValueOf7);
        sb.append(", thumbnailBitmap=");
        sb.append(strValueOf8);
        sb.append("}");
        return sb.toString();
    }
}
