package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kce extends bmo implements kcf {
    public kce() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        b(parcel.createByteArray(), (kch) bmp.a(parcel, kch.CREATOR));
        return true;
    }
}
