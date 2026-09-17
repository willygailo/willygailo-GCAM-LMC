package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class gr {
    final WindowInsets.Builder a;

    public gr() {
    }

    public gr(gy gyVar) {
        this();
        WindowInsets windowInsetsN = gyVar.n();
        this.a = windowInsetsN != null ? new WindowInsets.Builder(windowInsetsN) : new WindowInsets.Builder();
    }

    public gr(byte[] bArr) {
        new gy((gy) null);
        this();
        this.a = new WindowInsets.Builder();
    }
}
