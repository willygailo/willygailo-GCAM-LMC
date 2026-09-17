package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gvh {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a(Context context) {
        kij kijVarA = kty.a(context);
        String strValueOf = String.valueOf(context.getPackageName());
        new gvg(kijVarA, strValueOf.length() != 0 ? "com.google.android.apps.camera#".concat(strValueOf) : new String("com.google.android.apps.camera#")).b();
    }

    public static void b(Context context) {
        ner.h(context);
    }

    public static void c(Context context) {
        if (a.compareAndSet(false, true)) {
            ner.h(context);
            new nep(neg.a("com.google.android.apps.camera")).a().c("DummyFlag", false).e();
        }
    }
}
