package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class irs {
    public final iqn a;

    public irs() {
    }

    public irs(iqn iqnVar) {
        if (iqnVar == null) {
            throw new NullPointerException("Null timelapseMode");
        }
        this.a = iqnVar;
    }

    public static String a(Context context, iqn iqnVar, double d) {
        int iA = (int) (iqnVar.a(d) * 10.0d);
        return context.getString(R.string.speed_up_ratio_no_translated, iA % 10 == 0 ? String.valueOf(iA / 10) : String.format("%.01f", Float.valueOf(iA / 10.0f)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof irs) {
            return this.a.equals(((irs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 43);
        sb.append("SpeedUpSeekBarConfiguration{timelapseMode=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
