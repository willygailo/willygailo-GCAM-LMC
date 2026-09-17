package defpackage;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes.dex */
public final class bee implements bfh, bed {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public bee(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.bed
    public final bac a(AssetManager assetManager, String str) {
        switch (this.b) {
            case 0:
                return new bar(assetManager, str);
            default:
                return new baj(assetManager, str);
        }
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        switch (this.b) {
            case 0:
                break;
        }
        return new bef(this.a, this);
    }
}
