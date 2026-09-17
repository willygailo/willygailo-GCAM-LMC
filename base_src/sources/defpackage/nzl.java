package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class nzl extends abx {
    public static final Parcelable.Creator CREATOR = new nxs(3);
    public boolean a;

    public nzl(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt() == 1;
    }

    public nzl(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.abx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
