package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ktg extends bmo implements kth {
    public ktg() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                b((kte) bmp.a(parcel, kte.CREATOR));
                return true;
            case 2:
                c();
                return true;
            default:
                return false;
        }
    }
}
