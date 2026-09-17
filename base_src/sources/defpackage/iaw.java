package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class iaw {
    public Boolean a;
    public String b;
    public Drawable c;
    public Runnable d;
    public Runnable e;
    public String f;
    public Runnable g;
    public Runnable h;
    public Runnable i;
    public Runnable j;
    private Long k;
    private Boolean l;

    public iaw() {
    }

    public iaw(iax iaxVar) {
        this.k = Long.valueOf(iaxVar.a);
        this.a = Boolean.valueOf(iaxVar.b);
        this.b = iaxVar.c;
        this.c = iaxVar.d;
        this.d = iaxVar.e;
        this.e = iaxVar.f;
        this.f = iaxVar.g;
        this.g = iaxVar.h;
        this.h = iaxVar.i;
        this.i = iaxVar.j;
        this.j = iaxVar.k;
        this.l = Boolean.valueOf(iaxVar.l);
    }

    public final iax a() {
        iax iaxVarB = b();
        boolean z = false;
        boolean z2 = (iaxVarB.c == null && iaxVarB.d == null) ? false : true;
        Runnable runnable = iaxVarB.e;
        obr.aQ(z2);
        if (runnable == null || z2) {
            z = true;
        }
        obr.aQ(z);
        obr.aQ(true);
        String str = iaxVarB.c;
        if (str != null && iaxVarB.g == null) {
            iaw iawVarB = iaxVarB.b();
            iawVarB.f = str;
            iaxVarB = iawVarB.b();
        }
        if (iaxVarB.a != 0) {
            return iaxVarB;
        }
        iaw iawVarB2 = iaxVarB.b();
        iawVarB2.c(true);
        iawVarB2.d(-1L);
        return iawVarB2.a();
    }

    public final iax b() {
        Long l = this.k;
        if (l != null && this.a != null && this.l != null) {
            return new iax(l.longValue(), this.a.booleanValue(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.l.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.k == null) {
            sb.append(" timeoutMillis");
        }
        if (this.a == null) {
            sb.append(" autoHideOnClick");
        }
        if (this.l == null) {
            sb.append(" sticky");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void c(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void d(long j) {
        this.k = Long.valueOf(j);
    }
}
