package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class knv extends kmp {
    public knv(Context context, Looper looper, kmf kmfVar, kjq kjqVar, kkw kkwVar) {
        super(context, looper, 270, kmfVar, kjqVar, kkwVar);
    }

    @Override // defpackage.kmb
    protected final boolean A() {
        return true;
    }

    @Override // defpackage.kmp, defpackage.kmb, defpackage.kie
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.kmb
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof knr ? (knr) iInterfaceQueryLocalInterface : new knr(iBinder);
    }

    @Override // defpackage.kmb
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.kmb
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.kmb
    public final khk[] e() {
        return khh.b;
    }

    @Override // defpackage.kmb
    protected final Bundle t() {
        return new Bundle();
    }
}
