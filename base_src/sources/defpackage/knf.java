package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class knf implements kio {
    final /* synthetic */ kip a;
    final /* synthetic */ kvm b;
    final /* synthetic */ knh c;

    public knf(kip kipVar, kvm kvmVar, knh knhVar) {
        this.a = kipVar;
        this.b = kvmVar;
        this.c = knhVar;
    }

    @Override // defpackage.kio
    public final void a(Status status) {
        if (!status.b()) {
            this.b.a(mip.dA(status));
        } else {
            this.b.b(this.c.a(this.a.m(TimeUnit.MILLISECONDS)));
        }
    }
}
