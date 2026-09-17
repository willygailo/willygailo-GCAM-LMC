package android.support.wearable.complications;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.si;
import j$.util.DesugarTimeZone;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ComplicationText implements Parcelable, TimeDependentText {
    public static final Parcelable.Creator CREATOR = new si(0);
    private final CharSequence a;
    private final TimeDependentText b;
    private final CharSequence[] c;
    private long d;
    private CharSequence e;

    public ComplicationText(Parcel parcel) {
        TimeUnit timeUnitValueOf;
        this.c = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.a = bundle.getCharSequence("surrounding_string");
        if (bundle.containsKey("difference_style") && bundle.containsKey("difference_period_start") && bundle.containsKey("difference_period_end")) {
            long j = bundle.getLong("difference_period_start");
            long j2 = bundle.getLong("difference_period_end");
            int i = bundle.getInt("difference_style");
            boolean z = bundle.getBoolean("show_now_text", true);
            String string = bundle.getString("minimum_unit");
            if (string == null) {
                timeUnitValueOf = null;
            } else {
                try {
                    timeUnitValueOf = TimeUnit.valueOf(string);
                } catch (IllegalArgumentException e) {
                    timeUnitValueOf = null;
                }
            }
            this.b = new TimeDifferenceText(j, j2, i, z, timeUnitValueOf);
        } else if (bundle.containsKey("format_format_string") && bundle.containsKey("format_style")) {
            this.b = new TimeFormatText(bundle.getString("format_format_string"), bundle.getInt("format_style"), bundle.containsKey("format_time_zone") ? DesugarTimeZone.getTimeZone(bundle.getString("format_time_zone")) : null);
        } else {
            this.b = null;
        }
        c();
    }

    public ComplicationText(CharSequence charSequence) {
        this.c = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        this.a = charSequence;
        this.b = null;
        c();
    }

    private final void c() {
        if (this.a == null && this.b == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence a(Context context, long j) {
        CharSequence charSequenceA;
        TimeDependentText timeDependentText = this.b;
        if (timeDependentText == null) {
            return this.a;
        }
        if (this.e == null || !timeDependentText.b(this.d, j)) {
            charSequenceA = this.b.a(context, j);
            this.d = j;
            this.e = charSequenceA;
        } else {
            charSequenceA = this.e;
        }
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return charSequenceA;
        }
        CharSequence[] charSequenceArr = this.c;
        charSequenceArr[0] = charSequenceA;
        return TextUtils.expandTemplate(charSequence, charSequenceArr);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean b(long j, long j2) {
        TimeDependentText timeDependentText = this.b;
        if (timeDependentText == null) {
            return true;
        }
        return timeDependentText.b(j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("surrounding_string", this.a);
        TimeDependentText timeDependentText = this.b;
        if (timeDependentText instanceof TimeDifferenceText) {
            TimeDifferenceText timeDifferenceText = (TimeDifferenceText) timeDependentText;
            bundle.putLong("difference_period_start", timeDifferenceText.a);
            bundle.putLong("difference_period_end", timeDifferenceText.b);
            bundle.putInt("difference_style", timeDifferenceText.c);
            bundle.putBoolean("show_now_text", timeDifferenceText.d);
            TimeUnit timeUnit = timeDifferenceText.e;
            if (timeUnit != null) {
                bundle.putString("minimum_unit", timeUnit.name());
            }
        } else if (timeDependentText instanceof TimeFormatText) {
            TimeFormatText timeFormatText = (TimeFormatText) timeDependentText;
            bundle.putString("format_format_string", timeFormatText.a.toPattern());
            bundle.putInt("format_style", timeFormatText.b);
            TimeZone timeZone = timeFormatText.c;
            if (timeZone != null) {
                bundle.putString("format_time_zone", timeZone.getID());
            }
        }
        parcel.writeBundle(bundle);
    }
}
