package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;

/* JADX INFO: loaded from: classes2.dex */
public final class kox extends koy {
    final /* synthetic */ kpb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kox(kim kimVar, kpb kpbVar) {
        super(kimVar);
        this.a = kpbVar;
    }

    @Override // defpackage.kji
    protected final /* synthetic */ void b(khz khzVar) {
        kph kphVar = (kph) khzVar;
        kpb kpbVar = this.a;
        mip.ch(kpbVar);
        if (((Boolean) kpj.a.a()).booleanValue()) {
            kpi kpiVar = (kpi) kphVar.u();
            Parcel parcelA = kpiVar.a();
            bmp.c(parcelA, kpbVar);
            Parcel parcelY = kpiVar.y(7, parcelA);
            bmp.f(parcelY);
            parcelY.recycle();
        } else {
            kpi kpiVar2 = (kpi) kphVar.u();
            ErrorReport errorReport = new ErrorReport(kpbVar, kphVar.a.getCacheDir());
            Parcel parcelA2 = kpiVar2.a();
            bmp.c(parcelA2, errorReport);
            Parcel parcelY2 = kpiVar2.y(3, parcelA2);
            bmp.f(parcelY2);
            parcelY2.recycle();
        }
        j(Status.a);
    }
}
