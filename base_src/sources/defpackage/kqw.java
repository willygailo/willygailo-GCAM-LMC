package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class kqw {
    public final Context a;
    public final kra b;
    public final ExecutorService c;
    public final Class d;

    public kqw(Context context, kra kraVar, ExecutorService executorService, Class cls) {
        this.a = context;
        this.b = kraVar;
        this.c = executorService;
        this.d = cls;
    }

    public static void a(String str) {
        obr.aK(str.startsWith("/"), "collection must start with \"/\" but is \"%s\"", str);
    }
}
