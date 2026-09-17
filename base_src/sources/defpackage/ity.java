package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class ity {
    public int a;
    private itr b;
    private RectF c;
    private Float d;
    private Integer e;
    private Long f;

    public final itz a() {
        itr itrVar;
        RectF rectF;
        Float f;
        int i = this.a;
        if (i != 0 && (itrVar = this.b) != null && (rectF = this.c) != null && (f = this.d) != null && this.e != null && this.f != null) {
            return new itz(i, itrVar, rectF, f.floatValue(), this.e.intValue(), this.f.longValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" status");
        }
        if (this.b == null) {
            sb.append(" trackerType");
        }
        if (this.c == null) {
            sb.append(" roi");
        }
        if (this.d == null) {
            sb.append(" confidence");
        }
        if (this.e == null) {
            sb.append(" numberOfRefresherCalls");
        }
        if (this.f == null) {
            sb.append(" trackedLengthMs");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(float f) {
        this.d = Float.valueOf(f);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(RectF rectF) {
        if (rectF == null) {
            throw new NullPointerException("Null roi");
        }
        this.c = rectF;
    }

    public final void e(long j) {
        this.f = Long.valueOf(j);
    }

    public final void f(itr itrVar) {
        if (itrVar == null) {
            throw new NullPointerException("Null trackerType");
        }
        this.b = itrVar;
    }
}
