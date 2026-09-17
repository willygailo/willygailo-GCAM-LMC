package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class krw implements kro {
    private final /* synthetic */ int e;
    public static final /* synthetic */ krw d = new krw(3);
    public static final /* synthetic */ krw c = new krw(2);
    public static final /* synthetic */ krw b = new krw(1);
    public static final /* synthetic */ krw a = new krw(0);

    private /* synthetic */ krw(int i) {
        this.e = i;
    }

    @Override // defpackage.kro
    public final IInterface a(IBinder iBinder) {
        switch (this.e) {
            case 0:
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
                return iInterfaceQueryLocalInterface instanceof krs ? (krs) iInterfaceQueryLocalInterface : new krr(iBinder);
            case 1:
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
                return iInterfaceQueryLocalInterface2 instanceof krj ? (krj) iInterfaceQueryLocalInterface2 : new krj(iBinder);
            case 2:
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
                return iInterfaceQueryLocalInterface3 instanceof krt ? (krt) iInterfaceQueryLocalInterface3 : new krt(iBinder);
            default:
                IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
                return iInterfaceQueryLocalInterface4 instanceof krv ? (krv) iInterfaceQueryLocalInterface4 : new kru(iBinder);
        }
    }
}
