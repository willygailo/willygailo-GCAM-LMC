package defpackage;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final class ohq {
    private static final Duration i = Duration.ofSeconds(3);
    private static final Duration j = Duration.ofSeconds(1);
    public final int a;
    public final boolean b;
    public final Duration c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Duration h;
    private final int k;

    public ohq() {
    }

    public ohq(int i2, boolean z, Duration duration, int i3, int i4, int i5, int i6, int i7, Duration duration2) {
        this.a = i2;
        this.b = z;
        this.c = duration;
        this.k = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = duration2;
    }

    public static ohp a() {
        ohp ohpVar = new ohp();
        ohpVar.b(20);
        ohpVar.a = true;
        Duration duration = i;
        if (duration == null) {
            throw new NullPointerException("Null fpsWindowDuration");
        }
        ohpVar.b = duration;
        ohpVar.c = 30;
        ohpVar.d = 20;
        ohpVar.e = 50;
        ohpVar.f = 15;
        ohpVar.g = 25;
        Duration duration2 = j;
        if (duration2 == null) {
            throw new NullPointerException("Null minDurationBetweenLogs");
        }
        ohpVar.h = duration2;
        return ohpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohq) {
            ohq ohqVar = (ohq) obj;
            if (this.a == ohqVar.a && this.b == ohqVar.b && this.c.equals(ohqVar.c) && this.k == ohqVar.k && this.d == ohqVar.d && this.e == ohqVar.e && this.f == ohqVar.f && this.g == ohqVar.g && this.h.equals(ohqVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        int i2 = this.a;
        boolean z = this.b;
        String strValueOf = String.valueOf(this.c);
        int i3 = this.k;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        String strValueOf2 = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 300 + String.valueOf(strValueOf2).length());
        sb.append("FpsParams{targetFps=");
        sb.append(i2);
        sb.append(", trackFpsPerformance=");
        sb.append(z);
        sb.append(", fpsWindowDuration=");
        sb.append(strValueOf);
        sb.append(", expectedInputFps=");
        sb.append(i3);
        sb.append(", minInputFpsWarningThreshold=");
        sb.append(i4);
        sb.append(", maxInputFpsWarningThreshold=");
        sb.append(i5);
        sb.append(", minOutputFpsWarningThreshold=");
        sb.append(i6);
        sb.append(", maxOutputFpsWarningThreshold=");
        sb.append(i7);
        sb.append(", minDurationBetweenLogs=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
