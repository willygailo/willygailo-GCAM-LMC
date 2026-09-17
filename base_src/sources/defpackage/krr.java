package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class krr extends bmn implements krs {
    public krr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    @Override // defpackage.krs
    public final int e(Intent intent, int i, int i2) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        parcelA.writeInt(i);
        parcelA.writeInt(i2);
        Parcel parcelY = y(4, parcelA);
        int i3 = parcelY.readInt();
        parcelY.recycle();
        return i3;
    }

    @Override // defpackage.krs
    public final void f() {
        z(2, a());
    }

    @Override // defpackage.krs
    public final void g(Intent intent) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        z(6, parcelA);
    }

    @Override // defpackage.krs
    public final void h(int i) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        z(3, parcelA);
    }

    @Override // defpackage.krs
    public final boolean i(koh kohVar, koh kohVar2) {
        Parcel parcelA = a();
        bmp.e(parcelA, kohVar);
        bmp.e(parcelA, kohVar2);
        Parcel parcelY = y(9, parcelA);
        boolean zF = bmp.f(parcelY);
        parcelY.recycle();
        return zF;
    }

    @Override // defpackage.krs
    public final boolean j(JobParameters jobParameters) {
        Parcel parcelA = a();
        bmp.c(parcelA, jobParameters);
        Parcel parcelY = y(7, parcelA);
        boolean zF = bmp.f(parcelY);
        parcelY.recycle();
        return zF;
    }

    @Override // defpackage.krs
    public final boolean k(JobParameters jobParameters) {
        Parcel parcelA = a();
        bmp.c(parcelA, jobParameters);
        Parcel parcelY = y(8, parcelA);
        boolean zF = bmp.f(parcelY);
        parcelY.recycle();
        return zF;
    }

    @Override // defpackage.krs
    public final boolean l(Intent intent) {
        Parcel parcelA = a();
        bmp.c(parcelA, intent);
        Parcel parcelY = y(5, parcelA);
        boolean zF = bmp.f(parcelY);
        parcelY.recycle();
        return zF;
    }
}
