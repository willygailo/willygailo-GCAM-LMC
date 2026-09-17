package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class kwf extends kmp {
    private final AtomicReference a;

    public kwf(Context context, Looper looper, kmf kmfVar, kik kikVar, kil kilVar) {
        super(context, looper, 41, kmfVar, kikVar, kilVar);
        this.a = new AtomicReference();
    }

    @Override // defpackage.kmb
    public final boolean C() {
        return true;
    }

    @Override // defpackage.kmp, defpackage.kmb, defpackage.kie
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kmb
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof kwc ? (kwc) iInterfaceQueryLocalInterface : new kwc(iBinder);
    }

    @Override // defpackage.kmb
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.kmb
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.kmb
    public final khk[] e() {
        return kvt.c;
    }

    @Override // defpackage.kmb, defpackage.kie
    public final void i() {
        try {
            kwb kwbVar = (kwb) this.a.getAndSet(null);
            if (kwbVar != null) {
                kwe kweVar = new kwe();
                kwc kwcVar = (kwc) u();
                Parcel parcelA = kwcVar.a();
                bmp.e(parcelA, kwbVar);
                bmp.e(parcelA, kweVar);
                kwcVar.z(5, parcelA);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.i();
    }
}
