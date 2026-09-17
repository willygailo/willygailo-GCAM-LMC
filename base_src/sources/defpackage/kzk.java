package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kzk implements kjj {
    final kvm a;
    private final /* synthetic */ int b;

    public kzk(kvm kvmVar, int i) {
        this.b = i;
        this.a = kvmVar;
    }

    @Override // defpackage.kjj
    public final /* synthetic */ void c(Object obj) {
        switch (this.b) {
            case 0:
                Status status = (Status) obj;
                int i = status.g;
                if (i == 0 || i == 4001) {
                    this.a.b(null);
                } else {
                    this.a.a(new kig(status));
                }
                break;
            default:
                Status status2 = (Status) obj;
                int i2 = status2.g;
                if (i2 == 0) {
                    this.a.b(true);
                } else if (i2 != 4002) {
                    this.a.a(new kig(status2));
                } else {
                    this.a.b(false);
                }
                break;
        }
    }
}
