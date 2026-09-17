package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class emk implements pys {
    private final emb a;

    public emk(emb embVar) {
        this.a = embVar;
    }

    public static emk a(emb embVar) {
        return new emk(embVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final WeakReference get() {
        return new WeakReference(this.a.a);
    }
}
