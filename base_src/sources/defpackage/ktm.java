package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ktm extends kno {
    public static final Parcelable.Creator CREATOR = new kpg(16);
    public final int a;
    public final ktl b;
    public final PendingIntent c;
    public final String d;
    private final ksy e;
    private final ksv f;
    private final kth g;

    public ktm(int i, ktl ktlVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        ksy kswVar;
        ksv kstVar;
        this.a = i;
        this.b = ktlVar;
        kth ktfVar = null;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            kswVar = iInterfaceQueryLocalInterface instanceof ksy ? (ksy) iInterfaceQueryLocalInterface : new ksw(iBinder);
        } else {
            kswVar = null;
        }
        this.e = kswVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            kstVar = iInterfaceQueryLocalInterface2 instanceof ksv ? (ksv) iInterfaceQueryLocalInterface2 : new kst(iBinder2);
        } else {
            kstVar = null;
        }
        this.f = kstVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            ktfVar = iInterfaceQueryLocalInterface3 instanceof kth ? (kth) iInterfaceQueryLocalInterface3 : new ktf(iBinder3);
        }
        this.g = ktfVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.os.IBinder, ksy] */
    public static ktm a(ksy ksyVar, kth kthVar) {
        if (kthVar == null) {
            kthVar = null;
        }
        return new ktm(2, null, ksyVar, null, null, kthVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cH(parcel, 2, this.b, i);
        ksy ksyVar = this.e;
        mip.cF(parcel, 3, ksyVar == null ? null : ksyVar.asBinder());
        mip.cH(parcel, 4, this.c, i);
        ksv ksvVar = this.f;
        mip.cF(parcel, 5, ksvVar == null ? null : ksvVar.asBinder());
        kth kthVar = this.g;
        mip.cF(parcel, 6, kthVar != null ? kthVar.asBinder() : null);
        mip.cI(parcel, 8, this.d);
        mip.cv(parcel, iCt);
    }
}
