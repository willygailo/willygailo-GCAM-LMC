package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class nxs implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public nxs(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new nxt(parcel, (ClassLoader) null);
            case 1:
                return new nwt(parcel, null);
            case 2:
                return new nyd(parcel, null);
            case 3:
                return new nzl(parcel, null);
            default:
                return new ocn(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new nxt(parcel, classLoader);
            case 1:
                return new nwt(parcel, classLoader);
            case 2:
                return new nyd(parcel, classLoader);
            case 3:
                return new nzl(parcel, classLoader);
            default:
                return new ocn(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nxt[i];
            case 1:
                return new nwt[i];
            case 2:
                return new nyd[i];
            case 3:
                return new nzl[i];
            default:
                return new ocn[i];
        }
    }
}
