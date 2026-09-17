package android.support.wearable.complications;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.sg;
import defpackage.si;

/* JADX INFO: loaded from: classes.dex */
public class ComplicationData implements Parcelable {
    public final int b;
    public final Bundle c;
    public static final String[][] a = {null, new String[0], new String[0], new String[]{"SHORT_TEXT"}, new String[]{"LONG_TEXT"}, new String[]{"VALUE", "MIN_VALUE", "MAX_VALUE"}, new String[]{"ICON"}, new String[]{"SMALL_IMAGE", "IMAGE_STYLE"}, new String[]{"LARGE_IMAGE"}, new String[0], new String[0]};
    private static final String[][] d = {null, new String[0], new String[0], new String[]{"SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", "SMALL_IMAGE_BURN_IN_PROTECTION", "IMAGE_STYLE", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "SMALL_IMAGE_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[0]};
    public static final Parcelable.Creator CREATOR = new si(1);

    public ComplicationData(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readBundle(getClass().getClassLoader());
    }

    public ComplicationData(sg sgVar) {
        this.b = sgVar.a;
        this.c = sgVar.b;
    }

    public static void j(String str, int i) {
        if (!m(i)) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Type ");
            sb.append(i);
            sb.append(" can not be recognized");
            throw new IllegalStateException(sb.toString());
        }
        if (l(str, i)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 44);
        sb2.append("Field ");
        sb2.append(str);
        sb2.append(" is not supported for type ");
        sb2.append(i);
        throw new IllegalStateException(sb2.toString());
    }

    public static void k(String str, int i) {
        if (m(i)) {
            l(str, i);
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Type ");
        sb.append(i);
        sb.append(" can not be recognized");
        Log.w("ComplicationData", sb.toString());
    }

    private static boolean l(String str, int i) {
        for (String str2 : a[i]) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : d[i]) {
            if (str3.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean m(int i) {
        return i > 0 && i <= 11;
    }

    public final int a() {
        k("IMAGE_STYLE", this.b);
        return this.c.getInt("IMAGE_STYLE");
    }

    public final PendingIntent b() {
        k("TAP_ACTION", this.b);
        return (PendingIntent) e("TAP_ACTION");
    }

    public final Icon c() {
        k("ICON", this.b);
        return (Icon) e("ICON");
    }

    public final Icon d() {
        k("SMALL_IMAGE", this.b);
        return (Icon) e("SMALL_IMAGE");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Parcelable e(String str) {
        try {
            return this.c.getParcelable(str);
        } catch (BadParcelableException e) {
            Log.w("ComplicationData", "Could not unparcel ComplicationData. Provider apps must exclude wearable support complication classes from proguard.", e);
            return null;
        }
    }

    public final ComplicationText f() {
        k("LONG_TEXT", this.b);
        return (ComplicationText) e("LONG_TEXT");
    }

    public final ComplicationText g() {
        k("LONG_TITLE", this.b);
        return (ComplicationText) e("LONG_TITLE");
    }

    public final ComplicationText h() {
        k("SHORT_TEXT", this.b);
        return (ComplicationText) e("SHORT_TEXT");
    }

    public final ComplicationText i() {
        k("SHORT_TITLE", this.b);
        return (ComplicationText) e("SHORT_TITLE");
    }

    public final String toString() {
        int i = this.b;
        String strValueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 45);
        sb.append("ComplicationData{mType=");
        sb.append(i);
        sb.append(", mFields=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
    }
}
