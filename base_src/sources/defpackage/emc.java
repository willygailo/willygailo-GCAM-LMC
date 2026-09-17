package defpackage;

import android.content.ContentResolver;

/* JADX INFO: loaded from: classes.dex */
public final class emc implements pys {
    private final emb a;

    public emc(emb embVar) {
        this.a = embVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentResolver get() {
        ContentResolver contentResolver = this.a.a.getContentResolver();
        qmd.ae(contentResolver);
        return contentResolver;
    }
}
