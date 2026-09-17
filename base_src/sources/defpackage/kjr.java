package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
final class kjr implements kio {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ kjt b;

    public kjr(kjt kjtVar, BasePendingResult basePendingResult) {
        this.b = kjtVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.kio
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
