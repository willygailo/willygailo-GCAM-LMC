package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class jff {
    private Rect a;
    private Integer b;

    public final jfg a() {
        Integer num;
        Rect rect = this.a;
        if (rect != null && (num = this.b) != null) {
            return new jfg(rect, num.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rect");
        }
        if (this.b == null) {
            sb.append(" radius");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void c(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null rect");
        }
        this.a = rect;
    }
}
