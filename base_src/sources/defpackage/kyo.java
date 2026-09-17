package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kyo extends bmn implements IInterface {
    public kyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    public final void e(kyk kykVar, kwx kwxVar) {
        Parcel parcelA = a();
        bmp.e(parcelA, kykVar);
        bmp.c(parcelA, kwxVar);
        z(16, parcelA);
    }
}
