package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public final class cdh {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public cdh() {
    }

    public cdh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdh) {
            cdh cdhVar = (cdh) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(cdhVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cdhVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cdhVar.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cdhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sb = new StringBuilder(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        sb.append("FaceFeatures{width=");
        sb.append(f);
        sb.append(", height=");
        sb.append(f2);
        sb.append(", centerX=");
        sb.append(f3);
        sb.append(", centerY=");
        sb.append(f4);
        sb.append("}");
        return sb.toString();
    }
}
