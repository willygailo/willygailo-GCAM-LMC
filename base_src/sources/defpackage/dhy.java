package defpackage;

import j$.time.Duration;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class dhy {
    public static final Duration a = Duration.ofSeconds(2);
    private static final oor b = oor.r(hsr.VIDEO, "'VID'_yyyyMMdd_HHmmss", hsr.VIDEO_SNAPSHOT, "'VID_SNAP'_yyyyMMdd_HHmmss", hsr.TIMELAPSE, "'TIMELAPSE'_yyyyMMdd_HHmmss");

    public static String a(hsr hsrVar, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        String str = (String) b.get(hsrVar);
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }
}
