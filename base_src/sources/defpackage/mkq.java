package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mkq {
    int a = 0;
    ojc b = oih.a;
    final Map c = new LinkedHashMap();
    final long d = System.currentTimeMillis();

    public final void a(String str, Object obj) {
        this.c.put(str, obj);
    }

    public final void b(float f) {
        this.c.put("com.android.capture.fps", Float.valueOf(f));
    }

    public final void c(float f, float f2) {
        this.b = ojc.i(new mkr(f, f2));
    }
}
