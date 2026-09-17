package defpackage;

import android.content.ContentResolver;

/* JADX INFO: loaded from: classes.dex */
public final class emm implements pys {
    private final eml a;

    public emm(eml emlVar) {
        this.a = emlVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentResolver get() {
        ContentResolver contentResolver = this.a.a.getContentResolver();
        qmd.ae(contentResolver);
        return contentResolver;
    }
}
