package defpackage;

import android.content.UriMatcher;

/* JADX INFO: loaded from: classes.dex */
public final class dxc implements pys {
    private final qkg a;

    public dxc(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UriMatcher get() {
        String str = ((dew) this.a).get();
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(str, "type/*", 1);
        uriMatcher.addURI(str, "data/*", 2);
        uriMatcher.addURI(str, "icon/#/badge", 3);
        uriMatcher.addURI(str, "icon/#/interact", 4);
        uriMatcher.addURI(str, "icon/#/dialog", 5);
        uriMatcher.addURI(str, "delete/#", 6);
        uriMatcher.addURI(str, "processing", 7);
        uriMatcher.addURI(str, "processing/#", 8);
        return uriMatcher;
    }
}
