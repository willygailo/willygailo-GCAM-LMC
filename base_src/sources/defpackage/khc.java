package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class khc extends kmp {
    public khc(Context context, Looper looper, kmf kmfVar, kik kikVar, kil kilVar) {
        super(context, looper, 40, kmfVar, kikVar, kilVar);
    }

    @Override // defpackage.kmp, defpackage.kmb, defpackage.kie
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.kmb
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof khe ? (khe) iInterfaceQueryLocalInterface : new khe(iBinder);
    }

    @Override // defpackage.kmb
    protected final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.kmb
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.kmb
    public final khk[] e() {
        return kgu.b;
    }
}
