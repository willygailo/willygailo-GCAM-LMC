package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class kir extends BasePendingResult {
    public kir(kim kimVar) {
        super(kimVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final kiv a(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
