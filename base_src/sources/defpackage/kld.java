package defpackage;

import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class kld implements Runnable {
    final /* synthetic */ kuq a;
    final /* synthetic */ kle b;

    public kld(kle kleVar, kuq kuqVar) {
        this.b = kleVar;
        this.a = kuqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kle kleVar = this.b;
        kuq kuqVar = this.a;
        khi khiVar = kuqVar.b;
        if (khiVar.c()) {
            knj knjVar = kuqVar.c;
            mip.dk(knjVar);
            khi khiVar2 = knjVar.c;
            if (!khiVar2.c()) {
                String strValueOf = String.valueOf(khiVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                kleVar.f.b(khiVar2);
                kleVar.e.i();
                return;
            }
            kkf kkfVar = kleVar.f;
            kmy kmyVarA = knjVar.a();
            Set set = kleVar.c;
            if (kmyVarA == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                kkfVar.b(new khi(4));
            } else {
                kkfVar.f = kmyVarA;
                kkfVar.c = set;
                kkfVar.c();
            }
        } else {
            kleVar.f.b(khiVar);
        }
        kleVar.e.i();
    }
}
