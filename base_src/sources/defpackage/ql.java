package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ql extends abx {
    public static final Parcelable.Creator CREATOR = new rt(1);
    public Parcelable a;

    public ql(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? qc.class.getClassLoader() : classLoader);
    }

    public ql(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.abx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }
}
