package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kqk extends kqd {
    public static final Parcelable.Creator CREATOR = new kpg(7);
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final Uri f;
    public final kql g;
    public final long h;
    public final Uri i;
    public final kqm j;
    public final Uri k;
    private final byte[] l;

    public kqk(String str, int i, boolean z, String str2, int i2, Uri uri, kql kqlVar, long j, Uri uri2, kqm kqmVar, byte[] bArr, Uri uri3) {
        boolean z2 = true;
        obr.aF(!str.isEmpty());
        obr.aF(i != 0);
        if (uri != null && str2 == null) {
            obr.aF(i2 == 3);
            uri2.getClass();
            kqmVar.getClass();
            uri3.getClass();
        } else {
            if (uri != null || str2 == null) {
                if (uri != null) {
                    throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
                }
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            obr.aF(!str2.isEmpty());
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z2 = false;
                    break;
            }
            obr.aF(z2);
        }
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = uri;
        this.i = uri2;
        this.g = kqlVar;
        this.h = j;
        this.j = kqmVar;
        this.l = bArr != null ? bArr : new byte[0];
        this.k = uri3;
    }

    public static kqj a() {
        return new kqj();
    }

    public final byte[] b() {
        byte[] bArr = this.l;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqk)) {
            return false;
        }
        kqk kqkVar = (kqk) obj;
        return obr.bc(this.a, kqkVar.a) && this.b == kqkVar.b && this.c == kqkVar.c && obr.bc(this.d, kqkVar.d) && this.e == kqkVar.e && obr.bc(this.f, kqkVar.f) && obr.bc(this.i, kqkVar.i) && obr.bc(this.g, kqkVar.g) && this.h == kqkVar.h && obr.bc(this.j, kqkVar.j) && Arrays.equals(this.l, kqkVar.l) && obr.bc(this.k, kqkVar.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, this.i, this.g, Long.valueOf(this.h), this.j, Integer.valueOf(Arrays.hashCode(this.l)), this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 1, this.a);
        mip.cA(parcel, 2, this.b);
        mip.cw(parcel, 3, this.c);
        mip.cI(parcel, 4, this.d);
        mip.cA(parcel, 5, this.e);
        mip.cH(parcel, 6, this.f, i);
        mip.cH(parcel, 9, this.g, i);
        mip.cB(parcel, 10, this.h);
        mip.cH(parcel, 11, this.i, i);
        mip.cH(parcel, 12, this.j, i);
        mip.cD(parcel, 13, b());
        mip.cH(parcel, 14, this.k, i);
        mip.cv(parcel, iCt);
    }
}
