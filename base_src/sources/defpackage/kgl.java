package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kgl extends kno {
    public static final Parcelable.Creator CREATOR = new si(20);
    public final List a;

    public kgl(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cM(parcel, 1, this.a);
        mip.cv(parcel, iCt);
    }
}
