package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class aha extends agk {
    public static final Parcelable.Creator CREATOR = new si(10);
    public final int a;

    public aha(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public aha(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
