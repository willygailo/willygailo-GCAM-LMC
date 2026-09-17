package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kxc extends kxb {
    public kxc(kim kimVar) {
        super(kimVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kiv a(Status status) {
        return new kxe(status, null);
    }

    @Override // defpackage.kji
    protected final /* bridge */ /* synthetic */ void b(khz khzVar) {
        kyo kyoVar = (kyo) ((kzq) khzVar).u();
        kzm kzmVar = new kzm(this);
        Parcel parcelA = kyoVar.a();
        bmp.e(parcelA, kzmVar);
        parcelA.writeString("snapshot_from_wear");
        parcelA.writeInt(1);
        kyoVar.z(42, parcelA);
    }
}
