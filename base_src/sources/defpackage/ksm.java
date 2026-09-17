package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class ksm extends ktg {
    final /* synthetic */ kvm a;

    public ksm(kvm kvmVar) {
        this.a = kvmVar;
    }

    @Override // defpackage.kth
    public final void b(kte kteVar) {
        Status status = kteVar.a;
        if (status == null) {
            this.a.c(new kig(new Status(8, "Got null status from location service")));
        } else if (status.g == 0) {
            this.a.b(true);
        } else {
            this.a.c(mip.dA(status));
        }
    }

    @Override // defpackage.kth
    public final void c() {
    }
}
