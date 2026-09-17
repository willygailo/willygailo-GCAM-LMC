package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.prewarm.NoOpPrewarmService;

/* JADX INFO: loaded from: classes.dex */
public final class eoc {
    public final Context a;
    private final eoa b;

    public eoc(Context context, eoa eoaVar) {
        this.a = context;
        this.b = eoaVar;
    }

    public static void b(Context context) {
        context.startService(new Intent(context, (Class<?>) NoOpPrewarmService.class));
    }

    public final boolean a() {
        return this.b.a();
    }
}
