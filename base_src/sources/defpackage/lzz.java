package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lzz {
    public final int a;
    public final List b;
    public final Executor c;
    public final lzn d;
    public final lzq e;

    public lzz() {
    }

    public lzz(int i, List list, Executor executor, lzn lznVar, lzq lzqVar) {
        this.a = i;
        this.b = list;
        this.c = executor;
        this.d = lznVar;
        this.e = lzqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzz) {
            lzz lzzVar = (lzz) obj;
            if (this.a == lzzVar.a && this.b.equals(lzzVar.b) && this.c.equals(lzzVar.c) && this.d.equals(lzzVar.d) && this.e.equals(lzzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.e);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowFixedHeightMajor + length2 + length3 + String.valueOf(strValueOf4).length());
        sb.append("SessionConfigurationProxy{sessionType=");
        sb.append(i);
        sb.append(", outputConfigurations=");
        sb.append(strValueOf);
        sb.append(", executor=");
        sb.append(strValueOf2);
        sb.append(", stateCallback=");
        sb.append(strValueOf3);
        sb.append(", sessionParameters=");
        sb.append(strValueOf4);
        sb.append("}");
        return sb.toString();
    }
}
