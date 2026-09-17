package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes2.dex */
public final class kxo extends klr {
    private final int d;

    public kxo(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final String toString() {
        String str;
        if (b() == 1) {
            str = "changed";
        } else {
            str = b() == 2 ? "deleted" : "unknown";
        }
        String strValueOf = String.valueOf(new kxq(this.a, this.b, this.d));
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(strValueOf).length());
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(strValueOf);
        sb.append(" }");
        return sb.toString();
    }
}
