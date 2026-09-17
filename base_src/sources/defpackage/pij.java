package defpackage;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class pij {
    private String a = null;

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory b(pij pijVar) {
        String str = pijVar.a;
        return new pii(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null);
    }

    public final void c(String str) {
        a(str, 0);
        this.a = str;
    }
}
