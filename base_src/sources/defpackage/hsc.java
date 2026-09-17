package defpackage;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class hsc {
    private static final SimpleDateFormat c;
    public final mak a;
    public final boolean b;
    private final hsg d;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        DesugarTimeZone.getTimeZone("UTC");
        c = simpleDateFormat;
    }

    public hsc(hsg hsgVar, mak makVar, boolean z) {
        this.d = hsgVar;
        this.a = makVar;
        this.b = z;
        if (z) {
            hsgVar.a.c(makVar);
        }
    }

    public final dxh a() {
        return this.d.c;
    }

    public final void b() {
        this.d.f(this, hsf.ABANDON);
    }

    public final void c() {
        this.d.f(this, hsf.PUBLISH);
    }

    public final String toString() {
        String strConcat;
        if (oje.d(this.d.f)) {
            strConcat = "";
        } else {
            String strValueOf = String.valueOf(this.d.f);
            strConcat = strValueOf.length() != 0 ? "-".concat(strValueOf) : new String("-");
        }
        String str = c.format(new Date(this.d.b));
        String strValueOf2 = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(strConcat).length() + String.valueOf(strValueOf2).length());
        sb.append("PXL_");
        sb.append(str);
        sb.append(strConcat);
        sb.append(" (");
        sb.append(strValueOf2);
        sb.append(" isprimary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
