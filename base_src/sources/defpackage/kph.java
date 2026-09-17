package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class kph extends kmp {
    public final Context a;

    public kph(Context context, Looper looper, kik kikVar, kil kilVar, kmf kmfVar) {
        super(context, looper, 29, kmfVar, kikVar, kilVar);
        this.a = context;
        kzy.b(context);
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return iInterfaceQueryLocalInterface instanceof kpi ? (kpi) iInterfaceQueryLocalInterface : new kpi(iBinder);
    }

    @Override // defpackage.kmb
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.kmb
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.kmb
    public final khk[] e() {
        return kou.b;
    }
}
