package defpackage;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class emb {
    public final Activity a;

    public emb(Activity activity) {
        this.a = activity;
    }

    public final Intent a() {
        return this.a.getIntent();
    }

    public final void b(Intent intent) {
        this.a.startActivity(intent);
    }

    public final void c(Intent intent, int i, int i2) {
        this.a.startActivityForResult(intent, 0);
        this.a.overridePendingTransition(i, i2);
    }
}
