package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class rt implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public rt(int i) {
        this.a = i;
    }

    public static final abx a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return abx.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    public static final alv b(Parcel parcel, ClassLoader classLoader) {
        return new alv(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ru(parcel, null);
            case 1:
                return new ql(parcel, null);
            case 2:
                return new aaj(parcel, null);
            case 3:
                return a(parcel, null);
            case 4:
                return new alb(parcel, null);
            default:
                return b(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new ru(parcel, classLoader);
            case 1:
                return new ql(parcel, classLoader);
            case 2:
                return new aaj(parcel, classLoader);
            case 3:
                return a(parcel, classLoader);
            case 4:
                return new alb(parcel, classLoader);
            default:
                return b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ru[i];
            case 1:
                return new ql[i];
            case 2:
                return new aaj[i];
            case 3:
                return new abx[i];
            case 4:
                return new alb[i];
            default:
                return new alv[i];
        }
    }
}
