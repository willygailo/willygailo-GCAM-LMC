package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fhb implements fhu {
    public final /* synthetic */ Bundle a;
    private final /* synthetic */ int b;

    public /* synthetic */ fhb(Bundle bundle, int i) {
        this.b = i;
        this.a = bundle;
    }

    @Override // defpackage.fhu
    public final void a(fik fikVar) {
        switch (this.b) {
            case 0:
                Bundle bundle = this.a;
                if (fikVar instanceof fgu) {
                    Bundle bundleG = fhv.g(fikVar, bundle);
                    bundleG.getClass();
                    ((fgu) fikVar).g(bundleG);
                }
                break;
            case 1:
                Bundle bundle2 = this.a;
                if (fikVar instanceof fgr) {
                    fhv.g(fikVar, bundle2);
                    ((fgr) fikVar).b();
                }
                break;
            case 2:
                Bundle bundle3 = this.a;
                if (fikVar instanceof fhy) {
                    fhv.g(fikVar, bundle3);
                    ((fhy) fikVar).F();
                }
                break;
            default:
                Bundle bundle4 = this.a;
                if (fikVar instanceof fih) {
                    Bundle bundle5 = new Bundle();
                    ((fih) fikVar).h(bundle5);
                    String strF = fhv.f(fikVar);
                    strF.getClass();
                    bundle4.putBundle(strF, bundle5);
                }
                break;
        }
    }
}
