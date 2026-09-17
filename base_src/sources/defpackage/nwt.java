package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class nwt extends abx {
    public static final Parcelable.Creator CREATOR = new nxs(1);
    public boolean a;
    public int b;
    public float e;
    public boolean f;

    public nwt(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readByte() != 0;
        this.b = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readByte() != 0;
    }

    public nwt(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.abx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
    }
}
