package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class emj implements pys {
    private final emb a;

    public emj(emb embVar) {
        this.a = embVar;
    }

    public static emj b(emb embVar) {
        return new emj(embVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Intent get() {
        Intent intent = this.a.a.getIntent();
        qmd.ae(intent);
        return intent;
    }
}
