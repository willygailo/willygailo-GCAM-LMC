package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class kru extends bmn implements krv {
    public kru(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    @Override // defpackage.krv
    public final int e(Intent intent, int i, int i2) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        parcelA.writeInt(i);
        parcelA.writeInt(i2);
        Parcel parcelY = y(5, parcelA);
        int i3 = parcelY.readInt();
        parcelY.recycle();
        return i3;
    }

    @Override // defpackage.krv
    public final IBinder f(Intent intent) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        Parcel parcelY = y(3, parcelA);
        IBinder strongBinder = parcelY.readStrongBinder();
        parcelY.recycle();
        return strongBinder;
    }

    @Override // defpackage.krv
    public final void g(koh kohVar) {
        Parcel parcelA = a();
        bmp.e(parcelA, kohVar);
        z(1, parcelA);
    }

    @Override // defpackage.krv
    public final void h() {
        z(2, a());
    }

    @Override // defpackage.krv
    public final void i(Intent intent) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        z(7, parcelA);
    }

    @Override // defpackage.krv
    public final void j(int i) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        z(4, parcelA);
    }

    @Override // defpackage.krv
    public final boolean k(Intent intent) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        Parcel parcelY = y(6, parcelA);
        boolean zF = bmp.f(parcelY);
        parcelY.recycle();
        return zF;
    }
}
