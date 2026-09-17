package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kyr extends kxb {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ byte[] k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyr(kim kimVar, String str, String str2, byte[] bArr) {
        super(kimVar);
        this.a = str;
        this.b = str2;
        this.k = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kiv a(Status status) {
        return new kys(status, -1);
    }

    @Override // defpackage.kji
    protected final /* bridge */ /* synthetic */ void b(khz khzVar) {
        String str = this.a;
        String str2 = this.b;
        byte[] bArr = this.k;
        kyo kyoVar = (kyo) ((kzq) khzVar).u();
        kzp kzpVar = new kzp(this);
        Parcel parcelA = kyoVar.a();
        bmp.e(parcelA, kzpVar);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeByteArray(bArr);
        kyoVar.z(12, parcelA);
    }
}
