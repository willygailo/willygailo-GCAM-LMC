package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class kfw extends kgh {
    final /* synthetic */ kfx a;

    public kfw(kfx kfxVar) {
        this.a = kfxVar;
    }

    @Override // defpackage.kgh
    public final void b(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            kgf.c(this.a.a).e(this.a.b, googleSignInAccount);
        }
        this.a.j(new kfs(googleSignInAccount, status));
    }
}
