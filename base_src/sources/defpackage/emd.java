package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class emd implements pys {
    private final emb a;

    public emd(emb embVar) {
        this.a = embVar;
    }

    public static emd b(emb embVar) {
        return new emd(embVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Context get() {
        return this.a.a;
    }
}
