package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class fcf implements pys {
    private final khx a;

    public fcf(khx khxVar, byte[] bArr, byte[] bArr2) {
        this.a = khxVar;
    }

    public static Context b(khx khxVar) {
        Context context = khxVar.a;
        qmd.ae(context);
        return context;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Context get() {
        return b(this.a);
    }
}
