package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class no extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new ba(17);
    boolean a;

    public no(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    public no(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }
}
