package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mbb {
    public final mak a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final maw e;
    public final oom f;

    public mbb() {
    }

    public mbb(mak makVar, Set set, Set set2, Set set3, maw mawVar, oom oomVar) {
        this.a = makVar;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = mawVar;
        this.f = oomVar;
    }

    public static mba a() {
        return new mba();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mbb)) {
            return false;
        }
        mbb mbbVar = (mbb) obj;
        mak makVar = this.a;
        if (makVar != null ? makVar.equals(mbbVar.a) : mbbVar.a == null) {
            if (this.b.equals(mbbVar.b) && this.c.equals(mbbVar.c) && this.d.equals(mbbVar.d) && this.e.equals(mbbVar.e) && obr.an(this.f, mbbVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        mak makVar = this.a;
        return (((((((((((makVar == null ? 0 : makVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int length4 = String.valueOf(strValueOf4).length();
        int length5 = String.valueOf(strValueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMajor + length2 + length3 + length4 + length5 + String.valueOf(strValueOf6).length());
        sb.append("PublishInfo{primaryMediaFile=");
        sb.append(strValueOf);
        sb.append(", publicMediaFiles=");
        sb.append(strValueOf2);
        sb.append(", privateMediaFiles=");
        sb.append(strValueOf3);
        sb.append(", cachedMediaFiles=");
        sb.append(strValueOf4);
        sb.append(", mediaGroupInfoBuilder=");
        sb.append(strValueOf5);
        sb.append(", listeners=");
        sb.append(strValueOf6);
        sb.append("}");
        return sb.toString();
    }
}
