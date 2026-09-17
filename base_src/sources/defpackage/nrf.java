package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class nrf implements nri {
    final /* synthetic */ kfq a;

    public nrf(kfq kfqVar) {
        this.a = kfqVar;
    }

    @Override // defpackage.nri
    public final kvk a() {
        return this.a.a();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // defpackage.nri
    public final kvk b() {
        kfs kfsVar;
        GoogleSignInAccount googleSignInAccountA;
        kin kinVar;
        kfq kfqVar = this.a;
        kim kimVar = kfqVar.j;
        Context context = kfqVar.c;
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) kfqVar.f;
        int iB = kfqVar.b();
        kgd.a.b("silentSignIn()");
        kgd.a.b("getEligibleSavedSignInResult()");
        mip.dk(googleSignInOptions);
        GoogleSignInOptions googleSignInOptionsB = kgf.c(context).b();
        if (googleSignInOptionsB == null) {
            kfsVar = null;
        } else {
            Account account = googleSignInOptionsB.j;
            Account account2 = googleSignInOptions.j;
            if (account == null) {
                if (account2 != null) {
                    kfsVar = null;
                }
            } else if (!account.equals(account2)) {
                kfsVar = null;
            }
            if (!googleSignInOptions.l && ((!googleSignInOptions.k || (googleSignInOptionsB.k && mip.dx(googleSignInOptions.n, googleSignInOptionsB.n))) && new HashSet(googleSignInOptionsB.b()).containsAll(new HashSet(googleSignInOptions.b())) && (googleSignInAccountA = kgf.c(context).a()) != null && System.currentTimeMillis() / 1000 < googleSignInAccountA.h - 300)) {
                kfsVar = new kfs(googleSignInAccountA, Status.a);
            } else {
                kfsVar = null;
            }
        }
        if (kfsVar != null) {
            kgd.a.b("Eligible saved sign in result found");
            kinVar = mip.dE(kfsVar, kimVar);
        } else if (iB == 3) {
            kinVar = mip.dE(new kfs(null, new Status(4)), kimVar);
        } else {
            kgd.a.b("trySilentSignIn()");
            kfx kfxVar = new kfx(kimVar, context, googleSignInOptions);
            kimVar.b(kfxVar);
            kinVar = new kin(kfxVar);
        }
        return mip.dv(kinVar, kfq.b);
    }
}
