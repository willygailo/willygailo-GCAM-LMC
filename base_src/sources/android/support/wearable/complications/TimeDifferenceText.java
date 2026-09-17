package android.support.wearable.complications;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.GoogleCameraEngR18F1.R;
import defpackage.si;
import defpackage.sj;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimeDifferenceText implements TimeDependentText {
    public static final Parcelable.Creator CREATOR = new si(2);
    public final long a;
    public final long b;
    public final int c;
    public final boolean d;
    public final TimeUnit e;

    public TimeDifferenceText(long j, long j2, int i, boolean z, TimeUnit timeUnit) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = z;
        this.e = timeUnit;
    }

    public TimeDifferenceText(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readByte() != 0;
        int i = parcel.readInt();
        this.e = i == -1 ? null : TimeUnit.values()[i];
    }

    private static int c(long j) {
        return f(j, TimeUnit.DAYS);
    }

    private static int d(long j) {
        return f(j, TimeUnit.HOURS);
    }

    private static int e(long j) {
        return f(j, TimeUnit.MINUTES);
    }

    private static int f(long j, TimeUnit timeUnit) {
        long millis = j / timeUnit.toMillis(1L);
        int i = 60;
        switch (sj.a[timeUnit.ordinal()]) {
            case 1:
                i = 1000;
                break;
            case 2:
            case 3:
                break;
            case 4:
                i = 24;
                break;
            case 5:
                i = Integer.MAX_VALUE;
                break;
            default:
                String strValueOf = String.valueOf(timeUnit);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
                sb.append("Unit not supported: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
        return (int) (millis % ((long) i));
    }

    private static long g(long j, long j2) {
        return (j / j2) + ((long) (j % j2 == 0 ? 0 : 1));
    }

    private final long h(long j) {
        long j2 = this.a;
        if (j < j2) {
            return j2 - j;
        }
        long j3 = this.b;
        if (j <= j3) {
            return 0L;
        }
        return j - j3;
    }

    private static long i(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(1L);
        return g(j, millis) * millis;
    }

    private static String j(int i, Resources resources) {
        return resources.getQuantityString(R.plurals.time_difference_short_days, i, Integer.valueOf(i));
    }

    private final String k(long j, Resources resources) {
        long jI = i(j, TimeUnit.HOURS);
        if (p(this.e, TimeUnit.DAYS) || c(jI) >= 10) {
            return j(c(i(j, TimeUnit.DAYS)), resources);
        }
        long jI2 = i(j, TimeUnit.MINUTES);
        if (c(jI2) > 0) {
            int iD = d(jI);
            return iD > 0 ? resources.getString(R.string.time_difference_short_days_and_hours, j(c(jI), resources), l(iD, resources)) : j(c(jI), resources);
        }
        if (p(this.e, TimeUnit.HOURS)) {
            return l(d(jI), resources);
        }
        int iD2 = d(jI2);
        int iE = e(jI2);
        if (iD2 > 0) {
            return iE > 0 ? resources.getString(R.string.time_difference_short_hours_and_minutes, l(iD2, resources), m(iE, resources)) : l(iD2, resources);
        }
        return m(e(jI2), resources);
    }

    private static String l(int i, Resources resources) {
        return resources.getQuantityString(R.plurals.time_difference_short_hours, i, Integer.valueOf(i));
    }

    private static String m(int i, Resources resources) {
        return resources.getQuantityString(R.plurals.time_difference_short_minutes, i, Integer.valueOf(i));
    }

    private final String n(long j, Resources resources) {
        long jI = i(j, TimeUnit.HOURS);
        if (p(this.e, TimeUnit.DAYS) || c(jI) > 0) {
            return j(c(i(j, TimeUnit.DAYS)), resources);
        }
        long jI2 = i(j, TimeUnit.MINUTES);
        return (p(this.e, TimeUnit.HOURS) || d(jI2) > 0) ? l(d(jI), resources) : m(e(jI2), resources);
    }

    private final String o(long j, Resources resources) {
        long jI = i(j, TimeUnit.HOURS);
        if (p(this.e, TimeUnit.DAYS) || c(jI) > 0) {
            int iC = c(i(j, TimeUnit.DAYS));
            return resources.getQuantityString(R.plurals.time_difference_words_days, iC, Integer.valueOf(iC));
        }
        long jI2 = i(j, TimeUnit.MINUTES);
        if (p(this.e, TimeUnit.HOURS) || d(jI2) > 0) {
            int iD = d(jI);
            return resources.getQuantityString(R.plurals.time_difference_words_hours, iD, Integer.valueOf(iD));
        }
        int iE = e(jI2);
        return resources.getQuantityString(R.plurals.time_difference_words_minutes, iE, Integer.valueOf(iE));
    }

    private static boolean p(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit != null && timeUnit.toMillis(1L) >= timeUnit2.toMillis(1L);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence a(Context context, long j) {
        Resources resources = context.getResources();
        long jH = h(j);
        if (jH == 0 && this.d) {
            return resources.getString(R.string.time_difference_now);
        }
        switch (this.c) {
            case 1:
                if (p(this.e, TimeUnit.DAYS)) {
                    return j(c(i(jH, TimeUnit.DAYS)), resources);
                }
                long jI = i(jH, TimeUnit.MINUTES);
                if (p(this.e, TimeUnit.HOURS) || c(jI) > 0) {
                    return k(jH, resources);
                }
                long jI2 = i(jH, TimeUnit.SECONDS);
                return (p(this.e, TimeUnit.MINUTES) || d(jI2) > 0) ? String.format(Locale.US, "%d:%02d", Integer.valueOf(d(jI)), Integer.valueOf(e(jI))) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(e(jI2)), Integer.valueOf(f(jI2, TimeUnit.SECONDS)));
            case 2:
                return n(jH, resources);
            case 3:
                String strK = k(jH, resources);
                return strK.length() <= 7 ? strK : n(jH, resources);
            case 4:
                return o(jH, resources);
            case 5:
                String strO = o(jH, resources);
                return strO.length() <= 7 ? strO : n(jH, resources);
            default:
                return n(jH, resources);
        }
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean b(long j, long j2) {
        long millis;
        switch (this.c) {
            case 1:
                millis = TimeUnit.SECONDS.toMillis(1L);
                break;
            default:
                millis = TimeUnit.MINUTES.toMillis(1L);
                break;
        }
        TimeUnit timeUnit = this.e;
        if (timeUnit != null) {
            millis = Math.max(millis, timeUnit.toMillis(1L));
        }
        return g(h(j), millis) == g(h(j2), millis);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        TimeUnit timeUnit = this.e;
        parcel.writeInt(timeUnit == null ? -1 : timeUnit.ordinal());
    }
}
