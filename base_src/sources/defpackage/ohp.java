package defpackage;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class ohp {
    public Boolean a;
    public Duration b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Duration h;
    private Integer i;

    public final ohq a() {
        Integer num = this.i;
        if (num != null && this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null && this.h != null) {
            return new ohq(num.intValue(), this.a.booleanValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" targetFps");
        }
        if (this.a == null) {
            sb.append(" trackFpsPerformance");
        }
        if (this.b == null) {
            sb.append(" fpsWindowDuration");
        }
        if (this.c == null) {
            sb.append(" expectedInputFps");
        }
        if (this.d == null) {
            sb.append(" minInputFpsWarningThreshold");
        }
        if (this.e == null) {
            sb.append(" maxInputFpsWarningThreshold");
        }
        if (this.f == null) {
            sb.append(" minOutputFpsWarningThreshold");
        }
        if (this.g == null) {
            sb.append(" maxOutputFpsWarningThreshold");
        }
        if (this.h == null) {
            sb.append(" minDurationBetweenLogs");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(int i) {
        this.i = Integer.valueOf(i);
    }
}
