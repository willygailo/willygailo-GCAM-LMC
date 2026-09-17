package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class aht extends agk {
    public static final Parcelable.Creator CREATOR = new si(12);
    public boolean a;

    public aht(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() == 1;
    }

    public aht(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
