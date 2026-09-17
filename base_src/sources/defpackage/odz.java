package defpackage;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class odz extends oen {
    final /* synthetic */ String a;
    final /* synthetic */ ofi b;
    final /* synthetic */ oed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odz(oed oedVar, ofi ofiVar, String str, ofi ofiVar2) {
        super(ofiVar);
        this.c = oedVar;
        this.a = str;
        this.b = ofiVar2;
    }

    @Override // defpackage.oen
    protected final void a() {
        Integer numValueOf;
        try {
            oed oedVar = this.c;
            IInterface iInterface = oedVar.a.j;
            String str = oedVar.b;
            String str2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putAll(oed.b());
            bundle.putString("package.name", str2);
            try {
                numValueOf = Integer.valueOf(oedVar.c.getPackageManager().getPackageInfo(oedVar.c.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                oed.e.g("The current version of the app could not be retrieved", new Object[0]);
                numValueOf = null;
            }
            if (numValueOf != null) {
                bundle.putInt("app.version.code", numValueOf.intValue());
            }
            oec oecVar = new oec(this.c, this.b);
            Parcel parcelA = ((bmn) iInterface).a();
            parcelA.writeString(str);
            bmp.c(parcelA, bundle);
            bmp.e(parcelA, oecVar);
            ((bmn) iInterface).A(2, parcelA);
        } catch (RemoteException e2) {
            oed.e.h(e2, "requestUpdateInfo(%s)", this.a);
            this.b.a(new RuntimeException(e2));
        }
    }
}
