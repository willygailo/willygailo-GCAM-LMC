package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.si;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimeFormatText implements TimeDependentText {
    public final SimpleDateFormat a;
    public final int b;
    public final TimeZone c;
    private final Date f;
    private long g;
    private static final String[][] d = {new String[]{"S", "s"}, new String[]{"m"}, new String[]{"H", "K", "h", "k", "j", "J", "C"}, new String[]{"a", "b", "B"}};
    private static final long[] e = {TimeUnit.SECONDS.toMillis(1), TimeUnit.MINUTES.toMillis(1), TimeUnit.HOURS.toMillis(1), TimeUnit.HOURS.toMillis(12)};
    public static final Parcelable.Creator CREATOR = new si(3);

    public TimeFormatText(Parcel parcel) {
        this.a = (SimpleDateFormat) parcel.readSerializable();
        this.b = parcel.readInt();
        this.c = (TimeZone) parcel.readSerializable();
        this.g = -1L;
        this.f = new Date();
    }

    public TimeFormatText(String str, int i, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.a = simpleDateFormat;
        this.b = i;
        this.g = -1L;
        if (timeZone != null) {
            this.c = timeZone;
        } else {
            this.c = simpleDateFormat.getTimeZone();
        }
        this.f = new Date();
    }

    private final long c(long j) {
        this.f.setTime(j);
        return this.c.inDaylightTime(this.f) ? ((long) this.c.getRawOffset()) + ((long) this.c.getDSTSavings()) : this.c.getRawOffset();
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence a(Context context, long j) {
        String str = this.a.format(new Date(j));
        switch (this.b) {
            case 2:
                return str.toUpperCase();
            case 3:
                return str.toLowerCase();
            default:
                return str;
        }
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean b(long j, long j2) {
        long millis = this.g;
        if (millis == -1) {
            String pattern = this.a.toPattern();
            String string = "";
            int i = 0;
            boolean z = false;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == '\'') {
                    int i2 = i + 1;
                    if (i2 >= pattern.length() || pattern.charAt(i2) != '\'') {
                        z = !z;
                        i = i2;
                    } else {
                        i += 2;
                    }
                } else {
                    if (!z) {
                        String strValueOf = String.valueOf(string);
                        char cCharAt = pattern.charAt(i);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1);
                        sb.append(strValueOf);
                        sb.append(cCharAt);
                        string = sb.toString();
                    }
                    i++;
                }
            }
            for (int i3 = 0; i3 < 4 && this.g == -1; i3++) {
                int i4 = 0;
                while (true) {
                    String[][] strArr = d;
                    if (i4 >= strArr[i3].length) {
                        break;
                    }
                    if (string.contains(strArr[i3][i4])) {
                        this.g = e[i3];
                        break;
                    }
                    i4++;
                }
            }
            millis = this.g;
            if (millis == -1) {
                millis = TimeUnit.DAYS.toMillis(1L);
                this.g = millis;
            }
        }
        return (j + c(j)) / millis == (j2 + c(j2)) / millis;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
        parcel.writeSerializable(this.c);
    }
}
