package defpackage;

import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class ifl {
    private ResolveInfo a;
    private Boolean b;
    private Boolean c;

    public final ifm a() {
        Boolean bool;
        ResolveInfo resolveInfo = this.a;
        if (resolveInfo != null && (bool = this.b) != null && this.c != null) {
            return new ifm(resolveInfo, bool.booleanValue(), this.c.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" resolveInfo");
        }
        if (this.b == null) {
            sb.append(" selected");
        }
        if (this.c == null) {
            sb.append(" supported");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(ResolveInfo resolveInfo) {
        if (resolveInfo == null) {
            throw new NullPointerException("Null resolveInfo");
        }
        this.a = resolveInfo;
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
