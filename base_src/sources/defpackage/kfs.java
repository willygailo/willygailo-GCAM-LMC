package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kfs implements kiv {
    public final GoogleSignInAccount a;
    private final Status b;

    public kfs(GoogleSignInAccount googleSignInAccount, Status status) {
        this.a = googleSignInAccount;
        this.b = status;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.b;
    }
}
