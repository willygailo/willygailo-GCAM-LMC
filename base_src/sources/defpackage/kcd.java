package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kcd extends bmn implements IInterface {
    public kcd(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    public final void e(byte[] bArr) {
        Parcel parcelA = a();
        parcelA.writeByteArray(bArr);
        A(1, parcelA);
    }
}
