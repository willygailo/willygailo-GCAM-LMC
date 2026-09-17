package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class cr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ba(2);
    final String a;
    final int b;

    public cr(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    public cr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
