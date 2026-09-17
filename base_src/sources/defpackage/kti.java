package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kti extends bmn implements IInterface {
    public kti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void e(ktm ktmVar) {
        Parcel parcelA = a();
        bmp.c(parcelA, ktmVar);
        z(59, parcelA);
    }
}
