package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class eox {
    public final hdv a;
    public final edd b;
    public final AtomicBoolean c;
    public final epb d;

    public eox() {
    }

    public eox(hdv hdvVar, edd eddVar, AtomicBoolean atomicBoolean, epb epbVar) {
        this.a = hdvVar;
        if (eddVar == null) {
            throw new NullPointerException("Null gcamShot");
        }
        this.b = eddVar;
        this.c = atomicBoolean;
        this.d = epbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eox) {
            eox eoxVar = (eox) obj;
            if (this.a.equals(eoxVar.a) && this.b.equals(eoxVar.b) && this.c.equals(eoxVar.c) && this.d.equals(eoxVar.d)) {
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
        int length3 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceListItemSmall + length2 + length3 + String.valueOf(strValueOf4).length());
        sb.append("AstrolapseInflightShot{hdrPlusParallelInflightShot=");
        sb.append(strValueOf);
        sb.append(", gcamShot=");
        sb.append(strValueOf2);
        sb.append(", processingInitiated=");
        sb.append(strValueOf3);
        sb.append(", astrolapseSession=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
