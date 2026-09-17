package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.akr;
import defpackage.aks;
import defpackage.akt;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akr(0);
    private final akt a;

    public ParcelImpl(Parcel parcel) {
        this.a = new aks(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new aks(parcel).k(this.a);
    }
}
