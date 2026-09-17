package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class kdy {
    public final Context a;
    public final Context b;

    public kdy(Context context) {
        mip.dk(context);
        Context applicationContext = context.getApplicationContext();
        mip.du(applicationContext, "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }
}
