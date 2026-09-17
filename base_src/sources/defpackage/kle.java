package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kle extends kul implements kik, kil {
    private static final mip h = kuh.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final kmf d;
    public kui e;
    public kkf f;
    public final mip g;

    public kle(Context context, Handler handler, kmf kmfVar) {
        mip mipVar = h;
        this.a = context;
        this.b = handler;
        this.d = kmfVar;
        this.c = kmfVar.b;
        this.g = mipVar;
    }

    @Override // defpackage.kjq
    public final void a(int i) {
        this.e.i();
    }

    @Override // defpackage.kjq
    public final void b() {
        Object obj = this.e;
        try {
            Account account = ((kuo) obj).a.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountA = "<<default account>>".equals(account.name) ? kgk.c(((kmb) obj).c).a() : null;
            Integer num = ((kuo) obj).t;
            mip.dk(num);
            kni kniVar = new kni(2, account, num.intValue(), googleSignInAccountA);
            kum kumVar = (kum) ((kmb) obj).u();
            kup kupVar = new kup(1, kniVar);
            Parcel parcelA = kumVar.a();
            bmp.c(parcelA, kupVar);
            bmp.e(parcelA, this);
            kumVar.z(12, parcelA);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new kuq(1, new khi(8, null), null));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.kul
    public final void c(kuq kuqVar) {
        this.b.post(new kld(this, kuqVar));
    }

    @Override // defpackage.kkw
    public final void i(khi khiVar) {
        this.f.b(khiVar);
    }
}
