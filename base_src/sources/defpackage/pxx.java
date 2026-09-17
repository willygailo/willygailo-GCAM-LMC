package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class pxx extends pxh {
    public static final Parcelable.Creator CREATOR = new laa(15);

    public pxx() {
    }

    public pxx(Parcel parcel) {
        super(parcel);
    }

    @Override // defpackage.pxh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxx) {
            return Arrays.equals(((pxx) obj).a, this.a);
        }
        return false;
    }
}
