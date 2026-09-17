package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kgw extends kno {
    public static final Parcelable.Creator CREATOR = new sk(2);
    public final kgr a;
    public final khg b;
    public byte[] c;
    public final int[] d;
    public final String[] e;
    public final int[] f;
    public final byte[][] g;
    public final ktq[] h;
    public final boolean i;
    public pyk j;
    public final kgm k;

    public kgw(khg khgVar, pyk pykVar, kgm kgmVar, int[] iArr, String[] strArr, int[] iArr2, boolean z) {
        this.b = khgVar;
        this.j = pykVar;
        this.k = kgmVar;
        this.a = null;
        this.d = iArr;
        this.e = strArr;
        this.f = iArr2;
        this.g = null;
        this.h = null;
        this.i = true;
    }

    public kgw(khg khgVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ktq[] ktqVarArr) {
        this.b = khgVar;
        this.c = bArr;
        this.d = iArr;
        this.e = strArr;
        this.j = null;
        this.k = null;
        this.a = null;
        this.f = iArr2;
        this.g = bArr2;
        this.h = ktqVarArr;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kgw) {
            kgw kgwVar = (kgw) obj;
            if (mip.dx(this.b, kgwVar.b) && Arrays.equals(this.c, kgwVar.c) && Arrays.equals(this.d, kgwVar.d) && Arrays.equals(this.e, kgwVar.e) && mip.dx(this.j, kgwVar.j) && mip.dx(this.k, kgwVar.k)) {
                kgr kgrVar = kgwVar.a;
                if (mip.dx(null, null) && Arrays.equals(this.f, kgwVar.f) && Arrays.deepEquals(this.g, kgwVar.g) && Arrays.equals(this.h, kgwVar.h) && this.i == kgwVar.i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.j, this.k, null, this.f, this.g, this.h, Boolean.valueOf(this.i)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.b);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.c;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", LogEvent: ");
        sb.append(this.j);
        sb.append(", SourceExtensionByteStringProvider: ");
        sb.append(this.k);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.g));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.h));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.i);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 2, this.b, i);
        mip.cD(parcel, 3, this.c);
        mip.cG(parcel, 4, this.d);
        mip.cJ(parcel, 5, this.e);
        mip.cG(parcel, 6, this.f);
        mip.cE(parcel, 7, this.g);
        mip.cw(parcel, 8, this.i);
        mip.cL(parcel, 9, this.h, i);
        mip.cv(parcel, iCt);
    }
}
