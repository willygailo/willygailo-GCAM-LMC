package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class bef implements bfg {
    private final AssetManager a;
    private final bed b;

    public bef(AssetManager assetManager, bed bedVar) {
        this.a = assetManager;
        this.b = bedVar;
    }

    @Override // defpackage.bfg
    public final /* bridge */ /* synthetic */ bff a(Object obj, int i, int i2, azt aztVar) {
        Uri uri = (Uri) obj;
        return new bff(new blo(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    @Override // defpackage.bfg
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
