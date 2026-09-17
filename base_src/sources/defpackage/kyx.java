package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kyx extends kxb {
    public kyx(kim kimVar) {
        super(kimVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kiv a(Status status) {
        return new kyy(status, new ArrayList());
    }

    @Override // defpackage.kji
    protected final /* synthetic */ void b(khz khzVar) {
        kyo kyoVar = (kyo) ((kzq) khzVar).u();
        kzn kznVar = new kzn(this);
        Parcel parcelA = kyoVar.a();
        bmp.e(parcelA, kznVar);
        kyoVar.z(15, parcelA);
    }
}
