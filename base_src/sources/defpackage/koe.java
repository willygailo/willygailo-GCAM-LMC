package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class koe {
    private static final koe a = new koe();
    private khx b = null;

    public static khx b(Context context) {
        return a.a(context);
    }

    public final synchronized khx a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new khx(context, (char[]) null);
        }
        return this.b;
    }
}
