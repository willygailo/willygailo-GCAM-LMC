package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class kjp {
    final /* synthetic */ BasePendingResult a;

    public kjp(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult basePendingResult = this.a;
        ThreadLocal threadLocal = BasePendingResult.c;
        BasePendingResult.i(basePendingResult.g);
        super.finalize();
    }
}
