package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kxp extends kno {
    public static final Parcelable.Creator CREATOR = new kxn(3);
    public final Uri a;
    public byte[] b;
    private final Map c;

    public kxp(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        mip.dk(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            mip.dk(parcelable);
            map.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.c = map;
        this.b = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.b;
        String strValueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb2.append(",dataSz=");
        sb2.append(strValueOf);
        sb.append(sb2.toString());
        int size = this.c.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String strValueOf2 = String.valueOf(this.a);
        StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf2).length() + 6);
        sb4.append(", uri=");
        sb4.append(strValueOf2);
        sb.append(sb4.toString());
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 2, this.a, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        mip.dk(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((kwi) entry.getValue()));
        }
        mip.cC(parcel, 4, bundle);
        mip.cD(parcel, 5, this.b);
        mip.cv(parcel, iCt);
    }
}
