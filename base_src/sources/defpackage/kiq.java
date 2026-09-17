package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class kiq extends BasePendingResult {
    private final kiv a;

    public kiq(kiv kivVar) {
        super(null);
        this.a = kivVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final kiv a(Status status) {
        return this.a;
    }
}
