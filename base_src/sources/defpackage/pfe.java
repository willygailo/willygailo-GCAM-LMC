package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class pfe {
    static final Duration a;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(Long.MIN_VALUE);
        a = durationOfSeconds;
        durationOfSeconds.getSeconds();
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
        Duration.ofMillis(Long.MAX_VALUE);
        Duration.ofMillis(Long.MIN_VALUE);
        b(Long.MAX_VALUE);
        b(Long.MIN_VALUE);
        Duration.ofNanos(Long.MAX_VALUE);
        Duration.ofNanos(Long.MIN_VALUE);
    }

    public static double a(Duration duration) {
        double seconds = duration.getSeconds();
        double nano = duration.getNano();
        Double.isNaN(nano);
        Double.isNaN(seconds);
        return seconds + (nano / 1.0E9d);
    }

    public static void b(long j) {
        Duration.of(j, ChronoUnit.MICROS);
    }
}
