package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class kin extends kip {
    private final BasePendingResult a;

    public kin() {
    }

    public kin(kip kipVar) {
        this.a = (BasePendingResult) kipVar;
    }

    @Override // defpackage.kip
    public final void l(kio kioVar) {
        this.a.l(kioVar);
    }

    @Override // defpackage.kip
    public final kiv m(TimeUnit timeUnit) {
        return this.a.m(timeUnit);
    }
}
