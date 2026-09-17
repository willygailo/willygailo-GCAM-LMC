package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class cyj {
    public String a;
    public Runnable b;
    public Drawable c;
    public ojc d;
    public int e;
    public int f;
    private Long g;
    private Runnable h;
    private Integer i;
    private Integer j;

    public cyj() {
    }

    public cyj(byte[] bArr) {
        this.d = oih.a;
    }

    public final cyk a() {
        Long l = this.g;
        if (l != null && this.h != null && this.e != 0 && this.f != 0 && this.i != null && this.j != null) {
            return new cyk(l.longValue(), this.a, this.b, this.c, this.h, this.e, this.f, this.d, this.i.intValue(), this.j.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" id");
        }
        if (this.h == null) {
            sb.append(" dismissClickAction");
        }
        if (this.e == 0) {
            sb.append(" actionType");
        }
        if (this.f == 0) {
            sb.append(" resultType");
        }
        if (this.i == null) {
            sb.append(" barcodeValueFormat");
        }
        if (this.j == null) {
            sb.append(" barcodeFormat");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void d(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null dismissClickAction");
        }
        this.h = runnable;
    }

    public final void e(long j) {
        this.g = Long.valueOf(j);
    }
}
