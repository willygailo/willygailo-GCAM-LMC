package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class eme implements pys {
    private final emb a;

    public eme(emb embVar) {
        this.a = embVar;
    }

    public static eme b(emb embVar) {
        return new eme(embVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity get() {
        return this.a.a;
    }
}
