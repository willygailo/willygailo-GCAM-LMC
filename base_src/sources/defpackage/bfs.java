package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class bfs implements bfh, bft {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public bfs(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.bft
    public final bac a(Uri uri) {
        switch (this.b) {
            case 0:
                return new bak(this.a, uri);
            case 1:
                return new azy(this.a, uri);
            default:
                return new bas(this.a, uri);
        }
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return new bfu(this);
    }
}
