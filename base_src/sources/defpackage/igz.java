package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
public final class igz {
    public final int a;
    public final int b;
    public final double c;
    public final int d;

    public igz() {
    }

    public igz(int i, int i2, double d, int i3) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof igz)) {
            return false;
        }
        igz igzVar = (igz) obj;
        if (this.a == igzVar.a && this.b == igzVar.b && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(igzVar.c)) {
            int i = this.d;
            int i2 = igzVar.d;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iDoubleToLongBits = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003;
        int i = this.d;
        if (i != 0) {
            return iDoubleToLongBits ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.a;
        int i2 = this.b;
        double d = this.c;
        switch (this.d) {
            case 1:
                str = "AUDIO_VISUAL";
                break;
            case 2:
                str = "AUDIO_ONLY";
                break;
            default:
                str = "null";
                break;
        }
        StringBuilder sb = new StringBuilder(str.length() + R.styleable.AppCompatTheme_windowMinWidthMinor);
        sb.append("CocktailPartyConfig{sampleRate=");
        sb.append(i);
        sb.append(", numberOfChannels=");
        sb.append(i2);
        sb.append(", noiseFraction=");
        sb.append(d);
        sb.append(", inputType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
