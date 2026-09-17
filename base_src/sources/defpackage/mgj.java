package defpackage;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class mgj implements mgk, mgg {
    private final Uri a;
    private final odu b;

    public mgj(odu oduVar, String str, byte[] bArr, byte[] bArr2) {
        this.b = oduVar;
        this.a = Uri.parse("https://google.com/search").buildUpon().appendQueryParameter("q", str).appendQueryParameter("tbm", "shop").appendQueryParameter("source", "google-camera").build();
    }

    @Override // defpackage.mgg
    public final Intent a() {
        return new Intent("android.intent.action.VIEW", this.a);
    }

    @Override // defpackage.mgk
    public final void b() {
        this.b.b(a());
    }
}
