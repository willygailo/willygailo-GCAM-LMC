package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ojt {
    public boolean a;
    private final oke b;
    private long c;
    private long d;

    ojt() {
        throw null;
    }

    public ojt(oke okeVar) {
        okeVar.getClass();
        this.b = okeVar;
    }

    public static ojt b(oke okeVar) {
        return new ojt(okeVar);
    }

    private final long f() {
        return this.a ? (this.b.a() - this.d) + this.c : this.c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.NANOSECONDS);
    }

    public final void c() {
        this.c = 0L;
        this.a = false;
    }

    public final void d() {
        obr.aR(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }

    public final void e() {
        long jA = this.b.a();
        obr.aR(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += jA - this.d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jF = f();
        if (TimeUnit.DAYS.convert(jF, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(jF, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(jF, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(jF, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(jF, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = TimeUnit.MICROSECONDS.convert(jF, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        }
        double d = jF;
        double dConvert = TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        Double.isNaN(d);
        Double.isNaN(dConvert);
        String strB = oje.b(d / dConvert);
        switch (ojs.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + str.length());
        sb.append(strB);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }
}
