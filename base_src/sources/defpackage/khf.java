package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class khf implements kgq {
    public static final Charset a = Charset.forName("UTF-8");
    public static final nep b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        nep nepVar = new nep(neg.a("com.google.android.gms.clearcut.public"));
        if (nepVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        nep nepVar2 = new nep(nepVar.b, "gms:playlog:service:samplingrules_", nepVar.d, false, nepVar.h);
        b = new nep(nepVar2.b, nepVar2.c, "LogSamplingRulesV2__", nepVar2.e, nepVar2.h);
        c = new ConcurrentHashMap();
        d = null;
        e = null;
    }

    public khf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            ner.h(applicationContext);
        }
    }
}
