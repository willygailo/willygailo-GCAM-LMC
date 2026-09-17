package defpackage;

import com.google.vr.ndk.base.GvrApi;

/* JADX INFO: loaded from: classes2.dex */
public final class pxb {
    private final long a;

    static {
        pxb.class.getSimpleName();
    }

    public pxb(long j) {
        this.a = j;
    }

    public final boolean a(pxa pxaVar) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.a, pxaVar.c);
    }
}
