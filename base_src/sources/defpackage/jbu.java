package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class jbu {
    public Size a;
    public Size b;
    public Integer c;
    private Size d;
    private Boolean e;
    private Boolean f;
    private jrz g;
    private jrl h;
    private jce i;

    public jbu() {
    }

    public jbu(jbv jbvVar) {
        this.a = jbvVar.b;
        this.b = jbvVar.c;
        this.d = jbvVar.d;
        this.c = jbvVar.e;
        this.e = Boolean.valueOf(jbvVar.f);
        this.f = Boolean.valueOf(jbvVar.g);
        this.g = jbvVar.h;
        this.h = jbvVar.i;
        this.i = jbvVar.j;
    }

    public final jbv a() {
        Size size = this.b;
        Integer num = this.c;
        if (size != null && num != null) {
            jrz jrzVar = this.g;
            if (jrzVar == null) {
                throw new IllegalStateException("Property \"orientation\" has not been set");
            }
            lic licVarB = lic.b(jrzVar.e + num.intValue());
            boolean z = true;
            if (!licVarB.equals(lic.CLOCKWISE_90) && !licVarB.equals(lic.CLOCKWISE_270)) {
                z = false;
            }
            this.d = new Size(z ? size.getHeight() : size.getWidth(), z ? size.getWidth() : size.getHeight());
        }
        Boolean bool = this.e;
        if (bool != null && this.f != null && this.g != null && this.h != null && this.i != null) {
            return new jbv(this.a, this.b, this.d, this.c, bool.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" isPreviewMaximized");
        }
        if (this.f == null) {
            sb.append(" hasCutout");
        }
        if (this.g == null) {
            sb.append(" orientation");
        }
        if (this.h == null) {
            sb.append(" mode");
        }
        if (this.i == null) {
            sb.append(" decision");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(jce jceVar) {
        if (jceVar == null) {
            throw new NullPointerException("Null decision");
        }
        this.i = jceVar;
    }

    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void d() {
        this.e = false;
    }

    public final void e(jrl jrlVar) {
        if (jrlVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.h = jrlVar;
    }

    public final void f(jrz jrzVar) {
        if (jrzVar == null) {
            throw new NullPointerException("Null orientation");
        }
        this.g = jrzVar;
    }
}
