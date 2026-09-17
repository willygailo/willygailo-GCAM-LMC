package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kud extends bmo implements IInterface {
    private final kvm a;

    public kud() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    public kud(kvm kvmVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = kvmVar;
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 2:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 3:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 4:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), (kto) bmp.a(parcel, kto.CREATOR), this.a);
                return true;
            case 5:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 6:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), (ktq) bmp.a(parcel, ktq.CREATOR), this.a);
                return true;
            case 7:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), (ktp) bmp.a(parcel, ktp.CREATOR), this.a);
                return true;
            case 8:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 9:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), (kts) bmp.a(parcel, kts.CREATOR), this.a);
                return true;
            case 10:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), (kto) bmp.a(parcel, kto.CREATOR), this.a);
                return true;
            case 11:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), Long.valueOf(parcel.readLong()), this.a);
                return true;
            case 12:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 13:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), (ktv) bmp.a(parcel, ktv.CREATOR), this.a);
                return true;
            case 14:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 15:
                mip.dB((Status) bmp.a(parcel, Status.CREATOR), this.a);
                return true;
            case 16:
                mip.dC((Status) bmp.a(parcel, Status.CREATOR), Long.valueOf(parcel.readLong()), this.a);
                return true;
            default:
                return false;
        }
    }
}
