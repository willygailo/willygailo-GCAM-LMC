package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class kwa extends bmo implements IInterface {
    public kwa() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void b(Status status, kvz kvzVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                b((Status) bmp.a(parcel, Status.CREATOR), (kvz) bmp.a(parcel, kvz.CREATOR));
                return true;
            case 3:
                throw new IllegalStateException("Not implemented.");
            case 4:
                throw new IllegalStateException("Not implemented.");
            case 5:
                c((Status) bmp.a(parcel, Status.CREATOR));
                return true;
            case 6:
                parcel.createStringArrayList();
                throw new IllegalStateException("Not implemented.");
            case 7:
                throw new IllegalStateException("Not implemented.");
            case 8:
                bmp.f(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }
}
