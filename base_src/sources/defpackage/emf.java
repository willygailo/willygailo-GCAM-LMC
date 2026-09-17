package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class emf implements pys {
    private final emb a;

    public emf(emb embVar) {
        this.a = embVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Resources get() {
        Resources resources = this.a.a.getResources();
        qmd.ae(resources);
        return resources;
    }
}
