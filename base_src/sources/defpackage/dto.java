package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class dto implements pys {
    private final qkg a;

    public dto(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Resources get() {
        Resources resources = ((emd) this.a).get().getResources();
        qmd.ae(resources);
        return resources;
    }
}
