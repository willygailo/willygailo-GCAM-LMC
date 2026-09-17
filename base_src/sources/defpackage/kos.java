package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kos extends bmn implements IInterface {
    public kos(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel parcelY = y(6, a());
        int i = parcelY.readInt();
        parcelY.recycle();
        return i;
    }
}
