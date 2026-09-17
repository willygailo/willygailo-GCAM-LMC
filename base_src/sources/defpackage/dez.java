package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final class dez extends dfo {
    public static final Parcelable.Creator CREATOR = new si(13);

    public dez(long j, hsp hspVar, oom oomVar, String str, String str2, Instant instant, Instant instant2, Uri uri, boolean z, lig ligVar, int i) {
        super(j, hspVar, oomVar, str, str2, instant, instant2, uri, z, ligVar, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeList(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeSerializable(this.k);
        parcel.writeInt(this.l);
    }
}
