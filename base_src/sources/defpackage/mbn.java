package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class mbn implements pys {
    private final qkg a;

    public mbn(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Context get() {
        Context context = ((ikv) this.a).get().k;
        qmd.ae(context);
        return context;
    }
}
