package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class agc extends agk {
    public static final Parcelable.Creator CREATOR = new si(7);
    public String a;

    public agc(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public agc(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
