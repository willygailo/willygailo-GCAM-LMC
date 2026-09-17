package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class kgj implements aez {
    final /* synthetic */ SignInHubActivity a;

    public kgj(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.aez
    public final afh a() {
        return new kfu(this.a, kim.a());
    }

    @Override // defpackage.aez
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.k, signInHubActivity.l);
        this.a.finish();
    }

    @Override // defpackage.aez
    public final void d() {
    }
}
